package org.chromium.chrome.browser.translate;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.language.settings.LanguageItem;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class TranslateBridgeJni implements TranslateBridge.Natives {
  private static TranslateBridge.Natives testInstance;

  public static final JniStaticTestMocker<TranslateBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<TranslateBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        TranslateBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void manualTranslateWhenReady(WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_manualTranslateWhenReady(webContents);
  }

  @Override
  public void translateToLanguage(WebContents webContents, String targetLanguageCode) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_translateToLanguage(webContents, targetLanguageCode);
  }

  @Override
  public boolean canManuallyTranslate(WebContents webContents, boolean menuLogging) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_canManuallyTranslate(webContents, menuLogging);
  }

  @Override
  public boolean shouldShowManualTranslateIPH(WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_shouldShowManualTranslateIPH(webContents);
  }

  @Override
  public void setPredefinedTargetLanguage(WebContents webContents, String targetLanguage) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_setPredefinedTargetLanguage(webContents, targetLanguage);
  }

  @Override
  public String getSourceLanguage(WebContents webContents) {
    return (String)GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getSourceLanguage(webContents);
  }

  @Override
  public String getCurrentLanguage(WebContents webContents) {
    return (String)GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getCurrentLanguage(webContents);
  }

  @Override
  public String getTargetLanguage() {
    return (String)GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getTargetLanguage();
  }

  @Override
  public void setDefaultTargetLanguage(String targetLanguage) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_setDefaultTargetLanguage(targetLanguage);
  }

  @Override
  public String[] getModelLanguages() {
    return (String[])GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getModelLanguages();
  }

  @Override
  public void resetAcceptLanguages(String defaultLocale) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_resetAcceptLanguages(defaultLocale);
  }

  @Override
  public void getChromeAcceptLanguages(List<LanguageItem> list) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getChromeAcceptLanguages(list);
  }

  @Override
  public String[] getUserAcceptLanguages() {
    return (String[])GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getUserAcceptLanguages();
  }

  @Override
  public String[] getAlwaysTranslateLanguages() {
    return (String[])GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getAlwaysTranslateLanguages();
  }

  @Override
  public String[] getNeverTranslateLanguages() {
    return (String[])GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getNeverTranslateLanguages();
  }

  @Override
  public void setLanguageAlwaysTranslateState(String language, boolean alwaysTranslate) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_setLanguageAlwaysTranslateState(language, alwaysTranslate);
  }

  @Override
  public void updateUserAcceptLanguages(String language, boolean add) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_updateUserAcceptLanguages(language, add);
  }

  @Override
  public void moveAcceptLanguage(String language, int offset) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_moveAcceptLanguage(language, offset);
  }

  @Override
  public void setLanguageOrder(String[] codes) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_setLanguageOrder(codes);
  }

  @Override
  public boolean isBlockedLanguage(String language) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_isBlockedLanguage(language);
  }

  @Override
  public void setLanguageBlockedState(String language, boolean blocked) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_setLanguageBlockedState(language, blocked);
  }

  @Override
  public boolean getExplicitLanguageAskPromptShown() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getExplicitLanguageAskPromptShown();
  }

  @Override
  public void setExplicitLanguageAskPromptShown(boolean shown) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_setExplicitLanguageAskPromptShown(shown);
  }

  @Override
  public boolean getAppLanguagePromptShown() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_getAppLanguagePromptShown();
  }

  @Override
  public void setAppLanguagePromptShown() {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_setAppLanguagePromptShown();
  }

  @Override
  public void setIgnoreMissingKeyForTesting(boolean ignore) {
    GEN_JNI.org_chromium_chrome_browser_translate_TranslateBridge_setIgnoreMissingKeyForTesting(ignore);
  }

  public static TranslateBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.translate.TranslateBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TranslateBridgeJni();
  }
}
