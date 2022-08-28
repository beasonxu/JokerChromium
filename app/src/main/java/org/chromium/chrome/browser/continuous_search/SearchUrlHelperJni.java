package org.chromium.chrome.browser.continuous_search;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SearchUrlHelperJni implements SearchUrlHelper.Natives {
  private static SearchUrlHelper.Natives testInstance;

  public static final JniStaticTestMocker<SearchUrlHelper.Natives> TEST_HOOKS = new JniStaticTestMocker<SearchUrlHelper.Natives>() {
    @Override
    public void setInstanceForTesting(
        SearchUrlHelper.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isGoogleDomainUrl(GURL url) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_continuous_1search_SearchUrlHelper_isGoogleDomainUrl(url);
  }

  @Override
  public String getQueryIfValidSrpUrl(GURL url) {
    return (String)GEN_JNI.org_chromium_chrome_browser_continuous_1search_SearchUrlHelper_getQueryIfValidSrpUrl(url);
  }

  @Override
  public int getSrpPageCategoryFromUrl(GURL url) {
    return (int)GEN_JNI.org_chromium_chrome_browser_continuous_1search_SearchUrlHelper_getSrpPageCategoryFromUrl(url);
  }

  @Override
  public GURL getOriginalUrlFromWebContents(WebContents webContents) {
    return (GURL)GEN_JNI.org_chromium_chrome_browser_continuous_1search_SearchUrlHelper_getOriginalUrlFromWebContents(webContents);
  }

  public static SearchUrlHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.continuous_search.SearchUrlHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SearchUrlHelperJni();
  }
}
