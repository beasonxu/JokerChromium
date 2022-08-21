package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import org.chromium.chrome.browser.browserservices.InstalledWebappDataRegister;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideInstalledWebappDataRegisterFactory implements Factory<InstalledWebappDataRegister> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvideInstalledWebappDataRegisterFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public InstalledWebappDataRegister get() {
    return provideInstalledWebappDataRegister(module);
  }

  public static BaseCustomTabActivityModule_ProvideInstalledWebappDataRegisterFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvideInstalledWebappDataRegisterFactory(module);
  }

  public static InstalledWebappDataRegister provideInstalledWebappDataRegister(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideInstalledWebappDataRegister());
  }
}
