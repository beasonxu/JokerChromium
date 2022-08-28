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
class OtpVerificationDialogBridgeJni implements OtpVerificationDialogBridge.Natives {
  private static OtpVerificationDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<OtpVerificationDialogBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<OtpVerificationDialogBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        OtpVerificationDialogBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onConfirm(long nativeOtpVerificationDialogViewAndroid, String otp) {
    GEN_JNI.org_chromium_chrome_browser_ui_autofill_OtpVerificationDialogBridge_onConfirm(nativeOtpVerificationDialogViewAndroid, otp);
  }

  @Override
  public void onNewOtpRequested(long nativeOtpVerificationDialogViewAndroid) {
    GEN_JNI.org_chromium_chrome_browser_ui_autofill_OtpVerificationDialogBridge_onNewOtpRequested(nativeOtpVerificationDialogViewAndroid);
  }

  @Override
  public void onDialogDismissed(long nativeOtpVerificationDialogViewAndroid) {
    GEN_JNI.org_chromium_chrome_browser_ui_autofill_OtpVerificationDialogBridge_onDialogDismissed(nativeOtpVerificationDialogViewAndroid);
  }

  public static OtpVerificationDialogBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ui.autofill.OtpVerificationDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OtpVerificationDialogBridgeJni();
  }
}
