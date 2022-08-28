package org.chromium.components.content_creation.reactions;

import java.lang.Override;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ReactionServiceBridgeJni implements ReactionServiceBridge.Natives {
  private static ReactionServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<ReactionServiceBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<ReactionServiceBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        ReactionServiceBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getReactions(long nativeReactionServiceBridge, ReactionServiceBridge caller,
      Callback<List<ReactionMetadata>> callback) {
    GEN_JNI.org_chromium_components_content_1creation_reactions_ReactionServiceBridge_getReactions(nativeReactionServiceBridge, caller, callback);
  }

  public static ReactionServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_creation.reactions.ReactionServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ReactionServiceBridgeJni();
  }
}
