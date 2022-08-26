// DomStorage_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/dom_storage/dom_storage.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


class DomStorage_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<DomStorage, DomStorage.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<DomStorage, DomStorage.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.DomStorage";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, DomStorage impl) {
            return new Stub(core, impl);
        }

        @Override
        public DomStorage[] buildArray(int size) {
          return new DomStorage[size];
        }
    };


    private static final int OPEN_LOCAL_STORAGE_ORDINAL = 0;

    private static final int BIND_SESSION_STORAGE_NAMESPACE_ORDINAL = 1;

    private static final int BIND_SESSION_STORAGE_AREA_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements DomStorage.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void openLocalStorage(
StorageKey storageKey, LocalFrameToken localFrameToken, org.chromium.mojo.bindings.InterfaceRequest<StorageArea> area) {

            DomStorageOpenLocalStorageParams _message = new DomStorageOpenLocalStorageParams();

            _message.storageKey = storageKey;

            _message.localFrameToken = localFrameToken;

            _message.area = area;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(OPEN_LOCAL_STORAGE_ORDINAL)));

        }


        @Override
        public void bindSessionStorageNamespace(
String namespaceId, org.chromium.mojo.bindings.InterfaceRequest<SessionStorageNamespace> receiver) {

            DomStorageBindSessionStorageNamespaceParams _message = new DomStorageBindSessionStorageNamespaceParams();

            _message.namespaceId = namespaceId;

            _message.receiver = receiver;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(BIND_SESSION_STORAGE_NAMESPACE_ORDINAL)));

        }


        @Override
        public void bindSessionStorageArea(
StorageKey storageKey, LocalFrameToken localFrameToken, String namespaceId, org.chromium.mojo.bindings.InterfaceRequest<StorageArea> sessionNamespace) {

            DomStorageBindSessionStorageAreaParams _message = new DomStorageBindSessionStorageAreaParams();

            _message.storageKey = storageKey;

            _message.localFrameToken = localFrameToken;

            _message.namespaceId = namespaceId;

            _message.sessionNamespace = sessionNamespace;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(BIND_SESSION_STORAGE_AREA_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<DomStorage> {

        Stub(org.chromium.mojo.system.Core core, DomStorage impl) {
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
                                DomStorage_Internal.MANAGER, messageWithHeader);





                    case OPEN_LOCAL_STORAGE_ORDINAL: {

                        DomStorageOpenLocalStorageParams data =
                                DomStorageOpenLocalStorageParams.deserialize(messageWithHeader.getPayload());

                        getImpl().openLocalStorage(data.storageKey, data.localFrameToken, data.area);
                        return true;
                    }





                    case BIND_SESSION_STORAGE_NAMESPACE_ORDINAL: {

                        DomStorageBindSessionStorageNamespaceParams data =
                                DomStorageBindSessionStorageNamespaceParams.deserialize(messageWithHeader.getPayload());

                        getImpl().bindSessionStorageNamespace(data.namespaceId, data.receiver);
                        return true;
                    }





                    case BIND_SESSION_STORAGE_AREA_ORDINAL: {

                        DomStorageBindSessionStorageAreaParams data =
                                DomStorageBindSessionStorageAreaParams.deserialize(messageWithHeader.getPayload());

                        getImpl().bindSessionStorageArea(data.storageKey, data.localFrameToken, data.namespaceId, data.sessionNamespace);
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
                                getCore(), DomStorage_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class DomStorageOpenLocalStorageParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public StorageKey storageKey;
        public LocalFrameToken localFrameToken;
        public org.chromium.mojo.bindings.InterfaceRequest<StorageArea> area;

        private DomStorageOpenLocalStorageParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DomStorageOpenLocalStorageParams() {
            this(0);
        }

        public static DomStorageOpenLocalStorageParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DomStorageOpenLocalStorageParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DomStorageOpenLocalStorageParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DomStorageOpenLocalStorageParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DomStorageOpenLocalStorageParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.storageKey = StorageKey.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.localFrameToken = LocalFrameToken.decode(decoder1);
                    }
                    {
                        
                    result.area = decoder0.readInterfaceRequest(24, false);
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
            
            encoder0.encode(this.storageKey, 8, false);
            
            encoder0.encode(this.localFrameToken, 16, false);
            
            encoder0.encode(this.area, 24, false);
        }
    }



    
    static final class DomStorageBindSessionStorageNamespaceParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String namespaceId;
        public org.chromium.mojo.bindings.InterfaceRequest<SessionStorageNamespace> receiver;

        private DomStorageBindSessionStorageNamespaceParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DomStorageBindSessionStorageNamespaceParams() {
            this(0);
        }

        public static DomStorageBindSessionStorageNamespaceParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DomStorageBindSessionStorageNamespaceParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DomStorageBindSessionStorageNamespaceParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DomStorageBindSessionStorageNamespaceParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DomStorageBindSessionStorageNamespaceParams(elementsOrVersion);
                    {
                        
                    result.namespaceId = decoder0.readString(8, false);
                    }
                    {
                        
                    result.receiver = decoder0.readInterfaceRequest(16, false);
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
            
            encoder0.encode(this.namespaceId, 8, false);
            
            encoder0.encode(this.receiver, 16, false);
        }
    }



    
    static final class DomStorageBindSessionStorageAreaParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 40;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public StorageKey storageKey;
        public LocalFrameToken localFrameToken;
        public String namespaceId;
        public org.chromium.mojo.bindings.InterfaceRequest<StorageArea> sessionNamespace;

        private DomStorageBindSessionStorageAreaParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DomStorageBindSessionStorageAreaParams() {
            this(0);
        }

        public static DomStorageBindSessionStorageAreaParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DomStorageBindSessionStorageAreaParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DomStorageBindSessionStorageAreaParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DomStorageBindSessionStorageAreaParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DomStorageBindSessionStorageAreaParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.storageKey = StorageKey.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.localFrameToken = LocalFrameToken.decode(decoder1);
                    }
                    {
                        
                    result.namespaceId = decoder0.readString(24, false);
                    }
                    {
                        
                    result.sessionNamespace = decoder0.readInterfaceRequest(32, false);
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
            
            encoder0.encode(this.storageKey, 8, false);
            
            encoder0.encode(this.localFrameToken, 16, false);
            
            encoder0.encode(this.namespaceId, 24, false);
            
            encoder0.encode(this.sessionNamespace, 32, false);
        }
    }



}