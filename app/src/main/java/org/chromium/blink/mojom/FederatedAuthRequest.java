// FederatedAuthRequest.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webid/federated_auth_request.mojom
//

package org.chromium.blink.mojom;


public interface FederatedAuthRequest extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FederatedAuthRequest, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FederatedAuthRequest, FederatedAuthRequest.Proxy> MANAGER = FederatedAuthRequest_Internal.MANAGER;


    void requestIdToken(
org.chromium.url.mojom.Url provider, String idRequest, 
RequestIdTokenResponse callback);

    interface RequestIdTokenResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, String> { }


}