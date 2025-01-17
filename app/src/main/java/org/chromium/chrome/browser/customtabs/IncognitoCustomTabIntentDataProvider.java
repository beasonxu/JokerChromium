// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.customtabs;

import static org.chromium.chrome.browser.customtabs.CustomTabIntentDataProvider.BUNDLE_ENTER_ANIMATION_RESOURCE;
import static org.chromium.chrome.browser.customtabs.CustomTabIntentDataProvider.BUNDLE_EXIT_ANIMATION_RESOURCE;
import static org.chromium.chrome.browser.customtabs.CustomTabIntentDataProvider.BUNDLE_PACKAGE_NAME;
import static org.chromium.chrome.browser.customtabs.CustomTabIntentDataProvider.EXTRA_IS_OPENED_BY_CHROME;
import static org.chromium.chrome.browser.customtabs.CustomTabIntentDataProvider.EXTRA_UI_TYPE;
import static org.chromium.chrome.browser.customtabs.CustomTabIntentDataProvider.isTrustedCustomTab;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSessionToken;

import org.chromium.base.IntentUtils;
import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.ChromeApplication;
import org.chromium.chrome.browser.IntentHandler;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.flags.ActivityType;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.components.browser_ui.widget.TintedDrawable;

import java.util.ArrayList;
import java.util.List;

/**
 * A model class that parses the incoming intent for incognito Custom Tabs specific customization
 * data.
 *
 * Lifecycle: is activity-scoped, i.e. one instance per CustomTabActivity instance. Must be
 * re-created when color scheme changes, which happens automatically since color scheme change leads
 * to activity re-creation.
 */
public class IncognitoCustomTabIntentDataProvider extends BrowserServicesIntentDataProvider {
    private static final int MAX_CUSTOM_MENU_ITEMS = 5;

    // If set, the incognito icon is not shown. Only honored for first party requests.
    public static final String EXTRA_HIDE_INCOGNITO_ICON =
            "org.chromium.chrome.browser.customtabs.HIDE_INCOGNITO_ICON";

    // If set, the colors match that of normal profiles. Only honored for first party requests.
    public static final String EXTRA_USE_NORMAL_PROFILE_STYLE =
            "org.chromium.chrome.browser.customtabs.USE_NORMAL_PROFILE_STYLE";

    // If set, incognito is allowed regardless of the status of the feature. Only honored for first
    // party requests.
    public static final String EXTRA_FORCE_ENABLE_FOR_EXPERIMENT =
            "org.chromium.chrome.browser.customtabs.FORCE_ENABLE_FOR_EXPERIMENT";

    private final Intent mIntent;
    private final CustomTabsSessionToken mSession;
    private final boolean mIsTrustedIntent;
    private final Bundle mAnimationBundle;
    private final CustomTabColorProvider mColorProvider;
    private final int mTitleVisibilityState;
    private final Drawable mCloseButtonIcon;
    private final boolean mShowShareItem;
    private final List<Pair<String, PendingIntent>> mMenuEntries = new ArrayList<>();
    private final boolean mHideIncognitoIconOnToolbar;

    @Nullable
    private final String mUrlToLoad;

    /** Whether this CustomTabActivity was explicitly started by another Chrome Activity. */
    private final boolean mIsOpenedByChrome;

    private final @CustomTabsUiType int mUiType;

    /**
     * Constructs a {@link IncognitoCustomTabIntentDataProvider}.
     */
    public IncognitoCustomTabIntentDataProvider(Intent intent, Context context, int colorScheme) {
        assert intent != null;
        mIntent = intent;
        mUrlToLoad = resolveUrlToLoad(intent);
        mSession = CustomTabsSessionToken.getSessionTokenFromIntent(intent);
        mIsTrustedIntent = isTrustedCustomTab(intent, mSession);
        mAnimationBundle = IntentUtils.safeGetBundleExtra(
                intent, CustomTabsIntent.EXTRA_EXIT_ANIMATION_BUNDLE);
        mIsOpenedByChrome =
                IntentUtils.safeGetBooleanExtra(intent, EXTRA_IS_OPENED_BY_CHROME, false);
        // Only allow first-parties to change the styling.
        final boolean useNormalProfileColors = isIntentFromFirstParty(intent)
                && IntentUtils.safeGetBooleanExtra(intent, EXTRA_USE_NORMAL_PROFILE_STYLE, false);
        mColorProvider = useNormalProfileColors
                ? new CustomTabColorProviderImpl(intent, context, colorScheme)
                : new IncognitoCustomTabColorProvider(context);
        mHideIncognitoIconOnToolbar = isIntentFromFirstParty(intent)
                && IntentUtils.safeGetBooleanExtra(intent, EXTRA_HIDE_INCOGNITO_ICON, false);
        mCloseButtonIcon = TintedDrawable.constructTintedDrawable(context, R.drawable.btn_close);
        mShowShareItem = IntentUtils.safeGetBooleanExtra(
                intent, CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, false);
        mTitleVisibilityState = IntentUtils.safeGetIntExtra(
                intent, CustomTabsIntent.EXTRA_TITLE_VISIBILITY_STATE, CustomTabsIntent.NO_TITLE);

        mUiType = getUiType(intent);
        updateExtraMenuItemsIfNecessary(intent);
    }

    private static @CustomTabsUiType int getUiType(Intent intent) {
        if (isForReaderMode(intent)) return CustomTabsUiType.READER_MODE;

        return CustomTabsUiType.DEFAULT;
    }

    private static boolean isIncognitoRequested(Intent intent) {
        return IntentUtils.safeGetBooleanExtra(
                intent, IntentHandler.EXTRA_OPEN_NEW_INCOGNITO_TAB, false);
    }

    private static boolean isForReaderMode(Intent intent) {
        final int requestedUiType =
                IntentUtils.safeGetIntExtra(intent, EXTRA_UI_TYPE, CustomTabsUiType.DEFAULT);
        return (isIntentFromChrome(intent) && (requestedUiType == CustomTabsUiType.READER_MODE));
    }

    private static boolean isIntentFromThirdPartyAllowed() {
        return CachedFeatureFlags.isEnabled(
                ChromeFeatureList.CCT_INCOGNITO_AVAILABLE_TO_THIRD_PARTY);
    }

    private static boolean isIntentFromFirstParty(Intent intent) {
        CustomTabsSessionToken sessionToken =
                CustomTabsSessionToken.getSessionTokenFromIntent(intent);
        String sendersPackageName =
                CustomTabsConnection.getInstance().getClientPackageNameForSession(sessionToken);
        return !TextUtils.isEmpty(sendersPackageName)
                && ChromeApplication.getComponent().resolveExternalAuthUtils().isGoogleSigned(
                        sendersPackageName);
    }

    private static boolean isIntentFromChrome(Intent intent) {
        return IntentHandler.wasIntentSenderChrome(intent);
    }

    private static boolean isTrustedIntent(Intent intent) {
        if (isIntentFromChrome(intent)) return true;
        return isIntentFromFirstParty(intent) || isIntentFromThirdPartyAllowed();
    }

    private static boolean isAllowedToAddCustomMenuItem(Intent intent) {
        // Only READER_MODE is supported for now.
        return isForReaderMode(intent);
    }

    private void updateExtraMenuItemsIfNecessary(Intent intent) {
        if (!isAllowedToAddCustomMenuItem(intent)) return;

        List<Bundle> menuItems =
                IntentUtils.getParcelableArrayListExtra(intent, CustomTabsIntent.EXTRA_MENU_ITEMS);
        if (menuItems == null) return;

        for (int i = 0; i < Math.min(MAX_CUSTOM_MENU_ITEMS, menuItems.size()); i++) {
            Bundle bundle = menuItems.get(i);
            String title = IntentUtils.safeGetString(bundle, CustomTabsIntent.KEY_MENU_ITEM_TITLE);
            PendingIntent pendingIntent =
                    IntentUtils.safeGetParcelable(bundle, CustomTabsIntent.KEY_PENDING_INTENT);
            if (TextUtils.isEmpty(title) || pendingIntent == null) continue;
            mMenuEntries.add(new Pair<String, PendingIntent>(title, pendingIntent));
        }
    }

    public static void addIncongitoExtrasForChromeFeatures(
            Intent intent, @IntentHandler.IncognitoCCTCallerId int chromeCallerId) {
        intent.putExtra(IntentHandler.EXTRA_OPEN_NEW_INCOGNITO_TAB, true);
        intent.putExtra(IntentHandler.EXTRA_INCOGNITO_CCT_CALLER_ID, chromeCallerId);
    }

    public @IntentHandler.IncognitoCCTCallerId int getFeatureIdForMetricsCollection() {
        if (isIntentFromChrome(mIntent)) {
            assert mIntent.hasExtra(IntentHandler.EXTRA_INCOGNITO_CCT_CALLER_ID)
                : "Intent coming from Chrome features should add the extra "
                    + "IntentHandler.EXTRA_INCOGNITO_CCT_CALLER_ID.";

            @IntentHandler.IncognitoCCTCallerId
            int incognitoCCTChromeClientId = IntentUtils.safeGetIntExtra(mIntent,
                    IntentHandler.EXTRA_INCOGNITO_CCT_CALLER_ID,
                    IntentHandler.IncognitoCCTCallerId.OTHER_CHROME_FEATURES);

            boolean isValidEntry = (incognitoCCTChromeClientId
                            > IntentHandler.IncognitoCCTCallerId.OTHER_CHROME_FEATURES
                    && incognitoCCTChromeClientId < IntentHandler.IncognitoCCTCallerId.NUM_ENTRIES);
            assert isValidEntry : "Invalid EXTRA_INCOGNITO_CCT_CALLER_ID value!";
            if (!isValidEntry) {
                incognitoCCTChromeClientId =
                        IntentHandler.IncognitoCCTCallerId.OTHER_CHROME_FEATURES;
            }
            return incognitoCCTChromeClientId;
        } else if (isIntentFromFirstParty(mIntent)) {
            return IntentHandler.IncognitoCCTCallerId.GOOGLE_APPS;
        } else {
            return IntentHandler.IncognitoCCTCallerId.OTHER_APPS;
        }
    }

    // TODO(https://crbug.com/1023759): Remove this function and enable
    // incognito CCT request for all apps.
    public static boolean isValidIncognitoIntent(Intent intent) {
        if (!isIncognitoRequested(intent)) return false;
        // Allow first parties to use for experimentation regardless of state of feature.
        if (isIntentFromFirstParty(intent)
                && IntentUtils.safeGetBooleanExtra(
                        intent, EXTRA_FORCE_ENABLE_FOR_EXPERIMENT, false)) {
            return true;
        }
        if (!isTrustedIntent(intent)) return false;
        return CachedFeatureFlags.isEnabled(ChromeFeatureList.CCT_INCOGNITO);
    }

    private String resolveUrlToLoad(Intent intent) {
        return IntentHandler.getUrlFromIntent(intent);
    }

    @Override
    public @ActivityType int getActivityType() {
        return ActivityType.CUSTOM_TAB;
    }

    @Override
    @Nullable
    public Intent getIntent() {
        return mIntent;
    }

    @Override
    @Nullable
    public CustomTabsSessionToken getSession() {
        return mSession;
    }

    @Override
    public boolean shouldAnimateOnFinish() {
        return mAnimationBundle != null && getClientPackageName() != null;
    }

    @Override
    public String getClientPackageName() {
        if (mAnimationBundle == null) return null;
        return mAnimationBundle.getString(BUNDLE_PACKAGE_NAME);
    }

    @Override
    public int getAnimationEnterRes() {
        return shouldAnimateOnFinish() ? mAnimationBundle.getInt(BUNDLE_ENTER_ANIMATION_RESOURCE)
                                       : 0;
    }

    @Override
    public int getAnimationExitRes() {
        return shouldAnimateOnFinish() ? mAnimationBundle.getInt(BUNDLE_EXIT_ANIMATION_RESOURCE)
                                       : 0;
    }

    @Deprecated
    @Override
    public boolean isTrustedIntent() {
        return mIsTrustedIntent;
    }

    @Override
    @Nullable
    public String getUrlToLoad() {
        return mUrlToLoad;
    }

    @Override
    public boolean shouldEnableUrlBarHiding() {
        return false;
    }

    @Override
    public int getToolbarColor() {
        return mColorProvider.getToolbarColor();
    }

    @Override
    public boolean hasCustomToolbarColor() {
        return mColorProvider.hasCustomToolbarColor();
    }

    @Override
    @Nullable
    public Drawable getCloseButtonDrawable() {
        return mCloseButtonIcon;
    }

    @Override
    public boolean shouldShowShareMenuItem() {
        return mShowShareItem;
    }

    @Override
    public int getBottomBarColor() {
        return mColorProvider.getBottomBarColor();
    }

    @Override
    public int getInitialBackgroundColor() {
        return mColorProvider.getInitialBackgroundColor();
    }

    @Override
    public Integer getNavigationBarColor() {
        return mColorProvider.getNavigationBarColor();
    }

    @Override
    @Nullable
    public Integer getNavigationBarDividerColor() {
        return mColorProvider.getNavigationBarDividerColor();
    }

    @Override
    public int getTitleVisibilityState() {
        return mTitleVisibilityState;
    }

    @Override
    public boolean isOpenedByChrome() {
        return mIsOpenedByChrome;
    }

    @Override
    public boolean shouldShowStarButton() {
        return true;
    }

    @Override
    public boolean shouldShowDownloadButton() {
        return false;
    }

    @Override
    public boolean isIncognito() {
        return true;
    }

    @Override
    @CustomTabsUiType
    public int getUiType() {
        return mUiType;
    }

    @Override
    public List<String> getMenuTitles() {
        ArrayList<String> list = new ArrayList<>();
        for (Pair<String, PendingIntent> pair : mMenuEntries) {
            list.add(pair.first);
        }
        return list;
    }

    @Override
    public boolean shouldHideIncognitoIconOnToolbarInCct() {
        return mHideIncognitoIconOnToolbar;
    }
}
