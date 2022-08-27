// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.keyboard_accessory;

import androidx.annotation.IntDef;

import org.chromium.ui.modelutil.PropertyModel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Properties defined here reflect the visible state of the ManualFilling-components.
 */
class ManualFillingProperties {
    static final PropertyModel.WritableBooleanPropertyKey SHOW_WHEN_VISIBLE =
            new PropertyModel.WritableBooleanPropertyKey("show_when_visible");
    static final PropertyModel.WritableBooleanPropertyKey PORTRAIT_ORIENTATION =
            new PropertyModel.WritableBooleanPropertyKey("portrait_orientation");
    static final PropertyModel.WritableIntPropertyKey KEYBOARD_EXTENSION_STATE =
            new PropertyModel.WritableIntPropertyKey("keyboard_extension_state");
    static final PropertyModel.WritableBooleanPropertyKey SUPPRESSED_BY_BOTTOM_SHEET =
            new PropertyModel.WritableBooleanPropertyKey("suppressed_by_bottom_sheet");

    /**
     * Properties that a given state enforces. Must be between 0x0 and 0x100.
     * @see KeyboardExtensionState
     */
    @IntDef({BAR, VISIBLE_SHEET, HIDDEN_SHEET})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StateProperty {
    }
    public static final int BAR = 0x1; // Any state either shows it or hides it - there is no neutral stance.
    public static final    int VISIBLE_SHEET = 0x2; // A state with this property shows the sheet container.
    public static final    int HIDDEN_SHEET = 0x4; // A state with this property hides the sheet container.
    public static final    int FLOATING = 0x8; // A state with this property is not attached to a keyboard.


    /**
     * A state is composed of {@link StateProperty}s. A state must ensure the properties are
     * enforced and the effects are triggered. See more here:
     * http://go/keyboard-accessory-v2#heading=h.1ack25xnyuxz
     *
     * e.g. for <code> int FLOATING_BAR = BAR | HIDDEN_SHEET | FLOATING; </code>
     * The state FLOATING_BAR must close the sheet but show the bar. To satisfy the FLOATING
     * property, the state will ensure that the keyboard can not affect it.
     */
    @IntDef({HIDDEN, EXTENDING_KEYBOARD, WAITING_TO_REPLACE, REPLACING_KEYBOARD, FLOATING_BAR,
            FLOATING_SHEET})
    @Retention(RetentionPolicy.SOURCE)
    public @interface KeyboardExtensionState {
    }
    public static final int HIDDEN = HIDDEN_SHEET; // == 4
    public static final int EXTENDING_KEYBOARD = BAR | HIDDEN_SHEET; // == 5
    public static final  int REPLACING_KEYBOARD = BAR | VISIBLE_SHEET; // == 3
    public static final   int WAITING_TO_REPLACE = BAR; // == 1
    public static final   int FLOATING_BAR = BAR | HIDDEN_SHEET | FLOATING; // == 13
    public static final   int FLOATING_SHEET = BAR | VISIBLE_SHEET | FLOATING; // == 11


    static PropertyModel createFillingModel() {
        return new PropertyModel
                .Builder(SHOW_WHEN_VISIBLE, KEYBOARD_EXTENSION_STATE, PORTRAIT_ORIENTATION,
                        SUPPRESSED_BY_BOTTOM_SHEET)
                .with(SHOW_WHEN_VISIBLE, false)
                .with(KEYBOARD_EXTENSION_STATE, HIDDEN)
                .with(PORTRAIT_ORIENTATION, true)
                .with(SUPPRESSED_BY_BOTTOM_SHEET, false)
                .build();
    }

    private ManualFillingProperties() {}
}
