package org.chromium.chrome.browser.search_engines;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.search_engines.TemplateUrlService;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class TemplateUrlServiceFactoryJni implements TemplateUrlServiceFactory.Natives {
  private static TemplateUrlServiceFactory.Natives testInstance;

  public static final JniStaticTestMocker<TemplateUrlServiceFactory.Natives> TEST_HOOKS = new JniStaticTestMocker<TemplateUrlServiceFactory.Natives>() {
    @Override
    public void setInstanceForTesting(
        TemplateUrlServiceFactory.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public TemplateUrlService getTemplateUrlService() {
    return (TemplateUrlService)GEN_JNI.org_chromium_chrome_browser_search_1engines_TemplateUrlServiceFactory_getTemplateUrlService();
  }

  public static TemplateUrlServiceFactory.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.search_engines.TemplateUrlServiceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TemplateUrlServiceFactoryJni();
  }
}