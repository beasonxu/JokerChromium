
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/webapk/webapk_installer.h

package org.chromium.chrome.browser.webapps;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SpaceStatus.ENOUGH_SPACE, SpaceStatus.ENOUGH_SPACE_AFTER_FREE_UP_CACHE,
    SpaceStatus.NOT_ENOUGH_SPACE, SpaceStatus.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface SpaceStatus {
  int ENOUGH_SPACE = 0;
  int ENOUGH_SPACE_AFTER_FREE_UP_CACHE = 1;
  int NOT_ENOUGH_SPACE = 2;
  int COUNT = 3;
}
