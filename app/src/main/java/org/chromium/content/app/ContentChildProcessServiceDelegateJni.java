package org.chromium.content.app;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class ContentChildProcessServiceDelegateJni implements ContentChildProcessServiceDelegate.Natives {
  private static ContentChildProcessServiceDelegate.Natives testInstance;

  public static final JniStaticTestMocker<ContentChildProcessServiceDelegate.Natives> TEST_HOOKS = new JniStaticTestMocker<ContentChildProcessServiceDelegate.Natives>() {
    @Override
    public void setInstanceForTesting(
        ContentChildProcessServiceDelegate.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void initChildProcess(ContentChildProcessServiceDelegate caller, int cpuCount,
      long cpuFeatures) {
    GEN_JNI.org_chromium_content_app_ContentChildProcessServiceDelegate_initChildProcess(caller, cpuCount, cpuFeatures);
  }

  @Override
  public void initMemoryPressureListener() {
    GEN_JNI.org_chromium_content_app_ContentChildProcessServiceDelegate_initMemoryPressureListener();
  }

  @Override
  public void retrieveFileDescriptorsIdsToKeys(ContentChildProcessServiceDelegate caller) {
    GEN_JNI.org_chromium_content_app_ContentChildProcessServiceDelegate_retrieveFileDescriptorsIdsToKeys(caller);
  }

  public static ContentChildProcessServiceDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.app.ContentChildProcessServiceDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ContentChildProcessServiceDelegateJni();
  }
}
