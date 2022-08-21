package org.chromium.chrome.browser.permissions;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class PermissionUpdateRequesterJni implements PermissionUpdateRequester.Natives {
  private static PermissionUpdateRequester.Natives testInstance;

  public static final JniStaticTestMocker<PermissionUpdateRequester.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.permissions.PermissionUpdateRequester.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.permissions.PermissionUpdateRequester.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onPermissionResult(long nativePermissionUpdateRequester,
      boolean allPermissionsGranted) {
    GEN_JNI.org_chromium_chrome_browser_permissions_PermissionUpdateRequester_onPermissionResult(nativePermissionUpdateRequester, allPermissionsGranted);
  }

  public static PermissionUpdateRequester.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.permissions.PermissionUpdateRequester.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PermissionUpdateRequesterJni();
  }
}
