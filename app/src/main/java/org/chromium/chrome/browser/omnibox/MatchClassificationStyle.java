
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/omnibox/browser/autocomplete_match.h

package org.chromium.chrome.browser.omnibox;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    MatchClassificationStyle.NONE, MatchClassificationStyle.URL, MatchClassificationStyle.MATCH,
    MatchClassificationStyle.DIM
})
@Retention(RetentionPolicy.SOURCE)
public @interface MatchClassificationStyle {
  int NONE = 0;
  int URL = 1 << 0;
  int MATCH = 1 << 1;
  int DIM = 1 << 2;
}
