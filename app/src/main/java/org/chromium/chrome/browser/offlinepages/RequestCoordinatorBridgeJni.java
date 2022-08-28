package org.chromium.chrome.browser.offlinepages;

import java.lang.Integer;
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
public class RequestCoordinatorBridgeJni implements RequestCoordinatorBridge.Natives {
  private static RequestCoordinatorBridge.Natives testInstance;

  public static final JniStaticTestMocker<RequestCoordinatorBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<RequestCoordinatorBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        RequestCoordinatorBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getRequestsInQueue(Profile profile, Callback<SavePageRequest[]> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_RequestCoordinatorBridge_getRequestsInQueue(profile, callback);
  }

  @Override
  public void removeRequestsFromQueue(Profile profile, long[] requestIds,
      RequestCoordinatorBridge.RequestsRemovedCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_RequestCoordinatorBridge_removeRequestsFromQueue(profile, requestIds, callback);
  }

  @Override
  public void savePageLater(Profile profile, Callback<Integer> callback, String url,
      String clientNamespace, String clientId, String origin, boolean userRequested) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_RequestCoordinatorBridge_savePageLater(profile, callback, url, clientNamespace, clientId, origin, userRequested);
  }

  public static RequestCoordinatorBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.RequestCoordinatorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RequestCoordinatorBridgeJni();
  }
}