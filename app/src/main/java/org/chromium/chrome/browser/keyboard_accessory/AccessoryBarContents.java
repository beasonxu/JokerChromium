
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/password_manager/android/password_accessory_metrics_util.h

package org.chromium.chrome.browser.keyboard_accessory;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AccessoryBarContents.NO_CONTENTS, AccessoryBarContents.ANY_CONTENTS,
    AccessoryBarContents.WITH_TABS, AccessoryBarContents.WITH_ACTIONS,
    AccessoryBarContents.WITH_AUTOFILL_SUGGESTIONS, AccessoryBarContents.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface AccessoryBarContents {
  int NO_CONTENTS = 0;
  int ANY_CONTENTS = 1;
  int WITH_TABS = 2;
  int WITH_ACTIONS = 3;
  int WITH_AUTOFILL_SUGGESTIONS = 4;
  int COUNT = 5;
}
