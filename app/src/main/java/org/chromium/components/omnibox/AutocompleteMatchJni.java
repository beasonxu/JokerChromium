package org.chromium.components.omnibox;

import java.lang.Override;
import java.lang.Runnable;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AutocompleteMatchJni implements AutocompleteMatch.Natives {
  private static AutocompleteMatch.Natives testInstance;

  public static final JniStaticTestMocker<AutocompleteMatch.Natives> TEST_HOOKS = new JniStaticTestMocker<AutocompleteMatch.Natives>() {
    @Override
    public void setInstanceForTesting(
        AutocompleteMatch.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void updateWithClipboardContent(long nativeAutocompleteMatch, Runnable callback) {
    GEN_JNI.org_chromium_components_omnibox_AutocompleteMatch_updateWithClipboardContent(nativeAutocompleteMatch, callback);
  }

  public static AutocompleteMatch.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.omnibox.AutocompleteMatch.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutocompleteMatchJni();
  }
}
