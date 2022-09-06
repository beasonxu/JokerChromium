
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/download/download_prompt_status.h

package org.chromium.chrome.browser.download;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    DownloadLaterPromptStatus.SHOW_INITIAL, DownloadLaterPromptStatus.SHOW_PREFERENCE,
    DownloadLaterPromptStatus.DONT_SHOW, DownloadLaterPromptStatus.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface DownloadLaterPromptStatus {
  int SHOW_INITIAL = 0;
  int SHOW_PREFERENCE = 1;
  int DONT_SHOW = 2;
  int MAX_VALUE = 2;
}
