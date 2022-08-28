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
public class DownloadDialogBridgeJni implements DownloadDialogBridge.Natives {
  private static DownloadDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<DownloadDialogBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<DownloadDialogBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        DownloadDialogBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onComplete(long nativeDownloadDialogBridge, DownloadDialogBridge caller,
      String returnedPath, boolean onWifi, long startTime) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadDialogBridge_onComplete(nativeDownloadDialogBridge, caller, returnedPath, onWifi, startTime);
  }

  @Override
  public void onCanceled(long nativeDownloadDialogBridge, DownloadDialogBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadDialogBridge_onCanceled(nativeDownloadDialogBridge, caller);
  }

  @Override
  public String getDownloadDefaultDirectory() {
    return (String)GEN_JNI.org_chromium_chrome_browser_download_DownloadDialogBridge_getDownloadDefaultDirectory();
  }

  @Override
  public void setDownloadAndSaveFileDefaultDirectory(String directory) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadDialogBridge_setDownloadAndSaveFileDefaultDirectory(directory);
  }

  @Override
  public long getDownloadLaterMinFileSize() {
    return (long)GEN_JNI.org_chromium_chrome_browser_download_DownloadDialogBridge_getDownloadLaterMinFileSize();
  }

  @Override
  public boolean shouldShowDateTimePicker() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_download_DownloadDialogBridge_shouldShowDateTimePicker();
  }

  @Override
  public boolean isLocationDialogManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_download_DownloadDialogBridge_isLocationDialogManaged();
  }

  public static DownloadDialogBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DownloadDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DownloadDialogBridgeJni();
  }
}