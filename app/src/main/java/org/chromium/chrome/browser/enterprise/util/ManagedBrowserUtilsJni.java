package org.chromium.chrome.browser.enterprise.util;

import java.lang.Override;
import java.lang.String;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@CheckDiscard("crbug.com/993421")
public class ManagedBrowserUtilsJni implements ManagedBrowserUtils.Natives {
  private static ManagedBrowserUtils.Natives testInstance;

  public static final JniStaticTestMocker<ManagedBrowserUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.enterprise.util.ManagedBrowserUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.enterprise.util.ManagedBrowserUtils.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isBrowserManaged(Profile profile) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_enterprise_util_ManagedBrowserUtils_isBrowserManaged(profile);
  }

  @Override
  public String getAccountManagerName(Profile profile) {
    return (String)GEN_JNI.org_chromium_chrome_browser_enterprise_util_ManagedBrowserUtils_getAccountManagerName(profile);
  }

  public static ManagedBrowserUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.enterprise.util.ManagedBrowserUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ManagedBrowserUtilsJni();
  }
}
