// ContextualSearchJsApiService_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/contextual_search/content/common/mojom/contextual_search_js_api_service.mojom
//

package org.chromium.contextual_search.mojom;


class ContextualSearchJsApiService_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ContextualSearchJsApiService, ContextualSearchJsApiService.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ContextualSearchJsApiService, ContextualSearchJsApiService.Proxy>() {

        @Override
        public String getName() {
            return "contextual_search.mojom.ContextualSearchJsApiService";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, ContextualSearchJsApiService impl) {
            return new Stub(core, impl);
        }

        @Override
        public ContextualSearchJsApiService[] buildArray(int size) {
          return new ContextualSearchJsApiService[size];
        }
    };


    private static final int SHOULD_ENABLE_JS_API_ORDINAL = 0;

    private static final int HANDLE_SET_CAPTION_ORDINAL = 1;

    private static final int HANDLE_CHANGE_OVERLAY_POSITION_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ContextualSearchJsApiService.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void shouldEnableJsApi(
org.chromium.url.mojom.Url url, 
ShouldEnableJsApiResponse callback) {

            ContextualSearchJsApiServiceShouldEnableJsApiParams _message = new ContextualSearchJsApiServiceShouldEnableJsApiParams();

            _message.url = url;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    SHOULD_ENABLE_JS_API_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new ContextualSearchJsApiServiceShouldEnableJsApiResponseParamsForwardToCallback(callback));

        }


        @Override
        public void handleSetCaption(
String message, boolean doesAnswer) {

            ContextualSearchJsApiServiceHandleSetCaptionParams _message = new ContextualSearchJsApiServiceHandleSetCaptionParams();

            _message.message = message;

            _message.doesAnswer = doesAnswer;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(HANDLE_SET_CAPTION_ORDINAL)));

        }


        @Override
        public void handleChangeOverlayPosition(
int desiredPosition) {

            ContextualSearchJsApiServiceHandleChangeOverlayPositionParams _message = new ContextualSearchJsApiServiceHandleChangeOverlayPositionParams();

            _message.desiredPosition = desiredPosition;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(HANDLE_CHANGE_OVERLAY_POSITION_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ContextualSearchJsApiService> {

        Stub(org.chromium.mojo.system.Core core, ContextualSearchJsApiService impl) {
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
                                ContextualSearchJsApiService_Internal.MANAGER, messageWithHeader);







                    case HANDLE_SET_CAPTION_ORDINAL: {

                        ContextualSearchJsApiServiceHandleSetCaptionParams data =
                                ContextualSearchJsApiServiceHandleSetCaptionParams.deserialize(messageWithHeader.getPayload());

                        getImpl().handleSetCaption(data.message, data.doesAnswer);
                        return true;
                    }





                    case HANDLE_CHANGE_OVERLAY_POSITION_ORDINAL: {

                        ContextualSearchJsApiServiceHandleChangeOverlayPositionParams data =
                                ContextualSearchJsApiServiceHandleChangeOverlayPositionParams.deserialize(messageWithHeader.getPayload());

                        getImpl().handleChangeOverlayPosition(data.desiredPosition);
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
                                getCore(), ContextualSearchJsApiService_Internal.MANAGER, messageWithHeader, receiver);







                    case SHOULD_ENABLE_JS_API_ORDINAL: {

                        ContextualSearchJsApiServiceShouldEnableJsApiParams data =
                                ContextualSearchJsApiServiceShouldEnableJsApiParams.deserialize(messageWithHeader.getPayload());

                        getImpl().shouldEnableJsApi(data.url, new ContextualSearchJsApiServiceShouldEnableJsApiResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class ContextualSearchJsApiServiceShouldEnableJsApiParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;

        private ContextualSearchJsApiServiceShouldEnableJsApiParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ContextualSearchJsApiServiceShouldEnableJsApiParams() {
            this(0);
        }

        public static ContextualSearchJsApiServiceShouldEnableJsApiParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ContextualSearchJsApiServiceShouldEnableJsApiParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ContextualSearchJsApiServiceShouldEnableJsApiParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ContextualSearchJsApiServiceShouldEnableJsApiParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ContextualSearchJsApiServiceShouldEnableJsApiParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
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
            
            encoder0.encode(this.url, 8, false);
        }
    }



    
    static final class ContextualSearchJsApiServiceShouldEnableJsApiResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean shouldEnable;

        private ContextualSearchJsApiServiceShouldEnableJsApiResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ContextualSearchJsApiServiceShouldEnableJsApiResponseParams() {
            this(0);
        }

        public static ContextualSearchJsApiServiceShouldEnableJsApiResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ContextualSearchJsApiServiceShouldEnableJsApiResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ContextualSearchJsApiServiceShouldEnableJsApiResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ContextualSearchJsApiServiceShouldEnableJsApiResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ContextualSearchJsApiServiceShouldEnableJsApiResponseParams(elementsOrVersion);
                    {
                        
                    result.shouldEnable = decoder0.readBoolean(8, 0);
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
            
            encoder0.encode(this.shouldEnable, 8, 0);
        }
    }

    static class ContextualSearchJsApiServiceShouldEnableJsApiResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final ContextualSearchJsApiService.ShouldEnableJsApiResponse mCallback;

        ContextualSearchJsApiServiceShouldEnableJsApiResponseParamsForwardToCallback(ContextualSearchJsApiService.ShouldEnableJsApiResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(SHOULD_ENABLE_JS_API_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                ContextualSearchJsApiServiceShouldEnableJsApiResponseParams response = ContextualSearchJsApiServiceShouldEnableJsApiResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.shouldEnable);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class ContextualSearchJsApiServiceShouldEnableJsApiResponseParamsProxyToResponder implements ContextualSearchJsApiService.ShouldEnableJsApiResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ContextualSearchJsApiServiceShouldEnableJsApiResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Boolean shouldEnable) {
            ContextualSearchJsApiServiceShouldEnableJsApiResponseParams _response = new ContextualSearchJsApiServiceShouldEnableJsApiResponseParams();

            _response.shouldEnable = shouldEnable;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    SHOULD_ENABLE_JS_API_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class ContextualSearchJsApiServiceHandleSetCaptionParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String message;
        public boolean doesAnswer;

        private ContextualSearchJsApiServiceHandleSetCaptionParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ContextualSearchJsApiServiceHandleSetCaptionParams() {
            this(0);
        }

        public static ContextualSearchJsApiServiceHandleSetCaptionParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ContextualSearchJsApiServiceHandleSetCaptionParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ContextualSearchJsApiServiceHandleSetCaptionParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ContextualSearchJsApiServiceHandleSetCaptionParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ContextualSearchJsApiServiceHandleSetCaptionParams(elementsOrVersion);
                    {
                        
                    result.message = decoder0.readString(8, false);
                    }
                    {
                        
                    result.doesAnswer = decoder0.readBoolean(16, 0);
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
            
            encoder0.encode(this.message, 8, false);
            
            encoder0.encode(this.doesAnswer, 16, 0);
        }
    }



    
    static final class ContextualSearchJsApiServiceHandleChangeOverlayPositionParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int desiredPosition;

        private ContextualSearchJsApiServiceHandleChangeOverlayPositionParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ContextualSearchJsApiServiceHandleChangeOverlayPositionParams() {
            this(0);
        }

        public static ContextualSearchJsApiServiceHandleChangeOverlayPositionParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ContextualSearchJsApiServiceHandleChangeOverlayPositionParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ContextualSearchJsApiServiceHandleChangeOverlayPositionParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ContextualSearchJsApiServiceHandleChangeOverlayPositionParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ContextualSearchJsApiServiceHandleChangeOverlayPositionParams(elementsOrVersion);
                    {
                        
                    result.desiredPosition = decoder0.readInt(8);
                        OverlayPosition.validate(result.desiredPosition);
                        result.desiredPosition = OverlayPosition.toKnownValue(result.desiredPosition);
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
            
            encoder0.encode(this.desiredPosition, 8);
        }
    }



}