package org.chromium.chrome.browser.webapps;

import android.graphics.Bitmap;
import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class WebApkInstallCoordinatorBridgeJni implements WebApkInstallCoordinatorBridge.Natives {
  private static WebApkInstallCoordinatorBridge.Natives testInstance;

  public static final JniStaticTestMocker<WebApkInstallCoordinatorBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.WebApkInstallCoordinatorBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.WebApkInstallCoordinatorBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WebApkInstallCoordinatorBridge caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_webapps_WebApkInstallCoordinatorBridge_init(caller);
  }

  @Override
  public void install(long nativeWebApkInstallCoordinatorBridge,
      WebApkInstallCoordinatorBridge caller, byte[] apkProto, Bitmap primaryIcon,
      boolean isPrimaryIconMaskable) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkInstallCoordinatorBridge_install(nativeWebApkInstallCoordinatorBridge, caller, apkProto, primaryIcon, isPrimaryIconMaskable);
  }

  @Override
  public void destroy(long nativeWebApkInstallCoordinatorBridge) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkInstallCoordinatorBridge_destroy(nativeWebApkInstallCoordinatorBridge);
  }

  public static WebApkInstallCoordinatorBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.WebApkInstallCoordinatorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebApkInstallCoordinatorBridgeJni();
  }
}
