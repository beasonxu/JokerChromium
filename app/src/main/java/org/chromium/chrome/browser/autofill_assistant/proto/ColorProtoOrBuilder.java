// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ColorProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ColorProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The resource identifier of a color.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @return Whether the resourceIdentifier field is set.
   */
  boolean hasResourceIdentifier();
  /**
   * <pre>
   * The resource identifier of a color.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @return The resourceIdentifier.
   */
  java.lang.String getResourceIdentifier();
  /**
   * <pre>
   * The resource identifier of a color.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @return The bytes for resourceIdentifier.
   */
  com.google.protobuf.ByteString
      getResourceIdentifierBytes();

  /**
   * <pre>
   * A color in the #RRGGBB or #AARRGGBB format.
   * </pre>
   *
   * <code>string parseable_color = 2;</code>
   * @return Whether the parseableColor field is set.
   */
  boolean hasParseableColor();
  /**
   * <pre>
   * A color in the #RRGGBB or #AARRGGBB format.
   * </pre>
   *
   * <code>string parseable_color = 2;</code>
   * @return The parseableColor.
   */
  java.lang.String getParseableColor();
  /**
   * <pre>
   * A color in the #RRGGBB or #AARRGGBB format.
   * </pre>
   *
   * <code>string parseable_color = 2;</code>
   * @return The bytes for parseableColor.
   */
  com.google.protobuf.ByteString
      getParseableColorBytes();

  public org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.ColorCase getColorCase();
}