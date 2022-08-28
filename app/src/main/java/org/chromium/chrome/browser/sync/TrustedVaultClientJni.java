package org.chromium.chrome.browser.sync;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TrustedVaultClientJni implements TrustedVaultClient.Natives {
  private static TrustedVaultClient.Natives testInstance;

  public static final JniStaticTestMocker<TrustedVaultClient.Natives> TEST_HOOKS = new JniStaticTestMocker<TrustedVaultClient.Natives>() {
    @Override
    public void setInstanceForTesting(
        TrustedVaultClient.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void fetchKeysCompleted(long nativeTrustedVaultClientAndroid, int requestId, String gaiaId,
      byte[][] keys) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_fetchKeysCompleted(nativeTrustedVaultClientAndroid, requestId, gaiaId, keys);
  }

  @Override
  public void markLocalKeysAsStaleCompleted(long nativeTrustedVaultClientAndroid, int requestId,
      boolean succeeded) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_markLocalKeysAsStaleCompleted(nativeTrustedVaultClientAndroid, requestId, succeeded);
  }

  @Override
  public void getIsRecoverabilityDegradedCompleted(long nativeTrustedVaultClientAndroid,
      int requestId, boolean isDegraded) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_getIsRecoverabilityDegradedCompleted(nativeTrustedVaultClientAndroid, requestId, isDegraded);
  }

  @Override
  public void notifyKeysChanged(long nativeTrustedVaultClientAndroid) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_notifyKeysChanged(nativeTrustedVaultClientAndroid);
  }

  @Override
  public void notifyRecoverabilityChanged(long nativeTrustedVaultClientAndroid) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_notifyRecoverabilityChanged(nativeTrustedVaultClientAndroid);
  }

  @Override
  public void recordKeyRetrievalTrigger(int trigger) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_recordKeyRetrievalTrigger(trigger);
  }

  @Override
  public void recordRecoverabilityDegradedFixTrigger(int trigger) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_recordRecoverabilityDegradedFixTrigger(trigger);
  }

  public static TrustedVaultClient.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.sync.TrustedVaultClient.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TrustedVaultClientJni();
  }
}
