package org.chromium.chrome.browser.infobar;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AutofillSaveCardInfoBarJni implements AutofillSaveCardInfoBar.Natives {
  private static AutofillSaveCardInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<AutofillSaveCardInfoBar.Natives> TEST_HOOKS = new JniStaticTestMocker<AutofillSaveCardInfoBar.Natives>() {
    @Override
    public void setInstanceForTesting(
        AutofillSaveCardInfoBar.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onLegalMessageLinkClicked(long nativeAutofillSaveCardInfoBar,
      AutofillSaveCardInfoBar caller, String url) {
    GEN_JNI.org_chromium_chrome_browser_infobar_AutofillSaveCardInfoBar_onLegalMessageLinkClicked(nativeAutofillSaveCardInfoBar, caller, url);
  }

  public static AutofillSaveCardInfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.AutofillSaveCardInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillSaveCardInfoBarJni();
  }
}