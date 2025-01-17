// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.contextmenu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.IntDef;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

import org.chromium.base.metrics.RecordHistogram;
import org.chromium.chrome.stable.R;
import org.chromium.ui.text.SpanApplier;
import org.chromium.ui.text.SpanApplier.SpanInfo;
import org.chromium.ui.widget.AnchoredPopupWindow;
import org.chromium.ui.widget.ChipView;
import org.chromium.ui.widget.ViewRectProvider;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * A controller to handle chip construction and cross-app communication.
 */
class RevampedContextMenuChipController implements View.OnClickListener {
    private boolean mFakeLensQueryResultForTesting;
    private View mAnchorView;
    private ChipView mChipView;
    private AnchoredPopupWindow mPopupWindow;
    private Context mContext;
    private ChipRenderParams mChipRenderParams;

    @VisibleForTesting
    @IntDef({ChipEvent.SHOWN, ChipEvent.CLICKED, ChipEvent.DISMISSED})
    @Retention(RetentionPolicy.SOURCE)
    protected @interface ChipEvent {
        int SHOWN = 0;
        int CLICKED = 1;
        int DISMISSED = 2;
        int NUM_ENTRIES = 3;
    }

    private void recordChipEvent(@ChipEvent int chipEvent) {
        RecordHistogram.recordEnumeratedHistogram(
                "ContextMenu.LensChip.Event", chipEvent, ChipEvent.NUM_ENTRIES);
    }

    RevampedContextMenuChipController(Context context, View anchorView) {
        mContext = context;
        mAnchorView = anchorView;
    }

    /**
     * Returns the necessary px necessary to render the chip with enough margin space above and
     * below.
     */
    int getVerticalPxNeededForChip() {
        return 2
                * mContext.getResources().getDimensionPixelSize(
                        R.dimen.context_menu_chip_vertical_margin)
                + mContext.getResources().getDimensionPixelSize(R.dimen.chip_default_height);
    }

    /**
     * Derive max text view width by subtracting the width of other elements from the max chip
     * width.
     */
    @VisibleForTesting
    int getChipTextMaxWidthPx() {
        return mContext.getResources().getDimensionPixelSize(R.dimen.context_menu_chip_max_width)
                // Padding before primary icon
                - mContext.getResources().getDimensionPixelSize(
                        R.dimen.chip_element_extended_leading_padding)
                // Padding after primary icon
                - mContext.getResources().getDimensionPixelSize(
                        R.dimen.chip_element_leading_padding)
                // Padding before close icon.
                - mContext.getResources().getDimensionPixelSize(
                        R.dimen.chip_end_icon_extended_margin_start)
                // Padding after close icon.
                - mContext.getResources().getDimensionPixelSize(
                        R.dimen.chip_extended_end_padding_with_end_icon)
                // Primary and close icon width.
                - (2
                        * mContext.getResources().getDimensionPixelSize(
                                R.dimen.context_menu_chip_icon_size));
    }

    // This method should only be used in test files.  It is not marked
    // @VisibleForTesting to allow the Coordinator to reference it in its
    // own testing methods.
    void setFakeLensQueryResultForTesting() {
        mFakeLensQueryResultForTesting = true;
    }

    @Override
    public void onClick(View v) {
        if (v == mChipView) {
            recordChipEvent(ChipEvent.CLICKED);
            mChipRenderParams.onClickCallback.run();
            dismissLensChipIfShowing();
        }
    }

    /**
     * Dismiss the lens chip. Needed for cases where a user dismisses
     * the context menu without closing the chip manually.
     */
    void dismissLensChipIfShowing() {
        if (mPopupWindow != null && mPopupWindow.isShowing()) {
            mPopupWindow.dismiss();
        }
    }

    /**
     * Inflate an anchored chip view, set it up, and show it to the user.
     * @param chipRenderParams The data to construct the chip.
     */
    protected void showChip(@NonNull ChipRenderParams chipRenderParams) {
        if (mPopupWindow != null) {
            // Chip has already been shown for this context menu.
            return;
        }

        mChipRenderParams = chipRenderParams;

        mChipView = (ChipView) LayoutInflater.from(mContext).inflate(
                R.layout.revamped_context_menu_chip, null);

        ViewRectProvider rectProvider = new ViewRectProvider(mAnchorView);
        // Draw a clear background to avoid blocking context menu items.
        mPopupWindow = new AnchoredPopupWindow(mContext, mAnchorView,
                new ColorDrawable(Color.TRANSPARENT), mChipView, rectProvider);
        mPopupWindow.setAnimationStyle(R.style.ChipAnimation);
        mPopupWindow.setPreferredHorizontalOrientation(
                AnchoredPopupWindow.HorizontalOrientation.CENTER);
        // The bottom margin will determine the vertical placement of the chip, so
        // ensure that this distance is computed from the anchor.
        mPopupWindow.setPreferredVerticalOrientation(AnchoredPopupWindow.VerticalOrientation.ABOVE);
        mPopupWindow.setFocusable(false);
        // Don't dismiss as a result of touches outside of the chip popup.
        mPopupWindow.setOutsideTouchable(false);
        mPopupWindow.setMaxWidth(
                mContext.getResources().getDimensionPixelSize(R.dimen.context_menu_chip_max_width));

        mChipView.getPrimaryTextView().setText(
                SpanApplier.removeSpanText(mContext.getString(chipRenderParams.titleResourceId),
                        new SpanInfo("<new>", "</new>")));
        // TODO(benwgold): Consult with Chrome UX owners to see if Chip UI hierarchy should be
        // refactored.
        mChipView.getPrimaryTextView().setMaxWidth(getChipTextMaxWidthPx());

        if (chipRenderParams.iconResourceId != 0) {
            mChipView.setIcon(chipRenderParams.iconResourceId, false);
        }

        mChipView.addRemoveIcon();

        mChipView.setOnClickListener(this);
        mChipView.setRemoveIconClickListener(v -> {
            dismissLensChipIfShowing();
            recordChipEvent(ChipEvent.DISMISSED);
        });

        mPopupWindow.show();
        recordChipEvent(ChipEvent.SHOWN);
        if (mChipRenderParams.onShowCallback != null) {
            mChipRenderParams.onShowCallback.run();
        }
    }

    // This method should only be used in test files.  It is not marked
    // @VisibleForTesting to allow the Coordinator to reference it in its
    // own testing methods.
    AnchoredPopupWindow getCurrentPopupWindowForTesting() {
        return mPopupWindow;
    }

    // This method should only be used in test files.  It is not marked
    // @VisibleForTesting to allow the Coordinator to reference it in its
    // own testing methods.
    void clickChipForTesting() {
        onClick(mChipView);
    }
}
