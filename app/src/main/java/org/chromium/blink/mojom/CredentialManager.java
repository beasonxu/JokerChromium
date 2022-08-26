// CredentialManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/credentialmanagement/credential_manager.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface CredentialManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CredentialManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CredentialManager, CredentialManager.Proxy> MANAGER = CredentialManager_Internal.MANAGER;

    void store(
CredentialInfo credential, 
Store_Response callback);

    interface Store_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void preventSilentAccess(

PreventSilentAccess_Response callback);

    interface PreventSilentAccess_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void get(
int mediation, boolean includePasswords, org.chromium.url.mojom.Url[] federations, 
Get_Response callback);

    interface Get_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, CredentialInfo> { }


}
