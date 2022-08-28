package org.chromium.chrome.browser.infobar;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SurveyInfoBarJni implements SurveyInfoBar.Natives {
  private static SurveyInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<SurveyInfoBar.Natives> TEST_HOOKS = new JniStaticTestMocker<SurveyInfoBar.Natives>() {
    @Override
    public void setInstanceForTesting(
        SurveyInfoBar.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void create(WebContents webContents, int displayLogoResId,
      SurveyInfoBarDelegate surveyInfoBarDelegate) {
    GEN_JNI.org_chromium_chrome_browser_infobar_SurveyInfoBar_create(webContents, displayLogoResId, surveyInfoBarDelegate);
  }

  @Override
  public Tab getTab(long nativeSurveyInfoBar, SurveyInfoBar caller) {
    return (Tab)GEN_JNI.org_chromium_chrome_browser_infobar_SurveyInfoBar_getTab(nativeSurveyInfoBar, caller);
  }

  public static SurveyInfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.SurveyInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SurveyInfoBarJni();
  }
}
