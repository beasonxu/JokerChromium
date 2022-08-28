package org.chromium.chrome.browser.complex_tasks;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TaskTabHelperJni implements TaskTabHelper.Natives {
  private static TaskTabHelper.Natives testInstance;

  public static final JniStaticTestMocker<TaskTabHelper.Natives> TEST_HOOKS = new JniStaticTestMocker<TaskTabHelper.Natives>() {
    @Override
    public void setInstanceForTesting(
        TaskTabHelper.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getTaskId(WebContents webContents) {
    return (long)GEN_JNI.org_chromium_chrome_browser_complex_1tasks_TaskTabHelper_getTaskId(webContents);
  }

  @Override
  public long getRootTaskId(WebContents webContents) {
    return (long)GEN_JNI.org_chromium_chrome_browser_complex_1tasks_TaskTabHelper_getRootTaskId(webContents);
  }

  public static TaskTabHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.complex_tasks.TaskTabHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TaskTabHelperJni();
  }
}