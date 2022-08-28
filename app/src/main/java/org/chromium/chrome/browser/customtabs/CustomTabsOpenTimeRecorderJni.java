package org.chromium.chrome.browser.customtabs;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class CustomTabsOpenTimeRecorderJni implements CustomTabsOpenTimeRecorder.Natives {
  private static CustomTabsOpenTimeRecorder.Natives testInstance;

  public static final JniStaticTestMocker<CustomTabsOpenTimeRecorder.Natives> TEST_HOOKS = new JniStaticTestMocker<CustomTabsOpenTimeRecorder.Natives>() {
    @Override
    public void setInstanceForTesting(
        CustomTabsOpenTimeRecorder.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordCustomTabSession(long time, String packageName, long sessionDuration,
      boolean wasAutomaticallyClosed, boolean isPartialCct) {
    GEN_JNI.org_chromium_chrome_browser_customtabs_CustomTabsOpenTimeRecorder_recordCustomTabSession(time, packageName, sessionDuration, wasAutomaticallyClosed, isPartialCct);
  }

  public static CustomTabsOpenTimeRecorder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.customtabs.CustomTabsOpenTimeRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CustomTabsOpenTimeRecorderJni();
  }
}
