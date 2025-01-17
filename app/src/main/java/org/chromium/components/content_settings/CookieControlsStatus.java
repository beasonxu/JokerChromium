
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/content_settings/core/common/cookie_controls_status.h

package org.chromium.components.content_settings;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    CookieControlsStatus.UNINITIALIZED, CookieControlsStatus.ENABLED, CookieControlsStatus.DISABLED,
    CookieControlsStatus.DISABLED_FOR_SITE
})
@Retention(RetentionPolicy.SOURCE)
public @interface CookieControlsStatus {
  int UNINITIALIZED = 0;
  /**
   * Third-Party cookie blocking is enabled.
   */
  int ENABLED = 1;
  /**
   * Third-Party cookie blocking is disabled.
   */
  int DISABLED = 2;
  /**
   * Third-Party cookie blocking is enabled in general but was disabled for this site.
   */
  int DISABLED_FOR_SITE = 3;
}
