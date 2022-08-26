// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ScriptParameterProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ScriptParameterProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 3;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>optional string value = 2;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>optional string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}