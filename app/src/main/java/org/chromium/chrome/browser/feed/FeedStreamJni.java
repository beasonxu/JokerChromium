package org.chromium.chrome.browser.feed;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class FeedStreamJni implements FeedStream.Natives {
  private static FeedStream.Natives testInstance;

  public static final JniStaticTestMocker<FeedStream.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.FeedStream.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.feed.FeedStream.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedStream caller, int streamKind, long nativeFeedReliabilityLoggingBridge) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_init(caller, streamKind, nativeFeedReliabilityLoggingBridge);
  }

  @Override
  public void reportFeedViewed(long nativeFeedStream, FeedStream caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportFeedViewed(nativeFeedStream, caller);
  }

  @Override
  public void reportSliceViewed(long nativeFeedStream, FeedStream caller, String sliceId) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportSliceViewed(nativeFeedStream, caller, sliceId);
  }

  @Override
  public void reportPageLoaded(long nativeFeedStream, FeedStream caller, boolean inNewTab) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportPageLoaded(nativeFeedStream, caller, inNewTab);
  }

  @Override
  public void reportOpenAction(long nativeFeedStream, FeedStream caller, GURL url, String sliceId) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportOpenAction(nativeFeedStream, caller, url, sliceId);
  }

  @Override
  public void reportOpenInNewTabAction(long nativeFeedStream, FeedStream caller, GURL url,
      String sliceId) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportOpenInNewTabAction(nativeFeedStream, caller, url, sliceId);
  }

  @Override
  public void reportOtherUserAction(long nativeFeedStream, FeedStream caller, int userAction) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportOtherUserAction(nativeFeedStream, caller, userAction);
  }

  @Override
  public void reportStreamScrolled(long nativeFeedStream, FeedStream caller, int distanceDp) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportStreamScrolled(nativeFeedStream, caller, distanceDp);
  }

  @Override
  public void reportStreamScrollStart(long nativeFeedStream, FeedStream caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportStreamScrollStart(nativeFeedStream, caller);
  }

  @Override
  public void updateUserProfileOnLinkClick(long nativeFeedStream, GURL url, long[] mids) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_updateUserProfileOnLinkClick(nativeFeedStream, url, mids);
  }

  @Override
  public void loadMore(long nativeFeedStream, FeedStream caller, Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_loadMore(nativeFeedStream, caller, callback);
  }

  @Override
  public void manualRefresh(long nativeFeedStream, FeedStream caller, Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_manualRefresh(nativeFeedStream, caller, callback);
  }

  @Override
  public void processThereAndBackAgain(long nativeFeedStream, FeedStream caller, byte[] data,
      byte[] loggingParameters) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_processThereAndBackAgain(nativeFeedStream, caller, data, loggingParameters);
  }

  @Override
  public int executeEphemeralChange(long nativeFeedStream, FeedStream caller, byte[] data) {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_executeEphemeralChange(nativeFeedStream, caller, data);
  }

  @Override
  public void commitEphemeralChange(long nativeFeedStream, FeedStream caller, int changeId) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_commitEphemeralChange(nativeFeedStream, caller, changeId);
  }

  @Override
  public void discardEphemeralChange(long nativeFeedStream, FeedStream caller, int changeId) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_discardEphemeralChange(nativeFeedStream, caller, changeId);
  }

  @Override
  public void surfaceOpened(long nativeFeedStream, FeedStream caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_surfaceOpened(nativeFeedStream, caller);
  }

  @Override
  public void surfaceClosed(long nativeFeedStream, FeedStream caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_surfaceClosed(nativeFeedStream, caller);
  }

  @Override
  public int getSurfaceId(long nativeFeedStream, FeedStream caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_getSurfaceId(nativeFeedStream, caller);
  }

  @Override
  public long getLastFetchTimeMs(long nativeFeedStream, FeedStream caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_getLastFetchTimeMs(nativeFeedStream, caller);
  }

  @Override
  public void reportInfoCardTrackViewStarted(long nativeFeedStream, FeedStream caller, int type) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportInfoCardTrackViewStarted(nativeFeedStream, caller, type);
  }

  @Override
  public void reportInfoCardViewed(long nativeFeedStream, FeedStream caller, int type,
      int minimumViewIntervalSeconds) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportInfoCardViewed(nativeFeedStream, caller, type, minimumViewIntervalSeconds);
  }

  @Override
  public void reportInfoCardClicked(long nativeFeedStream, FeedStream caller, int type) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportInfoCardClicked(nativeFeedStream, caller, type);
  }

  @Override
  public void reportInfoCardDismissedExplicitly(long nativeFeedStream, FeedStream caller,
      int type) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_reportInfoCardDismissedExplicitly(nativeFeedStream, caller, type);
  }

  @Override
  public void resetInfoCardStates(long nativeFeedStream, FeedStream caller, int type) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_resetInfoCardStates(nativeFeedStream, caller, type);
  }

  @Override
  public void invalidateContentCacheFor(long nativeFeedStream, FeedStream caller,
      int feedToInvalidate) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedStream_invalidateContentCacheFor(nativeFeedStream, caller, feedToInvalidate);
  }

  public static FeedStream.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedStream.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedStreamJni();
  }
}
