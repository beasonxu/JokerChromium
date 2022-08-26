package org.chromium.chrome.browser.customtabs.content;

import android.app.Activity;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.app.tabmodel.ChromeTabModelFilterFactory;
import org.chromium.chrome.browser.browserservices.intents.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory;
import org.chromium.chrome.browser.customtabs.CustomTabTabPersistencePolicy;
import org.chromium.chrome.browser.tabmodel.AsyncTabParamsManager;
import org.chromium.chrome.browser.tabmodel.TabCreatorManager;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabActivityTabFactory_Factory implements Factory<CustomTabActivityTabFactory> {
  private final Provider<Activity> activityProvider;

  private final Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider;

  private final Provider<ChromeTabModelFilterFactory> tabModelFilterFactoryProvider;

  private final Provider<ActivityWindowAndroid> activityWindowAndroidProvider;

  private final Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider;

  private final Provider<TabCreatorManager> tabCreatorManagerProvider;

  private final Provider<Supplier<TabModelSelector>> tabModelSelectorSupplierProvider;

  private final Provider<Supplier<CompositorViewHolder>> compositorViewHolderSupplierProvider;

  public CustomTabActivityTabFactory_Factory(Provider<Activity> activityProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<ChromeTabModelFilterFactory> tabModelFilterFactoryProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider,
      Provider<TabCreatorManager> tabCreatorManagerProvider,
      Provider<Supplier<TabModelSelector>> tabModelSelectorSupplierProvider,
      Provider<Supplier<CompositorViewHolder>> compositorViewHolderSupplierProvider) {
    this.activityProvider = activityProvider;
    this.persistencePolicyProvider = persistencePolicyProvider;
    this.tabModelFilterFactoryProvider = tabModelFilterFactoryProvider;
    this.activityWindowAndroidProvider = activityWindowAndroidProvider;
    this.customTabDelegateFactoryProvider = customTabDelegateFactoryProvider;
    this.intentDataProvider = intentDataProvider;
    this.asyncTabParamsManagerProvider = asyncTabParamsManagerProvider;
    this.tabCreatorManagerProvider = tabCreatorManagerProvider;
    this.tabModelSelectorSupplierProvider = tabModelSelectorSupplierProvider;
    this.compositorViewHolderSupplierProvider = compositorViewHolderSupplierProvider;
  }

  @Override
  public CustomTabActivityTabFactory get() {
    return newInstance(activityProvider.get(), persistencePolicyProvider.get(), tabModelFilterFactoryProvider.get(), DoubleCheck.lazy(activityWindowAndroidProvider), DoubleCheck.lazy(customTabDelegateFactoryProvider), intentDataProvider.get(), DoubleCheck.lazy(asyncTabParamsManagerProvider), tabCreatorManagerProvider.get(), tabModelSelectorSupplierProvider.get(), compositorViewHolderSupplierProvider.get());
  }

  public static CustomTabActivityTabFactory_Factory create(Provider<Activity> activityProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<ChromeTabModelFilterFactory> tabModelFilterFactoryProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider,
      Provider<TabCreatorManager> tabCreatorManagerProvider,
      Provider<Supplier<TabModelSelector>> tabModelSelectorSupplierProvider,
      Provider<Supplier<CompositorViewHolder>> compositorViewHolderSupplierProvider) {
    return new CustomTabActivityTabFactory_Factory(activityProvider, persistencePolicyProvider, tabModelFilterFactoryProvider, activityWindowAndroidProvider, customTabDelegateFactoryProvider, intentDataProvider, asyncTabParamsManagerProvider, tabCreatorManagerProvider, tabModelSelectorSupplierProvider, compositorViewHolderSupplierProvider);
  }

  public static CustomTabActivityTabFactory newInstance(Activity activity,
      CustomTabTabPersistencePolicy persistencePolicy,
      ChromeTabModelFilterFactory tabModelFilterFactory,
      Lazy<ActivityWindowAndroid> activityWindowAndroid,
      Lazy<CustomTabDelegateFactory> customTabDelegateFactory,
      BrowserServicesIntentDataProvider intentDataProvider,
      Lazy<AsyncTabParamsManager> asyncTabParamsManager, TabCreatorManager tabCreatorManager,
      Supplier<TabModelSelector> tabModelSelectorSupplier,
      Supplier<CompositorViewHolder> compositorViewHolderSupplier) {
    return new CustomTabActivityTabFactory(activity, persistencePolicy, tabModelFilterFactory, activityWindowAndroid, customTabDelegateFactory, intentDataProvider, asyncTabParamsManager, tabCreatorManager, tabModelSelectorSupplier, compositorViewHolderSupplier);
  }
}
