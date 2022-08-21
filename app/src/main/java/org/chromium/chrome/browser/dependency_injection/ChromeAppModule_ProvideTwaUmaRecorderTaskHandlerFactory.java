package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import org.chromium.chrome.browser.browserservices.metrics.TrustedWebActivityUmaRecorder;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvideTwaUmaRecorderTaskHandlerFactory implements Factory<TrustedWebActivityUmaRecorder.DeferredTaskHandler> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvideTwaUmaRecorderTaskHandlerFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public TrustedWebActivityUmaRecorder.DeferredTaskHandler get() {
    return provideTwaUmaRecorderTaskHandler(module);
  }

  public static ChromeAppModule_ProvideTwaUmaRecorderTaskHandlerFactory create(
      ChromeAppModule module) {
    return new ChromeAppModule_ProvideTwaUmaRecorderTaskHandlerFactory(module);
  }

  public static TrustedWebActivityUmaRecorder.DeferredTaskHandler provideTwaUmaRecorderTaskHandler(
      ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTwaUmaRecorderTaskHandler());
  }
}
