package org.chromium.components.translate;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TranslateFeatureListJni implements TranslateFeatureList.Natives {
  private static TranslateFeatureList.Natives testInstance;

  public static final JniStaticTestMocker<TranslateFeatureList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.translate.TranslateFeatureList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.translate.TranslateFeatureList.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled(String featureName) {
    return (boolean)GEN_JNI.org_chromium_components_translate_TranslateFeatureList_isEnabled(featureName);
  }

  @Override
  public boolean getFieldTrialParamByFeatureAsBoolean(String featureName, String paramName,
      boolean defaultValue) {
    return (boolean)GEN_JNI.org_chromium_components_translate_TranslateFeatureList_getFieldTrialParamByFeatureAsBoolean(featureName, paramName, defaultValue);
  }

  public static TranslateFeatureList.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.translate.TranslateFeatureList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TranslateFeatureListJni();
  }
}
