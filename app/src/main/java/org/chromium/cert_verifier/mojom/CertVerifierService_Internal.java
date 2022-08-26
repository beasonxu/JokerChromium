// CertVerifierService_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cert_verifier_service.mojom
//

package org.chromium.cert_verifier.mojom;

import androidx.annotation.IntDef;


class CertVerifierService_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<CertVerifierService, CertVerifierService.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<CertVerifierService, CertVerifierService.Proxy>() {

        @Override
        public String getName() {
            return "cert_verifier.mojom.CertVerifierService";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, CertVerifierService impl) {
            return new Stub(core, impl);
        }

        @Override
        public CertVerifierService[] buildArray(int size) {
          return new CertVerifierService[size];
        }
    };


    private static final int ENABLE_NETWORK_ACCESS_ORDINAL = 0;

    private static final int VERIFY_ORDINAL = 1;

    private static final int SET_CONFIG_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements CertVerifierService.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void enableNetworkAccess(
org.chromium.network.mojom.UrlLoaderFactory urlLoaderFactory, UrlLoaderFactoryConnector reconnector) {

            CertVerifierServiceEnableNetworkAccessParams _message = new CertVerifierServiceEnableNetworkAccessParams();

            _message.urlLoaderFactory = urlLoaderFactory;

            _message.reconnector = reconnector;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ENABLE_NETWORK_ACCESS_ORDINAL)));

        }


        @Override
        public void verify(
RequestParams params, int netlogSourceType, int netlogSourceId, org.chromium.mojo_base.mojom.TimeTicks netlogSourceStartTime, CertVerifierRequest certVerifierRequest) {

            CertVerifierServiceVerifyParams _message = new CertVerifierServiceVerifyParams();

            _message.params = params;

            _message.netlogSourceType = netlogSourceType;

            _message.netlogSourceId = netlogSourceId;

            _message.netlogSourceStartTime = netlogSourceStartTime;

            _message.certVerifierRequest = certVerifierRequest;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(VERIFY_ORDINAL)));

        }


        @Override
        public void setConfig(
CertVerifierConfig config) {

            CertVerifierServiceSetConfigParams _message = new CertVerifierServiceSetConfigParams();

            _message.config = config;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_CONFIG_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<CertVerifierService> {

        Stub(org.chromium.mojo.system.Core core, CertVerifierService impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                CertVerifierService_Internal.MANAGER, messageWithHeader);





                    case ENABLE_NETWORK_ACCESS_ORDINAL: {

                        CertVerifierServiceEnableNetworkAccessParams data =
                                CertVerifierServiceEnableNetworkAccessParams.deserialize(messageWithHeader.getPayload());

                        getImpl().enableNetworkAccess(data.urlLoaderFactory, data.reconnector);
                        return true;
                    }





                    case VERIFY_ORDINAL: {

                        CertVerifierServiceVerifyParams data =
                                CertVerifierServiceVerifyParams.deserialize(messageWithHeader.getPayload());

                        getImpl().verify(data.params, data.netlogSourceType, data.netlogSourceId, data.netlogSourceStartTime, data.certVerifierRequest);
                        return true;
                    }





                    case SET_CONFIG_ORDINAL: {

                        CertVerifierServiceSetConfigParams data =
                                CertVerifierServiceSetConfigParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setConfig(data.config);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), CertVerifierService_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class CertVerifierServiceEnableNetworkAccessParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.network.mojom.UrlLoaderFactory urlLoaderFactory;
        public UrlLoaderFactoryConnector reconnector;

        private CertVerifierServiceEnableNetworkAccessParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public CertVerifierServiceEnableNetworkAccessParams() {
            this(0);
        }

        public static CertVerifierServiceEnableNetworkAccessParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static CertVerifierServiceEnableNetworkAccessParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static CertVerifierServiceEnableNetworkAccessParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            CertVerifierServiceEnableNetworkAccessParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new CertVerifierServiceEnableNetworkAccessParams(elementsOrVersion);
                    {
                        
                    result.urlLoaderFactory = decoder0.readServiceInterface(8, false, org.chromium.network.mojom.UrlLoaderFactory.MANAGER);
                    }
                    {
                        
                    result.reconnector = decoder0.readServiceInterface(16, true, UrlLoaderFactoryConnector.MANAGER);
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
            
            encoder0.encode(this.urlLoaderFactory, 8, false, org.chromium.network.mojom.UrlLoaderFactory.MANAGER);
            
            encoder0.encode(this.reconnector, 16, true, UrlLoaderFactoryConnector.MANAGER);
        }
    }



    
    static final class CertVerifierServiceVerifyParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 40;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public RequestParams params;
        public int netlogSourceType;
        public int netlogSourceId;
        public org.chromium.mojo_base.mojom.TimeTicks netlogSourceStartTime;
        public CertVerifierRequest certVerifierRequest;

        private CertVerifierServiceVerifyParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public CertVerifierServiceVerifyParams() {
            this(0);
        }

        public static CertVerifierServiceVerifyParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static CertVerifierServiceVerifyParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static CertVerifierServiceVerifyParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            CertVerifierServiceVerifyParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new CertVerifierServiceVerifyParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.params = RequestParams.decode(decoder1);
                    }
                    {
                        
                    result.netlogSourceType = decoder0.readInt(16);
                    }
                    {
                        
                    result.netlogSourceId = decoder0.readInt(20);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.netlogSourceStartTime = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                    }
                    {
                        
                    result.certVerifierRequest = decoder0.readServiceInterface(32, false, CertVerifierRequest.MANAGER);
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
            
            encoder0.encode(this.params, 8, false);
            
            encoder0.encode(this.netlogSourceType, 16);
            
            encoder0.encode(this.netlogSourceId, 20);
            
            encoder0.encode(this.netlogSourceStartTime, 24, false);
            
            encoder0.encode(this.certVerifierRequest, 32, false, CertVerifierRequest.MANAGER);
        }
    }



    
    static final class CertVerifierServiceSetConfigParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public CertVerifierConfig config;

        private CertVerifierServiceSetConfigParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public CertVerifierServiceSetConfigParams() {
            this(0);
        }

        public static CertVerifierServiceSetConfigParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static CertVerifierServiceSetConfigParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static CertVerifierServiceSetConfigParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            CertVerifierServiceSetConfigParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new CertVerifierServiceSetConfigParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.config = CertVerifierConfig.decode(decoder1);
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
            
            encoder0.encode(this.config, 8, false);
        }
    }



}
