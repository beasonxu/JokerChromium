
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/public/browser/contacts_picker_properties_requested.h

package org.chromium.content.browser.contacts;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ContactsPickerPropertiesRequested.PROPERTIES_NONE,
    ContactsPickerPropertiesRequested.PROPERTIES_TELS,
    ContactsPickerPropertiesRequested.PROPERTIES_EMAILS,
    ContactsPickerPropertiesRequested.PROPERTIES_NAMES,
    ContactsPickerPropertiesRequested.PROPERTIES_ADDRESSES,
    ContactsPickerPropertiesRequested.PROPERTIES_ICONS,
    ContactsPickerPropertiesRequested.PROPERTIES_BOUNDARY
})
@Retention(RetentionPolicy.SOURCE)
public @interface ContactsPickerPropertiesRequested {
  int PROPERTIES_NONE = 0;
  int PROPERTIES_TELS = 1 << 0;
  int PROPERTIES_EMAILS = 1 << 1;
  int PROPERTIES_NAMES = 1 << 2;
  int PROPERTIES_ADDRESSES = 1 << 3;
  int PROPERTIES_ICONS = 1 << 4;
  int PROPERTIES_BOUNDARY = 1 << 5;
}