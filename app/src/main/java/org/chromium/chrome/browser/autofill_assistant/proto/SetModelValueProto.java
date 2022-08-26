// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Callback that writes the specified value to |model_identifier|.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.SetModelValueProto}
 */
public  final class SetModelValueProto extends
    com.google.protobuf.GeneratedMessageLite<
        SetModelValueProto, SetModelValueProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.SetModelValueProto)
    SetModelValueProtoOrBuilder {
  private SetModelValueProto() {
    modelIdentifier_ = "";
  }
  private int bitField0_;
  public static final int MODEL_IDENTIFIER_FIELD_NUMBER = 1;
  private java.lang.String modelIdentifier_;
  /**
   * <pre>
   * The model identifier to write to.
   * </pre>
   *
   * <code>optional string model_identifier = 1;</code>
   * @return Whether the modelIdentifier field is set.
   */
  @java.lang.Override
  public boolean hasModelIdentifier() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The model identifier to write to.
   * </pre>
   *
   * <code>optional string model_identifier = 1;</code>
   * @return The modelIdentifier.
   */
  @java.lang.Override
  public java.lang.String getModelIdentifier() {
    return modelIdentifier_;
  }
  /**
   * <pre>
   * The model identifier to write to.
   * </pre>
   *
   * <code>optional string model_identifier = 1;</code>
   * @return The bytes for modelIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelIdentifierBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(modelIdentifier_);
  }
  /**
   * <pre>
   * The model identifier to write to.
   * </pre>
   *
   * <code>optional string model_identifier = 1;</code>
   * @param value The modelIdentifier to set.
   */
  private void setModelIdentifier(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    modelIdentifier_ = value;
  }
  /**
   * <pre>
   * The model identifier to write to.
   * </pre>
   *
   * <code>optional string model_identifier = 1;</code>
   */
  private void clearModelIdentifier() {
    bitField0_ = (bitField0_ & ~0x00000001);
    modelIdentifier_ = getDefaultInstance().getModelIdentifier();
  }
  /**
   * <pre>
   * The model identifier to write to.
   * </pre>
   *
   * <code>optional string model_identifier = 1;</code>
   * @param value The bytes for modelIdentifier to set.
   */
  private void setModelIdentifierBytes(
      com.google.protobuf.ByteString value) {
    modelIdentifier_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value_;
  /**
   * <pre>
   * The value to write.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The value to write.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getValue() {
    return value_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * The value to write.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
   */
  private void setValue(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
    value.getClass();
  value_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * The value to write.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeValue(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
    value.getClass();
  if (value_ != null &&
        value_ != org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.getDefaultInstance()) {
      value_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.newBuilder(value_).mergeFrom(value).buildPartial();
    } else {
      value_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The value to write.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
   */
  private void clearValue() {  value_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Callback that writes the specified value to |model_identifier|.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.SetModelValueProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.SetModelValueProto)
      org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The model identifier to write to.
     * </pre>
     *
     * <code>optional string model_identifier = 1;</code>
     * @return Whether the modelIdentifier field is set.
     */
    @java.lang.Override
    public boolean hasModelIdentifier() {
      return instance.hasModelIdentifier();
    }
    /**
     * <pre>
     * The model identifier to write to.
     * </pre>
     *
     * <code>optional string model_identifier = 1;</code>
     * @return The modelIdentifier.
     */
    @java.lang.Override
    public java.lang.String getModelIdentifier() {
      return instance.getModelIdentifier();
    }
    /**
     * <pre>
     * The model identifier to write to.
     * </pre>
     *
     * <code>optional string model_identifier = 1;</code>
     * @return The bytes for modelIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelIdentifierBytes() {
      return instance.getModelIdentifierBytes();
    }
    /**
     * <pre>
     * The model identifier to write to.
     * </pre>
     *
     * <code>optional string model_identifier = 1;</code>
     * @param value The modelIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setModelIdentifier(
        java.lang.String value) {
      copyOnWrite();
      instance.setModelIdentifier(value);
      return this;
    }
    /**
     * <pre>
     * The model identifier to write to.
     * </pre>
     *
     * <code>optional string model_identifier = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelIdentifier() {
      copyOnWrite();
      instance.clearModelIdentifier();
      return this;
    }
    /**
     * <pre>
     * The model identifier to write to.
     * </pre>
     *
     * <code>optional string model_identifier = 1;</code>
     * @param value The bytes for modelIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setModelIdentifierBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setModelIdentifierBytes(value);
      return this;
    }

    /**
     * <pre>
     * The value to write.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
     */
    @java.lang.Override
    public boolean hasValue() {
      return instance.hasValue();
    }
    /**
     * <pre>
     * The value to write.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * The value to write.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
     */
    public Builder setValue(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
      }
    /**
     * <pre>
     * The value to write.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
     */
    public Builder setValue(
        org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setValue(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The value to write.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
     */
    public Builder mergeValue(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
      copyOnWrite();
      instance.mergeValue(value);
      return this;
    }
    /**
     * <pre>
     * The value to write.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 3;</code>
     */
    public Builder clearValue() {  copyOnWrite();
      instance.clearValue();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.SetModelValueProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "modelIdentifier_",
            "value_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003" +
              "\u1009\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.SetModelValueProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto DEFAULT_INSTANCE;
  static {
    SetModelValueProto defaultInstance = new SetModelValueProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SetModelValueProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetModelValueProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SetModelValueProto> PARSER;

  public static com.google.protobuf.Parser<SetModelValueProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

