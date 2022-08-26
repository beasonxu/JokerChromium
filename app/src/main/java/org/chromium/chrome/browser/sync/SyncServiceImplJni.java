package org.chromium.chrome.browser.sync;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.json.JSONArray;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SyncServiceImplJni implements SyncServiceImpl.Natives {
  private static SyncServiceImpl.Natives testInstance;

  public static final JniStaticTestMocker<SyncServiceImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.sync.SyncServiceImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.sync.SyncServiceImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(SyncServiceImpl caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_init(caller);
  }

  @Override
  public boolean isSyncRequested(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isSyncRequested(nativeSyncServiceAndroidBridge);
  }

  @Override
  public void setSyncRequested(long nativeSyncServiceAndroidBridge, boolean requested) {
    GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_setSyncRequested(nativeSyncServiceAndroidBridge, requested);
  }

  @Override
  public boolean canSyncFeatureStart(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_canSyncFeatureStart(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isSyncFeatureEnabled(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isSyncFeatureEnabled(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isSyncFeatureActive(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isSyncFeatureActive(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isSyncDisabledByEnterprisePolicy(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isSyncDisabledByEnterprisePolicy(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isEngineInitialized(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isEngineInitialized(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isTransportStateActive(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isTransportStateActive(nativeSyncServiceAndroidBridge);
  }

  @Override
  public void setSetupInProgress(long nativeSyncServiceAndroidBridge, boolean inProgress) {
    GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_setSetupInProgress(nativeSyncServiceAndroidBridge, inProgress);
  }

  @Override
  public boolean isFirstSetupComplete(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isFirstSetupComplete(nativeSyncServiceAndroidBridge);
  }

  @Override
  public void setFirstSetupComplete(long nativeSyncServiceAndroidBridge,
      int syncFirstSetupCompleteSource) {
    GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_setFirstSetupComplete(nativeSyncServiceAndroidBridge, syncFirstSetupCompleteSource);
  }

  @Override
  public int[] getActiveDataTypes(long nativeSyncServiceAndroidBridge) {
    return (int[])GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_getActiveDataTypes(nativeSyncServiceAndroidBridge);
  }

  @Override
  public int[] getChosenDataTypes(long nativeSyncServiceAndroidBridge) {
    return (int[])GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_getChosenDataTypes(nativeSyncServiceAndroidBridge);
  }

  @Override
  public void setChosenDataTypes(long nativeSyncServiceAndroidBridge, boolean syncEverything,
      int[] modelTypeArray) {
    GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_setChosenDataTypes(nativeSyncServiceAndroidBridge, syncEverything, modelTypeArray);
  }

  @Override
  public boolean isCustomPassphraseAllowed(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isCustomPassphraseAllowed(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isEncryptEverythingEnabled(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isEncryptEverythingEnabled(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isPassphraseRequiredForPreferredDataTypes(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isPassphraseRequiredForPreferredDataTypes(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isTrustedVaultKeyRequired(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isTrustedVaultKeyRequired(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isTrustedVaultKeyRequiredForPreferredDataTypes(
      long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isTrustedVaultKeyRequiredForPreferredDataTypes(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isTrustedVaultRecoverabilityDegraded(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isTrustedVaultRecoverabilityDegraded(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isUsingExplicitPassphrase(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isUsingExplicitPassphrase(nativeSyncServiceAndroidBridge);
  }

  @Override
  public int getPassphraseType(long nativeSyncServiceAndroidBridge) {
    return (int)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_getPassphraseType(nativeSyncServiceAndroidBridge);
  }

  @Override
  public void setEncryptionPassphrase(long nativeSyncServiceAndroidBridge, String passphrase) {
    GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_setEncryptionPassphrase(nativeSyncServiceAndroidBridge, passphrase);
  }

  @Override
  public boolean setDecryptionPassphrase(long nativeSyncServiceAndroidBridge, String passphrase) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_setDecryptionPassphrase(nativeSyncServiceAndroidBridge, passphrase);
  }

  @Override
  public long getExplicitPassphraseTime(long nativeSyncServiceAndroidBridge) {
    return (long)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_getExplicitPassphraseTime(nativeSyncServiceAndroidBridge);
  }

  @Override
  public void getAllNodes(long nativeSyncServiceAndroidBridge, Callback<JSONArray> callback) {
    GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_getAllNodes(nativeSyncServiceAndroidBridge, callback);
  }

  @Override
  public int getAuthError(long nativeSyncServiceAndroidBridge) {
    return (int)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_getAuthError(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean hasUnrecoverableError(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_hasUnrecoverableError(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean requiresClientUpgrade(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_requiresClientUpgrade(nativeSyncServiceAndroidBridge);
  }

  @Override
  public CoreAccountInfo getAccountInfo(long nativeSyncServiceAndroidBridge) {
    return (CoreAccountInfo)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_getAccountInfo(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean hasSyncConsent(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_hasSyncConsent(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean isPassphrasePromptMutedForCurrentProductVersion(
      long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_isPassphrasePromptMutedForCurrentProductVersion(nativeSyncServiceAndroidBridge);
  }

  @Override
  public void markPassphrasePromptMutedForCurrentProductVersion(
      long nativeSyncServiceAndroidBridge) {
    GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_markPassphrasePromptMutedForCurrentProductVersion(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean hasKeepEverythingSynced(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_hasKeepEverythingSynced(nativeSyncServiceAndroidBridge);
  }

  @Override
  public boolean shouldOfferTrustedVaultOptIn(long nativeSyncServiceAndroidBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_shouldOfferTrustedVaultOptIn(nativeSyncServiceAndroidBridge);
  }

  @Override
  public void triggerRefresh(long nativeSyncServiceAndroidBridge) {
    GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_triggerRefresh(nativeSyncServiceAndroidBridge);
  }

  @Override
  public long getLastSyncedTimeForDebugging(long nativeSyncServiceAndroidBridge) {
    return (long)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_getLastSyncedTimeForDebugging(nativeSyncServiceAndroidBridge);
  }

  @Override
  public long getNativeSyncServiceImplForTest(long nativeSyncServiceAndroidBridge) {
    return (long)GEN_JNI.org_chromium_chrome_browser_sync_SyncServiceImpl_getNativeSyncServiceImplForTest(nativeSyncServiceAndroidBridge);
  }

  public static SyncServiceImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.sync.SyncServiceImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SyncServiceImplJni();
  }
}
