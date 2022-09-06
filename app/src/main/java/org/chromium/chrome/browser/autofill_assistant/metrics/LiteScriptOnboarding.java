
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/autofill_assistant/browser/metrics.h

package org.chromium.chrome.browser.autofill_assistant.metrics;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    LiteScriptOnboarding.LITE_SCRIPT_ONBOARDING_SEEN_AND_ACCEPTED,
    LiteScriptOnboarding.LITE_SCRIPT_ONBOARDING_SEEN_AND_REJECTED,
    LiteScriptOnboarding.LITE_SCRIPT_ONBOARDING_ALREADY_ACCEPTED,
    LiteScriptOnboarding.LITE_SCRIPT_ONBOARDING_SEEN_AND_DISMISSED,
    LiteScriptOnboarding.LITE_SCRIPT_ONBOARDING_SEEN_AND_INTERRUPTED_BY_NAVIGATION,
    LiteScriptOnboarding.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface LiteScriptOnboarding {
  /**
   * The user has seen and accepted the onboarding.
   */
  int LITE_SCRIPT_ONBOARDING_SEEN_AND_ACCEPTED = 0;
  /**
   * The user has seen and rejected the onboarding.
   */
  int LITE_SCRIPT_ONBOARDING_SEEN_AND_REJECTED = 1;
  /**
   * The user has already accepted the onboarding in the past.
   */
  int LITE_SCRIPT_ONBOARDING_ALREADY_ACCEPTED = 2;
  /**
   * The user has seen and dismissed the onboarding.
   */
  int LITE_SCRIPT_ONBOARDING_SEEN_AND_DISMISSED = 3;
  /**
   * The onboarding was interrupted by a website navigation.
   */
  int LITE_SCRIPT_ONBOARDING_SEEN_AND_INTERRUPTED_BY_NAVIGATION = 4;
  int MAX_VALUE = LITE_SCRIPT_ONBOARDING_SEEN_AND_INTERRUPTED_BY_NAVIGATION;
}
