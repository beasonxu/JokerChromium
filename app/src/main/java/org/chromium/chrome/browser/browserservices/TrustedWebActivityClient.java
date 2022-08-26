// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.browserservices;

import static org.chromium.chrome.browser.browserservices.metrics.TrustedWebActivityUmaRecorder.DelegatedNotificationSmallIconFallback.FALLBACK_ICON_NOT_PROVIDED;
import static org.chromium.chrome.browser.browserservices.metrics.TrustedWebActivityUmaRecorder.DelegatedNotificationSmallIconFallback.NO_FALLBACK;
import static org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappGeolocationBridge.EXTRA_NEW_LOCATION_ERROR_CALLBACK;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.trusted.Token;
import androidx.browser.trusted.TrustedWebActivityCallback;
import androidx.browser.trusted.TrustedWebActivityService;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;

import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.chrome.R;
import org.chromium.chrome.browser.ChromeApplicationImpl;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityClientWrappers.Connection;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityClientWrappers.ConnectionPool;
import org.chromium.chrome.browser.browserservices.constants.LocationUpdateError;
import org.chromium.chrome.browser.browserservices.metrics.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.metrics.TrustedWebActivityUmaRecorder.DelegatedNotificationSmallIconFallback;
import org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappPermissionManager;
import org.chromium.chrome.browser.browserservices.permissiondelegation.PermissionStatus;
import org.chromium.chrome.browser.notifications.NotificationBuilderBase;
import org.chromium.chrome.browser.notifications.NotificationUmaTracker;
import org.chromium.components.browser_ui.notifications.NotificationMetadata;
import org.chromium.components.content_settings.ContentSettingValues;
import org.chromium.components.content_settings.ContentSettingsType;
import org.chromium.components.embedder_support.util.Origin;
import org.chromium.components.embedder_support.util.UrlConstants;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Uses a Trusted Web Activity client to display notifications.
 */
@Singleton
public class TrustedWebActivityClient {
    private static final String TAG = "TWAClient";

    private static final String CHECK_LOCATION_PERMISSION_COMMAND_NAME =
            "checkAndroidLocationPermission";
    private static final String LOCATION_PERMISSION_RESULT = "locationPermissionResult";
    private static final String EXTRA_COMMAND_SUCCESS = "success";

    private static final String START_LOCATION_COMMAND_NAME = "startLocation";
    private static final String STOP_LOCATION_COMMAND_NAME = "stopLocation";
    private static final String LOCATION_ARG_ENABLE_HIGH_ACCURACY = "enableHighAccuracy";

    private static final String COMMAND_CHECK_NOTIFICATION_PERMISSION =
            "checkNotificationPermission";
    private static final String COMMAND_GET_NOTIFICATION_PERMISSION_REQUEST_PENDING_INTENT =
            "getNotificationPermissionRequestPendingIntent";
    private static final String ARG_NOTIFICATION_CHANNEL_NAME = "notificationChannelName";
    private static final String KEY_PERMISSION_STATUS = "permissionStatus";
    private static final String KEY_NOTIFICATION_PERMISSION_REQUEST_PENDING_INTENT =
            "notificationPermissionRequestPendingIntent";
    private static final String EXTRA_MESSENGER = "messenger";

    private final ConnectionPool mConnectionPool;
    private final InstalledWebappPermissionManager mPermissionManager;
    private final TrustedWebActivityUmaRecorder mRecorder;

    /**
     * Interface for callbacks to {@link #checkNotificationPermission} and {@link
     * #checkLocationPermission}.
     * TODO(crbug.com/1320272): Delete this interface once the new flow has shipped.
     */
    public interface PermissionCheckCallback {
        /**
         * May be called as a result of {@link #checkNotificationPermission} or {@link
         * #checkLocationPermission}.
         */
        void onPermissionCheck(ComponentName answeringApp, boolean enabled);

        /**
         * Called when {@link #checkNotificationPermission} or {@link #checkLocationPermission}
         * can't find a TWA to connect to.
         */
        default void onNoTwaFound() {}
    }

    /**
     * Interface for callbacks to get a permission setting from a TWA app.
     */
    public interface PermissionCallback {
        /**
         * Called on a background thread when the app answered with a permission setting.
         */
        void onPermission(ComponentName app, @ContentSettingValues int settingValue);

        /**
         * Called when no app was found to connect to.
         */
        default void onNoTwaFound() {}
    }

    /**
     * Interface for callbacks to {@link #connectAndExecute}.
     */
    public interface ExecutionCallback {
        void onConnected(Origin origin, Connection service) throws RemoteException;
        default void onNoTwaFound() {}
    }

    /**
     * Creates a TrustedWebActivityService.
     */
    @Inject
    public TrustedWebActivityClient(TrustedWebActivityServiceConnectionPool connectionPool,
            InstalledWebappPermissionManager permissionManager,
            TrustedWebActivityUmaRecorder recorder) {
        this(TrustedWebActivityClientWrappers.wrap(connectionPool), permissionManager, recorder);
    }

    /**
     * Creates a TrustedWebActivityService for tests.
     */
    public TrustedWebActivityClient(ConnectionPool connectionPool,
            InstalledWebappPermissionManager permissionManager,
            TrustedWebActivityUmaRecorder recorder) {
        mConnectionPool = connectionPool;
        mPermissionManager = permissionManager;
        mRecorder = recorder;
    }

    /**
     * Whether a Trusted Web Activity client is available to display notifications of the given
     * scope.
     * @param scope The scope of the Service Worker that triggered the notification.
     * @return Whether a Trusted Web Activity client was found to show the notification.
     */
    public boolean twaExistsForScope(Uri scope) {
        Origin origin = Origin.create(scope);
        if (origin == null) return false;
        Set<Token> possiblePackages = mPermissionManager.getAllDelegateApps(origin);
        if (possiblePackages == null) return false;
        return mConnectionPool.serviceExistsForScope(scope, possiblePackages);
    }

    /**
     * Checks whether the TWA of the given origin has the notification permission granted.
     * @param callback Will be called on a background thread with whether the permission is granted.
     * @return {@code false} if no such TWA exists (in which case the callback will not be called).
     *         Ensure that the app has been added to the {@link InstalledWebappPermissionManager}
     *         before calling this.
     * TODO(crbug.com/1320272): Delete this method once the new flow has shipped.
     */
    public void checkNotificationPermission(Origin origin, PermissionCheckCallback callback) {
        Resources res = ContextUtils.getApplicationContext().getResources();
        String channelDisplayName = res.getString(R.string.notification_category_group_general);

        connectAndExecute(
                origin.uri(), new ExecutionCallback() {
                    @Override
                    public void onConnected(Origin originCopy, Connection service)
                            throws RemoteException {
                        callback.onPermissionCheck(service.getComponentName(),
                                service.areNotificationsEnabled(channelDisplayName));
                    }

                    @Override
                    public void onNoTwaFound() {
                        callback.onNoTwaFound();
                    }
                });
    }

    /**
     * Gets the notification permission setting of the TWA for the given origin.
     * @param permissionCallback To be called on a background thread with the permission setting.
     */
    public void checkNotificationPermissionSetting(
            Origin origin, PermissionCallback permissionCallback) {
        String channelName = ContextUtils.getApplicationContext().getResources().getString(
                R.string.notification_category_group_general);

        connectAndExecute(origin.uri(), new ExecutionCallback() {
            @Override
            public void onConnected(Origin origin, Connection service) throws RemoteException {
                Bundle commandArgs = new Bundle();
                commandArgs.putString(ARG_NOTIFICATION_CHANNEL_NAME, channelName);
                Bundle commandResult = service.sendExtraCommand(
                        COMMAND_CHECK_NOTIFICATION_PERMISSION, commandArgs, /*callback=*/null);
                boolean commandSuccess = commandResult == null
                        ? false
                        : commandResult.getBoolean(EXTRA_COMMAND_SUCCESS);
                mRecorder.recordExtraCommandSuccess(
                        COMMAND_CHECK_NOTIFICATION_PERMISSION, commandSuccess);
                // The command might fail if the app is too old to support it. To handle that case,
                // fall back to the old flow.
                if (!commandSuccess) {
                    boolean enabled = service.areNotificationsEnabled(channelName);
                    @ContentSettingValues
                    int settingValue =
                            enabled ? ContentSettingValues.ALLOW : ContentSettingValues.BLOCK;
                    permissionCallback.onPermission(service.getComponentName(), settingValue);
                    return;
                }

                @ContentSettingValues
                int settingValue = ContentSettingValues.BLOCK;
                @PermissionStatus
                int permissionStatus =
                        commandResult.getInt(KEY_PERMISSION_STATUS, PermissionStatus.BLOCK);
                if (permissionStatus == PermissionStatus.ALLOW) {
                    settingValue = ContentSettingValues.ALLOW;
                } else if (permissionStatus == PermissionStatus.ASK) {
                    settingValue = ContentSettingValues.ASK;
                }
                permissionCallback.onPermission(service.getComponentName(), settingValue);
            }

            @Override
            public void onNoTwaFound() {
                permissionCallback.onNoTwaFound();
            }
        });
    }

    /**
     * Requests notification permission for the TWA for the given origin using a dialog.
     * @param permissionCallback To be called on a background thread with the permission setting.
     */
    public void requestNotificationPermission(
            Origin origin, PermissionCallback permissionCallback) {
        String channelName = ContextUtils.getApplicationContext().getResources().getString(
                R.string.notification_category_group_general);
        connectAndExecute(origin.uri(), new ExecutionCallback() {
            @Override
            public void onConnected(Origin origin, Connection service) throws RemoteException {
                Bundle commandArgs = new Bundle();
                commandArgs.putString(ARG_NOTIFICATION_CHANNEL_NAME, channelName);
                Bundle commandResult = service.sendExtraCommand(
                        COMMAND_GET_NOTIFICATION_PERMISSION_REQUEST_PENDING_INTENT, commandArgs,
                        /*callback=*/null);
                boolean commandSuccess = commandResult == null
                        ? false
                        : commandResult.getBoolean(EXTRA_COMMAND_SUCCESS);
                PendingIntent pendingIntent = commandSuccess
                        ? commandResult.getParcelable(
                                KEY_NOTIFICATION_PERMISSION_REQUEST_PENDING_INTENT)
                        : null;
                mRecorder.recordExtraCommandSuccess(
                        COMMAND_GET_NOTIFICATION_PERMISSION_REQUEST_PENDING_INTENT,
                        commandSuccess && pendingIntent != null);
                if (!commandSuccess || pendingIntent == null) {
                    permissionCallback.onPermission(
                            service.getComponentName(), ContentSettingValues.BLOCK);
                    return;
                }

                Handler handler = new Handler(Looper.getMainLooper(), message -> {
                    @ContentSettingValues
                    int settingValue = ContentSettingValues.BLOCK;
                    @PermissionStatus
                    int permissionStatus =
                            message.getData().getInt(KEY_PERMISSION_STATUS, PermissionStatus.BLOCK);
                    if (permissionStatus == PermissionStatus.ALLOW) {
                        settingValue = ContentSettingValues.ALLOW;
                    } else if (permissionStatus == PermissionStatus.ASK) {
                        settingValue = ContentSettingValues.ASK;
                    }
                    permissionCallback.onPermission(service.getComponentName(), settingValue);
                    return true;
                });
                Intent extraIntent = new Intent();
                extraIntent.putExtra(EXTRA_MESSENGER, new Messenger(handler));
                try {
                    pendingIntent.send(ContextUtils.getApplicationContext(), 0, extraIntent);
                } catch (PendingIntent.CanceledException e) {
                    Log.e(TAG, "The PendingIntent was canceled.", e);
                }
            }

            @Override
            public void onNoTwaFound() {
                permissionCallback.onNoTwaFound();
            }
        });
    }

    /**
     * Check location permission for the TWA of the given origin.
     * @param callback Will be called on a background thread with whether the permission is granted.
     * @return {@code false} if no such TWA exists (in which case the callback will not be called).
     *         Ensure that the app has been added to the {@link InstalledWebappPermissionManager}
     *         before calling this.
     */
    public void checkLocationPermission(Origin origin, PermissionCheckCallback callback) {
        connectAndExecute(origin.uri(), new ExecutionCallback() {
            @Override
            public void onConnected(Origin origin, Connection service) throws RemoteException {
                TrustedWebActivityCallback resultCallback = new TrustedWebActivityCallback() {
                    @Override
                    public void onExtraCallback(String callbackName, @Nullable Bundle bundle) {
                        boolean granted = false;
                        if (TextUtils.equals(callbackName, CHECK_LOCATION_PERMISSION_COMMAND_NAME)
                                && bundle != null) {
                            granted = bundle.getBoolean(LOCATION_PERMISSION_RESULT);
                        }
                        callback.onPermissionCheck(service.getComponentName(), granted);
                    }
                };

                Bundle executionResult = service.sendExtraCommand(
                        CHECK_LOCATION_PERMISSION_COMMAND_NAME, Bundle.EMPTY, resultCallback);
                // Set permission to false if the service does not know how to handle the
                // extraCommand or did not handle the command.
                if (executionResult == null || !executionResult.getBoolean(EXTRA_COMMAND_SUCCESS)) {
                    callback.onPermissionCheck(service.getComponentName(), false);
                }
            }

            @Override
            public void onNoTwaFound() {
                callback.onNoTwaFound();
            }
        });
    }

    public void startListeningLocationUpdates(
            Origin origin, boolean highAccuracy, TrustedWebActivityCallback locationCallback) {
        connectAndExecute(origin.uri(), new ExecutionCallback() {
            @Override
            public void onConnected(Origin origin, Connection service) throws RemoteException {
                Bundle args = new Bundle();
                args.putBoolean(LOCATION_ARG_ENABLE_HIGH_ACCURACY, highAccuracy);
                Bundle executionResult = service.sendExtraCommand(
                        START_LOCATION_COMMAND_NAME, args, locationCallback);

                // Notify an error if the service does not know how to handle the extraCommand.
                if (executionResult == null || !executionResult.getBoolean(EXTRA_COMMAND_SUCCESS)) {
                    notifyLocationUpdateError(
                            locationCallback, "Failed to request location updates");
                }
            }

            @Override
            public void onNoTwaFound() {
                notifyLocationUpdateError(locationCallback, "NoTwaFound");
            }
        });
    }

    public void stopLocationUpdates(Origin origin) {
        connectAndExecute(origin.uri(), new ExecutionCallback() {
            @Override
            public void onConnected(Origin origin, Connection service) throws RemoteException {
                service.sendExtraCommand(STOP_LOCATION_COMMAND_NAME, Bundle.EMPTY, null);
            }
        });
    }

    /**
     * Displays a notification through a Trusted Web Activity client.
     * @param scope The scope of the Service Worker that triggered the notification.
     * @param platformTag A notification tag.
     * @param platformId A notification id.
     * @param builder A builder for the notification to display.
     *                The Trusted Web Activity client may override the small icon.
     * @param notificationUmaTracker To log Notification UMA.
     */
    public void notifyNotification(Uri scope, String platformTag, int platformId,
            NotificationBuilderBase builder, NotificationUmaTracker notificationUmaTracker) {
        Resources res = ContextUtils.getApplicationContext().getResources();
        String channelDisplayName = res.getString(R.string.notification_category_group_general);

        connectAndExecute(scope, (origin, service) -> {
            if (!service.areNotificationsEnabled(channelDisplayName)) {
                mPermissionManager.updatePermission(origin,
                        service.getComponentName().getPackageName(),
                        ContentSettingsType.NOTIFICATIONS, false);

                // Attempting to notify when notifications are disabled won't have any effect, but
                // returning here just saves us from doing unnecessary work.
                return;
            }

            fallbackToIconFromServiceIfNecessary(builder, service);

            NotificationMetadata metadata = new NotificationMetadata(
                    NotificationUmaTracker.SystemNotificationType.TRUSTED_WEB_ACTIVITY_SITES,
                    platformTag, platformId);
            Notification notification = builder.build(metadata).getNotification();

            service.notify(platformTag, platformId, notification, channelDisplayName);

            notificationUmaTracker.onNotificationShown(
                    NotificationUmaTracker.SystemNotificationType.TRUSTED_WEB_ACTIVITY_SITES,
                    notification);
        });
    }

    private void fallbackToIconFromServiceIfNecessary(
            NotificationBuilderBase builder, Connection service) throws RemoteException {
        if (builder.hasSmallIconForContent() && builder.hasStatusBarIconBitmap()) {
            recordFallback(NO_FALLBACK);
            return;
        }

        int id = service.getSmallIconId();
        if (id == TrustedWebActivityService.SMALL_ICON_NOT_SET) {
            recordFallback(FALLBACK_ICON_NOT_PROVIDED);
            return;
        }

        recordFallback(builder.hasSmallIconForContent()
                ? DelegatedNotificationSmallIconFallback.FALLBACK_FOR_STATUS_BAR
                : DelegatedNotificationSmallIconFallback.FALLBACK_FOR_STATUS_BAR_AND_CONTENT);

        Bitmap bitmap = service.getSmallIconBitmap();
        if (!builder.hasStatusBarIconBitmap()) {
            builder.setStatusBarIconForRemoteApp(id, bitmap);
        }
        if (!builder.hasSmallIconForContent()) {
            builder.setContentSmallIconForRemoteApp(bitmap);
        }
    }

    private void recordFallback(@DelegatedNotificationSmallIconFallback int fallback) {
        mRecorder.recordDelegatedNotificationSmallIconFallback(fallback);
    }

    /**
     * Cancels a notification through a Trusted Web Activity client.
     * @param scope The scope of the Service Worker that triggered the notification.
     * @param platformTag The tag of the notification to cancel.
     * @param platformId The id of the notification to cancel.
     */
    public void cancelNotification(Uri scope, String platformTag, int platformId) {
        connectAndExecute(scope, (origin, service) -> service.cancel(platformTag, platformId));
    }

    public void connectAndExecute(Uri scope, ExecutionCallback callback) {
        Origin origin = Origin.create(scope);
        if (origin == null) {
            callback.onNoTwaFound();
            return;
        }

        Set<Token> possiblePackages = mPermissionManager.getAllDelegateApps(origin);
        if (possiblePackages == null || possiblePackages.isEmpty()) {
            callback.onNoTwaFound();
            return;
        }

        mConnectionPool.connectAndExecute(scope, origin, possiblePackages, callback);
    }

    /**
     * Searches through the given list of {@link ResolveInfo} for an Activity belonging to a package
     * that is verified for the given url. If such an Activity is found, an Intent to start that
     * Activity as a Trusted Web Activity is returned. Otherwise {@code null} is returned.
     *
     * If multiple {@link ResolveInfo}s in the list match this criteria, the first will be chosen.
     */
    public static @Nullable Intent createLaunchIntentForTwa(Context appContext, String url,
            List<ResolveInfo> resolveInfosForUrl) {
        // This is ugly, but the call site for this is static and called by native.
        TrustedWebActivityClient client =
                ChromeApplicationImpl.getComponent().resolveTrustedWebActivityClient();
        return client.createLaunchIntentForTwaInternal(appContext, url, resolveInfosForUrl);
    }

    private @Nullable Intent createLaunchIntentForTwaInternal(Context appContext, String url,
            List<ResolveInfo> resolveInfosForUrl) {
        Origin origin = Origin.create(url);
        if (origin == null) return null;

        // Trusted Web Activities only work with https so we can shortcut here.
        if (!UrlConstants.HTTPS_SCHEME.equals(origin.uri().getScheme())) return null;

        ComponentName componentName = searchVerifiedApps(appContext.getPackageManager(),
                mPermissionManager.getAllDelegateApps(origin), resolveInfosForUrl);

        if (componentName == null) return null;

        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        intent.setAction(Intent.ACTION_VIEW);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.setComponent(componentName);
        return intent;
    }

    @Nullable
    private static ComponentName searchVerifiedApps(@NonNull PackageManager pm,
            @Nullable Set<Token> verifiedPackages, @NonNull List<ResolveInfo> resolveInfosForUrl) {
        if (verifiedPackages == null || verifiedPackages.isEmpty()) return null;

        for (ResolveInfo info : resolveInfosForUrl) {
            if (info.activityInfo == null) continue;

            for (Token v : verifiedPackages) {
                if (!v.matches(info.activityInfo.packageName, pm)) continue;

                return new ComponentName(info.activityInfo.packageName, info.activityInfo.name);
            }
        }

        return null;
    }

    private void notifyLocationUpdateError(TrustedWebActivityCallback callback, String message) {
        Bundle error = new Bundle();
        error.putString("message", message);
        callback.onExtraCallback(EXTRA_NEW_LOCATION_ERROR_CALLBACK, error);
        mRecorder.recordLocationUpdateError(LocationUpdateError.NO_TWA);
    }
}
