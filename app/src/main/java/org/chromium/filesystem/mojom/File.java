// File.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/services/filesystem/public/mojom/file.mojom
//

package org.chromium.filesystem.mojom;

import androidx.annotation.IntDef;


public interface File extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends File, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<File, File.Proxy> MANAGER = File_Internal.MANAGER;

    void close(

Close_Response callback);

    interface Close_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void read(
int numBytesToRead, long offset, int whence, 
Read_Response callback);

    interface Read_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, byte[]> { }


    void write(
byte[] bytesToWrite, long offset, int whence, 
Write_Response callback);

    interface Write_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Integer> { }


    void tell(

Tell_Response callback);

    interface Tell_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Long> { }


    void seek(
long offset, int whence, 
Seek_Response callback);

    interface Seek_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Long> { }


    void stat(

Stat_Response callback);

    interface Stat_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, FileInformation> { }


    void truncate(
long size, 
Truncate_Response callback);

    interface Truncate_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void touch(
TimespecOrNow atime, TimespecOrNow mtime, 
Touch_Response callback);

    interface Touch_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void dup(
org.chromium.mojo.bindings.InterfaceRequest<File> file, 
Dup_Response callback);

    interface Dup_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void flush(

Flush_Response callback);

    interface Flush_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void lock(

Lock_Response callback);

    interface Lock_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void unlock(

Unlock_Response callback);

    interface Unlock_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void asHandle(

AsHandle_Response callback);

    interface AsHandle_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, org.chromium.mojo_base.mojom.File> { }


}
