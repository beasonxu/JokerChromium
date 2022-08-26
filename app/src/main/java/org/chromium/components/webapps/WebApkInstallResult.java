
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/webapps/browser/android/webapk/webapk_types.h

package org.chromium.components.webapps;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    WebApkInstallResult.SUCCESS, WebApkInstallResult.FAILURE, WebApkInstallResult.PROBABLE_FAILURE,
    WebApkInstallResult.NO_INSTALLER, WebApkInstallResult.SERVER_URL_INVALID,
    WebApkInstallResult.SERVER_ERROR, WebApkInstallResult.REQUEST_TIMEOUT,
    WebApkInstallResult.REQUEST_INVALID, WebApkInstallResult.NOT_ENOUGH_SPACE,
    WebApkInstallResult.ICON_HASHER_ERROR, WebApkInstallResult.RESULT_MAX,
    WebApkInstallResult.INSTALL_ALREADY_IN_PROGRESS
})
@Retention(RetentionPolicy.SOURCE)
public @interface WebApkInstallResult {
  int SUCCESS = 0;
  /**
   * Install WebAPK with the installer service (i.e. Google Play) failed.
   */
  int FAILURE = 1;
  /**
   * An install was initiated but it timed out. We did not get a response from the install service
   * so it is possible that the install will complete some time in the future.
   */
  int PROBABLE_FAILURE = 2;
  /**
   * No install service to complete the install.
   */
  int NO_INSTALLER = 3;
  int SERVER_URL_INVALID = 4;
  /**
   * Server returns an error or unexpected result.
   */
  int SERVER_ERROR = 5;
  /**
   * Request to server timed out.
   */
  int REQUEST_TIMEOUT = 6;
  /**
   * The request proto is invalid.
   */
  int REQUEST_INVALID = 7;
  int NOT_ENOUGH_SPACE = 8;
  int ICON_HASHER_ERROR = 9;
  int RESULT_MAX = 10;
  /**
   * Indicates that the WebAPK is currently already being installed and the new install will be
   * aborted. Used when the install was initiated through the WebApkInstallCoordinator-service to
   * propagate the status to the connecting client.
   */
  int INSTALL_ALREADY_IN_PROGRESS = 11;
}