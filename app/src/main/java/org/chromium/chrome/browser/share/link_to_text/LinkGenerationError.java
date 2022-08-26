
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/shared_highlighting/core/common/shared_highlighting_metrics.h

package org.chromium.chrome.browser.share.link_to_text;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    LinkGenerationError.NONE, LinkGenerationError.INCORRECT_SELECTOR, LinkGenerationError.NO_RANGE,
    LinkGenerationError.NO_CONTEXT, LinkGenerationError.CONTEXT_EXHAUSTED,
    LinkGenerationError.CONTEXT_LIMIT_REACHED, LinkGenerationError.EMPTY_SELECTION,
    LinkGenerationError.TAB_HIDDEN, LinkGenerationError.OMNIBOX_NAVIGATION,
    LinkGenerationError.TAB_CRASH, LinkGenerationError.UNKNOWN, LinkGenerationError.I_FRAME,
    LinkGenerationError.TIMEOUT, LinkGenerationError.BLOCK_LIST,
    LinkGenerationError.NO_REMOTE_CONNECTION, LinkGenerationError.NOT_GENERATED,
    LinkGenerationError.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface LinkGenerationError {
  int NONE = -1;
  int INCORRECT_SELECTOR = 0;
  int NO_RANGE = 1;
  int NO_CONTEXT = 2;
  int CONTEXT_EXHAUSTED = 3;
  int CONTEXT_LIMIT_REACHED = 4;
  int EMPTY_SELECTION = 5;
  /**
   * Android specific.
   */
  int TAB_HIDDEN = 6;
  int OMNIBOX_NAVIGATION = 7;
  int TAB_CRASH = 8;
  /**
   * Catch-all bucket.
   */
  int UNKNOWN = 9;
  /**
   * Selection happened on iframe.
   */
  int I_FRAME = 10;
  /**
   * Timed-out waiting for a link to be generated.
   */
  int TIMEOUT = 11;
  /**
   * Link generation is not triggered because current page is not supported. Recorded on
   * Android/Desktop.
   */
  int BLOCK_LIST = 12;
  /**
   * Link to text cannot be requested because connection with the renderer side cannot be
   * established. Android only.
   */
  int NO_REMOTE_CONNECTION = 13;
  /**
   * TODO(crbug.com/1301794): This shouldn't happen, but sometimes browser side requests link to
   * text when generation was never started.
   */
  int NOT_GENERATED = 14;
  int MAX_VALUE = NOT_GENERATED;
}