package org.chromium.chrome.browser.dependency_injection;

import android.os.Bundle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.base.supplier.Supplier;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_SavedInstanceStateSupplierFactory implements Factory<Supplier<Bundle>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_SavedInstanceStateSupplierFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Supplier<Bundle> get() {
    return savedInstanceStateSupplier(module);
  }

  public static ChromeActivityCommonsModule_SavedInstanceStateSupplierFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_SavedInstanceStateSupplierFactory(module);
  }

  public static Supplier<Bundle> savedInstanceStateSupplier(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.savedInstanceStateSupplier());
  }
}
