package org.chromium.chrome.browser.share.qrcode;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class QRCodeGenerationRequestJni implements QRCodeGenerationRequest.Natives {
  private static QRCodeGenerationRequest.Natives testInstance;

  public static final JniStaticTestMocker<QRCodeGenerationRequest.Natives> TEST_HOOKS = new JniStaticTestMocker<QRCodeGenerationRequest.Natives>() {
    @Override
    public void setInstanceForTesting(
        QRCodeGenerationRequest.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(QRCodeGenerationRequest caller, String data) {
    return (long)GEN_JNI.org_chromium_chrome_browser_share_qrcode_QRCodeGenerationRequest_init(caller, data);
  }

  @Override
  public void destroy(long nativeQRCodeGenerationRequest) {
    GEN_JNI.org_chromium_chrome_browser_share_qrcode_QRCodeGenerationRequest_destroy(nativeQRCodeGenerationRequest);
  }

  public static QRCodeGenerationRequest.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.qrcode.QRCodeGenerationRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new QRCodeGenerationRequestJni();
  }
}
