// AudioStreamFactory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/audio_stream_factory.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface AudioStreamFactory extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends AudioStreamFactory, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AudioStreamFactory, AudioStreamFactory.Proxy> MANAGER = AudioStreamFactory_Internal.MANAGER;

    void createInputStream(
org.chromium.mojo.bindings.InterfaceRequest<AudioInputStream> stream, AudioInputStreamClient client, AudioInputStreamObserver observer, AudioLog log, String deviceId, AudioParameters params, int sharedMemoryCount, boolean enableAgc, org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion keyPressCountBuffer, AudioProcessingConfig processingConfig, 
CreateInputStream_Response callback);

    interface CreateInputStream_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<ReadOnlyAudioDataPipe, Boolean, org.chromium.mojo_base.mojom.UnguessableToken> { }


    void associateInputAndOutputForAec(
org.chromium.mojo_base.mojom.UnguessableToken inputStreamId, String outputDeviceId);


    void createOutputStream(
org.chromium.mojo.bindings.InterfaceRequest<AudioOutputStream> stream, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported observer, AudioLog log, String deviceId, AudioParameters params, org.chromium.mojo_base.mojom.UnguessableToken groupId, 
CreateOutputStream_Response callback);

    interface CreateOutputStream_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<ReadWriteAudioDataPipe> { }


    void bindMuter(
org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported receiver, org.chromium.mojo_base.mojom.UnguessableToken groupId);


    void createLoopbackStream(
org.chromium.mojo.bindings.InterfaceRequest<AudioInputStream> receiver, AudioInputStreamClient client, AudioInputStreamObserver observer, AudioParameters params, int sharedMemoryCount, org.chromium.mojo_base.mojom.UnguessableToken groupId, 
CreateLoopbackStream_Response callback);

    interface CreateLoopbackStream_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<ReadOnlyAudioDataPipe> { }


}
