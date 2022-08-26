// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/dom_action.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.ScrollWindowProto}
 */
public  final class ScrollWindowProto extends
    com.google.protobuf.GeneratedMessageLite<
        ScrollWindowProto, ScrollWindowProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ScrollWindowProto)
    ScrollWindowProtoOrBuilder {
  private ScrollWindowProto() {
    animation_ = "";
  }
  private int bitField0_;
  public static final int OPTIONAL_FRAME_ID_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto optionalFrameId_;
  /**
   * <pre>
   * Optional frame. If not specified, will scroll the main window.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
   */
  @java.lang.Override
  public boolean hasOptionalFrameId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Optional frame. If not specified, will scroll the main window.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getOptionalFrameId() {
    return optionalFrameId_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance() : optionalFrameId_;
  }
  /**
   * <pre>
   * Optional frame. If not specified, will scroll the main window.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
   */
  private void setOptionalFrameId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  optionalFrameId_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Optional frame. If not specified, will scroll the main window.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeOptionalFrameId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  if (optionalFrameId_ != null &&
        optionalFrameId_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance()) {
      optionalFrameId_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.newBuilder(optionalFrameId_).mergeFrom(value).buildPartial();
    } else {
      optionalFrameId_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Optional frame. If not specified, will scroll the main window.
   * </pre>
   *
   * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
   */
  private void clearOptionalFrameId() {  optionalFrameId_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int SCROLL_DISTANCE_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance scrollDistance_;
  /**
   * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
   */
  @java.lang.Override
  public boolean hasScrollDistance() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance getScrollDistance() {
    return scrollDistance_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance.getDefaultInstance() : scrollDistance_;
  }
  /**
   * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
   */
  private void setScrollDistance(org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance value) {
    value.getClass();
  scrollDistance_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeScrollDistance(org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance value) {
    value.getClass();
  if (scrollDistance_ != null &&
        scrollDistance_ != org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance.getDefaultInstance()) {
      scrollDistance_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance.newBuilder(scrollDistance_).mergeFrom(value).buildPartial();
    } else {
      scrollDistance_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
   */
  private void clearScrollDistance() {  scrollDistance_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int ANIMATION_FIELD_NUMBER = 3;
  private java.lang.String animation_;
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 3;</code>
   * @return Whether the animation field is set.
   */
  @java.lang.Override
  public boolean hasAnimation() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 3;</code>
   * @return The animation.
   */
  @java.lang.Override
  public java.lang.String getAnimation() {
    return animation_;
  }
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 3;</code>
   * @return The bytes for animation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAnimationBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(animation_);
  }
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 3;</code>
   * @param value The animation to set.
   */
  private void setAnimation(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000004;
    animation_ = value;
  }
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 3;</code>
   */
  private void clearAnimation() {
    bitField0_ = (bitField0_ & ~0x00000004);
    animation_ = getDefaultInstance().getAnimation();
  }
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 3;</code>
   * @param value The bytes for animation to set.
   */
  private void setAnimationBytes(
      com.google.protobuf.ByteString value) {
    animation_ = value.toStringUtf8();
    bitField0_ |= 0x00000004;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.ScrollWindowProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ScrollWindowProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Optional frame. If not specified, will scroll the main window.
     * </pre>
     *
     * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
     */
    @java.lang.Override
    public boolean hasOptionalFrameId() {
      return instance.hasOptionalFrameId();
    }
    /**
     * <pre>
     * Optional frame. If not specified, will scroll the main window.
     * </pre>
     *
     * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getOptionalFrameId() {
      return instance.getOptionalFrameId();
    }
    /**
     * <pre>
     * Optional frame. If not specified, will scroll the main window.
     * </pre>
     *
     * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
     */
    public Builder setOptionalFrameId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.setOptionalFrameId(value);
      return this;
      }
    /**
     * <pre>
     * Optional frame. If not specified, will scroll the main window.
     * </pre>
     *
     * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
     */
    public Builder setOptionalFrameId(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.Builder builderForValue) {
      copyOnWrite();
      instance.setOptionalFrameId(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Optional frame. If not specified, will scroll the main window.
     * </pre>
     *
     * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
     */
    public Builder mergeOptionalFrameId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.mergeOptionalFrameId(value);
      return this;
    }
    /**
     * <pre>
     * Optional frame. If not specified, will scroll the main window.
     * </pre>
     *
     * <code>optional .autofill_assistant.ClientIdProto optional_frame_id = 1;</code>
     */
    public Builder clearOptionalFrameId() {  copyOnWrite();
      instance.clearOptionalFrameId();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
     */
    @java.lang.Override
    public boolean hasScrollDistance() {
      return instance.hasScrollDistance();
    }
    /**
     * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance getScrollDistance() {
      return instance.getScrollDistance();
    }
    /**
     * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
     */
    public Builder setScrollDistance(org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance value) {
      copyOnWrite();
      instance.setScrollDistance(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
     */
    public Builder setScrollDistance(
        org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance.Builder builderForValue) {
      copyOnWrite();
      instance.setScrollDistance(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
     */
    public Builder mergeScrollDistance(org.chromium.chrome.browser.autofill_assistant.proto.ScrollDistance value) {
      copyOnWrite();
      instance.mergeScrollDistance(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ScrollDistance scroll_distance = 2;</code>
     */
    public Builder clearScrollDistance() {  copyOnWrite();
      instance.clearScrollDistance();
      return this;
    }

    /**
     * <pre>
     * Defines the transition animation. One of "auto" or "smooth". Defaults to
     * "auto".
     * </pre>
     *
     * <code>optional string animation = 3;</code>
     * @return Whether the animation field is set.
     */
    @java.lang.Override
    public boolean hasAnimation() {
      return instance.hasAnimation();
    }
    /**
     * <pre>
     * Defines the transition animation. One of "auto" or "smooth". Defaults to
     * "auto".
     * </pre>
     *
     * <code>optional string animation = 3;</code>
     * @return The animation.
     */
    @java.lang.Override
    public java.lang.String getAnimation() {
      return instance.getAnimation();
    }
    /**
     * <pre>
     * Defines the transition animation. One of "auto" or "smooth". Defaults to
     * "auto".
     * </pre>
     *
     * <code>optional string animation = 3;</code>
     * @return The bytes for animation.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAnimationBytes() {
      return instance.getAnimationBytes();
    }
    /**
     * <pre>
     * Defines the transition animation. One of "auto" or "smooth". Defaults to
     * "auto".
     * </pre>
     *
     * <code>optional string animation = 3;</code>
     * @param value The animation to set.
     * @return This builder for chaining.
     */
    public Builder setAnimation(
        java.lang.String value) {
      copyOnWrite();
      instance.setAnimation(value);
      return this;
    }
    /**
     * <pre>
     * Defines the transition animation. One of "auto" or "smooth". Defaults to
     * "auto".
     * </pre>
     *
     * <code>optional string animation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimation() {
      copyOnWrite();
      instance.clearAnimation();
      return this;
    }
    /**
     * <pre>
     * Defines the transition animation. One of "auto" or "smooth". Defaults to
     * "auto".
     * </pre>
     *
     * <code>optional string animation = 3;</code>
     * @param value The bytes for animation to set.
     * @return This builder for chaining.
     */
    public Builder setAnimationBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAnimationBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ScrollWindowProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "optionalFrameId_",
            "scrollDistance_",
            "animation_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001\u0003\u1008\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.ScrollWindowProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto DEFAULT_INSTANCE;
  static {
    ScrollWindowProto defaultInstance = new ScrollWindowProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ScrollWindowProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollWindowProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ScrollWindowProto> PARSER;

  public static com.google.protobuf.Parser<ScrollWindowProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
