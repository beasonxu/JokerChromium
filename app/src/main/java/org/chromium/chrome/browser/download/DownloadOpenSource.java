
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/download/android/download_open_source.h

package org.chromium.chrome.browser.download;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    DownloadOpenSource.UNKNOWN, DownloadOpenSource.ANDROID_DOWNLOAD_MANAGER,
    DownloadOpenSource.DOWNLOAD_HOME, DownloadOpenSource.NOTIFICATION,
    DownloadOpenSource.NEW_TAB_PAGE, DownloadOpenSource.INFO_BAR, DownloadOpenSource.SNACK_BAR,
    DownloadOpenSource.AUTO_OPEN, DownloadOpenSource.DOWNLOAD_PROGRESS_INFO_BAR,
    DownloadOpenSource.MENU, DownloadOpenSource.DINO_PAGE_OFFLINE_CONTENT,
    DownloadOpenSource.OFFLINE_INDICATOR, DownloadOpenSource.OFFLINE_CONTENT_NOTIFICATION,
    DownloadOpenSource.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface DownloadOpenSource {
  /**
   * The action source is unknown.
   */
  int UNKNOWN = 0;
  /**
   * Android DownloadManager.
   */
  int ANDROID_DOWNLOAD_MANAGER = 1;
  /**
   * Download home page.
   */
  int DOWNLOAD_HOME = 2;
  /**
   * Android download notification.
   */
  int NOTIFICATION = 3;
  /**
   * New tab page.
   */
  int NEW_TAB_PAGE = 4;
  /**
   * Download info bar.
   */
  int INFO_BAR = 5;
  /**
   * Download snack bar.
   */
  int SNACK_BAR = 6;
  /**
   * Download is auto opened after completion.
   */
  int AUTO_OPEN = 7;
  /**
   * Download progress info bar.
   */
  int DOWNLOAD_PROGRESS_INFO_BAR = 8;
  /**
   * Main menu.
   */
  int MENU = 9;
  /**
   * Offline content on Dino page
   */
  int DINO_PAGE_OFFLINE_CONTENT = 10;
  /**
   * Offline indicator.
   */
  int OFFLINE_INDICATOR = 11;
  /**
   * Android notification for offline content.
   */
  int OFFLINE_CONTENT_NOTIFICATION = 12;
  int MAX_VALUE = OFFLINE_CONTENT_NOTIFICATION;
}
