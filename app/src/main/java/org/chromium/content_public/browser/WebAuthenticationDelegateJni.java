package org.chromium.content_public.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class WebAuthenticationDelegateJni implements WebAuthenticationDelegate.Natives {
  private static WebAuthenticationDelegate.Natives testInstance;

  public static final JniStaticTestMocker<WebAuthenticationDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content_public.browser.WebAuthenticationDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content_public.browser.WebAuthenticationDelegate.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getNativeDelegate() {
    return (long)GEN_JNI.org_chromium_content_1public_browser_WebAuthenticationDelegate_getNativeDelegate();
  }

  @Override
  public WebAuthenticationDelegate.IntentSender getIntentSender(long delegatePtr,
      WebContents webContents) {
    return (WebAuthenticationDelegate.IntentSender)GEN_JNI.org_chromium_content_1public_browser_WebAuthenticationDelegate_getIntentSender(delegatePtr, webContents);
  }

  @Override
  public int getSupportLevel(long delegatePtr, WebContents webContents) {
    return (int)GEN_JNI.org_chromium_content_1public_browser_WebAuthenticationDelegate_getSupportLevel(delegatePtr, webContents);
  }

  public static WebAuthenticationDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.browser.WebAuthenticationDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebAuthenticationDelegateJni();
  }
}
