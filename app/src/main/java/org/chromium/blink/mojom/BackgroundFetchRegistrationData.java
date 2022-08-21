// BackgroundFetchRegistrationData.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/background_fetch/background_fetch.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class BackgroundFetchRegistrationData extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String developerId;
    public long uploadTotal;
    public long uploaded;
    public long downloadTotal;
    public long downloaded;
    public int result;
    public int failureReason;

    private BackgroundFetchRegistrationData(int version) {
        super(STRUCT_SIZE, version);
        this.result = (int) BackgroundFetchResult.UNSET;
        this.failureReason = (int) BackgroundFetchFailureReason.NONE;
    }

    public BackgroundFetchRegistrationData() {
        this(0);
    }

    public static BackgroundFetchRegistrationData deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static BackgroundFetchRegistrationData deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static BackgroundFetchRegistrationData decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        BackgroundFetchRegistrationData result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new BackgroundFetchRegistrationData(elementsOrVersion);
                {
                    
                result.developerId = decoder0.readString(8, false);
                }
                {
                    
                result.uploadTotal = decoder0.readLong(16);
                }
                {
                    
                result.uploaded = decoder0.readLong(24);
                }
                {
                    
                result.downloadTotal = decoder0.readLong(32);
                }
                {
                    
                result.downloaded = decoder0.readLong(40);
                }
                {
                    
                result.result = decoder0.readInt(48);
                    BackgroundFetchResult.validate(result.result);
                    result.result = BackgroundFetchResult.toKnownValue(result.result);
                }
                {
                    
                result.failureReason = decoder0.readInt(52);
                    BackgroundFetchFailureReason.validate(result.failureReason);
                    result.failureReason = BackgroundFetchFailureReason.toKnownValue(result.failureReason);
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
        
        encoder0.encode(this.developerId, 8, false);
        
        encoder0.encode(this.uploadTotal, 16);
        
        encoder0.encode(this.uploaded, 24);
        
        encoder0.encode(this.downloadTotal, 32);
        
        encoder0.encode(this.downloaded, 40);
        
        encoder0.encode(this.result, 48);
        
        encoder0.encode(this.failureReason, 52);
    }
}