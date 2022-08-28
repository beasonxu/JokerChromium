package org.chromium.components.browser_ui.contacts_picker;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class ContactsPickerFeatureListJni implements ContactsPickerFeatureList.Natives {
  private static ContactsPickerFeatureList.Natives testInstance;

  public static final JniStaticTestMocker<ContactsPickerFeatureList.Natives> TEST_HOOKS = new JniStaticTestMocker<ContactsPickerFeatureList.Natives>() {
    @Override
    public void setInstanceForTesting(
        ContactsPickerFeatureList.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled(String featureName) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_contacts_1picker_ContactsPickerFeatureList_isEnabled(featureName);
  }

  public static ContactsPickerFeatureList.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.browser_ui.contacts_picker.ContactsPickerFeatureList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ContactsPickerFeatureListJni();
  }
}
