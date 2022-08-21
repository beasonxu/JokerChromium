package org.chromium.chrome.browser.autofill;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class SaveUpdateAddressProfilePromptControllerJni implements SaveUpdateAddressProfilePromptController.Natives {
  private static SaveUpdateAddressProfilePromptController.Natives testInstance;

  public static final JniStaticTestMocker<SaveUpdateAddressProfilePromptController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.SaveUpdateAddressProfilePromptController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.SaveUpdateAddressProfilePromptController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onPromptDismissed(long nativeSaveUpdateAddressProfilePromptController,
      SaveUpdateAddressProfilePromptController caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_SaveUpdateAddressProfilePromptController_onPromptDismissed(nativeSaveUpdateAddressProfilePromptController, caller);
  }

  @Override
  public void onUserAccepted(long nativeSaveUpdateAddressProfilePromptController,
      SaveUpdateAddressProfilePromptController caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_SaveUpdateAddressProfilePromptController_onUserAccepted(nativeSaveUpdateAddressProfilePromptController, caller);
  }

  @Override
  public void onUserDeclined(long nativeSaveUpdateAddressProfilePromptController,
      SaveUpdateAddressProfilePromptController caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_SaveUpdateAddressProfilePromptController_onUserDeclined(nativeSaveUpdateAddressProfilePromptController, caller);
  }

  @Override
  public void onUserEdited(long nativeSaveUpdateAddressProfilePromptController,
      SaveUpdateAddressProfilePromptController caller,
      PersonalDataManager.AutofillProfile profile) {
    GEN_JNI.org_chromium_chrome_browser_autofill_SaveUpdateAddressProfilePromptController_onUserEdited(nativeSaveUpdateAddressProfilePromptController, caller, profile);
  }

  public static SaveUpdateAddressProfilePromptController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.SaveUpdateAddressProfilePromptController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SaveUpdateAddressProfilePromptControllerJni();
  }
}
