// BucketHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/buckets/bucket_manager_host.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface BucketHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends BucketHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BucketHost, BucketHost.Proxy> MANAGER = BucketHost_Internal.MANAGER;

    void persist(

Persist_Response callback);

    interface Persist_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Boolean, Boolean> { }


    void persisted(

Persisted_Response callback);

    interface Persisted_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Boolean, Boolean> { }


    void estimate(

Estimate_Response callback);

    interface Estimate_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<Long, Long, Boolean> { }


    void durability(

Durability_Response callback);

    interface Durability_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Boolean> { }


    void setExpires(
org.chromium.mojo_base.mojom.Time expires, 
SetExpires_Response callback);

    interface SetExpires_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void expires(

Expires_Response callback);

    interface Expires_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<org.chromium.mojo_base.mojom.Time, Boolean> { }


}
