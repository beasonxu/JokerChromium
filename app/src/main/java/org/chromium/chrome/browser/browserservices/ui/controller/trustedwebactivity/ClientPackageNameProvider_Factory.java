package org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity;

import android.os.Bundle;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.browserservices.intents.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ClientPackageNameProvider_Factory implements Factory<ClientPackageNameProvider> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabsConnection> customTabsConnectionProvider;

  private final Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider;

  public ClientPackageNameProvider_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider,
      Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.intentDataProvider = intentDataProvider;
    this.customTabsConnectionProvider = customTabsConnectionProvider;
    this.savedInstanceStateSupplierProvider = savedInstanceStateSupplierProvider;
  }

  @Override
  public ClientPackageNameProvider get() {
    return newInstance(lifecycleDispatcherProvider.get(), intentDataProvider.get(), customTabsConnectionProvider.get(), savedInstanceStateSupplierProvider.get());
  }

  public static ClientPackageNameProvider_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider,
      Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider) {
    return new ClientPackageNameProvider_Factory(lifecycleDispatcherProvider, intentDataProvider, customTabsConnectionProvider, savedInstanceStateSupplierProvider);
  }

  public static ClientPackageNameProvider newInstance(
      ActivityLifecycleDispatcher lifecycleDispatcher,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabsConnection customTabsConnection, Supplier<Bundle> savedInstanceStateSupplier) {
    return new ClientPackageNameProvider(lifecycleDispatcher, intentDataProvider, customTabsConnection, savedInstanceStateSupplier);
  }
}
