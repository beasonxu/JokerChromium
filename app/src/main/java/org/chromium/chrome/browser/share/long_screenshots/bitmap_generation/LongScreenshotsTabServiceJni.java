package org.chromium.chrome.browser.share.long_screenshots.bitmap_generation;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class LongScreenshotsTabServiceJni implements LongScreenshotsTabService.Natives {
  private static LongScreenshotsTabService.Natives testInstance;

  public static final JniStaticTestMocker<LongScreenshotsTabService.Natives> TEST_HOOKS = new JniStaticTestMocker<LongScreenshotsTabService.Natives>() {
    @Override
    public void setInstanceForTesting(
        LongScreenshotsTabService.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void captureTabAndroid(long nativeLongScreenshotsTabService, int tabId, GURL url,
      WebContents webContents, int clipX, int clipY, int clipWidth, int clipHeight,
      boolean inMemory) {
    GEN_JNI.org_chromium_chrome_browser_share_long_1screenshots_bitmap_1generation_LongScreenshotsTabService_captureTabAndroid(nativeLongScreenshotsTabService, tabId, url, webContents, clipX, clipY, clipWidth, clipHeight, inMemory);
  }

  @Override
  public void longScreenshotsClosedAndroid(long nativeLongScreenshotsTabService) {
    GEN_JNI.org_chromium_chrome_browser_share_long_1screenshots_bitmap_1generation_LongScreenshotsTabService_longScreenshotsClosedAndroid(nativeLongScreenshotsTabService);
  }

  @Override
  public void releaseCaptureResultPtr(long captureResultPtr) {
    GEN_JNI.org_chromium_chrome_browser_share_long_1screenshots_bitmap_1generation_LongScreenshotsTabService_releaseCaptureResultPtr(captureResultPtr);
  }

  public static LongScreenshotsTabService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.long_screenshots.bitmap_generation.LongScreenshotsTabService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LongScreenshotsTabServiceJni();
  }
}
