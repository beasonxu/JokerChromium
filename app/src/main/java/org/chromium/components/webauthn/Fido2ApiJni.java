package org.chromium.components.webauthn;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class Fido2ApiJni implements Fido2Api.Natives {
  private static Fido2Api.Natives testInstance;

  public static final JniStaticTestMocker<Fido2Api.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.webauthn.Fido2Api.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.webauthn.Fido2Api.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean parseAttestationObject(byte[] attestationObject,
      Fido2Api.AttestationObjectParts result) {
    return (boolean)GEN_JNI.org_chromium_components_webauthn_Fido2Api_parseAttestationObject(attestationObject, result);
  }

  public static Fido2Api.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.webauthn.Fido2Api.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new Fido2ApiJni();
  }
}
