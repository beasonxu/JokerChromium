package org.chromium.chrome.browser.password_manager;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class PasswordChangeSuccessTrackerBridgeJni implements PasswordChangeSuccessTrackerBridge.Natives {
  private static PasswordChangeSuccessTrackerBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordChangeSuccessTrackerBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<PasswordChangeSuccessTrackerBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        PasswordChangeSuccessTrackerBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
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
