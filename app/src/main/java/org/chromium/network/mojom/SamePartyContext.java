// SamePartyContext.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cookie_manager.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public final class SamePartyContext extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int contextType;
    public int ancestorsForMetricsOnly;
    public int topResourceForMetricsOnly;

    private SamePartyContext(int version) {
        super(STRUCT_SIZE, version);
        this.contextType = (int) SamePartyCookieContextType.CROSS_PARTY;
        this.ancestorsForMetricsOnly = (int) SamePartyCookieContextType.CROSS_PARTY;
        this.topResourceForMetricsOnly = (int) SamePartyCookieContextType.CROSS_PARTY;
    }

    public SamePartyContext() {
        this(0);
    }

    public static SamePartyContext deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SamePartyContext deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SamePartyContext decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SamePartyContext result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SamePartyContext(elementsOrVersion);
                {
                    
                result.contextType = decoder0.readInt(8);
                    SamePartyCookieContextType.validate(result.contextType);
                    result.contextType = SamePartyCookieContextType.toKnownValue(result.contextType);
                }
                {
                    
                result.ancestorsForMetricsOnly = decoder0.readInt(12);
                    SamePartyCookieContextType.validate(result.ancestorsForMetricsOnly);
                    result.ancestorsForMetricsOnly = SamePartyCookieContextType.toKnownValue(result.ancestorsForMetricsOnly);
                }
                {
                    
                result.topResourceForMetricsOnly = decoder0.readInt(16);
                    SamePartyCookieContextType.validate(result.topResourceForMetricsOnly);
                    result.topResourceForMetricsOnly = SamePartyCookieContextType.toKnownValue(result.topResourceForMetricsOnly);
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
        
        encoder0.encode(this.contextType, 8);
        
        encoder0.encode(this.ancestorsForMetricsOnly, 12);
        
        encoder0.encode(this.topResourceForMetricsOnly, 16);
    }
}