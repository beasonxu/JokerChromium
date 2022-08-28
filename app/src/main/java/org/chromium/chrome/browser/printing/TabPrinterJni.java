package org.chromium.chrome.browser.printing;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TabPrinterJni implements TabPrinter.Natives {
  private static TabPrinter.Natives testInstance;

  public static final JniStaticTestMocker<TabPrinter.Natives> TEST_HOOKS = new JniStaticTestMocker<TabPrinter.Natives>() {
    @Override
    public void setInstanceForTesting(
        TabPrinter.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean print(WebContents webContents, int renderProcessId, int renderFrameId) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_printing_TabPrinter_print(webContents, renderProcessId, renderFrameId);
  }

  public static TabPrinter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.printing.TabPrinter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabPrinterJni();
  }
}
