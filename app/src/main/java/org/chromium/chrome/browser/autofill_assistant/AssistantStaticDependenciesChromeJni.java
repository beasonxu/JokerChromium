package org.chromium.chrome.browser.autofill_assistant;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.autofill_assistant.AssistantStaticDependencies;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AssistantStaticDependenciesChromeJni implements AssistantStaticDependenciesChrome.Natives {
  private static AssistantStaticDependenciesChrome.Natives testInstance;

  public static final JniStaticTestMocker<AssistantStaticDependenciesChrome.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill_assistant.AssistantStaticDependenciesChrome.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill_assistant.AssistantStaticDependenciesChrome.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(AssistantStaticDependencies staticDependencies) {
    return (long)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AssistantStaticDependenciesChrome_init(staticDependencies);
  }

  public static AssistantStaticDependenciesChrome.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill_assistant.AssistantStaticDependenciesChrome.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AssistantStaticDependenciesChromeJni();
  }
}
