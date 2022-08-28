package org.chromium.components.language;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class GeoLanguageProviderBridgeJni implements GeoLanguageProviderBridge.Natives {
  private static GeoLanguageProviderBridge.Natives testInstance;

  public static final JniStaticTestMocker<GeoLanguageProviderBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<GeoLanguageProviderBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        GeoLanguageProviderBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String[] getCurrentGeoLanguages() {
    return (String[])GEN_JNI.org_chromium_components_language_GeoLanguageProviderBridge_getCurrentGeoLanguages();
  }

  public static GeoLanguageProviderBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.language.GeoLanguageProviderBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GeoLanguageProviderBridgeJni();
  }
}
