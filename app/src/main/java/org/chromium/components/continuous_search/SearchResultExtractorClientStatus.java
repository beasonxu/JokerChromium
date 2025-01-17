
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/continuous_search/browser/search_result_extractor_client_status.h

package org.chromium.components.continuous_search;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SearchResultExtractorClientStatus.SUCCESS, SearchResultExtractorClientStatus.NO_RESULTS,
    SearchResultExtractorClientStatus.UNEXPECTED_URL,
    SearchResultExtractorClientStatus.WEB_CONTENTS_GONE,
    SearchResultExtractorClientStatus.NATIVE_NOT_INITIALIZED,
    SearchResultExtractorClientStatus.ALREADY_CAPTURING,
    SearchResultExtractorClientStatus.WEB_CONTENTS_HAS_NON_SRP_URL
})
@Retention(RetentionPolicy.SOURCE)
public @interface SearchResultExtractorClientStatus {
  int SUCCESS = 0;
  int NO_RESULTS = 1;
  int UNEXPECTED_URL = 2;
  int WEB_CONTENTS_GONE = 3;
  int NATIVE_NOT_INITIALIZED = 4;
  int ALREADY_CAPTURING = 5;
  int WEB_CONTENTS_HAS_NON_SRP_URL = 6;
}
