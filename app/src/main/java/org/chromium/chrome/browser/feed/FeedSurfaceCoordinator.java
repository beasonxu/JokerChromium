// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.feed;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;

import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.feature_engagement.TrackerFactory;
import org.chromium.chrome.browser.feed.shared.FeedFeatures;
import org.chromium.chrome.browser.feed.shared.FeedSurfaceDelegate;
import org.chromium.chrome.browser.feed.shared.FeedSurfaceProvider;
import org.chromium.chrome.browser.feed.shared.stream.Header;
import org.chromium.chrome.browser.feed.shared.stream.NonDismissibleHeader;
import org.chromium.chrome.browser.feed.shared.stream.Stream;
import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.native_page.ContextMenuManager;
import org.chromium.chrome.browser.native_page.NativePageNavigationDelegate;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;
import org.chromium.chrome.browser.ntp.ScrollListener;
import org.chromium.chrome.browser.ntp.ScrollableContainerDelegate;
import org.chromium.chrome.browser.ntp.SnapScrollHelper;
import org.chromium.chrome.browser.ntp.cards.promo.enhanced_protection.EnhancedProtectionPromoController;
import org.chromium.chrome.browser.ntp.snippets.SectionHeaderView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.share.ShareDelegate;
import org.chromium.chrome.browser.signin.services.IdentityServicesProvider;
import org.chromium.chrome.browser.signin.ui.PersonalizedSigninPromoView;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;
import org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager;
import org.chromium.chrome.browser.user_education.UserEducationHelper;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;
import org.chromium.components.browser_ui.bottomsheet.BottomSheetController;
import org.chromium.components.browser_ui.widget.displaystyle.UiConfig;
import org.chromium.components.browser_ui.widget.displaystyle.ViewResizer;
import org.chromium.components.feature_engagement.Tracker;
import org.chromium.ui.UiUtils;
import org.chromium.ui.base.ViewUtils;
import org.chromium.ui.base.WindowAndroid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Provides a surface that displays an interest feed rendered list of content suggestions.
 */
public class FeedSurfaceCoordinator implements FeedSurfaceProvider {
    @VisibleForTesting
    public static final String FEED_STREAM_CREATED_TIME_MS_UMA = "FeedStreamCreatedTime";

    /**
     * Provides an interface that can be implemented by both Feed v1 and v2, allowing us to compile
     * without Feed v1. Once v1 is removed, this interface should be removed.
     */
    public interface StreamWrapper {
        int defaultMarginPixels(Activity activity);
        int wideMarginPixels(Activity activity);

        /**
         * Creates the stream. Only called once unless doneWithStream is called.
         */
        Stream createStream(Profile profile, Activity activity, boolean showDarkBackground,
                SnackbarManager snackbarManager,
                NativePageNavigationDelegate pageNavigationDelegate, UiConfig uiConfig,
                boolean placeholderShown, BottomSheetController bottomSheetController,
                WindowAndroid windowAndroid, FeedV1ActionOptions v1ActionOptions,
                Supplier<ShareDelegate> shareDelegateSupplier);

        /**
         * Called after the stream returned by createStream() is no longer needed.
         */
        void doneWithStream();
        boolean isPlaceholderShown();
        void addScrollListener();
    }

    StreamWrapper mStreamWrapper;

    protected final Activity mActivity;
    private final SnackbarManager mSnackbarManager;
    @Nullable
    private final View mNtpHeader;
    private final boolean mShowDarkBackground;
    private final boolean mIsPlaceholderShownInitially;
    private final FeedSurfaceDelegate mDelegate;
    private final int mDefaultMarginPixels;
    private final int mWideMarginPixels;
    private final FeedSurfaceMediator mMediator;
    private final BottomSheetController mBottomSheetController;
    private final FeedV1ActionOptions mV1ActionOptions;
    private final WindowAndroid mWindowAndroid;
    private final Supplier<ShareDelegate> mShareSupplier;

    private UiConfig mUiConfig;
    private FrameLayout mRootView;
    private ContextMenuManager mContextMenuManager;
    private Tracker mTracker;
    private long mStreamCreatedTimeMs;

    // Enhanced Protection promo view will be not-null once we have it created, until it is
    // destroyed.
    private @Nullable View mEnhancedProtectionPromoView;
    private @Nullable EnhancedProtectionPromoController mEnhancedProtectionPromoController;

    // Used when Feed is enabled.
    private @Nullable Stream mStream;
    private @Nullable StreamLifecycleManager mStreamLifecycleManager;
    private @Nullable SectionHeaderView mSectionHeaderView;
    private @Nullable PersonalizedSigninPromoView mSigninPromoView;
    private @Nullable ViewResizer mStreamViewResizer;
    private @Nullable NativePageNavigationDelegate mPageNavigationDelegate;
    private @Nullable Profile mProfile;

    // Used when Feed is disabled by policy.
    private @Nullable ScrollView mScrollViewForPolicy;
    private @Nullable ViewResizer mScrollViewResizer;

    // Used for the feed header menu.
    private UserEducationHelper mUserEducationHelper;

    // Used to handle things related to the main scrollable container of NTP surface.
    private @Nullable ScrollableContainerDelegate mScrollableContainerDelegate;

    private @Nullable HeaderIphScrollListener mHeaderIphScrollListener;

    private final Handler mHandler = new Handler();

    private class SignInPromoHeader implements Header {
        @Override
        public View getView() {
            return getSigninPromoView();
        }

        @Override
        public boolean isDismissible() {
            return true;
        }

        @Override
        public void onDismissed() {
            mMediator.onSignInPromoDismissed();
        }
    }

    private class EnhancedProtectionPromoHeader implements Header {
        @Override
        public View getView() {
            assert mEnhancedProtectionPromoView != null;
            return mEnhancedProtectionPromoView;
        }

        @Override
        public boolean isDismissible() {
            return false;
        }

        @Override
        public void onDismissed() {}
    }

    /**
     * Provides the additional capabilities needed for the container view.
     */
    private class RootView extends FrameLayout {
        /**
         * @param context The context of the application.
         */
        public RootView(Context context) {
            super(context);
        }

        @Override
        protected void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
            mUiConfig.updateDisplayStyle();
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            if (super.onInterceptTouchEvent(ev)) return true;
            if (mMediator != null && !mMediator.getTouchEnabled()) return true;

            return mDelegate.onInterceptTouchEvent(ev);
        }
    }

    /**
     * Provides the additional capabilities needed for the {@link ScrollView}.
     */
    private class PolicyScrollView extends ScrollView {
        public PolicyScrollView(Context context) {
            super(context);
        }

        @Override
        protected void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
            mUiConfig.updateDisplayStyle();
        }
    }

    private class ScrollableContainerDelegateImpl implements ScrollableContainerDelegate {
        @Override
        public void addScrollListener(ScrollListener listener) {
            if (mStream == null) return;

            mStream.addScrollListener(listener);
        }

        @Override
        public void removeScrollListener(ScrollListener listener) {
            if (mStream == null) return;

            mStream.removeScrollListener(listener);
        }

        @Override
        public int getVerticalScrollOffset() {
            return mMediator.getVerticalScrollOffset();
        }

        @Override
        public int getRootViewHeight() {
            return mRootView.getHeight();
        }

        @Override
        public int getTopPositionRelativeToContainerView(View childView) {
            int[] pos = new int[2];
            ViewUtils.getRelativeLayoutPosition(mRootView, childView, pos);
            return pos[1];
        }
    }

    /**
     * Constructs a new FeedSurfaceCoordinator.
     * @param activity The containing {@link Activity}.
     * @param snackbarManager The {@link SnackbarManager} displaying Snackbar UI.
     * @param tabModelSelector {@link TabModelSelector} object.
     * @param windowAndroid The window of the page.
     * @param snapScrollHelper The {@link SnapScrollHelper} for the New Tab Page.
     * @param ntpHeader The extra header on top of the feeds for the New Tab Page.
     * @param sectionHeaderView The {@link SectionHeaderView} for the feed.
     * @param actionOptions Configures feed v1 actions.
     * @param showDarkBackground Whether is shown on dark background.
     * @param delegate The constructing {@link FeedSurfaceDelegate}.
     * @param pageNavigationDelegate The {@link NativePageNavigationDelegate}
     *                               that handles page navigation.
     * @param profile The current user profile.
     * @param isPlaceholderShownInitially Whether the placeholder is shown initially.
     * @param bottomSheetController The bottom sheet controller, used in v2.
     * @param shareDelegateSupplier The supplier for the share delegate used to share articles.
     */
    public FeedSurfaceCoordinator(Activity activity, SnackbarManager snackbarManager,
            TabModelSelector tabModelSelector, WindowAndroid windowAndroid,
            @Nullable SnapScrollHelper snapScrollHelper, @Nullable View ntpHeader,
            @Nullable SectionHeaderView sectionHeaderView, FeedV1ActionOptions actionOptions,
            boolean showDarkBackground, FeedSurfaceDelegate delegate,
            @Nullable NativePageNavigationDelegate pageNavigationDelegate, Profile profile,
            boolean isPlaceholderShownInitially, BottomSheetController bottomSheetController,
            Supplier<ShareDelegate> shareDelegateSupplier,
            @Nullable ScrollableContainerDelegate externalScrollableContainerDelegate) {
        mStreamWrapper = FeedV2.createStreamWrapper();

        mActivity = activity;
        mSnackbarManager = snackbarManager;
        mNtpHeader = ntpHeader;
        mSectionHeaderView = sectionHeaderView;
        mShowDarkBackground = showDarkBackground;
        mIsPlaceholderShownInitially = isPlaceholderShownInitially;
        mDelegate = delegate;
        mPageNavigationDelegate = pageNavigationDelegate;
        mBottomSheetController = bottomSheetController;
        mProfile = profile;
        mV1ActionOptions = actionOptions;
        mWindowAndroid = windowAndroid;
        mShareSupplier = shareDelegateSupplier;
        mScrollableContainerDelegate = externalScrollableContainerDelegate;

        Resources resources = mActivity.getResources();
        mDefaultMarginPixels = mStreamWrapper.defaultMarginPixels(activity);
        mWideMarginPixels = mStreamWrapper.wideMarginPixels(activity);

        mRootView = new RootView(mActivity);
        mRootView.setPadding(0, resources.getDimensionPixelOffset(R.dimen.tab_strip_height), 0, 0);
        mUiConfig = new UiConfig(mRootView);

        mTracker = TrackerFactory.getTrackerForProfile(profile);

        if (isEnhancedProtectionPromoEnabled()) {
            mEnhancedProtectionPromoController =
                    new EnhancedProtectionPromoController(mActivity, mProfile);
        }

        // Mediator should be created before any Stream changes.
        mMediator = new FeedSurfaceMediator(this, snapScrollHelper, mPageNavigationDelegate);

        mUserEducationHelper =
                new UserEducationHelper(mActivity, mHandler, TrackerFactory::getTrackerForProfile);
    }

    @Override
    public void destroy() {
        stopIph();
        mMediator.destroy();
        if (mStreamLifecycleManager != null) mStreamLifecycleManager.destroy();
        mStreamLifecycleManager = null;
        mStreamWrapper.doneWithStream();
        if (mEnhancedProtectionPromoController != null) {
            mEnhancedProtectionPromoController.destroy();
        }
        mScrollableContainerDelegate = null;
    }

    @Override
    public ContextMenuManager.TouchEnabledDelegate getTouchEnabledDelegate() {
        return mMediator;
    }

    @Override
    public NewTabPageLayout.ScrollDelegate getScrollDelegate() {
        return mMediator;
    }

    @Override
    public UiConfig getUiConfig() {
        return mUiConfig;
    }

    @Override
    public View getView() {
        return mRootView;
    }

    @Override
    public boolean shouldCaptureThumbnail() {
        return mMediator.shouldCaptureThumbnail();
    }

    @Override
    public void captureThumbnail(Canvas canvas) {
        ViewUtils.captureBitmap(mRootView, canvas);
        mMediator.onThumbnailCaptured();
    }

    /**
     * @return The {@link StreamLifecycleManager} that manages the lifecycle of the {@link Stream}.
     */
    StreamLifecycleManager getStreamLifecycleManager() {
        return mStreamLifecycleManager;
    }

    /** @return The {@link Stream} that this class holds. */
    public Stream getStream() {
        return mStream;
    }

    /** @return Whether the placeholder is shown. */
    public boolean isPlaceholderShown() {
        return mStreamWrapper.isPlaceholderShown();
    }

    /**
     * Create a {@link Stream} for this class.
     */
    void createStream() {
        if (mScrollViewForPolicy != null) {
            mRootView.removeView(mScrollViewForPolicy);
            mScrollViewForPolicy = null;
            mScrollViewResizer.detach();
            mScrollViewResizer = null;
        }

        mStreamCreatedTimeMs = SystemClock.elapsedRealtime();
        mStream = mStreamWrapper.createStream(mProfile, mActivity, mShowDarkBackground,
                mSnackbarManager, mPageNavigationDelegate, mUiConfig, mIsPlaceholderShownInitially,
                mBottomSheetController, mWindowAndroid, mV1ActionOptions, mShareSupplier);

        mStreamLifecycleManager = mDelegate.createStreamLifecycleManager(mStream, mActivity);

        View view = mStream.getView();
        view.setBackgroundResource(R.color.default_bg_color);
        if (isPlaceholderShown()) {
            // Set recyclerView as transparent until first patch of articles are loaded. Before
            // that, the placeholder is shown.
            view.getBackground().setAlpha(0);
        }
        mRootView.addView(view);
        mStreamViewResizer = ViewResizer.createAndAttach(
                view, mUiConfig, mDefaultMarginPixels, mWideMarginPixels);

        if (mNtpHeader != null) UiUtils.removeViewFromParent(mNtpHeader);
        if (mSectionHeaderView != null) UiUtils.removeViewFromParent(mSectionHeaderView);
        if (mSigninPromoView != null) UiUtils.removeViewFromParent(mSigninPromoView);
        if (mEnhancedProtectionPromoView != null) {
            UiUtils.removeViewFromParent(mEnhancedProtectionPromoView);
        }

        if (mNtpHeader != null) {
            mStream.setHeaderViews(Arrays.asList(new NonDismissibleHeader(mNtpHeader),
                    new NonDismissibleHeader(mSectionHeaderView)));
        } else if (mSectionHeaderView != null) {
            mStream.setHeaderViews(Arrays.asList(new NonDismissibleHeader(mSectionHeaderView)));
        }

        mStreamWrapper.addScrollListener();

        // Work around https://crbug.com/943873 where default focus highlight shows up after
        // toggling dark mode.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            view.setDefaultFocusHighlightEnabled(false);
        }

        // Explicitly request focus on the scroll container to avoid UrlBar being focused after
        // the scroll container for policy is removed.
        view.requestFocus();
    }

    /**
     * @return The {@link ScrollView} for displaying content for supervised user or enterprise
     *         policy.
     */
    @VisibleForTesting
    public ScrollView getScrollViewForPolicy() {
        return mScrollViewForPolicy;
    }

    /**
     * Create a {@link ScrollView} for displaying content for supervised user or enterprise policy.
     */
    void createScrollViewForPolicy() {
        if (mStream != null) {
            mStreamViewResizer.detach();
            mStreamViewResizer = null;
            mRootView.removeView(mStream.getView());
            assert mStreamLifecycleManager
                    != null
                : "StreamLifecycleManager should not be null when the Stream is not null.";
            mStreamLifecycleManager.destroy();
            mStreamLifecycleManager = null;
            // Do not call mStream.onDestroy(), the mStreamLifecycleManager has done that for us.
            mStream = null;
            mSectionHeaderView = null;
            mSigninPromoView = null;

            mEnhancedProtectionPromoView = null;
            if (mEnhancedProtectionPromoController != null) {
                mEnhancedProtectionPromoController.destroy();
                mEnhancedProtectionPromoController = null;
            }
            mStreamWrapper.doneWithStream();
        }

        mScrollViewForPolicy = new PolicyScrollView(mActivity);
        mScrollViewForPolicy.setBackgroundColor(
                ApiCompatibilityUtils.getColor(mActivity.getResources(), R.color.default_bg_color));
        mScrollViewForPolicy.setVerticalScrollBarEnabled(false);

        // Make scroll view focusable so that it is the next focusable view when the url bar clears
        // focus.
        mScrollViewForPolicy.setFocusable(true);
        mScrollViewForPolicy.setFocusableInTouchMode(true);
        mScrollViewForPolicy.setContentDescription(
                mScrollViewForPolicy.getResources().getString(R.string.accessibility_new_tab_page));

        if (mNtpHeader != null) {
            UiUtils.removeViewFromParent(mNtpHeader);
            mScrollViewForPolicy.addView(mNtpHeader);
        }
        mRootView.addView(mScrollViewForPolicy);
        mScrollViewResizer = ViewResizer.createAndAttach(
                mScrollViewForPolicy, mUiConfig, mDefaultMarginPixels, mWideMarginPixels);
        mScrollViewForPolicy.requestFocus();
    }

    /** @return The {@link SectionHeaderView} for the Feed section header. */
    SectionHeaderView getSectionHeaderView() {
        return mSectionHeaderView;
    }

    /** @return The {@link PersonalizedSigninPromoView} for this class. */
    PersonalizedSigninPromoView getSigninPromoView() {
        if (mSigninPromoView == null) {
            LayoutInflater inflater = LayoutInflater.from(mRootView.getContext());
            mSigninPromoView = (PersonalizedSigninPromoView) inflater.inflate(
                    R.layout.personalized_signin_promo_view_modern_content_suggestions, mRootView,
                    false);

            // If the placeholder is shown in Feed v1, delay to show the sign-in view until the
            // articles are shown. Feed v2's articles don't have fade-in animations, so sign-in view
            // is already shown together with v2 articles.
            if (isPlaceholderShown() && !FeedFeatures.isV2Enabled()) {
                mSigninPromoView.setVisibility(View.INVISIBLE);
            }
        }
        return mSigninPromoView;
    }

    /**
     * Show the sign-in view with the same fade-in animation as Feed articles' add-animation.
     */
    void fadeInSigninView() {
        if (mSigninPromoView != null) {
            mSigninPromoView.setAlpha(0f);
            mSigninPromoView.setVisibility(View.VISIBLE);
            mSigninPromoView.animate().alpha(1f).setDuration(
                    ((RecyclerView) mStream.getView()).getItemAnimator().getAddDuration());
        }
    }

    /**
     *  Update header views in the Stream.
     *  */
    void updateHeaderViews(
            boolean isSignInPromoVisible, @Nullable View enhancedProtectionPromoView) {
        if (mStream == null) return;

        List<Header> headers = new ArrayList<>();
        if (mNtpHeader != null) {
            assert mSectionHeaderView != null;
            headers.add(new NonDismissibleHeader(mNtpHeader));
        }

        if (enhancedProtectionPromoView != null) {
            mEnhancedProtectionPromoView = enhancedProtectionPromoView;
            headers.add(new EnhancedProtectionPromoHeader());
        }

        if (mSectionHeaderView != null) {
            headers.add(new NonDismissibleHeader(mSectionHeaderView));
        }

        if (isSignInPromoVisible) {
            headers.add(new SignInPromoHeader());
        }

        mStream.setHeaderViews(headers);
    }

    public void onOverviewShownAtLaunch(long activityCreationTimeMs) {
        mMediator.onOverviewShownAtLaunch(activityCreationTimeMs, mIsPlaceholderShownInitially);
        StartSurfaceConfiguration.recordHistogram(FEED_STREAM_CREATED_TIME_MS_UMA,
                mStreamCreatedTimeMs - activityCreationTimeMs, mIsPlaceholderShownInitially);
    }

    Tracker getFeatureEngagementTracker() {
        return mTracker;
    }

    UserEducationHelper getUserEducationHelper() {
        return mUserEducationHelper;
    }

    EnhancedProtectionPromoController getEnhancedProtectionPromoController() {
        return mEnhancedProtectionPromoController;
    }

    private boolean isEnhancedProtectionPromoEnabled() {
        return ChromeFeatureList.isEnabled(ChromeFeatureList.ENHANCED_PROTECTION_PROMO_CARD)
                && ChromeFeatureList.isEnabled(
                        ChromeFeatureList.SAFE_BROWSING_ENHANCED_PROTECTION_ENABLED);
    }

    @VisibleForTesting
    public FeedSurfaceMediator getMediatorForTesting() {
        return mMediator;
    }

    @VisibleForTesting
    public View getSignInPromoViewForTesting() {
        return getSigninPromoView();
    }

    @VisibleForTesting
    public View getSectionHeaderViewForTesting() {
        return getSectionHeaderView();
    }

    @VisibleForTesting
    public Stream getStreamForTesting() {
        return getStream();
    }

    /**
     * Initializes things related to the IPH which will start listening to scroll events to
     * determine whether the IPH should be triggered.
     *
     * You must stop the IPH with #stopIph before tearing down feed components, e.g., on #destroy.
     * This also applies for the case where the feed stream is deleted when disabled (e.g., by
     * policy).
     */
    void initializeIph() {
        // Don't do anything when there is no feed stream because the IPH isn't needed in that
        // case.
        if (mStream == null) return;

        // Provide a delegate for the container of the feed surface that is handled by the feed
        // coordinator itself when not provided externally (e.g., by the Start surface).
        if (mScrollableContainerDelegate == null) {
            mScrollableContainerDelegate = new ScrollableContainerDelegateImpl();
        }

        FeedSurfaceCoordinator coordinator = this;
        HeaderIphScrollListener.Delegate delegate = new HeaderIphScrollListener.Delegate() {
            @Override
            public Tracker getFeatureEngagementTracker() {
                return mTracker;
            }
            @Override
            public void showMenuIph() {
                mSectionHeaderView.showMenuIph(mUserEducationHelper);
            }
            @Override
            public boolean isFeedExpanded() {
                return mMediator.isExpanded();
            }
            @Override
            public boolean isSignedIn() {
                return IdentityServicesProvider.get()
                        .getSigninManager(Profile.getLastUsedRegularProfile())
                        .getIdentityManager()
                        .hasPrimaryAccount();
            }
            @Override
            public boolean isFeedHeaderPositionInContainerSuitableForIPH(
                    float headerMaxPosFraction) {
                return coordinator.isFeedHeaderPositionInContainerSuitableForIPH(
                        headerMaxPosFraction);
            }
        };
        mHeaderIphScrollListener =
                new HeaderIphScrollListener(delegate, mScrollableContainerDelegate);
        mScrollableContainerDelegate.addScrollListener(mHeaderIphScrollListener);
    }

    /**
     * Stops and deletes things related to the IPH. Must be called before tearing down feed
     * components, e.g., on #destroy. This also applies for the case where the feed stream is
     * deleted when disabled (e.g., by policy).
     */
    void stopIph() {
        if (mStream != null && mScrollableContainerDelegate != null
                && mHeaderIphScrollListener != null) {
            mScrollableContainerDelegate.removeScrollListener(mHeaderIphScrollListener);
        }
        mHeaderIphScrollListener = null;
        mScrollableContainerDelegate = null;
    }

    private boolean isFeedHeaderPositionInContainerSuitableForIPH(float headerMaxPosFraction) {
        assert headerMaxPosFraction >= 0.0f
                && headerMaxPosFraction <= 1.0f
            : "Max position fraction should be ranging between 0.0 and 1.0";

        int topPosInStream = mScrollableContainerDelegate.getTopPositionRelativeToContainerView(
                mSectionHeaderView);
        if (topPosInStream < 0) return false;
        if (topPosInStream
                > headerMaxPosFraction * mScrollableContainerDelegate.getRootViewHeight()) {
            return false;
        }

        return true;
    }
}
