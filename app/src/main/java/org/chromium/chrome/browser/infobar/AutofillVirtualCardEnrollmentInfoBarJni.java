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
class AutofillVirtualCardEnrollmentInfoBarJni implements AutofillVirtualCardEnrollmentInfoBar.Natives {
  private static AutofillVirtualCardEnrollmentInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<AutofillVirtualCardEnrollmentInfoBar.Natives> TEST_HOOKS = new JniStaticTestMocker<AutofillVirtualCardEnrollmentInfoBar.Natives>() {
    @Override
    public void setInstanceForTesting(
        AutofillVirtualCardEnrollmentInfoBar.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onInfobarLinkClicked(long nativeAutofillVirtualCardEnrollmentInfoBar,
      AutofillVirtualCardEnrollmentInfoBar caller, String url, int virtualCardEnrollmentLinkType) {
    GEN_JNI.org_chromium_chrome_browser_infobar_AutofillVirtualCardEnrollmentInfoBar_onInfobarLinkClicked(nativeAutofillVirtualCardEnrollmentInfoBar, caller, url, virtualCardEnrollmentLinkType);
  }

  public static AutofillVirtualCardEnrollmentInfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.AutofillVirtualCardEnrollmentInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillVirtualCardEnrollmentInfoBarJni();
  }
}
