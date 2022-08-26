package org.chromium.chrome.browser.merchant_viewer;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class WebContentsHelpersJni implements WebContentsHelpers.Natives {
  private static WebContentsHelpers.Natives testInstance;

  public static final JniStaticTestMocker<WebContentsHelpers.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.merchant_viewer.WebContentsHelpers.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.merchant_viewer.WebContentsHelpers.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setUserAgentOverride(WebContents webContents, boolean overrideInNewTabs) {
    GEN_JNI.org_chromium_chrome_browser_merchant_1viewer_WebContentsHelpers_setUserAgentOverride(webContents, overrideInNewTabs);
  }

  @Override
  public WebContents createWebContents(Profile profile, boolean initiallyHidden,
      boolean initializeRenderer) {
    return (WebContents)GEN_JNI.org_chromium_chrome_browser_merchant_1viewer_WebContentsHelpers_createWebContents(profile, initiallyHidden, initializeRenderer);
  }

  public static WebContentsHelpers.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.merchant_viewer.WebContentsHelpers.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebContentsHelpersJni();
  }
}
