package org.chromium.chrome.browser.autofill;

import java.lang.Override;
import java.lang.String;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class AutofillMessageConfirmFlowBridgeJni implements AutofillMessageConfirmFlowBridge.Natives {
  private static AutofillMessageConfirmFlowBridge.Natives testInstance;

  public static final JniStaticTestMocker<AutofillMessageConfirmFlowBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.AutofillMessageConfirmFlowBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.AutofillMessageConfirmFlowBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDateConfirmed(long nativeSaveCardMessageConfirmDelegate, String month,
      String year) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillMessageConfirmFlowBridge_onDateConfirmed(nativeSaveCardMessageConfirmDelegate, month, year);
  }

  @Override
  public void onNameConfirmed(long nativeSaveCardMessageConfirmDelegate, String name) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillMessageConfirmFlowBridge_onNameConfirmed(nativeSaveCardMessageConfirmDelegate, name);
  }

  @Override
  public void onSaveCardConfirmed(long nativeSaveCardMessageConfirmDelegate) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillMessageConfirmFlowBridge_onSaveCardConfirmed(nativeSaveCardMessageConfirmDelegate);
  }

  @Override
  public void onUserDismiss(long nativeSaveCardMessageConfirmDelegate) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillMessageConfirmFlowBridge_onUserDismiss(nativeSaveCardMessageConfirmDelegate);
  }

  @Override
  public void onLinkClicked(long nativeSaveCardMessageConfirmDelegate, String url) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillMessageConfirmFlowBridge_onLinkClicked(nativeSaveCardMessageConfirmDelegate, url);
  }

  @Override
  public void dialogDismissed(long nativeSaveCardMessageConfirmDelegate) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillMessageConfirmFlowBridge_dialogDismissed(nativeSaveCardMessageConfirmDelegate);
  }

  public static AutofillMessageConfirmFlowBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.AutofillMessageConfirmFlowBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillMessageConfirmFlowBridgeJni();
  }
}
