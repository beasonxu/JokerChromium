package org.chromium.chrome.browser.prefetch.settings;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class PreloadPagesSettingsBridgeJni implements PreloadPagesSettingsBridge.Natives {
  private static PreloadPagesSettingsBridge.Natives testInstance;

  public static final JniStaticTestMocker<PreloadPagesSettingsBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<PreloadPagesSettingsBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        PreloadPagesSettingsBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getState() {
    return (int)GEN_JNI.org_chromium_chrome_browser_prefetch_settings_PreloadPagesSettingsBridge_getState();
  }

  @Override
  public void setState(int mode) {
    GEN_JNI.org_chromium_chrome_browser_prefetch_settings_PreloadPagesSettingsBridge_setState(mode);
  }

  @Override
  public boolean isNetworkPredictionManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_prefetch_settings_PreloadPagesSettingsBridge_isNetworkPredictionManaged();
  }

  public static PreloadPagesSettingsBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.prefetch.settings.PreloadPagesSettingsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PreloadPagesSettingsBridgeJni();
  }
}
