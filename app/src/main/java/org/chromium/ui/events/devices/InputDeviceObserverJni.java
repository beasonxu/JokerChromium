package org.chromium.ui.events.devices;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class InputDeviceObserverJni implements InputDeviceObserver.Natives {
  private static InputDeviceObserver.Natives testInstance;

  public static final JniStaticTestMocker<InputDeviceObserver.Natives> TEST_HOOKS = new JniStaticTestMocker<InputDeviceObserver.Natives>() {
    @Override
    public void setInstanceForTesting(
        InputDeviceObserver.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void inputConfigurationChanged(InputDeviceObserver caller) {
    GEN_JNI.org_chromium_ui_events_devices_InputDeviceObserver_inputConfigurationChanged(caller);
  }

  public static InputDeviceObserver.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.events.devices.InputDeviceObserver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InputDeviceObserverJni();
  }
}
