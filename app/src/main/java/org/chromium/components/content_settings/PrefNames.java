// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.content_settings;

/** Contains content settings related preference names (keys). */
public final class PrefNames {


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../components/content_settings/core/common/pref_names.cc
    // Into
    //     ../../components/content_settings/android/java_templates/PrefNames.java.tmpl

    // CookieControlsMode enum value that decides when the cookie controls UI is
    // enabled. This will block third-party cookies similar to
    // kBlockThirdPartyCookies but with a new UI.
    public static final String COOKIE_CONTROLS_MODE = "profile.cookie_controls_mode";

    // Version of the pattern format used to define content settings.
    public static final String CONTENT_SETTINGS_VERSION = "profile.content_settings.pref_version";

    // Integer that specifies the index of the tab the user was on when they
    // last visited the content settings window.
    public static final String CONTENT_SETTINGS_WINDOW_LAST_TAB_INDEX = "content_settings_window.last_tab_index";

    // Preferences that are exclusively used to store managed values for default
    // content settings.
    public static final String MANAGED_DEFAULT_ADS_SETTING = "profile.managed_default_content_settings.ads";


    public static final String MANAGED_DEFAULT_CLIPBOARD_SETTING = "profile.managed_default_content_settings.clipboard";


    public static final String MANAGED_DEFAULT_COOKIES_SETTING = "profile.managed_default_content_settings.cookies";


    public static final String MANAGED_DEFAULT_GEOLOCATION_SETTING = "profile.managed_default_content_settings.geolocation";


    public static final String MANAGED_DEFAULT_IMAGES_SETTING = "profile.managed_default_content_settings.images";


    public static final String MANAGED_DEFAULT_INSECURE_CONTENT_SETTING = "profile.managed_default_content_settings.insecure_content";


    public static final String MANAGED_DEFAULT_JAVA_SCRIPT_SETTING = "profile.managed_default_content_settings.javascript";


    public static final String MANAGED_DEFAULT_NOTIFICATIONS_SETTING = "profile.managed_default_content_settings.notifications";


    public static final String MANAGED_DEFAULT_MEDIA_STREAM_SETTING = "profile.managed_default_content_settings.media_stream";


    public static final String MANAGED_DEFAULT_POPUPS_SETTING = "profile.managed_default_content_settings.popups";


    public static final String MANAGED_DEFAULT_SENSORS_SETTING = "profile.managed_default_content_settings.sensors";


    public static final String MANAGED_DEFAULT_WEB_BLUETOOTH_GUARD_SETTING = "profile.managed_default_content_settings.web_bluetooth_guard";


    public static final String MANAGED_DEFAULT_WEB_USB_GUARD_SETTING = "profile.managed_default_content_settings.web_usb_guard";


    public static final String MANAGED_DEFAULT_FILE_SYSTEM_READ_GUARD_SETTING = "profile.managed_default_content_settings.file_system_read_guard";


    public static final String MANAGED_DEFAULT_FILE_SYSTEM_WRITE_GUARD_SETTING = "profile.managed_default_content_settings.file_system_write_guard";


    public static final String MANAGED_DEFAULT_SERIAL_GUARD_SETTING = "profile.managed_default_content_settings.serial_guard";


    public static final String MANAGED_DEFAULT_INSECURE_PRIVATE_NETWORK_SETTING = "profile.managed_default_content_settings.insecure_private_network";


    public static final String MANAGED_DEFAULT_JAVA_SCRIPT_JIT_SETTING = "profile.managed_default_content_settings.javascript_jit";


    public static final String MANAGED_DEFAULT_WEB_HID_GUARD_SETTING = "profile.managed_default_content_settings.web_hid_guard";


    public static final String MANAGED_DEFAULT_WINDOW_PLACEMENT_SETTING = "profile.managed_default_content_settings.window_placement";


    public static final String MANAGED_DEFAULT_LOCAL_FONTS_SETTING = "profile.managed_default_content_settings.local_fonts";

    // Preferences that are exclusively used to store managed
    // content settings patterns.
    public static final String MANAGED_CLIPBOARD_ALLOWED_FOR_URLS = "profile.managed_clipboard_allowed_for_urls";


    public static final String MANAGED_CLIPBOARD_BLOCKED_FOR_URLS = "profile.managed_clipboard_blocked_for_urls";


    public static final String MANAGED_AUTO_SELECT_CERTIFICATE_FOR_URLS = "profile.managed_auto_select_certificate_for_urls";


    public static final String MANAGED_COOKIES_ALLOWED_FOR_URLS = "profile.managed_cookies_allowed_for_urls";


    public static final String MANAGED_COOKIES_BLOCKED_FOR_URLS = "profile.managed_cookies_blocked_for_urls";


    public static final String MANAGED_COOKIES_SESSION_ONLY_FOR_URLS = "profile.managed_cookies_sessiononly_for_urls";


    public static final String MANAGED_GET_DISPLAY_MEDIA_SET_SELECT_ALL_SCREENS_ALLOWED_FOR_URLS = "profile.managed_get_display_media_set_select_all_screens_allowed_for_urls";


    public static final String MANAGED_IMAGES_ALLOWED_FOR_URLS = "profile.managed_images_allowed_for_urls";


    public static final String MANAGED_IMAGES_BLOCKED_FOR_URLS = "profile.managed_images_blocked_for_urls";


    public static final String MANAGED_INSECURE_CONTENT_ALLOWED_FOR_URLS = "profile.managed_insecure_content_allowed_for_urls";


    public static final String MANAGED_INSECURE_CONTENT_BLOCKED_FOR_URLS = "profile.managed_insecure_content_blocked_for_urls";


    public static final String MANAGED_JAVA_SCRIPT_ALLOWED_FOR_URLS = "profile.managed_javascript_allowed_for_urls";


    public static final String MANAGED_JAVA_SCRIPT_BLOCKED_FOR_URLS = "profile.managed_javascript_blocked_for_urls";


    public static final String MANAGED_NOTIFICATIONS_ALLOWED_FOR_URLS = "profile.managed_notifications_allowed_for_urls";


    public static final String MANAGED_NOTIFICATIONS_BLOCKED_FOR_URLS = "profile.managed_notifications_blocked_for_urls";


    public static final String MANAGED_POPUPS_ALLOWED_FOR_URLS = "profile.managed_popups_allowed_for_urls";


    public static final String MANAGED_POPUPS_BLOCKED_FOR_URLS = "profile.managed_popups_blocked_for_urls";


    public static final String MANAGED_SENSORS_ALLOWED_FOR_URLS = "profile.managed_sensors_allowed_for_urls";


    public static final String MANAGED_SENSORS_BLOCKED_FOR_URLS = "profile.managed_sensors_blocked_for_urls";


    public static final String MANAGED_WEB_USB_ALLOW_DEVICES_FOR_URLS = "profile.managed_web_usb_allow_devices_for_urls";


    public static final String MANAGED_WEB_USB_ASK_FOR_URLS = "profile.managed_web_usb_ask_for_urls";


    public static final String MANAGED_WEB_USB_BLOCKED_FOR_URLS = "profile.managed_web_usb_blocked_for_urls";


    public static final String MANAGED_FILE_HANDLING_ALLOWED_FOR_URLS = "profile.managed_file_handling_allowed_for_urls";


    public static final String MANAGED_FILE_HANDLING_BLOCKED_FOR_URLS = "profile.managed_file_handling_blocked_for_urls";


    public static final String MANAGED_FILE_SYSTEM_READ_ASK_FOR_URLS = "profile.managed_file_system_read_ask_for_urls";


    public static final String MANAGED_FILE_SYSTEM_READ_BLOCKED_FOR_URLS = "profile.managed_file_system_read_blocked_for_urls";


    public static final String MANAGED_FILE_SYSTEM_WRITE_ASK_FOR_URLS = "profile.managed_file_system_write_ask_for_urls";


    public static final String MANAGED_FILE_SYSTEM_WRITE_BLOCKED_FOR_URLS = "profile.managed_file_system_write_blocked_for_urls";


    public static final String MANAGED_LEGACY_COOKIE_ACCESS_ALLOWED_FOR_DOMAINS = "profile.managed_legacy_cookie_access_allowed_for_domains";


    public static final String MANAGED_SERIAL_ASK_FOR_URLS = "profile.managed_serial_ask_for_urls";


    public static final String MANAGED_SERIAL_BLOCKED_FOR_URLS = "profile.managed_serial_blocked_for_urls";


    public static final String MANAGED_INSECURE_PRIVATE_NETWORK_ALLOWED_FOR_URLS = "profile.managed_insecure_private_network_allowed_for_urls";


    public static final String MANAGED_JAVA_SCRIPT_JIT_ALLOWED_FOR_SITES = "profile.managed_javascript_jit_allowed_for_sites";


    public static final String MANAGED_JAVA_SCRIPT_JIT_BLOCKED_FOR_SITES = "profile.managed_javascript_jit_blocked_for_sites";


    public static final String MANAGED_WEB_HID_ASK_FOR_URLS = "profile.managed_web_hid_ask_for_urls";


    public static final String MANAGED_WEB_HID_BLOCKED_FOR_URLS = "profile.managed_web_hid_blocked_for_urls";


    public static final String MANAGED_WINDOW_PLACEMENT_ALLOWED_FOR_URLS = "profile.managed_window_placement_allowed_for_urls";


    public static final String MANAGED_WINDOW_PLACEMENT_BLOCKED_FOR_URLS = "profile.managed_window_placement_blocked_for_urls";


    public static final String MANAGED_LOCAL_FONTS_ALLOWED_FOR_URLS = "profile.managed_local_fonts_allowed_for_urls";


    public static final String MANAGED_LOCAL_FONTS_BLOCKED_FOR_URLS = "profile.managed_local_fonts_blocked_for_urls";

    // Boolean indicating whether the quiet UI is enabled for notification
    // permission requests.
    public static final String ENABLE_QUIET_NOTIFICATION_PERMISSION_UI = "profile.content_settings.enable_quiet_permission_ui.notifications";

    // Time value indicating when the quiet notification UI was last disabled by the
    // user. Only permission action history after this point is taken into account
    // for adaptive quiet UI activation.
    public static final String QUIET_NOTIFICATION_PERMISSION_UI_DISABLED_TIME = "profile.content_settings.disable_quiet_permission_ui_time.notifications";

    // Enable vibration for web notifications.
    public static final String NOTIFICATIONS_VIBRATE_ENABLED = "notifications.vibrate_enabled";

    // Peripheral setting for request desktop site. When enabled, we will always
    // request desktop site if a keyboard, trackpad, or mouse is attached.
    public static final String DESKTOP_SITE_PERIPHERAL_SETTING_ENABLED = "desktop_site.peripheral_setting";

    // Display setting for request desktop site. When enabled, we will always
    // request desktop site if a monitor is connected.
    public static final String DESKTOP_SITE_DISPLAY_SETTING_ENABLED = "desktop_site.display_setting";

    // Prevents instantiation.
    private PrefNames() {}
}
