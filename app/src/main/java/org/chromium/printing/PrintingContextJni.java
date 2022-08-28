package org.chromium.printing;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PrintingContextJni implements PrintingContext.Natives {
  private static PrintingContext.Natives testInstance;

  public static final JniStaticTestMocker<PrintingContext.Natives> TEST_HOOKS = new JniStaticTestMocker<PrintingContext.Natives>() {
    @Override
    public void setInstanceForTesting(PrintingContext.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void askUserForSettingsReply(long nativePrintingContextAndroid, PrintingContext caller,
      boolean success) {
    GEN_JNI.org_chromium_printing_PrintingContext_askUserForSettingsReply(nativePrintingContextAndroid, caller, success);
  }

  @Override
  public void showSystemDialogDone(long nativePrintingContextAndroid, PrintingContext caller) {
    GEN_JNI.org_chromium_printing_PrintingContext_showSystemDialogDone(nativePrintingContextAndroid, caller);
  }

  public static PrintingContext.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.printing.PrintingContext.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrintingContextJni();
  }
}
