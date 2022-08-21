package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import android.os.Bundle;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.chromium.base.supplier.Supplier;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabTabPersistencePolicy_Factory implements Factory<CustomTabTabPersistencePolicy> {
  private final Provider<Activity> activityProvider;

  private final Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider;

  public CustomTabTabPersistencePolicy_Factory(Provider<Activity> activityProvider,
      Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider) {
    this.activityProvider = activityProvider;
    this.savedInstanceStateSupplierProvider = savedInstanceStateSupplierProvider;
  }

  @Override
  public CustomTabTabPersistencePolicy get() {
    return newInstance(activityProvider.get(), savedInstanceStateSupplierProvider.get());
  }

  public static CustomTabTabPersistencePolicy_Factory create(Provider<Activity> activityProvider,
      Provider<Supplier<Bundle>> savedInstanceStateSupplierProvider) {
    return new CustomTabTabPersistencePolicy_Factory(activityProvider, savedInstanceStateSupplierProvider);
  }

  public static CustomTabTabPersistencePolicy newInstance(Activity activity,
      Supplier<Bundle> savedInstanceStateSupplier) {
    return new CustomTabTabPersistencePolicy(activity, savedInstanceStateSupplier);
  }
}
