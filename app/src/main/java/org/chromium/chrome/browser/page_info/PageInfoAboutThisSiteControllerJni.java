package org.chromium.chrome.browser.page_info;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.BrowserContextHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PageInfoAboutThisSiteControllerJni implements PageInfoAboutThisSiteController.Natives {
  private static PageInfoAboutThisSiteController.Natives testInstance;

  public static final JniStaticTestMocker<PageInfoAboutThisSiteController.Natives> TEST_HOOKS = new JniStaticTestMocker<PageInfoAboutThisSiteController.Natives>() {
    @Override
    public void setInstanceForTesting(
        PageInfoAboutThisSiteController.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isFeatureEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_page_1info_PageInfoAboutThisSiteController_isFeatureEnabled();
  }

  @Override
  public byte[] getSiteInfo(BrowserContextHandle browserContext, GURL url,
      WebContents webContents) {
    return (byte[])GEN_JNI.org_chromium_chrome_browser_page_1info_PageInfoAboutThisSiteController_getSiteInfo(browserContext, url, webContents);
  }

  public static PageInfoAboutThisSiteController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.page_info.PageInfoAboutThisSiteController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PageInfoAboutThisSiteControllerJni();
  }
}
