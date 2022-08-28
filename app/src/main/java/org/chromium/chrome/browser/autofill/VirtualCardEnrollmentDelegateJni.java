package org.chromium.chrome.browser.autofill;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class VirtualCardEnrollmentDelegateJni implements VirtualCardEnrollmentDelegate.Natives {
  private static VirtualCardEnrollmentDelegate.Natives testInstance;

  public static final JniStaticTestMocker<VirtualCardEnrollmentDelegate.Natives> TEST_HOOKS = new JniStaticTestMocker<VirtualCardEnrollmentDelegate.Natives>() {
    @Override
    public void setInstanceForTesting(
        VirtualCardEnrollmentDelegate.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAccepted(long nativeVirtualCardEnrollBubbleControllerImpl) {
    GEN_JNI.org_chromium_chrome_browser_autofill_VirtualCardEnrollmentDelegate_onAccepted(nativeVirtualCardEnrollBubbleControllerImpl);
  }

  @Override
  public void onDeclined(long nativeVirtualCardEnrollBubbleControllerImpl) {
    GEN_JNI.org_chromium_chrome_browser_autofill_VirtualCardEnrollmentDelegate_onDeclined(nativeVirtualCardEnrollBubbleControllerImpl);
  }

  @Override
  public void onDismissed(long nativeVirtualCardEnrollBubbleControllerImpl) {
    GEN_JNI.org_chromium_chrome_browser_autofill_VirtualCardEnrollmentDelegate_onDismissed(nativeVirtualCardEnrollBubbleControllerImpl);
  }

  @Override
  public void onLinkClicked(long nativeVirtualCardEnrollBubbleControllerImpl, String url,
      int virtualCardEnrollmentLinkType) {
    GEN_JNI.org_chromium_chrome_browser_autofill_VirtualCardEnrollmentDelegate_onLinkClicked(nativeVirtualCardEnrollBubbleControllerImpl, url, virtualCardEnrollmentLinkType);
  }

  public static VirtualCardEnrollmentDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.VirtualCardEnrollmentDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VirtualCardEnrollmentDelegateJni();
  }
}
