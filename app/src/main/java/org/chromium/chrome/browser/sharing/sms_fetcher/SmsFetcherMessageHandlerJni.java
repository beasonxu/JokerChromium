package org.chromium.chrome.browser.sharing.sms_fetcher;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SmsFetcherMessageHandlerJni implements SmsFetcherMessageHandler.Natives {
  private static SmsFetcherMessageHandler.Natives testInstance;

  public static final JniStaticTestMocker<SmsFetcherMessageHandler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.sharing.sms_fetcher.SmsFetcherMessageHandler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.sharing.sms_fetcher.SmsFetcherMessageHandler.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onConfirm(long nativeSmsFetchRequestHandler, String topOrigin,
      String embeddedOrigin) {
    GEN_JNI.org_chromium_chrome_browser_sharing_sms_1fetcher_SmsFetcherMessageHandler_onConfirm(nativeSmsFetchRequestHandler, topOrigin, embeddedOrigin);
  }

  @Override
  public void onDismiss(long nativeSmsFetchRequestHandler, String topOrigin,
      String embeddedOrigin) {
    GEN_JNI.org_chromium_chrome_browser_sharing_sms_1fetcher_SmsFetcherMessageHandler_onDismiss(nativeSmsFetchRequestHandler, topOrigin, embeddedOrigin);
  }

  public static SmsFetcherMessageHandler.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.sharing.sms_fetcher.SmsFetcherMessageHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SmsFetcherMessageHandlerJni();
  }
}
