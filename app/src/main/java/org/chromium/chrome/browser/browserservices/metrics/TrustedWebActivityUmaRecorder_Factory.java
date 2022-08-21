package org.chromium.chrome.browser.browserservices.metrics;

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
public final class TrustedWebActivityUmaRecorder_Factory implements Factory<TrustedWebActivityUmaRecorder> {
  private final Provider<TrustedWebActivityUmaRecorder.DeferredTaskHandler> taskHandlerProvider;

  public TrustedWebActivityUmaRecorder_Factory(
      Provider<TrustedWebActivityUmaRecorder.DeferredTaskHandler> taskHandlerProvider) {
    this.taskHandlerProvider = taskHandlerProvider;
  }

  @Override
  public TrustedWebActivityUmaRecorder get() {
    return newInstance(taskHandlerProvider.get());
  }

  public static TrustedWebActivityUmaRecorder_Factory create(
      Provider<TrustedWebActivityUmaRecorder.DeferredTaskHandler> taskHandlerProvider) {
    return new TrustedWebActivityUmaRecorder_Factory(taskHandlerProvider);
  }

  public static TrustedWebActivityUmaRecorder newInstance(
      TrustedWebActivityUmaRecorder.DeferredTaskHandler taskHandler) {
    return new TrustedWebActivityUmaRecorder(taskHandler);
  }
}
