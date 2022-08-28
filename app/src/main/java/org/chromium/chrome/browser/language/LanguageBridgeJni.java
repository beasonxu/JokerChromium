package org.chromium.chrome.browser.language;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class LanguageBridgeJni implements LanguageBridge.Natives {
  private static LanguageBridge.Natives testInstance;

  public static final JniStaticTestMocker<LanguageBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<LanguageBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        LanguageBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String[] getULPModelLanguages() {
    return (String[])GEN_JNI.org_chromium_chrome_browser_language_LanguageBridge_getULPModelLanguages();
  }

  public static LanguageBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.language.LanguageBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LanguageBridgeJni();
  }
}
