// Copyright 2013 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;

import androidx.annotation.VisibleForTesting;

import org.chromium.base.ContextUtils;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.task.AsyncTask;
import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.webapps.WebDisplayMode;
import org.chromium.chrome.browser.webapps.WebappActivity;
import org.chromium.chrome.browser.webapps.WebappAuthenticator;
import org.chromium.chrome.browser.webapps.WebappDataStorage;
import org.chromium.chrome.browser.webapps.WebappIntentDataProviderFactory;
import org.chromium.chrome.browser.webapps.WebappLauncherActivity;
import org.chromium.chrome.browser.webapps.WebappRegistry;
import org.chromium.components.webapps.WebappsUtils;
import org.chromium.content_public.common.ScreenOrientationConstants;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * This class contains functions related to adding shortcuts to the Android Home
 * screen.  These shortcuts are used to either open a page in the main browser
 * or open a web app.
 */
public class ShortcutHelper {
    public static final String EXTRA_ICON = "org.chromium.chrome.browser.webapp_icon";
    public static final String EXTRA_ID = "org.chromium.chrome.browser.webapp_id";
    public static final String EXTRA_MAC = "org.chromium.chrome.browser.webapp_mac";
    // EXTRA_TITLE is present for backward compatibility reasons.
    public static final String EXTRA_TITLE = "org.chromium.chrome.browser.webapp_title";
    public static final String EXTRA_NAME = "org.chromium.chrome.browser.webapp_name";
    public static final String EXTRA_SHORT_NAME = "org.chromium.chrome.browser.webapp_short_name";
    public static final String EXTRA_URL = "org.chromium.chrome.browser.webapp_url";
    public static final String EXTRA_SCOPE = "org.chromium.chrome.browser.webapp_scope";
    public static final String EXTRA_DISPLAY_MODE =
            "org.chromium.chrome.browser.webapp_display_mode";
    public static final String EXTRA_ORIENTATION = ScreenOrientationConstants.EXTRA_ORIENTATION;
    public static final String EXTRA_SOURCE = "org.chromium.chrome.browser.webapp_source";
    public static final String EXTRA_THEME_COLOR = "org.chromium.chrome.browser.theme_color";
    public static final String EXTRA_BACKGROUND_COLOR =
            "org.chromium.chrome.browser.background_color";
    public static final String EXTRA_IS_ICON_GENERATED =
            "org.chromium.chrome.browser.is_icon_generated";
    public static final String EXTRA_IS_ICON_ADAPTIVE =
            "org.chromium.chrome.browser.webapp_icon_adaptive";
    public static final String EXTRA_VERSION =
            "org.chromium.chrome.browser.webapp_shortcut_version";
    public static final String REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB =
            "REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB";
    // Whether the webapp should navigate to the URL in {@link EXTRA_URL} if the webapp is already
    // open. Applies to webapps and WebAPKs. Value contains "webapk" for backward compatibility.
    public static final String EXTRA_FORCE_NAVIGATION =
            "org.chromium.chrome.browser.webapk_force_navigation";

    // When a new field is added to the intent, this version should be incremented so that it will
    // be correctly populated into the WebappRegistry/WebappDataStorage.
    public static final int WEBAPP_SHORTCUT_VERSION = 3;

    // This value is equal to kInvalidOrMissingColor in the C++ blink::Manifest struct.
    public static final long MANIFEST_COLOR_INVALID_OR_MISSING = ((long) Integer.MAX_VALUE) + 1;

    private static final String TAG = "ShortcutHelper";

    // Holds splash images for web apps that are currently being installed. After installation is
    // complete, the image associated with the web app will be moved to the appropriate {@link
    // WebappDataStorage}.
    @VisibleForTesting
    public static Map<String, Bitmap> sSplashImageMap = new HashMap<>();

    /** Helper for generating home screen shortcuts. */
    public static class Delegate {
        /**
         * Request Android to add a shortcut to the home screen.
         * @param id The generated GUID of the shortcut.
         * @param title Title of the shortcut.
         * @param icon Image that represents the shortcut.
         * @param isIconAdaptive Whether to create an Android Adaptive icon.
         * @param shortcutIntent Intent to fire when the shortcut is activated.
         */
        public void addShortcutToHomescreen(String id, String title, Bitmap icon,
                boolean isIconAdaptive, Intent shortcutIntent) {
            WebappsUtils.addShortcutToHomescreen(id, title, icon, isIconAdaptive, shortcutIntent);
        }

        /**
         * Returns the name of the fullscreen Activity to use when launching shortcuts.
         */
        public String getFullscreenAction() {
            return WebappLauncherActivity.ACTION_START_WEBAPP;
        }
    }

    private static Delegate sDelegate = new Delegate();

    /**
     * Sets the delegate to use.
     */
    @VisibleForTesting
    public static void setDelegateForTests(Delegate delegate) {
        sDelegate = delegate;
    }

    /**
     * Adds home screen shortcut which opens in a {@link WebappActivity}. Creates web app
     * home screen shortcut and registers web app asynchronously.
     */
    @SuppressWarnings("unused")
    @CalledByNative
    private static void addWebapp(final String id, final String url, final String scopeUrl,
            final String userTitle, final String name, final String shortName, final String iconUrl,
            final Bitmap icon, boolean isIconAdaptive, @WebDisplayMode final int displayMode,
            final int orientation, final int source, final long themeColor,
            final long backgroundColor) {
        new AsyncTask<Intent>() {
            @Override
            protected Intent doInBackground() {
                // Encoding {@link icon} as a string and computing the mac are expensive.

                // Encode the icon as a base64 string (Launcher drops Bitmaps in the Intent).
                String encodedIcon = encodeBitmapAsString(icon);

                // TODO(http://crbug.com/1000046): Use action which does not require mac on O+
                Intent shortcutIntent = createWebappShortcutIntent(id, url, scopeUrl, name,
                        shortName, encodedIcon, WEBAPP_SHORTCUT_VERSION, displayMode, orientation,
                        themeColor, backgroundColor, iconUrl.isEmpty(), isIconAdaptive);
                shortcutIntent.putExtra(EXTRA_MAC, getEncodedMac(url));
                shortcutIntent.putExtra(EXTRA_SOURCE, source);
                return shortcutIntent;
            }
            @Override
            protected void onPostExecute(final Intent resultIntent) {
                sDelegate.addShortcutToHomescreen(
                        id, userTitle, icon, isIconAdaptive, resultIntent);

                // Store the webapp data so that it is accessible without the intent.
                WebappRegistry.getInstance().register(id, storage -> {
                    BrowserServicesIntentDataProvider intentDataProvider =
                            WebappIntentDataProviderFactory.create(resultIntent);
                    assert intentDataProvider != null;
                    if (intentDataProvider != null) {
                        storage.updateFromWebappIntentDataProvider(intentDataProvider);
                    }

                    // If the image is not yet downloaded (i.e. |splashImage| is null), it will be
                    // stored later when native calls storeWebappSplashImage().
                    Bitmap splashImage = sSplashImageMap.remove(id);
                    if (splashImage != null) {
                        storeWebappSplashImage(id, splashImage);
                    }
                });
            }
        }
                .executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /**
     * Adds home screen shortcut which opens in the browser Activity.
     */
    @CalledByNative
    public static void addShortcut(String id, String url, String userTitle, Bitmap icon,
            boolean isIconAdaptive, int source, String iconUrl) {
        Intent shortcutIntent = createShortcutIntent(url, id, source);
        sDelegate.addShortcutToHomescreen(id, userTitle, icon, isIconAdaptive, shortcutIntent);
    }

    /**
     * Shows toast notifying user that a WebAPK install is already in progress when user tries to
     * queue a new install for the same WebAPK.
     */
    @SuppressWarnings("unused")
    @CalledByNative
    private static void showWebApkInstallInProgressToast() {
        Context applicationContext = ContextUtils.getApplicationContext();
        String toastText = applicationContext.getString(R.string.webapk_install_in_progress);
        WebappsUtils.showToast(toastText);
    }

    /**
     * Stores the specified bitmap as the splash screen for a web app.
     * @param id          ID of the web app which is storing data.
     * @param splashImage Image which should be displayed on the splash screen of
     *                    the web app. This can be null of there is no image to show.
     */
    @SuppressWarnings("unused")
    @CalledByNative
    private static void storeWebappSplashImage(final String id, final Bitmap splashImage) {
        final WebappDataStorage storage = WebappRegistry.getInstance().getWebappDataStorage(id);
        if (storage == null) {
            // The app is not installed yet; put it in this map for now.
            sSplashImageMap.put(id, splashImage);
        } else {
            new AsyncTask<String>() {
                @Override
                protected String doInBackground() {
                    return encodeBitmapAsString(splashImage);
                }

                @Override
                protected void onPostExecute(String encodedImage) {
                    storage.updateSplashScreenImage(encodedImage);
                }
            }
                    .executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        }
    }

    /**
     * Creates a shortcut to launch a web app on the home screen.
     * @param id              Id of the web app.
     * @param url             Url of the web app.
     * @param scope           Url scope of the web app.
     * @param name            Name of the web app.
     * @param shortName       Short name of the web app.
     * @param encodedIcon     Base64 encoded icon of the web app.
     * @param version         Version number of the shortcut.
     * @param displayMode     Display mode of the web app.
     * @param orientation     Orientation of the web app.
     * @param themeColor      Theme color of the web app.
     * @param backgroundColor Background color of the web app.
     * @param isIconGenerated True if the icon is generated by Chromium.
     * @param isIconAdaptive  Whether the shortcut icon is Adaptive.
     * @return Intent for onclick action of the shortcut.
     * This method must not be called on the UI thread.
     */
    public static Intent createWebappShortcutIntent(String id, String url, String scope,
            String name, String shortName, String encodedIcon, int version,
            @WebDisplayMode int displayMode, int orientation, long themeColor, long backgroundColor,
            boolean isIconGenerated, boolean isIconAdaptive) {
        // Create an intent as a launcher icon for a full-screen Activity.
        Intent shortcutIntent = new Intent();
        shortcutIntent.setPackage(ContextUtils.getApplicationContext().getPackageName())
                .setAction(sDelegate.getFullscreenAction())
                .putExtra(EXTRA_ID, id)
                .putExtra(EXTRA_URL, url)
                .putExtra(EXTRA_SCOPE, scope)
                .putExtra(EXTRA_NAME, name)
                .putExtra(EXTRA_SHORT_NAME, shortName)
                .putExtra(EXTRA_ICON, encodedIcon)
                .putExtra(EXTRA_VERSION, version)
                .putExtra(EXTRA_DISPLAY_MODE, displayMode)
                .putExtra(EXTRA_ORIENTATION, orientation)
                .putExtra(EXTRA_THEME_COLOR, themeColor)
                .putExtra(EXTRA_BACKGROUND_COLOR, backgroundColor)
                .putExtra(EXTRA_IS_ICON_GENERATED, isIconGenerated)
                .putExtra(EXTRA_IS_ICON_ADAPTIVE, isIconAdaptive);
        return shortcutIntent;
    }

    /**
     * Creates an intent with mostly empty parameters for launching a web app on the homescreen.
     * @param id              Id of the web app.
     * @param url             Url of the web app.
     * @return the Intent
     * This method must not be called on the UI thread.
     */
    public static Intent createWebappShortcutIntentForTesting(String id, String url) {
        return createWebappShortcutIntent(id, url, getScopeFromUrl(url), null, null, null,
                WEBAPP_SHORTCUT_VERSION, WebDisplayMode.STANDALONE, 0, 0, 0, false, false);
    }

    /**
     * Shortcut intent for icon on home screen.
     * @param url Url of the shortcut.
     * @return Intent for onclick action of the shortcut.
     */
    public static Intent createShortcutIntent(String url, String id, int source) {
        Intent shortcutIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        shortcutIntent.putExtra(REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB, true);
        shortcutIntent.putExtra(EXTRA_ID, id);
        shortcutIntent.putExtra(EXTRA_SOURCE, source);
        shortcutIntent.setPackage(ContextUtils.getApplicationContext().getPackageName());
        return shortcutIntent;
    }

    /**
     * Returns true if there is a WebAPK installed that sits within {@link origin}, and false
     * otherwise.
     */
    @CalledByNative
    @VisibleForTesting
    public static boolean doesOriginContainAnyInstalledWebApk(String origin) {
        return WebappRegistry.getInstance().hasAtLeastOneWebApkForOrigin(
                origin.toLowerCase(Locale.getDefault()));
    }
    /**
     * Returns true if there is a TWA installed that sits within {@link origin}, and false
     * otherwise.
     */
    @CalledByNative
    @VisibleForTesting
    public static boolean doesOriginContainAnyInstalledTwa(String origin) {
        return WebappRegistry.getInstance().getTrustedWebActivityPermissionStore().isTwaInstalled(
                origin.toLowerCase(Locale.getDefault()));
    }

    @CalledByNative
    static String[] getOriginsWithInstalledWebApksOrTwas() {
        Set<String> originSet = WebappRegistry.getInstance().getOriginsWithInstalledApp();
        String[] output = new String[originSet.size()];
        return originSet.toArray(output);
    }

    /**
     * Compresses a bitmap into a PNG and converts into a Base64 encoded string.
     * The encoded string can be decoded using {@link decodeBitmapFromString(String)}.
     * @param bitmap The Bitmap to compress and encode.
     * @return the String encoding the Bitmap.
     */
    public static String encodeBitmapAsString(Bitmap bitmap) {
        if (bitmap == null) return "";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, output);
        return Base64.encodeToString(output.toByteArray(), Base64.DEFAULT);
    }

    /**
     * Decodes a Base64 string into a Bitmap. Used to decode Bitmaps encoded by
     * {@link encodeBitmapAsString(Bitmap)}.
     * @param encodedString the Base64 String to decode.
     * @return the Bitmap which was encoded by the String.
     */
    public static Bitmap decodeBitmapFromString(String encodedString) {
        if (TextUtils.isEmpty(encodedString)) return null;
        byte[] decoded = Base64.decode(encodedString, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(decoded, 0, decoded.length);
    }

    /**
     * @return String that can be used to verify that a WebappActivity is being started by Chrome.
     */
    public static String getEncodedMac(String url) {
        // The only reason we convert to a String here is because Android inexplicably eats a
        // byte[] when adding the shortcut -- the Bundle received by the launched Activity even
        // lacks the key for the extra.
        byte[] mac = WebappAuthenticator.getMacForUrl(url);
        return Base64.encodeToString(mac, Base64.DEFAULT);
    }

    /**
     * Generates a scope URL based on the passed in URL. Should only be used for legacy
     * WebAPKs created prior to the usage of the Web App Manifest scope member.
     * @param url The url to convert to a scope.
     * @return The scope.
     */
    public static String getScopeFromUrl(String url) {
        // Scope URL is generated by:
        // - Removing last component of the URL if it does not end with a slash.
        // - Clearing the URL's query and fragment.

        Uri uri = Uri.parse(url);
        String path = uri.getEncodedPath();

        // Remove the last path element if there is at least one path element, *and* the path does
        // not end with a slash. This means that URLs to specific files have the file component
        // removed, but URLs to directories retain the directory.
        int lastSlashIndex = (path == null) ? -1 : path.lastIndexOf("/");
        if (lastSlashIndex < 0) {
            path = "/";
        } else if (lastSlashIndex < path.length() - 1) {
            path = path.substring(0, lastSlashIndex + 1);
        }

        Uri.Builder builder = uri.buildUpon();
        builder.encodedPath(path);
        builder.fragment("");
        builder.query("");
        return builder.build().toString();
    }

    @CalledByNative
    public static void setForceWebApkUpdate(String id) {
        WebappDataStorage storage = WebappRegistry.getInstance().getWebappDataStorage(id);
        if (storage != null) {
            storage.setShouldForceUpdate(true);
        }
    }
}
