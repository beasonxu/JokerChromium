package org.chromium.components.ukm;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class UkmRecorderJni implements UkmRecorder.Natives {
  private static UkmRecorder.Natives testInstance;

  public static final JniStaticTestMocker<UkmRecorder.Natives> TEST_HOOKS = new JniStaticTestMocker<UkmRecorder.Natives>() {
    @Override
    public void setInstanceForTesting(UkmRecorder.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordEventWithBooleanMetric(WebContents webContents, String eventName,
      String metricName) {
    GEN_JNI.org_chromium_components_ukm_UkmRecorder_recordEventWithBooleanMetric(webContents, eventName, metricName);
  }

  @Override
  public void recordEventWithIntegerMetric(WebContents webContents, String eventName,
      String metricName, int metricValue) {
    GEN_JNI.org_chromium_components_ukm_UkmRecorder_recordEventWithIntegerMetric(webContents, eventName, metricName, metricValue);
  }

  public static UkmRecorder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.ukm.UkmRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UkmRecorderJni();
  }
}
