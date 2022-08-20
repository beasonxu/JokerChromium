// DigitalGoodsFactory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/digital_goods/digital_goods.mojom
//

package org.chromium.payments.mojom;


public interface DigitalGoodsFactory extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends DigitalGoodsFactory, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<DigitalGoodsFactory, DigitalGoodsFactory.Proxy> MANAGER = DigitalGoodsFactory_Internal.MANAGER;


    void createDigitalGoods(
String paymentMethod, 
CreateDigitalGoodsResponse callback);

    interface CreateDigitalGoodsResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, DigitalGoods> { }


}