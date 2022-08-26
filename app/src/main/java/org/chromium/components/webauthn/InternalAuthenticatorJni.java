package org.chromium.components.webauthn;

import java.lang.Override;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class InternalAuthenticatorJni implements InternalAuthenticator.Natives {
  private static InternalAuthenticator.Natives testInstance;

  public static final JniStaticTestMocker<InternalAuthenticator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.webauthn.InternalAuthenticator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.webauthn.InternalAuthenticator.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void invokeMakeCredentialResponse(long nativeInternalAuthenticatorAndroid, int status,
      ByteBuffer byteBuffer) {
    GEN_JNI.org_chromium_components_webauthn_InternalAuthenticator_invokeMakeCredentialResponse(nativeInternalAuthenticatorAndroid, status, byteBuffer);
  }

  @Override
  public void invokeGetAssertionResponse(long nativeInternalAuthenticatorAndroid, int status,
      ByteBuffer byteBuffer) {
    GEN_JNI.org_chromium_components_webauthn_InternalAuthenticator_invokeGetAssertionResponse(nativeInternalAuthenticatorAndroid, status, byteBuffer);
  }

  @Override
  public void invokeIsUserVerifyingPlatformAuthenticatorAvailableResponse(
      long nativeInternalAuthenticatorAndroid, boolean isUVPAA) {
    GEN_JNI.org_chromium_components_webauthn_InternalAuthenticator_invokeIsUserVerifyingPlatformAuthenticatorAvailableResponse(nativeInternalAuthenticatorAndroid, isUVPAA);
  }

  public static InternalAuthenticator.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.webauthn.InternalAuthenticator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InternalAuthenticatorJni();
  }
}
