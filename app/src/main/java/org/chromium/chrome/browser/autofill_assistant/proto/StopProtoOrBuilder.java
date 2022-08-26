// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface StopProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.StopProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
   * Assistant.
   * </pre>
   *
   * <code>optional bool close_cct = 2;</code>
   * @return Whether the closeCct field is set.
   */
  boolean hasCloseCct();
  /**
   * <pre>
   * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
   * Assistant.
   * </pre>
   *
   * <code>optional bool close_cct = 2;</code>
   * @return The closeCct.
   */
  boolean getCloseCct();

  /**
   * <pre>
   * Whether to show the feedback chip once Autofill Assistant has stopped.
   * Note that this is only relevant if the UI is still being shown after the
   * stop, which happens only if:
   * - close_cct is false.
   * - The action preceding this one is a Tell action.
   * </pre>
   *
   * <code>optional bool show_feedback_chip = 3;</code>
   * @return Whether the showFeedbackChip field is set.
   */
  boolean hasShowFeedbackChip();
  /**
   * <pre>
   * Whether to show the feedback chip once Autofill Assistant has stopped.
   * Note that this is only relevant if the UI is still being shown after the
   * stop, which happens only if:
   * - close_cct is false.
   * - The action preceding this one is a Tell action.
   * </pre>
   *
   * <code>optional bool show_feedback_chip = 3;</code>
   * @return The showFeedbackChip.
   */
  boolean getShowFeedbackChip();
}