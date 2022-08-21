// SpatialLayer.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public final class SpatialLayer extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int width;
    public int height;
    public int bitrateBps;
    public int framerate;
    public byte maxQp;
    public byte numOfTemporalLayers;

    private SpatialLayer(int version) {
        super(STRUCT_SIZE, version);
    }

    public SpatialLayer() {
        this(0);
    }

    public static SpatialLayer deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SpatialLayer deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SpatialLayer decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SpatialLayer result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SpatialLayer(elementsOrVersion);
                {
                    
                result.width = decoder0.readInt(8);
                }
                {
                    
                result.height = decoder0.readInt(12);
                }
                {
                    
                result.bitrateBps = decoder0.readInt(16);
                }
                {
                    
                result.framerate = decoder0.readInt(20);
                }
                {
                    
                result.maxQp = decoder0.readByte(24);
                }
                {
                    
                result.numOfTemporalLayers = decoder0.readByte(25);
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
        
        encoder0.encode(this.width, 8);
        
        encoder0.encode(this.height, 12);
        
        encoder0.encode(this.bitrateBps, 16);
        
        encoder0.encode(this.framerate, 20);
        
        encoder0.encode(this.maxQp, 24);
        
        encoder0.encode(this.numOfTemporalLayers, 25);
    }
}