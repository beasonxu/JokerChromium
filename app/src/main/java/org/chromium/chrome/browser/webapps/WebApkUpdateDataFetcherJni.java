package org.chromium.chrome.browser.webapps;

import java.lang.Override;
import java.lang.String;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@CheckDiscard("crbug.com/993421")
class WebApkUpdateDataFetcherJni implements WebApkUpdateDataFetcher.Natives {
  private static WebApkUpdateDataFetcher.Natives testInstance;

  public static final JniStaticTestMocker<WebApkUpdateDataFetcher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.WebApkUpdateDataFetcher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.WebApkUpdateDataFetcher.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initialize(WebApkUpdateDataFetcher caller, String startUrl, String scope,
      String webManifestUrl, String webManifestId) {
    return (long)GEN_JNI.org_chromium_chrome_browser_webapps_WebApkUpdateDataFetcher_initialize(caller, startUrl, scope, webManifestUrl, webManifestId);
  }

  @Override
  public void replaceWebContents(long nativeWebApkUpdateDataFetcher, WebApkUpdateDataFetcher caller,
      WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkUpdateDataFetcher_replaceWebContents(nativeWebApkUpdateDataFetcher, caller, webContents);
  }

  @Override
  public void destroy(long nativeWebApkUpdateDataFetcher, WebApkUpdateDataFetcher caller) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkUpdateDataFetcher_destroy(nativeWebApkUpdateDataFetcher, caller);
  }

  @Override
  public void start(long nativeWebApkUpdateDataFetcher, WebApkUpdateDataFetcher caller,
      WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkUpdateDataFetcher_start(nativeWebApkUpdateDataFetcher, caller, webContents);
  }

  public static WebApkUpdateDataFetcher.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.WebApkUpdateDataFetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebApkUpdateDataFetcherJni();
  }
}
