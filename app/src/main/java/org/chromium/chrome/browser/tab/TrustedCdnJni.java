package org.chromium.chrome.browser.tab;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class TrustedCdnJni implements TrustedCdn.Natives {
  private static TrustedCdn.Natives testInstance;

  public static final JniStaticTestMocker<TrustedCdn.Natives> TEST_HOOKS = new JniStaticTestMocker<TrustedCdn.Natives>() {
    @Override
    public void setInstanceForTesting(TrustedCdn.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TrustedCdn caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_tab_TrustedCdn_init(caller);
  }

  @Override
  public void onDestroyed(long nativeTrustedCdn, TrustedCdn caller) {
    GEN_JNI.org_chromium_chrome_browser_tab_TrustedCdn_onDestroyed(nativeTrustedCdn, caller);
  }

  @Override
  public void setWebContents(long nativeTrustedCdn, TrustedCdn caller, WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_tab_TrustedCdn_setWebContents(nativeTrustedCdn, caller, webContents);
  }

  @Override
  public void resetWebContents(long nativeTrustedCdn, TrustedCdn caller) {
    GEN_JNI.org_chromium_chrome_browser_tab_TrustedCdn_resetWebContents(nativeTrustedCdn, caller);
  }

  public static TrustedCdn.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TrustedCdn.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TrustedCdnJni();
  }
}