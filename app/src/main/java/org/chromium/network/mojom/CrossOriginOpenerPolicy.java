// CrossOriginOpenerPolicy.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cross_origin_opener_policy.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public final class CrossOriginOpenerPolicy extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int value;
    public String reportingEndpoint;
    public int reportOnlyValue;
    public String reportOnlyReportingEndpoint;
    public int soapByDefaultValue;

    private CrossOriginOpenerPolicy(int version) {
        super(STRUCT_SIZE, version);
        this.value = (int) CrossOriginOpenerPolicyValue.UNSAFE_NONE;
        this.reportOnlyValue = (int) CrossOriginOpenerPolicyValue.UNSAFE_NONE;
        this.soapByDefaultValue = (int) CrossOriginOpenerPolicyValue.UNSAFE_NONE;
    }

    public CrossOriginOpenerPolicy() {
        this(0);
    }

    public static CrossOriginOpenerPolicy deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CrossOriginOpenerPolicy deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CrossOriginOpenerPolicy decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CrossOriginOpenerPolicy result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CrossOriginOpenerPolicy(elementsOrVersion);
                {
                    
                result.value = decoder0.readInt(8);
                    CrossOriginOpenerPolicyValue.validate(result.value);
                    result.value = CrossOriginOpenerPolicyValue.toKnownValue(result.value);
                }
                {
                    
                result.reportOnlyValue = decoder0.readInt(12);
                    CrossOriginOpenerPolicyValue.validate(result.reportOnlyValue);
                    result.reportOnlyValue = CrossOriginOpenerPolicyValue.toKnownValue(result.reportOnlyValue);
                }
                {
                    
                result.reportingEndpoint = decoder0.readString(16, true);
                }
                {
                    
                result.reportOnlyReportingEndpoint = decoder0.readString(24, true);
                }
                {
                    
                result.soapByDefaultValue = decoder0.readInt(32);
                    CrossOriginOpenerPolicyValue.validate(result.soapByDefaultValue);
                    result.soapByDefaultValue = CrossOriginOpenerPolicyValue.toKnownValue(result.soapByDefaultValue);
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
        
        encoder0.encode(this.value, 8);
        
        encoder0.encode(this.reportOnlyValue, 12);
        
        encoder0.encode(this.reportingEndpoint, 16, true);
        
        encoder0.encode(this.reportOnlyReportingEndpoint, 24, true);
        
        encoder0.encode(this.soapByDefaultValue, 32);
    }
}