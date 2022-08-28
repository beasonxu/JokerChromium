package org.chromium.chrome.browser.password_manager;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PasswordScriptsFetcherBridgeJni implements PasswordScriptsFetcherBridge.Natives {
  private static PasswordScriptsFetcherBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordScriptsFetcherBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<PasswordScriptsFetcherBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        PasswordScriptsFetcherBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void prewarmCache() {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordScriptsFetcherBridge_prewarmCache();
  }

  public static PasswordScriptsFetcherBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.PasswordScriptsFetcherBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordScriptsFetcherBridgeJni();
  }
}