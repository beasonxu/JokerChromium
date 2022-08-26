package org.chromium.chrome.browser.compositor.scene_layer;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ToolbarSwipeSceneLayerJni implements ToolbarSwipeSceneLayer.Natives {
  private static ToolbarSwipeSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<ToolbarSwipeSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.ToolbarSwipeSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.ToolbarSwipeSceneLayer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ToolbarSwipeSceneLayer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_ToolbarSwipeSceneLayer_init(caller);
  }

  @Override
  public void setTabContentManager(long nativeToolbarSwipeSceneLayer, ToolbarSwipeSceneLayer caller,
      TabContentManager tabContentManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_ToolbarSwipeSceneLayer_setTabContentManager(nativeToolbarSwipeSceneLayer, caller, tabContentManager);
  }

  @Override
  public void updateLayer(long nativeToolbarSwipeSceneLayer, ToolbarSwipeSceneLayer caller, int id,
      boolean leftTab, boolean canUseLiveLayer, int defaultBackgroundColor, float x, float y) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_ToolbarSwipeSceneLayer_updateLayer(nativeToolbarSwipeSceneLayer, caller, id, leftTab, canUseLiveLayer, defaultBackgroundColor, x, y);
  }

  public static ToolbarSwipeSceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.ToolbarSwipeSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ToolbarSwipeSceneLayerJni();
  }
}
