
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../base/android/child_process_binding_types.h

package org.chromium.base;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ChildBindingState.UNBOUND, ChildBindingState.WAIVED, ChildBindingState.MODERATE,
    ChildBindingState.STRONG, ChildBindingState.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface ChildBindingState {
  int UNBOUND = 0;
  int WAIVED = 1;
  int MODERATE = 2;
  int STRONG = 3;
  int MAX_VALUE = 3;
}
