package org.chromium.components.page_info;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ConnectionInfoViewJni implements ConnectionInfoView.Natives {
  private static ConnectionInfoView.Natives testInstance;

  public static final JniStaticTestMocker<ConnectionInfoView.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.page_info.ConnectionInfoView.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.page_info.ConnectionInfoView.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ConnectionInfoView popup, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_components_page_1info_ConnectionInfoView_init(popup, webContents);
  }

  @Override
  public void destroy(long nativeConnectionInfoViewAndroid, ConnectionInfoView caller) {
    GEN_JNI.org_chromium_components_page_1info_ConnectionInfoView_destroy(nativeConnectionInfoViewAndroid, caller);
  }

  @Override
  public void resetCertDecisions(long nativeConnectionInfoViewAndroid, ConnectionInfoView caller,
      WebContents webContents) {
    GEN_JNI.org_chromium_components_page_1info_ConnectionInfoView_resetCertDecisions(nativeConnectionInfoViewAndroid, caller, webContents);
  }

  public static ConnectionInfoView.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.page_info.ConnectionInfoView.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ConnectionInfoViewJni();
  }
}
