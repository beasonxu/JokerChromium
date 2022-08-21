// VideoCaptureResult.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/capture/mojom/video_capture.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public final class VideoCaptureResult extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int State = 0;
        public static final int ErrorCode = 1;
    };
    private int mState;
    private int mErrorCode;

    public void setState(int state) {
        this.mTag = Tag.State;
        this.mState = state;
    }

    public int getState() {
        assert this.mTag == Tag.State;
        return this.mState;
    }

    public void setErrorCode(int errorCode) {
        this.mTag = Tag.ErrorCode;
        this.mErrorCode = errorCode;
    }

    public int getErrorCode() {
        assert this.mTag == Tag.ErrorCode;
        return this.mErrorCode;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.State: {
                
                encoder0.encode(this.mState, offset + 8);
                break;
            }
            case Tag.ErrorCode: {
                
                encoder0.encode(this.mErrorCode, offset + 8);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static VideoCaptureResult deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final VideoCaptureResult decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        VideoCaptureResult result = new VideoCaptureResult();
        switch (dataHeader.elementsOrVersion) {
            case Tag.State: {
                
                result.mState = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    VideoCaptureState.validate(result.mState);
                    result.mState = VideoCaptureState.toKnownValue(result.mState);
                result.mTag = Tag.State;
                break;
            }
            case Tag.ErrorCode: {
                
                result.mErrorCode = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    VideoCaptureError.validate(result.mErrorCode);
                    result.mErrorCode = VideoCaptureError.toKnownValue(result.mErrorCode);
                result.mTag = Tag.ErrorCode;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}