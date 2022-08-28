package org.chromium.chrome.browser.infobar;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.tab.Tab;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class ReaderModeInfoBarJni implements ReaderModeInfoBar.Natives {
  private static ReaderModeInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<ReaderModeInfoBar.Natives> TEST_HOOKS = new JniStaticTestMocker<ReaderModeInfoBar.Natives>() {
    @Override
    public void setInstanceForTesting(
        ReaderModeInfoBar.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void create(Tab tab) {
    GEN_JNI.org_chromium_chrome_browser_infobar_ReaderModeInfoBar_create(tab);
  }

  @Override
  public Tab getTab(long nativeReaderModeInfoBar, ReaderModeInfoBar caller) {
    return (Tab)GEN_JNI.org_chromium_chrome_browser_infobar_ReaderModeInfoBar_getTab(nativeReaderModeInfoBar, caller);
  }

  public static ReaderModeInfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.ReaderModeInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ReaderModeInfoBarJni();
  }
}
