package org.chromium.base.metrics;

import java.lang.Override;
import java.lang.String;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@MainDex
@CheckDiscard("crbug.com/993421")
public class NativeUmaRecorderJni implements NativeUmaRecorder.Natives {
  private static NativeUmaRecorder.Natives testInstance;

  public static final JniStaticTestMocker<NativeUmaRecorder.Natives> TEST_HOOKS = new JniStaticTestMocker<NativeUmaRecorder.Natives>() {
    @Override
    public void setInstanceForTesting(NativeUmaRecorder.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long recordBooleanHistogram(String name, long nativeHint, boolean sample) {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordBooleanHistogram(name, nativeHint, sample);
  }

  @Override
  public long recordExponentialHistogram(String name, long nativeHint, int sample, int min, int max,
      int numBuckets) {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordExponentialHistogram(name, nativeHint, sample, min, max, numBuckets);
  }

  @Override
  public long recordLinearHistogram(String name, long nativeHint, int sample, int min, int max,
      int numBuckets) {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordLinearHistogram(name, nativeHint, sample, min, max, numBuckets);
  }

  @Override
  public long recordSparseHistogram(String name, long nativeHint, int sample) {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordSparseHistogram(name, nativeHint, sample);
  }

  @Override
  public void recordUserAction(String name, long millisSinceEvent) {
    GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordUserAction(name, millisSinceEvent);
  }

  @Override
  public int getHistogramValueCountForTesting(String name, int sample, long snapshotPtr) {
    return (int)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_getHistogramValueCountForTesting(name, sample, snapshotPtr);
  }

  @Override
  public int getHistogramTotalCountForTesting(String name, long snapshotPtr) {
    return (int)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_getHistogramTotalCountForTesting(name, snapshotPtr);
  }

  @Override
  public long createHistogramSnapshotForTesting() {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_createHistogramSnapshotForTesting();
  }

  @Override
  public void destroyHistogramSnapshotForTesting(long snapshotPtr) {
    GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_destroyHistogramSnapshotForTesting(snapshotPtr);
  }

  @Override
  public long addActionCallbackForTesting(Callback<String> callback) {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_addActionCallbackForTesting(callback);
  }

  @Override
  public void removeActionCallbackForTesting(long callbackId) {
    GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_removeActionCallbackForTesting(callbackId);
  }

  public static NativeUmaRecorder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.metrics.NativeUmaRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new NativeUmaRecorderJni();
  }
}
