package org.chromium.chrome.browser.instantapps;

import java.lang.Override;
import java.lang.String;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@CheckDiscard("crbug.com/993421")
class InstantAppsMessageDelegateJni implements InstantAppsMessageDelegate.Natives {
  private static InstantAppsMessageDelegate.Natives testInstance;

  public static final JniStaticTestMocker<InstantAppsMessageDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.instantapps.InstantAppsMessageDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.instantapps.InstantAppsMessageDelegate.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initializeNativeDelegate(InstantAppsMessageDelegate delegate, WebContents webContents,
      String url) {
    return (long)GEN_JNI.org_chromium_chrome_browser_instantapps_InstantAppsMessageDelegate_initializeNativeDelegate(delegate, webContents, url);
  }

  @Override
  public void onMessageShown(WebContents webContents, String url, boolean instantAppIsDefault) {
    GEN_JNI.org_chromium_chrome_browser_instantapps_InstantAppsMessageDelegate_onMessageShown(webContents, url, instantAppIsDefault);
  }

  @Override
  public void onPrimaryAction(boolean instantAppIsDefault) {
    GEN_JNI.org_chromium_chrome_browser_instantapps_InstantAppsMessageDelegate_onPrimaryAction(instantAppIsDefault);
  }

  @Override
  public void onMessageDismissed(WebContents webContents, String url, boolean instantAppIsDefault) {
    GEN_JNI.org_chromium_chrome_browser_instantapps_InstantAppsMessageDelegate_onMessageDismissed(webContents, url, instantAppIsDefault);
  }

  public static InstantAppsMessageDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.instantapps.InstantAppsMessageDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InstantAppsMessageDelegateJni();
  }
}
