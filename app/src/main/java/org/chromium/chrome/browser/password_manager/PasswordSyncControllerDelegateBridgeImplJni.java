package org.chromium.chrome.browser.password_manager;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PasswordSyncControllerDelegateBridgeImplJni implements PasswordSyncControllerDelegateBridgeImpl.Natives {
  private static PasswordSyncControllerDelegateBridgeImpl.Natives testInstance;

  public static final JniStaticTestMocker<PasswordSyncControllerDelegateBridgeImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<PasswordSyncControllerDelegateBridgeImpl.Natives>() {
    @Override
    public void setInstanceForTesting(
        PasswordSyncControllerDelegateBridgeImpl.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onCredentialManagerNotified(long nativePasswordSyncControllerDelegateBridgeImpl) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordSyncControllerDelegateBridgeImpl_onCredentialManagerNotified(nativePasswordSyncControllerDelegateBridgeImpl);
  }

  @Override
  public void onCredentialManagerError(long nativePasswordSyncControllerDelegateBridgeImpl,
      int errorType, int apiErrorCode) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordSyncControllerDelegateBridgeImpl_onCredentialManagerError(nativePasswordSyncControllerDelegateBridgeImpl, errorType, apiErrorCode);
  }

  public static PasswordSyncControllerDelegateBridgeImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.PasswordSyncControllerDelegateBridgeImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordSyncControllerDelegateBridgeImplJni();
  }
}
