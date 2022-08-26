package org.chromium.chrome.browser.app.tabmodel;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeTabModelFilterFactory_Factory implements Factory<ChromeTabModelFilterFactory> {
  private final Provider<Activity> activityProvider;

  public ChromeTabModelFilterFactory_Factory(Provider<Activity> activityProvider) {
    this.activityProvider = activityProvider;
  }

  @Override
  public ChromeTabModelFilterFactory get() {
    return newInstance(activityProvider.get());
  }

  public static ChromeTabModelFilterFactory_Factory create(Provider<Activity> activityProvider) {
    return new ChromeTabModelFilterFactory_Factory(activityProvider);
  }

  public static ChromeTabModelFilterFactory newInstance(Activity activity) {
    return new ChromeTabModelFilterFactory(activity);
  }
}
