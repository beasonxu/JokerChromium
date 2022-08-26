package org.chromium.chrome.browser.feed.webfeed;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class WebFeedBridgeJni implements WebFeedBridge.Natives {
  private static WebFeedBridge.Natives testInstance;

  public static final JniStaticTestMocker<WebFeedBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.webfeed.WebFeedBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.webfeed.WebFeedBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void followWebFeed(WebFeedBridge.WebFeedPageInformation pageInfo,
      Callback<WebFeedBridge.FollowResults> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_followWebFeed(pageInfo, callback);
  }

  @Override
  public void followWebFeedById(byte[] webFeedId, boolean isDurable,
      Callback<WebFeedBridge.FollowResults> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_followWebFeedById(webFeedId, isDurable, callback);
  }

  @Override
  public void unfollowWebFeed(byte[] webFeedId, boolean isDurable,
      Callback<WebFeedBridge.UnfollowResults> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_unfollowWebFeed(webFeedId, isDurable, callback);
  }

  @Override
  public void findWebFeedInfoForPage(WebFeedBridge.WebFeedPageInformation pageInfo, int reason,
      Callback<WebFeedBridge.WebFeedMetadata> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_findWebFeedInfoForPage(pageInfo, reason, callback);
  }

  @Override
  public void findWebFeedInfoForWebFeedId(byte[] webFeedId,
      Callback<WebFeedBridge.WebFeedMetadata> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_findWebFeedInfoForWebFeedId(webFeedId, callback);
  }

  @Override
  public void getAllSubscriptions(Callback<Object[]> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_getAllSubscriptions(callback);
  }

  @Override
  public void refreshSubscriptions(Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_refreshSubscriptions(callback);
  }

  @Override
  public void refreshRecommendedFeeds(Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_refreshRecommendedFeeds(callback);
  }

  @Override
  public void getRecentVisitCountsToHost(GURL url, Callback<int[]> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_getRecentVisitCountsToHost(url, callback);
  }

  @Override
  public void incrementFollowedFromWebPageMenuCount() {
    GEN_JNI.org_chromium_chrome_browser_feed_webfeed_WebFeedBridge_incrementFollowedFromWebPageMenuCount();
  }

  public static WebFeedBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.webfeed.WebFeedBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebFeedBridgeJni();
  }
}
