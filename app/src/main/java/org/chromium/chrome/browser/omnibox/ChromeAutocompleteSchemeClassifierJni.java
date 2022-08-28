package org.chromium.chrome.browser.omnibox;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class ChromeAutocompleteSchemeClassifierJni implements ChromeAutocompleteSchemeClassifier.Natives {
  private static ChromeAutocompleteSchemeClassifier.Natives testInstance;

  public static final JniStaticTestMocker<ChromeAutocompleteSchemeClassifier.Natives> TEST_HOOKS = new JniStaticTestMocker<ChromeAutocompleteSchemeClassifier.Natives>() {
    @Override
    public void setInstanceForTesting(
        ChromeAutocompleteSchemeClassifier.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createAutocompleteClassifier(Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_omnibox_ChromeAutocompleteSchemeClassifier_createAutocompleteClassifier(profile);
  }

  @Override
  public void deleteAutocompleteClassifier(long chromeAutocompleteSchemeClassifier) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_ChromeAutocompleteSchemeClassifier_deleteAutocompleteClassifier(chromeAutocompleteSchemeClassifier);
  }

  public static ChromeAutocompleteSchemeClassifier.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.omnibox.ChromeAutocompleteSchemeClassifier.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeAutocompleteSchemeClassifierJni();
  }
}
