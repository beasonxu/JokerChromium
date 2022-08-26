package org.chromium.chrome.browser.device_reauth;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ReauthenticatorBridgeJni implements ReauthenticatorBridge.Natives {
  private static ReauthenticatorBridge.Natives testInstance;

  public static final JniStaticTestMocker<ReauthenticatorBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.device_reauth.ReauthenticatorBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.device_reauth.ReauthenticatorBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long create(ReauthenticatorBridge reauthenticatorBridge, int requester) {
    return (long)GEN_JNI.org_chromium_chrome_browser_device_1reauth_ReauthenticatorBridge_create(reauthenticatorBridge, requester);
  }

  @Override
  public boolean canUseAuthentication(long nativeReauthenticatorBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_device_1reauth_ReauthenticatorBridge_canUseAuthentication(nativeReauthenticatorBridge);
  }

  @Override
  public void reauthenticate(long nativeReauthenticatorBridge) {
    GEN_JNI.org_chromium_chrome_browser_device_1reauth_ReauthenticatorBridge_reauthenticate(nativeReauthenticatorBridge);
  }

  public static ReauthenticatorBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.device_reauth.ReauthenticatorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ReauthenticatorBridgeJni();
  }
}
