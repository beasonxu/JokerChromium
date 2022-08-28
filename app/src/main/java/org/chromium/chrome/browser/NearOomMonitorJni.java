package org.chromium.chrome.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NearOomMonitorJni implements NearOomMonitor.Natives {
  private static NearOomMonitor.Natives testInstance;

  public static final JniStaticTestMocker<NearOomMonitor.Natives> TEST_HOOKS = new JniStaticTestMocker<NearOomMonitor.Natives>() {
    @Override
    public void setInstanceForTesting(NearOomMonitor.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onLowMemory(long nativeNearOomMonitor, NearOomMonitor caller) {
    GEN_JNI.org_chromium_chrome_browser_NearOomMonitor_onLowMemory(nativeNearOomMonitor, caller);
  }

  public static NearOomMonitor.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.NearOomMonitor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NearOomMonitorJni();
  }
}
