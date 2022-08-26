package org.chromium.chrome.browser.customtabs.features;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TabInteractionRecorderJni implements TabInteractionRecorder.Natives {
  private static TabInteractionRecorder.Natives testInstance;

  public static final JniStaticTestMocker<TabInteractionRecorder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.customtabs.features.TabInteractionRecorder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.customtabs.features.TabInteractionRecorder.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public TabInteractionRecorder getFromTab(Tab tab) {
    return (TabInteractionRecorder)GEN_JNI.org_chromium_chrome_browser_customtabs_features_TabInteractionRecorder_getFromTab(tab);
  }

  @Override
  public TabInteractionRecorder createForTab(Tab tab) {
    return (TabInteractionRecorder)GEN_JNI.org_chromium_chrome_browser_customtabs_features_TabInteractionRecorder_createForTab(tab);
  }

  @Override
  public boolean hadInteraction(long nativeTabInteractionRecorderAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_customtabs_features_TabInteractionRecorder_hadInteraction(nativeTabInteractionRecorderAndroid);
  }

  public static TabInteractionRecorder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.customtabs.features.TabInteractionRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabInteractionRecorderJni();
  }
}
