
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/signin/core/browser/signin_investigator.h

package org.chromium.signin;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    InvestigatedScenario.FIRST_SIGN_IN, InvestigatedScenario.DEPRECATED_UPGRADE_HIGH_RISK,
    InvestigatedScenario.SAME_ACCOUNT, InvestigatedScenario.DIFFERENT_ACCOUNT,
    InvestigatedScenario.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface InvestigatedScenario {
  /**
   * First signin and should not be warned. As little friction as possible should get between the
   * user and signing in.
   */
  int FIRST_SIGN_IN = 0;
  /**
   * Was never used (see crbug.com/983183, crbug.com/572754).
   */
  int DEPRECATED_UPGRADE_HIGH_RISK = 1;
  /**
   * Relogging with the same account.
   */
  int SAME_ACCOUNT = 2;
  /**
   * User is switching accounts, can be very dangerous depending on the amount of local syncable
   * data.
   */
  int DIFFERENT_ACCOUNT = 3;
  /**
   * Always the last enumerated type.
   */
  int MAX_VALUE = DIFFERENT_ACCOUNT;
}
