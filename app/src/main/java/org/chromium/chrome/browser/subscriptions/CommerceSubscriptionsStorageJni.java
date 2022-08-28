package org.chromium.chrome.browser.subscriptions;

import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.BrowserContextHandle;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class CommerceSubscriptionsStorageJni implements CommerceSubscriptionsStorage.Natives {
  private static CommerceSubscriptionsStorage.Natives testInstance;

  public static final JniStaticTestMocker<CommerceSubscriptionsStorage.Natives> TEST_HOOKS = new JniStaticTestMocker<CommerceSubscriptionsStorage.Natives>() {
    @Override
    public void setInstanceForTesting(
        CommerceSubscriptionsStorage.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void init(CommerceSubscriptionsStorage caller, BrowserContextHandle handle) {
    GEN_JNI.org_chromium_chrome_browser_subscriptions_CommerceSubscriptionsStorage_init(caller, handle);
  }

  @Override
  public void destroy(long nativeCommerceSubscriptionDB) {
    GEN_JNI.org_chromium_chrome_browser_subscriptions_CommerceSubscriptionsStorage_destroy(nativeCommerceSubscriptionDB);
  }

  @Override
  public void save(long nativeCommerceSubscriptionDB, String key, String type, String trackingId,
      String managementType, String trackingIdType, long timestamp, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_subscriptions_CommerceSubscriptionsStorage_save(nativeCommerceSubscriptionDB, key, type, trackingId, managementType, trackingIdType, timestamp, onComplete);
  }

  @Override
  public void load(long nativeCommerceSubscriptionDB, String key,
      Callback<CommerceSubscription> callback) {
    GEN_JNI.org_chromium_chrome_browser_subscriptions_CommerceSubscriptionsStorage_load(nativeCommerceSubscriptionDB, key, callback);
  }

  @Override
  public void loadWithPrefix(long nativeCommerceSubscriptionDB, String key,
      Callback<List<CommerceSubscription>> callback) {
    GEN_JNI.org_chromium_chrome_browser_subscriptions_CommerceSubscriptionsStorage_loadWithPrefix(nativeCommerceSubscriptionDB, key, callback);
  }

  @Override
  public void delete(long nativeCommerceSubscriptionDB, String key, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_subscriptions_CommerceSubscriptionsStorage_delete(nativeCommerceSubscriptionDB, key, onComplete);
  }

  @Override
  public void deleteAll(long nativeCommerceSubscriptionDB, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_subscriptions_CommerceSubscriptionsStorage_deleteAll(nativeCommerceSubscriptionDB, onComplete);
  }

  public static CommerceSubscriptionsStorage.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.subscriptions.CommerceSubscriptionsStorage.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CommerceSubscriptionsStorageJni();
  }
}
