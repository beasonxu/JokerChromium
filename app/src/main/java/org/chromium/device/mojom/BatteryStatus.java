// BatteryStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/battery_status.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public final class BatteryStatus extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean charging;
    public double chargingTime;
    public double dischargingTime;
    public double level;

    private BatteryStatus(int version) {
        super(STRUCT_SIZE, version);
        this.charging = (boolean) true;
        this.chargingTime = (double) 0.0;
        this.dischargingTime = (double) java.lang.Double.POSITIVE_INFINITY;
        this.level = (double) 1.0;
    }

    public BatteryStatus() {
        this(0);
    }

    public static BatteryStatus deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static BatteryStatus deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static BatteryStatus decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        BatteryStatus result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new BatteryStatus(elementsOrVersion);
                {
                    
                result.charging = decoder0.readBoolean(8, 0);
                }
                {
                    
                result.chargingTime = decoder0.readDouble(16);
                }
                {
                    
                result.dischargingTime = decoder0.readDouble(24);
                }
                {
                    
                result.level = decoder0.readDouble(32);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.charging, 8, 0);
        
        encoder0.encode(this.chargingTime, 16);
        
        encoder0.encode(this.dischargingTime, 24);
        
        encoder0.encode(this.level, 32);
    }
}