// DedicatedWorkerHostFactory_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/dedicated_worker_host_factory.mojom
//

package org.chromium.blink.mojom;


class DedicatedWorkerHostFactory_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<DedicatedWorkerHostFactory, DedicatedWorkerHostFactory.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<DedicatedWorkerHostFactory, DedicatedWorkerHostFactory.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.DedicatedWorkerHostFactory";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, DedicatedWorkerHostFactory impl) {
            return new Stub(core, impl);
        }

        @Override
        public DedicatedWorkerHostFactory[] buildArray(int size) {
          return new DedicatedWorkerHostFactory[size];
        }
    };


    private static final int CREATE_WORKER_HOST_ORDINAL = 0;

    private static final int CREATE_WORKER_HOST_AND_START_SCRIPT_LOAD_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements DedicatedWorkerHostFactory.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void createWorkerHost(
DedicatedWorkerToken token, org.chromium.mojo.bindings.InterfaceRequest<BrowserInterfaceBroker> browserInterfaceBroker, org.chromium.mojo.bindings.InterfaceRequest<DedicatedWorkerHost> host, 
CreateWorkerHostResponse callback) {

            DedicatedWorkerHostFactoryCreateWorkerHostParams _message = new DedicatedWorkerHostFactoryCreateWorkerHostParams();

            _message.token = token;

            _message.browserInterfaceBroker = browserInterfaceBroker;

            _message.host = host;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    CREATE_WORKER_HOST_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new DedicatedWorkerHostFactoryCreateWorkerHostResponseParamsForwardToCallback(callback));

        }


        @Override
        public void createWorkerHostAndStartScriptLoad(
DedicatedWorkerToken token, org.chromium.url.mojom.Url scriptUrl, int credentialsMode, FetchClientSettingsObject outsideFetchClientSettingsObject, BlobUrlToken blobUrlToken, DedicatedWorkerHostFactoryClient client) {

            DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams _message = new DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams();

            _message.token = token;

            _message.scriptUrl = scriptUrl;

            _message.credentialsMode = credentialsMode;

            _message.outsideFetchClientSettingsObject = outsideFetchClientSettingsObject;

            _message.blobUrlToken = blobUrlToken;

            _message.client = client;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CREATE_WORKER_HOST_AND_START_SCRIPT_LOAD_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<DedicatedWorkerHostFactory> {

        Stub(org.chromium.mojo.system.Core core, DedicatedWorkerHostFactory impl) {
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
                                DedicatedWorkerHostFactory_Internal.MANAGER, messageWithHeader);







                    case CREATE_WORKER_HOST_AND_START_SCRIPT_LOAD_ORDINAL: {

                        DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams data =
                                DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createWorkerHostAndStartScriptLoad(data.token, data.scriptUrl, data.credentialsMode, data.outsideFetchClientSettingsObject, data.blobUrlToken, data.client);
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
                                getCore(), DedicatedWorkerHostFactory_Internal.MANAGER, messageWithHeader, receiver);







                    case CREATE_WORKER_HOST_ORDINAL: {

                        DedicatedWorkerHostFactoryCreateWorkerHostParams data =
                                DedicatedWorkerHostFactoryCreateWorkerHostParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createWorkerHost(data.token, data.browserInterfaceBroker, data.host, new DedicatedWorkerHostFactoryCreateWorkerHostResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    }


    
    static final class DedicatedWorkerHostFactoryCreateWorkerHostParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public DedicatedWorkerToken token;
        public org.chromium.mojo.bindings.InterfaceRequest<BrowserInterfaceBroker> browserInterfaceBroker;
        public org.chromium.mojo.bindings.InterfaceRequest<DedicatedWorkerHost> host;

        private DedicatedWorkerHostFactoryCreateWorkerHostParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DedicatedWorkerHostFactoryCreateWorkerHostParams() {
            this(0);
        }

        public static DedicatedWorkerHostFactoryCreateWorkerHostParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DedicatedWorkerHostFactoryCreateWorkerHostParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DedicatedWorkerHostFactoryCreateWorkerHostParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DedicatedWorkerHostFactoryCreateWorkerHostParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DedicatedWorkerHostFactoryCreateWorkerHostParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.token = DedicatedWorkerToken.decode(decoder1);
                    }
                    {
                        
                    result.browserInterfaceBroker = decoder0.readInterfaceRequest(16, false);
                    }
                    {
                        
                    result.host = decoder0.readInterfaceRequest(20, false);
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
            
            encoder0.encode(this.token, 8, false);
            
            encoder0.encode(this.browserInterfaceBroker, 16, false);
            
            encoder0.encode(this.host, 20, false);
        }
    }



    
    static final class DedicatedWorkerHostFactoryCreateWorkerHostResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.network.mojom.CrossOriginEmbedderPolicy parentCoep;

        private DedicatedWorkerHostFactoryCreateWorkerHostResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DedicatedWorkerHostFactoryCreateWorkerHostResponseParams() {
            this(0);
        }

        public static DedicatedWorkerHostFactoryCreateWorkerHostResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DedicatedWorkerHostFactoryCreateWorkerHostResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DedicatedWorkerHostFactoryCreateWorkerHostResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DedicatedWorkerHostFactoryCreateWorkerHostResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DedicatedWorkerHostFactoryCreateWorkerHostResponseParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.parentCoep = org.chromium.network.mojom.CrossOriginEmbedderPolicy.decode(decoder1);
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
            
            encoder0.encode(this.parentCoep, 8, false);
        }
    }

    static class DedicatedWorkerHostFactoryCreateWorkerHostResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final DedicatedWorkerHostFactory.CreateWorkerHostResponse mCallback;

        DedicatedWorkerHostFactoryCreateWorkerHostResponseParamsForwardToCallback(DedicatedWorkerHostFactory.CreateWorkerHostResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(CREATE_WORKER_HOST_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                DedicatedWorkerHostFactoryCreateWorkerHostResponseParams response = DedicatedWorkerHostFactoryCreateWorkerHostResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.parentCoep);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class DedicatedWorkerHostFactoryCreateWorkerHostResponseParamsProxyToResponder implements DedicatedWorkerHostFactory.CreateWorkerHostResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DedicatedWorkerHostFactoryCreateWorkerHostResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(org.chromium.network.mojom.CrossOriginEmbedderPolicy parentCoep) {
            DedicatedWorkerHostFactoryCreateWorkerHostResponseParams _response = new DedicatedWorkerHostFactoryCreateWorkerHostResponseParams();

            _response.parentCoep = parentCoep;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    CREATE_WORKER_HOST_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 56;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public DedicatedWorkerToken token;
        public org.chromium.url.mojom.Url scriptUrl;
        public int credentialsMode;
        public FetchClientSettingsObject outsideFetchClientSettingsObject;
        public BlobUrlToken blobUrlToken;
        public DedicatedWorkerHostFactoryClient client;

        private DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams() {
            this(0);
        }

        public static DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DedicatedWorkerHostFactoryCreateWorkerHostAndStartScriptLoadParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.token = DedicatedWorkerToken.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.scriptUrl = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.credentialsMode = decoder0.readInt(24);
                        org.chromium.network.mojom.CredentialsMode.validate(result.credentialsMode);
                        result.credentialsMode = org.chromium.network.mojom.CredentialsMode.toKnownValue(result.credentialsMode);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                    result.outsideFetchClientSettingsObject = FetchClientSettingsObject.decode(decoder1);
                    }
                    {
                        
                    result.blobUrlToken = decoder0.readServiceInterface(40, true, BlobUrlToken.MANAGER);
                    }
                    {
                        
                    result.client = decoder0.readServiceInterface(48, false, DedicatedWorkerHostFactoryClient.MANAGER);
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
            
            encoder0.encode(this.token, 8, false);
            
            encoder0.encode(this.scriptUrl, 16, false);
            
            encoder0.encode(this.credentialsMode, 24);
            
            encoder0.encode(this.outsideFetchClientSettingsObject, 32, false);
            
            encoder0.encode(this.blobUrlToken, 40, true, BlobUrlToken.MANAGER);
            
            encoder0.encode(this.client, 48, false, DedicatedWorkerHostFactoryClient.MANAGER);
        }
    }



}