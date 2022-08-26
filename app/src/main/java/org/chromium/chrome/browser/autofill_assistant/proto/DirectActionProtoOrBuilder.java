// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface DirectActionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.DirectActionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   * @return A list containing the names.
   */
  java.util.List<java.lang.String>
      getNamesList();
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   * @return The count of names.
   */
  int getNamesCount();
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);
  /**
   * <pre>
   * Map to direct actions with the given names.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);

  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   * @return A list containing the requiredArguments.
   */
  java.util.List<java.lang.String>
      getRequiredArgumentsList();
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   * @return The count of requiredArguments.
   */
  int getRequiredArgumentsCount();
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   * @param index The index of the element to return.
   * @return The requiredArguments at the given index.
   */
  java.lang.String getRequiredArguments(int index);
  /**
   * <pre>
   * Arguments to report as required for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted. Requirement is not enforced.
   * </pre>
   *
   * <code>repeated string required_arguments = 2;</code>
   * @param index The index of the element to return.
   * @return The requiredArguments at the given index.
   */
  com.google.protobuf.ByteString
      getRequiredArgumentsBytes(int index);

  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   * @return A list containing the optionalArguments.
   */
  java.util.List<java.lang.String>
      getOptionalArgumentsList();
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   * @return The count of optionalArguments.
   */
  int getOptionalArgumentsCount();
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   * @param index The index of the element to return.
   * @return The optionalArguments at the given index.
   */
  java.lang.String getOptionalArguments(int index);
  /**
   * <pre>
   * Arguments to report as optional for the direct action.
   * This is included into the definition reported to the caller without being
   * interpreted.
   * </pre>
   *
   * <code>repeated string optional_arguments = 3;</code>
   * @param index The index of the element to return.
   * @return The optionalArguments at the given index.
   */
  com.google.protobuf.ByteString
      getOptionalArgumentsBytes(int index);
}
