package org.chromium.components.continuous_search;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.continuous_search.SearchResultExtractorProducer;
import org.chromium.content_public.browser.WebContents;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public
class SearchResultExtractorProducerJni implements SearchResultExtractorProducer.Natives {
  private static SearchResultExtractorProducer.Natives testInstance;

  public static final JniStaticTestMocker<SearchResultExtractorProducer.Natives> TEST_HOOKS = new JniStaticTestMocker<SearchResultExtractorProducer.Natives>() {
    @Override
    public void setInstanceForTesting(
        SearchResultExtractorProducer.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long create(SearchResultExtractorProducer producer) {
    return (long)GEN_JNI.org_chromium_chrome_browser_continuous_1search_SearchResultExtractorProducer_create(producer);
  }

  @Override
  public void fetchResults(long nativeSearchResultExtractorProducer, WebContents webContents,
      String query) {
    GEN_JNI.org_chromium_chrome_browser_continuous_1search_SearchResultExtractorProducer_fetchResults(nativeSearchResultExtractorProducer, webContents, query);
  }

  @Override
  public void destroy(long nativeSearchResultExtractorProducer) {
    GEN_JNI.org_chromium_chrome_browser_continuous_1search_SearchResultExtractorProducer_destroy(nativeSearchResultExtractorProducer);
  }

  public static SearchResultExtractorProducer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.continuous_search.SearchResultExtractorProducer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SearchResultExtractorProducerJni();
  }
}
