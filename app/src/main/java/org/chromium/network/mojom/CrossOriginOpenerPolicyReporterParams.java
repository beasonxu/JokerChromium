// CrossOriginOpenerPolicyReporterParams.java is auto generated by mojom_bindings_generator.py, do not edit


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


public final class CrossOriginOpenerPolicyReporterParams extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int reportType;
    public CrossOriginOpenerPolicyReporter reporter;
    public boolean endpointDefined;
    public String reportedWindowUrl;

    private CrossOriginOpenerPolicyReporterParams(int version) {
        super(STRUCT_SIZE, version);
    }

    public CrossOriginOpenerPolicyReporterParams() {
        this(0);
    }

    public static CrossOriginOpenerPolicyReporterParams deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CrossOriginOpenerPolicyReporterParams deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CrossOriginOpenerPolicyReporterParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CrossOriginOpenerPolicyReporterParams result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CrossOriginOpenerPolicyReporterParams(elementsOrVersion);
                {
                    
                result.reportType = decoder0.readInt(8);
                    CoopAccessReportType.validate(result.reportType);
                    result.reportType = CoopAccessReportType.toKnownValue(result.reportType);
                }
                {
                    
                result.reporter = decoder0.readServiceInterface(12, false, CrossOriginOpenerPolicyReporter.MANAGER);
                }
                {
                    
                result.endpointDefined = decoder0.readBoolean(20, 0);
                }
                {
                    
                result.reportedWindowUrl = decoder0.readString(24, false);
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
        
        encoder0.encode(this.reportType, 8);
        
        encoder0.encode(this.reporter, 12, false, CrossOriginOpenerPolicyReporter.MANAGER);
        
        encoder0.encode(this.endpointDefined, 20, 0);
        
        encoder0.encode(this.reportedWindowUrl, 24, false);
    }
}