// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.sync;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.notifications.NotificationConstants;
import org.chromium.chrome.browser.notifications.NotificationUmaTracker;
import org.chromium.chrome.browser.notifications.NotificationWrapperBuilderFactory;
import org.chromium.chrome.browser.notifications.channels.ChromeChannelDefinitions;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.SettingsLauncherImpl;
import org.chromium.chrome.browser.signin.services.IdentityServicesProvider;
import org.chromium.chrome.browser.sync.settings.SyncAndServicesSettings;
import org.chromium.chrome.browser.sync.settings.SyncSettingsUtils;
import org.chromium.chrome.browser.sync.ui.PassphraseActivity;
import org.chromium.chrome.browser.sync.ui.TrustedVaultKeyRetrievalProxyActivity;
import org.chromium.components.browser_ui.notifications.NotificationManagerProxy;
import org.chromium.components.browser_ui.notifications.NotificationManagerProxyImpl;
import org.chromium.components.browser_ui.notifications.NotificationMetadata;
import org.chromium.components.browser_ui.notifications.NotificationWrapper;
import org.chromium.components.browser_ui.notifications.PendingIntentProvider;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.base.GoogleServiceAuthError.State;
import org.chromium.components.signin.identitymanager.ConsentLevel;
import org.chromium.components.sync.PassphraseType;

/**
 * {@link SyncErrorNotifier} displays Android notifications regarding sync errors.
 * Errors can be fixed by clicking the notification.
 */
public class SyncErrorNotifier implements ProfileSyncService.SyncStateChangedListener {
    private static final String TAG = "SyncUI";
    private final NotificationManagerProxy mNotificationManager;
    private final ProfileSyncService mProfileSyncService;
    private boolean mTrustedVaultNotificationShownOrCreating;

    private @Nullable static SyncErrorNotifier sInstance;
    private static boolean sInitialized;

    /**
     * Returns null if there's no instance of ProfileSyncService (Sync disabled via command-line).
     */
    @Nullable
    public static SyncErrorNotifier get() {
        ThreadUtils.assertOnUiThread();
        if (!sInitialized) {
            if (ProfileSyncService.get() != null) {
                sInstance = new SyncErrorNotifier();
            }
            sInitialized = true;
        }
        return sInstance;
    }

    private SyncErrorNotifier() {
        mNotificationManager =
                new NotificationManagerProxyImpl(ContextUtils.getApplicationContext());
        mProfileSyncService = ProfileSyncService.get();
        assert mProfileSyncService != null;
        mProfileSyncService.addSyncStateChangedListener(this);
    }

    /**
     * {@link ProfileSyncService.SyncStateChangedListener} implementation.
     * Decides which error notification to show (if any), based on the sync state.
     */
    @Override
    public void syncStateChanged() {
        ThreadUtils.assertOnUiThread();

        if (!mProfileSyncService.isSyncRequested()) {
            cancelNotifications();
        } else if (shouldSyncAuthErrorBeShown()) {
            // Auth errors take precedence over passphrase errors.
            showNotification(SyncSettingsUtils.getSyncStatusSummaryForAuthError(
                                     ContextUtils.getApplicationContext(),
                                     mProfileSyncService.getAuthError()),
                    createSettingsIntent());
        } else if (mProfileSyncService.isEngineInitialized()
                && mProfileSyncService.isPassphraseRequiredForPreferredDataTypes()) {
            assert (!mProfileSyncService.isTrustedVaultKeyRequiredForPreferredDataTypes());

            if (mProfileSyncService.isPassphrasePromptMutedForCurrentProductVersion()) {
                return;
            }

            switch (mProfileSyncService.getPassphraseType()) {
                case PassphraseType.IMPLICIT_PASSPHRASE:
                case PassphraseType.FROZEN_IMPLICIT_PASSPHRASE:
                case PassphraseType.CUSTOM_PASSPHRASE:
                    showNotification(
                            getString(R.string.sync_need_passphrase), createPassphraseIntent());
                    break;
                case PassphraseType.TRUSTED_VAULT_PASSPHRASE:
                    assert false : "Passphrase cannot be required with trusted vault passphrase";
                    break;
                case PassphraseType.KEYSTORE_PASSPHRASE:
                    cancelNotifications();
                    break;
                default:
                    assert false : "Unknown passphrase type";
                    break;
            }
        } else if (mProfileSyncService.isEngineInitialized()
                && mProfileSyncService.isTrustedVaultKeyRequiredForPreferredDataTypes()) {
            maybeShowKeyRetrievalNotification();
        } else {
            cancelNotifications();
        }
    }

    private void cancelNotifications() {
        mNotificationManager.cancel(NotificationConstants.NOTIFICATION_ID_SYNC);
        mTrustedVaultNotificationShownOrCreating = false;
    }

    /**
     * Displays the error notification. Its title is fixed and its body is customized by the caller
     * via errorMessage. The exact strings may depend on the Android version, to account for
     * differences in the notification system.
     */
    private void showNotification(String errorMessage, Intent intentTriggeredOnClick) {
        String title = getString(R.string.sign_in_sync);
        String textBody = errorMessage;
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            // For versions older than Android N, the notification doesn't show the app name by
            // default, so use the app name as title.
            title = getString(R.string.app_name);
            textBody = getString(R.string.sign_in_sync) + ": " + errorMessage;
        }

        // Converting |intentTriggeredOnClick| into a PendingIntent is needed because it will be
        // handed over to the Android notification manager, a foreign application.
        // FLAG_UPDATE_CURRENT ensures any cached intent extras are updated.
        // TODO(crbug.com/1071377): TrustedVaultKeyRetrievalProxyActivity is the only one to add
        // extras to the intent, so it should probably be responsible for passing
        // FLAG_UPDATE_CURRENT.
        PendingIntentProvider pendingIntent =
                PendingIntentProvider.getActivity(ContextUtils.getApplicationContext(), 0,
                        intentTriggeredOnClick, PendingIntent.FLAG_UPDATE_CURRENT);

        // There is no need to provide a group summary notification because NOTIFICATION_ID_SYNC
        // ensures there's only one sync notification at a time.
        NotificationWrapper notification =
                NotificationWrapperBuilderFactory
                        .createNotificationWrapperBuilder(true /* preferCompat */,
                                ChromeChannelDefinitions.ChannelId.BROWSER,
                                null /*remoteAppPackageName*/,
                                new NotificationMetadata(
                                        NotificationUmaTracker.SystemNotificationType.SYNC, null,
                                        NotificationConstants.NOTIFICATION_ID_SYNC))
                        .setAutoCancel(true)
                        .setContentIntent(pendingIntent)
                        .setContentTitle(title)
                        .setContentText(textBody)
                        .setSmallIcon(R.drawable.ic_chrome)
                        .setTicker(textBody)
                        .setLocalOnly(true)
                        .setGroup(NotificationConstants.GROUP_SYNC)
                        .buildWithBigTextStyle(textBody);
        mNotificationManager.notify(notification);
        NotificationUmaTracker.getInstance().onNotificationShown(
                NotificationUmaTracker.SystemNotificationType.SYNC, notification.getNotification());
    }

    private boolean shouldSyncAuthErrorBeShown() {
        switch (mProfileSyncService.getAuthError()) {
            case State.NONE:
            case State.CONNECTION_FAILED:
            case State.SERVICE_UNAVAILABLE:
            case State.REQUEST_CANCELED:
            case State.INVALID_GAIA_CREDENTIALS:
                return false;
            case State.USER_NOT_SIGNED_UP:
                return true;
            default:
                Log.w(TAG, "Not showing unknown Auth Error: " + mProfileSyncService.getAuthError());
                return false;
        }
    }

    /**
     * Creates an intent that launches the Chrome settings, and automatically opens the fragment
     * for signed in users.
     *
     * @return the intent for opening the settings
     */
    private Intent createSettingsIntent() {
        SettingsLauncher settingsLauncher = new SettingsLauncherImpl();
        return settingsLauncher.createSettingsActivityIntent(ContextUtils.getApplicationContext(),
                SyncAndServicesSettings.class.getName(),
                SyncAndServicesSettings.createArguments(false));
    }

    /**
     * Creates an intent that launches an activity that requests the sync passphrase.
     *
     * @return the intent for opening the passphrase activity
     */
    private Intent createPassphraseIntent() {
        // Make sure we don't prompt too many times.
        mProfileSyncService.markPassphrasePromptMutedForCurrentProductVersion();

        Intent intent = new Intent(ContextUtils.getApplicationContext(), PassphraseActivity.class);
        // This activity will become the start of a new task on this history stack.
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        // Clears the task stack above this activity if it already exists.
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }

    /**
     * Attempts to asynchronously show a key retrieval notification if a) one doesn't
     * already exist or is being created; and b) there is a primary account with ConsentLevel.SYNC.
     */
    private void maybeShowKeyRetrievalNotification() {
        CoreAccountInfo primaryAccountInfo =
                IdentityServicesProvider.get()
                        .getIdentityManager(Profile.getLastUsedRegularProfile())
                        .getPrimaryAccountInfo(ConsentLevel.SYNC);
        // Check/set |mTrustedVaultNotificationShownOrCreating| here to ensure the notification is
        // not shown again immediately after cancelling (Sync state might be changed often) and
        // there is only one asynchronous createKeyRetrievalIntent() attempt at a time.
        // TODO(crbug.com/1071377): If the user dismissed the notification, it will reappear only
        // after browser restart or disable-enable Sync action. This is sub-optimal behavior and
        // it's better to find a way to show it more often, but not on each Sync state change.
        if (primaryAccountInfo == null || mTrustedVaultNotificationShownOrCreating) {
            return;
        }
        mTrustedVaultNotificationShownOrCreating = true;

        String notificationTextBody = getString(mProfileSyncService.isEncryptEverythingEnabled()
                        ? R.string.sync_error_card_title
                        : R.string.password_sync_error_summary);

        TrustedVaultClient.get()
                .createKeyRetrievalIntent(primaryAccountInfo)
                // Cf. TrustedVaultKeyRetrievalProxyActivity as to why use a proxy intent.
                // TODO(crbug.com/1071377): Sync state might have changed by the time |realIntent|
                // is available, so showing the notification won't make sense.
                .then((realIntent)
                                -> showNotification(notificationTextBody,
                                        TrustedVaultKeyRetrievalProxyActivity
                                                .createKeyRetrievalProxyIntent(realIntent)),
                        (exception)
                                -> Log.w(TAG, "Error creating key retrieval intent: ", exception));
    }

    private String getString(@StringRes int messageId) {
        return ContextUtils.getApplicationContext().getString(messageId);
    }
}
