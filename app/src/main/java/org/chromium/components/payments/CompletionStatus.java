
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/payments/core/journey_logger.h

package org.chromium.components.payments;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    CompletionStatus.COMPLETED, CompletionStatus.USER_ABORTED, CompletionStatus.OTHER_ABORTED,
    CompletionStatus.COULD_NOT_SHOW, CompletionStatus.MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface CompletionStatus {
  int COMPLETED = 0;
  int USER_ABORTED = 1;
  int OTHER_ABORTED = 2;
  int COULD_NOT_SHOW = 3;
  int MAX = 4;
}
