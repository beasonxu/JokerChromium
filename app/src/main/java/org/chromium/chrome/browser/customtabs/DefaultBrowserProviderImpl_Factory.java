package org.chromium.chrome.browser.customtabs;

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
public final class DefaultBrowserProviderImpl_Factory implements Factory<DefaultBrowserProviderImpl> {
  @Override
  public DefaultBrowserProviderImpl get() {
    return newInstance();
  }

  public static DefaultBrowserProviderImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DefaultBrowserProviderImpl newInstance() {
    return new DefaultBrowserProviderImpl();
  }

  private static final class InstanceHolder {
    private static final DefaultBrowserProviderImpl_Factory INSTANCE = new DefaultBrowserProviderImpl_Factory();
  }
}
