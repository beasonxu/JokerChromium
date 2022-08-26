
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/continuous_search/page_category.h

package org.chromium.chrome.browser.continuous_search;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PageCategory.ORGANIC_SRP, PageCategory.NEWS_SRP, PageCategory.DISCOVER_DEPRECATED,
    PageCategory.NONE
})
@Retention(RetentionPolicy.SOURCE)
public @interface PageCategory {
  int ORGANIC_SRP = 0;
  int NEWS_SRP = 1;
  int DISCOVER_DEPRECATED = 2;
  int NONE = 3;
}