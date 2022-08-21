package org.chromium.chrome.browser.password_manager;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class PasswordSettingsUpdaterBridgeJni implements PasswordSettingsUpdaterBridge.Natives {
  private static PasswordSettingsUpdaterBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordSettingsUpdaterBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.PasswordSettingsUpdaterBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.PasswordSettingsUpdaterBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onSettingValueFetched(long nativePasswordSettingsUpdaterAndroidBridgeImpl,
      int setting, boolean offerToSavePasswordsEnabled) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordSettingsUpdaterBridge_onSettingValueFetched(nativePasswordSettingsUpdaterAndroidBridgeImpl, setting, offerToSavePasswordsEnabled);
  }

  @Override
  public void onSettingValueAbsent(long nativePasswordSettingsUpdaterAndroidBridgeImpl,
      int setting) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordSettingsUpdaterBridge_onSettingValueAbsent(nativePasswordSettingsUpdaterAndroidBridgeImpl, setting);
  }

  @Override
  public void onSettingFetchingError(long nativePasswordSettingsUpdaterAndroidBridgeImpl,
      int setting, int error, int apiErrorCode) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordSettingsUpdaterBridge_onSettingFetchingError(nativePasswordSettingsUpdaterAndroidBridgeImpl, setting, error, apiErrorCode);
  }

  @Override
  public void onSuccessfulSettingChange(long nativePasswordSettingsUpdaterAndroidBridgeImpl,
      int setting) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordSettingsUpdaterBridge_onSuccessfulSettingChange(nativePasswordSettingsUpdaterAndroidBridgeImpl, setting);
  }

  @Override
  public void onFailedSettingChange(long nativePasswordSettingsUpdaterAndroidBridgeImpl,
      int setting, int error, int apiErrorCode) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordSettingsUpdaterBridge_onFailedSettingChange(nativePasswordSettingsUpdaterAndroidBridgeImpl, setting, error, apiErrorCode);
  }

  public static PasswordSettingsUpdaterBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.PasswordSettingsUpdaterBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordSettingsUpdaterBridgeJni();
  }
}
