package org.chromium.components.installedapp;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.BrowserContextHandle;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class InstalledAppProviderImplJni implements InstalledAppProviderImpl.Natives {
  private static InstalledAppProviderImpl.Natives testInstance;

  public static final JniStaticTestMocker<InstalledAppProviderImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.installedapp.InstalledAppProviderImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.installedapp.InstalledAppProviderImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void checkDigitalAssetLinksRelationshipForWebApk(BrowserContextHandle handle,
      String webDomain, String manifestUrl, Callback<Boolean> callback) {
    GEN_JNI.org_chromium_components_installedapp_InstalledAppProviderImpl_checkDigitalAssetLinksRelationshipForWebApk(handle, webDomain, manifestUrl, callback);
  }

  public static InstalledAppProviderImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.installedapp.InstalledAppProviderImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InstalledAppProviderImplJni();
  }
}
