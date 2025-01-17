
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/offline_pages/offline_page_utils.h

package org.chromium.chrome.browser.offlinepages;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    DownloadUiActionFlags.NONE, DownloadUiActionFlags.PROMPT_DUPLICATE,
    DownloadUiActionFlags.SHOW_TOAST_ON_NEW_DOWNLOAD, DownloadUiActionFlags.ALL
})
@Retention(RetentionPolicy.SOURCE)
public @interface DownloadUiActionFlags {
  int NONE = 0x0;
  /**
   * Shows an infobar to prompt the user for re-download when the duplicate page or request is
   * found.
   */
  int PROMPT_DUPLICATE = 0x1;
  /**
   * Shows a toast when the new download starts.
   */
  int SHOW_TOAST_ON_NEW_DOWNLOAD = 0x2;
  /**
   * All actions.
   */
  int ALL = 0xFFFF;
}
