// PushErrorType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/push_messaging/push_messaging.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class PushErrorType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        PushErrorType.ABORT,
        PushErrorType.NETWORK,
        PushErrorType.NONE,
        PushErrorType.NOT_ALLOWED,
        PushErrorType.NOT_FOUND,
        PushErrorType.NOT_SUPPORTED,
        PushErrorType.INVALID_STATE})
    public @interface EnumType {}

    public static final int ABORT = 0;
    public static final int NETWORK = 1;
    public static final int NONE = 2;
    public static final int NOT_ALLOWED = 3;
    public static final int NOT_FOUND = 4;
    public static final int NOT_SUPPORTED = 5;
    public static final int INVALID_STATE = 6;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 6;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 6;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private PushErrorType() {}
}