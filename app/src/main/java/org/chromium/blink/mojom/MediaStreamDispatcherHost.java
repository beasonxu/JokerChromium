// MediaStreamDispatcherHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/mediastream/media_stream.mojom
//

package org.chromium.blink.mojom;


public interface MediaStreamDispatcherHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends MediaStreamDispatcherHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<MediaStreamDispatcherHost, MediaStreamDispatcherHost.Proxy> MANAGER = MediaStreamDispatcherHost_Internal.MANAGER;


    void generateStream(
int requestId, StreamControls controls, boolean userGesture, StreamSelectionInfo audioStreamSelectionInfo, 
GenerateStreamResponse callback);

    interface GenerateStreamResponse extends org.chromium.mojo.bindings.Callbacks.Callback5<Integer, String, MediaStreamDevice[], MediaStreamDevice[], Boolean> { }



    void cancelRequest(
int requestId);



    void stopStreamDevice(
String deviceId, org.chromium.mojo_base.mojom.UnguessableToken sessionId);



    void openDevice(
int requestId, String deviceId, int type, 
OpenDeviceResponse callback);

    interface OpenDeviceResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, String, MediaStreamDevice> { }



    void closeDevice(
String label);



    void setCapturingLinkSecured(
org.chromium.mojo_base.mojom.UnguessableToken sessionId, int type, boolean isSecure);



    void onStreamStarted(
String label);


}