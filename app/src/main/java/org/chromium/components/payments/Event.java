
// Copyright 2021 The Chromium Authors. All rights reserved.
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
    Event.INITIATED, Event.SHOWN, Event.PAY_CLICKED, Event.RECEIVED_INSTRUMENT_DETAILS,
    Event.SKIPPED_SHOW, Event.COMPLETED, Event.USER_ABORTED, Event.OTHER_ABORTED,
    Event.HAD_INITIAL_FORM_OF_PAYMENT, Event.HAD_NECESSARY_COMPLETE_SUGGESTIONS,
    Event.CAN_MAKE_PAYMENT_TRUE, Event.CAN_MAKE_PAYMENT_FALSE, Event.REQUEST_SHIPPING,
    Event.REQUEST_PAYER_NAME, Event.REQUEST_PAYER_EMAIL, Event.REQUEST_PAYER_PHONE,
    Event.REQUEST_METHOD_BASIC_CARD, Event.REQUEST_METHOD_GOOGLE, Event.REQUEST_METHOD_OTHER,
    Event.SELECTED_CREDIT_CARD, Event.SELECTED_GOOGLE, Event.SELECTED_OTHER,
    Event.HAS_ENROLLED_INSTRUMENT_TRUE, Event.HAS_ENROLLED_INSTRUMENT_FALSE, Event.COULD_NOT_SHOW,
    Event.NEEDS_COMPLETION_CONTACT_INFO, Event.NEEDS_COMPLETION_PAYMENT,
    Event.NEEDS_COMPLETION_SHIPPING, Event.AVAILABLE_METHOD_BASIC_CARD,
    Event.AVAILABLE_METHOD_GOOGLE, Event.AVAILABLE_METHOD_OTHER,
    Event.REQUEST_METHOD_SECURE_PAYMENT_CONFIRMATION, Event.SELECTED_SECURE_PAYMENT_CONFIRMATION,
    Event.ENUM_MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface Event {
  /**
   * Initiated means the PaymentRequest object was constructed.
   */
  int INITIATED = 0;
  /**
   * PaymentRequest was triggered via .show() and a native UI was shown.
   */
  int SHOWN = 1 << 0;
  int PAY_CLICKED = 1 << 1;
  int RECEIVED_INSTRUMENT_DETAILS = 1 << 2;
  /**
   * PaymentRequest was triggered via .show() and no UI was shown because we skipped directly to the
   * payment app.
   */
  int SKIPPED_SHOW = 1 << 3;
  /**
   * .complete() was called by the merchant, completing the flow.
   */
  int COMPLETED = 1 << 4;
  /**
   * The user aborted the flow by either dismissing it explicitly, or navigating away (if possible).
   */
  int USER_ABORTED = 1 << 5;
  /**
   * Other reasons for aborting include the merchant calling .abort(), the merchant triggering a
   * navigation, the tab closing, the browser closing, etc. See implementation for details.
   */
  int OTHER_ABORTED = 1 << 6;
  int HAD_INITIAL_FORM_OF_PAYMENT = 1 << 7;
  int HAD_NECESSARY_COMPLETE_SUGGESTIONS = 1 << 8;
  /**
   * canMakePayment was called with a result of "true" or "false", respectively. An absence of both
   * events means canMakePayment was not called, or the user was in incognito mode.
   */
  int CAN_MAKE_PAYMENT_TRUE = 1 << 9;
  int CAN_MAKE_PAYMENT_FALSE = 1 << 10;
  /**
   * Correspond to the merchant specifying requestShipping, requestPayerName, requestPayerEmail,
   * requestPayerPhone.
   */
  int REQUEST_SHIPPING = 1 << 11;
  int REQUEST_PAYER_NAME = 1 << 12;
  int REQUEST_PAYER_EMAIL = 1 << 13;
  int REQUEST_PAYER_PHONE = 1 << 14;
  /**
   * The merchant requested at least one basic-card method.
   */
  int REQUEST_METHOD_BASIC_CARD = 1 << 15;
  /**
   * The merchant requested a Google payment method.
   */
  int REQUEST_METHOD_GOOGLE = 1 << 16;
  /**
   * The merchant requested a non-Google, non-basic-card payment method.
   */
  int REQUEST_METHOD_OTHER = 1 << 17;
  /**
   * The user initiated the transaction using a saved credit card, a Google payment app (e.g.,
   * Android Pay), or another payment instrument, respectively.
   */
  int SELECTED_CREDIT_CARD = 1 << 18;
  int SELECTED_GOOGLE = 1 << 19;
  int SELECTED_OTHER = 1 << 20;
  /**
   * hasEnrolledInstrument was called with a result of "true" or "false", respectively. An absence
   * of both events means hasEnrolledInstrument was not called, or the user was in incognito mode.
   */
  int HAS_ENROLLED_INSTRUMENT_TRUE = 1 << 21;
  int HAS_ENROLLED_INSTRUMENT_FALSE = 1 << 22;
  /**
   * True when a NotShownReason is set.
   */
  int COULD_NOT_SHOW = 1 << 23;
  int NEEDS_COMPLETION_CONTACT_INFO = 1 << 24;
  int NEEDS_COMPLETION_PAYMENT = 1 << 25;
  int NEEDS_COMPLETION_SHIPPING = 1 << 26;
  /**
   * Payment apps available (after JIT crawling) at the time show() is called.
   */
  int AVAILABLE_METHOD_BASIC_CARD = 1 << 27;
  int AVAILABLE_METHOD_GOOGLE = 1 << 28;
  int AVAILABLE_METHOD_OTHER = 1 << 29;
  /**
   * Bits for secure-payment-confirmation method.
   */
  int REQUEST_METHOD_SECURE_PAYMENT_CONFIRMATION = 1 << 30;
  int SELECTED_SECURE_PAYMENT_CONFIRMATION = 1 << 31;
  int ENUM_MAX = SELECTED_SECURE_PAYMENT_CONFIRMATION;
}