package org.chromium.chrome.modules.dev_ui;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class DevUiInstallListenerJni implements DevUiInstallListener.Natives {
  private static DevUiInstallListener.Natives testInstance;

  public static final JniStaticTestMocker<DevUiInstallListener.Natives> TEST_HOOKS = new JniStaticTestMocker<DevUiInstallListener.Natives>() {
    @Override
    public void setInstanceForTesting(
        DevUiInstallListener.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onComplete(long nativeDevUiInstallListener, boolean success) {
    GEN_JNI.org_chromium_chrome_modules_dev_1ui_DevUiInstallListener_onComplete(nativeDevUiInstallListener, success);
  }

  public static DevUiInstallListener.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.modules.dev_ui.DevUiInstallListener.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DevUiInstallListenerJni();
  }
}