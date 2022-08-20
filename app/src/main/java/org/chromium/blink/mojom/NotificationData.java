// NotificationData.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/notifications/notification.mojom
//

package org.chromium.blink.mojom;


public final class NotificationData extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 112;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(112, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    
    public static final long MAXIMUM_DEVELOPER_DATA_SIZE = (long) 1048576;

    public org.chromium.mojo_base.mojom.String16 title;
    public int direction;
    public String lang;
    public org.chromium.mojo_base.mojom.String16 body;
    public String tag;
    public org.chromium.url.mojom.Url image;
    public org.chromium.url.mojom.Url icon;
    public org.chromium.url.mojom.Url badge;
    public int[] vibrationPattern;
    public double timestamp;
    public boolean renotify;
    public boolean silent;
    public boolean requireInteraction;
    public byte[] data;
    public NotificationAction[] actions;
    public org.chromium.mojo_base.mojom.Time showTriggerTimestamp;

    private NotificationData(int version) {
        super(STRUCT_SIZE, version);
        this.direction = (int) NotificationDirection.LEFT_TO_RIGHT;
        this.timestamp = (double) 0;
        this.renotify = (boolean) false;
        this.silent = (boolean) false;
        this.requireInteraction = (boolean) false;
    }

    public NotificationData() {
        this(0);
    }

    public static NotificationData deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static NotificationData deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static NotificationData decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        NotificationData result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new NotificationData(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.title = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                }
                {
                    
                result.direction = decoder0.readInt(16);
                    NotificationDirection.validate(result.direction);
                    result.direction = NotificationDirection.toKnownValue(result.direction);
                }
                {
                    
                result.renotify = decoder0.readBoolean(20, 0);
                }
                {
                    
                result.silent = decoder0.readBoolean(20, 1);
                }
                {
                    
                result.requireInteraction = decoder0.readBoolean(20, 2);
                }
                {
                    
                result.lang = decoder0.readString(24, true);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.body = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                }
                {
                    
                result.tag = decoder0.readString(40, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.image = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                result.icon = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, false);
                result.badge = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                result.vibrationPattern = decoder0.readInts(72, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                result.timestamp = decoder0.readDouble(80);
                }
                {
                    
                result.data = decoder0.readBytes(88, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(96, true);
                if (decoder1 == null) {
                    result.actions = null;
                } else {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.actions = new NotificationAction[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.actions[i1] = NotificationAction.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(104, true);
                result.showTriggerTimestamp = org.chromium.mojo_base.mojom.Time.decode(decoder1);
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
        
        encoder0.encode(this.direction, 16);
        
        encoder0.encode(this.renotify, 20, 0);
        
        encoder0.encode(this.silent, 20, 1);
        
        encoder0.encode(this.requireInteraction, 20, 2);
        
        encoder0.encode(this.lang, 24, true);
        
        encoder0.encode(this.body, 32, false);
        
        encoder0.encode(this.tag, 40, false);
        
        encoder0.encode(this.image, 48, false);
        
        encoder0.encode(this.icon, 56, false);
        
        encoder0.encode(this.badge, 64, false);
        
        encoder0.encode(this.vibrationPattern, 72, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        encoder0.encode(this.timestamp, 80);
        
        encoder0.encode(this.data, 88, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        if (this.actions == null) {
            encoder0.encodeNullPointer(96, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.actions.length, 96, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.actions.length; ++i0) {
                
                encoder1.encode(this.actions[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.showTriggerTimestamp, 104, true);
    }
}