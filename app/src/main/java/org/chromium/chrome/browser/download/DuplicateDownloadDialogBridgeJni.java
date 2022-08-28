package org.chromium.chrome.browser.download;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class DuplicateDownloadDialogBridgeJni implements DuplicateDownloadDialogBridge.Natives {
  private static DuplicateDownloadDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<DuplicateDownloadDialogBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<DuplicateDownloadDialogBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        DuplicateDownloadDialogBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onConfirmed(long nativeDuplicateDownloadDialogBridge, long callbackId,
      boolean accepted) {
    GEN_JNI.org_chromium_chrome_browser_download_DuplicateDownloadDialogBridge_onConfirmed(nativeDuplicateDownloadDialogBridge, callbackId, accepted);
  }

  public static DuplicateDownloadDialogBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DuplicateDownloadDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DuplicateDownloadDialogBridgeJni();
  }
}
