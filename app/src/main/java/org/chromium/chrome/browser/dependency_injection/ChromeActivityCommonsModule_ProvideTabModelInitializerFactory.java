package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.tabmodel.TabModelInitializer;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideTabModelInitializerFactory implements Factory<TabModelInitializer> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabModelInitializerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public TabModelInitializer get() {
    return provideTabModelInitializer(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabModelInitializerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabModelInitializerFactory(module);
  }

  public static TabModelInitializer provideTabModelInitializer(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTabModelInitializer());
  }
}
