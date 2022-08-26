package org.chromium.components.webauthn;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.RenderFrameHost;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class WebAuthnBrowserBridgeJni implements WebAuthnBrowserBridge.Natives {
  private static WebAuthnBrowserBridge.Natives testInstance;

  public static final JniStaticTestMocker<WebAuthnBrowserBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.webauthn.WebAuthnBrowserBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.webauthn.WebAuthnBrowserBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createNativeWebAuthnBrowserBridge(WebAuthnBrowserBridge caller) {
    return (long)GEN_JNI.org_chromium_components_webauthn_WebAuthnBrowserBridge_createNativeWebAuthnBrowserBridge(caller);
  }

  @Override
  public void onCredentialsDetailsListReceived(long nativeWebAuthnBrowserBridge,
      WebAuthnBrowserBridge caller, WebAuthnCredentialDetails[] credentialList,
      RenderFrameHost frameHost, Callback<byte[]> callback) {
    GEN_JNI.org_chromium_components_webauthn_WebAuthnBrowserBridge_onCredentialsDetailsListReceived(nativeWebAuthnBrowserBridge, caller, credentialList, frameHost, callback);
  }

  public static WebAuthnBrowserBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.webauthn.WebAuthnBrowserBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebAuthnBrowserBridgeJni();
  }
}
