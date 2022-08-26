
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/signin/public/base/signin_metrics.h

package org.chromium.components.signin.metrics;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    FetchAccountCapabilitiesFromSystemLibraryResult.SUCCESS,
    FetchAccountCapabilitiesFromSystemLibraryResult.ERROR_GENERIC,
    FetchAccountCapabilitiesFromSystemLibraryResult.API_REQUEST_FAILED,
    FetchAccountCapabilitiesFromSystemLibraryResult.API_ERROR,
    FetchAccountCapabilitiesFromSystemLibraryResult.API_NOT_PERMITTED,
    FetchAccountCapabilitiesFromSystemLibraryResult.API_UNKNOWN_CAPABILITY,
    FetchAccountCapabilitiesFromSystemLibraryResult.API_FAILED_TO_SYNC,
    FetchAccountCapabilitiesFromSystemLibraryResult.API_NOT_AVAILABLE,
    FetchAccountCapabilitiesFromSystemLibraryResult.ERROR_MISSING_CAPABILITY,
    FetchAccountCapabilitiesFromSystemLibraryResult.ERROR_UNEXPECTED_VALUE,
    FetchAccountCapabilitiesFromSystemLibraryResult.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface FetchAccountCapabilitiesFromSystemLibraryResult {
  /**
   * Errors common to iOS and Android.
   */
  int SUCCESS = 0;
  int ERROR_GENERIC = 1;
  /**
   * Errors from 10 to 19 are reserved for Android.
   */
  int API_REQUEST_FAILED = 10;
  int API_ERROR = 11;
  int API_NOT_PERMITTED = 12;
  int API_UNKNOWN_CAPABILITY = 13;
  int API_FAILED_TO_SYNC = 14;
  int API_NOT_AVAILABLE = 15;
  /**
   * Errors after 20 are reserved for iOS.
   */
  int ERROR_MISSING_CAPABILITY = 20;
  int ERROR_UNEXPECTED_VALUE = 21;
  int MAX_VALUE = ERROR_UNEXPECTED_VALUE;
}
