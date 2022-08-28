package org.chromium.chrome.browser.tab.tab_restore;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class HistoricalTabSaverImplJni implements HistoricalTabSaverImpl.Natives {
  private static HistoricalTabSaverImpl.Natives testInstance;

  public static final JniStaticTestMocker<HistoricalTabSaverImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<HistoricalTabSaverImpl.Natives>() {
    @Override
    public void setInstanceForTesting(
        HistoricalTabSaverImpl.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void createHistoricalTab(Tab tab) {
    GEN_JNI.org_chromium_chrome_browser_tab_tab_1restore_HistoricalTabSaverImpl_createHistoricalTab(tab);
  }

  @Override
  public void createHistoricalGroup(TabModel model, String title, Tab[] tabs) {
    GEN_JNI.org_chromium_chrome_browser_tab_tab_1restore_HistoricalTabSaverImpl_createHistoricalGroup(model, title, tabs);
  }

  @Override
  public void createHistoricalBulkClosure(TabModel model, int[] groupIds, String[] titles,
      int[] perTabGroupId, Tab[] tabs) {
    GEN_JNI.org_chromium_chrome_browser_tab_tab_1restore_HistoricalTabSaverImpl_createHistoricalBulkClosure(model, groupIds, titles, perTabGroupId, tabs);
  }

  public static HistoricalTabSaverImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.tab_restore.HistoricalTabSaverImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new HistoricalTabSaverImplJni();
  }
}
