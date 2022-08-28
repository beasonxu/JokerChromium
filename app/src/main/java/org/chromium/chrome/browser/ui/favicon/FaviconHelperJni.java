package org.chromium.chrome.browser.ui.favicon;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class FaviconHelperJni implements FaviconHelper.Natives {
  private static FaviconHelper.Natives testInstance;

  public static final JniStaticTestMocker<FaviconHelper.Natives> TEST_HOOKS = new JniStaticTestMocker<FaviconHelper.Natives>() {
    @Override
    public void setInstanceForTesting(
        FaviconHelper.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init() {
    return (long)GEN_JNI.org_chromium_chrome_browser_ui_favicon_FaviconHelper_init();
  }

  @Override
  public void destroy(long nativeFaviconHelper) {
    GEN_JNI.org_chromium_chrome_browser_ui_favicon_FaviconHelper_destroy(nativeFaviconHelper);
  }

  @Override
  public boolean getComposedFaviconImage(long nativeFaviconHelper, Profile profile, GURL[] urls,
      int desiredSizeInDip, FaviconHelper.FaviconImageCallback faviconImageCallback) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ui_favicon_FaviconHelper_getComposedFaviconImage(nativeFaviconHelper, profile, urls, desiredSizeInDip, faviconImageCallback);
  }

  @Override
  public boolean getLocalFaviconImageForURL(long nativeFaviconHelper, Profile profile,
      String pageUrl, int desiredSizeInDip,
      FaviconHelper.FaviconImageCallback faviconImageCallback) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ui_favicon_FaviconHelper_getLocalFaviconImageForURL(nativeFaviconHelper, profile, pageUrl, desiredSizeInDip, faviconImageCallback);
  }

  @Override
  public boolean getForeignFaviconImageForURL(long nativeFaviconHelper, Profile profile,
      GURL pageUrl, int desiredSizeInDip, FaviconHelper.FaviconImageCallback faviconImageCallback) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ui_favicon_FaviconHelper_getForeignFaviconImageForURL(nativeFaviconHelper, profile, pageUrl, desiredSizeInDip, faviconImageCallback);
  }

  public static FaviconHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ui.favicon.FaviconHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FaviconHelperJni();
  }
}
