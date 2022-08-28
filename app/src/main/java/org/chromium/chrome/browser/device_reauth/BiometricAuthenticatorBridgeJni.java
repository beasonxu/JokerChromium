package org.chromium.chrome.browser.device_reauth;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class BiometricAuthenticatorBridgeJni implements BiometricAuthenticatorBridge.Natives {
  private static BiometricAuthenticatorBridge.Natives testInstance;

  public static final JniStaticTestMocker<BiometricAuthenticatorBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<org.chromium.chrome.browser.device_reauth.BiometricAuthenticatorBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.device_reauth.BiometricAuthenticatorBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAuthenticationCompleted(long nativeBiometricAuthenticatorBridgeImpl, int result) {
    GEN_JNI.org_chromium_chrome_browser_device_1reauth_BiometricAuthenticatorBridge_onAuthenticationCompleted(nativeBiometricAuthenticatorBridgeImpl, result);
  }

  public static BiometricAuthenticatorBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.device_reauth.BiometricAuthenticatorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BiometricAuthenticatorBridgeJni();
  }
}
