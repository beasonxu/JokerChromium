package org.chromium.components.signin.identitymanager;

import java.lang.Override;
import java.lang.String;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class AccountTrackerServiceJni implements AccountTrackerService.Natives {
  private static AccountTrackerService.Natives testInstance;

  public static final JniStaticTestMocker<AccountTrackerService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.identitymanager.AccountTrackerService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.identitymanager.AccountTrackerService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void seedAccountsInfo(long nativeAccountTrackerService, String[] gaiaIds,
      String[] emails) {
    GEN_JNI.org_chromium_components_signin_identitymanager_AccountTrackerService_seedAccountsInfo(nativeAccountTrackerService, gaiaIds, emails);
  }

  public static AccountTrackerService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.identitymanager.AccountTrackerService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AccountTrackerServiceJni();
  }
}
