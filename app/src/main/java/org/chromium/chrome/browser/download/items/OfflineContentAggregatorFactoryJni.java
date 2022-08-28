package org.chromium.chrome.browser.download.items;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.offline_items_collection.OfflineContentProvider;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class OfflineContentAggregatorFactoryJni implements OfflineContentAggregatorFactory.Natives {
  private static OfflineContentAggregatorFactory.Natives testInstance;

  public static final JniStaticTestMocker<OfflineContentAggregatorFactory.Natives> TEST_HOOKS = new JniStaticTestMocker<OfflineContentAggregatorFactory.Natives>() {
    @Override
    public void setInstanceForTesting(
        OfflineContentAggregatorFactory.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public OfflineContentProvider getOfflineContentAggregator() {
    return (OfflineContentProvider)GEN_JNI.org_chromium_chrome_browser_download_items_OfflineContentAggregatorFactory_getOfflineContentAggregator();
  }

  public static OfflineContentAggregatorFactory.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.items.OfflineContentAggregatorFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OfflineContentAggregatorFactoryJni();
  }
}
