// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ProcessedActionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ProcessedActionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   * <pre>
   * The action that was processed.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionProto action = 1;</code>
   * @return The action.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ActionProto getAction();

  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 2;</code>
   * @return The status.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto getStatus();

  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusDetailsProto status_details = 19;</code>
   * @return Whether the statusDetails field is set.
   */
  boolean hasStatusDetails();
  /**
   * <code>optional .autofill_assistant.ProcessedActionStatusDetailsProto status_details = 19;</code>
   * @return The statusDetails.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto getStatusDetails();

  /**
   * <code>.autofill_assistant.PromptProto.Result prompt_choice = 5;</code>
   * @return Whether the promptChoice field is set.
   */
  boolean hasPromptChoice();
  /**
   * <code>.autofill_assistant.PromptProto.Result prompt_choice = 5;</code>
   * @return The promptChoice.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Result getPromptChoice();

  /**
   * <pre>
   * Should be set as a result of CollectUserDataAction.
   * </pre>
   *
   * <code>.autofill_assistant.CollectUserDataResultProto collect_user_data_result = 15;</code>
   * @return Whether the collectUserDataResult field is set.
   */
  boolean hasCollectUserDataResult();
  /**
   * <pre>
   * Should be set as a result of CollectUserDataAction.
   * </pre>
   *
   * <code>.autofill_assistant.CollectUserDataResultProto collect_user_data_result = 15;</code>
   * @return The collectUserDataResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CollectUserDataResultProto getCollectUserDataResult();

  /**
   * <pre>
   * May be set as a result of WaitForDomProto.
   * </pre>
   *
   * <code>.autofill_assistant.WaitForDomProto.Result wait_for_dom_result = 22;</code>
   * @return Whether the waitForDomResult field is set.
   */
  boolean hasWaitForDomResult();
  /**
   * <pre>
   * May be set as a result of WaitForDomProto.
   * </pre>
   *
   * <code>.autofill_assistant.WaitForDomProto.Result wait_for_dom_result = 22;</code>
   * @return The waitForDomResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result getWaitForDomResult();

  /**
   * <pre>
   * Should be set as a result of FormAction.
   * </pre>
   *
   * <code>.autofill_assistant.FormProto.Result form_result = 21;</code>
   * @return Whether the formResult field is set.
   */
  boolean hasFormResult();
  /**
   * <pre>
   * Should be set as a result of FormAction.
   * </pre>
   *
   * <code>.autofill_assistant.FormProto.Result form_result = 21;</code>
   * @return The formResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.FormProto.Result getFormResult();

  /**
   * <code>.autofill_assistant.WaitForDocumentProto.Result wait_for_document_result = 25;</code>
   * @return Whether the waitForDocumentResult field is set.
   */
  boolean hasWaitForDocumentResult();
  /**
   * <code>.autofill_assistant.WaitForDocumentProto.Result wait_for_document_result = 25;</code>
   * @return The waitForDocumentResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result getWaitForDocumentResult();

  /**
   * <pre>
   * Should be set as a result of ShowGenericUiProto.
   * </pre>
   *
   * <code>.autofill_assistant.ShowGenericUiProto.Result show_generic_ui_result = 28;</code>
   * @return Whether the showGenericUiResult field is set.
   */
  boolean hasShowGenericUiResult();
  /**
   * <pre>
   * Should be set as a result of ShowGenericUiProto.
   * </pre>
   *
   * <code>.autofill_assistant.ShowGenericUiProto.Result show_generic_ui_result = 28;</code>
   * @return The showGenericUiResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiProto.Result getShowGenericUiResult();

  /**
   * <pre>
   * Should be set as a result of GetElementStatusProto.
   * </pre>
   *
   * <code>.autofill_assistant.GetElementStatusProto.Result get_element_status_result = 31;</code>
   * @return Whether the getElementStatusResult field is set.
   */
  boolean hasGetElementStatusResult();
  /**
   * <pre>
   * Should be set as a result of GetElementStatusProto.
   * </pre>
   *
   * <code>.autofill_assistant.GetElementStatusProto.Result get_element_status_result = 31;</code>
   * @return The getElementStatusResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.GetElementStatusProto.Result getGetElementStatusResult();

  /**
   * <pre>
   * Should be set as a result of UploadDomProto.
   * </pre>
   *
   * <code>.autofill_assistant.UploadDomProto.Result upload_dom_result = 33;</code>
   * @return Whether the uploadDomResult field is set.
   */
  boolean hasUploadDomResult();
  /**
   * <pre>
   * Should be set as a result of UploadDomProto.
   * </pre>
   *
   * <code>.autofill_assistant.UploadDomProto.Result upload_dom_result = 33;</code>
   * @return The uploadDomResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.UploadDomProto.Result getUploadDomResult();

  /**
   * <pre>
   * Should be set as a result of CheckOptionElementProto.
   * </pre>
   *
   * <code>.autofill_assistant.CheckOptionElementProto.Result check_option_element_result = 35;</code>
   * @return Whether the checkOptionElementResult field is set.
   */
  boolean hasCheckOptionElementResult();
  /**
   * <pre>
   * Should be set as a result of CheckOptionElementProto.
   * </pre>
   *
   * <code>.autofill_assistant.CheckOptionElementProto.Result check_option_element_result = 35;</code>
   * @return The checkOptionElementResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result getCheckOptionElementResult();

  /**
   * <pre>
   * Should be set as a result of SendKeystrokeEventsProto.
   * </pre>
   *
   * <code>.autofill_assistant.SendKeystrokeEventsProto.Result send_key_stroke_events_result = 36;</code>
   * @return Whether the sendKeyStrokeEventsResult field is set.
   */
  boolean hasSendKeyStrokeEventsResult();
  /**
   * <pre>
   * Should be set as a result of SendKeystrokeEventsProto.
   * </pre>
   *
   * <code>.autofill_assistant.SendKeystrokeEventsProto.Result send_key_stroke_events_result = 36;</code>
   * @return The sendKeyStrokeEventsResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result getSendKeyStrokeEventsResult();

  /**
   * <pre>
   * Should be set as a result of JsFlowProto.
   * </pre>
   *
   * <code>.autofill_assistant.JsFlowProto.Result js_flow_result = 37;</code>
   * @return Whether the jsFlowResult field is set.
   */
  boolean hasJsFlowResult();
  /**
   * <pre>
   * Should be set as a result of JsFlowProto.
   * </pre>
   *
   * <code>.autofill_assistant.JsFlowProto.Result js_flow_result = 37;</code>
   * @return The jsFlowResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.JsFlowProto.Result getJsFlowResult();

  /**
   * <pre>
   * Should be set as a result of SaveSubmittedPassword.
   * </pre>
   *
   * <code>.autofill_assistant.SaveSubmittedPasswordProto.Result save_submitted_password_result = 38;</code>
   * @return Whether the saveSubmittedPasswordResult field is set.
   */
  boolean hasSaveSubmittedPasswordResult();
  /**
   * <pre>
   * Should be set as a result of SaveSubmittedPassword.
   * </pre>
   *
   * <code>.autofill_assistant.SaveSubmittedPasswordProto.Result save_submitted_password_result = 38;</code>
   * @return The saveSubmittedPasswordResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SaveSubmittedPasswordProto.Result getSaveSubmittedPasswordResult();

  /**
   * <pre>
   * Should be set as a result of an ExternalAction.
   * </pre>
   *
   * <code>.autofill_assistant.ExternalActionProto.Result external_action_result = 39;</code>
   * @return Whether the externalActionResult field is set.
   */
  boolean hasExternalActionResult();
  /**
   * <pre>
   * Should be set as a result of an ExternalAction.
   * </pre>
   *
   * <code>.autofill_assistant.ExternalActionProto.Result external_action_result = 39;</code>
   * @return The externalActionResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ExternalActionProto.Result getExternalActionResult();

  /**
   * <pre>
   * Reports information about navigation that happened while
   * processing the action. This is meant for debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.NavigationInfoProto navigation_info = 20;</code>
   * @return Whether the navigationInfo field is set.
   */
  boolean hasNavigationInfo();
  /**
   * <pre>
   * Reports information about navigation that happened while
   * processing the action. This is meant for debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.NavigationInfoProto navigation_info = 20;</code>
   * @return The navigationInfo.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.NavigationInfoProto getNavigationInfo();

  /**
   * <pre>
   * Reports how long it took for the client to run the action. This does not
   * include the delay specified in action.delay_ms.
   * </pre>
   *
   * <code>optional int64 run_time_ms = 23;</code>
   * @return Whether the runTimeMs field is set.
   */
  boolean hasRunTimeMs();
  /**
   * <pre>
   * Reports how long it took for the client to run the action. This does not
   * include the delay specified in action.delay_ms.
   * </pre>
   *
   * <code>optional int64 run_time_ms = 23;</code>
   * @return The runTimeMs.
   */
  long getRunTimeMs();

  /**
   * <pre>
   * Collects the timing stats related to the action execution.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionTimingStats timing_stats = 32;</code>
   * @return Whether the timingStats field is set.
   */
  boolean hasTimingStats();
  /**
   * <pre>
   * Collects the timing stats related to the action execution.
   * </pre>
   *
   * <code>optional .autofill_assistant.ActionTimingStats timing_stats = 32;</code>
   * @return The timingStats.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats getTimingStats();

  /**
   * <pre>
   * Tracks whether the action triggered a slow website warning and whether it
   * was shown to the user.
   * </pre>
   *
   * <code>optional .autofill_assistant.SlowWarningStatus slow_warning_status = 34;</code>
   * @return Whether the slowWarningStatus field is set.
   */
  boolean hasSlowWarningStatus();
  /**
   * <pre>
   * Tracks whether the action triggered a slow website warning and whether it
   * was shown to the user.
   * </pre>
   *
   * <code>optional .autofill_assistant.SlowWarningStatus slow_warning_status = 34;</code>
   * @return The slowWarningStatus.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SlowWarningStatus getSlowWarningStatus();

  public org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionProto.ResultDataCase getResultDataCase();
}