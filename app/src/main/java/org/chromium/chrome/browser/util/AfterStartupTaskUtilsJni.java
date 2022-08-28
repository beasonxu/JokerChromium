package org.chromium.chrome.browser.util;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AfterStartupTaskUtilsJni implements AfterStartupTaskUtils.Natives {
  private static AfterStartupTaskUtils.Natives testInstance;

  public static final JniStaticTestMocker<AfterStartupTaskUtils.Natives> TEST_HOOKS = new JniStaticTestMocker<AfterStartupTaskUtils.Natives>() {
    @Override
    public void setInstanceForTesting(
        AfterStartupTaskUtils.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setStartupComplete() {
    GEN_JNI.org_chromium_chrome_browser_util_AfterStartupTaskUtils_setStartupComplete();
  }

  public static AfterStartupTaskUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.util.AfterStartupTaskUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AfterStartupTaskUtilsJni();
  }
}
