// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface FormInputProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.FormInputProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
   * @return Whether the counter field is set.
   */
  boolean hasCounter();
  /**
   * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
   * @return The counter.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto getCounter();

  /**
   * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
   * @return Whether the selection field is set.
   */
  boolean hasSelection();
  /**
   * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
   * @return The selection.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto getSelection();

  public org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.InputTypeCase getInputTypeCase();
}
