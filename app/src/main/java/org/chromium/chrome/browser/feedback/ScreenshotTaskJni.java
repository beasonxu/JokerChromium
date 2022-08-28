package org.chromium.chrome.browser.feedback;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ScreenshotTaskJni implements ScreenshotTask.Natives {
  private static ScreenshotTask.Natives testInstance;

  public static final JniStaticTestMocker<ScreenshotTask.Natives> TEST_HOOKS = new JniStaticTestMocker<ScreenshotTask.Natives>() {
    @Override
    public void setInstanceForTesting(
        ScreenshotTask.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void grabWindowSnapshotAsync(ScreenshotTask callback, WindowAndroid window, int width,
      int height) {
    GEN_JNI.org_chromium_chrome_browser_feedback_ScreenshotTask_grabWindowSnapshotAsync(callback, window, width, height);
  }

  public static ScreenshotTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feedback.ScreenshotTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ScreenshotTaskJni();
  }
}