// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface SetViewEnabledProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.SetViewEnabledProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The view to modify.
   * </pre>
   *
   * <code>optional string view_identifier = 1;</code>
   * @return Whether the viewIdentifier field is set.
   */
  boolean hasViewIdentifier();
  /**
   * <pre>
   * The view to modify.
   * </pre>
   *
   * <code>optional string view_identifier = 1;</code>
   * @return The viewIdentifier.
   */
  java.lang.String getViewIdentifier();
  /**
   * <pre>
   * The view to modify.
   * </pre>
   *
   * <code>optional string view_identifier = 1;</code>
   * @return The bytes for viewIdentifier.
   */
  com.google.protobuf.ByteString
      getViewIdentifierBytes();

  /**
   * <pre>
   * Whether the view should be enabled or not. Must point to a single boolean.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto enabled = 2;</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * Whether the view should be enabled or not. Must point to a single boolean.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto enabled = 2;</code>
   * @return The enabled.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getEnabled();
}