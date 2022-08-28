package org.chromium.content.browser.input;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SelectPopupJni implements SelectPopup.Natives {
  private static SelectPopup.Natives testInstance;

  public static final JniStaticTestMocker<SelectPopup.Natives> TEST_HOOKS = new JniStaticTestMocker<SelectPopup.Natives>() {
    @Override
    public void setInstanceForTesting(
        SelectPopup.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void selectMenuItems(long nativeSelectPopup, SelectPopup caller,
      long nativeSelectPopupSourceFrame, int[] indices) {
    GEN_JNI.org_chromium_content_browser_input_SelectPopup_selectMenuItems(nativeSelectPopup, caller, nativeSelectPopupSourceFrame, indices);
  }

  public static SelectPopup.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.SelectPopup.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SelectPopupJni();
  }
}
