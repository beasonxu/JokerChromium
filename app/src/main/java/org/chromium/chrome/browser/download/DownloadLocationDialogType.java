
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/download/download_dialog_types.h

package org.chromium.chrome.browser.download;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    DownloadLocationDialogType.NO_DIALOG, DownloadLocationDialogType.DEFAULT,
    DownloadLocationDialogType.LOCATION_FULL, DownloadLocationDialogType.LOCATION_NOT_FOUND,
    DownloadLocationDialogType.NAME_CONFLICT, DownloadLocationDialogType.NAME_TOO_LONG,
    DownloadLocationDialogType.LOCATION_SUGGESTION, DownloadLocationDialogType.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface DownloadLocationDialogType {
  int NO_DIALOG = 0;
  int DEFAULT = 1;
  int LOCATION_FULL = 2;
  int LOCATION_NOT_FOUND = 3;
  int NAME_CONFLICT = 4;
  int NAME_TOO_LONG = 5;
  int LOCATION_SUGGESTION = 6;
  int MAX_VALUE = LOCATION_SUGGESTION;
}
