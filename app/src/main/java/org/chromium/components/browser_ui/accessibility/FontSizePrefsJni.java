package org.chromium.components.browser_ui.accessibility;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.BrowserContextHandle;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class FontSizePrefsJni implements FontSizePrefs.Natives {
  private static FontSizePrefs.Natives testInstance;

  public static final JniStaticTestMocker<FontSizePrefs.Natives> TEST_HOOKS = new JniStaticTestMocker<FontSizePrefs.Natives>() {
    @Override
    public void setInstanceForTesting(
        FontSizePrefs.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FontSizePrefs caller, BrowserContextHandle browserContextHandle) {
    return (long)GEN_JNI.org_chromium_components_browser_1ui_accessibility_FontSizePrefs_init(caller, browserContextHandle);
  }

  @Override
  public void destroy(long nativeFontSizePrefsAndroid) {
    GEN_JNI.org_chromium_components_browser_1ui_accessibility_FontSizePrefs_destroy(nativeFontSizePrefsAndroid);
  }

  @Override
  public void setFontScaleFactor(long nativeFontSizePrefsAndroid, FontSizePrefs caller,
      float fontScaleFactor) {
    GEN_JNI.org_chromium_components_browser_1ui_accessibility_FontSizePrefs_setFontScaleFactor(nativeFontSizePrefsAndroid, caller, fontScaleFactor);
  }

  @Override
  public float getFontScaleFactor(long nativeFontSizePrefsAndroid, FontSizePrefs caller) {
    return (float)GEN_JNI.org_chromium_components_browser_1ui_accessibility_FontSizePrefs_getFontScaleFactor(nativeFontSizePrefsAndroid, caller);
  }

  @Override
  public boolean getForceEnableZoom(long nativeFontSizePrefsAndroid, FontSizePrefs caller) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_accessibility_FontSizePrefs_getForceEnableZoom(nativeFontSizePrefsAndroid, caller);
  }

  @Override
  public void setForceEnableZoom(long nativeFontSizePrefsAndroid, FontSizePrefs caller,
      boolean enabled) {
    GEN_JNI.org_chromium_components_browser_1ui_accessibility_FontSizePrefs_setForceEnableZoom(nativeFontSizePrefsAndroid, caller, enabled);
  }

  public static FontSizePrefs.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.browser_ui.accessibility.FontSizePrefs.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FontSizePrefsJni();
  }
}
