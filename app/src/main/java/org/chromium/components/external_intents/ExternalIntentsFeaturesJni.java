package org.chromium.components.external_intents;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class ExternalIntentsFeaturesJni implements ExternalIntentsFeatures.Natives {
  private static ExternalIntentsFeatures.Natives testInstance;

  public static final JniStaticTestMocker<ExternalIntentsFeatures.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.external_intents.ExternalIntentsFeatures.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.external_intents.ExternalIntentsFeatures.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getFeature(int ordinal) {
    return (long)GEN_JNI.org_chromium_components_external_1intents_ExternalIntentsFeatures_getFeature(ordinal);
  }

  public static ExternalIntentsFeatures.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.external_intents.ExternalIntentsFeatures.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ExternalIntentsFeaturesJni();
  }
}
