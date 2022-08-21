package org.chromium.chrome.browser.browserservices;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.permissiondelegation.PermissionUpdater;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InstalledWebappRegistrar_Factory implements Factory<InstalledWebappRegistrar> {
  private final Provider<Context> appContextProvider;

  private final Provider<PermissionUpdater> permissionUpdaterProvider;

  private final Provider<InstalledWebappDataRecorder> dataRecorderProvider;

  public InstalledWebappRegistrar_Factory(Provider<Context> appContextProvider,
      Provider<PermissionUpdater> permissionUpdaterProvider,
      Provider<InstalledWebappDataRecorder> dataRecorderProvider) {
    this.appContextProvider = appContextProvider;
    this.permissionUpdaterProvider = permissionUpdaterProvider;
    this.dataRecorderProvider = dataRecorderProvider;
  }

  @Override
  public InstalledWebappRegistrar get() {
    return newInstance(appContextProvider.get(), permissionUpdaterProvider.get(), DoubleCheck.lazy(dataRecorderProvider));
  }

  public static InstalledWebappRegistrar_Factory create(Provider<Context> appContextProvider,
      Provider<PermissionUpdater> permissionUpdaterProvider,
      Provider<InstalledWebappDataRecorder> dataRecorderProvider) {
    return new InstalledWebappRegistrar_Factory(appContextProvider, permissionUpdaterProvider, dataRecorderProvider);
  }

  public static InstalledWebappRegistrar newInstance(Context appContext,
      PermissionUpdater permissionUpdater, Lazy<InstalledWebappDataRecorder> dataRecorder) {
    return new InstalledWebappRegistrar(appContext, permissionUpdater, dataRecorder);
  }
}
