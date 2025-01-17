
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/offline_items_collection/core/launch_location.h

package org.chromium.components.offline_items_collection;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    LaunchLocation.DOWNLOAD_HOME, LaunchLocation.NOTIFICATION, LaunchLocation.PROGRESS_BAR,
    LaunchLocation.SUGGESTION, LaunchLocation.NET_ERROR_SUGGESTION, LaunchLocation.DOWNLOAD_SHELF
})
@Retention(RetentionPolicy.SOURCE)
public @interface LaunchLocation {
  /**
   * From Download home.
   */
  int DOWNLOAD_HOME = 0;
  /**
   * Due to clicking a download complete notification.
   */
  int NOTIFICATION = 1;
  /**
   * Due to clicking "Open" link in the download progress bar.
   */
  int PROGRESS_BAR = 2;
  /**
   * Due to clicking a suggested item in NTP.
   */
  int SUGGESTION = 3;
  /**
   * Due to clicking a suggestion on the net error page.
   */
  int NET_ERROR_SUGGESTION = 4;
  /**
   * From Download shelf.
   */
  int DOWNLOAD_SHELF = 5;
}
