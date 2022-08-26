// PageBroadcast.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page/page.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface PageBroadcast extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PageBroadcast, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PageBroadcast, PageBroadcast.Proxy> MANAGER = PageBroadcast_Internal.MANAGER;

    void setPageLifecycleState(
PageLifecycleState state, PageRestoreParams pageRestoreParams, 
SetPageLifecycleState_Response callback);

    interface SetPageLifecycleState_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void audioStateChanged(
boolean isAudioPlaying);


    void activatePrerenderedPage(
PrerenderPageActivationParams prerenderPageActivationParams, 
ActivatePrerenderedPage_Response callback);

    interface ActivatePrerenderedPage_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void setInsidePortal(
boolean isInsidePortal);


    void updateWebPreferences(
WebPreferences preferences);


    void updateRendererPreferences(
RendererPreferences preferences);


    void setHistoryOffsetAndLength(
int offset, int length);


    void setPageBaseBackgroundColor(
org.chromium.skia.mojom.SkColor color);


}
