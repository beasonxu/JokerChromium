package org.chromium.chrome.browser.browserservices.permissiondelegation;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class InstalledWebappBridgeJni implements InstalledWebappBridge.Natives {
  private static InstalledWebappBridge.Natives testInstance;

  public static final JniStaticTestMocker<InstalledWebappBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<InstalledWebappBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        InstalledWebappBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyPermissionsChange(long provider, int type) {
    GEN_JNI.org_chromium_chrome_browser_browserservices_permissiondelegation_InstalledWebappBridge_notifyPermissionsChange(provider, type);
  }

  @Override
  public void notifyPermissionResult(long callback, boolean allow) {
    GEN_JNI.org_chromium_chrome_browser_browserservices_permissiondelegation_InstalledWebappBridge_notifyPermissionResult(callback, allow);
  }

  @Override
  public void runPermissionCallback(long callback, int settingValue) {
    GEN_JNI.org_chromium_chrome_browser_browserservices_permissiondelegation_InstalledWebappBridge_runPermissionCallback(callback, settingValue);
  }

  public static InstalledWebappBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InstalledWebappBridgeJni();
  }
}
