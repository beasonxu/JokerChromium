package org.chromium.chrome.browser.commerce.shopping_list;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ShoppingDataProviderBridgeJni implements ShoppingDataProviderBridge.Natives {
  private static ShoppingDataProviderBridge.Natives testInstance;

  public static final JniStaticTestMocker<ShoppingDataProviderBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<ShoppingDataProviderBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        ShoppingDataProviderBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public byte[] getForWebContents(WebContents webContents) {
    return (byte[])GEN_JNI.org_chromium_chrome_browser_commerce_shopping_1list_ShoppingDataProviderBridge_getForWebContents(webContents);
  }

  public static ShoppingDataProviderBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.commerce.shopping_list.ShoppingDataProviderBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ShoppingDataProviderBridgeJni();
  }
}
