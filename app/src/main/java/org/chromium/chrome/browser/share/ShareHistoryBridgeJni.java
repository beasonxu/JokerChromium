package org.chromium.chrome.browser.share;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class ShareHistoryBridgeJni implements ShareHistoryBridge.Natives {
  private static ShareHistoryBridge.Natives testInstance;

  public static final JniStaticTestMocker<ShareHistoryBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<ShareHistoryBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        ShareHistoryBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void addShareEntry(Profile profile, String string) {
    GEN_JNI.org_chromium_chrome_browser_share_ShareHistoryBridge_addShareEntry(profile, string);
  }

  @Override
  public void clear(Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_share_ShareHistoryBridge_clear(profile);
  }

  public static ShareHistoryBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.ShareHistoryBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ShareHistoryBridgeJni();
  }
}
