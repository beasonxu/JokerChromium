package org.chromium.components.signin;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.signin.base.AccountCapabilities;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AccountCapabilitiesFetcherJni implements AccountCapabilitiesFetcher.Natives {
  private static AccountCapabilitiesFetcher.Natives testInstance;

  public static final JniStaticTestMocker<AccountCapabilitiesFetcher.Natives> TEST_HOOKS = new JniStaticTestMocker<AccountCapabilitiesFetcher.Natives>() {
    @Override
    public void setInstanceForTesting(
        AccountCapabilitiesFetcher.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onCapabilitiesFetchComplete(AccountCapabilities accountCapabilities,
      long nativeCallback) {
    GEN_JNI.org_chromium_components_signin_AccountCapabilitiesFetcher_onCapabilitiesFetchComplete(accountCapabilities, nativeCallback);
  }

  public static AccountCapabilitiesFetcher.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.AccountCapabilitiesFetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AccountCapabilitiesFetcherJni();
  }
}
