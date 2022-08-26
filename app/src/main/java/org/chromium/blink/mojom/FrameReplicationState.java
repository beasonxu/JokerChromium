// FrameReplicationState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame_replication_state.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class FrameReplicationState extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 72;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(72, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.internal.mojom.Origin origin;
    public String name;
    public String uniqueName;
    public ParsedPermissionsPolicyDeclaration[] permissionsPolicyHeader;
    public int activeSandboxFlags;
    public FramePolicy framePolicy;
    public int insecureRequestPolicy;
    public int[] insecureNavigationsSet;
    public boolean hasPotentiallyTrustworthyUniqueOrigin;
    public boolean hasActiveUserGesture;
    public boolean hasReceivedUserGestureBeforeNav;
    public boolean isAdSubframe;

    private FrameReplicationState(int version) {
        super(STRUCT_SIZE, version);
        this.activeSandboxFlags = (int) org.chromium.network.mojom.WebSandboxFlags.NONE;
        this.insecureRequestPolicy = (int) InsecureRequestPolicy.LEAVE_INSECURE_REQUESTS_ALONE;
        this.hasPotentiallyTrustworthyUniqueOrigin = (boolean) false;
        this.hasActiveUserGesture = (boolean) false;
        this.hasReceivedUserGestureBeforeNav = (boolean) false;
        this.isAdSubframe = (boolean) false;
    }

    public FrameReplicationState() {
        this(0);
    }

    public static FrameReplicationState deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FrameReplicationState deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FrameReplicationState decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FrameReplicationState result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FrameReplicationState(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                result.name = decoder0.readString(16, false);
                }
                {
                    
                result.uniqueName = decoder0.readString(24, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.permissionsPolicyHeader = new ParsedPermissionsPolicyDeclaration[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.permissionsPolicyHeader[i1] = ParsedPermissionsPolicyDeclaration.decode(decoder2);
                    }
                }
                }
                {
                    
                result.activeSandboxFlags = decoder0.readInt(40);
                    org.chromium.network.mojom.WebSandboxFlags.validate(result.activeSandboxFlags);
                    result.activeSandboxFlags = org.chromium.network.mojom.WebSandboxFlags.toKnownValue(result.activeSandboxFlags);
                }
                {
                    
                result.insecureRequestPolicy = decoder0.readInt(44);
                    InsecureRequestPolicy.validate(result.insecureRequestPolicy);
                    result.insecureRequestPolicy = InsecureRequestPolicy.toKnownValue(result.insecureRequestPolicy);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.framePolicy = FramePolicy.decode(decoder1);
                }
                {
                    
                result.insecureNavigationsSet = decoder0.readInts(56, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                result.hasPotentiallyTrustworthyUniqueOrigin = decoder0.readBoolean(64, 0);
                }
                {
                    
                result.hasActiveUserGesture = decoder0.readBoolean(64, 1);
                }
                {
                    
                result.hasReceivedUserGestureBeforeNav = decoder0.readBoolean(64, 2);
                }
                {
                    
                result.isAdSubframe = decoder0.readBoolean(64, 3);
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
        
        encoder0.encode(this.origin, 8, false);
        
        encoder0.encode(this.name, 16, false);
        
        encoder0.encode(this.uniqueName, 24, false);
        
        if (this.permissionsPolicyHeader == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.permissionsPolicyHeader.length, 32, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.permissionsPolicyHeader.length; ++i0) {
                
                encoder1.encode(this.permissionsPolicyHeader[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.activeSandboxFlags, 40);
        
        encoder0.encode(this.insecureRequestPolicy, 44);
        
        encoder0.encode(this.framePolicy, 48, false);
        
        encoder0.encode(this.insecureNavigationsSet, 56, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        encoder0.encode(this.hasPotentiallyTrustworthyUniqueOrigin, 64, 0);
        
        encoder0.encode(this.hasActiveUserGesture, 64, 1);
        
        encoder0.encode(this.hasReceivedUserGestureBeforeNav, 64, 2);
        
        encoder0.encode(this.isAdSubframe, 64, 3);
    }
}