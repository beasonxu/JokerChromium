package org.chromium.chrome.browser.browserservices.permissiondelegation;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
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

  private final Provider<NotificationChannelPreserver> channelPreserverProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  public InstalledWebappPermissionManager_Factory(Provider<Context> contextProvider,
      Provider<InstalledWebappPermissionStore> storeProvider,
      Provider<NotificationChannelPreserver> channelPreserverProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    this.contextProvider = contextProvider;
    this.storeProvider = storeProvider;
    this.channelPreserverProvider = channelPreserverProvider;
    this.umaRecorderProvider = umaRecorderProvider;
  }

  @Override
  public InstalledWebappPermissionManager get() {
    return newInstance(contextProvider.get(), storeProvider.get(), DoubleCheck.lazy(channelPreserverProvider), umaRecorderProvider.get());
  }

  public static InstalledWebappPermissionManager_Factory create(Provider<Context> contextProvider,
      Provider<InstalledWebappPermissionStore> storeProvider,
      Provider<NotificationChannelPreserver> channelPreserverProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    return new InstalledWebappPermissionManager_Factory(contextProvider, storeProvider, channelPreserverProvider, umaRecorderProvider);
  }

  public static InstalledWebappPermissionManager newInstance(Context context,
      InstalledWebappPermissionStore store, Lazy<NotificationChannelPreserver> channelPreserver,
      TrustedWebActivityUmaRecorder umaRecorder) {
    return new InstalledWebappPermissionManager(context, store, channelPreserver, umaRecorder);
  }
}
