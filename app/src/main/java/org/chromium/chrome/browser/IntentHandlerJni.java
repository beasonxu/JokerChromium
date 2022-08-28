package org.chromium.chrome.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class IntentHandlerJni implements IntentHandler.Natives {
  private static IntentHandler.Natives testInstance;

  public static final JniStaticTestMocker<IntentHandler.Natives> TEST_HOOKS = new JniStaticTestMocker<IntentHandler.Natives>() {
    @Override
    public void setInstanceForTesting(IntentHandler.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isCorsSafelistedHeader(String name, String value) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_IntentHandler_isCorsSafelistedHeader(name, value);
  }

  public static IntentHandler.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.IntentHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new IntentHandlerJni();
  }
}
