package org.chromium.components.browser_ui.photo_picker;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ImageDecoderJni implements ImageDecoder.Natives {
  private static ImageDecoder.Natives testInstance;

  public static final JniStaticTestMocker<ImageDecoder.Natives> TEST_HOOKS = new JniStaticTestMocker<ImageDecoder.Natives>() {
    @Override
    public void setInstanceForTesting(
        ImageDecoder.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void initializePhotoPickerSandbox() {
  }

  public static ImageDecoder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.browser_ui.photo_picker.ImageDecoder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ImageDecoderJni();
  }
}
