package org.chromium.chrome.browser.ntp;

import java.lang.Override;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tabmodel.TabModel;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class RecentlyClosedBridgeJni implements RecentlyClosedBridge.Natives {
  private static RecentlyClosedBridge.Natives testInstance;

  public static final JniStaticTestMocker<RecentlyClosedBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<RecentlyClosedBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        RecentlyClosedBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(RecentlyClosedBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeRecentlyClosedTabsBridge) {
    GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_destroy(nativeRecentlyClosedTabsBridge);
  }

  @Override
  public boolean getRecentlyClosedTabs(long nativeRecentlyClosedTabsBridge,
      List<RecentlyClosedTab> tabs, int maxTabCount) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_getRecentlyClosedTabs(nativeRecentlyClosedTabsBridge, tabs, maxTabCount);
  }

  @Override
  public boolean getRecentlyClosedEntries(long nativeRecentlyClosedTabsBridge,
      List<RecentlyClosedEntry> entries, int maxEntryCount) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_getRecentlyClosedEntries(nativeRecentlyClosedTabsBridge, entries, maxEntryCount);
  }

  @Override
  public boolean openRecentlyClosedTab(long nativeRecentlyClosedTabsBridge, TabModel tabModel,
      int tabSessionId, int windowOpenDisposition) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_openRecentlyClosedTab(nativeRecentlyClosedTabsBridge, tabModel, tabSessionId, windowOpenDisposition);
  }

  @Override
  public boolean openRecentlyClosedEntry(long nativeRecentlyClosedTabsBridge, TabModel tabModel,
      int sessionId) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_openRecentlyClosedEntry(nativeRecentlyClosedTabsBridge, tabModel, sessionId);
  }

  @Override
  public boolean openMostRecentlyClosedEntry(long nativeRecentlyClosedTabsBridge,
      TabModel tabModel) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_openMostRecentlyClosedEntry(nativeRecentlyClosedTabsBridge, tabModel);
  }

  @Override
  public void clearRecentlyClosedEntries(long nativeRecentlyClosedTabsBridge) {
    GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_clearRecentlyClosedEntries(nativeRecentlyClosedTabsBridge);
  }

  public static RecentlyClosedBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ntp.RecentlyClosedBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RecentlyClosedBridgeJni();
  }
}
