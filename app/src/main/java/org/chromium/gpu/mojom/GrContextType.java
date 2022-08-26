// GrContextType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/gpu_preferences.mojom
//

package org.chromium.gpu.mojom;

import androidx.annotation.IntDef;

public final class GrContextType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        GrContextType.GL,
        GrContextType.VULKAN,
        GrContextType.METAL,
        GrContextType.DAWN,
        GrContextType.LAST})
    public @interface EnumType {}

    public static final int GL = 0;
    public static final int VULKAN = 1;
    public static final int METAL = 2;
    public static final int DAWN = 3;
    public static final int LAST = 3;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 3;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 3;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private GrContextType() {}
}