// PlaybackEventsRecorder_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/playback_events_recorder.mojom
//

package org.chromium.media.mojom;


class PlaybackEventsRecorder_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<PlaybackEventsRecorder, PlaybackEventsRecorder.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<PlaybackEventsRecorder, PlaybackEventsRecorder.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.PlaybackEventsRecorder";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, PlaybackEventsRecorder impl) {
            return new Stub(core, impl);
        }

        @Override
        public PlaybackEventsRecorder[] buildArray(int size) {
          return new PlaybackEventsRecorder[size];
        }
    };


    private static final int ON_PLAYING_ORDINAL = 0;

    private static final int ON_PAUSED_ORDINAL = 1;

    private static final int ON_SEEKING_ORDINAL = 2;

    private static final int ON_ENDED_ORDINAL = 3;

    private static final int ON_ERROR_ORDINAL = 4;

    private static final int ON_BUFFERING_ORDINAL = 5;

    private static final int ON_BUFFERING_COMPLETE_ORDINAL = 6;

    private static final int ON_NATURAL_SIZE_CHANGED_ORDINAL = 7;

    private static final int ON_PIPELINE_STATISTICS_ORDINAL = 8;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements PlaybackEventsRecorder.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onPlaying(
) {

            PlaybackEventsRecorderOnPlayingParams _message = new PlaybackEventsRecorderOnPlayingParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_PLAYING_ORDINAL)));

        }


        @Override
        public void onPaused(
) {

            PlaybackEventsRecorderOnPausedParams _message = new PlaybackEventsRecorderOnPausedParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_PAUSED_ORDINAL)));

        }


        @Override
        public void onSeeking(
) {

            PlaybackEventsRecorderOnSeekingParams _message = new PlaybackEventsRecorderOnSeekingParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SEEKING_ORDINAL)));

        }


        @Override
        public void onEnded(
) {

            PlaybackEventsRecorderOnEndedParams _message = new PlaybackEventsRecorderOnEndedParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_ENDED_ORDINAL)));

        }


        @Override
        public void onError(
int status) {

            PlaybackEventsRecorderOnErrorParams _message = new PlaybackEventsRecorderOnErrorParams();

            _message.status = status;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_ERROR_ORDINAL)));

        }


        @Override
        public void onBuffering(
) {

            PlaybackEventsRecorderOnBufferingParams _message = new PlaybackEventsRecorderOnBufferingParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_BUFFERING_ORDINAL)));

        }


        @Override
        public void onBufferingComplete(
) {

            PlaybackEventsRecorderOnBufferingCompleteParams _message = new PlaybackEventsRecorderOnBufferingCompleteParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_BUFFERING_COMPLETE_ORDINAL)));

        }


        @Override
        public void onNaturalSizeChanged(
org.chromium.gfx.mojom.Size size) {

            PlaybackEventsRecorderOnNaturalSizeChangedParams _message = new PlaybackEventsRecorderOnNaturalSizeChangedParams();

            _message.size = size;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_NATURAL_SIZE_CHANGED_ORDINAL)));

        }


        @Override
        public void onPipelineStatistics(
PipelineStatistics stats) {

            PlaybackEventsRecorderOnPipelineStatisticsParams _message = new PlaybackEventsRecorderOnPipelineStatisticsParams();

            _message.stats = stats;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_PIPELINE_STATISTICS_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<PlaybackEventsRecorder> {

        Stub(org.chromium.mojo.system.Core core, PlaybackEventsRecorder impl) {
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
                                PlaybackEventsRecorder_Internal.MANAGER, messageWithHeader);





                    case ON_PLAYING_ORDINAL: {

                        PlaybackEventsRecorderOnPlayingParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onPlaying();
                        return true;
                    }





                    case ON_PAUSED_ORDINAL: {

                        PlaybackEventsRecorderOnPausedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onPaused();
                        return true;
                    }





                    case ON_SEEKING_ORDINAL: {

                        PlaybackEventsRecorderOnSeekingParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onSeeking();
                        return true;
                    }





                    case ON_ENDED_ORDINAL: {

                        PlaybackEventsRecorderOnEndedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onEnded();
                        return true;
                    }





                    case ON_ERROR_ORDINAL: {

                        PlaybackEventsRecorderOnErrorParams data =
                                PlaybackEventsRecorderOnErrorParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onError(data.status);
                        return true;
                    }





                    case ON_BUFFERING_ORDINAL: {

                        PlaybackEventsRecorderOnBufferingParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onBuffering();
                        return true;
                    }





                    case ON_BUFFERING_COMPLETE_ORDINAL: {

                        PlaybackEventsRecorderOnBufferingCompleteParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onBufferingComplete();
                        return true;
                    }





                    case ON_NATURAL_SIZE_CHANGED_ORDINAL: {

                        PlaybackEventsRecorderOnNaturalSizeChangedParams data =
                                PlaybackEventsRecorderOnNaturalSizeChangedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onNaturalSizeChanged(data.size);
                        return true;
                    }





                    case ON_PIPELINE_STATISTICS_ORDINAL: {

                        PlaybackEventsRecorderOnPipelineStatisticsParams data =
                                PlaybackEventsRecorderOnPipelineStatisticsParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onPipelineStatistics(data.stats);
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
                                getCore(), PlaybackEventsRecorder_Internal.MANAGER, messageWithHeader, receiver);




















                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class PlaybackEventsRecorderOnPlayingParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private PlaybackEventsRecorderOnPlayingParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PlaybackEventsRecorderOnPlayingParams() {
            this(0);
        }

        public static PlaybackEventsRecorderOnPlayingParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PlaybackEventsRecorderOnPlayingParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PlaybackEventsRecorderOnPlayingParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PlaybackEventsRecorderOnPlayingParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PlaybackEventsRecorderOnPlayingParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class PlaybackEventsRecorderOnPausedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private PlaybackEventsRecorderOnPausedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PlaybackEventsRecorderOnPausedParams() {
            this(0);
        }

        public static PlaybackEventsRecorderOnPausedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PlaybackEventsRecorderOnPausedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PlaybackEventsRecorderOnPausedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PlaybackEventsRecorderOnPausedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PlaybackEventsRecorderOnPausedParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class PlaybackEventsRecorderOnSeekingParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private PlaybackEventsRecorderOnSeekingParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PlaybackEventsRecorderOnSeekingParams() {
            this(0);
        }

        public static PlaybackEventsRecorderOnSeekingParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PlaybackEventsRecorderOnSeekingParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PlaybackEventsRecorderOnSeekingParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PlaybackEventsRecorderOnSeekingParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PlaybackEventsRecorderOnSeekingParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class PlaybackEventsRecorderOnEndedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private PlaybackEventsRecorderOnEndedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PlaybackEventsRecorderOnEndedParams() {
            this(0);
        }

        public static PlaybackEventsRecorderOnEndedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PlaybackEventsRecorderOnEndedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PlaybackEventsRecorderOnEndedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PlaybackEventsRecorderOnEndedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PlaybackEventsRecorderOnEndedParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class PlaybackEventsRecorderOnErrorParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int status;

        private PlaybackEventsRecorderOnErrorParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PlaybackEventsRecorderOnErrorParams() {
            this(0);
        }

        public static PlaybackEventsRecorderOnErrorParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PlaybackEventsRecorderOnErrorParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PlaybackEventsRecorderOnErrorParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PlaybackEventsRecorderOnErrorParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PlaybackEventsRecorderOnErrorParams(elementsOrVersion);
                    {
                        
                    result.status = decoder0.readInt(8);
                        PipelineStatus.validate(result.status);
                        result.status = PipelineStatus.toKnownValue(result.status);
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
            
            encoder0.encode(this.status, 8);
        }
    }



    
    static final class PlaybackEventsRecorderOnBufferingParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private PlaybackEventsRecorderOnBufferingParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PlaybackEventsRecorderOnBufferingParams() {
            this(0);
        }

        public static PlaybackEventsRecorderOnBufferingParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PlaybackEventsRecorderOnBufferingParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PlaybackEventsRecorderOnBufferingParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PlaybackEventsRecorderOnBufferingParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PlaybackEventsRecorderOnBufferingParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class PlaybackEventsRecorderOnBufferingCompleteParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private PlaybackEventsRecorderOnBufferingCompleteParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PlaybackEventsRecorderOnBufferingCompleteParams() {
            this(0);
        }

        public static PlaybackEventsRecorderOnBufferingCompleteParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PlaybackEventsRecorderOnBufferingCompleteParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PlaybackEventsRecorderOnBufferingCompleteParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PlaybackEventsRecorderOnBufferingCompleteParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PlaybackEventsRecorderOnBufferingCompleteParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class PlaybackEventsRecorderOnNaturalSizeChangedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.gfx.mojom.Size size;

        private PlaybackEventsRecorderOnNaturalSizeChangedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PlaybackEventsRecorderOnNaturalSizeChangedParams() {
            this(0);
        }

        public static PlaybackEventsRecorderOnNaturalSizeChangedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PlaybackEventsRecorderOnNaturalSizeChangedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PlaybackEventsRecorderOnNaturalSizeChangedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PlaybackEventsRecorderOnNaturalSizeChangedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PlaybackEventsRecorderOnNaturalSizeChangedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.size = org.chromium.gfx.mojom.Size.decode(decoder1);
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
            
            encoder0.encode(this.size, 8, false);
        }
    }



    
    static final class PlaybackEventsRecorderOnPipelineStatisticsParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public PipelineStatistics stats;

        private PlaybackEventsRecorderOnPipelineStatisticsParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PlaybackEventsRecorderOnPipelineStatisticsParams() {
            this(0);
        }

        public static PlaybackEventsRecorderOnPipelineStatisticsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PlaybackEventsRecorderOnPipelineStatisticsParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PlaybackEventsRecorderOnPipelineStatisticsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PlaybackEventsRecorderOnPipelineStatisticsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PlaybackEventsRecorderOnPipelineStatisticsParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.stats = PipelineStatistics.decode(decoder1);
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
            
            encoder0.encode(this.stats, 8, false);
        }
    }



}