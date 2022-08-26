// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/dom_action.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Scroll the element into the view center.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ScrollIntoViewProto}
 */
public  final class ScrollIntoViewProto extends
    com.google.protobuf.GeneratedMessageLite<
        ScrollIntoViewProto, ScrollIntoViewProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ScrollIntoViewProto)
    ScrollIntoViewProtoOrBuilder {
  private ScrollIntoViewProto() {
    animation_ = "";
    verticalAlignment_ = "";
    horizontalAlignment_ = "";
  }
  private int bitField0_;
  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto clientId_;
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  @java.lang.Override
  public boolean hasClientId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getClientId() {
    return clientId_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance() : clientId_;
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  private void setClientId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  clientId_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeClientId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  if (clientId_ != null &&
        clientId_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance()) {
      clientId_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.newBuilder(clientId_).mergeFrom(value).buildPartial();
    } else {
      clientId_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  private void clearClientId() {  clientId_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int ANIMATION_FIELD_NUMBER = 2;
  private java.lang.String animation_;
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 2;</code>
   * @return Whether the animation field is set.
   */
  @java.lang.Override
  public boolean hasAnimation() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 2;</code>
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
   * <code>optional string animation = 2;</code>
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
   * <code>optional string animation = 2;</code>
   * @param value The animation to set.
   */
  private void setAnimation(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000002;
    animation_ = value;
  }
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 2;</code>
   */
  private void clearAnimation() {
    bitField0_ = (bitField0_ & ~0x00000002);
    animation_ = getDefaultInstance().getAnimation();
  }
  /**
   * <pre>
   * Defines the transition animation. One of "auto" or "smooth". Defaults to
   * "auto".
   * </pre>
   *
   * <code>optional string animation = 2;</code>
   * @param value The bytes for animation to set.
   */
  private void setAnimationBytes(
      com.google.protobuf.ByteString value) {
    animation_ = value.toStringUtf8();
    bitField0_ |= 0x00000002;
  }

  public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 3;
  private java.lang.String verticalAlignment_;
  /**
   * <pre>
   * Defines vertical alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string vertical_alignment = 3;</code>
   * @return Whether the verticalAlignment field is set.
   */
  @java.lang.Override
  public boolean hasVerticalAlignment() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Defines vertical alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string vertical_alignment = 3;</code>
   * @return The verticalAlignment.
   */
  @java.lang.Override
  public java.lang.String getVerticalAlignment() {
    return verticalAlignment_;
  }
  /**
   * <pre>
   * Defines vertical alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string vertical_alignment = 3;</code>
   * @return The bytes for verticalAlignment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVerticalAlignmentBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(verticalAlignment_);
  }
  /**
   * <pre>
   * Defines vertical alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string vertical_alignment = 3;</code>
   * @param value The verticalAlignment to set.
   */
  private void setVerticalAlignment(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000004;
    verticalAlignment_ = value;
  }
  /**
   * <pre>
   * Defines vertical alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string vertical_alignment = 3;</code>
   */
  private void clearVerticalAlignment() {
    bitField0_ = (bitField0_ & ~0x00000004);
    verticalAlignment_ = getDefaultInstance().getVerticalAlignment();
  }
  /**
   * <pre>
   * Defines vertical alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string vertical_alignment = 3;</code>
   * @param value The bytes for verticalAlignment to set.
   */
  private void setVerticalAlignmentBytes(
      com.google.protobuf.ByteString value) {
    verticalAlignment_ = value.toStringUtf8();
    bitField0_ |= 0x00000004;
  }

  public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
  private java.lang.String horizontalAlignment_;
  /**
   * <pre>
   * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string horizontal_alignment = 4;</code>
   * @return Whether the horizontalAlignment field is set.
   */
  @java.lang.Override
  public boolean hasHorizontalAlignment() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string horizontal_alignment = 4;</code>
   * @return The horizontalAlignment.
   */
  @java.lang.Override
  public java.lang.String getHorizontalAlignment() {
    return horizontalAlignment_;
  }
  /**
   * <pre>
   * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string horizontal_alignment = 4;</code>
   * @return The bytes for horizontalAlignment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHorizontalAlignmentBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(horizontalAlignment_);
  }
  /**
   * <pre>
   * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string horizontal_alignment = 4;</code>
   * @param value The horizontalAlignment to set.
   */
  private void setHorizontalAlignment(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000008;
    horizontalAlignment_ = value;
  }
  /**
   * <pre>
   * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string horizontal_alignment = 4;</code>
   */
  private void clearHorizontalAlignment() {
    bitField0_ = (bitField0_ & ~0x00000008);
    horizontalAlignment_ = getDefaultInstance().getHorizontalAlignment();
  }
  /**
   * <pre>
   * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
   * Defaults to "center".
   * </pre>
   *
   * <code>optional string horizontal_alignment = 4;</code>
   * @param value The bytes for horizontalAlignment to set.
   */
  private void setHorizontalAlignmentBytes(
      com.google.protobuf.ByteString value) {
    horizontalAlignment_ = value.toStringUtf8();
    bitField0_ |= 0x00000008;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Scroll the element into the view center.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ScrollIntoViewProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ScrollIntoViewProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    @java.lang.Override
    public boolean hasClientId() {
      return instance.hasClientId();
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getClientId() {
      return instance.getClientId();
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    public Builder setClientId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.setClientId(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    public Builder setClientId(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.Builder builderForValue) {
      copyOnWrite();
      instance.setClientId(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    public Builder mergeClientId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.mergeClientId(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    public Builder clearClientId() {  copyOnWrite();
      instance.clearClientId();
      return this;
    }

    /**
     * <pre>
     * Defines the transition animation. One of "auto" or "smooth". Defaults to
     * "auto".
     * </pre>
     *
     * <code>optional string animation = 2;</code>
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
     * <code>optional string animation = 2;</code>
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
     * <code>optional string animation = 2;</code>
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
     * <code>optional string animation = 2;</code>
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
     * <code>optional string animation = 2;</code>
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
     * <code>optional string animation = 2;</code>
     * @param value The bytes for animation to set.
     * @return This builder for chaining.
     */
    public Builder setAnimationBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAnimationBytes(value);
      return this;
    }

    /**
     * <pre>
     * Defines vertical alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string vertical_alignment = 3;</code>
     * @return Whether the verticalAlignment field is set.
     */
    @java.lang.Override
    public boolean hasVerticalAlignment() {
      return instance.hasVerticalAlignment();
    }
    /**
     * <pre>
     * Defines vertical alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string vertical_alignment = 3;</code>
     * @return The verticalAlignment.
     */
    @java.lang.Override
    public java.lang.String getVerticalAlignment() {
      return instance.getVerticalAlignment();
    }
    /**
     * <pre>
     * Defines vertical alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string vertical_alignment = 3;</code>
     * @return The bytes for verticalAlignment.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getVerticalAlignmentBytes() {
      return instance.getVerticalAlignmentBytes();
    }
    /**
     * <pre>
     * Defines vertical alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string vertical_alignment = 3;</code>
     * @param value The verticalAlignment to set.
     * @return This builder for chaining.
     */
    public Builder setVerticalAlignment(
        java.lang.String value) {
      copyOnWrite();
      instance.setVerticalAlignment(value);
      return this;
    }
    /**
     * <pre>
     * Defines vertical alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string vertical_alignment = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVerticalAlignment() {
      copyOnWrite();
      instance.clearVerticalAlignment();
      return this;
    }
    /**
     * <pre>
     * Defines vertical alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string vertical_alignment = 3;</code>
     * @param value The bytes for verticalAlignment to set.
     * @return This builder for chaining.
     */
    public Builder setVerticalAlignmentBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setVerticalAlignmentBytes(value);
      return this;
    }

    /**
     * <pre>
     * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string horizontal_alignment = 4;</code>
     * @return Whether the horizontalAlignment field is set.
     */
    @java.lang.Override
    public boolean hasHorizontalAlignment() {
      return instance.hasHorizontalAlignment();
    }
    /**
     * <pre>
     * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string horizontal_alignment = 4;</code>
     * @return The horizontalAlignment.
     */
    @java.lang.Override
    public java.lang.String getHorizontalAlignment() {
      return instance.getHorizontalAlignment();
    }
    /**
     * <pre>
     * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string horizontal_alignment = 4;</code>
     * @return The bytes for horizontalAlignment.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHorizontalAlignmentBytes() {
      return instance.getHorizontalAlignmentBytes();
    }
    /**
     * <pre>
     * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string horizontal_alignment = 4;</code>
     * @param value The horizontalAlignment to set.
     * @return This builder for chaining.
     */
    public Builder setHorizontalAlignment(
        java.lang.String value) {
      copyOnWrite();
      instance.setHorizontalAlignment(value);
      return this;
    }
    /**
     * <pre>
     * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string horizontal_alignment = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHorizontalAlignment() {
      copyOnWrite();
      instance.clearHorizontalAlignment();
      return this;
    }
    /**
     * <pre>
     * Defines horizontal alignment. One of "start", "center", "end" or "nearest".
     * Defaults to "center".
     * </pre>
     *
     * <code>optional string horizontal_alignment = 4;</code>
     * @param value The bytes for horizontalAlignment to set.
     * @return This builder for chaining.
     */
    public Builder setHorizontalAlignmentBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHorizontalAlignmentBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ScrollIntoViewProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "clientId_",
            "animation_",
            "verticalAlignment_",
            "horizontalAlignment_",
          };
          java.lang.String info =
              "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ScrollIntoViewProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto DEFAULT_INSTANCE;
  static {
    ScrollIntoViewProto defaultInstance = new ScrollIntoViewProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ScrollIntoViewProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScrollIntoViewProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ScrollIntoViewProto> PARSER;

  public static com.google.protobuf.Parser<ScrollIntoViewProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

