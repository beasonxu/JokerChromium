package org.chromium.components.download;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NetworkStatusListenerAndroidJni implements NetworkStatusListenerAndroid.Natives {
  private static NetworkStatusListenerAndroid.Natives testInstance;

  public static final JniStaticTestMocker<NetworkStatusListenerAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.download.NetworkStatusListenerAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.download.NetworkStatusListenerAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onNetworkStatusReady(long nativeNetworkStatusListenerAndroid,
      NetworkStatusListenerAndroid caller, int connectionType) {
    GEN_JNI.org_chromium_components_download_NetworkStatusListenerAndroid_onNetworkStatusReady(nativeNetworkStatusListenerAndroid, caller, connectionType);
  }

  @Override
  public void notifyNetworkChange(long nativeNetworkStatusListenerAndroid,
      NetworkStatusListenerAndroid caller, int connectionType) {
    GEN_JNI.org_chromium_components_download_NetworkStatusListenerAndroid_notifyNetworkChange(nativeNetworkStatusListenerAndroid, caller, connectionType);
  }

  public static NetworkStatusListenerAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.download.NetworkStatusListenerAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NetworkStatusListenerAndroidJni();
  }
}
