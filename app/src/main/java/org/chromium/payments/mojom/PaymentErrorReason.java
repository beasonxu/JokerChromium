// PaymentErrorReason.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/payments/payment_request.mojom
//

package org.chromium.payments.mojom;

import androidx.annotation.IntDef;

public final class PaymentErrorReason {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        PaymentErrorReason.UNKNOWN,
        PaymentErrorReason.USER_CANCEL,
        PaymentErrorReason.NOT_SUPPORTED,
        PaymentErrorReason.NOT_SUPPORTED_FOR_INVALID_ORIGIN_OR_SSL,
        PaymentErrorReason.ALREADY_SHOWING,
        PaymentErrorReason.INVALID_DATA_FROM_RENDERER,
        PaymentErrorReason.NOT_ALLOWED_ERROR,
        PaymentErrorReason.USER_OPT_OUT})
    public @interface EnumType {}

    public static final int UNKNOWN = 0;
    public static final int USER_CANCEL = 1;
    public static final int NOT_SUPPORTED = 2;
    public static final int NOT_SUPPORTED_FOR_INVALID_ORIGIN_OR_SSL = 3;
    public static final int ALREADY_SHOWING = 4;
    public static final int INVALID_DATA_FROM_RENDERER = 5;
    public static final int NOT_ALLOWED_ERROR = 6;
    public static final int USER_OPT_OUT = 7;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 7;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 7;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private PaymentErrorReason() {}
}