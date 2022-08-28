package org.chromium.components.permissions;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PermissionDialogDelegateJni implements PermissionDialogDelegate.Natives {
  private static PermissionDialogDelegate.Natives testInstance;

  public static final JniStaticTestMocker<PermissionDialogDelegate.Natives> TEST_HOOKS = new JniStaticTestMocker<PermissionDialogDelegate.Natives>() {
    @Override
    public void setInstanceForTesting(
        PermissionDialogDelegate.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void accept(long nativePermissionDialogDelegate, PermissionDialogDelegate caller) {
    GEN_JNI.org_chromium_components_permissions_PermissionDialogDelegate_accept(nativePermissionDialogDelegate, caller);
  }

  @Override
  public void cancel(long nativePermissionDialogDelegate, PermissionDialogDelegate caller) {
    GEN_JNI.org_chromium_components_permissions_PermissionDialogDelegate_cancel(nativePermissionDialogDelegate, caller);
  }

  @Override
  public void dismissed(long nativePermissionDialogDelegate, PermissionDialogDelegate caller) {
    GEN_JNI.org_chromium_components_permissions_PermissionDialogDelegate_dismissed(nativePermissionDialogDelegate, caller);
  }

  @Override
  public void destroy(long nativePermissionDialogDelegate, PermissionDialogDelegate caller) {
    GEN_JNI.org_chromium_components_permissions_PermissionDialogDelegate_destroy(nativePermissionDialogDelegate, caller);
  }

  @Override
  public int getRequestTypeEnumSize() {
    return (int)GEN_JNI.org_chromium_components_permissions_PermissionDialogDelegate_getRequestTypeEnumSize();
  }

  public static PermissionDialogDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.permissions.PermissionDialogDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PermissionDialogDelegateJni();
  }
}
