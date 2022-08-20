// SubresourceLoaderUpdater_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/subresource_loader_updater.mojom
//

package org.chromium.blink.mojom;


class SubresourceLoaderUpdater_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<SubresourceLoaderUpdater, SubresourceLoaderUpdater.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<SubresourceLoaderUpdater, SubresourceLoaderUpdater.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.SubresourceLoaderUpdater";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, SubresourceLoaderUpdater impl) {
            return new Stub(core, impl);
        }

        @Override
        public SubresourceLoaderUpdater[] buildArray(int size) {
          return new SubresourceLoaderUpdater[size];
        }
    };


    private static final int UPDATE_SUBRESOURCE_LOADER_FACTORIES_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements SubresourceLoaderUpdater.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void updateSubresourceLoaderFactories(
UrlLoaderFactoryBundle subresourceLoaderFactories) {

            SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams _message = new SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams();

            _message.subresourceLoaderFactories = subresourceLoaderFactories;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(UPDATE_SUBRESOURCE_LOADER_FACTORIES_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<SubresourceLoaderUpdater> {

        Stub(org.chromium.mojo.system.Core core, SubresourceLoaderUpdater impl) {
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
                                SubresourceLoaderUpdater_Internal.MANAGER, messageWithHeader);





                    case UPDATE_SUBRESOURCE_LOADER_FACTORIES_ORDINAL: {

                        SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams data =
                                SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams.deserialize(messageWithHeader.getPayload());

                        getImpl().updateSubresourceLoaderFactories(data.subresourceLoaderFactories);
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
                                getCore(), SubresourceLoaderUpdater_Internal.MANAGER, messageWithHeader, receiver);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public UrlLoaderFactoryBundle subresourceLoaderFactories;

        private SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams() {
            this(0);
        }

        public static SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SubresourceLoaderUpdaterUpdateSubresourceLoaderFactoriesParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.subresourceLoaderFactories = UrlLoaderFactoryBundle.decode(decoder1);
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
            
            encoder0.encode(this.subresourceLoaderFactories, 8, false);
        }
    }



}