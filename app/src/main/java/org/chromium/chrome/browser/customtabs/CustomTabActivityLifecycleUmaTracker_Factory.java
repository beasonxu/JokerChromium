package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import android.os.Bundle;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.browserservices.intents.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabActivityLifecycleUmaTracker_Factory implements Factory<CustomTabActivityLifecycleUmaTracker> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider;

  public CustomTabActivityLifecycleUmaTracker_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<Activity> activityProvider,
      Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.intentDataProvider = intentDataProvider;
    this.activityProvider = activityProvider;
    this.savedInstanceStateSupplierProvider = savedInstanceStateSupplierProvider;
  }

  @Override
  public CustomTabActivityLifecycleUmaTracker get() {
    return newInstance(lifecycleDispatcherProvider.get(), intentDataProvider.get(), activityProvider.get(), savedInstanceStateSupplierProvider.get());
  }

  public static CustomTabActivityLifecycleUmaTracker_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<Activity> activityProvider,
      Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider) {
    return new CustomTabActivityLifecycleUmaTracker_Factory(lifecycleDispatcherProvider, intentDataProvider, activityProvider, savedInstanceStateSupplierProvider);
  }

  public static CustomTabActivityLifecycleUmaTracker newInstance(
      ActivityLifecycleDispatcher lifecycleDispatcher,
      BrowserServicesIntentDataProvider intentDataProvider, Activity activity,
      Supplier<Bundle> savedInstanceStateSupplier) {
    return new CustomTabActivityLifecycleUmaTracker(lifecycleDispatcher, intentDataProvider, activity, savedInstanceStateSupplier);
  }
}
