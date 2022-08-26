package org.chromium.chrome.browser.webapps;

import android.app.Activity;
import android.os.Bundle;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.browserservices.intents.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.SplashController;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.metrics.ActivityTabStartupMetricsTracker;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebApkActivityLifecycleUmaTracker_Factory implements Factory<WebApkActivityLifecycleUmaTracker> {
  private final Provider<Activity> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<SplashController> splashControllerProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider;

  private final Provider<ActivityTabStartupMetricsTracker> startupMetricsTrackerProvider;

  private final Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider;

  public WebApkActivityLifecycleUmaTracker_Factory(Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<SplashController> splashControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<ActivityTabStartupMetricsTracker> startupMetricsTrackerProvider,
      Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.splashControllerProvider = splashControllerProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.deferredStartupWithStorageHandlerProvider = deferredStartupWithStorageHandlerProvider;
    this.startupMetricsTrackerProvider = startupMetricsTrackerProvider;
    this.savedInstanceStateSupplierProvider = savedInstanceStateSupplierProvider;
  }

  @Override
  public WebApkActivityLifecycleUmaTracker get() {
    return newInstance(activityProvider.get(), intentDataProvider.get(), splashControllerProvider.get(), lifecycleDispatcherProvider.get(), deferredStartupWithStorageHandlerProvider.get(), DoubleCheck.lazy(startupMetricsTrackerProvider), savedInstanceStateSupplierProvider.get());
  }

  public static WebApkActivityLifecycleUmaTracker_Factory create(
      Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<SplashController> splashControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<ActivityTabStartupMetricsTracker> startupMetricsTrackerProvider,
      Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider) {
    return new WebApkActivityLifecycleUmaTracker_Factory(activityProvider, intentDataProvider, splashControllerProvider, lifecycleDispatcherProvider, deferredStartupWithStorageHandlerProvider, startupMetricsTrackerProvider, savedInstanceStateSupplierProvider);
  }

  public static WebApkActivityLifecycleUmaTracker newInstance(Activity activity,
      BrowserServicesIntentDataProvider intentDataProvider, SplashController splashController,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      WebappDeferredStartupWithStorageHandler deferredStartupWithStorageHandler,
      Lazy<ActivityTabStartupMetricsTracker> startupMetricsTracker,
      Supplier<Bundle> savedInstanceStateSupplier) {
    return new WebApkActivityLifecycleUmaTracker(activity, intentDataProvider, splashController, lifecycleDispatcher, deferredStartupWithStorageHandler, startupMetricsTracker, savedInstanceStateSupplier);
  }
}
