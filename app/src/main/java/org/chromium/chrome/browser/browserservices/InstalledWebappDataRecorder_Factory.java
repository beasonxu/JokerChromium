package org.chromium.chrome.browser.browserservices;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InstalledWebappDataRecorder_Factory implements Factory<InstalledWebappDataRecorder> {
  private final Provider<Context> contextProvider;

  private final Provider<InstalledWebappDataRegister> dataRegisterProvider;

  public InstalledWebappDataRecorder_Factory(Provider<Context> contextProvider,
      Provider<InstalledWebappDataRegister> dataRegisterProvider) {
    this.contextProvider = contextProvider;
    this.dataRegisterProvider = dataRegisterProvider;
  }

  @Override
  public InstalledWebappDataRecorder get() {
    return newInstance(contextProvider.get(), dataRegisterProvider.get());
  }

  public static InstalledWebappDataRecorder_Factory create(Provider<Context> contextProvider,
      Provider<InstalledWebappDataRegister> dataRegisterProvider) {
    return new InstalledWebappDataRecorder_Factory(contextProvider, dataRegisterProvider);
  }

  public static InstalledWebappDataRecorder newInstance(Context context,
      InstalledWebappDataRegister dataRegister) {
    return new InstalledWebappDataRecorder(context, dataRegister);
  }
}
