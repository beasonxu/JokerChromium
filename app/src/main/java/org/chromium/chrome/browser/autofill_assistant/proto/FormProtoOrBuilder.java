// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface FormProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.FormProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The different inputs to display.
   * </pre>
   *
   * <code>repeated .autofill_assistant.FormInputProto inputs = 1;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto> 
      getInputsList();
  /**
   * <pre>
   * The different inputs to display.
   * </pre>
   *
   * <code>repeated .autofill_assistant.FormInputProto inputs = 1;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto getInputs(int index);
  /**
   * <pre>
   * The different inputs to display.
   * </pre>
   *
   * <code>repeated .autofill_assistant.FormInputProto inputs = 1;</code>
   */
  int getInputsCount();

  /**
   * <pre>
   * Optionally adds an informational text below the form.
   * </pre>
   *
   * <code>optional string info_label = 2;</code>
   * @return Whether the infoLabel field is set.
   */
  boolean hasInfoLabel();
  /**
   * <pre>
   * Optionally adds an informational text below the form.
   * </pre>
   *
   * <code>optional string info_label = 2;</code>
   * @return The infoLabel.
   */
  java.lang.String getInfoLabel();
  /**
   * <pre>
   * Optionally adds an informational text below the form.
   * </pre>
   *
   * <code>optional string info_label = 2;</code>
   * @return The bytes for infoLabel.
   */
  com.google.protobuf.ByteString
      getInfoLabelBytes();

  /**
   * <pre>
   * If set, an info icon will be shown next to the info label that prompts a
   * popup when tapped. Ignored if info_label is not set.
   * </pre>
   *
   * <code>optional .autofill_assistant.InfoPopupProto info_popup = 3;</code>
   * @return Whether the infoPopup field is set.
   */
  boolean hasInfoPopup();
  /**
   * <pre>
   * If set, an info icon will be shown next to the info label that prompts a
   * popup when tapped. Ignored if info_label is not set.
   * </pre>
   *
   * <code>optional .autofill_assistant.InfoPopupProto info_popup = 3;</code>
   * @return The infoPopup.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto getInfoPopup();
}