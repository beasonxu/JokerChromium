package org.chromium.chrome.browser.optimization_guide;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class OptimizationGuideBridgeJni implements OptimizationGuideBridge.Natives {
  private static OptimizationGuideBridge.Natives testInstance;

  public static final JniStaticTestMocker<OptimizationGuideBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<OptimizationGuideBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        OptimizationGuideBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init() {
    return (long)GEN_JNI.org_chromium_chrome_browser_optimization_1guide_OptimizationGuideBridge_init();
  }

  @Override
  public void destroy(long nativeOptimizationGuideBridge) {
    GEN_JNI.org_chromium_chrome_browser_optimization_1guide_OptimizationGuideBridge_destroy(nativeOptimizationGuideBridge);
  }

  @Override
  public void registerOptimizationTypes(long nativeOptimizationGuideBridge,
      int[] optimizationTypes) {
    GEN_JNI.org_chromium_chrome_browser_optimization_1guide_OptimizationGuideBridge_registerOptimizationTypes(nativeOptimizationGuideBridge, optimizationTypes);
  }

  @Override
  public void canApplyOptimizationAsync(long nativeOptimizationGuideBridge, GURL url,
      int optimizationType, OptimizationGuideBridge.OptimizationGuideCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_optimization_1guide_OptimizationGuideBridge_canApplyOptimizationAsync(nativeOptimizationGuideBridge, url, optimizationType, callback);
  }

  @Override
  public void canApplyOptimization(long nativeOptimizationGuideBridge, GURL url,
      int optimizationType, OptimizationGuideBridge.OptimizationGuideCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_optimization_1guide_OptimizationGuideBridge_canApplyOptimization(nativeOptimizationGuideBridge, url, optimizationType, callback);
  }

  @Override
  public void onNewPushNotification(long nativeOptimizationGuideBridge,
      byte[] encodedNotification) {
    GEN_JNI.org_chromium_chrome_browser_optimization_1guide_OptimizationGuideBridge_onNewPushNotification(nativeOptimizationGuideBridge, encodedNotification);
  }

  @Override
  public void onDeferredStartup(long nativeOptimizationGuideBridge) {
    GEN_JNI.org_chromium_chrome_browser_optimization_1guide_OptimizationGuideBridge_onDeferredStartup(nativeOptimizationGuideBridge);
  }

  public static OptimizationGuideBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OptimizationGuideBridgeJni();
  }
}
