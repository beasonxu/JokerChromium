// TrustedUrlRequestParams.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/url_request.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public final class TrustedUrlRequestParams extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public IsolationInfo isolationInfo;
    public boolean disableSecureDns;
    public boolean hasUserActivation;
    public CookieAccessObserver cookieObserver;
    public UrlLoaderNetworkServiceObserver urlLoaderNetworkObserver;
    public DevToolsObserver devtoolsObserver;
    public ClientSecurityState clientSecurityState;
    public AcceptChFrameObserver acceptChFrameObserver;

    private TrustedUrlRequestParams(int version) {
        super(STRUCT_SIZE, version);
    }

    public TrustedUrlRequestParams() {
        this(0);
    }

    public static TrustedUrlRequestParams deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static TrustedUrlRequestParams deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static TrustedUrlRequestParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        TrustedUrlRequestParams result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new TrustedUrlRequestParams(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.isolationInfo = IsolationInfo.decode(decoder1);
                }
                {
                    
                result.disableSecureDns = decoder0.readBoolean(16, 0);
                }
                {
                    
                result.hasUserActivation = decoder0.readBoolean(16, 1);
                }
                {
                    
                result.cookieObserver = decoder0.readServiceInterface(20, true, CookieAccessObserver.MANAGER);
                }
                {
                    
                result.urlLoaderNetworkObserver = decoder0.readServiceInterface(28, true, UrlLoaderNetworkServiceObserver.MANAGER);
                }
                {
                    
                result.devtoolsObserver = decoder0.readServiceInterface(36, true, DevToolsObserver.MANAGER);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, true);
                result.clientSecurityState = ClientSecurityState.decode(decoder1);
                }
                {
                    
                result.acceptChFrameObserver = decoder0.readServiceInterface(56, true, AcceptChFrameObserver.MANAGER);
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
        
        encoder0.encode(this.isolationInfo, 8, false);
        
        encoder0.encode(this.disableSecureDns, 16, 0);
        
        encoder0.encode(this.hasUserActivation, 16, 1);
        
        encoder0.encode(this.cookieObserver, 20, true, CookieAccessObserver.MANAGER);
        
        encoder0.encode(this.urlLoaderNetworkObserver, 28, true, UrlLoaderNetworkServiceObserver.MANAGER);
        
        encoder0.encode(this.devtoolsObserver, 36, true, DevToolsObserver.MANAGER);
        
        encoder0.encode(this.clientSecurityState, 48, true);
        
        encoder0.encode(this.acceptChFrameObserver, 56, true, AcceptChFrameObserver.MANAGER);
    }
}