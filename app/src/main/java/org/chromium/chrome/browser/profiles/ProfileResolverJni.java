package org.chromium.chrome.browser.profiles;

import java.lang.Override;
import java.lang.String;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class ProfileResolverJni implements ProfileResolver.Natives {
  private static ProfileResolver.Natives testInstance;

  public static final JniStaticTestMocker<ProfileResolver.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.profiles.ProfileResolver.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.profiles.ProfileResolver.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String tokenizeProfile(Profile profile) {
    return (String)GEN_JNI.org_chromium_chrome_browser_profiles_ProfileResolver_tokenizeProfile(profile);
  }

  @Override
  public String tokenizeProfileKey(ProfileKey profileKey) {
    return (String)GEN_JNI.org_chromium_chrome_browser_profiles_ProfileResolver_tokenizeProfileKey(profileKey);
  }

  @Override
  public void resolveProfile(String token, Callback<Profile> callback) {
    GEN_JNI.org_chromium_chrome_browser_profiles_ProfileResolver_resolveProfile(token, callback);
  }

  @Override
  public void resolveProfileKey(String token, Callback<ProfileKey> callback) {
    GEN_JNI.org_chromium_chrome_browser_profiles_ProfileResolver_resolveProfileKey(token, callback);
  }

  public static ProfileResolver.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.profiles.ProfileResolver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProfileResolverJni();
  }
}
