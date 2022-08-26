// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface SupportedScriptProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.SupportedScriptProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * This is the internal name of the script.
   * </pre>
   *
   * <code>optional string path = 1;</code>
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   * <pre>
   * This is the internal name of the script.
   * </pre>
   *
   * <code>optional string path = 1;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * This is the internal name of the script.
   * </pre>
   *
   * <code>optional string path = 1;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>optional .autofill_assistant.SupportedScriptProto.PresentationProto presentation = 2;</code>
   * @return Whether the presentation field is set.
   */
  boolean hasPresentation();
  /**
   * <code>optional .autofill_assistant.SupportedScriptProto.PresentationProto presentation = 2;</code>
   * @return The presentation.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto.PresentationProto getPresentation();
}
