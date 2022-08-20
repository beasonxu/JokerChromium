package org.chromium.base.natives;

import java.lang.String;

public final class GEN_JNI {
  public static boolean TESTING_ENABLED;

  public static boolean REQUIRE_MOCK;

  /**
   * org.chromium.chrome.browser.flags.CachedFeatureFlags.isNetworkServiceWarmUpEnabled
   * @return (boolean)
   */
  public static final native boolean org_chromium_chrome_browser_flags_CachedFeatureFlags_isNetworkServiceWarmUpEnabled(
      );

  /**
   * org.chromium.chrome.browser.flags.ChromeFeatureList.getFieldTrialParamByFeature
   * @param featureName (java.lang.String)
   * @param paramName (java.lang.String)
   * @return (java.lang.String)
   */
  public static final native String org_chromium_chrome_browser_flags_ChromeFeatureList_getFieldTrialParamByFeature(
      String featureName, String paramName);

  /**
   * org.chromium.chrome.browser.flags.ChromeFeatureList.getFieldTrialParamByFeatureAsBoolean
   * @param featureName (java.lang.String)
   * @param paramName (java.lang.String)
   * @param defaultValue (boolean)
   * @return (boolean)
   */
  public static final native boolean org_chromium_chrome_browser_flags_ChromeFeatureList_getFieldTrialParamByFeatureAsBoolean(
      String featureName, String paramName, boolean defaultValue);

  /**
   * org.chromium.chrome.browser.flags.ChromeFeatureList.getFieldTrialParamByFeatureAsDouble
   * @param featureName (java.lang.String)
   * @param paramName (java.lang.String)
   * @param defaultValue (double)
   * @return (double)
   */
  public static final native double org_chromium_chrome_browser_flags_ChromeFeatureList_getFieldTrialParamByFeatureAsDouble(
      String featureName, String paramName, double defaultValue);

  /**
   * org.chromium.chrome.browser.flags.ChromeFeatureList.getFieldTrialParamByFeatureAsInt
   * @param featureName (java.lang.String)
   * @param paramName (java.lang.String)
   * @param defaultValue (int)
   * @return (int)
   */
  public static final native int org_chromium_chrome_browser_flags_ChromeFeatureList_getFieldTrialParamByFeatureAsInt(
      String featureName, String paramName, int defaultValue);

  /**
   * org.chromium.chrome.browser.flags.ChromeFeatureList.getFlattedFieldTrialParamsForFeature
   * @param featureName (java.lang.String)
   * @return (java.lang.String[])
   */
  public static final native String[] org_chromium_chrome_browser_flags_ChromeFeatureList_getFlattedFieldTrialParamsForFeature(
      String featureName);

  /**
   * org.chromium.chrome.browser.flags.ChromeFeatureList.isEnabled
   * @param featureName (java.lang.String)
   * @return (boolean)
   */
  public static final native boolean org_chromium_chrome_browser_flags_ChromeFeatureList_isEnabled(
      String featureName);

  /**
   * org.chromium.chrome.browser.flags.ChromeSessionState.setActivityType
   * @param type (int)
   * @return (void)
   */
  public static final native void org_chromium_chrome_browser_flags_ChromeSessionState_setActivityType(
      int type);

  /**
   * org.chromium.chrome.browser.flags.ChromeSessionState.setDarkModeState
   * @param state (int)
   * @return (void)
   */
  public static final native void org_chromium_chrome_browser_flags_ChromeSessionState_setDarkModeState(
      int state);

  /**
   * org.chromium.chrome.browser.flags.ChromeSessionState.setIsInMultiWindowMode
   * @param isInMultiWindowMode (boolean)
   * @return (void)
   */
  public static final native void org_chromium_chrome_browser_flags_ChromeSessionState_setIsInMultiWindowMode(
      boolean isInMultiWindowMode);
}
