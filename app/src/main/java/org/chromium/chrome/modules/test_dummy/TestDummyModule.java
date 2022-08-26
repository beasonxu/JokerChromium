package org.chromium.chrome.modules.test_dummy;

import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.IdentifierNameString;
import org.chromium.components.module_installer.builder.Module;
import org.chromium.components.module_installer.engine.InstallEngine;
import org.chromium.components.module_installer.engine.InstallListener;

@Generated("org.chromium.components.module_installer.builder.ModuleInterfaceProcessor")
public class TestDummyModule {
  @IdentifierNameString
  private static String sModuleClassString = "org.chromium.chrome.modules.test_dummy.TestDummyProviderImpl";

  private static final Module<TestDummyProvider> sModule = new Module<TestDummyProvider>("test_dummy", TestDummyProvider.class, sModuleClassString);

  private TestDummyModule() {
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

  public static TestDummyProvider getImpl() {
    return sModule.getImpl();
  }

  public static InstallEngine getInstallEngine() {
    return sModule.getInstallEngine();
  }

  public static void setInstallEngine(InstallEngine engine) {
    sModule.setInstallEngine(engine);
  }
}
