package org.chromium.components.permissions;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class PermissionsAndroidFeatureListJni implements PermissionsAndroidFeatureList.Natives {
  private static PermissionsAndroidFeatureList.Natives testInstance;

  public static final JniStaticTestMocker<PermissionsAndroidFeatureList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.permissions.PermissionsAndroidFeatureList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.permissions.PermissionsAndroidFeatureList.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isInitialized() {
    return (boolean)GEN_JNI.org_chromium_components_permissions_PermissionsAndroidFeatureList_isInitialized();
  }

  @Override
  public boolean isEnabled(String featureName) {
    return (boolean)GEN_JNI.org_chromium_components_permissions_PermissionsAndroidFeatureList_isEnabled(featureName);
  }

  public static PermissionsAndroidFeatureList.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.permissions.PermissionsAndroidFeatureList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new PermissionsAndroidFeatureListJni();
  }
}
