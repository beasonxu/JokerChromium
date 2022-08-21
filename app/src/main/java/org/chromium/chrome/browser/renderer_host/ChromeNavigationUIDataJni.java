package org.chromium.chrome.browser.renderer_host;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class ChromeNavigationUIDataJni implements ChromeNavigationUIData.Navites {
  private static ChromeNavigationUIData.Navites testInstance;

  public static final JniStaticTestMocker<ChromeNavigationUIData.Navites> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.renderer_host.ChromeNavigationUIData.Navites>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.renderer_host.ChromeNavigationUIData.Navites instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createUnownedNativeCopy(ChromeNavigationUIData caller, long bookmarkId) {
    return (long)GEN_JNI.org_chromium_chrome_browser_renderer_1host_ChromeNavigationUIData_createUnownedNativeCopy(caller, bookmarkId);
  }

  public static ChromeNavigationUIData.Navites get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.renderer_host.ChromeNavigationUIData.Navites. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeNavigationUIDataJni();
  }
}
