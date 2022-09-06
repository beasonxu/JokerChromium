// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.toolbar;

import android.content.ComponentCallbacks;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.AppBarLayout;

import org.chromium.base.Callback;
import org.chromium.base.CallbackController;
import org.chromium.base.TraceEvent;
import org.chromium.base.supplier.ObservableSupplier;
import org.chromium.base.supplier.ObservableSupplierImpl;
import org.chromium.base.supplier.OneshotSupplier;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.TabLoadStatus;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.browser_controls.BrowserControlsSizer;
import org.chromium.chrome.browser.browser_controls.BrowserControlsStateProvider;
import org.chromium.chrome.browser.browser_controls.BrowserStateBrowserControlsVisibilityDelegate;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.Invalidator;
import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelManager.OverlayPanelManagerObserver;
import org.chromium.chrome.browser.compositor.layouts.Layout;
import org.chromium.chrome.browser.compositor.layouts.LayoutManagerImpl;
import org.chromium.chrome.browser.compositor.layouts.SceneChangeObserver;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbar;
import org.chromium.chrome.browser.dom_distiller.DomDistillerTabUtils;
import org.chromium.chrome.browser.feature_engagement.TrackerFactory;
import org.chromium.chrome.browser.feed.shared.FeedFeatures;
import org.chromium.chrome.browser.findinpage.FindToolbarManager;
import org.chromium.chrome.browser.findinpage.FindToolbarObserver;
import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.fullscreen.FullscreenManager;
import org.chromium.chrome.browser.fullscreen.FullscreenOptions;
import org.chromium.chrome.browser.homepage.HomepageManager;
import org.chromium.chrome.browser.homepage.HomepagePolicyManager;
import org.chromium.chrome.browser.identity_disc.IdentityDiscController;
import org.chromium.chrome.browser.incognito.IncognitoUtils;
import org.chromium.chrome.browser.layouts.LayoutStateProvider;
import org.chromium.chrome.browser.layouts.LayoutType;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.ntp.FakeboxDelegate;
import org.chromium.chrome.browser.ntp.IncognitoNewTabPage;
import org.chromium.chrome.browser.ntp.NewTabPage;
import org.chromium.chrome.browser.offlinepages.OfflinePageUtils;
import org.chromium.chrome.browser.omnibox.BackKeyBehaviorDelegate;
import org.chromium.chrome.browser.omnibox.LocationBar;
import org.chromium.chrome.browser.omnibox.LocationBarCoordinator;
import org.chromium.chrome.browser.omnibox.NewTabPageDelegate;
import org.chromium.chrome.browser.omnibox.OmniboxFocusReason;
import org.chromium.chrome.browser.omnibox.OverrideUrlLoadingDelegate;
import org.chromium.chrome.browser.omnibox.SearchEngineLogoUtils;
import org.chromium.chrome.browser.omnibox.UrlFocusChangeListener;
import org.chromium.chrome.browser.omnibox.voice.VoiceRecognitionHandler;
import org.chromium.chrome.browser.previews.Previews;
import org.chromium.chrome.browser.previews.PreviewsAndroidBridge;
import org.chromium.chrome.browser.previews.PreviewsUma;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.search_engines.TemplateUrlServiceFactory;
import org.chromium.chrome.browser.share.ShareDelegate;
import org.chromium.chrome.browser.tab.SadTab;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabObserver;
import org.chromium.chrome.browser.tab.TabSelectionType;
import org.chromium.chrome.browser.tabmodel.IncognitoStateProvider;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;
import org.chromium.chrome.browser.tabmodel.TabModelSelectorObserver;
import org.chromium.chrome.browser.tasks.ReturnToChromeExperimentsUtil;
import org.chromium.chrome.browser.tasks.tab_management.TabGroupUi;
import org.chromium.chrome.browser.tasks.tab_management.TabManagementModuleProvider;
import org.chromium.chrome.browser.tasks.tab_management.TabUiFeatureUtilities;
import org.chromium.chrome.browser.theme.ThemeColorProvider;
import org.chromium.chrome.browser.theme.ThemeColorProvider.ThemeColorObserver;
import org.chromium.chrome.browser.theme.ThemeColorProvider.TintObserver;
import org.chromium.chrome.browser.theme.TopUiThemeColorProvider;
import org.chromium.chrome.browser.toolbar.bottom.BottomControlsCoordinator;
import org.chromium.chrome.browser.toolbar.bottom.ScrollingBottomViewResourceFrameLayout;
import org.chromium.chrome.browser.toolbar.load_progress.LoadProgressCoordinator;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButtonCoordinator;
import org.chromium.chrome.browser.toolbar.top.ActionModeController;
import org.chromium.chrome.browser.toolbar.top.ActionModeController.ActionBarDelegate;
import org.chromium.chrome.browser.toolbar.top.HomeButtonCoordinator;
import org.chromium.chrome.browser.toolbar.top.TabSwitcherActionMenuCoordinator;
import org.chromium.chrome.browser.toolbar.top.ToggleTabStackButton;
import org.chromium.chrome.browser.toolbar.top.ToggleTabStackButtonCoordinator;
import org.chromium.chrome.browser.toolbar.top.Toolbar;
import org.chromium.chrome.browser.toolbar.top.ToolbarActionModeCallback;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;
import org.chromium.chrome.browser.toolbar.top.ToolbarLayout;
import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;
import org.chromium.chrome.browser.toolbar.top.TopToolbarCoordinator;
import org.chromium.chrome.browser.toolbar.top.ViewShiftingActionBarDelegate;
import org.chromium.chrome.browser.ui.TabObscuringHandler;
import org.chromium.chrome.browser.ui.appmenu.AppMenuCoordinator;
import org.chromium.chrome.browser.ui.appmenu.AppMenuDelegate;
import org.chromium.chrome.browser.ui.appmenu.MenuButtonDelegate;
import org.chromium.chrome.browser.ui.native_page.NativePage;
import org.chromium.chrome.browser.ui.system.StatusBarColorController;
import org.chromium.chrome.browser.user_education.UserEducationHelper;
import org.chromium.chrome.browser.util.ChromeAccessibilityUtil;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.chrome.features.start_surface.StartSurface;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;
import org.chromium.chrome.features.start_surface.StartSurfaceState;
import org.chromium.components.browser_ui.styles.ChromeColors;
import org.chromium.components.browser_ui.widget.scrim.ScrimCoordinator;
import org.chromium.components.embedder_support.util.UrlConstants;
import org.chromium.components.embedder_support.util.UrlUtilities;
import org.chromium.components.feature_engagement.Tracker;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.components.search_engines.TemplateUrlService.TemplateUrlServiceObserver;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.net.NetError;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.PageTransition;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.base.WindowDelegate;
import org.chromium.ui.modaldialog.ModalDialogManager;
import org.chromium.ui.util.TokenHolder;
import org.chromium.url.GURL;

import java.util.List;

/**
 * Contains logic for managing the toolbar visual component.  This class manages the interactions
 * with the rest of the application to ensure the toolbar is always visually up to date.
 */
public class ToolbarManager implements UrlFocusChangeListener, ThemeColorObserver, TintObserver,
                                       MenuButtonDelegate, ChromeAccessibilityUtil.Observer {
    private final IncognitoStateProvider mIncognitoStateProvider;
    private final TabCountProvider mTabCountProvider;
    private final TopUiThemeColorProvider mTopUiThemeColorProvider;
    private AppThemeColorProvider mAppThemeColorProvider;
    private SettableThemeColorProvider mCustomTabThemeColorProvider;
    private final TopToolbarCoordinator mToolbar;
    private final ToolbarControlContainer mControlContainer;
    private final BrowserControlsStateProvider.Observer mBrowserControlsObserver;
    private final FullscreenManager.Observer mFullscreenObserver;
    private final ObservableSupplierImpl<Boolean> mHomepageEnabledSupplier =
            new ObservableSupplierImpl<>();
    private final ObservableSupplierImpl<Boolean> mHomepageManagedByPolicySupplier =
            new ObservableSupplierImpl<>();
    private final ObservableSupplierImpl<Boolean> mStartSurfaceAsHomepageSupplier =
            new ObservableSupplierImpl<>();
    private final ObservableSupplierImpl<Boolean> mIdentityDiscStateSupplier =
            new ObservableSupplierImpl<>();
    private final ObservableSupplier<Boolean> mOmniboxFocusStateSupplier;

    private ObservableSupplierImpl<BottomControlsCoordinator> mBottomControlsCoordinatorSupplier =
            new ObservableSupplierImpl<>();
    private final ObservableSupplierImpl<Tab> mActivityTabSupplier = new ObservableSupplierImpl<>();
    private TabModelSelector mTabModelSelector;
    private TabModelSelectorObserver mTabModelSelectorObserver;
    private ObservableSupplier<TabModelSelector> mTabModelSelectorSupplier;
    private ActivityTabProvider.ActivityTabTabObserver mActivityTabTabObserver;
    private final ActivityTabProvider mActivityTabProvider;
    private final LocationBarModel mLocationBarModel;
    private ObservableSupplier<BookmarkBridge> mBookmarkBridgeSupplier;
    private final Callback<BookmarkBridge> mBookmarkBridgeSupplierObserver;
    private TemplateUrlServiceObserver mTemplateUrlObserver;
    private LocationBar mLocationBar;
    private FindToolbarManager mFindToolbarManager;

    private LayoutManagerImpl mLayoutManager;

    private TabObserver mTabObserver;
    private BookmarkBridge.BookmarkModelObserver mBookmarksObserver;
    private FindToolbarObserver mFindToolbarObserver;

    private @StartSurfaceState int mStartSurfaceState = StartSurfaceState.NOT_SHOWN;

    private LayoutStateProvider mLayoutStateProvider;
    private LayoutStateProvider.LayoutStateObserver mLayoutStateObserver;
    private OneshotSupplier<LayoutStateProvider> mLayoutStateProviderSupplier;
    private CallbackController mCallbackController = new CallbackController();

    private SceneChangeObserver mSceneChangeObserver;
    private final ActionBarDelegate mActionBarDelegate;
    private ActionModeController mActionModeController;
    private final Callback<Boolean> mUrlFocusChangedCallback;
    private final Handler mHandler = new Handler();
    private final AppCompatActivity mActivity;
    private final WindowAndroid mWindowAndroid;
    private final AppMenuDelegate mAppMenuDelegate;
    private final CompositorViewHolder mCompositorViewHolder;
    private final BrowserControlsSizer mBrowserControlsSizer;
    private final FullscreenManager mFullscreenManager;
    private LocationBarFocusScrimHandler mLocationBarFocusHandler;
    private ComponentCallbacks mComponentCallbacks;
    private final LoadProgressCoordinator mProgressBarCoordinator;
    private final ToolbarTabControllerImpl mToolbarTabController;
    private MenuButtonCoordinator mMenuButtonCoordinator;
    private HomepageManager.HomepageStateListener mHomepageStateListener;
    private StatusBarColorController mStatusBarColorController;

    private HomeButtonCoordinator mHomeButtonCoordinator;
    private ToggleTabStackButtonCoordinator mToggleTabStackButtonCoordinator;

    private BrowserStateBrowserControlsVisibilityDelegate mControlsVisibilityDelegate;
    private int mFullscreenFocusToken = TokenHolder.INVALID_TOKEN;
    private int mFullscreenFindInPageToken = TokenHolder.INVALID_TOKEN;
    private int mFullscreenMenuToken = TokenHolder.INVALID_TOKEN;
    private int mFullscreenHighlightToken = TokenHolder.INVALID_TOKEN;

    private boolean mTabRestoreCompleted;


    private boolean mInitializedWithNative;
    private Runnable mOnInitializedRunnable;

    private boolean mShouldUpdateToolbarPrimaryColor = true;
    private int mCurrentThemeColor;

    private int mCurrentOrientation;

    private final Supplier<Boolean> mCanAnimateNativeBrowserControls;

    /**
     * Runnable for the home and search accelerator button when Start Surface home page is enabled.
     */
    private Supplier<Boolean> mShowStartSurfaceSupplier;
    private final ScrimCoordinator mScrimCoordinator;

    private StartSurface mStartSurface;
    private StartSurface.StateObserver mStartSurfaceStateObserver;
    private AppBarLayout.OnOffsetChangedListener mStartSurfaceHeaderOffsetChangeListener;

    private OneshotSupplier<ToolbarIntentMetadata> mIntentMetadataOneshotSupplier;
    private OneshotSupplier<Boolean> mPromoShownOneshotSupplier;
    private OverlayPanelManagerObserver mOverlayPanelManagerObserver;
    private ObservableSupplierImpl<Boolean> mOverlayPanelVisibilitySupplier =
            new ObservableSupplierImpl<>();

    private TabGroupUi mTabGroupUi;

    private static class TabObscuringCallback implements Callback<Boolean> {
        private final TabObscuringHandler mTabObscuringHandler;
        /** A token held while the toolbar/omnibox is obscuring all visible tabs. */
        private int mTabObscuringToken = TokenHolder.INVALID_TOKEN;
        public TabObscuringCallback(TabObscuringHandler handler) {
            mTabObscuringHandler = handler;
        }

        @Override
        public void onResult(Boolean visible) {
            if (visible) {
                // It's possible for the scrim to unfocus and refocus without the
                // visibility actually changing. In this case we have to make sure we
                // unregister the previous token before acquiring a new one.
                int oldToken = mTabObscuringToken;
                mTabObscuringToken = mTabObscuringHandler.obscureAllTabs();
                if (oldToken != TokenHolder.INVALID_TOKEN) {
                    mTabObscuringHandler.unobscureAllTabs(oldToken);
                }
            } else {
                mTabObscuringHandler.unobscureAllTabs(mTabObscuringToken);
                mTabObscuringToken = TokenHolder.INVALID_TOKEN;
            }
        }
    };

    /**
     * Creates a ToolbarManager object.
     *
     * @param activity The Android activity.
     * @param controlsSizer The {@link BrowserControlsSizer} for the activity.
     * @param fullscreenManager The {@link FullscreenManager} for the activity.
     * @param controlContainer The container of the toolbar.
     * @param compositorViewHolder Class that holds a {@link CompositorView}.
     * @param urlFocusChangedCallback The callback to be notified when the URL focus changes.
     * @param topUiThemeColorProvider The ThemeColorProvider object for top UI.
     * @param tabObscuringHandler Delegate object handling obscuring views.
     * @param shareDelegateSupplier Supplier for ShareDelegate.
     * @param identityDiscController The controller that coordinates the state of the identity disc
     * @param buttonDataProviders The list of button data providers for the optional toolbar button
     *         in the browsing mode toolbar, given in precedence order.
     * @param tabProvider The {@link ActivityTabProvider} for accessing current activity tab.
     * @param scrimCoordinator A means of showing the scrim.
     * @param toolbarActionModeCallback Callback that communicates changes in the conceptual mode
     *                                  of toolbar interaction.
     * @param findToolbarManager The manager for the find in page function.
     * @param profileSupplier Supplier of the currently applicable profile.
     * @param bookmarkBridgeSupplier Supplier of the bookmark bridge for the current profile.
     * TODO(https://crbug.com/1084528): Use OneShotSupplier once it is ready.
     * @param layoutStateProviderSupplier Supplier of the {@link LayoutStateProvider}.
     * @param tabModelSelectorSupplier Supplier of the {@link TabModelSelector}.
     * @param startSurfaceSupplier Supplier of the StartSurface.
     * @param omniboxFocusStateSupplier Supplier to access the focus state of the omnibox.
     * @param intentMetadataOneshotSupplier Supplier with info about the launching intent.
     * @param promoShownOneshotSupplier Supplier for whether a promo was shown on startup. Will only
     *                                  be fulfilled when feature TOOLBAR_IPH_ANDROID is enabled.
     * @param windowAndroid The {@link WindowAndroid} associated with the ToolbarManager.
     * @param isInOverviewModeSupplier Supplies whether the app is currently in overview mode.
     * @param isCustomTab Whether the toolbar is for a custom tab.
     * @param modalDialogManagerSupplier Supplies the {@link ModalDialogManager}.
     * @param statusBarColorController The {@link StatusBarColorController} for the app.
     * @param appMenuDelegate Allows interacting with the app menu.
     * @param activityLifecycleDispatcher Allows monitoring the activity lifecycle,
     */
    public ToolbarManager(AppCompatActivity activity, BrowserControlsSizer controlsSizer,
            FullscreenManager fullscreenManager, ToolbarControlContainer controlContainer,
            CompositorViewHolder compositorViewHolder, Callback<Boolean> urlFocusChangedCallback,
            TopUiThemeColorProvider topUiThemeColorProvider,
            TabObscuringHandler tabObscuringHandler,
            ObservableSupplier<ShareDelegate> shareDelegateSupplier,
            IdentityDiscController identityDiscController,
            List<ButtonDataProvider> buttonDataProviders, ActivityTabProvider tabProvider,
            ScrimCoordinator scrimCoordinator, ToolbarActionModeCallback toolbarActionModeCallback,
            FindToolbarManager findToolbarManager, ObservableSupplier<Profile> profileSupplier,
            ObservableSupplier<BookmarkBridge> bookmarkBridgeSupplier,
            @Nullable Supplier<Boolean> canAnimateNativeBrowserControls,
            OneshotSupplier<LayoutStateProvider> layoutStateProviderSupplier,
            OneshotSupplier<AppMenuCoordinator> appMenuCoordinatorSupplier,
            boolean shouldShowUpdateBadge,
            ObservableSupplier<TabModelSelector> tabModelSelectorSupplier,
            OneshotSupplier<StartSurface> startSurfaceSupplier,
            ObservableSupplier<Boolean> omniboxFocusStateSupplier,
            OneshotSupplier<ToolbarIntentMetadata> intentMetadataOneshotSupplier,
            OneshotSupplier<Boolean> promoShownOneshotSupplier, WindowAndroid windowAndroid,
            Supplier<Boolean> isInOverviewModeSupplier, boolean isCustomTab,
            Supplier<ModalDialogManager> modalDialogManagerSupplier,
            StatusBarColorController statusBarColorController, AppMenuDelegate appMenuDelegate,
            ActivityLifecycleDispatcher activityLifecycleDispatcher,
            @NonNull Supplier<Tab> startSurfaceParentTabSupplier) {
        TraceEvent.begin("ToolbarManager.ToolbarManager");
        mActivity = activity;
        mWindowAndroid = windowAndroid;
        mCompositorViewHolder = compositorViewHolder;
        mBrowserControlsSizer = controlsSizer;
        mFullscreenManager = fullscreenManager;
        mActionBarDelegate = new ViewShiftingActionBarDelegate(activity.getSupportActionBar(),
                controlContainer, activity.findViewById(R.id.action_bar_black_background));
        mCanAnimateNativeBrowserControls = canAnimateNativeBrowserControls;
        mScrimCoordinator = scrimCoordinator;
        mTabModelSelectorSupplier = tabModelSelectorSupplier;
        mOmniboxFocusStateSupplier = omniboxFocusStateSupplier;
        mIntentMetadataOneshotSupplier = intentMetadataOneshotSupplier;
        mPromoShownOneshotSupplier = promoShownOneshotSupplier;
        mAppMenuDelegate = appMenuDelegate;
        mStatusBarColorController = statusBarColorController;
        mUrlFocusChangedCallback = urlFocusChangedCallback;

        ToolbarLayout toolbarLayout = mActivity.findViewById(R.id.toolbar);
        NewTabPageDelegate ntpDelegate = createNewTabPageDelegate(toolbarLayout);
        mLocationBarModel = new LocationBarModel(activity, ntpDelegate,
                DomDistillerTabUtils::getFormattedUrlFromOriginalDistillerUrl,
                IncognitoUtils::getNonPrimaryOTRProfileFromWindowAndroid,
                new LocationBarModel.OfflineStatus() {
                    @Override
                    public boolean isShowingTrustedOfflinePage(WebContents webContents) {
                        return OfflinePageUtils.isShowingTrustedOfflinePage(webContents);
                    }

                    @Override
                    public boolean isOfflinePage(Tab tab) {
                        return OfflinePageUtils.isOfflinePage(tab);
                    }
                },
                SearchEngineLogoUtils.getInstance());
        mControlContainer = controlContainer;
        assert mControlContainer != null;

        mBookmarkBridgeSupplier = bookmarkBridgeSupplier;
        // We need to capture a reference to setBookmarkBridge/setCurrentProfile in order to remove
        // them later; there is no guarantee in the JLS that referencing the same method later will
        // reference the same object.
        mBookmarkBridgeSupplierObserver = this::setBookmarkBridge;
        mBookmarkBridgeSupplier.addObserver(mBookmarkBridgeSupplierObserver);

        mLayoutStateProviderSupplier = layoutStateProviderSupplier;
        mLayoutStateProviderSupplier.onAvailable(
                mCallbackController.makeCancelable(this::setLayoutStateProvider));

        mComponentCallbacks = new ComponentCallbacks() {
            @Override
            public void onConfigurationChanged(Configuration configuration) {
                int newOrientation = configuration.orientation;
                if (newOrientation == mCurrentOrientation) {
                    return;
                }
                mCurrentOrientation = newOrientation;
                onOrientationChange(newOrientation);
            }
            @Override
            public void onLowMemory() {}
        };
        mActivity.registerComponentCallbacks(mComponentCallbacks);

        mIncognitoStateProvider = new IncognitoStateProvider();
        mTabCountProvider = new TabCountProvider();
        mTopUiThemeColorProvider = topUiThemeColorProvider;
        mTopUiThemeColorProvider.addThemeColorObserver(this);

        mAppThemeColorProvider = new AppThemeColorProvider(/* context= */ mActivity);
        // Observe tint changes to update sub-components that rely on the tint (crbug.com/1077684).
        mAppThemeColorProvider.addTintObserver(this);
        mCustomTabThemeColorProvider = new SettableThemeColorProvider(/* context= */ mActivity);

        mActivityTabProvider = tabProvider;

        // clang-format off
        mToolbarTabController = new ToolbarTabControllerImpl(mLocationBarModel::getTab,
                () -> mShowStartSurfaceSupplier != null && mShowStartSurfaceSupplier.get(),
                () -> {
                    Profile profile = profileSupplier.get();
                    return profile != null ? TrackerFactory.getTrackerForProfile(profile) : null;
                },
                mBottomControlsCoordinatorSupplier, ToolbarManager::homepageUrl,
                this::updateButtonStatus);
        // clang-format on

        BrowserStateBrowserControlsVisibilityDelegate controlsVisibilityDelegate =
                mBrowserControlsSizer.getBrowserVisibilityDelegate();
        assert controlsVisibilityDelegate != null;
        mControlsVisibilityDelegate = controlsVisibilityDelegate;
        ThemeColorProvider browsingModeThemeColorProvider =
                DeviceFormFactor.isNonMultiDisplayContextOnTablet(mActivity)
                ? mAppThemeColorProvider
                : mTopUiThemeColorProvider;
        ThemeColorProvider overviewModeThemeColorProvider = mAppThemeColorProvider;

        Runnable requestFocusRunnable = compositorViewHolder::requestFocus;
        mMenuButtonCoordinator = new MenuButtonCoordinator(appMenuCoordinatorSupplier,
                mControlsVisibilityDelegate, mWindowAndroid,
                (focus, type)
                        -> setUrlBarFocus(focus, type),
                requestFocusRunnable, shouldShowUpdateBadge, isInOverviewModeSupplier,
                isCustomTab ? mCustomTabThemeColorProvider : browsingModeThemeColorProvider,
                R.id.menu_button_wrapper);
        MenuButtonCoordinator startSurfaceMenuButtonCoordinator = new MenuButtonCoordinator(
                appMenuCoordinatorSupplier, mControlsVisibilityDelegate, mWindowAndroid,
                (focus, type)
                        -> setUrlBarFocus(focus, type),
                requestFocusRunnable, shouldShowUpdateBadge, isInOverviewModeSupplier,
                overviewModeThemeColorProvider, R.id.none);

        boolean isGridTabSwitcherEnabled = TabUiFeatureUtilities.isGridTabSwitcherEnabled();
        boolean isTabToGtsAnimationEnabled = TabUiFeatureUtilities.isTabToGtsAnimationEnabled();
        boolean isStartSurfaceEnabled = StartSurfaceConfiguration.isStartSurfaceEnabled();
        boolean isTabGroupsAndroidContinuationEnabled =
                TabUiFeatureUtilities.isTabGroupsAndroidContinuationEnabled();
        mToolbar = createTopToolbarCoordinator(controlContainer, toolbarLayout, buttonDataProviders,
                browsingModeThemeColorProvider, startSurfaceMenuButtonCoordinator,
                mCompositorViewHolder.getInvalidator(), identityDiscController,
                startSurfaceSupplier, isGridTabSwitcherEnabled, isTabToGtsAnimationEnabled,
                isStartSurfaceEnabled, isTabGroupsAndroidContinuationEnabled);
        mActionModeController =
                new ActionModeController(mActivity, mActionBarDelegate, toolbarActionModeCallback);

        mActionModeController.setTabStripHeight(mToolbar.getTabStripHeight());

        if (toolbarLayout instanceof CustomTabToolbar) {
            CustomTabToolbar customTabToolbar = ((CustomTabToolbar) toolbarLayout);
            mLocationBar = customTabToolbar.createLocationBar(mLocationBarModel,
                    mActionModeController.getActionModeCallback(), modalDialogManagerSupplier);
        } else {
            OverrideUrlLoadingDelegate overrideUrlLoadingDelegate =
                    (url, transition, postDataType, postData, incognito)
                    -> ReturnToChromeExperimentsUtil.handleLoadUrlWithPostDataFromStartSurface(
                            new LoadUrlParams(url, transition | PageTransition.FROM_ADDRESS_BAR),
                            postDataType, postData, incognito, startSurfaceParentTabSupplier.get());
            LocationBarCoordinator locationBarCoordinator = new LocationBarCoordinator(
                    mActivity.findViewById(R.id.location_bar), toolbarLayout, profileSupplier,
                    mLocationBarModel, mActionModeController.getActionModeCallback(),
                    new WindowDelegate(mActivity.getWindow()), windowAndroid, mActivityTabProvider,
                    modalDialogManagerSupplier, shareDelegateSupplier, mIncognitoStateProvider,
                    activityLifecycleDispatcher, overrideUrlLoadingDelegate,
                    new BackKeyBehaviorDelegate() {}, SearchEngineLogoUtils.getInstance());
            toolbarLayout.setLocationBarCoordinator(locationBarCoordinator);
            mLocationBar = locationBarCoordinator;
        }

        if (mLocationBar.getFakeboxDelegate() != null) {
            mLocationBar.getFakeboxDelegate().addUrlFocusChangeListener(this);
        }
        Runnable clickDelegate =
                () -> setUrlBarFocus(false, OmniboxFocusReason.UNFOCUS);
        View scrimTarget = mCompositorViewHolder;
        mLocationBarFocusHandler = new LocationBarFocusScrimHandler(scrimCoordinator,
                new TabObscuringCallback(tabObscuringHandler), /* context= */ activity,
                mLocationBarModel, clickDelegate, scrimTarget);
        if (mLocationBar.getFakeboxDelegate() != null) {
            mLocationBar.getFakeboxDelegate().addUrlFocusChangeListener(mLocationBarFocusHandler);
        }

        mProgressBarCoordinator = new LoadProgressCoordinator(
                mActivityTabSupplier, mToolbar.getProgressBar(), isStartSurfaceEnabled);
        mToolbar.addUrlExpansionObserver(statusBarColorController);

        mActivityTabTabObserver = new ActivityTabProvider.ActivityTabTabObserver(
                mActivityTabProvider) {
            @Override
            public void onObservingDifferentTab(Tab tab, boolean hint) {
                mActivityTabSupplier.set(tab);

                // ActivityTabProvider will null out the tab passed to onObservingDifferentTab when
                // the tab is non-interactive (e.g. when entering the TabSwitcher or Start surface).
                // In those cases we actually still want to use the most recently selected tab, but
                // will update the URL.
                if (tab == null) {
                    mLocationBarModel.notifyUrlChanged();
                    return;
                }

                refreshSelectedTab(tab);
                onTabOrModelChanged();
                maybeTriggerCacheRefreshForZeroSuggest(tab.getUrl());
            }

            @Override
            public void onPageLoadFinished(Tab tab, GURL url) {
                maybeTriggerCacheRefreshForZeroSuggest(url);
            }

            /**
             * Trigger ZeroSuggest cache refresh in case user is accessing a new tab page.
             * Avoid issuing multiple concurrent server requests for the same event to
             * reduce server pressure.
             */
            private void maybeTriggerCacheRefreshForZeroSuggest(GURL url) {
                if (url != null && UrlUtilities.isNTPUrl(url)) {
                    mLocationBarModel.notifyZeroSuggestRefresh();
                }
            }

            @Override
            public void onSSLStateUpdated(Tab tab) {
                if (mLocationBarModel.getTab() == null) return;

                assert tab == mLocationBarModel.getTab();
                mLocationBarModel.notifySecurityStateChanged();
                mLocationBarModel.notifyUrlChanged();
            }

            @Override
            public void onTitleUpdated(Tab tab) {
                mLocationBarModel.notifyTitleChanged();
            }

            @Override
            public void onUrlUpdated(Tab tab) {
                // Update the SSL security state as a result of this notification as it will
                // sometimes be the only update we receive.
                updateTabLoadingState(true);

                // A URL update is a decent enough indicator that the toolbar widget is in
                // a stable state to capture its bitmap for use in fullscreen.
                mControlContainer.setReadyForBitmapCapture(true);
            }

            @Override
            public void onShown(Tab tab, @TabSelectionType int type) {
                if (TextUtils.isEmpty(tab.getUrlString())) return;
                mControlContainer.setReadyForBitmapCapture(true);
            }

            @Override
            public void onCrash(Tab tab) {
                updateTabLoadingState(false);
                updateButtonStatus();
            }

            @Override
            public void onLoadStarted(Tab tab, boolean toDifferentDocument) {
                if (!toDifferentDocument) return;
                updateButtonStatus();
                updateTabLoadingState(true);
            }

            @Override
            public void onLoadStopped(Tab tab, boolean toDifferentDocument) {
                if (!toDifferentDocument) return;
                updateTabLoadingState(true);
            }

            @Override
            public void onContentChanged(Tab tab) {
                checkIfNtpLoaded();
                mToolbar.onTabContentViewChanged();
                if (shouldShowCursorInLocationBar()) {
                    mLocationBar.showUrlBarCursorWithoutFocusAnimations();
                }
                // Paint preview status might have been changed. Update the omnibox chip.
                mLocationBarModel.notifySecurityStateChanged();
            }

            @Override
            public void onWebContentsSwapped(Tab tab, boolean didStartLoad, boolean didFinishLoad) {
                if (!didStartLoad) return;
                mLocationBarModel.notifyUrlChanged();
                mLocationBarModel.notifySecurityStateChanged();
            }

            @Override
            public void onLoadUrl(Tab tab, LoadUrlParams params, int loadType) {
                NewTabPage ntp = getNewTabPageForCurrentTab();
                if (ntp == null) return;
                if (!UrlUtilities.isNTPUrl(params.getUrl())
                        && loadType != TabLoadStatus.PAGE_LOAD_FAILED) {
                    ntp.setUrlFocusAnimationsDisabled(true);
                    onTabOrModelChanged();
                }
            }

            private boolean hasPendingNonNtpNavigation(Tab tab) {
                WebContents webContents = tab.getWebContents();
                if (webContents == null) return false;

                NavigationController navigationController = webContents.getNavigationController();
                if (navigationController == null) return false;

                NavigationEntry pendingEntry = navigationController.getPendingEntry();
                if (pendingEntry == null) return false;

                return !UrlUtilities.isNTPUrl(pendingEntry.getUrl());
            }

            @Override
            public void onDidStartNavigation(Tab tab, NavigationHandle navigation) {
                if (!navigation.isInMainFrame()) return;
                // Update URL as soon as it becomes available when it's a new tab.
                // But we want to update only when it's a new tab. So we check whether the current
                // navigation entry is initial, meaning whether it has the same target URL as the
                // initial URL of the tab.
                if (tab.getWebContents() != null
                        && tab.getWebContents().getNavigationController() != null
                        && tab.getWebContents().getNavigationController().isInitialNavigation()) {
                    mLocationBarModel.notifyUrlChanged();
                }
            }

            @Override
            public void onDidFinishNavigation(Tab tab, NavigationHandle navigation) {
                if (navigation.hasCommitted() && navigation.isInMainFrame()
                        && !navigation.isSameDocument()) {
                    mToolbar.onNavigatedToDifferentPage();
                }

                if (navigation.hasCommitted() && Previews.isPreview(tab)) {
                    // Some previews are not fully decided until the page commits. If this
                    // is a preview, update the security icon which will also update the verbose
                    // status view to make sure the "Lite" badge is displayed.
                    mLocationBarModel.notifySecurityStateChanged();
                    PreviewsUma.recordLitePageAtCommit(
                            PreviewsAndroidBridge.getInstance().getPreviewsType(
                                    tab.getWebContents()),
                            navigation.isInMainFrame());
                }

                // If the load failed due to a different navigation, there is no need to reset the
                // location bar animations.
                if (navigation.errorCode() != NetError.OK && navigation.isInMainFrame()
                        && !hasPendingNonNtpNavigation(tab)) {
                    NewTabPage ntp = getNewTabPageForCurrentTab();
                    if (ntp == null) return;

                    ntp.setUrlFocusAnimationsDisabled(false);
                    onTabOrModelChanged();
                }
            }

            @Override
            public void onNavigationEntriesDeleted(Tab tab) {
                if (tab == mLocationBarModel.getTab()) {
                    updateButtonStatus();
                }
            }
        };

        mTabModelSelectorObserver = new TabModelSelectorObserver() {
            @Override
            public void onTabStateInitialized() {
                mTabRestoreCompleted = true;
                handleTabRestoreCompleted();
            }

            @Override
            public void onTabModelSelected(TabModel newModel, TabModel oldModel) {
                if (mTabModelSelector != null) {
                    refreshSelectedTab(mTabModelSelector.getCurrentTab());
                }
            }
        };

        mBookmarksObserver = new BookmarkBridge.BookmarkModelObserver() {
            @Override
            public void bookmarkModelChanged() {
                updateBookmarkButtonStatus();
            }
        };

        mBrowserControlsObserver = new BrowserControlsStateProvider.Observer() {
            private OnLayoutChangeListener mLayoutChangeListener;
            @Override
            public void onControlsOffsetChanged(int topOffset, int topControlsMinHeightOffset,
                    int bottomOffset, int bottomControlsMinHeightOffset, boolean needsAnimate) {
                // Controls need to be offset to match the composited layer, which is
                // anchored below the minimum height. In other words, the top of the toolbar
                // composited layer is anchored at the bottom of the minimum height.
                // https://crbug.com/1157859 wait until the background is cleared so that
                // the height won't be measured by the background image.
                if (mControlContainer.getBackground() == null) {
                    setControlContainerTopMargin(getToolbarExtraYOffset());
                } else if (mLayoutChangeListener == null) {
                    mLayoutChangeListener = (view, left, top, right, bottom, oldLeft, oldTop,
                            oldRight, oldBottom) -> {
                        if (mControlContainer.getBackground() == null) {
                            setControlContainerTopMargin(getToolbarExtraYOffset());
                            mControlContainer.removeOnLayoutChangeListener(mLayoutChangeListener);
                            mLayoutChangeListener = null;
                        }
                    };
                    mControlContainer.addOnLayoutChangeListener(mLayoutChangeListener);
                }
            }
        };
        mBrowserControlsSizer.addObserver(mBrowserControlsObserver);

        mFullscreenObserver = new FullscreenManager.Observer() {
            @Override
            public void onEnterFullscreen(Tab tab, FullscreenOptions options) {
                if (mFindToolbarManager != null) mFindToolbarManager.hideToolbar();
            }
        };
        mFullscreenManager.addObserver(mFullscreenObserver);

        mFindToolbarObserver = new FindToolbarObserver() {
            @Override
            public void onFindToolbarShown() {
                mToolbar.handleFindLocationBarStateChange(true);
                if (mControlsVisibilityDelegate != null) {
                    mFullscreenFindInPageToken =
                            mControlsVisibilityDelegate.showControlsPersistentAndClearOldToken(
                                    mFullscreenFindInPageToken);
                }
            }

            @Override
            public void onFindToolbarHidden() {
                mToolbar.handleFindLocationBarStateChange(false);
                if (mControlsVisibilityDelegate != null) {
                    mControlsVisibilityDelegate.releasePersistentShowingToken(
                            mFullscreenFindInPageToken);
                }
            }
        };

        mLayoutStateObserver = new LayoutStateProvider.LayoutStateObserver() {
            @Override
            public void onStartedShowing(@LayoutType int layoutType, boolean showToolbar) {
                if (layoutType == LayoutType.TAB_SWITCHER) {
                    mLocationBarModel.setIsShowingTabSwitcher(true);
                    mToolbar.setTabSwitcherMode(true, showToolbar, false);
                    updateButtonStatus();
                    if (mLocationBarModel.shouldShowLocationBarInOverviewMode()) {
                        assert mLocationBar instanceof LocationBarCoordinator;
                        ((LocationBarCoordinator) mLocationBar).startAutocompletePrefetch();
                    }
                }
            }

            @Override
            public void onStartedHiding(
                    @LayoutType int layoutType, boolean showToolbar, boolean delayAnimation) {
                if (layoutType == LayoutType.TAB_SWITCHER) {
                    mLocationBarModel.setIsShowingTabSwitcher(false);
                    mToolbar.setTabSwitcherMode(false, showToolbar, delayAnimation);
                    updateButtonStatus();
                }
            }

            @Override
            public void onFinishedHiding(@LayoutType int layoutType) {
                if (layoutType == LayoutType.TAB_SWITCHER) {
                    mToolbar.onTabSwitcherTransitionFinished();
                    updateButtonStatus();
                }
            }
        };

        mSceneChangeObserver = new SceneChangeObserver() {
            @Override
            public void onTabSelectionHinted(int tabId) {
                Tab tab = mTabModelSelector != null ? mTabModelSelector.getTabById(tabId) : null;
                refreshSelectedTab(tab);

                if (mToolbar.setForceTextureCapture(true)) {
                    mControlContainer.invalidateBitmap();
                }
            }

            @Override
            public void onSceneChange(Layout layout) {
                mToolbar.setContentAttached(layout.shouldDisplayContentOverlay());
                maybeFocusOmnibox(layout, mActivityTabProvider.get());
            }
        };

        mOverlayPanelManagerObserver = new OverlayPanelManagerObserver() {
            @Override
            public void onOverlayPanelShown() {
                mOverlayPanelVisibilitySupplier.set(true);
            }

            @Override
            public void onOverlayPanelHidden() {
                mOverlayPanelVisibilitySupplier.set(false);
            }
        };

        mToolbar.setTabCountProvider(mTabCountProvider);
        mToolbar.setIncognitoStateProvider(mIncognitoStateProvider);

        ChromeAccessibilityUtil.get().addObserver(this);
        mLocationBarModel.setShouldShowOmniboxInOverviewMode(
                StartSurfaceConfiguration.isStartSurfaceEnabled());

        mFindToolbarManager = findToolbarManager;
        mFindToolbarManager.addObserver(mFindToolbarObserver);

        startSurfaceSupplier.onAvailable(mCallbackController.makeCancelable((startSurface) -> {
            mStartSurface = startSurface;
            mStartSurfaceStateObserver = (newState, shouldShowToolbar) -> {
                assert StartSurfaceConfiguration.isStartSurfaceEnabled();
                mStartSurfaceState = newState;
                mToolbar.updateStartSurfaceToolbarState(newState, shouldShowToolbar);
            };
            mStartSurface.addStateChangeObserver(mStartSurfaceStateObserver);

            mStartSurfaceHeaderOffsetChangeListener = (appbarLayout, verticalOffset) -> {
                assert StartSurfaceConfiguration.isStartSurfaceEnabled();
                mToolbar.onStartSurfaceHeaderOffsetChanged(verticalOffset);
            };
            mStartSurface.addHeaderOffsetChangeListener(mStartSurfaceHeaderOffsetChangeListener);
        }));

        TraceEvent.end("ToolbarManager.ToolbarManager");
    }

    /**
     * May set Omnibox focused if the Tab has the flag to require focusing the Omnibox.
     */
    private void maybeFocusOmnibox(Layout layout, Tab tab) {
        if (StartSurfaceConfiguration.consumeFocusOnOmnibox(tab, layout)) {
            if (mLocationBar.getFakeboxDelegate() == null
                    || mLocationBar.getFakeboxDelegate().isUrlBarFocused()) {
                return;
            }
            setUrlBarFocus(true, OmniboxFocusReason.FOCUS_ON_NEW_TAB);
            if (shouldShowCursorInLocationBar()) {
                mLocationBar.showUrlBarCursorWithoutFocusAnimations();
            }
            updateButtonStatus();
        }
    }

    private TopToolbarCoordinator createTopToolbarCoordinator(
            ToolbarControlContainer controlContainer, ToolbarLayout toolbarLayout,
            List<ButtonDataProvider> buttonDataProviders,
            ThemeColorProvider browsingModeThemeColorProvider,
            MenuButtonCoordinator startSurfaceMenuButtonCoordinator, Invalidator invalidator,
            IdentityDiscController identityDiscController,
            OneshotSupplier<StartSurface> startSurfaceSupplier, boolean isGridTabSwitcherEnabled,
            boolean isTabToGtsAnimationEnabled, boolean isStartSurfaceEnabled,
            boolean isTabGroupsAndroidContinuationEnabled) {
        // clang-format off
        TopToolbarCoordinator toolbar = new TopToolbarCoordinator(controlContainer, toolbarLayout,
                mLocationBarModel, mToolbarTabController,
                new UserEducationHelper(mActivity, mHandler, TrackerFactory::getTrackerForProfile),
                buttonDataProviders, mLayoutStateProviderSupplier, browsingModeThemeColorProvider,
                mAppThemeColorProvider, mMenuButtonCoordinator, startSurfaceMenuButtonCoordinator,
                mMenuButtonCoordinator.getMenuButtonHelperSupplier(), mTabModelSelectorSupplier,
                mHomepageEnabledSupplier, mStartSurfaceAsHomepageSupplier,
                mHomepageManagedByPolicySupplier,
                mIdentityDiscStateSupplier, (client) -> {
                    if (invalidator != null) {
                        invalidator.invalidate(client);
                    } else {
                        client.run();
                    }
                }, () -> identityDiscController.getForStartSurface(mStartSurfaceState),
                startSurfaceSupplier, mCompositorViewHolder::getResourceManager,
                VrModuleProvider.getDelegate()::isInVr, isGridTabSwitcherEnabled,
                isTabToGtsAnimationEnabled, isStartSurfaceEnabled,
                isTabGroupsAndroidContinuationEnabled);
        // clang-format on
        mHomepageStateListener = () -> {
            mHomepageEnabledSupplier.set(HomepageManager.isHomepageEnabled());
            // Whether to show start surface as homepage is affected by whether homepage URI is
            // customized. So we add a supplier to observe homepage URI change.
            mStartSurfaceAsHomepageSupplier.set(
                    ReturnToChromeExperimentsUtil.shouldShowStartSurfaceAsTheHomePage());
            mHomepageManagedByPolicySupplier.set(HomepagePolicyManager.isHomepageManagedByPolicy());
        };
        HomepageManager.getInstance().addListener(mHomepageStateListener);
        mHomepageStateListener.onHomepageStateUpdated();

        if (toolbarLayout instanceof ToolbarPhone
                && StartSurfaceConfiguration.isStartSurfaceEnabled()) {
            identityDiscController.addObserver(
                    (canShowHint) -> mIdentityDiscStateSupplier.set(canShowHint));
        }
        HomeButton homeButton = toolbarLayout.getHomeButton();
        if (homeButton != null) {
            homeButton.init(mHomepageEnabledSupplier, HomepageManager.getInstance()::onMenuClick,
                    mHomepageManagedByPolicySupplier);
        }
        return toolbar;
    }

    // Base abstract implementation of NewTabPageDelegate for phone/table toolbar layout.
    private abstract class ToolbarNtpDelegate implements NewTabPageDelegate {
        protected NewTabPage mVisibleNtp;

        @Override
        public boolean wasShowingNtp() {
            return mVisibleNtp != null;
        }

        @Override
        public boolean isCurrentlyVisible() {
            return getNewTabPageForCurrentTab() != null;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent ev) {
            assert mVisibleNtp != null;
            // No null check -- the toolbar should not be moved if we are not on an NTP.
            return mVisibleNtp.getView().dispatchTouchEvent(ev);
        }

        @Override
        public boolean isLocationBarShown() {
            // Without this check, ToolbarPhone#computeVisualState may return
            // VisualState.NEW_TAB_NORMAL even if it's in start surface homepage, which leads
            // ToolbarPhone#getToolbarColorForVisualState to return transparent color.
            if (StartSurfaceConfiguration.isStartSurfaceEnabled()
                    && mStartSurfaceState == StartSurfaceState.SHOWN_HOMEPAGE) {
                return false;
            }
            NewTabPage ntp = getNewTabPageForCurrentTab();
            return ntp != null && ntp.isLocationBarShownInNTP();
        }

        @Override
        public boolean transitioningAwayFromLocationBar() {
            return mVisibleNtp != null && mVisibleNtp.isLocationBarShownInNTP()
                    && !isLocationBarShown();
        }

        @Override
        public void setSearchBoxScrollListener(Callback<Float> scrollCallback) {
            NewTabPage newVisibleNtp = getNewTabPageForCurrentTab();
            if (mVisibleNtp != null) mVisibleNtp.setSearchBoxScrollListener(null);
            mVisibleNtp = newVisibleNtp;
            if (mVisibleNtp != null && shouldUpdateListener()) {
                mVisibleNtp.setSearchBoxScrollListener(
                        (fraction) -> scrollCallback.onResult(fraction));
            }
        }

        // Boolean predicate that tells if the NewTabPage.OnSearchBoxScrollListener
        // should be updated or not
        protected abstract boolean shouldUpdateListener();

        @Override
        public void getSearchBoxBounds(Rect bounds, Point translation) {
            assert getNewTabPageForCurrentTab() != null;
            getNewTabPageForCurrentTab().getSearchBoxBounds(bounds, translation);
        }

        @Override
        public void setSearchBoxBackground(Drawable drawable) {
            assert getNewTabPageForCurrentTab() != null;
            getNewTabPageForCurrentTab().setSearchBoxBackground(drawable);
        }

        @Override
        public void setSearchBoxAlpha(float alpha) {
            assert getNewTabPageForCurrentTab() != null;
            getNewTabPageForCurrentTab().setSearchBoxAlpha(alpha);
        }

        @Override
        public void setSearchProviderLogoAlpha(float alpha) {
            assert getNewTabPageForCurrentTab() != null;
            getNewTabPageForCurrentTab().setSearchProviderLogoAlpha(alpha);
        }

        @Override
        public void setUrlFocusChangeAnimationPercent(float fraction) {
            NewTabPage ntp = getNewTabPageForCurrentTab();
            if (ntp != null) ntp.setUrlFocusChangeAnimationPercent(fraction);
        }
    }

    private NewTabPageDelegate createNewTabPageDelegate(ToolbarLayout toolbarLayout) {
        if (toolbarLayout instanceof ToolbarPhone) {
            return new ToolbarNtpDelegate() {
                @Override
                protected boolean shouldUpdateListener() {
                    return mVisibleNtp.isLocationBarShownInNTP();
                }
            };
        } else if (toolbarLayout instanceof ToolbarTablet) {
            return new ToolbarNtpDelegate() {
                @Override
                public void setSearchBoxScrollListener(Callback<Float> scrollCallback) {
                    if (mVisibleNtp == getNewTabPageForCurrentTab()) return;
                    super.setSearchBoxScrollListener(scrollCallback);
                }

                @Override
                protected boolean shouldUpdateListener() {
                    return true;
                }
            };
        }
        return NewTabPageDelegate.EMPTY;
    }

    private NewTabPage getNewTabPageForCurrentTab() {
        if (mLocationBarModel.hasTab()) {
            NativePage nativePage = mLocationBarModel.getTab().getNativePage();
            if (nativePage instanceof NewTabPage) return (NewTabPage) nativePage;
        }
        return null;
    }

    /**
     * Called when the contextual action bar's visibility has changed (i.e. the widget shown
     * when you can copy/paste text after long press).
     * @param visible Whether the contextual action bar is now visible.
     */
    public void onActionBarVisibilityChanged(boolean visible) {
        ActionBar actionBar = mActionBarDelegate.getSupportActionBar();
        if (!visible && actionBar != null) actionBar.hide();
        if (DeviceFormFactor.isNonMultiDisplayContextOnTablet(mActivity)) {
            if (visible) {
                mActionModeController.startShowAnimation();
            } else {
                mActionModeController.startHideAnimation();
            }
        }
    }

    /**
     * @return  Whether the UrlBar currently has focus.
     */
    public boolean isUrlBarFocused() {
        if (mLocationBar.getFakeboxDelegate() == null) {
            return false;
        }
        return mLocationBar.getFakeboxDelegate().isUrlBarFocused();
    }

    /**
     * Enable the bottom controls.
     */
    public void enableBottomControls() {
        View root = ((ViewStub) mActivity.findViewById(R.id.bottom_controls_stub)).inflate();
        mTabGroupUi = TabManagementModuleProvider.getDelegate().createTabGroupUi(
                root.findViewById(R.id.bottom_container_slot), mAppThemeColorProvider,
                mScrimCoordinator, mOmniboxFocusStateSupplier);
        mBottomControlsCoordinatorSupplier.set(
                new BottomControlsCoordinator(mActivity, mWindowAndroid, mLayoutManager,
                        mCompositorViewHolder.getResourceManager(), mBrowserControlsSizer,
                        mFullscreenManager, (ScrollingBottomViewResourceFrameLayout) root,
                        mAppThemeColorProvider, mTabGroupUi, mOverlayPanelVisibilitySupplier));
    }

    /**
     * TODO(https://crbug.com/1164216): Remove this getter in favor of extracting tab group
     * feature details from ChromeTabbedActivity directly.
     * @return The coordinator for the tab group UI if it exists.
     */
    public TabGroupUi getTabGroupUi() {
        return mTabGroupUi;
    }

    /**
     * Initialize the manager with the components that had native initialization dependencies.
     * <p>
     * Calling this must occur after the native library have completely loaded.
     *
     * @param layoutManager A {@link LayoutManagerImpl} instance used to watch for scene
     *                      changes.
     * @param tabSwitcherClickHandler The {@link OnClickListener} for the tab switcher button.
     * @param newTabClickHandler The {@link OnClickListener} for the new tab button.
     * @param bookmarkClickHandler The {@link OnClickListener} for the bookmark button.
     * @param customTabsBackClickHandler The {@link OnClickListener} for the custom tabs back
     *         button.
     * @param showStartSurfaceSupplier Supplies if we should show the start surface.
     */
    public void initializeWithNative(LayoutManagerImpl layoutManager,
            OnClickListener tabSwitcherClickHandler, OnClickListener newTabClickHandler,
            OnClickListener bookmarkClickHandler, OnClickListener customTabsBackClickHandler,
            Supplier<Boolean> showStartSurfaceSupplier) {
        TraceEvent.begin("ToolbarManager.initializeWithNative");
        assert !mInitializedWithNative;
        assert mTabModelSelectorSupplier.get() != null;

        mTabModelSelector = mTabModelSelectorSupplier.get();
        mShowStartSurfaceSupplier = showStartSurfaceSupplier;

        OnLongClickListener tabSwitcherLongClickHandler =
                TabSwitcherActionMenuCoordinator.createOnLongClickListener(
                        (id) -> mAppMenuDelegate.onOptionsItemSelected(id, null));

        mToolbar.initializeWithNative(layoutManager::requestUpdate, tabSwitcherClickHandler,
                tabSwitcherLongClickHandler, newTabClickHandler, bookmarkClickHandler,
                customTabsBackClickHandler, layoutManager, mActivityTabSupplier,
                mBrowserControlsSizer, mTopUiThemeColorProvider);

        mToolbar.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            @Override
            public void onViewDetachedFromWindow(View v) {}

            @Override
            public void onViewAttachedToWindow(View v) {
                // As we have only just registered for notifications, any that were sent prior
                // to this may have been missed. Calling refreshSelectedTab in case we missed
                // the initial selection notification.
                refreshSelectedTab(mActivityTabProvider.get());
            }
        });

        mLocationBarModel.initializeWithNative();

        if (layoutManager != null) {
            mLayoutManager = layoutManager;
            mLayoutManager.addSceneChangeObserver(mSceneChangeObserver);
            mLayoutManager.getOverlayPanelManager().addObserver(mOverlayPanelManagerObserver);
        }

        // TODO(https://crbug.com/1086676, pnoland): Remove this by having MBC listen for native
        // init directly.
        mMenuButtonCoordinator.onNativeInitialized();

        TemplateUrlServiceFactory.get().runWhenLoaded(this::registerTemplateUrlObserver);
        mInitializedWithNative = true;
        mTabModelSelector.addObserver(mTabModelSelectorObserver);
        refreshSelectedTab(mActivityTabProvider.get());
        if (mTabModelSelector.isTabStateInitialized()) mTabRestoreCompleted = true;
        handleTabRestoreCompleted();
        mTabCountProvider.setTabModelSelector(mTabModelSelector);
        mIncognitoStateProvider.setTabModelSelector(mTabModelSelector);
        mAppThemeColorProvider.setIncognitoStateProvider(mIncognitoStateProvider);

        if (mOnInitializedRunnable != null) {
            mOnInitializedRunnable.run();
            mOnInitializedRunnable = null;
        }

        // Allow bitmap capturing once everything has been initialized.
        Tab currentTab = mTabModelSelector.getCurrentTab();
        if (currentTab != null && currentTab.getWebContents() != null
                && !TextUtils.isEmpty(currentTab.getUrlString())) {
            mControlContainer.setReadyForBitmapCapture(true);
        }
        maybeFocusOmnibox(mLayoutManager.getActiveLayout(), currentTab);

        if (ChromeFeatureList.isEnabled(ChromeFeatureList.TOOLBAR_IPH_ANDROID)) {
            UserEducationHelper userEducationHelper = new UserEducationHelper(
                    mActivity, mHandler, TrackerFactory::getTrackerForProfile);
            Tracker tracker =
                    TrackerFactory.getTrackerForProfile(Profile.getLastUsedRegularProfile());
            View homeButton = mControlContainer.findViewById(R.id.home_button);
            mHomeButtonCoordinator = new HomeButtonCoordinator(mActivity, homeButton,
                    userEducationHelper, mIncognitoStateProvider::isIncognitoSelected,
                    mIntentMetadataOneshotSupplier, mPromoShownOneshotSupplier,
                    HomepageManager::isHomepageNonNtp, FeedFeatures::isFeedEnabled,
                    mActivityTabSupplier, tracker);
            ToggleTabStackButton toggleTabStackButton =
                    mControlContainer.findViewById(R.id.tab_switcher_button);
            mToggleTabStackButtonCoordinator = new ToggleTabStackButtonCoordinator(mActivity,
                    toggleTabStackButton, userEducationHelper,
                    mIncognitoStateProvider::isIncognitoSelected, mIntentMetadataOneshotSupplier,
                    mPromoShownOneshotSupplier, mLayoutStateProviderSupplier,
                    mToolbar::setNewTabButtonHighlight, mActivityTabSupplier, tracker);
        }
        mActivityTabSupplier.set(mActivityTabProvider.get());
        TraceEvent.end("ToolbarManager.initializeWithNative");
    }

    /**
     * @return The toolbar interface that this manager handles.
     */
    public Toolbar getToolbar() {
        return mToolbar;
    }

    @Override
    public @Nullable View getMenuButtonView() {
        return mMenuButtonCoordinator.getMenuButton().getImageButton();
    }

    /**
     * TODO(twellington): Try to remove this method. It's only used to return an in-product help
     *                    bubble anchor view... which should be moved out of tab and perhaps into
     *                    the status bar icon component.
     * @return The view containing the security icon.
     */
    public View getSecurityIconView() {
        return mLocationBar.getSecurityIconView();
    }

    /**
     * Adds a custom action button to the {@link Toolbar}, if it is supported.
     * @param drawable The {@link Drawable} to use as the background for the button.
     * @param description The content description for the custom action button.
     * @param listener The {@link OnClickListener} to use for clicks to the button.
     * @see #updateCustomActionButton
     */
    public void addCustomActionButton(
            Drawable drawable, String description, OnClickListener listener) {
        mToolbar.addCustomActionButton(drawable, description, listener);
    }

    /**
     * Updates the visual appearance of a custom action button in the {@link Toolbar},
     * if it is supported.
     * @param index The index of the button to update.
     * @param drawable The {@link Drawable} to use as the background for the button.
     * @param description The content description for the custom action button.
     * @see #addCustomActionButton
     */
    public void updateCustomActionButton(int index, Drawable drawable, String description) {
        mToolbar.updateCustomActionButton(index, drawable, description);
    }

    /**
     * Call to tear down all of the toolbar dependencies.
     */
    public void destroy() {
        if (mInitializedWithNative) {
            mFindToolbarManager.removeObserver(mFindToolbarObserver);
        }
        if (mTabModelSelectorSupplier != null) {
            mTabModelSelectorSupplier = null;
        }
        if (mTabModelSelector != null) {
            mTabModelSelector.removeObserver(mTabModelSelectorObserver);
        }
        if (mBookmarkBridgeSupplier != null) {
            BookmarkBridge bridge = mBookmarkBridgeSupplier.get();
            if (bridge != null) bridge.removeObserver(mBookmarksObserver);

            mBookmarkBridgeSupplier.removeObserver(mBookmarkBridgeSupplierObserver);
            mBookmarkBridgeSupplier = null;
        }
        if (mTemplateUrlObserver != null) {
            TemplateUrlServiceFactory.get().removeObserver(mTemplateUrlObserver);
            mTemplateUrlObserver = null;
        }
        if (mLayoutStateProvider != null) {
            mLayoutStateProvider.removeObserver(mLayoutStateObserver);
            mLayoutStateProvider = null;
        }

        if (mLayoutStateProviderSupplier != null) {
            mLayoutStateProviderSupplier = null;
        }

        if (mLayoutManager != null) {
            mLayoutManager.removeSceneChangeObserver(mSceneChangeObserver);
            mLayoutManager.getOverlayPanelManager().removeObserver(mOverlayPanelManagerObserver);
            mLayoutManager = null;
        }

        HomepageManager.getInstance().removeListener(mHomepageStateListener);

        if (mBottomControlsCoordinatorSupplier.get() != null) {
            mBottomControlsCoordinatorSupplier.get().destroy();
            mBottomControlsCoordinatorSupplier = null;
        }

        mToolbar.removeUrlExpansionObserver(mStatusBarColorController);
        mToolbar.destroy();

        if (mTabObserver != null) {
            Tab currentTab = mLocationBarModel.getTab();
            if (currentTab != null) currentTab.removeObserver(mTabObserver);
            mTabObserver = null;
        }

        mIncognitoStateProvider.destroy();
        mTabCountProvider.destroy();

        mLocationBarModel.destroy();
        mHandler.removeCallbacksAndMessages(null); // Cancel delayed tasks.
        mBrowserControlsSizer.removeObserver(mBrowserControlsObserver);
        mFullscreenManager.removeObserver(mFullscreenObserver);

        if (mTopUiThemeColorProvider != null) {
            mTopUiThemeColorProvider.removeThemeColorObserver(this);
        }

        if (mAppThemeColorProvider != null) {
            mAppThemeColorProvider.removeTintObserver(this);
            mAppThemeColorProvider.destroy();
            mAppThemeColorProvider = null;
        }

        if (mActivityTabTabObserver != null) {
            mActivityTabTabObserver.destroy();
            mActivityTabTabObserver = null;
        }

        if (mProgressBarCoordinator != null) mProgressBarCoordinator.destroy();

        if (mFindToolbarManager != null) {
            mFindToolbarManager.removeObserver(mFindToolbarObserver);
            mFindToolbarManager = null;
        }

        if (mMenuButtonCoordinator != null) {
            mMenuButtonCoordinator.destroy();
            mMenuButtonCoordinator = null;
        }

        if (mHomeButtonCoordinator != null) {
            mHomeButtonCoordinator.destroy();
            mHomeButtonCoordinator = null;
        }
        if (mToggleTabStackButtonCoordinator != null) {
            mToggleTabStackButtonCoordinator.destroy();
            mToggleTabStackButtonCoordinator = null;
        }

        if (mCallbackController != null) {
            mCallbackController.destroy();
            mCallbackController = null;
        }

        if (mStartSurface != null) {
            mStartSurface.removeStateChangeObserver(mStartSurfaceStateObserver);
            mStartSurface.removeHeaderOffsetChangeListener(mStartSurfaceHeaderOffsetChangeListener);
            mStartSurface = null;
            mStartSurfaceStateObserver = null;
            mStartSurfaceHeaderOffsetChangeListener = null;
        }

        mActivity.unregisterComponentCallbacks(mComponentCallbacks);
        mComponentCallbacks = null;
        ChromeAccessibilityUtil.get().removeObserver(this);
    }

    /**
     * Called when the orientation of the activity has changed.
     */
    private void onOrientationChange(int newOrientation) {
        if (mActionModeController != null) mActionModeController.showControlsOnOrientationChange();
    }

    @Override
    public void onAccessibilityModeChanged(boolean enabled) {
        mToolbar.onAccessibilityStatusChanged(enabled);
    }

    @VisibleForTesting
    static String homepageUrl() {
        String homePageUrl = HomepageManager.getHomepageUri();
        if (TextUtils.isEmpty(homePageUrl)) homePageUrl = UrlConstants.NTP_URL;
        return homePageUrl;
    }

    private void registerTemplateUrlObserver() {
        final TemplateUrlService templateUrlService = TemplateUrlServiceFactory.get();
        assert mTemplateUrlObserver == null;
        mTemplateUrlObserver = new TemplateUrlServiceObserver() {
            private TemplateUrl mSearchEngine =
                    templateUrlService.getDefaultSearchEngineTemplateUrl();

            @Override
            public void onTemplateURLServiceChanged() {
                TemplateUrl searchEngine = templateUrlService.getDefaultSearchEngineTemplateUrl();
                if ((mSearchEngine == null && searchEngine == null)
                        || (mSearchEngine != null && mSearchEngine.equals(searchEngine))) {
                    return;
                }

                mSearchEngine = searchEngine;
                mToolbar.onDefaultSearchEngineChanged();
            }
        };
        templateUrlService.addObserver(mTemplateUrlObserver);
    }

    private void handleTabRestoreCompleted() {
        if (!mTabRestoreCompleted || !mInitializedWithNative) return;
        mToolbar.onStateRestored();
    }

    // TODO(https://crbug.com/865801): remove the below two methods if possible.
    public boolean back() {
        return mToolbarTabController.back();
    }

    public boolean forward() {
        return mToolbarTabController.forward();
    }

    /**
     * Triggered when the URL input field has gained or lost focus.
     * @param hasFocus Whether the URL field has gained focus.
     */
    @Override
    public void onUrlFocusChange(boolean hasFocus) {
        mToolbar.onUrlFocusChange(hasFocus);

        if (mFindToolbarManager != null && hasFocus) mFindToolbarManager.hideToolbar();

        if (mControlsVisibilityDelegate == null) return;
        if (hasFocus) {
            mFullscreenFocusToken =
                    mControlsVisibilityDelegate.showControlsPersistentAndClearOldToken(
                            mFullscreenFocusToken);
        } else {
            mControlsVisibilityDelegate.releasePersistentShowingToken(mFullscreenFocusToken);
        }

        mUrlFocusChangedCallback.onResult(hasFocus);
    }

    /**
     * Updates the primary color used by the model to the given color.
     * @param color The primary color for the current tab.
     * @param shouldAnimate Whether the change of color should be animated.
     */
    @Override
    public void onThemeColorChanged(int color, boolean shouldAnimate) {
        if (!mShouldUpdateToolbarPrimaryColor) return;

        boolean colorChanged = mCurrentThemeColor != color;
        if (!colorChanged) return;

        mCurrentThemeColor = color;
        mLocationBarModel.setPrimaryColor(color);
        mToolbar.onPrimaryColorChanged(shouldAnimate);
        // TODO(https://crbug.com/865801, pnoland): Rationalize theme color logic
        // into a set of documented, self-contained providers that we can inject to the appropriate
        // sub-components. That will let us have every component handle its own coloring, and remove
        // onThemeColorChanged from ToolbarManager.
        mCustomTabThemeColorProvider.setPrimaryColor(color, shouldAnimate);
    }

    @Override
    public void onTintChanged(ColorStateList tint, boolean useLight) {
        updateBookmarkButtonStatus();
    }

    /**
     * @param shouldUpdate Whether we should be updating the toolbar primary color based on updates
     *                     from the Tab.
     */
    public void setShouldUpdateToolbarPrimaryColor(boolean shouldUpdate) {
        mShouldUpdateToolbarPrimaryColor = shouldUpdate;
    }

    /**
     * @return The primary toolbar color.
     */
    public int getPrimaryColor() {
        return mLocationBarModel.getPrimaryColor();
    }

    /**
     * Sets the visibility of the Toolbar shadow.
     */
    public void setToolbarShadowVisibility(int visibility) {
        View toolbarShadow = mControlContainer.findViewById(R.id.toolbar_shadow);
        if (toolbarShadow != null) toolbarShadow.setVisibility(visibility);
    }

    /**
     * We use getTopControlOffset to position the top controls. However, the toolbar's height may
     * be less than the total top controls height. If that's the case, this method will return the
     * extra offset needed to align the toolbar at the bottom of the top controls.
     * @return The extra Y offset for the toolbar in pixels.
     */
    private int getToolbarExtraYOffset() {
        return mBrowserControlsSizer.getTopControlsMinHeight();
    }

    /**
     * Sets the drawable that the close button shows, or hides it if {@code drawable} is
     * {@code null}.
     */
    public void setCloseButtonDrawable(Drawable drawable) {
        mToolbar.setCloseButtonImageResource(drawable);
    }

    /**
     * Sets whether a title should be shown within the Toolbar.
     * @param showTitle Whether a title should be shown.
     */
    public void setShowTitle(boolean showTitle) {
        mToolbar.setShowTitle(showTitle);
    }

    /**
     * @see TopToolbarCoordinator#setUrlBarHidden(boolean)
     */
    public void setUrlBarHidden(boolean hidden) {
        mToolbar.setUrlBarHidden(hidden);
    }

    /**
     * @see TopToolbarCoordinator#getContentPublisher()
     */
    public String getContentPublisher() {
        return mToolbar.getContentPublisher();
    }

    /**
     * Focuses or unfocuses the URL bar.
     *
     * If you request focus and the UrlBar was already focused, this will select all of the text.
     *
     * @param focused Whether URL bar should be focused.
     * @param reason The given reason.
     */
    public void setUrlBarFocus(boolean focused, @OmniboxFocusReason int reason) {
        if (!mInitializedWithNative) return;
        if (mLocationBar.getFakeboxDelegate() == null) return;
        boolean wasFocused = mLocationBar.getFakeboxDelegate().isUrlBarFocused();
        mLocationBar.getFakeboxDelegate().setUrlBarFocus(focused, null, reason);
        if (wasFocused && focused) {
            mLocationBar.selectAll();
        }
    }

    /**
     * See {@link #setUrlBarFocus}, but if native is not loaded it will queue the request instead
     * of dropping it.
     */
    public void setUrlBarFocusOnceNativeInitialized(
            boolean focused, @OmniboxFocusReason int reason) {
        if (mInitializedWithNative) {
            setUrlBarFocus(focused, reason);
            return;
        }

        if (focused) {
            // Remember requests to focus the Url bar and replay them once native has been
            // initialized. This is important for the Launch to Incognito Tab flow (see
            // IncognitoTabLauncher.
            mOnInitializedRunnable = () -> {
                setUrlBarFocus(focused, reason);
            };
        } else {
            mOnInitializedRunnable = null;
        }
    }

    /**
     * Reverts any pending edits of the location bar and reset to the page state.  This does not
     * change the focus state of the location bar.
     */
    public void revertLocationBarChanges() {
        mLocationBar.revertChanges();
    }

    /**
     * Handle all necessary tasks that can be delayed until initialization completes.
     * @param activityCreationTimeMs The time of creation for the activity this toolbar belongs to.
     * @param activityName Simple class name for the activity this toolbar belongs to.
     */
    public void onDeferredStartup(final long activityCreationTimeMs, final String activityName) {
        mLocationBar.onDeferredStartup();
    }

    /**
     * Finish any toolbar animations.
     */
    public void finishAnimations() {
        if (mInitializedWithNative) mToolbar.finishAnimations();
    }

    /**
     * @return The current {@link LoadProgressCoordinator}.
     */
    public LoadProgressCoordinator getProgressBarCoordinator() {
        return mProgressBarCoordinator;
    }

    /**
     * Updates the current button states and calls appropriate abstract visibility methods, giving
     * inheriting classes the chance to update the button visuals as well.
     */
    private void updateButtonStatus() {
        Tab currentTab = mLocationBarModel.getTab();
        boolean tabCrashed = currentTab != null && SadTab.isShowing(currentTab);

        mToolbar.updateButtonVisibility();
        mToolbar.updateBackButtonVisibility(currentTab != null && currentTab.canGoBack());
        mToolbar.updateForwardButtonVisibility(currentTab != null && currentTab.canGoForward());
        updateReloadState(tabCrashed);
        updateBookmarkButtonStatus();
        if (mToolbar.getMenuButtonWrapper() != null) {
            mToolbar.getMenuButtonWrapper().setVisibility(View.VISIBLE);
        }
    }

    private void updateBookmarkButtonStatus() {
        Tab currentTab = mLocationBarModel.getTab();
        BookmarkBridge bridge = mBookmarkBridgeSupplier.get();
        boolean isBookmarked =
                currentTab != null && bridge != null && bridge.hasBookmarkIdForTab(currentTab);
        boolean editingAllowed =
                currentTab == null || bridge == null || bridge.isEditBookmarksEnabled();
        mToolbar.updateBookmarkButton(isBookmarked, editingAllowed);
    }

    private void updateReloadState(boolean tabCrashed) {
        Tab currentTab = mLocationBarModel.getTab();
        boolean isLoading = false;
        if (!tabCrashed) {
            isLoading = (currentTab != null && currentTab.isLoading()) || !mInitializedWithNative;
        }
        mToolbar.updateReloadButtonVisibility(isLoading);
        mMenuButtonCoordinator.updateReloadingState(isLoading);
    }

    /**
     * Triggered when the selected tab has changed.
     */
    private void refreshSelectedTab(Tab tab) {
        boolean wasIncognito = mLocationBarModel.isIncognito();
        Tab previousTab = mLocationBarModel.getTab();

        boolean isIncognito =
                tab != null ? tab.isIncognito() : mTabModelSelector.isIncognitoSelected();
        mLocationBarModel.setTab(tab, isIncognito);

        updateCurrentTabDisplayStatus();

        // This method is called prior to action mode destroy callback for incognito <-> normal
        // tab switch. Makes sure the action mode toolbar is hidden before selecting the new tab.
        if (previousTab != null && wasIncognito != isIncognito
                && DeviceFormFactor.isNonMultiDisplayContextOnTablet(mActivity)) {
            mActionModeController.startHideAnimation();
        }
        if (previousTab != tab || wasIncognito != isIncognito) {
            int defaultPrimaryColor =
                    ChromeColors.getDefaultThemeColor(mActivity.getResources(), isIncognito);
            int primaryColor = tab != null
                    ? mTopUiThemeColorProvider.calculateColor(tab, tab.getThemeColor())
                    : defaultPrimaryColor;
            // TODO(jinsukkim): Let TopUiThemeColorProvider handle this by updating the theme color.
            onThemeColorChanged(primaryColor, false);

            onTabOrModelChanged();

            if (tab != null) {
                mToolbar.onNavigatedToDifferentPage();
            }

            // Ensure the URL bar loses focus if the tab it was interacting with is changed from
            // underneath it.
            setUrlBarFocus(false, OmniboxFocusReason.UNFOCUS);

            // Place the cursor in the Omnibox if applicable.  We always clear the focus above to
            // ensure the shield placed over the content is dismissed when switching tabs.  But if
            // needed, we will refocus the omnibox and make the cursor visible here.
            if (shouldShowCursorInLocationBar()) {
                mLocationBar.showUrlBarCursorWithoutFocusAnimations();
            }
        }

        updateButtonStatus();
    }

    private void onTabOrModelChanged() {
        mToolbar.onTabOrModelChanged();
        checkIfNtpLoaded();
    }

    private void checkIfNtpLoaded() {
        NewTabPage ntp = getNewTabPageForCurrentTab();
        if (ntp != null) {
            ntp.setFakeboxDelegate(mLocationBar.getFakeboxDelegate());
            mLocationBarModel.notifyNtpStartedLoading();
        }
    }

    private void setBookmarkBridge(BookmarkBridge bookmarkBridge) {
        if (bookmarkBridge == null) return;
        bookmarkBridge.addObserver(mBookmarksObserver);
    }

    private void setLayoutStateProvider(LayoutStateProvider layoutStateProvider) {
        assert mLayoutStateProvider == null : "the mLayoutStateProvider should set at most once.";

        mLayoutStateProvider = layoutStateProvider;
        mLayoutStateProvider.addObserver(mLayoutStateObserver);
        mAppThemeColorProvider.setLayoutStateProvider(mLayoutStateProvider);
        mLocationBarModel.setLayoutStateProvider(mLayoutStateProvider);
        if (mBottomControlsCoordinatorSupplier.get() != null) {
            mBottomControlsCoordinatorSupplier.get().setLayoutStateProvider(mLayoutStateProvider);
        }
    }

    private void updateCurrentTabDisplayStatus() {
        mLocationBarModel.notifyUrlChanged();
        updateTabLoadingState(true);
    }

    private void updateTabLoadingState(boolean updateUrl) {
        mLocationBarModel.notifySecurityStateChanged();
        if (updateUrl) {
            mLocationBarModel.notifyUrlChanged();
            updateButtonStatus();
        }
    }

    /**
     * @param enabled Whether the progress bar is enabled.
     */
    public void setProgressBarEnabled(boolean enabled) {
        mToolbar.setProgressBarEnabled(enabled);
    }

    /**
     * @return The {@link FakeboxDelegate}.
     */
    @Nullable
    public FakeboxDelegate getFakeboxDelegate() {
        // TODO(crbug.com/1000295): Split fakebox component out of ntp package.
        return mLocationBar.getFakeboxDelegate();
    }

    @Nullable
    public VoiceRecognitionHandler getVoiceRecognitionHandler() {
        return mLocationBar.getVoiceRecognitionHandler();
    }

    private boolean shouldShowCursorInLocationBar() {
        Tab tab = mLocationBarModel.getTab();
        if (tab == null) return false;
        NativePage nativePage = tab.getNativePage();
        if (!(nativePage instanceof NewTabPage) && !(nativePage instanceof IncognitoNewTabPage)) {
            return false;
        }

        return DeviceFormFactor.isNonMultiDisplayContextOnTablet(mActivity)
                && mActivity.getResources().getConfiguration().keyboard
                == Configuration.KEYBOARD_QWERTY;
    }

    /**
     * Sets the top margin for the control container.
     * @param margin The margin in pixels.
     */
    private void setControlContainerTopMargin(int margin) {
        final ViewGroup.MarginLayoutParams layoutParams =
                ((ViewGroup.MarginLayoutParams) mControlContainer.getLayoutParams());
        if (layoutParams.topMargin == margin) {
            return;
        }

        layoutParams.topMargin = margin;
        mControlContainer.setLayoutParams(layoutParams);
    }

    /** Returns {@link LocationBar} for access in tests. */
    @VisibleForTesting
    public LocationBar getLocationBarForTesting() {
        return mLocationBar;
    }

    /** Returns {@link LocationBarModel} for access in tests. */
    @VisibleForTesting
    public LocationBarModel getLocationBarModelForTesting() {
        return mLocationBarModel;
    }

    /**
     * @return The {@link ToolbarLayout} that constitutes the toolbar.
     */
    @VisibleForTesting
    public ToolbarLayout getToolbarLayoutForTesting() {
        return mToolbar.getToolbarLayoutForTesting();
    }

    /**
     * Get the home button on the top toolbar to verify the button status.
     * Note that this home button is not always the home button that on the UI, and the button is
     * not always visible.
     * @return The {@link HomeButton} that lives in the top toolbar.
     */
    @VisibleForTesting
    public HomeButton getHomeButtonForTesting() {
        return mToolbar.getToolbarLayoutForTesting().getHomeButton();
    }

    /**
     * @return View for toolbar container.
     */
    @VisibleForTesting
    public View getContainerViewForTesting() {
        return mControlContainer.getView();
    }

    @VisibleForTesting
    public ToolbarTabController getToolbarTabControllerForTesting() {
        return mToolbarTabController;
    }
}
