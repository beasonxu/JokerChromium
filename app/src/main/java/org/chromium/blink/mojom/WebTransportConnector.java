// WebTransportConnector.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webtransport/web_transport_connector.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface WebTransportConnector extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends WebTransportConnector, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WebTransportConnector, WebTransportConnector.Proxy> MANAGER = WebTransportConnector_Internal.MANAGER;

    void connect(
org.chromium.url.mojom.Url url, org.chromium.network.mojom.WebTransportCertificateFingerprint[] fingerprints, org.chromium.network.mojom.WebTransportHandshakeClient client);


}