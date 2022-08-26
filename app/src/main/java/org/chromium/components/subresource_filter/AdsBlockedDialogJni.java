package org.chromium.components.subresource_filter;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AdsBlockedDialogJni implements AdsBlockedDialog.Natives {
  private static AdsBlockedDialog.Natives testInstance;

  public static final JniStaticTestMocker<AdsBlockedDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.subresource_filter.AdsBlockedDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.subresource_filter.AdsBlockedDialog.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAllowAdsClicked(long nativeAdsBlockedDialog) {
    GEN_JNI.org_chromium_components_subresource_1filter_AdsBlockedDialog_onAllowAdsClicked(nativeAdsBlockedDialog);
  }

  @Override
  public void onLearnMoreClicked(long nativeAdsBlockedDialog) {
    GEN_JNI.org_chromium_components_subresource_1filter_AdsBlockedDialog_onLearnMoreClicked(nativeAdsBlockedDialog);
  }

  @Override
  public void onDismissed(long nativeAdsBlockedDialog) {
    GEN_JNI.org_chromium_components_subresource_1filter_AdsBlockedDialog_onDismissed(nativeAdsBlockedDialog);
  }

  public static AdsBlockedDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.subresource_filter.AdsBlockedDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AdsBlockedDialogJni();
  }
}
