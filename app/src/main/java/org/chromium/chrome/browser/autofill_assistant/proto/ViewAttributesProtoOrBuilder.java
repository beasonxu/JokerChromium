// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ViewAttributesProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ViewAttributesProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int32 padding_start = 1;</code>
   * @return Whether the paddingStart field is set.
   */
  boolean hasPaddingStart();
  /**
   * <code>optional int32 padding_start = 1;</code>
   * @return The paddingStart.
   */
  int getPaddingStart();

  /**
   * <code>optional int32 padding_top = 2;</code>
   * @return Whether the paddingTop field is set.
   */
  boolean hasPaddingTop();
  /**
   * <code>optional int32 padding_top = 2;</code>
   * @return The paddingTop.
   */
  int getPaddingTop();

  /**
   * <code>optional int32 padding_end = 3;</code>
   * @return Whether the paddingEnd field is set.
   */
  boolean hasPaddingEnd();
  /**
   * <code>optional int32 padding_end = 3;</code>
   * @return The paddingEnd.
   */
  int getPaddingEnd();

  /**
   * <code>optional int32 padding_bottom = 4;</code>
   * @return Whether the paddingBottom field is set.
   */
  boolean hasPaddingBottom();
  /**
   * <code>optional int32 padding_bottom = 4;</code>
   * @return The paddingBottom.
   */
  int getPaddingBottom();

  /**
   * <code>optional .autofill_assistant.DrawableProto background = 5;</code>
   * @return Whether the background field is set.
   */
  boolean hasBackground();
  /**
   * <code>optional .autofill_assistant.DrawableProto background = 5;</code>
   * @return The background.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DrawableProto getBackground();

  /**
   * <pre>
   * The content description for this view. There are three possible states:
   * - unset: content description is auto-inferred by android a11y.
   * - set to empty string: this view is not important for a11y.
   * - set to non-empty string: the view will have the specified content
   * description.
   * </pre>
   *
   * <code>optional string content_description = 6;</code>
   * @return Whether the contentDescription field is set.
   */
  boolean hasContentDescription();
  /**
   * <pre>
   * The content description for this view. There are three possible states:
   * - unset: content description is auto-inferred by android a11y.
   * - set to empty string: this view is not important for a11y.
   * - set to non-empty string: the view will have the specified content
   * description.
   * </pre>
   *
   * <code>optional string content_description = 6;</code>
   * @return The contentDescription.
   */
  java.lang.String getContentDescription();
  /**
   * <pre>
   * The content description for this view. There are three possible states:
   * - unset: content description is auto-inferred by android a11y.
   * - set to empty string: this view is not important for a11y.
   * - set to non-empty string: the view will have the specified content
   * description.
   * </pre>
   *
   * <code>optional string content_description = 6;</code>
   * @return The bytes for contentDescription.
   */
  com.google.protobuf.ByteString
      getContentDescriptionBytes();

  /**
   * <pre>
   * Whether the view is initially visible or not.
   * </pre>
   *
   * <code>optional bool visible = 7 [default = true];</code>
   * @return Whether the visible field is set.
   */
  boolean hasVisible();
  /**
   * <pre>
   * Whether the view is initially visible or not.
   * </pre>
   *
   * <code>optional bool visible = 7 [default = true];</code>
   * @return The visible.
   */
  boolean getVisible();

  /**
   * <pre>
   * Whether the view is initially enabled or not.
   * </pre>
   *
   * <code>optional bool enabled = 8 [default = true];</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * Whether the view is initially enabled or not.
   * </pre>
   *
   * <code>optional bool enabled = 8 [default = true];</code>
   * @return The enabled.
   */
  boolean getEnabled();
}
