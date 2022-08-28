package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class GURLUtilsJni implements GURLUtils.Natives {
  private static GURLUtils.Natives testInstance;

  public static final JniStaticTestMocker<GURLUtils.Natives> TEST_HOOKS = new JniStaticTestMocker<GURLUtils.Natives>() {
    @Override
    public void setInstanceForTesting(GURLUtils.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getOrigin(String url) {
    return (String)GEN_JNI.org_chromium_net_GURLUtils_getOrigin(url);
  }

  public static GURLUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.GURLUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GURLUtilsJni();
  }
}
