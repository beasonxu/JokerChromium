package org.chromium.chrome.browser.bluetooth;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class BluetoothBridgeJni implements BluetoothBridge.Natives {
  private static BluetoothBridge.Natives testInstance;

  public static final JniStaticTestMocker<BluetoothBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<BluetoothBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        BluetoothBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isWebContentsConnectedToBluetoothDevice(WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_bluetooth_BluetoothBridge_isWebContentsConnectedToBluetoothDevice(webContents);
  }

  @Override
  public boolean isWebContentsScanningForBluetoothDevices(WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_bluetooth_BluetoothBridge_isWebContentsScanningForBluetoothDevices(webContents);
  }

  public static BluetoothBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.bluetooth.BluetoothBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BluetoothBridgeJni();
  }
}
