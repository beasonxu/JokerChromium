// AppBannerController.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/app_banner/app_banner.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface AppBannerController extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends AppBannerController, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AppBannerController, AppBannerController.Proxy> MANAGER = AppBannerController_Internal.MANAGER;

    void bannerPromptRequest(
AppBannerService service, org.chromium.mojo.bindings.InterfaceRequest<AppBannerEvent> eventReceiver, String[] platform, 
BannerPromptRequest_Response callback);

    interface BannerPromptRequest_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


}
