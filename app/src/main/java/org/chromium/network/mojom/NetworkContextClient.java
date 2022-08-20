// NetworkContextClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;


public interface NetworkContextClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NetworkContextClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetworkContextClient, NetworkContextClient.Proxy> MANAGER = NetworkContextClient_Internal.MANAGER;


    void onFileUploadRequested(
int processId, boolean async, org.chromium.mojo_base.mojom.FilePath[] filePaths, 
OnFileUploadRequestedResponse callback);

    interface OnFileUploadRequestedResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, org.chromium.mojo_base.mojom.ReadOnlyFile[]> { }



    void onCanSendReportingReports(
org.chromium.url.internal.mojom.Origin[] origins, 
OnCanSendReportingReportsResponse callback);

    interface OnCanSendReportingReportsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.url.internal.mojom.Origin[]> { }



    void onCanSendDomainReliabilityUpload(
org.chromium.url.mojom.Url origin, 
OnCanSendDomainReliabilityUploadResponse callback);

    interface OnCanSendDomainReliabilityUploadResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void onClearSiteData(
int processId, int routingId, org.chromium.url.mojom.Url url, String headerValue, int loadFlags, 
OnClearSiteDataResponse callback);

    interface OnClearSiteDataResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void onGenerateHttpNegotiateAuthToken(
String serverAuthToken, boolean canDelegate, String authNegotiateAndroidAccountType, String spn, 
OnGenerateHttpNegotiateAuthTokenResponse callback);

    interface OnGenerateHttpNegotiateAuthTokenResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, String> { }



    void onTrustTokenIssuanceDivertedToSystem(
FulfillTrustTokenIssuanceRequest request, 
OnTrustTokenIssuanceDivertedToSystemResponse callback);

    interface OnTrustTokenIssuanceDivertedToSystemResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<FulfillTrustTokenIssuanceAnswer> { }


}