package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.share.ShareDelegate;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideShareDelegateSupplierFactory implements Factory<Supplier<ShareDelegate>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideShareDelegateSupplierFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Supplier<ShareDelegate> get() {
    return provideShareDelegateSupplier(module);
  }

  public static ChromeActivityCommonsModule_ProvideShareDelegateSupplierFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideShareDelegateSupplierFactory(module);
  }

  public static Supplier<ShareDelegate> provideShareDelegateSupplier(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideShareDelegateSupplier());
  }
}
