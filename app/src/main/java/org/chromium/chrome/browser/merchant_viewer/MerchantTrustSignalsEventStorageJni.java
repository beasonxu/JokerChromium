package org.chromium.chrome.browser.merchant_viewer;

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
class MerchantTrustSignalsEventStorageJni implements MerchantTrustSignalsEventStorage.Natives {
  private static MerchantTrustSignalsEventStorage.Natives testInstance;

  public static final JniStaticTestMocker<MerchantTrustSignalsEventStorage.Natives> TEST_HOOKS = new JniStaticTestMocker<MerchantTrustSignalsEventStorage.Natives>() {
    @Override
    public void setInstanceForTesting(
        MerchantTrustSignalsEventStorage.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void init(MerchantTrustSignalsEventStorage caller, BrowserContextHandle handle) {
    GEN_JNI.org_chromium_chrome_browser_merchant_1viewer_MerchantTrustSignalsEventStorage_init(caller, handle);
  }

  @Override
  public void save(long nativeMerchantSignalDB, String key, long timestamp, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_merchant_1viewer_MerchantTrustSignalsEventStorage_save(nativeMerchantSignalDB, key, timestamp, onComplete);
  }

  @Override
  public void load(long nativeMerchantSignalDB, String key,
      Callback<MerchantTrustSignalsEvent> callback) {
    GEN_JNI.org_chromium_chrome_browser_merchant_1viewer_MerchantTrustSignalsEventStorage_load(nativeMerchantSignalDB, key, callback);
  }

  @Override
  public void loadWithPrefix(long nativeMerchantSignalDB, String prefix,
      Callback<List<MerchantTrustSignalsEvent>> callback) {
    GEN_JNI.org_chromium_chrome_browser_merchant_1viewer_MerchantTrustSignalsEventStorage_loadWithPrefix(nativeMerchantSignalDB, prefix, callback);
  }

  @Override
  public void delete(long nativeMerchantSignalDB, String key, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_merchant_1viewer_MerchantTrustSignalsEventStorage_delete(nativeMerchantSignalDB, key, onComplete);
  }

  @Override
  public void deleteAll(long nativeMerchantSignalDB, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_merchant_1viewer_MerchantTrustSignalsEventStorage_deleteAll(nativeMerchantSignalDB, onComplete);
  }

  public static MerchantTrustSignalsEventStorage.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.merchant_viewer.MerchantTrustSignalsEventStorage.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MerchantTrustSignalsEventStorageJni();
  }
}
