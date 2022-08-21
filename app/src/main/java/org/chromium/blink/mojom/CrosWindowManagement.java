// CrosWindowManagement.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/chromeos/system_extensions/window_management/cros_window_management.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface CrosWindowManagement extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CrosWindowManagement, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CrosWindowManagement, CrosWindowManagement.Proxy> MANAGER = CrosWindowManagement_Internal.MANAGER;

    void getAllWindows(

GetAllWindows_Response callback);

    interface GetAllWindows_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<CrosWindowInfo[]> { }


    void moveTo(
org.chromium.mojo_base.mojom.UnguessableToken id, int x, int y, 
MoveTo_Response callback);

    interface MoveTo_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void moveBy(
org.chromium.mojo_base.mojom.UnguessableToken id, int deltaX, int deltaY, 
MoveBy_Response callback);

    interface MoveBy_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void resizeTo(
org.chromium.mojo_base.mojom.UnguessableToken id, int width, int height, 
ResizeTo_Response callback);

    interface ResizeTo_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void resizeBy(
org.chromium.mojo_base.mojom.UnguessableToken id, int deltaWidth, int deltaHeight, 
ResizeBy_Response callback);

    interface ResizeBy_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void setFullscreen(
org.chromium.mojo_base.mojom.UnguessableToken id, boolean fullscreen, 
SetFullscreen_Response callback);

    interface SetFullscreen_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void maximize(
org.chromium.mojo_base.mojom.UnguessableToken id, 
Maximize_Response callback);

    interface Maximize_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void minimize(
org.chromium.mojo_base.mojom.UnguessableToken id, 
Minimize_Response callback);

    interface Minimize_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void focus(
org.chromium.mojo_base.mojom.UnguessableToken id, 
Focus_Response callback);

    interface Focus_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void close(
org.chromium.mojo_base.mojom.UnguessableToken id, 
Close_Response callback);

    interface Close_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void getAllScreens(

GetAllScreens_Response callback);

    interface GetAllScreens_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<CrosScreenInfo[]> { }


}
