package org.chromium.components.payments;

import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PaymentRequestSpecJni implements PaymentRequestSpec.Natives {
  private static PaymentRequestSpec.Natives testInstance;

  public static final JniStaticTestMocker<PaymentRequestSpec.Natives> TEST_HOOKS = new JniStaticTestMocker<PaymentRequestSpec.Natives>() {
    @Override
    public void setInstanceForTesting(
        PaymentRequestSpec.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long create(ByteBuffer optionsByteBuffer, ByteBuffer detailsByteBuffer,
      ByteBuffer[] methodDataByteBuffers, String appLocale) {
    return (long)GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_create(optionsByteBuffer, detailsByteBuffer, methodDataByteBuffers, appLocale);
  }

  @Override
  public void updateWith(long nativePaymentRequestSpec, ByteBuffer detailsByteBuffer) {
    GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_updateWith(nativePaymentRequestSpec, detailsByteBuffer);
  }

  @Override
  public void retry(long nativePaymentRequestSpec, ByteBuffer validationErrorsByteBuffer) {
    GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_retry(nativePaymentRequestSpec, validationErrorsByteBuffer);
  }

  @Override
  public void recomputeSpecForDetails(long nativePaymentRequestSpec) {
    GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_recomputeSpecForDetails(nativePaymentRequestSpec);
  }

  @Override
  public String selectedShippingOptionError(long nativePaymentRequestSpec) {
    return (String)GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_selectedShippingOptionError(nativePaymentRequestSpec);
  }

  @Override
  public void destroy(long nativePaymentRequestSpec) {
    GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_destroy(nativePaymentRequestSpec);
  }

  @Override
  public byte[] getPaymentDetails(long nativePaymentRequestSpec) {
    return (byte[])GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_getPaymentDetails(nativePaymentRequestSpec);
  }

  @Override
  public byte[][] getMethodData(long nativePaymentRequestSpec) {
    return (byte[][])GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_getMethodData(nativePaymentRequestSpec);
  }

  @Override
  public byte[] getPaymentOptions(long nativePaymentRequestSpec) {
    return (byte[])GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_getPaymentOptions(nativePaymentRequestSpec);
  }

  @Override
  public boolean isSecurePaymentConfirmationRequested(long nativePaymentRequestSpec) {
    return (boolean)GEN_JNI.org_chromium_components_payments_PaymentRequestSpec_isSecurePaymentConfirmationRequested(nativePaymentRequestSpec);
  }

  public static PaymentRequestSpec.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentRequestSpec.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaymentRequestSpecJni();
  }
}
