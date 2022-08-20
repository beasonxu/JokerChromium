// BucketPolicies.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/buckets/bucket_manager_host.mojom
//

package org.chromium.blink.mojom;


public final class BucketPolicies extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String title;
    public boolean persisted;
    public int durability;
    public long quota;
    public org.chromium.mojo_base.mojom.Time expires;

    private BucketPolicies(int version) {
        super(STRUCT_SIZE, version);
    }

    public BucketPolicies() {
        this(0);
    }

    public static BucketPolicies deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static BucketPolicies deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static BucketPolicies decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        BucketPolicies result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new BucketPolicies(elementsOrVersion);
                {
                    
                result.title = decoder0.readString(8, false);
                }
                {
                    
                result.persisted = decoder0.readBoolean(16, 0);
                }
                {
                    
                result.durability = decoder0.readInt(20);
                    BucketDurability.validate(result.durability);
                    result.durability = BucketDurability.toKnownValue(result.durability);
                }
                {
                    
                result.quota = decoder0.readLong(24);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                result.expires = org.chromium.mojo_base.mojom.Time.decode(decoder1);
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
        
        encoder0.encode(this.title, 8, false);
        
        encoder0.encode(this.persisted, 16, 0);
        
        encoder0.encode(this.durability, 20);
        
        encoder0.encode(this.quota, 24);
        
        encoder0.encode(this.expires, 32, true);
    }
}