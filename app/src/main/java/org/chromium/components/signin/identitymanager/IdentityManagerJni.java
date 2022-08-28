package org.chromium.components.signin.identitymanager;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.base.CoreAccountId;
import org.chromium.components.signin.base.CoreAccountInfo;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class IdentityManagerJni implements IdentityManager.Natives {
  private static IdentityManager.Natives testInstance;

  public static final JniStaticTestMocker<IdentityManager.Natives> TEST_HOOKS = new JniStaticTestMocker<IdentityManager.Natives>() {
    @Override
    public void setInstanceForTesting(
        IdentityManager.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public CoreAccountInfo getPrimaryAccountInfo(long nativeIdentityManager, int consentLevel) {
    return (CoreAccountInfo)GEN_JNI.org_chromium_components_signin_identitymanager_IdentityManager_getPrimaryAccountInfo(nativeIdentityManager, consentLevel);
  }

  @Override
  public AccountInfo findExtendedAccountInfoByEmailAddress(long nativeIdentityManager,
      String email) {
    return (AccountInfo)GEN_JNI.org_chromium_components_signin_identitymanager_IdentityManager_findExtendedAccountInfoByEmailAddress(nativeIdentityManager, email);
  }

  @Override
  public CoreAccountInfo[] getAccountsWithRefreshTokens(long nativeIdentityManager) {
    return (CoreAccountInfo[])GEN_JNI.org_chromium_components_signin_identitymanager_IdentityManager_getAccountsWithRefreshTokens(nativeIdentityManager);
  }

  @Override
  public void refreshAccountInfoIfStale(long nativeIdentityManager, CoreAccountId coreAccountId) {
    GEN_JNI.org_chromium_components_signin_identitymanager_IdentityManager_refreshAccountInfoIfStale(nativeIdentityManager, coreAccountId);
  }

  public static IdentityManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.identitymanager.IdentityManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new IdentityManagerJni();
  }
}
