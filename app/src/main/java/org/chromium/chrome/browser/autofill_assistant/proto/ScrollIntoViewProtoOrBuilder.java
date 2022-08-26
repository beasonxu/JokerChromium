// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/dom_action.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ScrollIntoViewProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ScrollIntoViewProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   * @return Whether the clientId field is set.
   */
  boolean hasClientId();
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   * @return The clientId.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getClientId();

  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 2;</code>
   * @return Whether the animation field is set.
   */
  boolean hasAnimation();
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 2;</code>
   * @return The animation.
   */
  java.lang.String getAnimation();
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 2;</code>
   * @return The bytes for animation.
   */
  com.google.protobuf.ByteString
      getAnimationBytes();

  /**
   * <pre>
   * Defines vertical alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string vertical_alignment = 3;</code>
   * @return Whether the verticalAlignment field is set.
   */
  boolean hasVerticalAlignment();
  /**
   * <pre>
   * Defines vertical alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string vertical_alignment = 3;</code>
   * @return The verticalAlignment.
   */
  java.lang.String getVerticalAlignment();
  /**
   * <pre>
   * Defines vertical alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string vertical_alignment = 3;</code>
   * @return The bytes for verticalAlignment.
   */
  com.google.protobuf.ByteString
      getVerticalAlignmentBytes();

  /**
   * <pre>
   * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string horizontal_alignment = 4;</code>
   * @return Whether the horizontalAlignment field is set.
   */
  boolean hasHorizontalAlignment();
  /**
   * <pre>
   * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string horizontal_alignment = 4;</code>
   * @return The horizontalAlignment.
   */
  java.lang.String getHorizontalAlignment();
  /**
   * <pre>
   * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string horizontal_alignment = 4;</code>
   * @return The bytes for horizontalAlignment.
   */
  com.google.protobuf.ByteString
      getHorizontalAlignmentBytes();
}
