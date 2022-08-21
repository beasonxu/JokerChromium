package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabDownloadObserver_Factory implements Factory<CustomTabDownloadObserver> {
  private final Provider<Activity> activityProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  public CustomTabDownloadObserver_Factory(Provider<Activity> activityProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    this.activityProvider = activityProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
  }

  @Override
  public CustomTabDownloadObserver get() {
    return newInstance(activityProvider.get(), tabObserverRegistrarProvider.get());
  }

  public static CustomTabDownloadObserver_Factory create(Provider<Activity> activityProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    return new CustomTabDownloadObserver_Factory(activityProvider, tabObserverRegistrarProvider);
  }

  public static CustomTabDownloadObserver newInstance(Activity activity,
      TabObserverRegistrar tabObserverRegistrar) {
    return new CustomTabDownloadObserver(activity, tabObserverRegistrar);
  }
}
