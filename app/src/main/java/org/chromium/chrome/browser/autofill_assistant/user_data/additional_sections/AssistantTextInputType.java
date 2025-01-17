
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/autofill_assistant/browser/user_data.h

package org.chromium.chrome.browser.autofill_assistant.user_data.additional_sections;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AssistantTextInputType.INPUT_TEXT, AssistantTextInputType.INPUT_ALPHANUMERIC
})
@Retention(RetentionPolicy.SOURCE)
public @interface AssistantTextInputType {
  int INPUT_TEXT = 0;
  int INPUT_ALPHANUMERIC = 1;
}
