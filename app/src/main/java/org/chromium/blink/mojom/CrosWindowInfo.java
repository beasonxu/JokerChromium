// CrosWindowInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/chromeos/system_extensions/window_management/cros_window_management.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class CrosWindowInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo_base.mojom.UnguessableToken id;
    public String appId;
    public org.chromium.gfx.mojom.Rect bounds;
    public String title;
    public int windowState;
    public boolean isFocused;
    public int visibilityState;

    private CrosWindowInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public CrosWindowInfo() {
        this(0);
    }

    public static CrosWindowInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CrosWindowInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CrosWindowInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CrosWindowInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CrosWindowInfo(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.id = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                result.appId = decoder0.readString(16, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.bounds = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                result.title = decoder0.readString(32, false);
                }
                {
                    
                result.windowState = decoder0.readInt(40);
                    WindowState.validate(result.windowState);
                    result.windowState = WindowState.toKnownValue(result.windowState);
                }
                {
                    
                result.isFocused = decoder0.readBoolean(44, 0);
                }
                {
                    
                result.visibilityState = decoder0.readInt(48);
                    VisibilityState.validate(result.visibilityState);
                    result.visibilityState = VisibilityState.toKnownValue(result.visibilityState);
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
        
        encoder0.encode(this.id, 8, false);
        
        encoder0.encode(this.appId, 16, false);
        
        encoder0.encode(this.bounds, 24, false);
        
        encoder0.encode(this.title, 32, false);
        
        encoder0.encode(this.windowState, 40);
        
        encoder0.encode(this.isFocused, 44, 0);
        
        encoder0.encode(this.visibilityState, 48);
    }
}