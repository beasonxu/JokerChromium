package org.chromium.base;

import java.lang.Override;
import java.lang.String;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@MainDex
@CheckDiscard("crbug.com/993421")
class TraceEventJni implements TraceEvent.Natives {
  private static TraceEvent.Natives testInstance;

  public static final JniStaticTestMocker<TraceEvent.Natives> TEST_HOOKS = new JniStaticTestMocker<TraceEvent.Natives>() {
    @Override
    public void setInstanceForTesting(TraceEvent.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void registerEnabledObserver() {
    GEN_JNI.org_chromium_base_TraceEvent_registerEnabledObserver();
  }

  @Override
  public void startATrace(String categoryFilter) {
    GEN_JNI.org_chromium_base_TraceEvent_startATrace(categoryFilter);
  }

  @Override
  public void stopATrace() {
    GEN_JNI.org_chromium_base_TraceEvent_stopATrace();
  }

  @Override
  public void setupATraceStartupTrace(String categoryFilter) {
    GEN_JNI.org_chromium_base_TraceEvent_setupATraceStartupTrace(categoryFilter);
  }

  @Override
  public void instant(String name, String arg) {
    GEN_JNI.org_chromium_base_TraceEvent_instant(name, arg);
  }

  @Override
  public void begin(String name, String arg) {
    GEN_JNI.org_chromium_base_TraceEvent_begin(name, arg);
  }

  @Override
  public void end(String name, String arg) {
    GEN_JNI.org_chromium_base_TraceEvent_end(name, arg);
  }

  @Override
  public void beginToplevel(String target) {
    GEN_JNI.org_chromium_base_TraceEvent_beginToplevel(target);
  }

  @Override
  public void endToplevel(String target) {
    GEN_JNI.org_chromium_base_TraceEvent_endToplevel(target);
  }

  @Override
  public void startAsync(String name, long id) {
    GEN_JNI.org_chromium_base_TraceEvent_startAsync(name, id);
  }

  @Override
  public void finishAsync(String name, long id) {
    GEN_JNI.org_chromium_base_TraceEvent_finishAsync(name, id);
  }

  @Override
  public boolean viewHierarchyDumpEnabled() {
    return (boolean)GEN_JNI.org_chromium_base_TraceEvent_viewHierarchyDumpEnabled();
  }

  @Override
  public void initViewHierarchyDump() {
    GEN_JNI.org_chromium_base_TraceEvent_initViewHierarchyDump();
  }

  @Override
  public long startActivityDump(String name, long dumpProtoPtr) {
    return (long)GEN_JNI.org_chromium_base_TraceEvent_startActivityDump(name, dumpProtoPtr);
  }

  @Override
  public void addViewDump(int id, int parentId, boolean isShown, boolean isDirty, String className,
      String resourceName, long activityProtoPtr) {
    GEN_JNI.org_chromium_base_TraceEvent_addViewDump(id, parentId, isShown, isDirty, className, resourceName, activityProtoPtr);
  }

  @Override
  public void instantAndroidIPC(String name, long durMs) {
    GEN_JNI.org_chromium_base_TraceEvent_instantAndroidIPC(name, durMs);
  }

  public static TraceEvent.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.TraceEvent.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new TraceEventJni();
  }
}
