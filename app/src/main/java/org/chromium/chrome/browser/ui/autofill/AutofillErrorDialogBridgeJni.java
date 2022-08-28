package org.chromium.chrome.browser.ui.autofill;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AutofillErrorDialogBridgeJni implements AutofillErrorDialogBridge.Natives {
  private static AutofillErrorDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<AutofillErrorDialogBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<AutofillErrorDialogBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        AutofillErrorDialogBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDismissed(long nativeAutofillErrorDialogViewAndroid) {
    GEN_JNI.org_chromium_chrome_browser_ui_autofill_AutofillErrorDialogBridge_onDismissed(nativeAutofillErrorDialogViewAndroid);
  }

  public static AutofillErrorDialogBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ui.autofill.AutofillErrorDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillErrorDialogBridgeJni();
  }
}
