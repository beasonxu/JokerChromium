// CommonFilePickerOptions.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/file_system_access/file_system_access_manager.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class CommonFilePickerOptions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String startingDirectoryId;
    public int wellKnownStartingDirectory;
    public FileSystemAccessTransferToken startingDirectoryToken;

    private CommonFilePickerOptions(int version) {
        super(STRUCT_SIZE, version);
    }

    public CommonFilePickerOptions() {
        this(0);
    }

    public static CommonFilePickerOptions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CommonFilePickerOptions deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CommonFilePickerOptions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CommonFilePickerOptions result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CommonFilePickerOptions(elementsOrVersion);
                {
                    
                result.startingDirectoryId = decoder0.readString(8, false);
                }
                {
                    
                result.wellKnownStartingDirectory = decoder0.readInt(16);
                    WellKnownDirectory.validate(result.wellKnownStartingDirectory);
                    result.wellKnownStartingDirectory = WellKnownDirectory.toKnownValue(result.wellKnownStartingDirectory);
                }
                {
                    
                result.startingDirectoryToken = decoder0.readServiceInterface(20, true, FileSystemAccessTransferToken.MANAGER);
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
        
        encoder0.encode(this.startingDirectoryId, 8, false);
        
        encoder0.encode(this.wellKnownStartingDirectory, 16);
        
        encoder0.encode(this.startingDirectoryToken, 20, true, FileSystemAccessTransferToken.MANAGER);
    }
}