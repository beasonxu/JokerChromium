// CrossOriginEmbedderPolicyReporter_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cross_origin_embedder_policy.mojom
//

package org.chromium.network.mojom;


class CrossOriginEmbedderPolicyReporter_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<CrossOriginEmbedderPolicyReporter, CrossOriginEmbedderPolicyReporter.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<CrossOriginEmbedderPolicyReporter, CrossOriginEmbedderPolicyReporter.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.CrossOriginEmbedderPolicyReporter";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, CrossOriginEmbedderPolicyReporter impl) {
            return new Stub(core, impl);
        }

        @Override
        public CrossOriginEmbedderPolicyReporter[] buildArray(int size) {
          return new CrossOriginEmbedderPolicyReporter[size];
        }
    };


    private static final int QUEUE_CORP_VIOLATION_REPORT_ORDINAL = 0;

    private static final int CLONE_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements CrossOriginEmbedderPolicyReporter.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void queueCorpViolationReport(
org.chromium.url.mojom.Url blockedUrl, int destination, boolean reportOnly) {

            CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams _message = new CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams();

            _message.blockedUrl = blockedUrl;

            _message.destination = destination;

            _message.reportOnly = reportOnly;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(QUEUE_CORP_VIOLATION_REPORT_ORDINAL)));

        }


        @Override
        public void clone(
org.chromium.mojo.bindings.InterfaceRequest<CrossOriginEmbedderPolicyReporter> receiver) {

            CrossOriginEmbedderPolicyReporterCloneParams _message = new CrossOriginEmbedderPolicyReporterCloneParams();

            _message.receiver = receiver;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CLONE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<CrossOriginEmbedderPolicyReporter> {

        Stub(org.chromium.mojo.system.Core core, CrossOriginEmbedderPolicyReporter impl) {
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
                                CrossOriginEmbedderPolicyReporter_Internal.MANAGER, messageWithHeader);





                    case QUEUE_CORP_VIOLATION_REPORT_ORDINAL: {

                        CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams data =
                                CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams.deserialize(messageWithHeader.getPayload());

                        getImpl().queueCorpViolationReport(data.blockedUrl, data.destination, data.reportOnly);
                        return true;
                    }





                    case CLONE_ORDINAL: {

                        CrossOriginEmbedderPolicyReporterCloneParams data =
                                CrossOriginEmbedderPolicyReporterCloneParams.deserialize(messageWithHeader.getPayload());

                        getImpl().clone(data.receiver);
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
                                getCore(), CrossOriginEmbedderPolicyReporter_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url blockedUrl;
        public int destination;
        public boolean reportOnly;

        private CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams() {
            this(0);
        }

        public static CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new CrossOriginEmbedderPolicyReporterQueueCorpViolationReportParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.blockedUrl = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.destination = decoder0.readInt(16);
                        RequestDestination.validate(result.destination);
                        result.destination = RequestDestination.toKnownValue(result.destination);
                    }
                    {
                        
                    result.reportOnly = decoder0.readBoolean(20, 0);
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
            
            encoder0.encode(this.blockedUrl, 8, false);
            
            encoder0.encode(this.destination, 16);
            
            encoder0.encode(this.reportOnly, 20, 0);
        }
    }



    
    static final class CrossOriginEmbedderPolicyReporterCloneParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<CrossOriginEmbedderPolicyReporter> receiver;

        private CrossOriginEmbedderPolicyReporterCloneParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public CrossOriginEmbedderPolicyReporterCloneParams() {
            this(0);
        }

        public static CrossOriginEmbedderPolicyReporterCloneParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static CrossOriginEmbedderPolicyReporterCloneParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static CrossOriginEmbedderPolicyReporterCloneParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            CrossOriginEmbedderPolicyReporterCloneParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new CrossOriginEmbedderPolicyReporterCloneParams(elementsOrVersion);
                    {
                        
                    result.receiver = decoder0.readInterfaceRequest(8, false);
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
            
            encoder0.encode(this.receiver, 8, false);
        }
    }



}