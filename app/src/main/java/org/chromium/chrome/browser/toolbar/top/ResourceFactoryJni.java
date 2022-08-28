package org.chromium.chrome.browser.toolbar.top;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ResourceFactoryJni implements ResourceFactory.Natives {
  private static ResourceFactory.Natives testInstance;

  public static final JniStaticTestMocker<ResourceFactory.Natives> TEST_HOOKS = new JniStaticTestMocker<ResourceFactory.Natives>() {
    @Override
    public void setInstanceForTesting(
        ResourceFactory.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createToolbarContainerResource(int toolbarLeft, int toolbarTop, int toolbarRight,
      int toolbarBottom, int locationBarLeft, int locationBarTop, int locationBarRight,
      int locationBarBottom, int shadowHeight) {
    return (long)GEN_JNI.org_chromium_chrome_browser_toolbar_top_ResourceFactory_createToolbarContainerResource(toolbarLeft, toolbarTop, toolbarRight, toolbarBottom, locationBarLeft, locationBarTop, locationBarRight, locationBarBottom, shadowHeight);
  }

  public static ResourceFactory.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.toolbar.top.ResourceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ResourceFactoryJni();
  }
}
