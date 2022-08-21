// BlobUrlStore.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/blob/blob_url_store.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface BlobUrlStore extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends BlobUrlStore, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BlobUrlStore, BlobUrlStore.Proxy> MANAGER = BlobUrlStore_Internal.MANAGER;

    void register(
Blob blob, org.chromium.url.mojom.Url url, org.chromium.mojo_base.mojom.UnguessableToken unsafeAgentClusterId, org.chromium.network.mojom.SchemefulSite unsafeTopLevelSite, 
Register_Response callback);

    interface Register_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void revoke(
org.chromium.url.mojom.Url url);


    void resolve(
org.chromium.url.mojom.Url url, 
Resolve_Response callback);

    interface Resolve_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Blob, org.chromium.mojo_base.mojom.UnguessableToken> { }


    void resolveAsUrlLoaderFactory(
org.chromium.url.mojom.Url url, org.chromium.mojo.bindings.InterfaceRequest<org.chromium.network.mojom.UrlLoaderFactory> factory, 
ResolveAsUrlLoaderFactory_Response callback);

    interface ResolveAsUrlLoaderFactory_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<org.chromium.mojo_base.mojom.UnguessableToken, org.chromium.network.mojom.SchemefulSite> { }


    void resolveForNavigation(
org.chromium.url.mojom.Url url, org.chromium.mojo.bindings.InterfaceRequest<BlobUrlToken> token, 
ResolveForNavigation_Response callback);

    interface ResolveForNavigation_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.UnguessableToken> { }


}
