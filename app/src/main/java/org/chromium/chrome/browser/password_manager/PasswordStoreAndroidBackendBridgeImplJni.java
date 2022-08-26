package org.chromium.chrome.browser.password_manager;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PasswordStoreAndroidBackendBridgeImplJni implements PasswordStoreAndroidBackendBridgeImpl.Natives {
  private static PasswordStoreAndroidBackendBridgeImpl.Natives testInstance;

  public static final JniStaticTestMocker<PasswordStoreAndroidBackendBridgeImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.PasswordStoreAndroidBackendBridgeImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.PasswordStoreAndroidBackendBridgeImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onCompleteWithLogins(long nativePasswordStoreAndroidBackendBridgeImpl, int jobId,
      byte[] passwords) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreAndroidBackendBridgeImpl_onCompleteWithLogins(nativePasswordStoreAndroidBackendBridgeImpl, jobId, passwords);
  }

  @Override
  public void onLoginChanged(long nativePasswordStoreAndroidBackendBridgeImpl, int jobId) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreAndroidBackendBridgeImpl_onLoginChanged(nativePasswordStoreAndroidBackendBridgeImpl, jobId);
  }

  @Override
  public void onError(long nativePasswordStoreAndroidBackendBridgeImpl, int jobId, int errorType,
      int apiErrorCode) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreAndroidBackendBridgeImpl_onError(nativePasswordStoreAndroidBackendBridgeImpl, jobId, errorType, apiErrorCode);
  }

  public static PasswordStoreAndroidBackendBridgeImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.PasswordStoreAndroidBackendBridgeImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordStoreAndroidBackendBridgeImplJni();
  }
}
