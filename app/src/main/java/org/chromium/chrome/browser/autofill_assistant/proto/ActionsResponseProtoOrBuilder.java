// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ActionsResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ActionsResponseProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * CUP-signed version of this proto. When set, the rest of the fields in
   * ActionsResponseProto should be ignored.
   * </pre>
   *
   * <code>optional .autofill_assistant.CUPResponseData cup_data = 11;</code>
   * @return Whether the cupData field is set.
   */
  boolean hasCupData();
  /**
   * <pre>
   * CUP-signed version of this proto. When set, the rest of the fields in
   * ActionsResponseProto should be ignored.
   * </pre>
   *
   * <code>optional .autofill_assistant.CUPResponseData cup_data = 11;</code>
   * @return The cupData.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CUPResponseData getCupData();

  /**
   * <pre>
   * Opaque data to send to the next ScriptActionRequestProto.
   * </pre>
   *
   * <code>optional bytes global_payload = 4;</code>
   * @return Whether the globalPayload field is set.
   */
  boolean hasGlobalPayload();
  /**
   * <pre>
   * Opaque data to send to the next ScriptActionRequestProto.
   * </pre>
   *
   * <code>optional bytes global_payload = 4;</code>
   * @return The globalPayload.
   */
  com.google.protobuf.ByteString getGlobalPayload();

  /**
   * <pre>
   * Opaque data to send to the next ScriptActionRequestProto for the same
   * script.
   * </pre>
   *
   * <code>optional bytes script_payload = 2;</code>
   * @return Whether the scriptPayload field is set.
   */
  boolean hasScriptPayload();
  /**
   * <pre>
   * Opaque data to send to the next ScriptActionRequestProto for the same
   * script.
   * </pre>
   *
   * <code>optional bytes script_payload = 2;</code>
   * @return The scriptPayload.
   */
  com.google.protobuf.ByteString getScriptPayload();

  /**
   * <pre>
   * Actions to be performed in order.
   * Should stop processing as soon as an action fails.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ActionProto actions = 3;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ActionProto> 
      getActionsList();
  /**
   * <pre>
   * Actions to be performed in order.
   * Should stop processing as soon as an action fails.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ActionProto actions = 3;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ActionProto getActions(int index);
  /**
   * <pre>
   * Actions to be performed in order.
   * Should stop processing as soon as an action fails.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ActionProto actions = 3;</code>
   */
  int getActionsCount();

  /**
   * <code>optional .autofill_assistant.ActionsResponseProto.UpdateScriptListProto update_script_list = 5;</code>
   * @return Whether the updateScriptList field is set.
   */
  boolean hasUpdateScriptList();
  /**
   * <code>optional .autofill_assistant.ActionsResponseProto.UpdateScriptListProto update_script_list = 5;</code>
   * @return The updateScriptList.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ActionsResponseProto.UpdateScriptListProto getUpdateScriptList();

  /**
   * <pre>
   * Needs to be evaluated before each JS flow action. Contains function
   * definitions that js flows might call.
   * Only set if ClientContextProto::js_flow_library_loaded is false.
   * </pre>
   *
   * <code>optional string js_flow_library = 13;</code>
   * @return Whether the jsFlowLibrary field is set.
   */
  boolean hasJsFlowLibrary();
  /**
   * <pre>
   * Needs to be evaluated before each JS flow action. Contains function
   * definitions that js flows might call.
   * Only set if ClientContextProto::js_flow_library_loaded is false.
   * </pre>
   *
   * <code>optional string js_flow_library = 13;</code>
   * @return The jsFlowLibrary.
   */
  java.lang.String getJsFlowLibrary();
  /**
   * <pre>
   * Needs to be evaluated before each JS flow action. Contains function
   * definitions that js flows might call.
   * Only set if ClientContextProto::js_flow_library_loaded is false.
   * </pre>
   *
   * <code>optional string js_flow_library = 13;</code>
   * @return The bytes for jsFlowLibrary.
   */
  com.google.protobuf.ByteString
      getJsFlowLibraryBytes();

  /**
   * <pre>
   * Id of the current run.
   * </pre>
   *
   * <code>optional uint64 run_id = 12;</code>
   * @return Whether the runId field is set.
   */
  boolean hasRunId();
  /**
   * <pre>
   * Id of the current run.
   * </pre>
   *
   * <code>optional uint64 run_id = 12;</code>
   * @return The runId.
   */
  long getRunId();
}
