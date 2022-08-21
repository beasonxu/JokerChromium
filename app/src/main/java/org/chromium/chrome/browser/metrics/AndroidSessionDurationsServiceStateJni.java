package org.chromium.chrome.browser.metrics;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@CheckDiscard("crbug.com/993421")
public class AndroidSessionDurationsServiceStateJni implements AndroidSessionDurationsServiceState.Natives {
  private static AndroidSessionDurationsServiceState.Natives testInstance;

  public static final JniStaticTestMocker<AndroidSessionDurationsServiceState.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.metrics.AndroidSessionDurationsServiceState.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.metrics.AndroidSessionDurationsServiceState.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public AndroidSessionDurationsServiceState getAndroidSessionDurationsServiceState(
      Profile profile) {
    return (AndroidSessionDurationsServiceState)GEN_JNI.org_chromium_chrome_browser_metrics_AndroidSessionDurationsServiceState_getAndroidSessionDurationsServiceState(profile);
  }

  @Override
  public void restoreAndroidSessionDurationsServiceState(Profile profile,
      AndroidSessionDurationsServiceState durationService) {
    GEN_JNI.org_chromium_chrome_browser_metrics_AndroidSessionDurationsServiceState_restoreAndroidSessionDurationsServiceState(profile, durationService);
  }

  public static AndroidSessionDurationsServiceState.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.metrics.AndroidSessionDurationsServiceState.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AndroidSessionDurationsServiceStateJni();
  }
}
