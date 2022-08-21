package org.chromium.components.permissions;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
public class BluetoothScanningPermissionDialogJni implements BluetoothScanningPermissionDialog.Natives {
  private static BluetoothScanningPermissionDialog.Natives testInstance;

  public static final JniStaticTestMocker<BluetoothScanningPermissionDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.permissions.BluetoothScanningPermissionDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.permissions.BluetoothScanningPermissionDialog.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDialogFinished(long nativeBluetoothScanningPromptAndroid, int eventType) {
    GEN_JNI.org_chromium_components_permissions_BluetoothScanningPermissionDialog_onDialogFinished(nativeBluetoothScanningPromptAndroid, eventType);
  }

  public static BluetoothScanningPermissionDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.permissions.BluetoothScanningPermissionDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BluetoothScanningPermissionDialogJni();
  }
}
