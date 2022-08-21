package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import org.chromium.chrome.browser.tabmodel.IncognitoTabHostRegistry;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideIncognitoTabHostRegistryFactory implements Factory<IncognitoTabHostRegistry> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvideIncognitoTabHostRegistryFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public IncognitoTabHostRegistry get() {
    return provideIncognitoTabHostRegistry(module);
  }

  public static BaseCustomTabActivityModule_ProvideIncognitoTabHostRegistryFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvideIncognitoTabHostRegistryFactory(module);
  }

  public static IncognitoTabHostRegistry provideIncognitoTabHostRegistry(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideIncognitoTabHostRegistry());
  }
}
