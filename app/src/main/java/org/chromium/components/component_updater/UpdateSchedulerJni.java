package org.chromium.components.component_updater;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class UpdateSchedulerJni implements UpdateScheduler.Natives {
  private static UpdateScheduler.Natives testInstance;

  public static final JniStaticTestMocker<UpdateScheduler.Natives> TEST_HOOKS = new JniStaticTestMocker<UpdateScheduler.Natives>() {
    @Override
    public void setInstanceForTesting(
        UpdateScheduler.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onStartTask(long nativeBackgroundTaskUpdateScheduler, UpdateScheduler caller) {
    GEN_JNI.org_chromium_components_component_1updater_UpdateScheduler_onStartTask(nativeBackgroundTaskUpdateScheduler, caller);
  }

  @Override
  public void onStopTask(long nativeBackgroundTaskUpdateScheduler, UpdateScheduler caller) {
    GEN_JNI.org_chromium_components_component_1updater_UpdateScheduler_onStopTask(nativeBackgroundTaskUpdateScheduler, caller);
  }

  public static UpdateScheduler.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.component_updater.UpdateScheduler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UpdateSchedulerJni();
  }
}
