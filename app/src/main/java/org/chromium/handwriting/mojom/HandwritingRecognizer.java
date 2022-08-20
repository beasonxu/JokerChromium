// HandwritingRecognizer.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/handwriting/handwriting.mojom
//

package org.chromium.handwriting.mojom;

import androidx.annotation.IntDef;


public interface HandwritingRecognizer extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends HandwritingRecognizer, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<HandwritingRecognizer, Proxy> MANAGER = HandwritingRecognizer_Internal.MANAGER;

    void getPrediction(
HandwritingStroke[] strokes, HandwritingHints hints, 
GetPrediction_Response callback);

    interface GetPrediction_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<HandwritingPrediction[]> { }


}
