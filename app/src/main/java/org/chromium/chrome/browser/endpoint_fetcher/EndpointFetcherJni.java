package org.chromium.chrome.browser.endpoint_fetcher;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class EndpointFetcherJni implements EndpointFetcher.Natives {
  private static EndpointFetcher.Natives testInstance;

  public static final JniStaticTestMocker<EndpointFetcher.Natives> TEST_HOOKS = new JniStaticTestMocker<EndpointFetcher.Natives>() {
    @Override
    public void setInstanceForTesting(
        EndpointFetcher.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void nativeFetchOAuth(Profile profile, String oathConsumerName, String url,
      String httpsMethod, String contentType, String[] scopes, String postData, long timeout,
      int annotationHashCode, Callback<EndpointResponse> callback) {
    GEN_JNI.org_chromium_chrome_browser_endpoint_1fetcher_EndpointFetcher_nativeFetchOAuth(profile, oathConsumerName, url, httpsMethod, contentType, scopes, postData, timeout, annotationHashCode, callback);
  }

  @Override
  public void nativeFetchChromeAPIKey(Profile profile, String url, String httpsMethod,
      String contentType, String postData, long timeout, String[] headers, int annotationHashCode,
      Callback<EndpointResponse> callback) {
    GEN_JNI.org_chromium_chrome_browser_endpoint_1fetcher_EndpointFetcher_nativeFetchChromeAPIKey(profile, url, httpsMethod, contentType, postData, timeout, headers, annotationHashCode, callback);
  }

  @Override
  public void nativeFetchWithNoAuth(Profile profile, String url, int annotationHashCode,
      Callback<EndpointResponse> callback) {
    GEN_JNI.org_chromium_chrome_browser_endpoint_1fetcher_EndpointFetcher_nativeFetchWithNoAuth(profile, url, annotationHashCode, callback);
  }

  public static EndpointFetcher.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.endpoint_fetcher.EndpointFetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new EndpointFetcherJni();
  }
}
