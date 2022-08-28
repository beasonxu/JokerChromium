package org.chromium.chrome.browser.feed;

import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class FeedServiceBridgeJni implements FeedServiceBridge.Natives {
  private static FeedServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedServiceBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<FeedServiceBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        FeedServiceBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_isEnabled();
  }

  @Override
  public void startup() {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_startup();
  }

  @Override
  public int getLoadMoreTriggerLookahead() {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_getLoadMoreTriggerLookahead();
  }

  @Override
  public int getLoadMoreTriggerScrollDistanceDp() {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_getLoadMoreTriggerScrollDistanceDp();
  }

  @Override
  public void reportOpenVisitComplete(long visitTimeMs) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_reportOpenVisitComplete(visitTimeMs);
  }

  @Override
  public int getVideoPreviewsTypePreference() {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_getVideoPreviewsTypePreference();
  }

  @Override
  public void setVideoPreviewsTypePreference(int videoPreviewsType) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_setVideoPreviewsTypePreference(videoPreviewsType);
  }

  @Override
  public long getReliabilityLoggingId() {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_getReliabilityLoggingId();
  }

  @Override
  public boolean isAutoplayEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_isAutoplayEnabled();
  }

  @Override
  public void reportOtherUserAction(int streamKind, int userAction) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_reportOtherUserAction(streamKind, userAction);
  }

  @Override
  public int getContentOrderForWebFeed() {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_getContentOrderForWebFeed();
  }

  @Override
  public void setContentOrderForWebFeed(int contentOrder) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_setContentOrderForWebFeed(contentOrder);
  }

  @Override
  public long addUnreadContentObserver(Object object, boolean isWebFeed) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_addUnreadContentObserver(object, isWebFeed);
  }

  @Override
  public void destroy(long nativePtr) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedServiceBridge_destroy(nativePtr);
  }

  public static FeedServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedServiceBridgeJni();
  }
}
