// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Set the touchable and restricted area of the overlay.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.SetTouchableAreaProto}
 */
public  final class SetTouchableAreaProto extends
    com.google.protobuf.GeneratedMessageLite<
        SetTouchableAreaProto, SetTouchableAreaProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.SetTouchableAreaProto)
    SetTouchableAreaProtoOrBuilder {
  private SetTouchableAreaProto() {
  }
  private int bitField0_;
  public static final int ELEMENT_AREA_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto elementArea_;
  /**
   * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
   */
  @java.lang.Override
  public boolean hasElementArea() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto getElementArea() {
    return elementArea_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto.getDefaultInstance() : elementArea_;
  }
  /**
   * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
   */
  private void setElementArea(org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto value) {
    value.getClass();
  elementArea_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeElementArea(org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto value) {
    value.getClass();
  if (elementArea_ != null &&
        elementArea_ != org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto.getDefaultInstance()) {
      elementArea_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto.newBuilder(elementArea_).mergeFrom(value).buildPartial();
    } else {
      elementArea_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
   */
  private void clearElementArea() {  elementArea_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Set the touchable and restricted area of the overlay.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.SetTouchableAreaProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.SetTouchableAreaProto)
      org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
     */
    @java.lang.Override
    public boolean hasElementArea() {
      return instance.hasElementArea();
    }
    /**
     * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto getElementArea() {
      return instance.getElementArea();
    }
    /**
     * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
     */
    public Builder setElementArea(org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto value) {
      copyOnWrite();
      instance.setElementArea(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
     */
    public Builder setElementArea(
        org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto.Builder builderForValue) {
      copyOnWrite();
      instance.setElementArea(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
     */
    public Builder mergeElementArea(org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto value) {
      copyOnWrite();
      instance.mergeElementArea(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ElementAreaProto element_area = 1;</code>
     */
    public Builder clearElementArea() {  copyOnWrite();
      instance.clearElementArea();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.SetTouchableAreaProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "elementArea_",
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.SetTouchableAreaProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto DEFAULT_INSTANCE;
  static {
    SetTouchableAreaProto defaultInstance = new SetTouchableAreaProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SetTouchableAreaProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetTouchableAreaProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SetTouchableAreaProto> PARSER;

  public static com.google.protobuf.Parser<SetTouchableAreaProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
