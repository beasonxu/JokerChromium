package org.chromium.chrome.browser.share;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class ShareRankingBridgeJni implements ShareRankingBridge.Natives {
  private static ShareRankingBridge.Natives testInstance;

  public static final JniStaticTestMocker<ShareRankingBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<ShareRankingBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        ShareRankingBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void rank(Profile profile, String type, Object[] available, int fold, int length,
      boolean persist, Callback<String[]> onDone) {
    GEN_JNI.org_chromium_chrome_browser_share_ShareRankingBridge_rank(profile, type, available, fold, length, persist, onDone);
  }

  public static ShareRankingBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.ShareRankingBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ShareRankingBridgeJni();
  }
}
