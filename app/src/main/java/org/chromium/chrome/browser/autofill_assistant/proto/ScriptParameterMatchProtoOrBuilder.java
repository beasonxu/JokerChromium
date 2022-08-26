// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ScriptParameterMatchProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ScriptParameterMatchProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Checks whether the script parameter is present.
   * </pre>
   *
   * <code>optional bool exists = 2 [default = true];</code>
   * @return Whether the exists field is set.
   */
  boolean hasExists();
  /**
   * <pre>
   * Checks whether the script parameter is present.
   * </pre>
   *
   * <code>optional bool exists = 2 [default = true];</code>
   * @return The exists.
   */
  boolean getExists();

  /**
   * <pre>
   * Checks whether the script parameter has exact value. Empty or missing value
   * is treated as wildcard - any value will pass.
   * </pre>
   *
   * <code>optional string value_equals = 3;</code>
   * @return Whether the valueEquals field is set.
   */
  boolean hasValueEquals();
  /**
   * <pre>
   * Checks whether the script parameter has exact value. Empty or missing value
   * is treated as wildcard - any value will pass.
   * </pre>
   *
   * <code>optional string value_equals = 3;</code>
   * @return The valueEquals.
   */
  java.lang.String getValueEquals();
  /**
   * <pre>
   * Checks whether the script parameter has exact value. Empty or missing value
   * is treated as wildcard - any value will pass.
   * </pre>
   *
   * <code>optional string value_equals = 3;</code>
   * @return The bytes for valueEquals.
   */
  com.google.protobuf.ByteString
      getValueEqualsBytes();
}
