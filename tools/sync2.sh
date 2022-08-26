#!/bin/bash

set -e

PRO_DIR="/Users/shuxinghu/Desktop/chromeTemp1"
BASE_DIR="/Users/shuxinghu/Desktop/chromium/src"
RELEASE_DIR="${BASE_DIR}/out/Default"
APP_DIR="${PRO_DIR}/app"
LIB_DIR="${BASE_DIR}/out/Default/lib.java"
MODULES_DIR="${PRO_DIR}"

copyFiles(){
  if [ -d $1 ]; then
      cp -r $1/* ${src_dir}
  else
      echo $1
  fi
}
sync_chrome() {
  mkdir -p ${APP_DIR}/src/main/java
  mkdir -p ${APP_DIR}/libs
	local src_dir="${APP_DIR}/src/main/java"
  mkdir -p ${APP_DIR}/src/main
  mkdir -p ${APP_DIR}/src/main/res_gen
	local res_dir="${APP_DIR}/src/main"
  cp -r ${BASE_DIR}//chrome/android/java/res_base \
        ${BASE_DIR}/chrome/android/java/res_chromium \
        ${BASE_DIR}/chrome/android/java/res_chromium_base \
        ${BASE_DIR}/chrome/android/java/res_vr \
        ${BASE_DIR}/chrome/android/java/res_template \
        "$res_dir"
}

sync_base_res() {
    mkdir -p ${MODULES_DIR}/base_res
#    mkdir -p ${MODULES_DIR}/base_res/xml
    local base_res_dir="${MODULES_DIR}/base_res"
    cp -r ${BASE_DIR}/chrome/android/java/res \
          ${RELEASE_DIR}/gen/components/browser_ui/strings/android/browser_ui_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/components/strings/java/res/* \
          ${RELEASE_DIR}/gen/chrome/browser/password_check/android/internal/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/internal/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/android/features/tab_ui/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/browser/touch_to_fill/android/internal/java_strings_grd_grit_output/* \
          ${BASE_DIR}/components/blocked_content/android/res/* \
          ${RELEASE_DIR}/gen/chrome/java/res/* \
          ${RELEASE_DIR}/gen/components/webapps/browser/android/webapps_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/app/policy/android/* \
          ${RELEASE_DIR}/gen/components/permissions/android/permissions_strings_grd_grit_output/* \
          "$base_res_dir"
          #先解压压缩包
      cp -r ${RELEASE_DIR}/resource_zips/chrome/android/ui_locale_string_resources/* "$base_res_dir"
}

sync_base() {
    mkdir -p ${MODULES_DIR}/base/src/main/res
    local base_res_dir="${MODULES_DIR}/base/src/main/res"
    cp -r ${RELEASE_DIR}/gen/chrome/android/templates/chrome_version_xml/res/* \
          "$base_res_dir"
}

sync_assets() {
	local asset_dir="${APP_DIR}/src/main/assets"
	mkdir -p "$asset_dir"
	mkdir -p "${asset_dir}/locales"

	#cp ${RELEASE_DIR}/*.dat \
	cp ${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/*.pak \
		"$asset_dir"

	cp ${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/locales/*.pak \
		"${asset_dir}/locales"
	cp ${RELEASE_DIR}/snapshot_blob.bin "$asset_dir"/snapshot_blob_32.bin
}

sync_aidl() {
    mkdir -p ${APP_DIR}/src/main/aidl
    mkdir -p ${APP_DIR}/src/main/aidl/com/google/vr/keyboard
	  local aidl_dir="${APP_DIR}/src/main/aidl"

    cp -r ${BASE_DIR}/third_party/gvr-android-keyboard/com/google/vr/keyboard/IGvrKeyboardLoader.aidl \
          ${APP_DIR}/src/main/aidl/com/google/vr/keyboard

    local runtime_library_aidl="${APP_DIR}/src/main/aidl/org/chromium/webapk/lib/runtime_library"
    mkdir -p "$runtime_library_aidl"
    mv -f ${APP_DIR}/src/main/java/org/chromium/webapk/lib/runtime_library/*.aidl \
		  "$runtime_library_aidl"

}

sync_ui() {
	mkdir -p ${MODULES_DIR}/ui/src/main/res
cp -r ${BASE_DIR}/ui/android/java/res/* \
		${RELEASE_DIR}/gen/ui/android/ui_strings_grd_grit_output/* \
		${RELEASE_DIR}/gen/chrome/browser/ui/android/strings/ui_strings_grd_grit_output/* \
		"${MODULES_DIR}/ui/src/main/res"
}

sync_components(){
  mkdir -p ${MODULES_DIR}/components/autofill/src/main/res
  cp -r ${BASE_DIR}/components/autofill/android/java/res/* \
        ${RELEASE_DIR}/gen/components/autofill/android/autofill_strings_grd_grit_output/* \
        ${MODULES_DIR}/components/autofill/src/main/res

  mkdir -p ${MODULES_DIR}/components/embedder_support/src/main/res
  cp -r ${BASE_DIR}/components/embedder_support/android/java/res/* \
        ${MODULES_DIR}/components/embedder_support/src/main/res

  mkdir -p ${MODULES_DIR}/components/messages/src/main/res
  cp -r ${BASE_DIR}/components/messages/android/java/res/* \
        ${MODULES_DIR}/components/messages/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_widget/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/widget/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_widget/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_styles/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/styles/android/java/res/* \
        ${BASE_DIR}/components/browser_ui/styles/android/java/res-arcore/* \
        ${MODULES_DIR}/components/browser_ui_styles/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_settings/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/settings/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_settings/src/main/res

  mkdir -p ${MODULES_DIR}/components/infobars/src/main/res
  cp -r ${BASE_DIR}/components/infobars/android/res/* \
        ${MODULES_DIR}/components/infobars/src/main/res

  mkdir -p ${MODULES_DIR}/components/permissions/src/main/res
  cp -r ${BASE_DIR}/components/permissions/android/res/* \
        ${MODULES_DIR}/components/permissions/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_modaldialog/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/modaldialog/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_modaldialog/src/main/res

  mkdir -p ${MODULES_DIR}/components/omnibox/src/main/res
  cp -r ${BASE_DIR}/components/omnibox/browser/android/java/res/* \
        ${MODULES_DIR}/components/omnibox/src/main/res

  mkdir -p ${MODULES_DIR}/components/payments/src/main/res
  cp -r ${BASE_DIR}/components/payments/content/android/java/res/* \
        ${MODULES_DIR}/components/payments/src/main/res

  #mkdir -p ${MODULES_DIR}/components/payments/src/main/google_pay_res
  #cp -r ${BASE_DIR}/components/payments/content/android/google_pay_res/* \
   #     ${MODULES_DIR}/components/payments/src/main/google_pay_res

  mkdir -p ${MODULES_DIR}/components/browser_ui_contacts_picker/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/contacts_picker/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_contacts_picker/src/main/res

  mkdir -p ${MODULES_DIR}/components/page_info/src/main/res
  cp -r ${BASE_DIR}/components/page_info/android/java/res/* \
        ${MODULES_DIR}/components/page_info/src/main/res

  mkdir -p ${MODULES_DIR}/components/translate/src/main/res
  cp -r ${BASE_DIR}/components/translate/content/android/java/res/* \
        ${MODULES_DIR}/components/translate/src/main/res

  mkdir -p ${MODULES_DIR}/components/find_in_page/src/main/res
  cp -r ${BASE_DIR}/components/find_in_page/android/java/res/* \
        ${MODULES_DIR}/components/find_in_page/src/main/res

  mkdir -p ${MODULES_DIR}/components/media_router/src/main/res
  cp -r ${BASE_DIR}/components/media_router/browser/android/java/res/* \
        ${RELEASE_DIR}/gen/components/media_router/browser/android/java_strings_grd_grit_output/* \
        ${MODULES_DIR}/components/media_router/src/main/res

  mkdir -p ${MODULES_DIR}/components/subresource_filter/src/main/res
  cp -r ${BASE_DIR}/components/subresource_filter/android/java/res/* \
        ${MODULES_DIR}/components/subresource_filter/src/main/res

  mkdir -p ${MODULES_DIR}/components/embedder_support/src/main/res
  cp -r ${RELEASE_DIR}/gen/components/embedder_support/android/web_contents_delegate_strings_grd_grit_output/* \
        ${MODULES_DIR}/components/embedder_support/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_site_settings/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/site_settings/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_site_settings/src/main/res

  mkdir -p ${MODULES_DIR}/components/javascript_dialogs/src/main/res
  cp -r ${BASE_DIR}/components/javascript_dialogs/android/java/res/* \
        ${RELEASE_DIR}/gen/components/javascript_dialogs/android/javascript_dialogs_strings_grd_grit_output/* \
        ${MODULES_DIR}/components/javascript_dialogs/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_photo_picker/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/photo_picker/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_photo_picker/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_media/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/media/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_media/src/main/res

  mkdir -p ${MODULES_DIR}/components/webrtc/src/main/res
  cp -r ${BASE_DIR}/components/webrtc/android/java/res/* \
        ${MODULES_DIR}/components/webrtc/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_http_auth/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/http_auth/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_http_auth/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_share/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/share/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_share/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_bottomsheet/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/bottomsheet/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_bottomsheet/src/main/res

  mkdir -p ${MODULES_DIR}/components/webapk_lib_common/src/main/res
  cp -r ${BASE_DIR}/components/webapk/android/libs/common/res_splash/* \
        ${MODULES_DIR}/components/webapk_lib_common/src/main/res

  mkdir -p ${MODULES_DIR}/components/webapps/src/main/res
  cp -r ${BASE_DIR}/components/webapps/browser/android/java/res/* \
        ${MODULES_DIR}/components/webapps/src/main/res
}

sync_browser(){
  #mkdir -p ${MODULES_DIR}/browser/autofill_assistant/src/main/res
 # cp -r ${BASE_DIR}/chrome/android/features/autofill_assistant/java/res/* \
  #      ${BASE_DIR}/chrome/android/features/autofill_assistant/java/res_poodle/* \
   #     ${MODULES_DIR}/browser/autofill_assistant/src/main/res

  mkdir -p ${MODULES_DIR}/browser/keyboard_accessory/src/main/res
  cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/internal/java/res/* \
        ${MODULES_DIR}/browser/keyboard_accessory/src/main/res

  mkdir -p ${MODULES_DIR}/browser/feed/src/main/res
  cp -r ${BASE_DIR}/chrome/android/feed/core/java/res/* \
        ${MODULES_DIR}/browser/feed/src/main/res

  mkdir -p ${MODULES_DIR}/browser/ui_favicon/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/favicon/java/res/* \
        ${MODULES_DIR}/browser/ui_favicon/src/main/res

  mkdir -p ${MODULES_DIR}/browser/share/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/share/android/java/res/* \
        ${MODULES_DIR}/browser/share/src/main/res

  mkdir -p ${MODULES_DIR}/browser/video_tutorials/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/video_tutorials/android/java/res/* \
        ${MODULES_DIR}/browser/video_tutorials/src/main/res

  mkdir -p ${MODULES_DIR}/browser/download/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/download/android/java/res/* \
        ${MODULES_DIR}/browser/download/src/main/res

  mkdir -p ${MODULES_DIR}/browser/feedback/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/feedback/android/java/res/* \
        ${MODULES_DIR}/browser/feedback/src/main/res

  mkdir -p ${MODULES_DIR}/browser/password_check/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/password_check/android/java/res/* \
        ${MODULES_DIR}/browser/password_check/src/main/res

  mkdir -p ${MODULES_DIR}/browser/image_descriptions/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/image_descriptions/android/java/res/* \
        ${MODULES_DIR}/browser/image_descriptions/src/main/res

  mkdir -p ${MODULES_DIR}/browser/user_education/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/user_education/java/res/* \
        ${MODULES_DIR}/browser/user_education/src/main/res

  mkdir -p ${MODULES_DIR}/browser/touch_to_fill/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/touch_to_fill/android/internal/java/res/* \
        ${MODULES_DIR}/browser/touch_to_fill/src/main/res

  mkdir -p ${MODULES_DIR}/browser/safety_check/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/safety_check/android/java/res/* \
        ${MODULES_DIR}/browser/safety_check/src/main/res

  mkdir -p ${MODULES_DIR}/browser/password_check_internal/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/password_check/android/internal/java/res/* \
        ${MODULES_DIR}/browser/password_check_internal/src/main/res

   mkdir -p ${MODULES_DIR}/browser/password_check_internal/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/password_check/android/internal/java/res/* \
        ${MODULES_DIR}/browser/password_check_internal/src/main/res

   mkdir -p ${MODULES_DIR}/browser/video_tutorials/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/video_tutorials/internal/android/java/res/* \
        ${MODULES_DIR}/browser/video_tutorials/src/main/res

     mkdir -p ${MODULES_DIR}/browser/privacy_secure_dns/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/privacy/java/res/* \
        ${MODULES_DIR}/browser/privacy_secure_dns/src/main/res

  mkdir -p ${MODULES_DIR}/browser/ui_appmenu_internal/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/internal/java/res/* \
        ${MODULES_DIR}/browser/ui_appmenu_internal/src/main/res

  mkdir -p ${MODULES_DIR}/browser/ui_appmenu/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/res/* \
        ${MODULES_DIR}/browser/ui_appmenu/src/main/res

  mkdir -p ${MODULES_DIR}/browser/ui_appmenu/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/res/* \
        ${MODULES_DIR}/browser/ui_appmenu/src/main/res

  mkdir -p ${MODULES_DIR}/browser/safe_browsing_settings/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/safe_browsing/android/java/res/* \
        ${MODULES_DIR}/browser/safe_browsing_settings/src/main/res

  mkdir -p ${MODULES_DIR}/browser/theme/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/theme/java/res/* \
        ${MODULES_DIR}/browser/theme/src/main/res

  mkdir -p ${MODULES_DIR}/browser/toolbar/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/toolbar/java/res/* \
        ${MODULES_DIR}/browser/toolbar/src/main/res

  mkdir -p ${MODULES_DIR}/browser/language/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/language/android/java/res/* \
        ${MODULES_DIR}/browser/language/src/main/res

  mkdir -p ${MODULES_DIR}/browser/download_home/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/download/internal/android/java/res/* \
        ${MODULES_DIR}/browser/download_home/src/main/res

  mkdir -p ${MODULES_DIR}/browser/signin_services/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/signin/services/android/java/res/* \
        ${MODULES_DIR}/browser/signin_services/src/main/res

  #mkdir -p ${MODULES_DIR}/browser/signin_ui/src/main/res
  #cp -r ${BASE_DIR}/chrome/browser/signin/ui/android/java/res/* \
   #     ${MODULES_DIR}/browser/signin_ui/src/main/res

   mkdir -p ${MODULES_DIR}/browser/incognito_interstitial/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/incognito/android/java/res/* \
        ${MODULES_DIR}/browser/incognito_interstitial/src/main/res

  # mkdir -p ${MODULES_DIR}/browser/continuous_search/src/main/res
  #cp -r ${BASE_DIR}/chrome/browser/continuous_search/android/java/res/* \
   #     ${MODULES_DIR}/browser/continuous_search/src/main/res

   mkdir -p ${MODULES_DIR}/browser/password_entry_edit/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/password_entry_edit/android/java/res/* \
        ${MODULES_DIR}/browser/password_entry_edit/src/main/res

   #mkdir -p ${MODULES_DIR}/browser/webapps/src/main/res
  #cp -r ${BASE_DIR}/chrome/browser/webapps/android/java/res/* \
   #     ${MODULES_DIR}/browser/webapps/src/main/res

   mkdir -p ${MODULES_DIR}/browser/privacy_sandbox/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/privacy_sandbox/android/java/res/* \
        ${MODULES_DIR}/browser/privacy_sandbox/src/main/res
}

sync_surface() {
       mkdir -p ${MODULES_DIR}/chrome_start_surface/src/main/res
       cp -r ${BASE_DIR}/chrome/android/features/start_surface/java/res/* \
	       ${MODULES_DIR}/chrome_start_surface/src/main/res
}

sync_splash() {
       mkdir -p ${MODULES_DIR}/splash/src/main/res
       cp -r ${BASE_DIR}/chrome/android/webapk/libs/common/res_splash/* \
	       "${MODULES_DIR}/splash/src/main/res"
}

sync_third_party() {
  #mkdir -p ${MODULES_DIR}/third_party/data_chart/src/main/res
  #cp -r ${BASE_DIR}/third_party/android_data_chart/java/res/* \
  #     ${MODULES_DIR}/third_party/data_chart/src/main/res

  mkdir -p ${MODULES_DIR}/third_party/android_media/src/main/res
  cp -r ${BASE_DIR}/third_party/android_media/java/res/* \
        ${MODULES_DIR}/third_party/android_media/src/main/res
}

sync_content(){
  mkdir -p ${MODULES_DIR}/content/src/main/res
  cp -r ${BASE_DIR}/content/public/android/java/res/* \
        ${RELEASE_DIR}/gen/content/public/android/content_strings_grd_grit_output/* \
        ${MODULES_DIR}/content/src/main/res
}

sync_messages(){
  mkdir -p ${MODULES_DIR}/browser/ui_messages/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/messages/android/java/res/* \
        ${MODULES_DIR}/browser/ui_messages/src/main/res
}

sync_chrome_tab_ui(){
  mkdir -p ${MODULES_DIR}/chrome_tab_ui/src/main/res
  cp -r ${BASE_DIR}/chrome/android/features/tab_ui/java/res/* \
        ${MODULES_DIR}/chrome_tab_ui/src/main/res
}

sync_chrome_vr(){
#不清楚是不是生成脚本有问题，未生成该文件，之前的编译目录中有这个文件
  mkdir -p ${MODULES_DIR}/chrome_vr/src/main/res
  cp -r ${BASE_DIR}/chrome/android/features/vr/java/res/* \
        ${MODULES_DIR}/chrome_vr/src/main/res
}

sync_media(){
  mkdir -p ${MODULES_DIR}/media/src/main/res
  cp -r ${BASE_DIR}/media/base/android/java/res/* \
        ${MODULES_DIR}/media/src/main/res
}

sync_libs() {
	mkdir -p "${APP_DIR}/libs"
	mkdir -p "${APP_DIR}/libs/ui/android"
	mkdir -p "${APP_DIR}/libs/components/browser_ui/photo_picker/android"
	mkdir -p "${APP_DIR}/libs/url"
	mkdir -p "${APP_DIR}/libs/third_party/gif_player"
	cp ${LIB_DIR}/components/browser_ui/photo_picker/android/java.jar "${APP_DIR}/libs/components/browser_ui/photo_picker/android/"
	cp ${LIB_DIR}/third_party/gif_player/gif_player_java.jar "${APP_DIR}/libs/third_party/gif_player/"
	cp ${LIB_DIR}/ui/android/ui_no_recycler_view_java.jar "${APP_DIR}/libs/ui/android/"
	cp ${LIB_DIR}/url/gurl_java.jar "${APP_DIR}/libs/url/"
#	cp ${BASE_DIR}/third_party/google_android_play_core/*.aar \
#    "${APP_DIR}/libs"
}


clean_project() {
	rm -rf ${APP_DIR}/src/main/java/org/org \
		${APP_DIR}/src/main/java/org/src \
		${APP_DIR}/src/main/java/org/com \
		${APP_DIR}/src/main/java/org/templates \
		${APP_DIR}/src/main/java/com/google/protobuf \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/MonochromeApplication.java \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/base/SplitMonochromeApplication.java \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/preferences/password/PasswordEntryEditorPreference.java \
		${APP_DIR}/src/main/java/org/chromium/components/module_installer/builder/ModuleInterfaceProcessor.java \
		${APP_DIR}/src/main/java/org/chromium/components/embedder_support/media \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/offlinepages/evaluation \
		${APP_DIR}/src/main/java/src/main/java/org/chromium/chrome/browser/feed/library/common/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/common/time/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/feedstore/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/hostimpl/storage/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/piet/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/basicstream/internal/drivers/testing \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/api/internal/common/testing \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/video_tutorials/test \
    ${APP_DIR}/src/main/java/org/chromium/chrome/modules/test_dummy \
    ${APP_DIR}/src/main/java/org/chromium/components/feed/core/proto/libraries/testing \
    ${APP_DIR}/src/main/java/org/chromium/blink/test \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/testing \
    ${APP_DIR}/src/main/java/org/chromium/components/crash/browser/CrashpadMain.java \
    ${APP_DIR}/src/main/java/org/chromium/components/embedder_support/view/ContentViewRenderView.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/offlinepages/downloads/OfflinePageNotificationBridge.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/password_check/PasswordCheckPreference.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/thumbnail/generator/ThumbnailMediaParserBridge.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/AndroidUiGestureTarget.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/AndroidVSyncHelper.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrShell.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrCoreInstallUtils.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrInputConnection.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrShellDelegate.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrFirstRunActivity.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrInputConnection.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrUiWidgetFactory.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrDelegateImpl.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrIntentDelegateImpl.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrDelegateProviderImpl.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/download/home/StubbedOfflineContentProvider.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/download/home/StubbedProvider.java \
		${APP_DIR}/src/main/java/{src,test,templates}

	# local feed_dir="${APP_DIR}/src/main/java/com/google/android/libraries/feed"
	# find "$feed_dir" -regextype "posix-egrep" -regex ".*/(testing|test_data|res)" -type d -print0 | \
	# 	xargs -0 rm -rf

	# find "$feed_dir" -regextype "posix-egrep" -regex ".*/AndroidManifest.xml" -type f -print0 | \
	# 	xargs -0 rm -f

  #.*Test.*\.java|.*test.*\.java|.*Test\.java|.*test\.java|"
#	local del_files="|DEPS|DIR_METADATA|LAYOUT_OWNERS|README|OWNERS|COPYING|BUILD|LICENSE|README.chromium|*\.template|*\.tmpl|R\.java|.*\.stamp|.*stamp\.d|.*\.py|.*\.flags|.*\.gn|.*Test\.java|.*test\.java|"
#	find "$PRO_DIR" -not \( -name 'JniStaticTestMocker.java' -or -name 'MockedInTests.java' -or -name 'EditorObserverForTest.java' \
#	  -or -name 'PaymentUiServiceTestInterface.java' -or -name 'FlushForTesting.java' -or -name 'NetworkServiceTest.java' -or -name 'HitTestRegionList.java' \
#	  -or -name 'HitTestRegion.java' -or -name 'AttestationConveyancePreference.java' -or -name 'NetworkServiceTest_Internal.java' \) \
#	 -regextype "posix-egrep" -regex ".*/(${del_files})" -type f -print0 | \
#		xargs -0 rm -f
#
#	local langs="af|am|as|ar|az|b\+sr\+Latn|be|bn|bs|bg|ca|cs|da|de|el|en-rGB|en-rUS|es|es-rUS|et|eu|fa|fi|fr|fr-rCA|gl|gu|hdpi|hi|hr|hu|hy|in|is|it|iw"
#	langs="$langs|ja|ka|kk|km|ko|kn|ky|lo|lt|lv|mk|ml|mn|mr|ms|my|ne|nb|nl|or|pa|pl|pt-rBR|pt-rPT|si|sq|ro|ru|sk|sl|sr|sv|sw|ta|te|th|tl|tr|ur|uk|uz|vi|zu|zh-rHK|zh-rTW|"
#	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*values-($langs)" -print0 | xargs -0 rm -rf

#	find "${PRO_DIR}/libraries_res" -regextype "posix-egrep" -regex ".*/app_icon\.png" -type f -print0 | xargs -0 rm -f

#	local aidls
#	aidls=$(find "${APP_DIR}/src/main/aidl" -name "*.aidl" -type f)
#	local j_file;
#	for aidl in $aidls; do
#		j_file="$(basename "$aidl" ".aidl")"
#		find "${APP_DIR}/src/main/java" -name "${j_file}.java" -type f -print0 | xargs -0 rm -f
#	done

	local empty_dirs;
	while :; do
		empty_dirs="$(find "$PRO_DIR" -type d -empty)"
		if [ -n "$empty_dirs" ]; then
			echo "$empty_dirs" | xargs rm -rf
		else
			break
		fi
	done
}

do_sync() {
	rm -rf "$PRO_DIR"
  sync_chrome
  sync_assets
  sync_messages
#  sync_aidl
  sync_ui
  sync_components
  sync_chrome_tab_ui
  sync_browser
  sync_third_party
  sync_content
  sync_surface
  sync_base_res
  sync_base
  sync_splash
  sync_libs
  sync_chrome_vr
  #sync_third_party_res
  sync_media
	clean_project
	# NativeLibraries
}

do_sync
