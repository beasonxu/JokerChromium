package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import org.chromium.base.supplier.ObservableSupplier;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideAutofillUiBottomInsetSupplierFactory implements Factory<ObservableSupplier<Integer>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideAutofillUiBottomInsetSupplierFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ObservableSupplier<Integer> get() {
    return provideAutofillUiBottomInsetSupplier(module);
  }

  public static ChromeActivityCommonsModule_ProvideAutofillUiBottomInsetSupplierFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideAutofillUiBottomInsetSupplierFactory(module);
  }

  public static ObservableSupplier<Integer> provideAutofillUiBottomInsetSupplier(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideAutofillUiBottomInsetSupplier());
  }
}
