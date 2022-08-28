package org.chromium.chrome.browser.autofill;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class AutofillSnackbarControllerJni implements AutofillSnackbarController.Natives {
  private static AutofillSnackbarController.Natives testInstance;

  public static final JniStaticTestMocker<AutofillSnackbarController.Natives> TEST_HOOKS = new JniStaticTestMocker<AutofillSnackbarController.Natives>() {
    @Override
    public void setInstanceForTesting(
        AutofillSnackbarController.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onActionClicked(long nativeAutofillSnackbarViewAndroid) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillSnackbarController_onActionClicked(nativeAutofillSnackbarViewAndroid);
  }

  @Override
  public void onDismissed(long nativeAutofillSnackbarViewAndroid) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillSnackbarController_onDismissed(nativeAutofillSnackbarViewAndroid);
  }

  public static AutofillSnackbarController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.AutofillSnackbarController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillSnackbarControllerJni();
  }
}
