package org.chromium.components.dom_distiller.core;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class DomDistillerServiceJni implements DomDistillerService.Natives {
  private static DomDistillerService.Natives testInstance;

  public static final JniStaticTestMocker<DomDistillerService.Natives> TEST_HOOKS = new JniStaticTestMocker<DomDistillerService.Natives>() {
    @Override
    public void setInstanceForTesting(
        DomDistillerService.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getDistilledPagePrefsPtr(long nativeDomDistillerServiceAndroid) {
    return (long)GEN_JNI.org_chromium_components_dom_1distiller_core_DomDistillerService_getDistilledPagePrefsPtr(nativeDomDistillerServiceAndroid);
  }

  public static DomDistillerService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.dom_distiller.core.DomDistillerService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DomDistillerServiceJni();
  }
}
