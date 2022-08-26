// WorkletToken.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/tokens/tokens.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class WorkletToken extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int AnimationWorkletToken = 0;
        public static final int AudioWorkletToken = 1;
        public static final int LayoutWorkletToken = 2;
        public static final int PaintWorkletToken = 3;
    };
    private AnimationWorkletToken mAnimationWorkletToken;
    private AudioWorkletToken mAudioWorkletToken;
    private LayoutWorkletToken mLayoutWorkletToken;
    private PaintWorkletToken mPaintWorkletToken;

    public void setAnimationWorkletToken(AnimationWorkletToken animationWorkletToken) {
        this.mTag = Tag.AnimationWorkletToken;
        this.mAnimationWorkletToken = animationWorkletToken;
    }

    public AnimationWorkletToken getAnimationWorkletToken() {
        assert this.mTag == Tag.AnimationWorkletToken;
        return this.mAnimationWorkletToken;
    }

    public void setAudioWorkletToken(AudioWorkletToken audioWorkletToken) {
        this.mTag = Tag.AudioWorkletToken;
        this.mAudioWorkletToken = audioWorkletToken;
    }

    public AudioWorkletToken getAudioWorkletToken() {
        assert this.mTag == Tag.AudioWorkletToken;
        return this.mAudioWorkletToken;
    }

    public void setLayoutWorkletToken(LayoutWorkletToken layoutWorkletToken) {
        this.mTag = Tag.LayoutWorkletToken;
        this.mLayoutWorkletToken = layoutWorkletToken;
    }

    public LayoutWorkletToken getLayoutWorkletToken() {
        assert this.mTag == Tag.LayoutWorkletToken;
        return this.mLayoutWorkletToken;
    }

    public void setPaintWorkletToken(PaintWorkletToken paintWorkletToken) {
        this.mTag = Tag.PaintWorkletToken;
        this.mPaintWorkletToken = paintWorkletToken;
    }

    public PaintWorkletToken getPaintWorkletToken() {
        assert this.mTag == Tag.PaintWorkletToken;
        return this.mPaintWorkletToken;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.AnimationWorkletToken: {
                
                encoder0.encode(this.mAnimationWorkletToken, offset + 8, false);
                break;
            }
            case Tag.AudioWorkletToken: {
                
                encoder0.encode(this.mAudioWorkletToken, offset + 8, false);
                break;
            }
            case Tag.LayoutWorkletToken: {
                
                encoder0.encode(this.mLayoutWorkletToken, offset + 8, false);
                break;
            }
            case Tag.PaintWorkletToken: {
                
                encoder0.encode(this.mPaintWorkletToken, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static WorkletToken deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final WorkletToken decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        WorkletToken result = new WorkletToken();
        switch (dataHeader.elementsOrVersion) {
            case Tag.AnimationWorkletToken: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mAnimationWorkletToken = AnimationWorkletToken.decode(decoder1);
                result.mTag = Tag.AnimationWorkletToken;
                break;
            }
            case Tag.AudioWorkletToken: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mAudioWorkletToken = AudioWorkletToken.decode(decoder1);
                result.mTag = Tag.AudioWorkletToken;
                break;
            }
            case Tag.LayoutWorkletToken: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mLayoutWorkletToken = LayoutWorkletToken.decode(decoder1);
                result.mTag = Tag.LayoutWorkletToken;
                break;
            }
            case Tag.PaintWorkletToken: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mPaintWorkletToken = PaintWorkletToken.decode(decoder1);
                result.mTag = Tag.PaintWorkletToken;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}