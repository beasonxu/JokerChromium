package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.intents.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.incognito.IncognitoCctProfileManager;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.tabmodel.IncognitoTabHostRegistry;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabIncognitoManager_Factory implements Factory<CustomTabIncognitoManager> {
  private final Provider<Activity> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<IncognitoTabHostRegistry> incognitoTabHostRegistryProvider;

  private final Provider<IncognitoCctProfileManager> incognitoCctProfileManagerProvider;

  public CustomTabIncognitoManager_Factory(Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<IncognitoTabHostRegistry> incognitoTabHostRegistryProvider,
      Provider<IncognitoCctProfileManager> incognitoCctProfileManagerProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.incognitoTabHostRegistryProvider = incognitoTabHostRegistryProvider;
    this.incognitoCctProfileManagerProvider = incognitoCctProfileManagerProvider;
  }

  @Override
  public CustomTabIncognitoManager get() {
    return newInstance(activityProvider.get(), intentDataProvider.get(), navigationControllerProvider.get(), lifecycleDispatcherProvider.get(), incognitoTabHostRegistryProvider.get(), incognitoCctProfileManagerProvider.get());
  }

  public static CustomTabIncognitoManager_Factory create(Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<IncognitoTabHostRegistry> incognitoTabHostRegistryProvider,
      Provider<IncognitoCctProfileManager> incognitoCctProfileManagerProvider) {
    return new CustomTabIncognitoManager_Factory(activityProvider, intentDataProvider, navigationControllerProvider, lifecycleDispatcherProvider, incognitoTabHostRegistryProvider, incognitoCctProfileManagerProvider);
  }

  public static CustomTabIncognitoManager newInstance(Activity activity,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabActivityNavigationController navigationController,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      IncognitoTabHostRegistry incognitoTabHostRegistry,
      IncognitoCctProfileManager incognitoCctProfileManager) {
    return new CustomTabIncognitoManager(activity, intentDataProvider, navigationController, lifecycleDispatcher, incognitoTabHostRegistry, incognitoCctProfileManager);
  }
}
