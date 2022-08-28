package org.chromium.components.infobars;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class InfoBarJni implements InfoBar.Natives {
  private static InfoBar.Natives testInstance;

  public static final JniStaticTestMocker<InfoBar.Natives> TEST_HOOKS = new JniStaticTestMocker<InfoBar.Natives>() {
    @Override
    public void setInstanceForTesting(InfoBar.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getInfoBarIdentifier(long nativeInfoBarAndroid, InfoBar caller) {
    return (int)GEN_JNI.org_chromium_components_infobars_InfoBar_getInfoBarIdentifier(nativeInfoBarAndroid, caller);
  }

  @Override
  public void onLinkClicked(long nativeInfoBarAndroid, InfoBar caller) {
    GEN_JNI.org_chromium_components_infobars_InfoBar_onLinkClicked(nativeInfoBarAndroid, caller);
  }

  @Override
  public void onButtonClicked(long nativeInfoBarAndroid, InfoBar caller, int action) {
    GEN_JNI.org_chromium_components_infobars_InfoBar_onButtonClicked(nativeInfoBarAndroid, caller, action);
  }

  @Override
  public void onCloseButtonClicked(long nativeInfoBarAndroid, InfoBar caller) {
    GEN_JNI.org_chromium_components_infobars_InfoBar_onCloseButtonClicked(nativeInfoBarAndroid, caller);
  }

  public static InfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.infobars.InfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InfoBarJni();
  }
}
