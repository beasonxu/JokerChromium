package org.chromium.chrome.browser.privacy.settings;

import java.lang.Override;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
public class PrivacyPreferencesManagerImplJni implements PrivacyPreferencesManagerImpl.Natives {
  private static PrivacyPreferencesManagerImpl.Natives testInstance;

  public static final JniStaticTestMocker<PrivacyPreferencesManagerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.privacy.settings.PrivacyPreferencesManagerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.privacy.settings.PrivacyPreferencesManagerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isMetricsReportingEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManagerImpl_isMetricsReportingEnabled();
  }

  @Override
  public void setMetricsReportingEnabled(boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManagerImpl_setMetricsReportingEnabled(enabled);
  }

  @Override
  public boolean isMetricsReportingDisabledByPolicy() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManagerImpl_isMetricsReportingDisabledByPolicy();
  }

  public static PrivacyPreferencesManagerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.privacy.settings.PrivacyPreferencesManagerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrivacyPreferencesManagerImplJni();
  }
}
