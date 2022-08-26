package org.chromium.chrome.browser.omnibox.suggestions;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class AutocompleteControllerJni implements AutocompleteController.Natives {
  private static AutocompleteController.Natives testInstance;

  public static final JniStaticTestMocker<AutocompleteController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void start(long nativeAutocompleteControllerAndroid, String text, int cursorPosition,
      String desiredTld, String currentUrl, int pageClassification,
      boolean preventInlineAutocomplete, boolean preferKeyword, boolean allowExactKeywordMatch,
      boolean wantAsynchronousMatches) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_start(nativeAutocompleteControllerAndroid, text, cursorPosition, desiredTld, currentUrl, pageClassification, preventInlineAutocomplete, preferKeyword, allowExactKeywordMatch, wantAsynchronousMatches);
  }

  @Override
  public AutocompleteMatch classify(long nativeAutocompleteControllerAndroid, String text,
      boolean focusedFromFakebox) {
    return (AutocompleteMatch)GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_classify(nativeAutocompleteControllerAndroid, text, focusedFromFakebox);
  }

  @Override
  public void stop(long nativeAutocompleteControllerAndroid, boolean clearResults) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_stop(nativeAutocompleteControllerAndroid, clearResults);
  }

  @Override
  public void resetSession(long nativeAutocompleteControllerAndroid) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_resetSession(nativeAutocompleteControllerAndroid);
  }

  @Override
  public void onSuggestionSelected(long nativeAutocompleteControllerAndroid, int matchIndex,
      int disposition, String currentPageUrl, int pageClassification, long elapsedTimeSinceModified,
      int completedLength, WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_onSuggestionSelected(nativeAutocompleteControllerAndroid, matchIndex, disposition, currentPageUrl, pageClassification, elapsedTimeSinceModified, completedLength, webContents);
  }

  @Override
  public void onOmniboxFocused(long nativeAutocompleteControllerAndroid, String omniboxText,
      String currentUrl, int pageClassification, String currentTitle) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_onOmniboxFocused(nativeAutocompleteControllerAndroid, omniboxText, currentUrl, pageClassification, currentTitle);
  }

  @Override
  public void deleteMatchElement(long nativeAutocompleteControllerAndroid, int matchIndex,
      int elementIndex) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_deleteMatchElement(nativeAutocompleteControllerAndroid, matchIndex, elementIndex);
  }

  @Override
  public void deleteMatch(long nativeAutocompleteControllerAndroid, int matchIndex) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_deleteMatch(nativeAutocompleteControllerAndroid, matchIndex);
  }

  @Override
  public GURL updateMatchDestinationURLWithAdditionalAssistedQueryStats(
      long nativeAutocompleteControllerAndroid, int matchIndex, long elapsedTimeSinceInputChange,
      String newQueryText, String[] newQueryParams) {
    return (GURL)GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_updateMatchDestinationURLWithAdditionalAssistedQueryStats(nativeAutocompleteControllerAndroid, matchIndex, elapsedTimeSinceInputChange, newQueryText, newQueryParams);
  }

  @Override
  public Tab getMatchingTabForSuggestion(long nativeAutocompleteControllerAndroid, int matchIndex) {
    return (Tab)GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_getMatchingTabForSuggestion(nativeAutocompleteControllerAndroid, matchIndex);
  }

  @Override
  public void setVoiceMatches(long nativeAutocompleteControllerAndroid, String[] matches,
      float[] confidenceScores) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_setVoiceMatches(nativeAutocompleteControllerAndroid, matches, confidenceScores);
  }

  @Override
  public void startPrefetch(long nativeAutocompleteControllerAndroid) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_startPrefetch(nativeAutocompleteControllerAndroid);
  }

  @Override
  public AutocompleteController getForProfile(Profile profile) {
    return (AutocompleteController)GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_getForProfile(profile);
  }

  public static AutocompleteController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutocompleteControllerJni();
  }
}
