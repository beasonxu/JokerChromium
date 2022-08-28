package org.chromium.chrome.browser.touch_to_fill;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.touch_to_fill.data.Credential;
import org.chromium.chrome.browser.touch_to_fill.data.WebAuthnCredential;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TouchToFillBridgeJni implements TouchToFillBridge.Natives {
  private static TouchToFillBridge.Natives testInstance;

  public static final JniStaticTestMocker<TouchToFillBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<TouchToFillBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        TouchToFillBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onCredentialSelected(long nativeTouchToFillViewImpl, Credential credential) {
    GEN_JNI.org_chromium_chrome_browser_touch_1to_1fill_TouchToFillBridge_onCredentialSelected(nativeTouchToFillViewImpl, credential);
  }

  @Override
  public void onWebAuthnCredentialSelected(long nativeTouchToFillViewImpl,
      WebAuthnCredential credential) {
    GEN_JNI.org_chromium_chrome_browser_touch_1to_1fill_TouchToFillBridge_onWebAuthnCredentialSelected(nativeTouchToFillViewImpl, credential);
  }

  @Override
  public void onManagePasswordsSelected(long nativeTouchToFillViewImpl) {
    GEN_JNI.org_chromium_chrome_browser_touch_1to_1fill_TouchToFillBridge_onManagePasswordsSelected(nativeTouchToFillViewImpl);
  }

  @Override
  public void onDismiss(long nativeTouchToFillViewImpl) {
    GEN_JNI.org_chromium_chrome_browser_touch_1to_1fill_TouchToFillBridge_onDismiss(nativeTouchToFillViewImpl);
  }

  public static TouchToFillBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.touch_to_fill.TouchToFillBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TouchToFillBridgeJni();
  }
}