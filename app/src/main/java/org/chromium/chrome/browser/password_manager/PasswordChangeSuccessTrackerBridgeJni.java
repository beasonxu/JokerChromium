package org.chromium.chrome.browser.password_manager;

import java.lang.Override;
import java.lang.String;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@CheckDiscard("crbug.com/993421")
public class PasswordChangeSuccessTrackerBridgeJni implements PasswordChangeSuccessTrackerBridge.Natives {
  private static PasswordChangeSuccessTrackerBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordChangeSuccessTrackerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.PasswordChangeSuccessTrackerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.PasswordChangeSuccessTrackerBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAutomatedPasswordChangeStarted(GURL url, String username) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordChangeSuccessTrackerBridge_onAutomatedPasswordChangeStarted(url, username);
  }

  @Override
  public void onManualPasswordChangeStarted(GURL url, String username) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordChangeSuccessTrackerBridge_onManualPasswordChangeStarted(url, username);
  }

  public static PasswordChangeSuccessTrackerBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.PasswordChangeSuccessTrackerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordChangeSuccessTrackerBridgeJni();
  }
}
