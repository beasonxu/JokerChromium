package org.chromium.chrome.browser.download;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class DownloadMessageBridgeJni implements DownloadMessageBridge.Natives {
  private static DownloadMessageBridge.Natives testInstance;

  public static final JniStaticTestMocker<DownloadMessageBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.DownloadMessageBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.DownloadMessageBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onConfirmed(long nativeDownloadMessageBridge, long callbackId, boolean accepted) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadMessageBridge_onConfirmed(nativeDownloadMessageBridge, callbackId, accepted);
  }

  public static DownloadMessageBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DownloadMessageBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DownloadMessageBridgeJni();
  }
}
