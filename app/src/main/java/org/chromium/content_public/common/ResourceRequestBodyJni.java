package org.chromium.content_public.common;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class ResourceRequestBodyJni implements ResourceRequestBody.Natives {
  private static ResourceRequestBody.Natives testInstance;

  public static final JniStaticTestMocker<ResourceRequestBody.Natives> TEST_HOOKS = new JniStaticTestMocker<ResourceRequestBody.Natives>() {
    @Override
    public void setInstanceForTesting(
        ResourceRequestBody.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public byte[] createResourceRequestBodyFromBytes(byte[] httpBody) {
    return (byte[])GEN_JNI.org_chromium_content_1public_common_ResourceRequestBody_createResourceRequestBodyFromBytes(httpBody);
  }

  public static ResourceRequestBody.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.common.ResourceRequestBody.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ResourceRequestBodyJni();
  }
}
