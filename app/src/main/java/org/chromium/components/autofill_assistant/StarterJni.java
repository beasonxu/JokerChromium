package org.chromium.components.autofill_assistant;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class StarterJni implements Starter.Natives {
  private static Starter.Natives testInstance;

  public static final JniStaticTestMocker<Starter.Natives> TEST_HOOKS = new JniStaticTestMocker<Starter.Natives>() {
    @Override
    public void setInstanceForTesting(
        Starter.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long fromWebContents(WebContents webContents,
      AssistantStaticDependencies staticDependencies) {
    return (long)GEN_JNI.org_chromium_components_autofill_1assistant_Starter_fromWebContents(webContents, staticDependencies);
  }

  @Override
  public void attach(long nativeStarterDelegateAndroid, Starter caller) {
    GEN_JNI.org_chromium_components_autofill_1assistant_Starter_attach(nativeStarterDelegateAndroid, caller);
  }

  @Override
  public void detach(long nativeStarterDelegateAndroid, Starter caller) {
    GEN_JNI.org_chromium_components_autofill_1assistant_Starter_detach(nativeStarterDelegateAndroid, caller);
  }

  @Override
  public void onFeatureModuleInstalled(long nativeStarterDelegateAndroid, Starter caller,
      int result) {
    GEN_JNI.org_chromium_components_autofill_1assistant_Starter_onFeatureModuleInstalled(nativeStarterDelegateAndroid, caller, result);
  }

  @Override
  public void onOnboardingFinished(long nativeStarterDelegateAndroid, Starter caller, boolean shown,
      int result) {
    GEN_JNI.org_chromium_components_autofill_1assistant_Starter_onOnboardingFinished(nativeStarterDelegateAndroid, caller, shown, result);
  }

  @Override
  public void onInteractabilityChanged(long nativeStarterDelegateAndroid, Starter caller,
      boolean isInteractable) {
    GEN_JNI.org_chromium_components_autofill_1assistant_Starter_onInteractabilityChanged(nativeStarterDelegateAndroid, caller, isInteractable);
  }

  @Override
  public void onActivityAttachmentChanged(long nativeStarterDelegateAndroid, Starter caller) {
    GEN_JNI.org_chromium_components_autofill_1assistant_Starter_onActivityAttachmentChanged(nativeStarterDelegateAndroid, caller);
  }

  @Override
  public void start(long nativeStarterDelegateAndroid, Starter caller, String experimentIds,
      String[] parameterNames, String[] parameterValues, String[] deviceOnlyParameterNames,
      String[] deviceOnlyParameterValues, String initialUrl) {
    GEN_JNI.org_chromium_components_autofill_1assistant_Starter_start(nativeStarterDelegateAndroid, caller, experimentIds, parameterNames, parameterValues, deviceOnlyParameterNames, deviceOnlyParameterValues, initialUrl);
  }

  public static Starter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.autofill_assistant.Starter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new StarterJni();
  }
}
