// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/dom_action.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ScrollContainerProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ScrollContainerProto)
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
   * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
   * @return Whether the scrollDistance field is set.
   */
  boolean hasScrollDistance();
  /**
   * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
   * @return The scrollDistance.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance getScrollDistance();

  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 3;</code>
   * @return Whether the animation field is set.
   */
  boolean hasAnimation();
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 3;</code>
   * @return The animation.
   */
  java.lang.String getAnimation();
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 3;</code>
   * @return The bytes for animation.
   */
  com.google.protobuf.ByteString
      getAnimationBytes();
}
