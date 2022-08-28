package org.chromium.content.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AppWebMessagePortDescriptorJni implements AppWebMessagePortDescriptor.Native {
  private static AppWebMessagePortDescriptor.Native testInstance;

  public static final JniStaticTestMocker<AppWebMessagePortDescriptor.Native> TEST_HOOKS = new JniStaticTestMocker<AppWebMessagePortDescriptor.Native>() {
    @Override
    public void setInstanceForTesting(
        AppWebMessagePortDescriptor.Native instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long[] createPair() {
    return (long[])GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_createPair();
  }

  @Override
  public long create(long mojoHandle, long idLow, long idHigh, long sequenceNumber) {
    return (long)GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_create(mojoHandle, idLow, idHigh, sequenceNumber);
  }

  @Override
  public long takeHandleToEntangle(long blinkMessagePortDescriptor) {
    return (long)GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_takeHandleToEntangle(blinkMessagePortDescriptor);
  }

  @Override
  public void giveDisentangledHandle(long blinkMessagePortDescriptor, long nativeHandle) {
    GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_giveDisentangledHandle(blinkMessagePortDescriptor, nativeHandle);
  }

  @Override
  public void onConnectionError(long blinkMessagePortDescriptor) {
    GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_onConnectionError(blinkMessagePortDescriptor);
  }

  @Override
  public long[] passSerialized(long blinkMessagePortDescriptor) {
    return (long[])GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_passSerialized(blinkMessagePortDescriptor);
  }

  @Override
  public void closeAndDestroy(long blinkMessagePortDescriptor) {
    GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_closeAndDestroy(blinkMessagePortDescriptor);
  }

  @Override
  public void disentangleCloseAndDestroy(long blinkMessagePortDescriptor) {
    GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_disentangleCloseAndDestroy(blinkMessagePortDescriptor);
  }

  public static AppWebMessagePortDescriptor.Native get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AppWebMessagePortDescriptor.Native. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AppWebMessagePortDescriptorJni();
  }
}
