package org.chromium.chrome.browser.share.send_tab_to_self;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class MetricsRecorderJni implements MetricsRecorder.Natives {
  private static MetricsRecorder.Natives testInstance;

  public static final JniStaticTestMocker<MetricsRecorder.Natives> TEST_HOOKS = new JniStaticTestMocker<MetricsRecorder.Natives>() {
    @Override
    public void setInstanceForTesting(
        MetricsRecorder.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordDeviceClickedInShareSheet() {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_MetricsRecorder_recordDeviceClickedInShareSheet();
  }

  @Override
  public void recordNotificationShown() {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_MetricsRecorder_recordNotificationShown();
  }

  @Override
  public void recordNotificationOpened() {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_MetricsRecorder_recordNotificationOpened();
  }

  @Override
  public void recordNotificationDismissed() {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_MetricsRecorder_recordNotificationDismissed();
  }

  @Override
  public void recordNotificationTimedOut() {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_MetricsRecorder_recordNotificationTimedOut();
  }

  public static MetricsRecorder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.send_tab_to_self.MetricsRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MetricsRecorderJni();
  }
}
