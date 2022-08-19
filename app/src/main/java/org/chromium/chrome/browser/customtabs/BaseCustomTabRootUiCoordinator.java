// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.customtabs;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.chromium.base.jank_tracker.DummyJankTracker;
import org.chromium.base.supplier.BooleanSupplier;
import org.chromium.base.supplier.ObservableSupplier;
import org.chromium.base.supplier.OneShotCallback;
import org.chromium.base.supplier.OneshotSupplierImpl;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.R;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.app.reengagement.ReengagementActivity;
import org.chromium.chrome.browser.back_press.BackPressManager;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.bookmarks.TabBookmarker;
import org.chromium.chrome.browser.browserservices.intents.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.bottombar.ephemeraltab.EphemeralTabCoordinator;
import org.chromium.chrome.browser.compositor.layouts.LayoutManagerImpl;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabController;
import org.chromium.chrome.browser.customtabs.features.branding.BrandingController;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbar;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarCoordinator;
import org.chromium.chrome.browser.feature_engagement.TrackerFactory;
import org.chromium.chrome.browser.flags.ActivityType;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.fullscreen.BrowserControlsManager;
import org.chromium.chrome.browser.fullscreen.FullscreenManager;
import org.chromium.chrome.browser.incognito.reauth.IncognitoReauthCoordinatorFactory;
import org.chromium.chrome.browser.incognito.reauth.IncognitoReauthManager;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.reengagement.ReengagementNotificationController;
import org.chromium.chrome.browser.settings.SettingsLauncherImpl;
import org.chromium.chrome.browser.share.ShareDelegate;
import org.chromium.chrome.browser.tabmodel.TabCreatorManager;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;
import org.chromium.chrome.browser.ui.RootUiCoordinator;
import org.chromium.chrome.browser.ui.appmenu.AppMenuBlocker;
import org.chromium.chrome.browser.ui.appmenu.AppMenuDelegate;
import org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager;
import org.chromium.chrome.browser.ui.system.StatusBarColorController.StatusBarColorProvider;
import org.chromium.components.browser_ui.widget.MenuOrKeyboardActionController;
import org.chromium.components.feature_engagement.Tracker;
import org.chromium.ui.base.ActivityWindowAndroid;
import org.chromium.ui.base.IntentRequestTracker;
import org.chromium.ui.modaldialog.ModalDialogManager;

/**
 * A {@link RootUiCoordinator} variant that controls UI for {@link BaseCustomTabActivity}.
 */
public class BaseCustomTabRootUiCoordinator extends RootUiCoordinator {
    private final Supplier<CustomTabToolbarCoordinator> mToolbarCoordinator;
    private final Supplier<CustomTabActivityNavigationController> mNavigationController;
    private final Supplier<BrowserServicesIntentDataProvider> mIntentDataProvider;
    private final Supplier<CustomTabActivityTabController> mTabController;

    private CustomTabHeightStrategy mCustomTabHeightStrategy;

    // Created only when ChromeFeatureList.CctBrandTransparency is enabled.
    // TODO(https://crbug.com/1343056): Make it part of the ctor.
    private @Nullable BrandingController mBrandingController;

    /**
     * Construct a new BaseCustomTabRootUiCoordinator.
     * @param activity The activity whose UI the coordinator is responsible for.
     * @param shareDelegateSupplier Supplies the {@link ShareDelegate}.
     * @param tabProvider The {@link ActivityTabProvider} to get current tab of the activity.
     * @param profileSupplier Supplier of the currently applicable profile.
     * @param bookmarkBridgeSupplier Supplier of the bookmark bridge for the current profile.
     * @param tabBookmarkerSupplier Supplier of {@link TabBookmarker} for bookmarking a given tab.
     * @param contextualSearchManagerSupplier Supplier of the {@link ContextualSearchManager}.
     * @param tabModelSelectorSupplier Supplies the {@link TabModelSelector}.
     * @param browserControlsManager Manages the browser controls.
     * @param windowAndroid The current {@link WindowAndroid}.
     * @param activityLifecycleDispatcher Allows observation of the activity lifecycle.
     * @param layoutManagerSupplier Supplies the {@link LayoutManager}.
     * @param menuOrKeyboardActionController Controls the menu or keyboard action controller.
     * @param activityThemeColorSupplier Supplies the activity color theme.
     * @param modalDialogManagerSupplier Supplies the {@link ModalDialogManager}.
     * @param appMenuBlocker Controls the app menu blocking.
     * @param supportsAppMenuSupplier Supplies the support state for the app menu.
     * @param supportsFindInPage Supplies the support state for find in page.
     * @param tabCreatorManagerSupplier Supplies the {@link TabCreatorManager}.
     * @param fullscreenManager Manages the fullscreen state.
     * @param compositorViewHolderSupplier Supplies the {@link CompositorViewHolder}.
     * @param tabContentManagerSupplier Supplies the {@link TabContentManager}.
     * @param snackbarManagerSupplier Supplies the {@link SnackbarManager}.
     * @param activityType The {@link ActivityType} for the activity.
     * @param isInOverviewModeSupplier Supplies whether the app is in overview mode.
     * @param isWarmOnResumeSupplier Supplies whether the app was warm on resume.
     * @param appMenuDelegate The app menu delegate.
     * @param statusBarColorProvider Provides the status bar color.
     * @param intentRequestTracker Tracks intent requests.
     * @param customTabToolbarCoordinator Coordinates the custom tab toolbar.
     * @param customTabNavigationController Controls the custom tab navigation.
     * @param intentDataProvider Contains intent information used to start the Activity.
     * @param tabController Activity tab controller.
     */
    public BaseCustomTabRootUiCoordinator(@NonNull AppCompatActivity activity,
            @NonNull ObservableSupplier<ShareDelegate> shareDelegateSupplier,
            @NonNull ActivityTabProvider tabProvider,
            @NonNull ObservableSupplier<Profile> profileSupplier,
            @NonNull ObservableSupplier<BookmarkBridge> bookmarkBridgeSupplier,
            @NonNull ObservableSupplier<TabBookmarker> tabBookmarkerSupplier,
            @NonNull Supplier<ContextualSearchManager> contextualSearchManagerSupplier,
            @NonNull ObservableSupplier<TabModelSelector> tabModelSelectorSupplier,
            @NonNull BrowserControlsManager browserControlsManager,
            @NonNull ActivityWindowAndroid windowAndroid,
            @NonNull ActivityLifecycleDispatcher activityLifecycleDispatcher,
            @NonNull ObservableSupplier<LayoutManagerImpl> layoutManagerSupplier,
            @NonNull MenuOrKeyboardActionController menuOrKeyboardActionController,
            @NonNull Supplier<Integer> activityThemeColorSupplier,
            @NonNull ObservableSupplier<ModalDialogManager> modalDialogManagerSupplier,
            @NonNull AppMenuBlocker appMenuBlocker,
            @NonNull BooleanSupplier supportsAppMenuSupplier,
            @NonNull BooleanSupplier supportsFindInPage,
            @NonNull Supplier<TabCreatorManager> tabCreatorManagerSupplier,
            @NonNull FullscreenManager fullscreenManager,
            @NonNull ObservableSupplier<CompositorViewHolder> compositorViewHolderSupplier,
            @NonNull Supplier<TabContentManager> tabContentManagerSupplier,
            @NonNull Supplier<SnackbarManager> snackbarManagerSupplier,
            @ActivityType int activityType, @NonNull Supplier<Boolean> isInOverviewModeSupplier,
            @NonNull Supplier<Boolean> isWarmOnResumeSupplier,
            @NonNull AppMenuDelegate appMenuDelegate,
            @NonNull StatusBarColorProvider statusBarColorProvider,
            @NonNull IntentRequestTracker intentRequestTracker,
            @NonNull Supplier<CustomTabToolbarCoordinator> customTabToolbarCoordinator,
            @NonNull Supplier<CustomTabActivityNavigationController> customTabNavigationController,
            @NonNull Supplier<BrowserServicesIntentDataProvider> intentDataProvider,
            @NonNull Supplier<EphemeralTabCoordinator> ephemeralTabCoordinatorSupplier,
            @NonNull BackPressManager backPressManager,
            @NonNull Supplier<CustomTabActivityTabController> tabController) {
        // clang-format off
        super(activity, null, shareDelegateSupplier, tabProvider,
                profileSupplier, bookmarkBridgeSupplier, tabBookmarkerSupplier,
                contextualSearchManagerSupplier, tabModelSelectorSupplier,
                new OneshotSupplierImpl<>(), new OneshotSupplierImpl<>(),
                new OneshotSupplierImpl<>(), new OneshotSupplierImpl<>(), () -> null,
                browserControlsManager, windowAndroid, new DummyJankTracker(),
                activityLifecycleDispatcher, layoutManagerSupplier, menuOrKeyboardActionController,
                activityThemeColorSupplier, modalDialogManagerSupplier, appMenuBlocker,
                supportsAppMenuSupplier, supportsFindInPage, tabCreatorManagerSupplier,
                fullscreenManager, compositorViewHolderSupplier, tabContentManagerSupplier,
                snackbarManagerSupplier, activityType,
                isInOverviewModeSupplier, isWarmOnResumeSupplier, appMenuDelegate,
                statusBarColorProvider, intentRequestTracker, new OneshotSupplierImpl<>(),
                ephemeralTabCoordinatorSupplier, false, backPressManager);
        // clang-format on
        mToolbarCoordinator = customTabToolbarCoordinator;
        mNavigationController = customTabNavigationController;
        mIntentDataProvider = intentDataProvider;

        if (CachedFeatureFlags.isEnabled(ChromeFeatureList.CCT_BRAND_TRANSPARENCY)
                && intentDataProvider.get().getActivityType() == ActivityType.CUSTOM_TAB
                && !intentDataProvider.get().isIncognito()) {
            String packageName = mIntentDataProvider.get().getClientPackageName();
            if (TextUtils.isEmpty(packageName)) {
                packageName = CustomTabIntentDataProvider.getReferrerPackageName(activity);
            }
            mBrandingController = new BrandingController(activity, packageName);
        }
        mTabController = tabController;
    }

    @Override
    protected void initializeToolbar() {
        super.initializeToolbar();

        mToolbarCoordinator.get().onToolbarInitialized(mToolbarManager);
        mNavigationController.get().onToolbarInitialized(mToolbarManager);

        CustomTabToolbar toolbar = mActivity.findViewById(R.id.toolbar);
        View coordinator = mActivity.findViewById(R.id.coordinator);
        mCustomTabHeightStrategy.onToolbarInitialized(
                coordinator, toolbar, mIntentDataProvider.get().getPartialTabToolbarCornerRadius());
        if (mBrandingController != null) {
            mBrandingController.onToolbarInitialized(toolbar.getBrandingDelegate());
        }
        toolbar.setCloseButtonPosition(mIntentDataProvider.get().getCloseButtonPosition());
        if (mIntentDataProvider.get().isPartialHeightCustomTab()) {
            Runnable softInputCallback =
                    ((PartialCustomTabHeightStrategy) mCustomTabHeightStrategy)::onShowSoftInput;
            mTabController.get().registerTabObserver(
                    new PartialCustomTabTabObserver(softInputCallback));
        }
    }

    @Override
    public void onFinishNativeInitialization() {
        super.onFinishNativeInitialization();
        if (!ReengagementNotificationController.isEnabled()) return;
        new OneShotCallback<>(mProfileSupplier, mCallbackController.makeCancelable(profile -> {
            assert profile != null : "Unexpectedly null profile from TabModel.";
            if (profile == null) return;
            Tracker tracker = TrackerFactory.getTrackerForProfile(profile);
            ReengagementNotificationController controller = new ReengagementNotificationController(
                    mActivity, tracker, ReengagementActivity.class);
            controller.tryToReengageTheUser();
        }));
    }

    @Override
    protected IncognitoReauthCoordinatorFactory getIncognitoReauthCoordinatorFactory() {
        return new IncognitoReauthCoordinatorFactory(mActivity, mTabModelSelectorSupplier.get(),
                mModalDialogManagerSupplier.get(), new IncognitoReauthManager(),
                new SettingsLauncherImpl(),
                /*tabSwitcherCustomViewManagerOneshotSupplier= */ null,
                /*incognitoReauthTopToolbarDelegate= */ null,
                /*layoutManager=*/null,
                /*isTabbedActivity= */ false);
    }

    @Override
    protected boolean shouldAllowThemingInNightMode() {
        return mActivityType == ActivityType.TRUSTED_WEB_ACTIVITY
                || mActivityType == ActivityType.WEB_APK;
    }

    @Override
    protected boolean shouldAllowBrightThemeColors() {
        return mActivityType == ActivityType.TRUSTED_WEB_ACTIVITY
                || mActivityType == ActivityType.WEB_APK;
    }

    @Override
    public void onPreInflationStartup() {
        super.onPreInflationStartup();

        BrowserServicesIntentDataProvider intentDataProvider = mIntentDataProvider.get();
        assert intentDataProvider
                != null : "IntentDataProvider needs to be non-null after preInflationStartup";

        mCustomTabHeightStrategy = CustomTabHeightStrategy.createStrategy(mActivity,
                intentDataProvider.getInitialActivityHeight(),
                intentDataProvider.getColorProvider().getNavigationBarColor(),
                intentDataProvider.getColorProvider().getNavigationBarDividerColor(),
                CustomTabsConnection.getInstance(), intentDataProvider.getSession(),
                mActivityLifecycleDispatcher);
    }

    @Override
    public void onPostInflationStartup() {
        super.onPostInflationStartup();
        mCustomTabHeightStrategy.onPostInflationStartup();
    }

    @Override
    protected void setStatusBarScrimFraction(float scrimFraction) {
        super.setStatusBarScrimFraction(scrimFraction);
        // TODO(jinsukkim): Separate CCT scrim update action from status bar scrim stuff.
        mCustomTabHeightStrategy.setScrimFraction(scrimFraction);
    }

    @Override
    protected Rect getAppRectInWindow() {
        // This is necessary if app handler cannot rely on the popup window that ensures the menu
        // will not be clipped off the screen, which can happen if Window#FLAGS_LAYOUT_NO_LIMITS
        // is set to allow the app to be drawn outside the screen in partial CCT.
        if (mIntentDataProvider.get().isPartialHeightCustomTab()) {
            View coord = mActivity.findViewById(R.id.coordinator);
            int[] location = new int[2];
            coord.getLocationInWindow(location);
            return new Rect(location[0], location[1], location[0] + coord.getWidth(),
                    location[1] + coord.getHeight());
        }
        return super.getAppRectInWindow();
    }

    @Override
    protected boolean canDrawOutsideScreen() {
        return mCustomTabHeightStrategy.canDrawOutsideScreen();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mBrandingController != null) {
            mBrandingController.destroy();
            mBrandingController = null;
        }
    }

    /**
     * Delegates changing the background color to the {@link CustomTabHeightStrategy}.
     * Returns {@code true} if any action were taken, {@code false} if not.
     */
    public boolean changeBackgroundColorForResizing() {
        if (mCustomTabHeightStrategy == null) return false;

        return mCustomTabHeightStrategy.changeBackgroundColorForResizing();
    }

    /**
     * Perform slide-down animation on closing.
     * @param finishRunnable Runnable finishing the activity after the animation.
     */
    void handleCloseAnimation(Runnable finishRunnable) {
        mCustomTabHeightStrategy.handleCloseAnimation(finishRunnable);
    }
}
