
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/image_fetcher/core/image_fetcher_service.h

package org.chromium.chrome.browser.image_fetcher;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ImageFetcherConfig.NETWORK_ONLY, ImageFetcherConfig.DISK_CACHE_ONLY,
    ImageFetcherConfig.IN_MEMORY_ONLY, ImageFetcherConfig.IN_MEMORY_WITH_DISK_CACHE,
    ImageFetcherConfig.REDUCED_MODE, ImageFetcherConfig.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface ImageFetcherConfig {
  int NETWORK_ONLY = 0;
  int DISK_CACHE_ONLY = 1;
  /**
   * In memory cache without disk caching. Currently only available in Java.
   */
  int IN_MEMORY_ONLY = 2;
  /**
   * In memory cache with disk caching. Currently only available in Java.
   */
  int IN_MEMORY_WITH_DISK_CACHE = 3;
  /**
   * Deferring image transcoding when fetching. This is because utility process isn't created in the
   * reduced mode, thus the image decoding in the utility process is deferred until full browser
   * starts. The ReducedModeImageFetcher will ignore any ImageFetcherCallback which asks transcoded
   * images.
   */
  int REDUCED_MODE = 4;
  int MAX_VALUE = REDUCED_MODE;
}
