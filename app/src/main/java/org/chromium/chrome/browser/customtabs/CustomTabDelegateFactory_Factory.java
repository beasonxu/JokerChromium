package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.browser_controls.BrowserControlsStateProvider;
import org.chromium.chrome.browser.browserservices.intents.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.controller.Verifier;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.bottombar.ephemeraltab.EphemeralTabCoordinator;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabBrowserControlsVisibilityDelegate;
import org.chromium.chrome.browser.fullscreen.FullscreenManager;
import org.chromium.chrome.browser.init.ChromeActivityNativeDelegate;
import org.chromium.chrome.browser.multiwindow.MultiWindowUtils;
import org.chromium.chrome.browser.share.ShareDelegate;
import org.chromium.chrome.browser.tabmodel.TabCreatorManager;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;
import org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager;
import org.chromium.components.externalauth.ExternalAuthUtils;
import org.chromium.ui.modaldialog.ModalDialogManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabDelegateFactory_Factory implements Factory<CustomTabDelegateFactory> {
  private final Provider<Activity> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider;

  private final Provider<ExternalAuthUtils> authUtilsProvider;

  private final Provider<MultiWindowUtils> multiWindowUtilsProvider;

  private final Provider<Verifier> verifierProvider;

  private final Provider<EphemeralTabCoordinator> ephemeralTabCoordinatorProvider;

  private final Provider<ChromeActivityNativeDelegate> chromeActivityNativeDelegateProvider;

  private final Provider<BrowserControlsStateProvider> browserControlsStateProvider;

  private final Provider<FullscreenManager> fullscreenManagerProvider;

  private final Provider<TabCreatorManager> tabCreatorManagerProvider;

  private final Provider<Supplier<TabModelSelector>> tabModelSelectorSupplierProvider;

  private final Provider<Supplier<CompositorViewHolder>> compositorViewHolderSupplierProvider;

  private final Provider<Supplier<ModalDialogManager>> modalDialogManagerSupplierProvider;

  private final Provider<SnackbarManager> snackbarManagerProvider;

  private final Provider<Supplier<ShareDelegate>> shareDelegateSupplierProvider;

  private final Provider<Integer> activityTypeProvider;

  public CustomTabDelegateFactory_Factory(Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<ExternalAuthUtils> authUtilsProvider,
      Provider<MultiWindowUtils> multiWindowUtilsProvider, Provider<Verifier> verifierProvider,
      Provider<EphemeralTabCoordinator> ephemeralTabCoordinatorProvider,
      Provider<ChromeActivityNativeDelegate> chromeActivityNativeDelegateProvider,
      Provider<BrowserControlsStateProvider> browserControlsStateProvider,
      Provider<FullscreenManager> fullscreenManagerProvider,
      Provider<TabCreatorManager> tabCreatorManagerProvider,
      Provider<Supplier<TabModelSelector>> tabModelSelectorSupplierProvider,
      Provider<Supplier<CompositorViewHolder>> compositorViewHolderSupplierProvider,
      Provider<Supplier<ModalDialogManager>> modalDialogManagerSupplierProvider,
      Provider<SnackbarManager> snackbarManagerProvider,
      Provider<Supplier<ShareDelegate>> shareDelegateSupplierProvider,
      Provider<Integer> activityTypeProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.visibilityDelegateProvider = visibilityDelegateProvider;
    this.authUtilsProvider = authUtilsProvider;
    this.multiWindowUtilsProvider = multiWindowUtilsProvider;
    this.verifierProvider = verifierProvider;
    this.ephemeralTabCoordinatorProvider = ephemeralTabCoordinatorProvider;
    this.chromeActivityNativeDelegateProvider = chromeActivityNativeDelegateProvider;
    this.browserControlsStateProvider = browserControlsStateProvider;
    this.fullscreenManagerProvider = fullscreenManagerProvider;
    this.tabCreatorManagerProvider = tabCreatorManagerProvider;
    this.tabModelSelectorSupplierProvider = tabModelSelectorSupplierProvider;
    this.compositorViewHolderSupplierProvider = compositorViewHolderSupplierProvider;
    this.modalDialogManagerSupplierProvider = modalDialogManagerSupplierProvider;
    this.snackbarManagerProvider = snackbarManagerProvider;
    this.shareDelegateSupplierProvider = shareDelegateSupplierProvider;
    this.activityTypeProvider = activityTypeProvider;
  }

  @Override
  public CustomTabDelegateFactory get() {
    return newInstance(activityProvider.get(), intentDataProvider.get(), visibilityDelegateProvider.get(), authUtilsProvider.get(), multiWindowUtilsProvider.get(), verifierProvider.get(), DoubleCheck.lazy(ephemeralTabCoordinatorProvider), chromeActivityNativeDelegateProvider.get(), browserControlsStateProvider.get(), fullscreenManagerProvider.get(), tabCreatorManagerProvider.get(), tabModelSelectorSupplierProvider.get(), compositorViewHolderSupplierProvider.get(), modalDialogManagerSupplierProvider.get(), DoubleCheck.lazy(snackbarManagerProvider), shareDelegateSupplierProvider.get(), activityTypeProvider.get());
  }

  public static CustomTabDelegateFactory_Factory create(Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<ExternalAuthUtils> authUtilsProvider,
      Provider<MultiWindowUtils> multiWindowUtilsProvider, Provider<Verifier> verifierProvider,
      Provider<EphemeralTabCoordinator> ephemeralTabCoordinatorProvider,
      Provider<ChromeActivityNativeDelegate> chromeActivityNativeDelegateProvider,
      Provider<BrowserControlsStateProvider> browserControlsStateProvider,
      Provider<FullscreenManager> fullscreenManagerProvider,
      Provider<TabCreatorManager> tabCreatorManagerProvider,
      Provider<Supplier<TabModelSelector>> tabModelSelectorSupplierProvider,
      Provider<Supplier<CompositorViewHolder>> compositorViewHolderSupplierProvider,
      Provider<Supplier<ModalDialogManager>> modalDialogManagerSupplierProvider,
      Provider<SnackbarManager> snackbarManagerProvider,
      Provider<Supplier<ShareDelegate>> shareDelegateSupplierProvider,
      Provider<Integer> activityTypeProvider) {
    return new CustomTabDelegateFactory_Factory(activityProvider, intentDataProvider, visibilityDelegateProvider, authUtilsProvider, multiWindowUtilsProvider, verifierProvider, ephemeralTabCoordinatorProvider, chromeActivityNativeDelegateProvider, browserControlsStateProvider, fullscreenManagerProvider, tabCreatorManagerProvider, tabModelSelectorSupplierProvider, compositorViewHolderSupplierProvider, modalDialogManagerSupplierProvider, snackbarManagerProvider, shareDelegateSupplierProvider, activityTypeProvider);
  }

  public static CustomTabDelegateFactory newInstance(Activity activity,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabBrowserControlsVisibilityDelegate visibilityDelegate, ExternalAuthUtils authUtils,
      MultiWindowUtils multiWindowUtils, Verifier verifier,
      Lazy<EphemeralTabCoordinator> ephemeralTabCoordinator,
      ChromeActivityNativeDelegate chromeActivityNativeDelegate,
      BrowserControlsStateProvider browserControlsStateProvider,
      FullscreenManager fullscreenManager, TabCreatorManager tabCreatorManager,
      Supplier<TabModelSelector> tabModelSelectorSupplier,
      Supplier<CompositorViewHolder> compositorViewHolderSupplier,
      Supplier<ModalDialogManager> modalDialogManagerSupplier,
      Lazy<SnackbarManager> snackbarManager, Supplier<ShareDelegate> shareDelegateSupplier,
      int activityType) {
    return new CustomTabDelegateFactory(activity, intentDataProvider, visibilityDelegate, authUtils, multiWindowUtils, verifier, ephemeralTabCoordinator, chromeActivityNativeDelegate, browserControlsStateProvider, fullscreenManager, tabCreatorManager, tabModelSelectorSupplier, compositorViewHolderSupplier, modalDialogManagerSupplier, snackbarManager, shareDelegateSupplier, activityType);
  }
}
