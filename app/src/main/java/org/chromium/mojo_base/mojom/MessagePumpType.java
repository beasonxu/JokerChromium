// MessagePumpType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/message_pump_type.mojom
//

package org.chromium.mojo_base.mojom;

import androidx.annotation.IntDef;

public final class MessagePumpType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        MessagePumpType.DEFAULT,
        MessagePumpType.UI,
        MessagePumpType.CUSTOM,
        MessagePumpType.IO,
        MessagePumpType.JAVA})
    public @interface EnumType {}

    public static final int DEFAULT = 0;
    public static final int UI = 1;
    public static final int CUSTOM = 2;
    public static final int IO = 3;
    public static final int JAVA = 4;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 4;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 4;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private MessagePumpType() {}
}