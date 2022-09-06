
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/password_manager/core/browser/biometric_authenticator.h

package org.chromium.chrome.browser.password_manager;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    BiometricsAvailability.AVAILABLE, BiometricsAvailability.NO_HARDWARE,
    BiometricsAvailability.NOT_ENROLLED
})
@Retention(RetentionPolicy.SOURCE)
public @interface BiometricsAvailability {
  int AVAILABLE = 0;
  int NO_HARDWARE = 1;
  int NOT_ENROLLED = 2;
}
