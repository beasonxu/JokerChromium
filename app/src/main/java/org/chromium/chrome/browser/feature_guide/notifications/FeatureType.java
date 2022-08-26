
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/feature_guide/notifications/feature_type.h

package org.chromium.chrome.browser.feature_guide.notifications;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    FeatureType.TEST, FeatureType.INVALID, FeatureType.DEFAULT_BROWSER, FeatureType.SIGN_IN,
    FeatureType.INCOGNITO_TAB, FeatureType.NTP_SUGGESTION_CARD, FeatureType.VOICE_SEARCH,
    FeatureType.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface FeatureType {
  int TEST = -1;
  int INVALID = 0;
  int DEFAULT_BROWSER = 1;
  int SIGN_IN = 2;
  int INCOGNITO_TAB = 3;
  int NTP_SUGGESTION_CARD = 4;
  int VOICE_SEARCH = 5;
  int MAX_VALUE = VOICE_SEARCH;
}