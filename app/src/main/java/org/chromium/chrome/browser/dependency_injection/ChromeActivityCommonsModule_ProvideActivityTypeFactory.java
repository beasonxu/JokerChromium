package org.chromium.chrome.browser.dependency_injection;

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
public final class ChromeActivityCommonsModule_ProvideActivityTypeFactory implements Factory<Integer> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideActivityTypeFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideActivityType(module);
  }

  public static ChromeActivityCommonsModule_ProvideActivityTypeFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideActivityTypeFactory(module);
  }

  public static int provideActivityType(ChromeActivityCommonsModule instance) {
    return instance.provideActivityType();
  }
}
