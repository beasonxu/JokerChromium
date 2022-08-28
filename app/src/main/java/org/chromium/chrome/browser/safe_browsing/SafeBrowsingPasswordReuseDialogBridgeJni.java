package org.chromium.chrome.browser.safe_browsing;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SafeBrowsingPasswordReuseDialogBridgeJni implements SafeBrowsingPasswordReuseDialogBridge.Natives {
  private static SafeBrowsingPasswordReuseDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<SafeBrowsingPasswordReuseDialogBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<SafeBrowsingPasswordReuseDialogBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        SafeBrowsingPasswordReuseDialogBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void checkPasswords(long nativePasswordReuseDialogViewAndroid,
      SafeBrowsingPasswordReuseDialogBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingPasswordReuseDialogBridge_checkPasswords(nativePasswordReuseDialogViewAndroid, caller);
  }

  @Override
  public void ignore(long nativePasswordReuseDialogViewAndroid,
      SafeBrowsingPasswordReuseDialogBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingPasswordReuseDialogBridge_ignore(nativePasswordReuseDialogViewAndroid, caller);
  }

  @Override
  public void close(long nativePasswordReuseDialogViewAndroid,
      SafeBrowsingPasswordReuseDialogBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingPasswordReuseDialogBridge_close(nativePasswordReuseDialogViewAndroid, caller);
  }

  public static SafeBrowsingPasswordReuseDialogBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.safe_browsing.SafeBrowsingPasswordReuseDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SafeBrowsingPasswordReuseDialogBridgeJni();
  }
}
