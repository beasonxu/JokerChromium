// MediaPosition.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/media_session/public/mojom/media_session.mojom
//

package org.chromium.media_session.mojom;

import androidx.annotation.IntDef;


public final class MediaPosition extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0),new org.chromium.mojo.bindings.DataHeader(48, 13)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[1];
    public double playbackRate;
    public org.chromium.mojo_base.mojom.TimeDelta duration;
    public org.chromium.mojo_base.mojom.TimeDelta position;
    public org.chromium.mojo_base.mojom.TimeTicks lastUpdatedTime;
    public boolean endOfMedia;

    private MediaPosition(int version) {
        super(STRUCT_SIZE, version);
    }

    public MediaPosition() {
        this(13);
    }

    public static MediaPosition deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static MediaPosition deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static MediaPosition decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        MediaPosition result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new MediaPosition(elementsOrVersion);
                {
                    
                result.playbackRate = decoder0.readDouble(8);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.duration = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.position = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.lastUpdatedTime = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
            if (elementsOrVersion >= 13) {
                {
                    
                result.endOfMedia = decoder0.readBoolean(40, 0);
                }
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
        
        encoder0.encode(this.playbackRate, 8);
        
        encoder0.encode(this.duration, 16, false);
        
        encoder0.encode(this.position, 24, false);
        
        encoder0.encode(this.lastUpdatedTime, 32, false);
        
        encoder0.encode(this.endOfMedia, 40, 0);
    }
}