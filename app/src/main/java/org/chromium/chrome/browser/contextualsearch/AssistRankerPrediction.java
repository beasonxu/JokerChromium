
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/contextualsearch/contextual_search_ranker_logger_impl.h

package org.chromium.chrome.browser.contextualsearch;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AssistRankerPrediction.UNDETERMINED, AssistRankerPrediction.UNAVAILABLE,
    AssistRankerPrediction.SUPPRESS, AssistRankerPrediction.SHOW
})
@Retention(RetentionPolicy.SOURCE)
public @interface AssistRankerPrediction {
  int UNDETERMINED = 0;
  int UNAVAILABLE = 1;
  int SUPPRESS = 2;
  int SHOW = 3;
}
