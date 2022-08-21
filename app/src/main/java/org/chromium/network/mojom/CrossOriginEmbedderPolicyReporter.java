// CrossOriginEmbedderPolicyReporter.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cross_origin_embedder_policy.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface CrossOriginEmbedderPolicyReporter extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CrossOriginEmbedderPolicyReporter, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CrossOriginEmbedderPolicyReporter, CrossOriginEmbedderPolicyReporter.Proxy> MANAGER = CrossOriginEmbedderPolicyReporter_Internal.MANAGER;

    void queueCorpViolationReport(
org.chromium.url.mojom.Url blockedUrl, int destination, boolean reportOnly);


    void clone(
org.chromium.mojo.bindings.InterfaceRequest<CrossOriginEmbedderPolicyReporter> receiver);


}
