package org.chromium.chrome.browser.browserservices.permissiondelegation;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.metrics.TrustedWebActivityUmaRecorder;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InstalledWebappPermissionManager_Factory implements Factory<InstalledWebappPermissionManager> {
  private final Provider<Context> contextProvider;

  private final Provider<InstalledWebappPermissionStore> storeProvider;

  private final Provider<NotificationChannelPreserver> preserverProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  public InstalledWebappPermissionManager_Factory(Provider<Context> contextProvider,
      Provider<InstalledWebappPermissionStore> storeProvider,
      Provider<NotificationChannelPreserver> preserverProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    this.contextProvider = contextProvider;
    this.storeProvider = storeProvider;
    this.preserverProvider = preserverProvider;
    this.umaRecorderProvider = umaRecorderProvider;
  }

  @Override
  public InstalledWebappPermissionManager get() {
    return newInstance(contextProvider.get(), storeProvider.get(), DoubleCheck.lazy(preserverProvider), umaRecorderProvider.get());
  }

  public static InstalledWebappPermissionManager_Factory create(Provider<Context> contextProvider,
      Provider<InstalledWebappPermissionStore> storeProvider,
      Provider<NotificationChannelPreserver> preserverProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    return new InstalledWebappPermissionManager_Factory(contextProvider, storeProvider, preserverProvider, umaRecorderProvider);
  }

  public static InstalledWebappPermissionManager newInstance(Context context,
      InstalledWebappPermissionStore store, Lazy<NotificationChannelPreserver> preserver,
      TrustedWebActivityUmaRecorder umaRecorder) {
    return new InstalledWebappPermissionManager(context, store, preserver, umaRecorder);
  }
}
