package org.chromium.chrome.browser.privacy_sandbox;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class PrivacySandboxBridgeJni implements PrivacySandboxBridge.Natives {
  private static PrivacySandboxBridge.Natives testInstance;

  public static final JniStaticTestMocker<PrivacySandboxBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<PrivacySandboxBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        PrivacySandboxBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isPrivacySandboxEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_isPrivacySandboxEnabled();
  }

  @Override
  public boolean isPrivacySandboxManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_isPrivacySandboxManaged();
  }

  @Override
  public boolean isPrivacySandboxRestricted() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_isPrivacySandboxRestricted();
  }

  @Override
  public void setPrivacySandboxEnabled(boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_setPrivacySandboxEnabled(enabled);
  }

  @Override
  public boolean isFlocEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_isFlocEnabled();
  }

  @Override
  public void setFlocEnabled(boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_setFlocEnabled(enabled);
  }

  @Override
  public boolean isFlocIdResettable() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_isFlocIdResettable();
  }

  @Override
  public void resetFlocId() {
    GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_resetFlocId();
  }

  @Override
  public String getFlocStatusString() {
    return (String)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_getFlocStatusString();
  }

  @Override
  public String getFlocGroupString() {
    return (String)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_getFlocGroupString();
  }

  @Override
  public String getFlocUpdateString() {
    return (String)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_getFlocUpdateString();
  }

  @Override
  public String getFlocDescriptionString() {
    return (String)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_getFlocDescriptionString();
  }

  @Override
  public String getFlocResetExplanationString() {
    return (String)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_getFlocResetExplanationString();
  }

  @Override
  public Topic[] getCurrentTopTopics() {
    return (Topic[])GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_getCurrentTopTopics();
  }

  @Override
  public Topic[] getBlockedTopics() {
    return (Topic[])GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_getBlockedTopics();
  }

  @Override
  public void setTopicAllowed(int topicId, int taxonomyVersion, boolean allowed) {
    GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_setTopicAllowed(topicId, taxonomyVersion, allowed);
  }

  @Override
  public int getRequiredPromptType() {
    return (int)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_getRequiredPromptType();
  }

  @Override
  public void promptActionOccurred(int action) {
    GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_promptActionOccurred(action);
  }

  public static PrivacySandboxBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrivacySandboxBridgeJni();
  }
}