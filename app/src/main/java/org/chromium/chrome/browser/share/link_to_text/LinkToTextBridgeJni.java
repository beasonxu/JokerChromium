package org.chromium.chrome.browser.share.link_to_text;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class LinkToTextBridgeJni implements LinkToTextBridge.Natives {
  private static LinkToTextBridge.Natives testInstance;

  public static final JniStaticTestMocker<LinkToTextBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.share.link_to_text.LinkToTextBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.share.link_to_text.LinkToTextBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean shouldOfferLinkToText(GURL url) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextBridge_shouldOfferLinkToText(url);
  }

  @Override
  public boolean supportsLinkGenerationInIframe(GURL url) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextBridge_supportsLinkGenerationInIframe(url);
  }

  @Override
  public void logFailureMetrics(WebContents webContents, int error) {
    GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextBridge_logFailureMetrics(webContents, error);
  }

  @Override
  public void logSuccessMetrics(WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextBridge_logSuccessMetrics(webContents);
  }

  @Override
  public void logLinkRequestedBeforeStatus(int status, int readyStatus) {
    GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextBridge_logLinkRequestedBeforeStatus(status, readyStatus);
  }

  @Override
  public void logLinkToTextReshareStatus(int status) {
    GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextBridge_logLinkToTextReshareStatus(status);
  }

  public static LinkToTextBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.link_to_text.LinkToTextBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LinkToTextBridgeJni();
  }
}
