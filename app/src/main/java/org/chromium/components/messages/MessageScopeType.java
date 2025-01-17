
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/messages/android/message_enums.h

package org.chromium.components.messages;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    MessageScopeType.WINDOW, MessageScopeType.WEB_CONTENTS, MessageScopeType.NAVIGATION
})
@Retention(RetentionPolicy.SOURCE)
public @interface MessageScopeType {
  int WINDOW = 0;
  int WEB_CONTENTS = 1;
  int NAVIGATION = 2;
}
