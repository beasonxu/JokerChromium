package org.chromium.components.payments;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.RenderFrameHost;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PaymentAppServiceBridgeJni implements PaymentAppServiceBridge.Natives {
  private static PaymentAppServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<PaymentAppServiceBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<PaymentAppServiceBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        PaymentAppServiceBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void create(RenderFrameHost initiatorRenderFrameHost, String topOrigin,
      PaymentRequestSpec spec, String twaPackageName, boolean mayCrawlForInstallablePaymentApps,
      boolean isOffTheRecord, PaymentAppServiceBridge.PaymentAppServiceCallback callback) {
    GEN_JNI.org_chromium_components_payments_PaymentAppServiceBridge_create(initiatorRenderFrameHost, topOrigin, spec, twaPackageName, mayCrawlForInstallablePaymentApps, isOffTheRecord, callback);
  }

  public static PaymentAppServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentAppServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaymentAppServiceBridgeJni();
  }
}
