// CloseListener.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/close_watcher/close_listener.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface CloseListener extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CloseListener, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CloseListener, CloseListener.Proxy> MANAGER = CloseListener_Internal.MANAGER;

    void signal(
);


}