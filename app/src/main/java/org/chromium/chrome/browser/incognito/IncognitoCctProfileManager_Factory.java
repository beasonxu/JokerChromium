package org.chromium.chrome.browser.incognito;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.ui.base.WindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class IncognitoCctProfileManager_Factory implements Factory<IncognitoCctProfileManager> {
  private final Provider<WindowAndroid> windowAndroidProvider;

  public IncognitoCctProfileManager_Factory(Provider<WindowAndroid> windowAndroidProvider) {
    this.windowAndroidProvider = windowAndroidProvider;
  }

  @Override
  public IncognitoCctProfileManager get() {
    return newInstance(windowAndroidProvider.get());
  }

  public static IncognitoCctProfileManager_Factory create(
      Provider<WindowAndroid> windowAndroidProvider) {
    return new IncognitoCctProfileManager_Factory(windowAndroidProvider);
  }

  public static IncognitoCctProfileManager newInstance(WindowAndroid windowAndroid) {
    return new IncognitoCctProfileManager(windowAndroid);
  }
}
