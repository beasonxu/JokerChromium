// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface SupportsScriptRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.SupportsScriptRequestProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string url = 1;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <code>optional string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto> 
      getScriptParametersList();
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto getScriptParameters(int index);
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  int getScriptParametersCount();

  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
   * @return Whether the clientContext field is set.
   */
  boolean hasClientContext();
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
   * @return The clientContext.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto getClientContext();
}