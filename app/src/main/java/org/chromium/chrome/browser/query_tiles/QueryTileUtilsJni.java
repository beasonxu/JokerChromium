package org.chromium.chrome.browser.query_tiles;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class QueryTileUtilsJni implements QueryTileUtils.Natives {
  private static QueryTileUtils.Natives testInstance;

  public static final JniStaticTestMocker<QueryTileUtils.Natives> TEST_HOOKS = new JniStaticTestMocker<QueryTileUtils.Natives>() {
    @Override
    public void setInstanceForTesting(
        QueryTileUtils.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isQueryTilesEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_query_1tiles_QueryTileUtils_isQueryTilesEnabled();
  }

  public static QueryTileUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.query_tiles.QueryTileUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new QueryTileUtilsJni();
  }
}
