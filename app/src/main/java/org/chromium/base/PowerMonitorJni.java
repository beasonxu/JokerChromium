package org.chromium.base;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PowerMonitorJni implements PowerMonitor.Natives {
  private static PowerMonitor.Natives testInstance;

  public static final JniStaticTestMocker<PowerMonitor.Natives> TEST_HOOKS = new JniStaticTestMocker<PowerMonitor.Natives>() {
    @Override
    public void setInstanceForTesting(PowerMonitor.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onBatteryChargingChanged() {
    GEN_JNI.org_chromium_base_PowerMonitor_onBatteryChargingChanged();
  }

  @Override
  public void onThermalStatusChanged(int thermalStatus) {
    GEN_JNI.org_chromium_base_PowerMonitor_onThermalStatusChanged(thermalStatus);
  }

  public static PowerMonitor.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.PowerMonitor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PowerMonitorJni();
  }
}
