package org.chromium.net;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NetworkActiveNotifierJni implements NetworkActiveNotifier.Natives {
  private static NetworkActiveNotifier.Natives testInstance;

  public static final JniStaticTestMocker<NetworkActiveNotifier.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.NetworkActiveNotifier.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.NetworkActiveNotifier.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyOfDefaultNetworkActive(long nativePtr) {
    GEN_JNI.org_chromium_net_NetworkActiveNotifier_notifyOfDefaultNetworkActive(nativePtr);
  }

  public static NetworkActiveNotifier.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.NetworkActiveNotifier.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NetworkActiveNotifierJni();
  }
}
