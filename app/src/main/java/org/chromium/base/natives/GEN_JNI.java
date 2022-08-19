package org.chromium.base.natives;

import java.lang.Object;
import java.lang.String;

public final class GEN_JNI {
  public static boolean TESTING_ENABLED;

  public static boolean REQUIRE_MOCK;

  /**
   * org.chromium.content.app.ContentChildProcessServiceDelegate.initChildProcess
   * @param caller (org.chromium.content.app.ContentChildProcessServiceDelegate)
   * @param cpuCount (int)
   * @param cpuFeatures (long)
   * @return (void)
   */
  public static final native void org_chromium_content_app_ContentChildProcessServiceDelegate_initChildProcess(
      Object caller, int cpuCount, long cpuFeatures);

  /**
   * org.chromium.content.app.ContentChildProcessServiceDelegate.initMemoryPressureListener
   * @return (void)
   */
  public static final native void org_chromium_content_app_ContentChildProcessServiceDelegate_initMemoryPressureListener(
      );

  /**
   * org.chromium.content.app.ContentChildProcessServiceDelegate.retrieveFileDescriptorsIdsToKeys
   * @param caller (org.chromium.content.app.ContentChildProcessServiceDelegate)
   * @return (void)
   */
  public static final native void org_chromium_content_app_ContentChildProcessServiceDelegate_retrieveFileDescriptorsIdsToKeys(
      Object caller);

  /**
   * org.chromium.content.app.ContentMain.start
   * @param startMinimalBrowser (boolean)
   * @return (int)
   */
  public static final native int org_chromium_content_app_ContentMain_start(
      boolean startMinimalBrowser);

  /**
   * org.chromium.content.browser.BrowserStartupControllerImpl.flushStartupTasks
   * @return (void)
   */
  public static final native void org_chromium_content_browser_BrowserStartupControllerImpl_flushStartupTasks(
      );

  /**
   * org.chromium.content.browser.BrowserStartupControllerImpl.setCommandLineFlags
   * @param singleProcess (boolean)
   * @return (void)
   */
  public static final native void org_chromium_content_browser_BrowserStartupControllerImpl_setCommandLineFlags(
      boolean singleProcess);

  /**
   * org.chromium.content.browser.TracingControllerAndroidImpl.destroy
   * @param nativeTracingControllerAndroid (long)
   * @param caller (org.chromium.content.browser.TracingControllerAndroidImpl)
   * @return (void)
   */
  public static final native void org_chromium_content_browser_TracingControllerAndroidImpl_destroy(
      long nativeTracingControllerAndroid, Object caller);

  /**
   * org.chromium.content.browser.TracingControllerAndroidImpl.getDefaultCategories
   * @param caller (org.chromium.content.browser.TracingControllerAndroidImpl)
   * @return (java.lang.String)
   */
  public static final native String org_chromium_content_browser_TracingControllerAndroidImpl_getDefaultCategories(
      Object caller);

  /**
   * org.chromium.content.browser.TracingControllerAndroidImpl.getKnownCategoriesAsync
   * @param nativeTracingControllerAndroid (long)
   * @param caller (org.chromium.content.browser.TracingControllerAndroidImpl)
   * @param callback (org.chromium.base.Callback<java.lang.String[]>)
   * @return (boolean)
   */
  public static final native boolean org_chromium_content_browser_TracingControllerAndroidImpl_getKnownCategoriesAsync(
      long nativeTracingControllerAndroid, Object caller, Object callback);

  /**
   * org.chromium.content.browser.TracingControllerAndroidImpl.getTraceBufferUsageAsync
   * @param nativeTracingControllerAndroid (long)
   * @param caller (org.chromium.content.browser.TracingControllerAndroidImpl)
   * @param callback (org.chromium.base.Callback<android.util.Pair<java.lang.Float, java.lang.Long>>)
   * @return (boolean)
   */
  public static final native boolean org_chromium_content_browser_TracingControllerAndroidImpl_getTraceBufferUsageAsync(
      long nativeTracingControllerAndroid, Object caller, Object callback);

  /**
   * org.chromium.content.browser.TracingControllerAndroidImpl.init
   * @param caller (org.chromium.content.browser.TracingControllerAndroidImpl)
   * @return (long)
   */
  public static final native long org_chromium_content_browser_TracingControllerAndroidImpl_init(
      Object caller);

  /**
   * org.chromium.content.browser.TracingControllerAndroidImpl.startTracing
   * @param nativeTracingControllerAndroid (long)
   * @param caller (org.chromium.content.browser.TracingControllerAndroidImpl)
   * @param categories (java.lang.String)
   * @param traceOptions (java.lang.String)
   * @param useProtobuf (boolean)
   * @return (boolean)
   */
  public static final native boolean org_chromium_content_browser_TracingControllerAndroidImpl_startTracing(
      long nativeTracingControllerAndroid, Object caller, String categories, String traceOptions,
      boolean useProtobuf);

  /**
   * org.chromium.content.browser.TracingControllerAndroidImpl.stopTracing
   * @param nativeTracingControllerAndroid (long)
   * @param caller (org.chromium.content.browser.TracingControllerAndroidImpl)
   * @param filename (java.lang.String)
   * @param compressFile (boolean)
   * @param useProtobuf (boolean)
   * @param callback (org.chromium.base.Callback<java.lang.Void>)
   * @return (void)
   */
  public static final native void org_chromium_content_browser_TracingControllerAndroidImpl_stopTracing(
      long nativeTracingControllerAndroid, Object caller, String filename, boolean compressFile,
      boolean useProtobuf, Object callback);

  /**
   * org.chromium.content_public.common.ResourceRequestBody.createResourceRequestBodyFromBytes
   * @param httpBody (byte[])
   * @return (byte[])
   */
  public static final native byte[] org_chromium_content_1public_common_ResourceRequestBody_createResourceRequestBodyFromBytes(
      byte[] httpBody);
}
