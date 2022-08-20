// LoadTimingInfoConnectTiming.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/load_timing_info.mojom
//

package org.chromium.network.mojom;


public final class LoadTimingInfoConnectTiming extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo_base.mojom.TimeTicks dnsStart;
    public org.chromium.mojo_base.mojom.TimeTicks dnsEnd;
    public org.chromium.mojo_base.mojom.TimeTicks connectStart;
    public org.chromium.mojo_base.mojom.TimeTicks connectEnd;
    public org.chromium.mojo_base.mojom.TimeTicks sslStart;
    public org.chromium.mojo_base.mojom.TimeTicks sslEnd;

    private LoadTimingInfoConnectTiming(int version) {
        super(STRUCT_SIZE, version);
    }

    public LoadTimingInfoConnectTiming() {
        this(0);
    }

    public static LoadTimingInfoConnectTiming deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static LoadTimingInfoConnectTiming deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static LoadTimingInfoConnectTiming decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        LoadTimingInfoConnectTiming result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new LoadTimingInfoConnectTiming(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.dnsStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.dnsEnd = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.connectStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.connectEnd = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.sslStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.sslEnd = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
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
        
        encoder0.encode(this.dnsStart, 8, false);
        
        encoder0.encode(this.dnsEnd, 16, false);
        
        encoder0.encode(this.connectStart, 24, false);
        
        encoder0.encode(this.connectEnd, 32, false);
        
        encoder0.encode(this.sslStart, 40, false);
        
        encoder0.encode(this.sslEnd, 48, false);
    }
}