package org.chromium.chrome.browser.infobar;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@CheckDiscard("crbug.com/993421")
class SyncErrorInfoBarJni implements SyncErrorInfoBar.Natives {
  private static SyncErrorInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<SyncErrorInfoBar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.SyncErrorInfoBar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.infobar.SyncErrorInfoBar.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void launch(WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_infobar_SyncErrorInfoBar_launch(webContents);
  }

  public static SyncErrorInfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.SyncErrorInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SyncErrorInfoBarJni();
  }
}
