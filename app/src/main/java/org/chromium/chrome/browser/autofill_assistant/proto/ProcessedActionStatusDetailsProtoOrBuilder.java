// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ProcessedActionStatusDetailsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ProcessedActionStatusDetailsProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * More information included for unexpected errors.
   * Only set for action whose status are OTHER_ACTION_STATUS or
   * UNEXPECTED_JS_ERROR.
   * </pre>
   *
   * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
   * @return Whether the unexpectedErrorInfo field is set.
   */
  boolean hasUnexpectedErrorInfo();
  /**
   * <pre>
   * More information included for unexpected errors.
   * Only set for action whose status are OTHER_ACTION_STATUS or
   * UNEXPECTED_JS_ERROR.
   * </pre>
   *
   * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
   * @return The unexpectedErrorInfo.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto getUnexpectedErrorInfo();

  /**
   * <pre>
   * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
   * reported by the action is overridden after the action failed, to report a
   * more appropriate error. When that happens, this field contains the original
   * status, to help debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
   * @return Whether the originalStatus field is set.
   */
  boolean hasOriginalStatus();
  /**
   * <pre>
   * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
   * reported by the action is overridden after the action failed, to report a
   * more appropriate error. When that happens, this field contains the original
   * status, to help debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
   * @return The originalStatus.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto getOriginalStatus();

  /**
   * <pre>
   * More information included for autofill related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
   * @return Whether the autofillErrorInfo field is set.
   */
  boolean hasAutofillErrorInfo();
  /**
   * <pre>
   * More information included for autofill related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
   * @return The autofillErrorInfo.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto getAutofillErrorInfo();

  /**
   * <pre>
   * Additional information from the |WebController|.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
   * @return Whether the webControllerErrorInfo field is set.
   */
  boolean hasWebControllerErrorInfo();
  /**
   * <pre>
   * Additional information from the |WebController|.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
   * @return The webControllerErrorInfo.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto getWebControllerErrorInfo();

  /**
   * <pre>
   * Additional information from the |ElementFinder|.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ElementFinderInfoProto element_finder_info = 6;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ElementFinderInfoProto> 
      getElementFinderInfoList();
  /**
   * <pre>
   * Additional information from the |ElementFinder|.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ElementFinderInfoProto element_finder_info = 6;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ElementFinderInfoProto getElementFinderInfo(int index);
  /**
   * <pre>
   * Additional information from the |ElementFinder|.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ElementFinderInfoProto element_finder_info = 6;</code>
   */
  int getElementFinderInfoCount();
}
