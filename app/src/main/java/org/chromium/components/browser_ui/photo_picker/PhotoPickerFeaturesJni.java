package org.chromium.components.browser_ui.photo_picker;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PhotoPickerFeaturesJni implements PhotoPickerFeatures.Natives {
  private static PhotoPickerFeatures.Natives testInstance;

  public static final JniStaticTestMocker<PhotoPickerFeatures.Natives> TEST_HOOKS = new JniStaticTestMocker<PhotoPickerFeatures.Natives>() {
    @Override
    public void setInstanceForTesting(
        PhotoPickerFeatures.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getFeature(int ordinal) {
    return (long)GEN_JNI.org_chromium_components_browser_1ui_photo_1picker_PhotoPickerFeatures_getFeature(ordinal);
  }

  public static PhotoPickerFeatures.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.browser_ui.photo_picker.PhotoPickerFeatures.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PhotoPickerFeaturesJni();
  }
}
