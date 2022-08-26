// ContentSecurityPolicyIssueDetails.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/devtools/inspector_issue.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class ContentSecurityPolicyIssueDetails extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.mojom.Url blockedUrl;
    public String violatedDirective;
    public boolean isReportOnly;
    public int contentSecurityPolicyViolationType;
    public AffectedFrame frameAncestor;
    public AffectedLocation affectedLocation;
    public int violatingNodeId;

    private ContentSecurityPolicyIssueDetails(int version) {
        super(STRUCT_SIZE, version);
        this.violatingNodeId = (int) 0;
    }

    public ContentSecurityPolicyIssueDetails() {
        this(0);
    }

    public static ContentSecurityPolicyIssueDetails deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ContentSecurityPolicyIssueDetails deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ContentSecurityPolicyIssueDetails decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ContentSecurityPolicyIssueDetails result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ContentSecurityPolicyIssueDetails(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                result.blockedUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                result.violatedDirective = decoder0.readString(16, false);
                }
                {
                    
                result.isReportOnly = decoder0.readBoolean(24, 0);
                }
                {
                    
                result.contentSecurityPolicyViolationType = decoder0.readInt(28);
                    ContentSecurityPolicyViolationType.validate(result.contentSecurityPolicyViolationType);
                    result.contentSecurityPolicyViolationType = ContentSecurityPolicyViolationType.toKnownValue(result.contentSecurityPolicyViolationType);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                result.frameAncestor = AffectedFrame.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, true);
                result.affectedLocation = AffectedLocation.decode(decoder1);
                }
                {
                    
                result.violatingNodeId = decoder0.readInt(48);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.blockedUrl, 8, true);
        
        encoder0.encode(this.violatedDirective, 16, false);
        
        encoder0.encode(this.isReportOnly, 24, 0);
        
        encoder0.encode(this.contentSecurityPolicyViolationType, 28);
        
        encoder0.encode(this.frameAncestor, 32, true);
        
        encoder0.encode(this.affectedLocation, 40, true);
        
        encoder0.encode(this.violatingNodeId, 48);
    }
}