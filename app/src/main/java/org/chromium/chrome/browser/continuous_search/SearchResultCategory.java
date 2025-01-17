
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/continuous_search/internal/search_result_category.h

package org.chromium.chrome.browser.continuous_search;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SearchResultCategory.ORGANIC, SearchResultCategory.NEWS, SearchResultCategory.NONE
})
@Retention(RetentionPolicy.SOURCE)
public @interface SearchResultCategory {
  int ORGANIC = 0;
  int NEWS = 1;
  int NONE = 2;
}
