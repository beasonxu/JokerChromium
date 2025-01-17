
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/password_manager/core/browser/manage_passwords_referrer.h

package org.chromium.chrome.browser.password_manager;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ManagePasswordsReferrer.CHROME_SETTINGS, ManagePasswordsReferrer.MANAGE_PASSWORDS_BUBBLE,
    ManagePasswordsReferrer.PASSWORD_CONTEXT_MENU, ManagePasswordsReferrer.PASSWORD_DROPDOWN,
    ManagePasswordsReferrer.PASSWORD_GENERATION_CONFIRMATION,
    ManagePasswordsReferrer.PROFILE_CHOOSER, ManagePasswordsReferrer.PASSWORDS_ACCESSORY_SHEET,
    ManagePasswordsReferrer.TOUCH_TO_FILL, ManagePasswordsReferrer.SAFE_STATE_BUBBLE,
    ManagePasswordsReferrer.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface ManagePasswordsReferrer {
  /**
   * Corresponds to Chrome's settings page.
   */
  int CHROME_SETTINGS = 0;
  /**
   * Corresponds to the manage passwords bubble when clicking the key icon. Only used on desktop.
   */
  int MANAGE_PASSWORDS_BUBBLE = 1;
  /**
   * Corresponds to the context menu following a right click into a password field. Only used on
   * desktop.
   */
  int PASSWORD_CONTEXT_MENU = 2;
  /**
   * Corresponds to the password dropdown shown when clicking into a password field.
   */
  int PASSWORD_DROPDOWN = 3;
  /**
   * Corresponds to the bubble shown when clicking the key icon after a password was generated.
   */
  int PASSWORD_GENERATION_CONFIRMATION = 4;
  /**
   * Corresponds to the profile chooser next to the omnibar ("Autofill Home"). Only used on desktop.
   */
  int PROFILE_CHOOSER = 5;
  /**
   * Corresponds to the passwords accessory sheet on Android, triggered by tapping on the key icon
   * above in the keyboard accessory bar. Only used on Android.
   */
  int PASSWORDS_ACCESSORY_SHEET = 6;
  /**
   * Corresponds to the touch to fill bottom sheet that replaces the dropdown. Only used on Android.
   */
  int TOUCH_TO_FILL = 7;
  /**
   * The bubble notifying the user that the last compromised password was updated.
   */
  int SAFE_STATE_BUBBLE = 8;
  int MAX_VALUE = SAFE_STATE_BUBBLE;
}
