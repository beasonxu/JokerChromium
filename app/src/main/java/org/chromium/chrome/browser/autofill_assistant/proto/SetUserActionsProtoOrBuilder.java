// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface SetUserActionsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.SetUserActionsProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The user actions to set. Must contain a UserActionList value.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto user_actions = 2;</code>
   * @return Whether the userActions field is set.
   */
  boolean hasUserActions();
  /**
   * <pre>
   * The user actions to set. Must contain a UserActionList value.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto user_actions = 2;</code>
   * @return The userActions.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getUserActions();
}