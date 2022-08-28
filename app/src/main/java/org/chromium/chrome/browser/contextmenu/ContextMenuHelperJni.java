package org.chromium.chrome.browser.contextmenu;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ContextMenuHelperJni implements ContextMenuHelper.Natives {
  private static ContextMenuHelper.Natives testInstance;

  public static final JniStaticTestMocker<ContextMenuHelper.Natives> TEST_HOOKS = new JniStaticTestMocker<ContextMenuHelper.Natives>() {
    @Override
    public void setInstanceForTesting(
        ContextMenuHelper.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onContextMenuClosed(long nativeContextMenuHelper, ContextMenuHelper caller) {
    GEN_JNI.org_chromium_chrome_browser_contextmenu_ContextMenuHelper_onContextMenuClosed(nativeContextMenuHelper, caller);
  }

  public static ContextMenuHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextmenu.ContextMenuHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextMenuHelperJni();
  }
}