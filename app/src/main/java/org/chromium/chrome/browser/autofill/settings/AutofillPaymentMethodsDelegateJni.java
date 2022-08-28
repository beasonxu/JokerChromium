package org.chromium.chrome.browser.autofill.settings;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AutofillPaymentMethodsDelegateJni implements AutofillPaymentMethodsDelegate.Natives {
  private static AutofillPaymentMethodsDelegate.Natives testInstance;

  public static final JniStaticTestMocker<AutofillPaymentMethodsDelegate.Natives> TEST_HOOKS = new JniStaticTestMocker<AutofillPaymentMethodsDelegate.Natives>() {
    @Override
    public void setInstanceForTesting(
        AutofillPaymentMethodsDelegate.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_autofill_settings_AutofillPaymentMethodsDelegate_init(profile);
  }

  @Override
  public void cleanup(long nativeAutofillPaymentMethodsDelegate) {
    GEN_JNI.org_chromium_chrome_browser_autofill_settings_AutofillPaymentMethodsDelegate_cleanup(nativeAutofillPaymentMethodsDelegate);
  }

  @Override
  public void initVirtualCardEnrollment(long nativeAutofillPaymentMethodsDelegate,
      long instrumentId,
      Callback<VirtualCardEnrollmentFields> virtualCardEnrollmentFieldsCallback) {
    GEN_JNI.org_chromium_chrome_browser_autofill_settings_AutofillPaymentMethodsDelegate_initVirtualCardEnrollment(nativeAutofillPaymentMethodsDelegate, instrumentId, virtualCardEnrollmentFieldsCallback);
  }

  @Override
  public void enrollOfferedVirtualCard(long nativeAutofillPaymentMethodsDelegate) {
    GEN_JNI.org_chromium_chrome_browser_autofill_settings_AutofillPaymentMethodsDelegate_enrollOfferedVirtualCard(nativeAutofillPaymentMethodsDelegate);
  }

  @Override
  public void unenrollVirtualCard(long nativeAutofillPaymentMethodsDelegate, long instrumentId) {
    GEN_JNI.org_chromium_chrome_browser_autofill_settings_AutofillPaymentMethodsDelegate_unenrollVirtualCard(nativeAutofillPaymentMethodsDelegate, instrumentId);
  }

  public static AutofillPaymentMethodsDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.settings.AutofillPaymentMethodsDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillPaymentMethodsDelegateJni();
  }
}