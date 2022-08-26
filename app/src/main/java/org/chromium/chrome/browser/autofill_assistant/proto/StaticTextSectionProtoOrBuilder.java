// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface StaticTextSectionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.StaticTextSectionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * Key to read the display string value from client memory.
   * Note: Corresponding action will fail if we do not find
   * a non-empty single display string value.
   * </pre>
   *
   * <code>string client_memory_key = 2;</code>
   * @return Whether the clientMemoryKey field is set.
   */
  boolean hasClientMemoryKey();
  /**
   * <pre>
   * Key to read the display string value from client memory.
   * Note: Corresponding action will fail if we do not find
   * a non-empty single display string value.
   * </pre>
   *
   * <code>string client_memory_key = 2;</code>
   * @return The clientMemoryKey.
   */
  java.lang.String getClientMemoryKey();
  /**
   * <pre>
   * Key to read the display string value from client memory.
   * Note: Corresponding action will fail if we do not find
   * a non-empty single display string value.
   * </pre>
   *
   * <code>string client_memory_key = 2;</code>
   * @return The bytes for clientMemoryKey.
   */
  com.google.protobuf.ByteString
      getClientMemoryKeyBytes();

  public org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto.ValueCase getValueCase();
}
