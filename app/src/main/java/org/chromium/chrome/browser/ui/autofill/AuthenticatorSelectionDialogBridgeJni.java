package org.chromium.chrome.browser.ui.autofill;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AuthenticatorSelectionDialogBridgeJni implements AuthenticatorSelectionDialogBridge.Natives {
  private static AuthenticatorSelectionDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<AuthenticatorSelectionDialogBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ui.autofill.AuthenticatorSelectionDialogBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ui.autofill.AuthenticatorSelectionDialogBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onOptionSelected(long nativeAuthenticatorSelectionDialogViewAndroid,
      String authenticatorOptionIdentifier) {
    GEN_JNI.org_chromium_chrome_browser_ui_autofill_AuthenticatorSelectionDialogBridge_onOptionSelected(nativeAuthenticatorSelectionDialogViewAndroid, authenticatorOptionIdentifier);
  }

  @Override
  public void onDismissed(long nativeAuthenticatorSelectionDialogViewAndroid) {
    GEN_JNI.org_chromium_chrome_browser_ui_autofill_AuthenticatorSelectionDialogBridge_onDismissed(nativeAuthenticatorSelectionDialogViewAndroid);
  }

  public static AuthenticatorSelectionDialogBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ui.autofill.AuthenticatorSelectionDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AuthenticatorSelectionDialogBridgeJni();
  }
}
