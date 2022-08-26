package org.chromium.base;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class BaseFeatureListJni implements BaseFeatureList.Natives {
  private static BaseFeatureList.Natives testInstance;

  public static final JniStaticTestMocker<BaseFeatureList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.BaseFeatureList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.BaseFeatureList.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled(String featureName) {
    return (boolean)GEN_JNI.org_chromium_base_BaseFeatureList_isEnabled(featureName);
  }

  public static BaseFeatureList.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.BaseFeatureList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new BaseFeatureListJni();
  }
}
