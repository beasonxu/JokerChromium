// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface NavigateProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.NavigateProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Navigate to the given URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * Navigate to the given URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * Navigate to the given URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * Navigate backward in the history. Action will return PRECONDITION_FAILED
   * if it is not possible.
   * </pre>
   *
   * <code>bool go_backward = 2;</code>
   * @return Whether the goBackward field is set.
   */
  boolean hasGoBackward();
  /**
   * <pre>
   * Navigate backward in the history. Action will return PRECONDITION_FAILED
   * if it is not possible.
   * </pre>
   *
   * <code>bool go_backward = 2;</code>
   * @return The goBackward.
   */
  boolean getGoBackward();

  /**
   * <pre>
   * Navigate forward in the history. Action will return PRECONDITION_FAILED
   * if it is not possible.
   * </pre>
   *
   * <code>bool go_forward = 3;</code>
   * @return Whether the goForward field is set.
   */
  boolean hasGoForward();
  /**
   * <pre>
   * Navigate forward in the history. Action will return PRECONDITION_FAILED
   * if it is not possible.
   * </pre>
   *
   * <code>bool go_forward = 3;</code>
   * @return The goForward.
   */
  boolean getGoForward();

  public org.chromium.chrome.browser.autofill_assistant.proto.NavigateProto.ValueCase getValueCase();
}