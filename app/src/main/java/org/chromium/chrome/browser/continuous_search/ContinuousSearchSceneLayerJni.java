package org.chromium.chrome.browser.continuous_search;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.ui.resources.ResourceManager;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ContinuousSearchSceneLayerJni implements ContinuousSearchSceneLayer.Natives {
  private static ContinuousSearchSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<ContinuousSearchSceneLayer.Natives> TEST_HOOKS = new JniStaticTestMocker<ContinuousSearchSceneLayer.Natives>() {
    @Override
    public void setInstanceForTesting(
        ContinuousSearchSceneLayer.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContinuousSearchSceneLayer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_continuous_1search_ContinuousSearchSceneLayer_init(caller);
  }

  @Override
  public void setContentTree(long nativeContinuousSearchSceneLayer, SceneLayer contentTree) {
    GEN_JNI.org_chromium_chrome_browser_continuous_1search_ContinuousSearchSceneLayer_setContentTree(nativeContinuousSearchSceneLayer, contentTree);
  }

  @Override
  public void updateContinuousSearchLayer(long nativeContinuousSearchSceneLayer,
      ResourceManager resourceManager, int viewResourceId, int offset, boolean shadowVisible,
      int shadowHeight) {
    GEN_JNI.org_chromium_chrome_browser_continuous_1search_ContinuousSearchSceneLayer_updateContinuousSearchLayer(nativeContinuousSearchSceneLayer, resourceManager, viewResourceId, offset, shadowVisible, shadowHeight);
  }

  public static ContinuousSearchSceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.continuous_search.ContinuousSearchSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContinuousSearchSceneLayerJni();
  }
}
