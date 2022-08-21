package org.chromium.components.omnibox;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class AutocompleteResultJni implements AutocompleteResult.Natives {
  private static AutocompleteResult.Natives testInstance;

  public static final JniStaticTestMocker<AutocompleteResult.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.omnibox.AutocompleteResult.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.omnibox.AutocompleteResult.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void groupSuggestionsBySearchVsURL(long nativeAutocompleteResult, int firstIndex,
      int lastIndex) {
    GEN_JNI.org_chromium_components_omnibox_AutocompleteResult_groupSuggestionsBySearchVsURL(nativeAutocompleteResult, firstIndex, lastIndex);
  }

  @Override
  public boolean verifyCoherency(long nativeAutocompleteResult, long[] matches,
      long suggestionIndex, int origin) {
    return (boolean)GEN_JNI.org_chromium_components_omnibox_AutocompleteResult_verifyCoherency(nativeAutocompleteResult, matches, suggestionIndex, origin);
  }

  public static AutocompleteResult.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.omnibox.AutocompleteResult.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutocompleteResultJni();
  }
}
