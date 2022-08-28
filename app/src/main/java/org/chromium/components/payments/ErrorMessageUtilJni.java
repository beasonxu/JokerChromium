package org.chromium.components.payments;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class ErrorMessageUtilJni implements ErrorMessageUtil.Natives {
  private static ErrorMessageUtil.Natives testInstance;

  public static final JniStaticTestMocker<ErrorMessageUtil.Natives> TEST_HOOKS = new JniStaticTestMocker<ErrorMessageUtil.Natives>() {
    @Override
    public void setInstanceForTesting(
        ErrorMessageUtil.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getNotSupportedErrorMessage(String[] methods) {
    return (String)GEN_JNI.org_chromium_components_payments_ErrorMessageUtil_getNotSupportedErrorMessage(methods);
  }

  public static ErrorMessageUtil.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.ErrorMessageUtil.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ErrorMessageUtilJni();
  }
}
