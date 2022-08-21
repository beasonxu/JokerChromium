// Direct3DFeatureLevel.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/device_perf_info.mojom
//

package org.chromium.gpu.mojom;

import androidx.annotation.IntDef;

public final class Direct3DFeatureLevel {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        Direct3DFeatureLevel.K1_0_CORE,
        Direct3DFeatureLevel.K9_1,
        Direct3DFeatureLevel.K9_2,
        Direct3DFeatureLevel.K9_3,
        Direct3DFeatureLevel.K10_0,
        Direct3DFeatureLevel.K10_1,
        Direct3DFeatureLevel.K11_0,
        Direct3DFeatureLevel.K11_1,
        Direct3DFeatureLevel.K12_0,
        Direct3DFeatureLevel.K12_1,
        Direct3DFeatureLevel.K12_2})
    public @interface EnumType {}

    public static final int K1_0_CORE = 0;
    public static final int K9_1 = 1;
    public static final int K9_2 = 2;
    public static final int K9_3 = 3;
    public static final int K10_0 = 4;
    public static final int K10_1 = 5;
    public static final int K11_0 = 6;
    public static final int K11_1 = 7;
    public static final int K12_0 = 8;
    public static final int K12_1 = 9;
    public static final int K12_2 = 10;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 10;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 10;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private Direct3DFeatureLevel() {}
}