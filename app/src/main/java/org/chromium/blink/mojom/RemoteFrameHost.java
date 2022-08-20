// RemoteFrameHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame.mojom
//

package org.chromium.blink.mojom;


public interface RemoteFrameHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends RemoteFrameHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RemoteFrameHost, RemoteFrameHost.Proxy> MANAGER = RemoteFrameHost_Internal.MANAGER;


    void setInheritedEffectiveTouchAction(
int touchAction);



    void updateRenderThrottlingStatus(
boolean isThrottled, boolean subtreeThrottled, boolean displayLocked);



    void visibilityChanged(
int visibility);



    void didFocusFrame(
);



    void checkCompleted(
);



    void capturePaintPreviewOfCrossProcessSubframe(
org.chromium.gfx.mojom.Rect clipRect, org.chromium.mojo_base.mojom.UnguessableToken guid);



    void setIsInert(
boolean inert);



    void didChangeOpener(
LocalFrameToken openerFrame);



    void advanceFocus(
int focusType, LocalFrameToken sourceFrameToken);



    void routeMessageEvent(
LocalFrameToken sourceFrameToken, org.chromium.mojo_base.mojom.String16 sourceOrigin, org.chromium.mojo_base.mojom.String16 targetOrigin, TransferableMessage message);



    void printCrossProcessSubframe(
org.chromium.gfx.mojom.Rect frameContentRect, int documentCookie);



    void detach(
);



    void updateViewportIntersection(
ViewportIntersectionState intersectionState, FrameVisualProperties visualProperties);



    void synchronizeVisualProperties(
FrameVisualProperties properties);


}