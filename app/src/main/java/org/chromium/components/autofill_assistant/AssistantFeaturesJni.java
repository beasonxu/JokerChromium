package org.chromium.components.autofill_assistant;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class AssistantFeaturesJni implements AssistantFeatures.Natives {
  private static AssistantFeatures.Natives testInstance;

  public static final JniStaticTestMocker<AssistantFeatures.Natives> TEST_HOOKS = new JniStaticTestMocker<AssistantFeatures.Natives>() {
    @Override
    public void setInstanceForTesting(
        AssistantFeatures.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getFeature(int ordinal) {
    return (long)GEN_JNI.org_chromium_components_autofill_1assistant_AssistantFeatures_getFeature(ordinal);
  }

  public static AssistantFeatures.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.autofill_assistant.AssistantFeatures.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new AssistantFeaturesJni();
  }
}
