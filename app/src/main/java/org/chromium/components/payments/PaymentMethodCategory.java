
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/payments/core/journey_logger.h

package org.chromium.components.payments;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PaymentMethodCategory.BASIC_CARD, PaymentMethodCategory.GOOGLE,
    PaymentMethodCategory.PLAY_BILLING, PaymentMethodCategory.SECURE_PAYMENT_CONFIRMATION,
    PaymentMethodCategory.OTHER, PaymentMethodCategory.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface PaymentMethodCategory {
  int BASIC_CARD = 0;
  int GOOGLE = 1;
  int PLAY_BILLING = 2;
  int SECURE_PAYMENT_CONFIRMATION = 3;
  int OTHER = 4;
  int MAX_VALUE = OTHER;
}
