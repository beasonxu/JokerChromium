package org.chromium.components.content_settings;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.BrowserContextHandle;

@CheckDiscard("crbug.com/993421")
class ContentSettingsObserverJni implements ContentSettingsObserver.Natives {
  private static ContentSettingsObserver.Natives testInstance;

  public static final JniStaticTestMocker<ContentSettingsObserver.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.content_settings.ContentSettingsObserver.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.content_settings.ContentSettingsObserver.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContentSettingsObserver caller, BrowserContextHandle contextHandle) {
    return (long)GEN_JNI.org_chromium_components_content_1settings_ContentSettingsObserver_init(caller, contextHandle);
  }

  @Override
  public void destroy(long nativeAndroidObserver, ContentSettingsObserver caller) {
    GEN_JNI.org_chromium_components_content_1settings_ContentSettingsObserver_destroy(nativeAndroidObserver, caller);
  }

  public static ContentSettingsObserver.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_settings.ContentSettingsObserver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContentSettingsObserverJni();
  }
}
