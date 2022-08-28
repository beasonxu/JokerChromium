package org.chromium.chrome.browser.share.crow;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class CrowBridgeJni implements CrowBridge.Natives {
  private static CrowBridge.Natives testInstance;

  public static final JniStaticTestMocker<CrowBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<CrowBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        CrowBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getRecentVisitCountsToHost(GURL url, int numDays, Callback<int[]> callback) {
    GEN_JNI.org_chromium_chrome_browser_share_crow_CrowBridge_getRecentVisitCountsToHost(url, numDays, callback);
  }

  @Override
  public String getPublicationIDForHost(String host) {
    return (String)GEN_JNI.org_chromium_chrome_browser_share_crow_CrowBridge_getPublicationIDForHost(host);
  }

  public static CrowBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.crow.CrowBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CrowBridgeJni();
  }
}
