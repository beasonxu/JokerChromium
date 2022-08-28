package org.chromium.components.content_creation.notes.bridges;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.content_creation.notes.models.NoteTemplate;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NoteServiceBridgeJni implements NoteServiceBridge.Natives {
  private static NoteServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<NoteServiceBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<NoteServiceBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        NoteServiceBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getTemplates(long nativeNoteServiceBridge, NoteServiceBridge caller,
      Callback<List<NoteTemplate>> callback) {
    GEN_JNI.org_chromium_components_content_1creation_notes_bridges_NoteServiceBridge_getTemplates(nativeNoteServiceBridge, caller, callback);
  }

  @Override
  public boolean isPublishAvailable(long nativeNoteServiceBridge, NoteServiceBridge caller) {
    return (boolean)GEN_JNI.org_chromium_components_content_1creation_notes_bridges_NoteServiceBridge_isPublishAvailable(nativeNoteServiceBridge, caller);
  }

  @Override
  public void publishNote(long nativeNoteServiceBridge, NoteServiceBridge caller,
      String selectedText, String shareUrl, Callback<String> callback) {
    GEN_JNI.org_chromium_components_content_1creation_notes_bridges_NoteServiceBridge_publishNote(nativeNoteServiceBridge, caller, selectedText, shareUrl, callback);
  }

  public static NoteServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_creation.notes.bridges.NoteServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NoteServiceBridgeJni();
  }
}
