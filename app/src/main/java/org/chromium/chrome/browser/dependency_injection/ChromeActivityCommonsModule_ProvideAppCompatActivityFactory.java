package org.chromium.chrome.browser.dependency_injection;

import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideAppCompatActivityFactory implements Factory<AppCompatActivity> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideAppCompatActivityFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public AppCompatActivity get() {
    return provideAppCompatActivity(module);
  }

  public static ChromeActivityCommonsModule_ProvideAppCompatActivityFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideAppCompatActivityFactory(module);
  }

  public static AppCompatActivity provideAppCompatActivity(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppCompatActivity());
  }
}
