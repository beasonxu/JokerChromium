package org.chromium.media;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class MediaCodecBridgeJni implements MediaCodecBridge.Natives {
  private static MediaCodecBridge.Natives testInstance;

  public static final JniStaticTestMocker<MediaCodecBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<MediaCodecBridge.Natives>() {
    @Override
    public void setInstanceForTesting(MediaCodecBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onBuffersAvailable(long nativeMediaCodecBridge, MediaCodecBridge caller) {
    GEN_JNI.org_chromium_media_MediaCodecBridge_onBuffersAvailable(nativeMediaCodecBridge, caller);
  }

  public static MediaCodecBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaCodecBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new MediaCodecBridgeJni();
  }
}
