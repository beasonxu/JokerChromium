// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.ScriptParameterProto}
 */
public  final class ScriptParameterProto extends
    com.google.protobuf.GeneratedMessageLite<
        ScriptParameterProto, ScriptParameterProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ScriptParameterProto)
    ScriptParameterProtoOrBuilder {
  private ScriptParameterProto() {
    name_ = "";
    value_ = "";
  }
  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 3;
  private java.lang.String name_;
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 3;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 3;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    name_ = value;
  }
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 3;</code>
   */
  private void clearName() {
    bitField0_ = (bitField0_ & ~0x00000001);
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * Parameter name, as found in the Intent, without prefix.
   * </pre>
   *
   * <code>optional string name = 3;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    name_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private java.lang.String value_;
  /**
   * <code>optional string value = 2;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    return value_;
  }
  /**
   * <code>optional string value = 2;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(value_);
  }
  /**
   * <code>optional string value = 2;</code>
   * @param value The value to set.
   */
  private void setValue(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000002;
    value_ = value;
  }
  /**
   * <code>optional string value = 2;</code>
   */
  private void clearValue() {
    bitField0_ = (bitField0_ & ~0x00000002);
    value_ = getDefaultInstance().getValue();
  }
  /**
   * <code>optional string value = 2;</code>
   * @param value The bytes for value to set.
   */
  private void setValueBytes(
      com.google.protobuf.ByteString value) {
    value_ = value.toStringUtf8();
    bitField0_ |= 0x00000002;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.ScriptParameterProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ScriptParameterProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Parameter name, as found in the Intent, without prefix.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return instance.hasName();
    }
    /**
     * <pre>
     * Parameter name, as found in the Intent, without prefix.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * Parameter name, as found in the Intent, without prefix.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * Parameter name, as found in the Intent, without prefix.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * Parameter name, as found in the Intent, without prefix.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * Parameter name, as found in the Intent, without prefix.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>optional string value = 2;</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return instance.hasValue();
    }
    /**
     * <code>optional string value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public java.lang.String getValue() {
      return instance.getValue();
    }
    /**
     * <code>optional string value = 2;</code>
     * @return The bytes for value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getValueBytes() {
      return instance.getValueBytes();
    }
    /**
     * <code>optional string value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <code>optional string value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }
    /**
     * <code>optional string value = 2;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setValueBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ScriptParameterProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "value_",
            "name_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003" +
              "\u1008\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ScriptParameterProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto DEFAULT_INSTANCE;
  static {
    ScriptParameterProto defaultInstance = new ScriptParameterProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ScriptParameterProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ScriptParameterProto> PARSER;

  public static com.google.protobuf.Parser<ScriptParameterProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

