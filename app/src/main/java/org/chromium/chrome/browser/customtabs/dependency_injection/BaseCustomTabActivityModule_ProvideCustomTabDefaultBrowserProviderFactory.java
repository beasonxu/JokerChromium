package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideCustomTabDefaultBrowserProviderFactory implements Factory<CustomTabActivityNavigationController.DefaultBrowserProvider> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvideCustomTabDefaultBrowserProviderFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public CustomTabActivityNavigationController.DefaultBrowserProvider get() {
    return provideCustomTabDefaultBrowserProvider(module);
  }

  public static BaseCustomTabActivityModule_ProvideCustomTabDefaultBrowserProviderFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvideCustomTabDefaultBrowserProviderFactory(module);
  }

  public static CustomTabActivityNavigationController.DefaultBrowserProvider provideCustomTabDefaultBrowserProvider(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCustomTabDefaultBrowserProvider());
  }
}
