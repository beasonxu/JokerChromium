package org.chromium.chrome.browser.content_creation.notes;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.content_creation.notes.NoteService;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NoteServiceFactoryJni implements NoteServiceFactory.Natives {
  private static NoteServiceFactory.Natives testInstance;

  public static final JniStaticTestMocker<NoteServiceFactory.Natives> TEST_HOOKS = new JniStaticTestMocker<NoteServiceFactory.Natives>() {
    @Override
    public void setInstanceForTesting(
        NoteServiceFactory.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public NoteService getForProfile(Profile profile) {
    return (NoteService)GEN_JNI.org_chromium_chrome_browser_content_1creation_notes_NoteServiceFactory_getForProfile(profile);
  }

  public static NoteServiceFactory.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.content_creation.notes.NoteServiceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NoteServiceFactoryJni();
  }
}
