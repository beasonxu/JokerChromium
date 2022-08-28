package org.chromium.components.permissions.nfc;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NfcSystemLevelSettingJni implements NfcSystemLevelSetting.Natives {
  private static NfcSystemLevelSetting.Natives testInstance;

  public static final JniStaticTestMocker<NfcSystemLevelSetting.Natives> TEST_HOOKS = new JniStaticTestMocker<NfcSystemLevelSetting.Natives>() {
    @Override
    public void setInstanceForTesting(
        NfcSystemLevelSetting.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onNfcSystemLevelPromptCompleted(long callback) {
    GEN_JNI.org_chromium_components_permissions_nfc_NfcSystemLevelSetting_onNfcSystemLevelPromptCompleted(callback);
  }

  public static NfcSystemLevelSetting.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.permissions.nfc.NfcSystemLevelSetting.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NfcSystemLevelSettingJni();
  }
}