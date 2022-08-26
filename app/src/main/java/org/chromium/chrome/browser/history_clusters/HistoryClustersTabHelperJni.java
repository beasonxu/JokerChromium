package org.chromium.chrome.browser.history_clusters;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class HistoryClustersTabHelperJni implements HistoryClustersTabHelper.Natives {
  private static HistoryClustersTabHelper.Natives testInstance;

  public static final JniStaticTestMocker<HistoryClustersTabHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.history_clusters.HistoryClustersTabHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.history_clusters.HistoryClustersTabHelper.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onCurrentTabUrlCopied(WebContents contents) {
    GEN_JNI.org_chromium_chrome_browser_history_1clusters_HistoryClustersTabHelper_onCurrentTabUrlCopied(contents);
  }

  @Override
  public void onCurrentTabUrlShared(WebContents contents) {
    GEN_JNI.org_chromium_chrome_browser_history_1clusters_HistoryClustersTabHelper_onCurrentTabUrlShared(contents);
  }

  public static HistoryClustersTabHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.history_clusters.HistoryClustersTabHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new HistoryClustersTabHelperJni();
  }
}
