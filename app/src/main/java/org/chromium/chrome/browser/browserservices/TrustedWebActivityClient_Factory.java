package org.chromium.chrome.browser.browserservices;

import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.metrics.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappPermissionManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrustedWebActivityClient_Factory implements Factory<TrustedWebActivityClient> {
  private final Provider<TrustedWebActivityServiceConnectionPool> connectionPoolProvider;

  private final Provider<InstalledWebappPermissionManager> permissionManagerProvider;

  private final Provider<TrustedWebActivityUmaRecorder> recorderProvider;

  public TrustedWebActivityClient_Factory(
      Provider<TrustedWebActivityServiceConnectionPool> connectionPoolProvider,
      Provider<InstalledWebappPermissionManager> permissionManagerProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider) {
    this.connectionPoolProvider = connectionPoolProvider;
    this.permissionManagerProvider = permissionManagerProvider;
    this.recorderProvider = recorderProvider;
  }

  @Override
  public TrustedWebActivityClient get() {
    return newInstance(connectionPoolProvider.get(), permissionManagerProvider.get(), recorderProvider.get());
  }

  public static TrustedWebActivityClient_Factory create(
      Provider<TrustedWebActivityServiceConnectionPool> connectionPoolProvider,
      Provider<InstalledWebappPermissionManager> permissionManagerProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider) {
    return new TrustedWebActivityClient_Factory(connectionPoolProvider, permissionManagerProvider, recorderProvider);
  }

  public static TrustedWebActivityClient newInstance(
      TrustedWebActivityServiceConnectionPool connectionPool,
      InstalledWebappPermissionManager permissionManager, TrustedWebActivityUmaRecorder recorder) {
    return new TrustedWebActivityClient(connectionPool, permissionManager, recorder);
  }
}
