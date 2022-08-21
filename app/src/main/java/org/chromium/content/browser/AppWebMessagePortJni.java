package org.chromium.content.browser;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.MessagePayload;
import org.chromium.content_public.browser.MessagePort;

@CheckDiscard("crbug.com/993421")
class AppWebMessagePortJni implements AppWebMessagePort.Natives {
  private static AppWebMessagePort.Natives testInstance;

  public static final JniStaticTestMocker<AppWebMessagePort.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.AppWebMessagePort.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.AppWebMessagePort.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public AppWebMessagePort[] createPair() {
    return (AppWebMessagePort[])GEN_JNI.org_chromium_content_browser_AppWebMessagePort_createPair();
  }

  @Override
  public void postMessage(long nativeAppWebMessagePort, MessagePayload messagePayload,
      MessagePort[] sentPorts) {
    GEN_JNI.org_chromium_content_browser_AppWebMessagePort_postMessage(nativeAppWebMessagePort, messagePayload, sentPorts);
  }

  @Override
  public void setShouldReceiveMessages(long nativeAppWebMessagePort, boolean shouldReceiveMessage) {
    GEN_JNI.org_chromium_content_browser_AppWebMessagePort_setShouldReceiveMessages(nativeAppWebMessagePort, shouldReceiveMessage);
  }

  @Override
  public void closeAndDestroy(long nativeAppWebMessagePort) {
    GEN_JNI.org_chromium_content_browser_AppWebMessagePort_closeAndDestroy(nativeAppWebMessagePort);
  }

  public static AppWebMessagePort.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AppWebMessagePort.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AppWebMessagePortJni();
  }
}
