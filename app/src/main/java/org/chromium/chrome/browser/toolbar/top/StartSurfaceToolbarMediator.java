// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.toolbar.top;

import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.ACCESSIBILITY_ENABLED;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.BUTTONS_CLICKABLE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.HOMEPAGE_ENABLED_SUPPLIER;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.HOMEPAGE_MANAGED_BY_POLICY_SUPPLIER;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.HOME_BUTTON_CLICK_HANDLER;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.HOME_BUTTON_IS_VISIBLE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.IDENTITY_DISC_AT_START;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.IDENTITY_DISC_CLICK_HANDLER;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.IDENTITY_DISC_DESCRIPTION;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.IDENTITY_DISC_IMAGE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.IDENTITY_DISC_IS_VISIBLE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.INCOGNITO_STATE_PROVIDER;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.INCOGNITO_SWITCHER_VISIBLE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.INCOGNITO_TAB_COUNT_PROVIDER;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.INCOGNITO_TAB_MODEL_SELECTOR;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.IS_INCOGNITO;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.IS_NEW_TAB_ENABLED;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.IS_VISIBLE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.LOGO_IS_VISIBLE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.NEW_TAB_BUTTON_HIGHLIGHT;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.NEW_TAB_CLICK_HANDLER;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.NEW_TAB_VIEW_AT_START;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.NEW_TAB_VIEW_IS_VISIBLE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.NEW_TAB_VIEW_TEXT_IS_VISIBLE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.SHOW_ANIMATION;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.TAB_SWITCHER_BUTTON_IS_VISIBLE;
import static org.chromium.chrome.browser.toolbar.top.StartSurfaceToolbarProperties.TRANSLATION_Y;

import android.view.View;
import android.view.View.OnClickListener;

import androidx.annotation.VisibleForTesting;

import org.chromium.base.Callback;
import org.chromium.base.CallbackController;
import org.chromium.base.supplier.BooleanSupplier;
import org.chromium.base.supplier.ObservableSupplier;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.logo.LogoLoadHelper;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.search_engines.TemplateUrlServiceFactory;
import org.chromium.chrome.browser.tabmodel.IncognitoStateProvider;
import org.chromium.chrome.browser.tabmodel.IncognitoTabModelObserver;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;
import org.chromium.chrome.browser.tabmodel.TabModelSelectorObserver;
import org.chromium.chrome.browser.toolbar.ButtonData;
import org.chromium.chrome.browser.toolbar.ButtonData.ButtonSpec;
import org.chromium.chrome.browser.toolbar.TabCountProvider;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButtonCoordinator;
import org.chromium.chrome.browser.user_education.IPHCommandBuilder;
import org.chromium.chrome.browser.user_education.UserEducationHelper;
import org.chromium.chrome.browser.util.ChromeAccessibilityUtil;
import org.chromium.chrome.features.start_surface.StartSurfaceState;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.modelutil.PropertyModel;

/** The mediator implements interacts between the views and the caller. */
class StartSurfaceToolbarMediator {
    private final PropertyModel mPropertyModel;
    private final Callback<IPHCommandBuilder> mShowIdentityIPHCallback;
    private final boolean mHideIncognitoSwitchWhenNoTabs;
    private final boolean mShouldShowTabSwitcherButtonOnHomepage;
    private final Supplier<ButtonData> mIdentityDiscButtonSupplier;
    private final boolean mIsTabGroupsAndroidContinuationEnabled;
    private final UserEducationHelper mUserEducationHelper;
    private final BooleanSupplier mIsIncognitoModeEnabledSupplier;
    private final MenuButtonCoordinator mMenuButtonCoordinator;
    private final TabModelSelectorObserver mTabModelSelectorObserver;
    private final IncognitoTabModelObserver mIncognitoTabModelObserver;
    private final ObservableSupplier<Profile> mProfileSupplier;
    private final Callback<LoadUrlParams> mLogoClickedCallback;

    private TabModelSelector mTabModelSelector;
    private TabCountProvider mTabCountProvider;

    @StartSurfaceState
    private int mStartSurfaceState;
    private boolean mIsAnimationEnabled;
    private boolean mDefaultSearchEngineHasLogo;
    private boolean mShouldShowStartSurfaceAsHomepage;
    private boolean mHomepageEnabled;

    private CallbackController mCallbackController = new CallbackController();
    private float mNonIncognitoHomepageTranslationY;

    private boolean mShowHomeButtonOnTabSwitcher;
    private StartSurfaceHomeButtonIPHController mStartSurfaceHomeButtonIPHController;
    private View mHomeButtonView;
    private LogoLoadHelper mLogoLoadHelper;
    private LogoView mLogoView;

    StartSurfaceToolbarMediator(PropertyModel model,
            Callback<IPHCommandBuilder> showIdentityIPHCallback,
            boolean hideIncognitoSwitchWhenNoTabs, boolean showHomeButtonOnTabSwitcher,
            MenuButtonCoordinator menuButtonCoordinator,
            ObservableSupplier<Boolean> identityDiscStateSupplier,
            Supplier<ButtonData> identityDiscButtonSupplier,
            ObservableSupplier<Boolean> homepageEnabledSupplier,
            ObservableSupplier<Boolean> startSurfaceAsHomepageSupplier,
            ObservableSupplier<Boolean> homepageManagedByPolicySupplier,
            OnClickListener homeButtonOnClickHandler, boolean shouldShowTabSwitcherButtonOnHomepage,
            boolean isTabGroupsAndroidContinuationEnabled, UserEducationHelper userEducationHelper,
            BooleanSupplier isIncognitoModeEnabledSupplier, boolean isAnimationEnabled,
            ObservableSupplier<Profile> profileSupplier,
            Callback<LoadUrlParams> logoClickedCallback) {
        mPropertyModel = model;
        mStartSurfaceState = StartSurfaceState.NOT_SHOWN;
        mShowIdentityIPHCallback = showIdentityIPHCallback;
        mHideIncognitoSwitchWhenNoTabs = hideIncognitoSwitchWhenNoTabs;
        mMenuButtonCoordinator = menuButtonCoordinator;
        mIdentityDiscButtonSupplier = identityDiscButtonSupplier;
        mIsTabGroupsAndroidContinuationEnabled = isTabGroupsAndroidContinuationEnabled;
        mUserEducationHelper = userEducationHelper;
        mIsIncognitoModeEnabledSupplier = isIncognitoModeEnabledSupplier;
        mProfileSupplier = profileSupplier;
        mLogoClickedCallback = logoClickedCallback;
        mDefaultSearchEngineHasLogo = true;
        identityDiscStateSupplier.addObserver((canShowHint) -> {
            // If the identity disc wants to be hidden and is hidden, there's nothing we need to do.
            if (!canShowHint && !mPropertyModel.get(IDENTITY_DISC_IS_VISIBLE)) return;
            updateIdentityDisc(mIdentityDiscButtonSupplier.get());
        });

        mShowHomeButtonOnTabSwitcher = showHomeButtonOnTabSwitcher;
        if (mShowHomeButtonOnTabSwitcher) {
            mPropertyModel.set(HOMEPAGE_ENABLED_SUPPLIER, homepageEnabledSupplier);
            homepageEnabledSupplier.addObserver(mCallbackController.makeCancelable((enabled) -> {
                mHomepageEnabled = enabled;
                updateHomeButtonVisibility();
            }));
            mPropertyModel.set(
                    HOMEPAGE_MANAGED_BY_POLICY_SUPPLIER, homepageManagedByPolicySupplier);

            View.OnClickListener homeButtonOnClickListener = v -> {
                if (homeButtonOnClickHandler != null) homeButtonOnClickHandler.onClick(v);

                if (mStartSurfaceHomeButtonIPHController != null) {
                    mStartSurfaceHomeButtonIPHController.onHomeButtonClicked();
                }
            };

            mPropertyModel.set(HOME_BUTTON_CLICK_HANDLER, homeButtonOnClickListener);
            startSurfaceAsHomepageSupplier.addObserver(
                    mCallbackController.makeCancelable((showStartSurfaceAsHomepage) -> {
                        mShouldShowStartSurfaceAsHomepage = showStartSurfaceAsHomepage;
                        updateHomeButtonVisibility();
                    }));
        }
        mShouldShowTabSwitcherButtonOnHomepage = shouldShowTabSwitcherButtonOnHomepage;
        mIsAnimationEnabled = isAnimationEnabled;

        mTabModelSelectorObserver = new TabModelSelectorObserver() {
            @Override
            public void onTabModelSelected(TabModel newModel, TabModel oldModel) {
                mPropertyModel.set(IS_INCOGNITO, mTabModelSelector.isIncognitoSelected());
                updateIdentityDisc(mIdentityDiscButtonSupplier.get());
            }

            @Override
            public void onTabStateInitialized() {
                maybeInitializeIncognitoToggle();
            }
        };

        mIncognitoTabModelObserver = new IncognitoTabModelObserver() {
            @Override
            public void wasFirstTabCreated() {
                updateIncognitoToggleTabVisibility();
            }

            @Override
            public void didBecomeEmpty() {
                updateIncognitoToggleTabVisibility();
            }
        };
    }

    void destroy() {
        if (mTabModelSelector != null && mTabModelSelectorObserver != null) {
            mTabModelSelector.removeObserver(mTabModelSelectorObserver);
        }
        if (mTabModelSelector != null && mIncognitoTabModelObserver != null) {
            mTabModelSelector.removeIncognitoTabModelObserver(mIncognitoTabModelObserver);
        }
        if (mLogoView != null) {
            mLogoView.destroy();
            mLogoView = null;
        }
        if (mLogoLoadHelper != null) {
            mLogoLoadHelper.destroy();
            mLogoLoadHelper = null;
        }
        if (mCallbackController != null) {
            mCallbackController.destroy();
            mCallbackController = null;
        }
    }

    void onStartSurfaceStateChanged(
            @StartSurfaceState int newState, boolean shouldShowStartSurfaceToolbar) {
        updateShowAnimation(newState, shouldShowStartSurfaceToolbar);
        mStartSurfaceState = newState;
        updateLogoVisibility();
        updateTabSwitcherButtonVisibility();
        updateIncognitoToggleTabVisibility();
        updateNewTabViewVisibility();
        updateHomeButtonVisibility();
        updateIdentityDisc(mIdentityDiscButtonSupplier.get());
        updateAppMenuUpdateBadgeSuppression();
        setStartSurfaceToolbarVisibility(shouldShowStartSurfaceToolbar);
        updateButtonsClickable(shouldShowStartSurfaceToolbar);
        updateTranslationY(mNonIncognitoHomepageTranslationY);
    }

    void onStartSurfaceHeaderOffsetChanged(int verticalOffset) {
        updateTranslationY(verticalOffset);
    }

    void onDefaultSearchEngineChanged() {
        mDefaultSearchEngineHasLogo =
                TemplateUrlServiceFactory.get().doesDefaultSearchEngineHaveLogo();
        if (mLogoLoadHelper != null) mLogoLoadHelper.onDefaultSearchEngineChanged();
        updateLogoVisibility();
    }

    /**
     * The real omnibox should be shown in three cases:
     * 1. It's on the homepage, the url is focused and start surface toolbar is not visible.
     * 2. It's on the homepage and the fake search box is scrolled up to the screen top.
     * 3. It's on a tab.
     *
     * In the other cases:
     * 1. It's on the homepage and start surface toolbar is at least partially shown -- the user
     *    sees the fake search box.
     * 2. It's on the tab switcher surface, there is no search box (fake or real).
     *
     * @param fakeSearchBoxMarginToScreenTop The margin of fake search box to the screen top.
     * @return Whether toolbar layout should be shown.
     */
    boolean shouldShowRealSearchBox(int fakeSearchBoxMarginToScreenTop) {
        return isRealSearchBoxFocused()
                || isFakeSearchBoxScrolledToScreenTop(fakeSearchBoxMarginToScreenTop) || isOnATab();
    }

    /** Returns whether it's on the start surface homepage. */
    boolean isOnHomepage() {
        return mStartSurfaceState == StartSurfaceState.SHOWN_HOMEPAGE;
    }

    /** Returns whether it's on a normal tab. */
    private boolean isOnATab() {
        return mStartSurfaceState == StartSurfaceState.NOT_SHOWN;
    }

    /**
     * When mPropertyModel.get(IS_VISIBLE) is false on the homepage, start surface toolbar and fake
     * search box are not shown and the real search box is focused.
     * @return Whether the real search box is focused.
     */
    private boolean isRealSearchBoxFocused() {
        return isOnHomepage() && !mPropertyModel.get(IS_VISIBLE);
    }

    /**
     * @param fakeSearchBoxMarginToScreenTop The margin of fake search box to the screen top.
     * @return Whether the fake search box is scrolled to the top of the screen.
     */
    private boolean isFakeSearchBoxScrolledToScreenTop(int fakeSearchBoxMarginToScreenTop) {
        return mPropertyModel.get(IS_VISIBLE)
                && -mPropertyModel.get(TRANSLATION_Y) >= fakeSearchBoxMarginToScreenTop;
    }

    // Updates interactability to both New tab button "+" and New tab view text "New tab".
    void setNewTabEnabled(boolean enabled) {
        mPropertyModel.set(IS_NEW_TAB_ENABLED, enabled);
    }

    void setOnNewTabClickHandler(View.OnClickListener listener) {
        mPropertyModel.set(NEW_TAB_CLICK_HANDLER, listener);
    }

    void setTabCountProvider(TabCountProvider tabCountProvider) {
        mTabCountProvider = tabCountProvider;
    }

    void setTabModelSelector(TabModelSelector selector) {
        mTabModelSelector = selector;

        if (mTabModelSelector.isTabStateInitialized()) maybeInitializeIncognitoToggle();
        mPropertyModel.set(IS_INCOGNITO, mTabModelSelector.isIncognitoSelected());
        updateIdentityDisc(mIdentityDiscButtonSupplier.get());
        mTabModelSelector.addObserver(mTabModelSelectorObserver);

        mTabModelSelector.addIncognitoTabModelObserver(mIncognitoTabModelObserver);
    }

    private void maybeInitializeIncognitoToggle() {
        if (mIsIncognitoModeEnabledSupplier.getAsBoolean()) {
            assert mTabCountProvider != null;
            mPropertyModel.set(INCOGNITO_TAB_COUNT_PROVIDER, mTabCountProvider);
            mPropertyModel.set(INCOGNITO_TAB_MODEL_SELECTOR, mTabModelSelector);
        }
    }

    private void updateIncognitoToggleTabVisibility() {
        if (mStartSurfaceState != StartSurfaceState.SHOWN_TABSWITCHER
                && mStartSurfaceState != StartSurfaceState.SHOWING_TABSWITCHER) {
            mPropertyModel.set(INCOGNITO_SWITCHER_VISIBLE, false);
            updateNewTabViewTextVisibility();
            return;
        }

        mPropertyModel.set(
                INCOGNITO_SWITCHER_VISIBLE, !mHideIncognitoSwitchWhenNoTabs || hasIncognitoTabs());
        updateNewTabViewTextVisibility();
    }

    private boolean hasIncognitoTabs() {
        if (mTabModelSelector == null) return false;
        return mTabModelSelector.getModel(true).getCount() != 0;
    }

    void setStartSurfaceToolbarVisibility(boolean shouldShowStartSurfaceToolbar) {
        mPropertyModel.set(IS_VISIBLE, shouldShowStartSurfaceToolbar);
    }

    void setIncognitoStateProvider(IncognitoStateProvider provider) {
        mPropertyModel.set(INCOGNITO_STATE_PROVIDER, provider);
    }

    void onAccessibilityStatusChanged(boolean enabled) {
        mPropertyModel.set(ACCESSIBILITY_ENABLED, enabled);
        updateNewTabViewVisibility();
    }

    /**
     * @param highlight If the new tab button should be highlighted.
     */
    void setNewTabButtonHighlight(boolean highlight) {
        mPropertyModel.set(NEW_TAB_BUTTON_HIGHLIGHT, highlight);
    }

    void setHomeButtonView(View homeButtonView) {
        mHomeButtonView = homeButtonView;
    }

    /**
     * Called when the logo view is inflated.
     * @param logoView The logo view.
     */
    void onLogoViewReady(LogoView logoView) {
        mLogoView = logoView;
        mLogoLoadHelper = new LogoLoadHelper(mProfileSupplier, mLogoClickedCallback, logoView);
    }

    private void updateLogoVisibility() {
        if (mLogoLoadHelper != null) {
            mLogoLoadHelper.maybeLoadSearchProviderLogoOnHomepage(mStartSurfaceState);
        }
        boolean shouldShowLogo = mStartSurfaceState == StartSurfaceState.SHOWN_HOMEPAGE
                && mDefaultSearchEngineHasLogo;
        mPropertyModel.set(LOGO_IS_VISIBLE, shouldShowLogo);
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    void updateIdentityDisc(ButtonData buttonData) {
        boolean shouldShow = buttonData.canShow() && !mTabModelSelector.isIncognitoSelected();
        if (shouldShow) {
            ButtonSpec buttonSpec = buttonData.getButtonSpec();
            mPropertyModel.set(IDENTITY_DISC_CLICK_HANDLER, buttonSpec.getOnClickListener());
            // Take a defensive copy of the Drawable, since Drawables aren't immutable, and another
            // view mutating our drawable could cause it to display incorrectly.
            mPropertyModel.set(
                    IDENTITY_DISC_IMAGE, buttonSpec.getDrawable().getConstantState().newDrawable());
            mPropertyModel.set(IDENTITY_DISC_DESCRIPTION, buttonSpec.getContentDescriptionResId());
            mPropertyModel.set(IDENTITY_DISC_IS_VISIBLE, true);
            mShowIdentityIPHCallback.onResult(buttonSpec.getIPHCommandBuilder());
        } else {
            mPropertyModel.set(IDENTITY_DISC_IS_VISIBLE, false);
        }
    }

    private void updateNewTabViewVisibility() {
        boolean isShownTabSwitcherState = mStartSurfaceState == StartSurfaceState.SHOWN_TABSWITCHER
                || mStartSurfaceState == StartSurfaceState.SHOWING_TABSWITCHER;

        // This button is only shown for homepage when accessibility is enabled and
        // OverviewListLayout is shown as the tab switcher instead of the start surface.
        mPropertyModel.set(NEW_TAB_VIEW_IS_VISIBLE,
                isShownTabSwitcherState
                        || (ChromeAccessibilityUtil.get().isAccessibilityEnabled()
                                && !mIsTabGroupsAndroidContinuationEnabled));

        updateNewTabViewAtStart();
    }

    private void updateNewTabViewAtStart() {
        if (!mPropertyModel.get(NEW_TAB_VIEW_IS_VISIBLE)) return;
        mPropertyModel.set(NEW_TAB_VIEW_AT_START, !mPropertyModel.get(HOME_BUTTON_IS_VISIBLE));
        updateNewTabViewTextVisibility();
    }

    private void updateNewTabViewTextVisibility() {
        // Show new tab view text view when new tab view is at start and incognito switch
        // is hidden.
        mPropertyModel.set(NEW_TAB_VIEW_TEXT_IS_VISIBLE,
                mPropertyModel.get(NEW_TAB_VIEW_AT_START)
                        && !mPropertyModel.get(INCOGNITO_SWITCHER_VISIBLE));
    }

    private void updateButtonsClickable(boolean isClickable) {
        mPropertyModel.set(BUTTONS_CLICKABLE, isClickable);
        mMenuButtonCoordinator.setClickable(isClickable);
    }

    private void updateHomeButtonVisibility() {
        boolean isShownTabSwitcherState = mStartSurfaceState == StartSurfaceState.SHOWN_TABSWITCHER
                || mStartSurfaceState == StartSurfaceState.SHOWING_TABSWITCHER;
        boolean shouldShow = mHomepageEnabled && isShownTabSwitcherState
                && !mPropertyModel.get(IS_INCOGNITO) && mShowHomeButtonOnTabSwitcher
                && mShouldShowStartSurfaceAsHomepage;
        // If start surface is not shown as the homepage, home button shouldn't be shown on tab
        // switcher page.
        mPropertyModel.set(HOME_BUTTON_IS_VISIBLE, shouldShow);
        updateNewTabViewAtStart();

        // If the home button is shown, maybe show the IPH.
        if (mHomeButtonView != null && shouldShow) {
            if (mStartSurfaceHomeButtonIPHController == null) {
                mStartSurfaceHomeButtonIPHController = new StartSurfaceHomeButtonIPHController(
                        mUserEducationHelper, mHomeButtonView);
            }
            mStartSurfaceHomeButtonIPHController.maybeShowIPH();
        }
    }

    private void updateTabSwitcherButtonVisibility() {
        // This button should only be shown on homepage. On tab switcher page, new tab button is
        // shown.
        boolean shouldShow = mShouldShowTabSwitcherButtonOnHomepage
                && mStartSurfaceState == StartSurfaceState.SHOWN_HOMEPAGE;
        mPropertyModel.set(TAB_SWITCHER_BUTTON_IS_VISIBLE, shouldShow);
        // If tab switcher button is visible, we should move identity disc to the left.
        mPropertyModel.set(IDENTITY_DISC_AT_START, shouldShow);
    }

    private void updateAppMenuUpdateBadgeSuppression() {
        mMenuButtonCoordinator.setAppMenuUpdateBadgeSuppressed(
                mStartSurfaceState == StartSurfaceState.SHOWN_TABSWITCHER);
    }

    private void updateTranslationY(float transY) {
        if (mStartSurfaceState == StartSurfaceState.SHOWN_HOMEPAGE
                && !mPropertyModel.get(IS_INCOGNITO)) {
            // If it's on the non-incognito homepage, document the homepage translationY.
            mNonIncognitoHomepageTranslationY = transY;
            // Update the translationY of the toolbarView.
            mPropertyModel.set(TRANSLATION_Y, transY);
        } else {
            // If it's not on the non-incognito homepage, set the translationY as 0.
            mPropertyModel.set(TRANSLATION_Y, 0);
        }
    }

    private void updateShowAnimation(
            @StartSurfaceState int newState, boolean shouldShowStartSurfaceToolbar) {
        mPropertyModel.set(SHOW_ANIMATION,
                shouldShowStartSurfaceToolbar && mIsAnimationEnabled
                        && isSwitchingBetweenOverviews(mStartSurfaceState, newState));
    }

    private boolean isSwitchingBetweenOverviews(
            @StartSurfaceState int previousState, @StartSurfaceState int newState) {
        // The previousState should never be SHOWING states because if it's already on overview
        // page, SHOWING state should've been updated to SHOWN state. The following transitions are
        // handled:
        // * SHOWN_HOMEPAGE -> SHOWING_TABSWITCHER
        // * SHOWN_HOMEPAGE -> SHOWN_TABSWITCHER
        // * SHOWN_TABSWITCHER -> SHOWING_HOMEPAGE
        // * SHOWN_TABSWITCHER -> SHOWN_HOMEPAGE
        return (previousState == StartSurfaceState.SHOWN_HOMEPAGE
                       && newState == StartSurfaceState.SHOWING_TABSWITCHER)
                || (previousState == StartSurfaceState.SHOWN_HOMEPAGE
                        && newState == StartSurfaceState.SHOWN_TABSWITCHER)
                || (previousState == StartSurfaceState.SHOWN_TABSWITCHER
                        && newState == StartSurfaceState.SHOWING_HOMEPAGE)
                || (previousState == StartSurfaceState.SHOWN_TABSWITCHER
                        && newState == StartSurfaceState.SHOWN_HOMEPAGE);
    }

    @VisibleForTesting
    @StartSurfaceState
    int getOverviewModeStateForTesting() {
        return mStartSurfaceState;
    }

    @VisibleForTesting
    void setShowHomeButtonOnTabSwitcherForTesting(boolean showHomeButtonOnTabSwitcher) {
        mShowHomeButtonOnTabSwitcher = showHomeButtonOnTabSwitcher;
    }

    @VisibleForTesting
    void setStartSurfaceHomeButtonIPHControllerForTesting(
            StartSurfaceHomeButtonIPHController startSurfaceHomeButtonIPHController) {
        mStartSurfaceHomeButtonIPHController = startSurfaceHomeButtonIPHController;
    }
}
