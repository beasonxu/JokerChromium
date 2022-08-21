package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappPermissionStore;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvidesTwaPermissionStoreFactory implements Factory<InstalledWebappPermissionStore> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvidesTwaPermissionStoreFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public InstalledWebappPermissionStore get() {
    return providesTwaPermissionStore(module);
  }

  public static ChromeAppModule_ProvidesTwaPermissionStoreFactory create(ChromeAppModule module) {
    return new ChromeAppModule_ProvidesTwaPermissionStoreFactory(module);
  }

  public static InstalledWebappPermissionStore providesTwaPermissionStore(
      ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesTwaPermissionStore());
  }
}
