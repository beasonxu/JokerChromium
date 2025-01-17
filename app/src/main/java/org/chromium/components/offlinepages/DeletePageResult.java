
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/offline_pages/core/offline_page_types.h

package org.chromium.components.offlinepages;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    DeletePageResult.SUCCESS, DeletePageResult.CANCELLED, DeletePageResult.STORE_FAILURE,
    DeletePageResult.DEVICE_FAILURE, DeletePageResult.DEPRECATED_NOT_FOUND,
    DeletePageResult.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface DeletePageResult {
  int SUCCESS = 0;
  int CANCELLED = 1;
  int STORE_FAILURE = 2;
  int DEVICE_FAILURE = 3;
  /**
   * Deprecated. Deleting pages which are not in metadata store would be returing |SUCCESS|. Should
   * not be used anymore.
   */
  int DEPRECATED_NOT_FOUND = 4;
  int MAX_VALUE = 4;
}
