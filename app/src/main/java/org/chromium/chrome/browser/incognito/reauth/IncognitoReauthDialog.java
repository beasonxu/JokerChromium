// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.incognito.reauth;

import android.view.View;

import androidx.annotation.NonNull;

import org.chromium.ui.modaldialog.DialogDismissalCause;
import org.chromium.ui.modaldialog.ModalDialogManager;
import org.chromium.ui.modaldialog.ModalDialogProperties;
import org.chromium.ui.modelutil.PropertyModel;

/**
 * This class is responsible for managing the Incognito re-auth dialog. It handles creation,
 * showing and hiding of the re-auth dialog.
 *
 * TODO(crbug.com/1227656): Clean this up to remove references to non-fullscreen logic.
 */
class IncognitoReauthDialog {
    @NonNull
    private final ModalDialogManager mModalDialogManager;

    private final PropertyModel mModalDialogModel;
    private final ModalDialogProperties.Controller mController =
            new ModalDialogProperties.Controller() {
                @Override
                public void onClick(PropertyModel model, int buttonType) {}
                @Override
                public void onDismiss(PropertyModel model, int dismissalCause) {}
            };

    IncognitoReauthDialog(
            @NonNull ModalDialogManager modalDialogManager, @NonNull View incognitoReauthView) {
        mModalDialogManager = modalDialogManager;
        mModalDialogModel = new PropertyModel.Builder(ModalDialogProperties.ALL_KEYS)
                                    .with(ModalDialogProperties.CONTROLLER, mController)
                                    .with(ModalDialogProperties.CUSTOM_VIEW, incognitoReauthView)
                                    .with(ModalDialogProperties.CANCEL_ON_TOUCH_OUTSIDE, false)
                                    .with(ModalDialogProperties.FULLSCREEN_DIALOG, true)
                                    .with(ModalDialogProperties.EXCEED_MAX_HEIGHT, true)
                                    .build();
    }

    void showIncognitoReauthDialog(boolean showFullScreen) {
        mModalDialogManager.showDialog(mModalDialogModel,
                (showFullScreen) ? ModalDialogManager.ModalDialogType.APP
                                 : ModalDialogManager.ModalDialogType.TAB,
                ModalDialogManager.ModalDialogPriority.VERY_HIGH);
    }

    void dismissIncognitoReauthDialog(@DialogDismissalCause int dismissalCause) {
        mModalDialogManager.dismissDialog(mModalDialogModel, dismissalCause);
    }
}
