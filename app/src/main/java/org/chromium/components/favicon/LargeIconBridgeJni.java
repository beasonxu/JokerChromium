package org.chromium.components.favicon;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.BrowserContextHandle;
import org.chromium.url.GURL;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class LargeIconBridgeJni implements LargeIconBridge.Natives {
  private static LargeIconBridge.Natives testInstance;

  public static final JniStaticTestMocker<LargeIconBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<LargeIconBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        LargeIconBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init() {
    return (long)GEN_JNI.org_chromium_components_favicon_LargeIconBridge_init();
  }

  @Override
  public void destroy(long nativeLargeIconBridge) {
    GEN_JNI.org_chromium_components_favicon_LargeIconBridge_destroy(nativeLargeIconBridge);
  }

  @Override
  public boolean getLargeIconForURL(long nativeLargeIconBridge,
      BrowserContextHandle browserContextHandle, GURL pageUrl, int desiredSizePx,
      LargeIconBridge.LargeIconCallback callback) {
    return (boolean)GEN_JNI.org_chromium_components_favicon_LargeIconBridge_getLargeIconForURL(nativeLargeIconBridge, browserContextHandle, pageUrl, desiredSizePx, callback);
  }

  public static LargeIconBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.favicon.LargeIconBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LargeIconBridgeJni();
  }
}