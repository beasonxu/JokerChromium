package org.chromium.components.translate;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TranslateMessageJni implements TranslateMessage.Natives {
  private static TranslateMessage.Natives testInstance;

  public static final JniStaticTestMocker<TranslateMessage.Natives> TEST_HOOKS = new JniStaticTestMocker<TranslateMessage.Natives>() {
    @Override
    public void setInstanceForTesting(
        TranslateMessage.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void handlePrimaryAction(long nativeTranslateMessage) {
    GEN_JNI.org_chromium_components_translate_TranslateMessage_handlePrimaryAction(nativeTranslateMessage);
  }

  @Override
  public void handleDismiss(long nativeTranslateMessage, int dismissReason) {
    GEN_JNI.org_chromium_components_translate_TranslateMessage_handleDismiss(nativeTranslateMessage, dismissReason);
  }

  @Override
  public TranslateMessage.MenuItem[] buildOverflowMenu(long nativeTranslateMessage) {
    return (TranslateMessage.MenuItem[])GEN_JNI.org_chromium_components_translate_TranslateMessage_buildOverflowMenu(nativeTranslateMessage);
  }

  @Override
  public TranslateMessage.MenuItem[] handleSecondaryMenuItemClicked(long nativeTranslateMessage,
      int overflowMenuItemId, String languageCode, boolean hadCheckmark) {
    return (TranslateMessage.MenuItem[])GEN_JNI.org_chromium_components_translate_TranslateMessage_handleSecondaryMenuItemClicked(nativeTranslateMessage, overflowMenuItemId, languageCode, hadCheckmark);
  }

  public static TranslateMessage.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.translate.TranslateMessage.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TranslateMessageJni();
  }
}
