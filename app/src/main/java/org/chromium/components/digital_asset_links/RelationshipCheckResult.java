
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/digital_asset_links/digital_asset_links_handler.h

package org.chromium.components.digital_asset_links;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    RelationshipCheckResult.SUCCESS, RelationshipCheckResult.FAILURE,
    RelationshipCheckResult.NO_CONNECTION
})
@Retention(RetentionPolicy.SOURCE)
public @interface RelationshipCheckResult {
  int SUCCESS = 0;
  int FAILURE = 1;
  int NO_CONNECTION = 2;
}