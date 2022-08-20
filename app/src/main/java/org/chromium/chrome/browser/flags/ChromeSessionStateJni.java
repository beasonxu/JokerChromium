package org.chromium.chrome.browser.flags;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class ChromeSessionStateJni implements ChromeSessionState.Natives {
  private static ChromeSessionState.Natives testInstance;

  public static final JniStaticTestMocker<ChromeSessionState.Natives> TEST_HOOKS = new JniStaticTestMocker<org.chromium.chrome.browser.flags.ChromeSessionState.Natives>() {
    @Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.flags.ChromeSessionState.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setActivityType(int type) {
    GEN_JNI.org_chromium_chrome_browser_flags_ChromeSessionState_setActivityType(type);
  }

  @Override
  public void setIsInMultiWindowMode(boolean isInMultiWindowMode) {
    GEN_JNI.org_chromium_chrome_browser_flags_ChromeSessionState_setIsInMultiWindowMode(isInMultiWindowMode);
  }

  @Override
  public void setDarkModeState(int state) {
    GEN_JNI.org_chromium_chrome_browser_flags_ChromeSessionState_setDarkModeState(state);
  }

  public static ChromeSessionState.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.flags.ChromeSessionState.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeSessionStateJni();
  }
}
