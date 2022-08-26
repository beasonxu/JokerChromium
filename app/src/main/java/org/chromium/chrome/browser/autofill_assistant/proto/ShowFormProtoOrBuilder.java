// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ShowFormProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ShowFormProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The form to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto form = 1;</code>
   * @return Whether the form field is set.
   */
  boolean hasForm();
  /**
   * <pre>
   * The form to display.
   * </pre>
   *
   * <code>optional .autofill_assistant.FormProto form = 1;</code>
   * @return The form.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.FormProto getForm();

  /**
   * <pre>
   * The chip to display below the form. This chip will be enabled only if all
   * form inputs are valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
   * @return Whether the chip field is set.
   */
  boolean hasChip();
  /**
   * <pre>
   * The chip to display below the form. This chip will be enabled only if all
   * form inputs are valid.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto chip = 2;</code>
   * @return The chip.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ChipProto getChip();
}
