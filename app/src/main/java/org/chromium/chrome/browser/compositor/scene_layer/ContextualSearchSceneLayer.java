// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.compositor.scene_layer;

import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeMethods;
import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.compositor.bottombar.contextualsearch.ContextualSearchBarBannerControl;
import org.chromium.chrome.browser.compositor.bottombar.contextualsearch.ContextualSearchBarControl;
import org.chromium.chrome.browser.compositor.bottombar.contextualsearch.ContextualSearchImageControl;
import org.chromium.chrome.browser.compositor.bottombar.contextualsearch.ContextualSearchPanel;
import org.chromium.chrome.browser.compositor.bottombar.contextualsearch.ContextualSearchPanelHelp;
import org.chromium.chrome.browser.compositor.bottombar.contextualsearch.ContextualSearchPromoControl;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.chrome.browser.layouts.scene_layer.SceneOverlayLayer;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.resources.ResourceManager;

/**
 * A SceneLayer to render layers for ContextualSearchLayout.
 */
@JNINamespace("android")
public class ContextualSearchSceneLayer extends SceneOverlayLayer {
    // NOTE: If you use SceneLayer's native pointer here, the JNI generator will try to
    // downcast using reinterpret_cast<>. We keep a separate pointer to avoid it.
    private long mNativePtr;

    /** If the scene layer has been initialized. */
    private boolean mIsInitialized;

    private final float mDpToPx;

    private ContextualSearchImageControl mImageControl;

    public ContextualSearchSceneLayer(float dpToPx) {
        mDpToPx = dpToPx;
    }

    /**
     * Update the scene layer to draw an OverlayPanel.
     * @param resourceManager Manager to get view and image resources.
     * @param panel The OverlayPanel to render.
     * @param searchBarControl The Search Bar control.
     * @param barBannerControl An optional banner that shows above the Bar as a promo.
     * @param promoControl The privacy Opt-in promo that appears below the Bar.
     * @param helpControl A control for the help section of the panel that promotes modified
     *        user usage and appears below the Bar and above the content.
     * @param imageControl The object controlling the image displayed in the Bar.
     */
    public void update(ResourceManager resourceManager, ContextualSearchPanel panel,
            ContextualSearchBarControl searchBarControl,
            ContextualSearchBarBannerControl barBannerControl,
            ContextualSearchPromoControl promoControl, ContextualSearchPanelHelp helpControl,
            ContextualSearchImageControl imageControl) {
        // Don't try to update the layer if not initialized or showing.
        if (resourceManager == null || !panel.isShowing()) return;

        if (!mIsInitialized) {
            ContextualSearchSceneLayerJni.get().createContextualSearchLayer(
                    mNativePtr, ContextualSearchSceneLayer.this, resourceManager);
            mIsInitialized = true;
        }
        mImageControl = imageControl;

        final int searchBarBackgroundColor = panel.getBarBackgroundColor();
        int searchContextViewId = searchBarControl.getSearchContextViewId();
        int searchTermViewId = searchBarControl.getSearchTermViewId();
        int searchCaptionViewId = searchBarControl.getCaptionViewId();

        int openNewTabIconId =
                panel.canPromoteToNewTab() ? R.drawable.open_in_new_tab : INVALID_RESOURCE_ID;
        int dragHandlebarId = R.drawable.drag_handlebar;

        int searchPromoViewId = promoControl.getViewId();
        boolean searchPromoVisible = promoControl.isVisible();
        float searchPromoHeightPx = promoControl.getHeightPx();
        float searchPromoOpacity = promoControl.getOpacity();
        int searchPromoBackgroundColor = promoControl.getBackgroundColor();

        int panelHelpViewId = helpControl.getViewId();
        boolean panelHelpVisible = helpControl.isVisible();
        float panelHelpHeightPx = helpControl.getHeightPx();
        float panelHelpOpacity = helpControl.getOpacity();
        int panelHelpContainerBackgroundColor = helpControl.getContainerBackgroundColor();

        int searchBarBannerTextViewId = barBannerControl.getViewId();
        boolean searchBarBannerVisible = barBannerControl.isVisible();
        float searchBarBannerHeightPx = barBannerControl.getHeightPx();
        float searchBarBannerPaddingPx = barBannerControl.getPaddingPx();
        float searchBarBannerRippleWidthPx = barBannerControl.getRippleWidthPx();
        float searchBarBannerRippleOpacity = barBannerControl.getRippleOpacity();
        float searchBarBannerTextOpacity = barBannerControl.getTextOpacity();

        float customImageVisibilityPercentage = imageControl.getCustomImageVisibilityPercentage();
        int barImageSize = imageControl.getBarImageSize();

        boolean quickActionIconVisible = imageControl.getCardIconVisible();
        int quickActionIconResId = imageControl.getCardIconResourceId();

        boolean thumbnailVisible = imageControl.getThumbnailVisible();
        String thumbnailUrl = imageControl.getThumbnailUrl();

        float searchPanelX = panel.getOffsetX();
        float searchPanelY = panel.getOffsetY();
        float searchPanelWidth = panel.getWidth();
        float searchPanelHeight = panel.getHeight();

        float searchBarMarginSide = panel.getBarMarginSide();
        float searchBarMarginTop = panel.getBarMarginTop();
        float searchBarHeight = panel.getBarHeight();

        float searchContextOpacity = searchBarControl.getSearchBarContextOpacity();
        float searchTermOpacity = searchBarControl.getSearchBarTermOpacity();

        float searchCaptionAnimationPercentage = searchBarControl.getCaptionAnimationPercentage();
        boolean searchCaptionVisible = searchBarControl.getCaptionVisible();

        boolean searchBarBorderVisible = panel.isBarBorderVisible();
        float searchBarBorderHeight = panel.getBarBorderHeight();

        final int iconColor = panel.getIconColor();
        final int dragHandlebarColor = panel.getDragHandlebarColor();

        float closeIconOpacity = panel.getCloseIconOpacity();

        boolean isProgressBarVisible = panel.isProgressBarVisible();

        float progressBarHeight = panel.getProgressBarHeight();
        float progressBarOpacity = panel.getProgressBarOpacity();
        float progressBarCompletion = panel.getProgressBarCompletion();

        boolean touchHighlightVisible = searchBarControl.getTouchHighlightVisible();
        float touchHighlightXOffset = searchBarControl.getTouchHighlightXOffsetPx();
        float touchHighlightWidth = searchBarControl.getTouchHighlightWidthPx();

        WebContents panelWebContents = panel.getWebContents();

        int roundedBarTopResourceId =
                org.chromium.components.browser_ui.styles.R.drawable.top_round;
        int separatorLineColor = panel.getSeparatorLineColor();
        // The top_round resource includes the shadow so we only need a side shadow.
        int panelShadowResourceId = R.drawable.overlay_side_shadow;
        int closeIconResourceId = INVALID_RESOURCE_ID;

        // TODO(donnd): crbug.com/1143472 - Remove parameters for the now
        // defunct close button from the interface and the associated code on
        // the native side.
        ContextualSearchSceneLayerJni.get().updateContextualSearchLayer(mNativePtr,
                ContextualSearchSceneLayer.this, panelShadowResourceId, searchBarBackgroundColor,
                searchContextViewId, searchTermViewId, searchCaptionViewId,
                R.drawable.modern_toolbar_shadow, R.drawable.ic_logo_googleg_24dp,
                quickActionIconResId, dragHandlebarId, openNewTabIconId, closeIconResourceId,
                R.drawable.progress_bar_background, R.drawable.progress_bar_foreground,
                searchPromoViewId, R.drawable.contextual_search_promo_ripple,
                searchBarBannerTextViewId, mDpToPx, panel.getFullscreenWidth() * mDpToPx,
                panel.getTabHeight() * mDpToPx, panel.getBasePageBrightness(),
                panel.getBasePageY() * mDpToPx, panelWebContents, searchPromoVisible,
                searchPromoHeightPx, searchPromoOpacity, searchPromoBackgroundColor,
                // Panel Help
                panelHelpViewId, panelHelpVisible, panelHelpHeightPx, panelHelpOpacity,
                panelHelpContainerBackgroundColor,
                // Banner etc.
                searchBarBannerVisible, searchBarBannerHeightPx, searchBarBannerPaddingPx,
                searchBarBannerRippleWidthPx, searchBarBannerRippleOpacity,
                searchBarBannerTextOpacity, searchPanelX * mDpToPx, searchPanelY * mDpToPx,
                searchPanelWidth * mDpToPx, searchPanelHeight * mDpToPx,
                searchBarMarginSide * mDpToPx, searchBarMarginTop * mDpToPx,
                searchBarHeight * mDpToPx, searchContextOpacity,
                searchBarControl.getTextLayerMinHeight(), searchTermOpacity,
                searchBarControl.getSearchTermCaptionSpacing(), searchCaptionAnimationPercentage,
                searchCaptionVisible, searchBarBorderVisible, searchBarBorderHeight * mDpToPx,
                quickActionIconVisible, thumbnailVisible, thumbnailUrl,
                customImageVisibilityPercentage, barImageSize, iconColor, dragHandlebarColor,
                closeIconOpacity, isProgressBarVisible, progressBarHeight * mDpToPx,
                progressBarOpacity, progressBarCompletion, touchHighlightVisible,
                touchHighlightXOffset, touchHighlightWidth, Profile.getLastUsedRegularProfile(),
                roundedBarTopResourceId, separatorLineColor);
    }

    @CalledByNative
    public void onThumbnailFetched(boolean success) {
        if (mImageControl != null) mImageControl.onThumbnailFetched(success);
    }

    @Override
    public void setContentTree(SceneLayer contentTree) {
        ContextualSearchSceneLayerJni.get().setContentTree(
                mNativePtr, ContextualSearchSceneLayer.this, contentTree);
    }

    /**
     * Hide the layer tree; for use if the panel is not being shown.
     */
    public void hideTree() {
        if (!mIsInitialized) return;
        ContextualSearchSceneLayerJni.get().hideTree(mNativePtr, ContextualSearchSceneLayer.this);
    }

    @Override
    protected void initializeNative() {
        if (mNativePtr == 0) {
            mNativePtr = ContextualSearchSceneLayerJni.get().init(ContextualSearchSceneLayer.this);
        }
        assert mNativePtr != 0;
    }

    /**
     * Destroys this object and the corresponding native component.
     */
    @Override
    public void destroy() {
        super.destroy();
        mIsInitialized = false;
        mNativePtr = 0;
    }

    @NativeMethods
    interface Natives {
        long init(ContextualSearchSceneLayer caller);
        void createContextualSearchLayer(long nativeContextualSearchSceneLayer,
                ContextualSearchSceneLayer caller, ResourceManager resourceManager);
        void setContentTree(long nativeContextualSearchSceneLayer,
                ContextualSearchSceneLayer caller, SceneLayer contentTree);
        void hideTree(long nativeContextualSearchSceneLayer, ContextualSearchSceneLayer caller);
        void updateContextualSearchLayer(long nativeContextualSearchSceneLayer,
                ContextualSearchSceneLayer caller, int searchBarBackgroundResourceId,
                int searchBarBackgroundColor, int searchContextResourceId, int searchTermResourceId,
                int searchCaptionResourceId, int searchBarShadowResourceId,
                int searchProviderIconResourceId, int quickActionIconResourceId,
                int dragHandlebarResourceId, int openTabIconResourceId, int closeIconResourceId,
                int progressBarBackgroundResourceId, int progressBarResourceId,
                int searchPromoResourceId, int barBannerRippleResourceId,
                int barBannerTextResourceId, float dpToPx, float layoutWidth, float layoutHeight,
                float basePageBrightness, float basePageYOffset, WebContents webContents,
                boolean searchPromoVisible, float searchPromoHeight, float searchPromoOpacity,
                int searchPromoBackgroundColor,
                // Panel Help
                int panelHelpResourceId, boolean panelHelpVisible, float panelHelpHeight,
                float panelHelpOpacity, int panelHelpBackgroundColor,
                // Banner etc
                boolean searchBarBannerVisible, float searchBarBannerHeight,
                float searchBarBannerPaddingPx, float searchBarBannerRippleWidth,
                float searchBarBannerRippleOpacity, float searchBarBannerTextOpacity,
                float searchPanelX, float searchPanelY, float searchPanelWidth,
                float searchPanelHeight, float searchBarMarginSide, float searchBarMarginTop,
                float searchBarHeight, float searchContextOpacity, float searchTextLayerMinHeight,
                float searchTermOpacity, float searchTermCaptionSpacing,
                float searchCaptionAnimationPercentage, boolean searchCaptionVisible,
                boolean searchBarBorderVisible, float searchBarBorderHeight,
                boolean quickActionIconVisible, boolean thumbnailVisible, String thumbnailUrl,
                float customImageVisibilityPercentage, int barImageSize, int iconColor,
                int dragHandlebarColor, float closeIconOpacity, boolean isProgressBarVisible,
                float progressBarHeight, float progressBarOpacity, float progressBarCompletion,
                boolean touchHighlightVisible, float touchHighlightXOffset,
                float toucHighlightWidth, Profile profile, int barBackgroundResourceId,
                int separatorLineColor);
    }
}
