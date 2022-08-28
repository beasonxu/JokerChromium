package org.chromium.base.process_launcher;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class ChildProcessServiceJni implements ChildProcessService.Natives {
  private static ChildProcessService.Natives testInstance;

  public static final JniStaticTestMocker<ChildProcessService.Natives> TEST_HOOKS = new JniStaticTestMocker<ChildProcessService.Natives>() {
    @Override
    public void setInstanceForTesting(
        ChildProcessService.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void registerFileDescriptors(String[] keys, int[] id, int[] fd, long[] offset,
      long[] size) {
    GEN_JNI.org_chromium_base_process_1launcher_ChildProcessService_registerFileDescriptors(keys, id, fd, offset, size);
  }

  @Override
  public void exitChildProcess() {
    GEN_JNI.org_chromium_base_process_1launcher_ChildProcessService_exitChildProcess();
  }

  @Override
  public void dumpProcessStack() {
    GEN_JNI.org_chromium_base_process_1launcher_ChildProcessService_dumpProcessStack();
  }

  public static ChildProcessService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.process_launcher.ChildProcessService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ChildProcessServiceJni();
  }
}
