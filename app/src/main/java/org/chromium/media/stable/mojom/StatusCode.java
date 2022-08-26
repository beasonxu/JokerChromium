// StatusCode.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/stable/stable_video_decoder_types.mojom
//

package org.chromium.media.stable.mojom;

import androidx.annotation.IntDef;

public final class StatusCode {
    private static final boolean IS_EXTENSIBLE = true;
    @IntDef({

        StatusCode.OK,
        StatusCode.ABORTED,
        StatusCode.ERROR})
    public @interface EnumType {}

    public static final int OK = 0;
    public static final int ABORTED = 1;
    public static final int ERROR = 2;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 2;
    public static final int DEFAULT_VALUE = 2;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 2;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      if (isKnownValue(value)) {
        return value;
      }
      return DEFAULT_VALUE;
    }

    private StatusCode() {}
}