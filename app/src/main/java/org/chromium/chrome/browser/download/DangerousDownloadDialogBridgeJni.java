package org.chromium.chrome.browser.download;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class DangerousDownloadDialogBridgeJni implements DangerousDownloadDialogBridge.Natives {
  private static DangerousDownloadDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<DangerousDownloadDialogBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<DangerousDownloadDialogBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        DangerousDownloadDialogBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void accepted(long nativeDangerousDownloadDialogBridge, String guid) {
    GEN_JNI.org_chromium_chrome_browser_download_DangerousDownloadDialogBridge_accepted(nativeDangerousDownloadDialogBridge, guid);
  }

  @Override
  public void cancelled(long nativeDangerousDownloadDialogBridge, String guid) {
    GEN_JNI.org_chromium_chrome_browser_download_DangerousDownloadDialogBridge_cancelled(nativeDangerousDownloadDialogBridge, guid);
  }

  public static DangerousDownloadDialogBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DangerousDownloadDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DangerousDownloadDialogBridgeJni();
  }
}
