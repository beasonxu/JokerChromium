package org.chromium.components.payments;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PaymentHandlerNavigationThrottleJni implements PaymentHandlerNavigationThrottle.Natives {
  private static PaymentHandlerNavigationThrottle.Natives testInstance;

  public static final JniStaticTestMocker<PaymentHandlerNavigationThrottle.Natives> TEST_HOOKS = new JniStaticTestMocker<PaymentHandlerNavigationThrottle.Natives>() {
    @Override
    public void setInstanceForTesting(
        PaymentHandlerNavigationThrottle.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void markPaymentHandlerWebContents(WebContents webContents) {
    GEN_JNI.org_chromium_components_payments_PaymentHandlerNavigationThrottle_markPaymentHandlerWebContents(webContents);
  }

  public static PaymentHandlerNavigationThrottle.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentHandlerNavigationThrottle.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaymentHandlerNavigationThrottleJni();
  }
}
