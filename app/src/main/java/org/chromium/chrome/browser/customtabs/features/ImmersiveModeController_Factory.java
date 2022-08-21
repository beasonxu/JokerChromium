package org.chromium.chrome.browser.customtabs.features;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.ui.base.WindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImmersiveModeController_Factory implements Factory<ImmersiveModeController> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<WindowAndroid> windowProvider;

  public ImmersiveModeController_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<Activity> activityProvider, Provider<WindowAndroid> windowProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.activityProvider = activityProvider;
    this.windowProvider = windowProvider;
  }

  @Override
  public ImmersiveModeController get() {
    return newInstance(lifecycleDispatcherProvider.get(), activityProvider.get(), windowProvider.get());
  }

  public static ImmersiveModeController_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<Activity> activityProvider, Provider<WindowAndroid> windowProvider) {
    return new ImmersiveModeController_Factory(lifecycleDispatcherProvider, activityProvider, windowProvider);
  }

  public static ImmersiveModeController newInstance(ActivityLifecycleDispatcher lifecycleDispatcher,
      Activity activity, WindowAndroid window) {
    return new ImmersiveModeController(lifecycleDispatcher, activity, window);
  }
}
