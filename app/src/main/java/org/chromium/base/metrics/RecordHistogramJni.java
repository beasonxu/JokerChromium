package org.chromium.base.metrics;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
public class RecordHistogramJni implements RecordHistogram.Natives {
  private static RecordHistogram.Natives testInstance;

  public static final JniStaticTestMocker<RecordHistogram.Natives> TEST_HOOKS = new JniStaticTestMocker<RecordHistogram.Natives>() {
    @Override
    public void setInstanceForTesting(RecordHistogram.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getHistogramValueCountForTesting(String name, int sample, long snapshotPtr) {
    return (int)GEN_JNI.org_chromium_base_metrics_RecordHistogram_getHistogramValueCountForTesting(name, sample, snapshotPtr);
  }

  @Override
  public int getHistogramTotalCountForTesting(String name, long snapshotPtr) {
    return (int)GEN_JNI.org_chromium_base_metrics_RecordHistogram_getHistogramTotalCountForTesting(name, snapshotPtr);
  }

  @Override
  public long createHistogramSnapshotForTesting() {
    return (long)GEN_JNI.org_chromium_base_metrics_RecordHistogram_createHistogramSnapshotForTesting();
  }

  @Override
  public void destroyHistogramSnapshotForTesting(long snapshotPtr) {
    GEN_JNI.org_chromium_base_metrics_RecordHistogram_destroyHistogramSnapshotForTesting(snapshotPtr);
  }

  public static RecordHistogram.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.metrics.RecordHistogram.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new RecordHistogramJni();
  }
}
