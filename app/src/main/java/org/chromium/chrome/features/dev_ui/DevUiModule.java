package org.chromium.chrome.features.dev_ui;

import java.lang.String;
import org.chromium.base.annotations.IdentifierNameString;
import org.chromium.components.module_installer.builder.Module;
import org.chromium.components.module_installer.engine.InstallEngine;
import org.chromium.components.module_installer.engine.InstallListener;

public class DevUiModule {
  @IdentifierNameString
  private static String sModuleClassString = "org.chromium.chrome.features.dev_ui.DevUiImpl";

  private static final Module<DevUi> sModule = new Module<DevUi>("dev_ui", DevUi.class, sModuleClassString);

  private DevUiModule() {
  }

  public static boolean isInstalled() {
    return sModule.isInstalled();
  }

  public static void install(InstallListener listener) {
    sModule.install(listener);
  }

  public static void installDeferred() {
    sModule.installDeferred();
  }

  public static void ensureNativeLoaded() {
    sModule.ensureNativeLoaded();
  }

  public static DevUi getImpl() {
    return sModule.getImpl();
  }

  public static InstallEngine getInstallEngine() {
    return sModule.getInstallEngine();
  }

  public static void setInstallEngine(InstallEngine engine) {
    sModule.setInstallEngine(engine);
  }
}
