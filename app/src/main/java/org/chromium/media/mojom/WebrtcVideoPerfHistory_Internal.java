// WebrtcVideoPerfHistory_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/webrtc_video_perf.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


class WebrtcVideoPerfHistory_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<WebrtcVideoPerfHistory, WebrtcVideoPerfHistory.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<WebrtcVideoPerfHistory, WebrtcVideoPerfHistory.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.WebrtcVideoPerfHistory";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, WebrtcVideoPerfHistory impl) {
            return new Stub(core, impl);
        }

        @Override
        public WebrtcVideoPerfHistory[] buildArray(int size) {
          return new WebrtcVideoPerfHistory[size];
        }
    };


    private static final int GET_PERF_INFO_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements WebrtcVideoPerfHistory.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void getPerfInfo(
WebrtcPredictionFeatures features, int framesPerSecond, 
GetPerfInfo_Response callback) {

            WebrtcVideoPerfHistoryGetPerfInfoParams _message = new WebrtcVideoPerfHistoryGetPerfInfoParams();

            _message.features = features;

            _message.framesPerSecond = framesPerSecond;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_PERF_INFO_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new WebrtcVideoPerfHistoryGetPerfInfoResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<WebrtcVideoPerfHistory> {

        Stub(org.chromium.mojo.system.Core core, WebrtcVideoPerfHistory impl) {
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
                                WebrtcVideoPerfHistory_Internal.MANAGER, messageWithHeader);




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
                                getCore(), WebrtcVideoPerfHistory_Internal.MANAGER, messageWithHeader, receiver);







                    case GET_PERF_INFO_ORDINAL: {

                        WebrtcVideoPerfHistoryGetPerfInfoParams data =
                                WebrtcVideoPerfHistoryGetPerfInfoParams.deserialize(messageWithHeader.getPayload());

                        getImpl().getPerfInfo(data.features, data.framesPerSecond, new WebrtcVideoPerfHistoryGetPerfInfoResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class WebrtcVideoPerfHistoryGetPerfInfoParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public WebrtcPredictionFeatures features;
        public int framesPerSecond;

        private WebrtcVideoPerfHistoryGetPerfInfoParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public WebrtcVideoPerfHistoryGetPerfInfoParams() {
            this(0);
        }

        public static WebrtcVideoPerfHistoryGetPerfInfoParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static WebrtcVideoPerfHistoryGetPerfInfoParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static WebrtcVideoPerfHistoryGetPerfInfoParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            WebrtcVideoPerfHistoryGetPerfInfoParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new WebrtcVideoPerfHistoryGetPerfInfoParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.features = WebrtcPredictionFeatures.decode(decoder1);
                    }
                    {
                        
                    result.framesPerSecond = decoder0.readInt(16);
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
            
            encoder0.encode(this.features, 8, false);
            
            encoder0.encode(this.framesPerSecond, 16);
        }
    }



    
    static final class WebrtcVideoPerfHistoryGetPerfInfoResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean isSmooth;

        private WebrtcVideoPerfHistoryGetPerfInfoResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public WebrtcVideoPerfHistoryGetPerfInfoResponseParams() {
            this(0);
        }

        public static WebrtcVideoPerfHistoryGetPerfInfoResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static WebrtcVideoPerfHistoryGetPerfInfoResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static WebrtcVideoPerfHistoryGetPerfInfoResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            WebrtcVideoPerfHistoryGetPerfInfoResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new WebrtcVideoPerfHistoryGetPerfInfoResponseParams(elementsOrVersion);
                    {
                        
                    result.isSmooth = decoder0.readBoolean(8, 0);
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
            
            encoder0.encode(this.isSmooth, 8, 0);
        }
    }

    static class WebrtcVideoPerfHistoryGetPerfInfoResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final WebrtcVideoPerfHistory.GetPerfInfo_Response mCallback;

        WebrtcVideoPerfHistoryGetPerfInfoResponseParamsForwardToCallback(WebrtcVideoPerfHistory.GetPerfInfo_Response callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_PERF_INFO_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                WebrtcVideoPerfHistoryGetPerfInfoResponseParams response = WebrtcVideoPerfHistoryGetPerfInfoResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.isSmooth);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class WebrtcVideoPerfHistoryGetPerfInfoResponseParamsProxyToResponder implements WebrtcVideoPerfHistory.GetPerfInfo_Response {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        WebrtcVideoPerfHistoryGetPerfInfoResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Boolean isSmooth) {
            WebrtcVideoPerfHistoryGetPerfInfoResponseParams _response = new WebrtcVideoPerfHistoryGetPerfInfoResponseParams();

            _response.isSmooth = isSmooth;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_PERF_INFO_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}