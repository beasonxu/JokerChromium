package org.chromium.chrome.browser.safety_check;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.BrowserContextHandle;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SafetyCheckBridgeJni implements SafetyCheckBridge.Natives {
  private static SafetyCheckBridge.Natives testInstance;

  public static final JniStaticTestMocker<SafetyCheckBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<SafetyCheckBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        SafetyCheckBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean userSignedIn(BrowserContextHandle browserContext) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_safety_1check_SafetyCheckBridge_userSignedIn(browserContext);
  }

  @Override
  public int checkSafeBrowsing(BrowserContextHandle browserContext) {
    return (int)GEN_JNI.org_chromium_chrome_browser_safety_1check_SafetyCheckBridge_checkSafeBrowsing(browserContext);
  }

  public static SafetyCheckBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.safety_check.SafetyCheckBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SafetyCheckBridgeJni();
  }
}
