package org.chromium.chrome.browser.share;

import android.graphics.Bitmap;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class BitmapDownloadRequestJni implements BitmapDownloadRequest.Natives {
  private static BitmapDownloadRequest.Natives testInstance;

  public static final JniStaticTestMocker<BitmapDownloadRequest.Natives> TEST_HOOKS = new JniStaticTestMocker<BitmapDownloadRequest.Natives>() {
    @Override
    public void setInstanceForTesting(
        BitmapDownloadRequest.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void downloadBitmap(String fileName, Bitmap bitmap) {
    GEN_JNI.org_chromium_chrome_browser_share_BitmapDownloadRequest_downloadBitmap(fileName, bitmap);
  }

  public static BitmapDownloadRequest.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.BitmapDownloadRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BitmapDownloadRequestJni();
  }
}
