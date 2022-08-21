package org.chromium.chrome.browser.browserservices;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InstalledWebappBroadcastReceiver_Factory implements Factory<InstalledWebappBroadcastReceiver> {
  @Override
  public InstalledWebappBroadcastReceiver get() {
    return newInstance();
  }

  public static InstalledWebappBroadcastReceiver_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static InstalledWebappBroadcastReceiver newInstance() {
    return new InstalledWebappBroadcastReceiver();
  }

  private static final class InstanceHolder {
    private static final InstalledWebappBroadcastReceiver_Factory INSTANCE = new InstalledWebappBroadcastReceiver_Factory();
  }
}
