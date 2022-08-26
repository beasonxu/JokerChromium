// VideoCaptureObserver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/capture/mojom/video_capture.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface VideoCaptureObserver extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends VideoCaptureObserver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<VideoCaptureObserver, VideoCaptureObserver.Proxy> MANAGER = VideoCaptureObserver_Internal.MANAGER;

    void onStateChanged(
VideoCaptureResult result);


    void onNewBuffer(
int bufferId, VideoBufferHandle bufferHandle);


    void onBufferReady(
ReadyBuffer buffer, ReadyBuffer[] scaledBuffers);


    void onBufferDestroyed(
int bufferId);


}
