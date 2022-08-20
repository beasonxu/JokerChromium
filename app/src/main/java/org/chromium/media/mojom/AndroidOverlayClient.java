// AndroidOverlayClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/android_overlay.mojom
//

package org.chromium.media.mojom;


public interface AndroidOverlayClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends AndroidOverlayClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AndroidOverlayClient, AndroidOverlayClient.Proxy> MANAGER = AndroidOverlayClient_Internal.MANAGER;


    void onSurfaceReady(
long surfaceKey);



    void onDestroyed(
);



    void onSynchronouslyDestroyed(

OnSynchronouslyDestroyedResponse callback);

    interface OnSynchronouslyDestroyedResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void onPowerEfficientState(
boolean isPowerEfficient);


}