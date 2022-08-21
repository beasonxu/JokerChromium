package org.chromium.chrome.browser.page_info;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.BrowserContextHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@CheckDiscard("crbug.com/993421")
class PageInfoAboutThisSiteControllerJni implements PageInfoAboutThisSiteController.Natives {
  private static PageInfoAboutThisSiteController.Natives testInstance;

  public static final JniStaticTestMocker<PageInfoAboutThisSiteController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.page_info.PageInfoAboutThisSiteController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.page_info.PageInfoAboutThisSiteController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
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

  @Override
  public void onAboutThisSiteRowClicked(boolean withDescription) {
    GEN_JNI.org_chromium_chrome_browser_page_1info_PageInfoAboutThisSiteController_onAboutThisSiteRowClicked(withDescription);
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
