package org.chromium.content.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.webcontents.WebContentsImpl;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class GestureListenerManagerImplJni implements GestureListenerManagerImpl.Natives {
  private static GestureListenerManagerImpl.Natives testInstance;

  public static final JniStaticTestMocker<GestureListenerManagerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<GestureListenerManagerImpl.Natives>() {
    @Override
    public void setInstanceForTesting(
        GestureListenerManagerImpl.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(GestureListenerManagerImpl caller, WebContentsImpl webContents) {
    return (long)GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_init(caller, webContents);
  }

  @Override
  public void resetGestureDetection(long nativeGestureListenerManager,
      GestureListenerManagerImpl caller) {
    GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_resetGestureDetection(nativeGestureListenerManager, caller);
  }

  @Override
  public void setDoubleTapSupportEnabled(long nativeGestureListenerManager,
      GestureListenerManagerImpl caller, boolean enabled) {
    GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_setDoubleTapSupportEnabled(nativeGestureListenerManager, caller, enabled);
  }

  @Override
  public void setMultiTouchZoomSupportEnabled(long nativeGestureListenerManager,
      GestureListenerManagerImpl caller, boolean enabled) {
    GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_setMultiTouchZoomSupportEnabled(nativeGestureListenerManager, caller, enabled);
  }

  @Override
  public void setHasListenersAttached(long nativeGestureListenerManager, boolean hasListeners) {
    GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_setHasListenersAttached(nativeGestureListenerManager, hasListeners);
  }

  public static GestureListenerManagerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.GestureListenerManagerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GestureListenerManagerImplJni();
  }
}
