package org.chromium.components.security_interstitials;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class CaptivePortalHelperJni implements CaptivePortalHelper.Natives {
  private static CaptivePortalHelper.Natives testInstance;

  public static final JniStaticTestMocker<CaptivePortalHelper.Natives> TEST_HOOKS = new JniStaticTestMocker<CaptivePortalHelper.Natives>() {
    @Override
    public void setInstanceForTesting(
        CaptivePortalHelper.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setCaptivePortalCertificateForTesting(String spkiHash) {
    GEN_JNI.org_chromium_components_security_1interstitials_CaptivePortalHelper_setCaptivePortalCertificateForTesting(spkiHash);
  }

  @Override
  public void setOSReportsCaptivePortalForTesting(boolean osReportsCaptivePortal) {
    GEN_JNI.org_chromium_components_security_1interstitials_CaptivePortalHelper_setOSReportsCaptivePortalForTesting(osReportsCaptivePortal);
  }

  public static CaptivePortalHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.security_interstitials.CaptivePortalHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CaptivePortalHelperJni();
  }
}
