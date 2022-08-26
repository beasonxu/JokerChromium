package org.chromium.chrome.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ChromePowerModeVoterJni implements ChromePowerModeVoter.Natives {
  private static ChromePowerModeVoter.Natives testInstance;

  public static final JniStaticTestMocker<ChromePowerModeVoter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ChromePowerModeVoter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ChromePowerModeVoter.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onChromeActivityStateChange(boolean active) {
    GEN_JNI.org_chromium_chrome_browser_ChromePowerModeVoter_onChromeActivityStateChange(active);
  }

  @Override
  public void onViewTreeDraw() {
    GEN_JNI.org_chromium_chrome_browser_ChromePowerModeVoter_onViewTreeDraw();
  }

  @Override
  public void onCoordinatorTouchEvent() {
    GEN_JNI.org_chromium_chrome_browser_ChromePowerModeVoter_onCoordinatorTouchEvent();
  }

  public static ChromePowerModeVoter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ChromePowerModeVoter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromePowerModeVoterJni();
  }
}
