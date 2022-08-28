package org.chromium.chrome.browser.permissions;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NotificationBlockedDialogJni implements NotificationBlockedDialog.Natives {
  private static NotificationBlockedDialog.Natives testInstance;

  public static final JniStaticTestMocker<NotificationBlockedDialog.Natives> TEST_HOOKS = new JniStaticTestMocker<NotificationBlockedDialog.Natives>() {
    @Override
    public void setInstanceForTesting(
        NotificationBlockedDialog.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onPrimaryButtonClicked(long nativeNotificationBlockedDialogController) {
    GEN_JNI.org_chromium_chrome_browser_permissions_NotificationBlockedDialog_onPrimaryButtonClicked(nativeNotificationBlockedDialogController);
  }

  @Override
  public void onNegativeButtonClicked(long nativeNotificationBlockedDialogController) {
    GEN_JNI.org_chromium_chrome_browser_permissions_NotificationBlockedDialog_onNegativeButtonClicked(nativeNotificationBlockedDialogController);
  }

  @Override
  public void onLearnMoreClicked(long nativeNotificationBlockedDialogController) {
    GEN_JNI.org_chromium_chrome_browser_permissions_NotificationBlockedDialog_onLearnMoreClicked(nativeNotificationBlockedDialogController);
  }

  @Override
  public void onDialogDismissed(long nativeNotificationBlockedDialogController) {
    GEN_JNI.org_chromium_chrome_browser_permissions_NotificationBlockedDialog_onDialogDismissed(nativeNotificationBlockedDialogController);
  }

  public static NotificationBlockedDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.permissions.NotificationBlockedDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NotificationBlockedDialogJni();
  }
}
