
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/notifications/notification_channels_provider_android.h

package org.chromium.chrome.browser.notifications;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    NotificationChannelStatus.ENABLED, NotificationChannelStatus.BLOCKED,
    NotificationChannelStatus.UNAVAILABLE
})
@Retention(RetentionPolicy.SOURCE)
public @interface NotificationChannelStatus {
  int ENABLED = 0;
  int BLOCKED = 1;
  int UNAVAILABLE = 2;
}
