package org.chromium.chrome.browser.feed;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class FeedProcessScopeDependencyProviderJni implements FeedProcessScopeDependencyProvider.Natives {
  private static FeedProcessScopeDependencyProvider.Natives testInstance;

  public static final JniStaticTestMocker<FeedProcessScopeDependencyProvider.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.FeedProcessScopeDependencyProvider.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.FeedProcessScopeDependencyProvider.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int[] getExperimentIds() {
    return (int[])GEN_JNI.org_chromium_chrome_browser_feed_FeedProcessScopeDependencyProvider_getExperimentIds();
  }

  @Override
  public String getSessionId() {
    return (String)GEN_JNI.org_chromium_chrome_browser_feed_FeedProcessScopeDependencyProvider_getSessionId();
  }

  @Override
  public void processViewAction(byte[] actionData, byte[] loggingParameters) {
    GEN_JNI.org_chromium_chrome_browser_feed_FeedProcessScopeDependencyProvider_processViewAction(actionData, loggingParameters);
  }

  public static FeedProcessScopeDependencyProvider.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.FeedProcessScopeDependencyProvider.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedProcessScopeDependencyProviderJni();
  }
}
