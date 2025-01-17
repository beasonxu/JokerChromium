
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/vr/ui_test_input.h

package org.chromium.chrome.browser.vr;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    UserFriendlyElementName.NONE, UserFriendlyElementName.CURRENT_POSITION,
    UserFriendlyElementName.URL, UserFriendlyElementName.BACK_BUTTON,
    UserFriendlyElementName.FORWARD_BUTTON, UserFriendlyElementName.RELOAD_BUTTON,
    UserFriendlyElementName.OVERFLOW_MENU, UserFriendlyElementName.PAGE_INFO_BUTTON,
    UserFriendlyElementName.BROWSING_DIALOG, UserFriendlyElementName.CONTENT_QUAD,
    UserFriendlyElementName.NEW_INCOGNITO_TAB, UserFriendlyElementName.CLOSE_INCOGNITO_TABS,
    UserFriendlyElementName.EXIT_PROMPT, UserFriendlyElementName.SUGGESTION_BOX,
    UserFriendlyElementName.OMNIBOX_TEXT_FIELD, UserFriendlyElementName.OMNIBOX_CLOSE_BUTTON,
    UserFriendlyElementName.OMNIBOX_VOICE_INPUT_BUTTON,
    UserFriendlyElementName.VOICE_INPUT_CLOSE_BUTTON, UserFriendlyElementName.APP_BUTTON_EXIT_TOAST,
    UserFriendlyElementName.WEB_XR_AUDIO_INDICATOR, UserFriendlyElementName.WEB_XR_HOSTED_CONTENT,
    UserFriendlyElementName.MICROPHONE_PERMISSION_INDICATOR,
    UserFriendlyElementName.WEB_XR_EXTERNAL_PROMPT_NOTIFICATION,
    UserFriendlyElementName.CAMERA_PERMISSION_INDICATOR,
    UserFriendlyElementName.LOCATION_PERMISSION_INDICATOR,
    UserFriendlyElementName.WEB_XR_LOCATION_PERMISSION_INDICATOR,
    UserFriendlyElementName.WEB_XR_VIDEO_PERMISSION_INDICATOR
})
@Retention(RetentionPolicy.SOURCE)
public @interface UserFriendlyElementName {
  int NONE = 0;
  /**
   * straight forward.
   */
  int CURRENT_POSITION = 1;
  /**
   * remain where it is.
   */
  int URL = 2;
  int BACK_BUTTON = 3;
  int FORWARD_BUTTON = 4;
  int RELOAD_BUTTON = 5;
  int OVERFLOW_MENU = 6;
  int PAGE_INFO_BUTTON = 7;
  int BROWSING_DIALOG = 8;
  int CONTENT_QUAD = 9;
  int NEW_INCOGNITO_TAB = 10;
  int CLOSE_INCOGNITO_TABS = 11;
  /**
   * menu
   */
  int EXIT_PROMPT = 12;
  int SUGGESTION_BOX = 13;
  int OMNIBOX_TEXT_FIELD = 14;
  /**
   * URL bar is clicked.
   */
  int OMNIBOX_CLOSE_BUTTON = 15;
  int OMNIBOX_VOICE_INPUT_BUTTON = 16;
  /**
   * enters voice input mode.
   */
  int VOICE_INPUT_CLOSE_BUTTON = 17;
  /**
   * the user back to text entry mode.
   */
  int APP_BUTTON_EXIT_TOAST = 18;
  /**
   * an immersive session.
   */
  int WEB_XR_AUDIO_INDICATOR = 19;
  /**
   * is in use.
   */
  int WEB_XR_HOSTED_CONTENT = 20;
  /**
   * permission prompts.
   */
  int MICROPHONE_PERMISSION_INDICATOR = 21;
  /**
   * page is using the microphone permission.
   */
  int WEB_XR_EXTERNAL_PROMPT_NOTIFICATION = 22;
  /**
   * if a permission is requested while in immersive WebXR session.
   */
  int CAMERA_PERMISSION_INDICATOR = 23;
  /**
   * using the camera permission.
   */
  int LOCATION_PERMISSION_INDICATOR = 24;
  /**
   * is using the high accuracy location permission.
   */
  int WEB_XR_LOCATION_PERMISSION_INDICATOR = 25;
  /**
   * page is using the location permission.
   */
  int WEB_XR_VIDEO_PERMISSION_INDICATOR = 26;
}
