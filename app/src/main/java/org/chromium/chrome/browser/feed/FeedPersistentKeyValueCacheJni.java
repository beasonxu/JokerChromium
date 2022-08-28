package org.chromium.chrome.browser.feed;

import java.lang.Object;
import java.lang.Override;
import java.lang.Runnable;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class FeedPersistentKeyValueCacheJni implements FeedPersistentKeyValueCache.Natives {
  private static FeedPersistentKeyValueCache.Natives testInstance;

  public static final JniStaticTestMocker<FeedPersistentKeyValueCache.Natives> TEST_HOOKS = new JniStaticTestMocker<FeedPersistentKeyValueCache.Natives>() {
    @Override
    public void setInstanceForTesting(
        FeedPersistentKeyValueCache.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void lookup(byte[] key, Object consumer) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedPersistentKeyValueCache_lookup(key, consumer);
  }

  @Override
  public void put(byte[] key, byte[] value, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedPersistentKeyValueCache_put(key, value, onComplete);
  }

  @Override
  public void evict(byte[] key, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedPersistentKeyValueCache_evict(key, onComplete);
  }

  public static FeedPersistentKeyValueCache.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedPersistentKeyValueCache.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedPersistentKeyValueCacheJni();
  }
}
