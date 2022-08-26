// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface DataOriginNoticeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.DataOriginNoticeProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Text of the link to the dialog.
   * </pre>
   *
   * <code>optional string link_text = 1;</code>
   * @return Whether the linkText field is set.
   */
  boolean hasLinkText();
  /**
   * <pre>
   * Text of the link to the dialog.
   * </pre>
   *
   * <code>optional string link_text = 1;</code>
   * @return The linkText.
   */
  java.lang.String getLinkText();
  /**
   * <pre>
   * Text of the link to the dialog.
   * </pre>
   *
   * <code>optional string link_text = 1;</code>
   * @return The bytes for linkText.
   */
  com.google.protobuf.ByteString
      getLinkTextBytes();

  /**
   * <pre>
   * Content of the dialog
   * </pre>
   *
   * <code>optional string dialog_title = 2;</code>
   * @return Whether the dialogTitle field is set.
   */
  boolean hasDialogTitle();
  /**
   * <pre>
   * Content of the dialog
   * </pre>
   *
   * <code>optional string dialog_title = 2;</code>
   * @return The dialogTitle.
   */
  java.lang.String getDialogTitle();
  /**
   * <pre>
   * Content of the dialog
   * </pre>
   *
   * <code>optional string dialog_title = 2;</code>
   * @return The bytes for dialogTitle.
   */
  com.google.protobuf.ByteString
      getDialogTitleBytes();

  /**
   * <code>optional string dialog_text = 3;</code>
   * @return Whether the dialogText field is set.
   */
  boolean hasDialogText();
  /**
   * <code>optional string dialog_text = 3;</code>
   * @return The dialogText.
   */
  java.lang.String getDialogText();
  /**
   * <code>optional string dialog_text = 3;</code>
   * @return The bytes for dialogText.
   */
  com.google.protobuf.ByteString
      getDialogTextBytes();

  /**
   * <code>optional string dialog_button_text = 4;</code>
   * @return Whether the dialogButtonText field is set.
   */
  boolean hasDialogButtonText();
  /**
   * <code>optional string dialog_button_text = 4;</code>
   * @return The dialogButtonText.
   */
  java.lang.String getDialogButtonText();
  /**
   * <code>optional string dialog_button_text = 4;</code>
   * @return The bytes for dialogButtonText.
   */
  com.google.protobuf.ByteString
      getDialogButtonTextBytes();
}