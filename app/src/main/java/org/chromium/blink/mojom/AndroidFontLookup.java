// AndroidFontLookup.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/android_font_lookup/android_font_lookup.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface AndroidFontLookup extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends AndroidFontLookup, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AndroidFontLookup, Proxy> MANAGER = AndroidFontLookup_Internal.MANAGER;

    void getUniqueNameLookupTable(

GetUniqueNameLookupTable_Response callback);

    interface GetUniqueNameLookupTable_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<String[]> { }


    void matchLocalFontByUniqueName(
String fontUniqueName, 
MatchLocalFontByUniqueName_Response callback);

    interface MatchLocalFontByUniqueName_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.ReadOnlyFile> { }


    void fetchAllFontFiles(

FetchAllFontFiles_Response callback);

    interface FetchAllFontFiles_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<java.util.Map<String, org.chromium.mojo_base.mojom.ReadOnlyFile>> { }


}
