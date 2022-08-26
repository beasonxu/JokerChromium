// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface TriggerScriptUIProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.TriggerScriptUIProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The status message to display.
   * </pre>
   *
   * <code>optional string status_message = 1;</code>
   * @return Whether the statusMessage field is set.
   */
  boolean hasStatusMessage();
  /**
   * <pre>
   * The status message to display.
   * </pre>
   *
   * <code>optional string status_message = 1;</code>
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   * <pre>
   * The status message to display.
   * </pre>
   *
   * <code>optional string status_message = 1;</code>
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString
      getStatusMessageBytes();

  /**
   * <pre>
   * The callout to display. If not specified, no callout will be shown.
   * </pre>
   *
   * <code>optional string callout_message = 2;</code>
   * @return Whether the calloutMessage field is set.
   */
  boolean hasCalloutMessage();
  /**
   * <pre>
   * The callout to display. If not specified, no callout will be shown.
   * </pre>
   *
   * <code>optional string callout_message = 2;</code>
   * @return The calloutMessage.
   */
  java.lang.String getCalloutMessage();
  /**
   * <pre>
   * The callout to display. If not specified, no callout will be shown.
   * </pre>
   *
   * <code>optional string callout_message = 2;</code>
   * @return The bytes for calloutMessage.
   */
  com.google.protobuf.ByteString
      getCalloutMessageBytes();

  /**
   * <pre>
   * The progress bar to display. If not specified, no progress bar will be
   * shown.
   * </pre>
   *
   * <code>optional .autofill_assistant.TriggerScriptUIProto.ProgressBar progress_bar = 3;</code>
   * @return Whether the progressBar field is set.
   */
  boolean hasProgressBar();
  /**
   * <pre>
   * The progress bar to display. If not specified, no progress bar will be
   * shown.
   * </pre>
   *
   * <code>optional .autofill_assistant.TriggerScriptUIProto.ProgressBar progress_bar = 3;</code>
   * @return The progressBar.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptUIProto.ProgressBar getProgressBar();

  /**
   * <pre>
   * The cancel popup, usually associated with a particular chip.
   * </pre>
   *
   * <code>optional .autofill_assistant.TriggerScriptUIProto.Popup cancel_popup = 4;</code>
   * @return Whether the cancelPopup field is set.
   */
  boolean hasCancelPopup();
  /**
   * <pre>
   * The cancel popup, usually associated with a particular chip.
   * </pre>
   *
   * <code>optional .autofill_assistant.TriggerScriptUIProto.Popup cancel_popup = 4;</code>
   * @return The cancelPopup.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptUIProto.Popup getCancelPopup();

  /**
   * <pre>
   * The available left-aligned chips, specified in order from left to right.
   * </pre>
   *
   * <code>repeated .autofill_assistant.TriggerScriptUIProto.TriggerChip left_aligned_chips = 5;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptUIProto.TriggerChip> 
      getLeftAlignedChipsList();
  /**
   * <pre>
   * The available left-aligned chips, specified in order from left to right.
   * </pre>
   *
   * <code>repeated .autofill_assistant.TriggerScriptUIProto.TriggerChip left_aligned_chips = 5;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptUIProto.TriggerChip getLeftAlignedChips(int index);
  /**
   * <pre>
   * The available left-aligned chips, specified in order from left to right.
   * </pre>
   *
   * <code>repeated .autofill_assistant.TriggerScriptUIProto.TriggerChip left_aligned_chips = 5;</code>
   */
  int getLeftAlignedChipsCount();

  /**
   * <pre>
   * The available right-aligned chips, specified in order from left to right.
   * </pre>
   *
   * <code>repeated .autofill_assistant.TriggerScriptUIProto.TriggerChip right_aligned_chips = 6;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptUIProto.TriggerChip> 
      getRightAlignedChipsList();
  /**
   * <pre>
   * The available right-aligned chips, specified in order from left to right.
   * </pre>
   *
   * <code>repeated .autofill_assistant.TriggerScriptUIProto.TriggerChip right_aligned_chips = 6;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptUIProto.TriggerChip getRightAlignedChips(int index);
  /**
   * <pre>
   * The available right-aligned chips, specified in order from left to right.
   * </pre>
   *
   * <code>repeated .autofill_assistant.TriggerScriptUIProto.TriggerChip right_aligned_chips = 6;</code>
   */
  int getRightAlignedChipsCount();

  /**
   * <pre>
   * The status message to display when transitioning from this trigger script
   * to the regular script.
   * </pre>
   *
   * <code>optional string regular_script_loading_status_message = 7;</code>
   * @return Whether the regularScriptLoadingStatusMessage field is set.
   */
  boolean hasRegularScriptLoadingStatusMessage();
  /**
   * <pre>
   * The status message to display when transitioning from this trigger script
   * to the regular script.
   * </pre>
   *
   * <code>optional string regular_script_loading_status_message = 7;</code>
   * @return The regularScriptLoadingStatusMessage.
   */
  java.lang.String getRegularScriptLoadingStatusMessage();
  /**
   * <pre>
   * The status message to display when transitioning from this trigger script
   * to the regular script.
   * </pre>
   *
   * <code>optional string regular_script_loading_status_message = 7;</code>
   * @return The bytes for regularScriptLoadingStatusMessage.
   */
  com.google.protobuf.ByteString
      getRegularScriptLoadingStatusMessageBytes();

  /**
   * <pre>
   * Whether the visual viewport should be resized to allow scrolling to the
   * bottom of the page while the trigger script is being displayed.
   * </pre>
   *
   * <code>optional bool resize_visual_viewport = 8;</code>
   * @return Whether the resizeVisualViewport field is set.
   */
  boolean hasResizeVisualViewport();
  /**
   * <pre>
   * Whether the visual viewport should be resized to allow scrolling to the
   * bottom of the page while the trigger script is being displayed.
   * </pre>
   *
   * <code>optional bool resize_visual_viewport = 8;</code>
   * @return The resizeVisualViewport.
   */
  boolean getResizeVisualViewport();

  /**
   * <pre>
   * Whether the bottom sheet should temporarily disappear when scrolling down
   * the website, to move out of the way. This setting is ignored if
   * |ui_timeout_ms| is specified.
   * The value of resize_visual_viewport is ignored when scroll_to_hide is true.
   * This allows the backend setting both to true and letting chrome choose
   * scroll_to_hide if it is supported.
   * </pre>
   *
   * <code>optional bool scroll_to_hide = 9;</code>
   * @return Whether the scrollToHide field is set.
   */
  boolean hasScrollToHide();
  /**
   * <pre>
   * Whether the bottom sheet should temporarily disappear when scrolling down
   * the website, to move out of the way. This setting is ignored if
   * |ui_timeout_ms| is specified.
   * The value of resize_visual_viewport is ignored when scroll_to_hide is true.
   * This allows the backend setting both to true and letting chrome choose
   * scroll_to_hide if it is supported.
   * </pre>
   *
   * <code>optional bool scroll_to_hide = 9;</code>
   * @return The scrollToHide.
   */
  boolean getScrollToHide();

  /**
   * <pre>
   * The amount of time that the UI may be shown to the user. If not specified,
   * there is no limit. This is intended for websites where the UI could block
   * important parts of the website underneath and |scroll_to_hide| does not
   * mitigate the issue. If this field is specified, |scroll_to_hide| will be
   * ignored. |resize_visual_viewport| will be applied if requested.
   * Once hidden, the UI may be shown again the next time the trigger condition
   * is true (same behavior as NOT_NOW). Note that the timeout is disabled if
   * the user taps either the overflow icon or the confirm chip.
   * </pre>
   *
   * <code>optional int32 ui_timeout_ms = 10;</code>
   * @return Whether the uiTimeoutMs field is set.
   */
  boolean hasUiTimeoutMs();
  /**
   * <pre>
   * The amount of time that the UI may be shown to the user. If not specified,
   * there is no limit. This is intended for websites where the UI could block
   * important parts of the website underneath and |scroll_to_hide| does not
   * mitigate the issue. If this field is specified, |scroll_to_hide| will be
   * ignored. |resize_visual_viewport| will be applied if requested.
   * Once hidden, the UI may be shown again the next time the trigger condition
   * is true (same behavior as NOT_NOW). Note that the timeout is disabled if
   * the user taps either the overflow icon or the confirm chip.
   * </pre>
   *
   * <code>optional int32 ui_timeout_ms = 10;</code>
   * @return The uiTimeoutMs.
   */
  int getUiTimeoutMs();
}
