package org.chromium.chrome.browser.usb;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class UsbBridgeJni implements UsbBridge.Natives {
  private static UsbBridge.Natives testInstance;

  public static final JniStaticTestMocker<UsbBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.usb.UsbBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.usb.UsbBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isWebContentsConnectedToUsbDevice(WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_usb_UsbBridge_isWebContentsConnectedToUsbDevice(webContents);
  }

  public static UsbBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.usb.UsbBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UsbBridgeJni();
  }
}
