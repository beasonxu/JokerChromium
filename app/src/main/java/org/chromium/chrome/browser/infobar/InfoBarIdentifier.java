
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/infobars/core/infobar_delegate.h

package org.chromium.chrome.browser.infobar;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    InfoBarIdentifier.INVALID, InfoBarIdentifier.TEST_INFOBAR,
    InfoBarIdentifier.DUPLICATE_DOWNLOAD_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.HUNG_PLUGIN_INFOBAR_DELEGATE,
    InfoBarIdentifier.HUNG_RENDERER_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.DEV_TOOLS_INFOBAR_DELEGATE,
    InfoBarIdentifier.EXTENSION_DEV_TOOLS_INFOBAR_DELEGATE,
    InfoBarIdentifier.INCOGNITO_CONNECTABILITY_INFOBAR_DELEGATE,
    InfoBarIdentifier.THEME_INSTALLED_INFOBAR_DELEGATE,
    InfoBarIdentifier.THREE_D_API_INFOBAR_DELEGATE, InfoBarIdentifier.NACL_INFOBAR_DELEGATE,
    InfoBarIdentifier.GENERATED_PASSWORD_SAVED_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.SAVE_PASSWORD_INFOBAR_DELEGATE_MOBILE,
    InfoBarIdentifier.PERMISSION_UPDATE_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.OUTDATED_PLUGIN_INFOBAR_DELEGATE,
    InfoBarIdentifier.RELOAD_PLUGIN_INFOBAR_DELEGATE,
    InfoBarIdentifier.PLUGIN_OBSERVER_INFOBAR_DELEGATE,
    InfoBarIdentifier.POPUP_BLOCKED_INFOBAR_DELEGATE_MOBILE,
    InfoBarIdentifier.FILE_ACCESS_DISABLED_INFOBAR_DELEGATE,
    InfoBarIdentifier.KEYSTONE_PROMOTION_INFOBAR_DELEGATE_MAC,
    InfoBarIdentifier.COLLECTED_COOKIES_INFOBAR_DELEGATE,
    InfoBarIdentifier.INSTALLATION_ERROR_INFOBAR_DELEGATE,
    InfoBarIdentifier.ALTERNATE_NAV_INFOBAR_DELEGATE, InfoBarIdentifier.BAD_FLAGS_INFOBAR_DELEGATE,
    InfoBarIdentifier.DEFAULT_BROWSER_INFOBAR_DELEGATE,
    InfoBarIdentifier.GOOGLE_API_KEYS_INFOBAR_DELEGATE,
    InfoBarIdentifier.OBSOLETE_SYSTEM_INFOBAR_DELEGATE,
    InfoBarIdentifier.SESSION_CRASHED_INFOBAR_DELEGATE_IOS,
    InfoBarIdentifier.PAGE_INFO_INFOBAR_DELEGATE,
    InfoBarIdentifier.AUTOFILL_CC_INFOBAR_DELEGATE_MOBILE,
    InfoBarIdentifier.TRANSLATE_INFOBAR_DELEGATE_NON_AURA,
    InfoBarIdentifier.RE_SIGN_IN_INFOBAR_DELEGATE_IOS,
    InfoBarIdentifier.SHOW_PASSKIT_ERROR_INFOBAR_DELEGATE_IOS,
    InfoBarIdentifier.SYNC_ERROR_INFOBAR_DELEGATE_IOS,
    InfoBarIdentifier.UPGRADE_INFOBAR_DELEGATE_IOS,
    InfoBarIdentifier.DANGEROUS_DOWNLOAD_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.UPDATE_PASSWORD_INFOBAR_DELEGATE_MOBILE,
    InfoBarIdentifier.AUTOFILL_CREDIT_CARD_FILLING_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.ADS_BLOCKED_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.INSTANT_APPS_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.GROUPED_PERMISSION_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.OFFLINE_PAGE_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.SEARCH_GEOLOCATION_DISCLOSURE_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.AUTOMATION_INFOBAR_DELEGATE, InfoBarIdentifier.READER_MODE_INFOBAR_ANDROID,
    InfoBarIdentifier.VR_FEEDBACK_INFOBAR_ANDROID,
    InfoBarIdentifier.FRAMEBUST_BLOCK_INFOBAR_ANDROID, InfoBarIdentifier.SURVEY_INFOBAR_ANDROID,
    InfoBarIdentifier.NEAR_OOM_INFOBAR_ANDROID,
    InfoBarIdentifier.INSTALLABLE_AMBIENT_BADGE_INFOBAR_DELEGATE,
    InfoBarIdentifier.DOWNLOAD_PROGRESS_INFOBAR_ANDROID,
    InfoBarIdentifier.BLOATED_RENDERER_INFOBAR_DELEGATE,
    InfoBarIdentifier.NEAR_OOM_REDUCTION_INFOBAR_ANDROID,
    InfoBarIdentifier.SEND_TAB_TO_SELF_INFOBAR_DELEGATE,
    InfoBarIdentifier.TAB_SHARING_INFOBAR_DELEGATE, InfoBarIdentifier.SAFETY_TIP_INFOBAR_DELEGATE,
    InfoBarIdentifier.WEBOTP_SERVICE_INFOBAR_DELEGATE,
    InfoBarIdentifier.KNOWN_INTERCEPTION_DISCLOSURE_INFOBAR_DELEGATE,
    InfoBarIdentifier.SYNC_ERROR_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.MIXED_CONTENT_DOWNLOAD_INFOBAR_DELEGATE_ANDROID,
    InfoBarIdentifier.CONDITIONAL_TAB_STRIP_INFOBAR_ANDROID,
    InfoBarIdentifier.LITE_MODE_HTTPS_IMAGE_COMPRESSION_INFOBAR_ANDROID,
    InfoBarIdentifier.EXPERIMENTAL_INFOBAR_DELEGATE_LACROS,
    InfoBarIdentifier.AUTOFILL_OFFER_NOTIFICATION_INFOBAR_DELEGATE,
    InfoBarIdentifier.AUTOFILL_ADDRESS_PROFILE_INFOBAR_DELEGATE_IOS,
    InfoBarIdentifier.ADD_TO_READING_LIST_IOS, InfoBarIdentifier.IOS_PERMISSIONS_INFOBAR_DELEGATE,
    InfoBarIdentifier.SUPPORTED_LINKS_INFOBAR_DELEGATE_CHROMEOS,
    InfoBarIdentifier.AUTOFILL_VIRTUAL_CARD_ENROLLMENT_INFOBAR_DELEGATE_MOBILE,
    InfoBarIdentifier.BASIC_PRINT_DEPRECATED_ACCELERATOR_DELEGATE
})
@Retention(RetentionPolicy.SOURCE)
public @interface InfoBarIdentifier {
  int INVALID = -1;
  int TEST_INFOBAR = 0;
  /**
   * Removed: APP_BANNER_INFOBAR_DELEGATE = 1, Removed: APP_BANNER_INFOBAR_DELEGATE_DESKTOP = 2,
   * Removed: ANDROID_DOWNLOAD_MANAGER_DUPLICATE_INFOBAR_DELEGATE = 3,
   */
  int DUPLICATE_DOWNLOAD_INFOBAR_DELEGATE_ANDROID = 4;
  /**
   * Removed: DOWNLOAD_REQUEST_INFOBAR_DELEGATE_ANDROID = 5, Removed: FULLSCREEN_INFOBAR_DELEGATE =
   * 6,
   */
  int HUNG_PLUGIN_INFOBAR_DELEGATE = 7;
  int HUNG_RENDERER_INFOBAR_DELEGATE_ANDROID = 8;
  /**
   * Removed: MEDIA_STREAM_INFOBAR_DELEGATE_ANDROID = 9, Removed: MEDIA_THROTTLE_INFOBAR_DELEGATE =
   * 10, Removed: REQUEST_QUOTA_INFOBAR_DELEGATE = 11,
   */
  int DEV_TOOLS_INFOBAR_DELEGATE = 12;
  int EXTENSION_DEV_TOOLS_INFOBAR_DELEGATE = 13;
  int INCOGNITO_CONNECTABILITY_INFOBAR_DELEGATE = 14;
  int THEME_INSTALLED_INFOBAR_DELEGATE = 15;
  /**
   * Removed: GEOLOCATION_INFOBAR_DELEGATE_ANDROID = 16,
   */
  int THREE_D_API_INFOBAR_DELEGATE = 17;
  /**
   * Removed: INSECURE_CONTENT_INFOBAR_DELEGATE = 18, Removed:
   * MIDI_PERMISSION_INFOBAR_DELEGATE_ANDROID = 19, Removed:
   * PROTECTED_MEDIA_IDENTIFIER_INFOBAR_DELEGATE_ANDROID = 20,
   */
  int NACL_INFOBAR_DELEGATE = 21;
  /**
   * Removed: DATA_REDUCTION_PROXY_INFOBAR_DELEGATE_ANDROID = 22, Removed:
   * NOTIFICATION_PERMISSION_INFOBAR_DELEGATE = 23, Removed: AUTO_SIGNIN_FIRST_RUN_INFOBAR_DELEGATE
   * = 24,
   */
  int GENERATED_PASSWORD_SAVED_INFOBAR_DELEGATE_ANDROID = 25;
  int SAVE_PASSWORD_INFOBAR_DELEGATE_MOBILE = 26;
  /**
   * Removed: PEPPER_BROKER_INFOBAR_DELEGATE = 27,
   */
  int PERMISSION_UPDATE_INFOBAR_DELEGATE_ANDROID = 28;
  /**
   * Removed: DURABLE_STORAGE_PERMISSION_INFOBAR_DELEGATE_ANDROID = 29, Removed:
   * NPAPI_REMOVAL_INFOBAR_DELEGATE = 30,
   */
  int OUTDATED_PLUGIN_INFOBAR_DELEGATE = 31;
  /**
   * Removed: PLUGIN_METRO_MODE_INFOBAR_DELEGATE = 32,
   */
  int RELOAD_PLUGIN_INFOBAR_DELEGATE = 33;
  int PLUGIN_OBSERVER_INFOBAR_DELEGATE = 34;
  /**
   * Removed: SSL_ADD_CERTIFICATE = 35, Removed: SSL_ADD_CERTIFICATE_INFOBAR_DELEGATE = 36,
   */
  int POPUP_BLOCKED_INFOBAR_DELEGATE_MOBILE = 37;
  int FILE_ACCESS_DISABLED_INFOBAR_DELEGATE = 38;
  int KEYSTONE_PROMOTION_INFOBAR_DELEGATE_MAC = 39;
  int COLLECTED_COOKIES_INFOBAR_DELEGATE = 40;
  int INSTALLATION_ERROR_INFOBAR_DELEGATE = 41;
  int ALTERNATE_NAV_INFOBAR_DELEGATE = 42;
  int BAD_FLAGS_INFOBAR_DELEGATE = 43;
  int DEFAULT_BROWSER_INFOBAR_DELEGATE = 44;
  int GOOGLE_API_KEYS_INFOBAR_DELEGATE = 45;
  int OBSOLETE_SYSTEM_INFOBAR_DELEGATE = 46;
  int SESSION_CRASHED_INFOBAR_DELEGATE_IOS = 47;
  int PAGE_INFO_INFOBAR_DELEGATE = 48;
  int AUTOFILL_CC_INFOBAR_DELEGATE_MOBILE = 49;
  int TRANSLATE_INFOBAR_DELEGATE_NON_AURA = 50;
  /**
   * Removed: IOS_CHROME_SAVE_PASSWORD_INFOBAR_DELEGATE = 51, Removed:
   * NATIVE_APP_INSTALLER_INFOBAR_DELEGATE = 52, Removed: NATIVE_APP_LAUNCHER_INFOBAR_DELEGATE = 53,
   * Removed: NATIVE_APP_OPEN_POLICY_INFOBAR_DELEGATE = 54,
   */
  int RE_SIGN_IN_INFOBAR_DELEGATE_IOS = 55;
  int SHOW_PASSKIT_ERROR_INFOBAR_DELEGATE_IOS = 56;
  /**
   * Removed: READER_MODE_INFOBAR_DELEGATE_IOS = 57,
   */
  int SYNC_ERROR_INFOBAR_DELEGATE_IOS = 58;
  int UPGRADE_INFOBAR_DELEGATE_IOS = 59;
  /**
   * Removed: WINDOW_ERROR_INFOBAR_DELEGATE_ANDROID = 60,
   */
  int DANGEROUS_DOWNLOAD_INFOBAR_DELEGATE_ANDROID = 61;
  /**
   * Removed: DESKTOP_SEARCH_REDIRECTION_INFOBAR_DELEGATE = 62,
   */
  int UPDATE_PASSWORD_INFOBAR_DELEGATE_MOBILE = 63;
  /**
   * Removed: DATA_REDUCTION_PROMO_INFOBAR_DELEGATE_ANDROID = 64,
   */
  int AUTOFILL_CREDIT_CARD_FILLING_INFOBAR_DELEGATE_ANDROID = 65;
  int ADS_BLOCKED_INFOBAR_DELEGATE_ANDROID = 66;
  int INSTANT_APPS_INFOBAR_DELEGATE_ANDROID = 67;
  /**
   * Removed: DATA_REDUCTION_PROXY_PREVIEW_INFOBAR_DELEGATE = 68, Removed:
   * SCREEN_CAPTURE_INFOBAR_DELEGATE_ANDROID = 69,
   */
  int GROUPED_PERMISSION_INFOBAR_DELEGATE_ANDROID = 70;
  int OFFLINE_PAGE_INFOBAR_DELEGATE_ANDROID = 71;
  int SEARCH_GEOLOCATION_DISCLOSURE_INFOBAR_DELEGATE_ANDROID = 72;
  int AUTOMATION_INFOBAR_DELEGATE = 73;
  /**
   * Removed: VR_SERVICES_UPGRADE_ANDROID = 74,
   */
  int READER_MODE_INFOBAR_ANDROID = 75;
  int VR_FEEDBACK_INFOBAR_ANDROID = 76;
  int FRAMEBUST_BLOCK_INFOBAR_ANDROID = 77;
  int SURVEY_INFOBAR_ANDROID = 78;
  int NEAR_OOM_INFOBAR_ANDROID = 79;
  int INSTALLABLE_AMBIENT_BADGE_INFOBAR_DELEGATE = 80;
  /**
   * Removed: PAGE_LOAD_CAPPING_INFOBAR_DELEGATE = 81,
   */
  int DOWNLOAD_PROGRESS_INFOBAR_ANDROID = 82;
  /**
   * Removed: AR_CORE_UPGRADE_ANDROID = 83,
   */
  int BLOATED_RENDERER_INFOBAR_DELEGATE = 84;
  /**
   * Removed: SUPERVISED_USERS_DEPRECATED_INFOBAR_DELEGATE = 85,
   */
  int NEAR_OOM_REDUCTION_INFOBAR_ANDROID = 86;
  /**
   * Removed: LITE_PAGE_PREVIEWS_INFOBAR = 87, Removed: MODULE_INSTALL_FAILURE_INFOBAR_ANDROID = 88,
   * Removed: INLINE_UPDATE_READY_INFOBAR_ANDROID = 89, Removed:
   * INLINE_UPDATE_FAILED_INFOBAR_ANDROID = 90, Removed: FLASH_DEPRECATION_INFOBAR_DELEGATE = 91,
   */
  int SEND_TAB_TO_SELF_INFOBAR_DELEGATE = 92;
  int TAB_SHARING_INFOBAR_DELEGATE = 93;
  int SAFETY_TIP_INFOBAR_DELEGATE = 94;
  int WEBOTP_SERVICE_INFOBAR_DELEGATE = 95;
  int KNOWN_INTERCEPTION_DISCLOSURE_INFOBAR_DELEGATE = 96;
  int SYNC_ERROR_INFOBAR_DELEGATE_ANDROID = 97;
  int MIXED_CONTENT_DOWNLOAD_INFOBAR_DELEGATE_ANDROID = 98;
  int CONDITIONAL_TAB_STRIP_INFOBAR_ANDROID = 99;
  int LITE_MODE_HTTPS_IMAGE_COMPRESSION_INFOBAR_ANDROID = 100;
  /**
   * Removed: SYSTEM_INFOBAR_DELEGATE_MAC = 101,
   */
  int EXPERIMENTAL_INFOBAR_DELEGATE_LACROS = 102;
  /**
   * Removed: ROSETTA_REQUIRED_INFOBAR_DELEGATE = 103, Removed: WEBID_PERMISSION_INFOBAR_DELEGATE =
   * 104,
   */
  int AUTOFILL_OFFER_NOTIFICATION_INFOBAR_DELEGATE = 105;
  int AUTOFILL_ADDRESS_PROFILE_INFOBAR_DELEGATE_IOS = 106;
  int ADD_TO_READING_LIST_IOS = 107;
  int IOS_PERMISSIONS_INFOBAR_DELEGATE = 108;
  int SUPPORTED_LINKS_INFOBAR_DELEGATE_CHROMEOS = 109;
  int AUTOFILL_VIRTUAL_CARD_ENROLLMENT_INFOBAR_DELEGATE_MOBILE = 110;
  int BASIC_PRINT_DEPRECATED_ACCELERATOR_DELEGATE = 111;
}
