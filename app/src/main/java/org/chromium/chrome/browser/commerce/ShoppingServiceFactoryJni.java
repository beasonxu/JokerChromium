package org.chromium.chrome.browser.commerce;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.commerce.core.ShoppingService;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ShoppingServiceFactoryJni implements ShoppingServiceFactory.Natives {
  private static ShoppingServiceFactory.Natives testInstance;

  public static final JniStaticTestMocker<ShoppingServiceFactory.Natives> TEST_HOOKS = new JniStaticTestMocker<ShoppingServiceFactory.Natives>() {
    @Override
    public void setInstanceForTesting(
        ShoppingServiceFactory.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public ShoppingService getForProfile(Profile profile) {
    return (ShoppingService)GEN_JNI.org_chromium_chrome_browser_commerce_ShoppingServiceFactory_getForProfile(profile);
  }

  public static ShoppingServiceFactory.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.commerce.ShoppingServiceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ShoppingServiceFactoryJni();
  }
}
