package org.chromium.chrome.browser.ui.android.webid;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AccountSelectionBridgeJni implements AccountSelectionBridge.Natives {
  private static AccountSelectionBridge.Natives testInstance;

  public static final JniStaticTestMocker<AccountSelectionBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<AccountSelectionBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        AccountSelectionBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAccountSelected(long nativeAccountSelectionViewAndroid, String[] accountFields,
      GURL accountPictureUrl, boolean isSignedIn) {
    GEN_JNI.org_chromium_chrome_browser_ui_android_webid_AccountSelectionBridge_onAccountSelected(nativeAccountSelectionViewAndroid, accountFields, accountPictureUrl, isSignedIn);
  }

  @Override
  public void onDismiss(long nativeAccountSelectionViewAndroid, boolean shouldEmbargo) {
    GEN_JNI.org_chromium_chrome_browser_ui_android_webid_AccountSelectionBridge_onDismiss(nativeAccountSelectionViewAndroid, shouldEmbargo);
  }

  @Override
  public void onAutoSignInCancelled(long nativeAccountSelectionViewAndroid) {
    GEN_JNI.org_chromium_chrome_browser_ui_android_webid_AccountSelectionBridge_onAutoSignInCancelled(nativeAccountSelectionViewAndroid);
  }

  public static AccountSelectionBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ui.android.webid.AccountSelectionBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AccountSelectionBridgeJni();
  }
}
