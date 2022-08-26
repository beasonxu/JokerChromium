package org.chromium.components.javascript_dialogs;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class JavascriptTabModalDialogJni implements JavascriptTabModalDialog.Natives {
  private static JavascriptTabModalDialog.Natives testInstance;

  public static final JniStaticTestMocker<JavascriptTabModalDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.javascript_dialogs.JavascriptTabModalDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.javascript_dialogs.JavascriptTabModalDialog.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void accept(long nativeTabModalDialogViewAndroid, JavascriptTabModalDialog caller,
      String prompt) {
    GEN_JNI.org_chromium_components_javascript_1dialogs_JavascriptTabModalDialog_accept(nativeTabModalDialogViewAndroid, caller, prompt);
  }

  @Override
  public void cancel(long nativeTabModalDialogViewAndroid, JavascriptTabModalDialog caller,
      boolean buttonClicked) {
    GEN_JNI.org_chromium_components_javascript_1dialogs_JavascriptTabModalDialog_cancel(nativeTabModalDialogViewAndroid, caller, buttonClicked);
  }

  public static JavascriptTabModalDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.javascript_dialogs.JavascriptTabModalDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JavascriptTabModalDialogJni();
  }
}
