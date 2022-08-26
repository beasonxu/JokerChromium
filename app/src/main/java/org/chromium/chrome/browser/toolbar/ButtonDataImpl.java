// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.toolbar;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.chromium.chrome.browser.toolbar.adaptive.AdaptiveToolbarFeatures.AdaptiveToolbarButtonVariant;
import org.chromium.chrome.browser.user_education.IPHCommandBuilder;

/** An implementation of the {@link ButtonData}. */
public class ButtonDataImpl implements ButtonData {
    private boolean mCanShow;
    private boolean mIsEnabled;

    private ButtonSpec mButtonSpec;

    public ButtonDataImpl() {}

    public ButtonDataImpl(boolean canShow, @NonNull Drawable drawable,
            @NonNull View.OnClickListener onClickListener, int contentDescriptionResId,
            boolean supportsTinting, @Nullable IPHCommandBuilder iphCommandBuilder,
            boolean isEnabled, @AdaptiveToolbarButtonVariant int buttonVariant) {
        mCanShow = canShow;
        mIsEnabled = isEnabled;
        mButtonSpec = new ButtonSpec(drawable, onClickListener, /*onLongClickListener=*/null,
                contentDescriptionResId, supportsTinting, iphCommandBuilder, buttonVariant);
    }

    @Override
    public boolean canShow() {
        return mCanShow;
    }

    @Override
    public boolean isEnabled() {
        return mIsEnabled;
    }

    @Override
    public ButtonSpec getButtonSpec() {
        return mButtonSpec;
    }

    public void setButtonSpec(ButtonSpec buttonSpec) {
        mButtonSpec = buttonSpec;
    }

    public void setCanShow(boolean canShow) {
        mCanShow = canShow;
    }

    public void setEnabled(boolean enabled) {
        mIsEnabled = enabled;
    }

    /** Convenience method to update the IPH command builder. */
    public void updateIPHCommandBuilder(@Nullable IPHCommandBuilder iphCommandBuilder) {
        ButtonSpec currentSpec = getButtonSpec();
        ButtonSpec newSpec = new ButtonSpec(currentSpec.getDrawable(),
                currentSpec.getOnClickListener(), currentSpec.getOnLongClickListener(),
                currentSpec.getContentDescriptionResId(), currentSpec.getSupportsTinting(),
                iphCommandBuilder, currentSpec.getButtonVariant());
        setButtonSpec(newSpec);
    }
}
