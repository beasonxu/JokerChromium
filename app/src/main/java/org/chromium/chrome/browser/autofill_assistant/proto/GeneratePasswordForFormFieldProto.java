// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Asks the password manager to generate a suitable password for |element|. The
 * generated password can be filled in subsequent actions.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.GeneratePasswordForFormFieldProto}
 */
public  final class GeneratePasswordForFormFieldProto extends
    com.google.protobuf.GeneratedMessageLite<
        GeneratePasswordForFormFieldProto, GeneratePasswordForFormFieldProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.GeneratePasswordForFormFieldProto)
    GeneratePasswordForFormFieldProtoOrBuilder {
  private GeneratePasswordForFormFieldProto() {
    memoryKey_ = "";
  }
  private int bitField0_;
  public static final int ELEMENT_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto element_;
  /**
   * <pre>
   * A reference to the form element for which to generate a password.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   */
  @java.lang.Override
  public boolean hasElement() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * A reference to the form element for which to generate a password.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto getElement() {
    return element_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto.getDefaultInstance() : element_;
  }
  /**
   * <pre>
   * A reference to the form element for which to generate a password.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   */
  private void setElement(org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto value) {
    value.getClass();
  element_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * A reference to the form element for which to generate a password.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeElement(org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto value) {
    value.getClass();
  if (element_ != null &&
        element_ != org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto.getDefaultInstance()) {
      element_ =
        org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto.newBuilder(element_).mergeFrom(value).buildPartial();
    } else {
      element_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * A reference to the form element for which to generate a password.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   */
  private void clearElement() {  element_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int MEMORY_KEY_FIELD_NUMBER = 2;
  private java.lang.String memoryKey_;
  /**
   * <pre>
   * The client memory key to store the generated password.
   * </pre>
   *
   * <code>optional string memory_key = 2;</code>
   * @return Whether the memoryKey field is set.
   */
  @java.lang.Override
  public boolean hasMemoryKey() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The client memory key to store the generated password.
   * </pre>
   *
   * <code>optional string memory_key = 2;</code>
   * @return The memoryKey.
   */
  @java.lang.Override
  public java.lang.String getMemoryKey() {
    return memoryKey_;
  }
  /**
   * <pre>
   * The client memory key to store the generated password.
   * </pre>
   *
   * <code>optional string memory_key = 2;</code>
   * @return The bytes for memoryKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMemoryKeyBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(memoryKey_);
  }
  /**
   * <pre>
   * The client memory key to store the generated password.
   * </pre>
   *
   * <code>optional string memory_key = 2;</code>
   * @param value The memoryKey to set.
   */
  private void setMemoryKey(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000002;
    memoryKey_ = value;
  }
  /**
   * <pre>
   * The client memory key to store the generated password.
   * </pre>
   *
   * <code>optional string memory_key = 2;</code>
   */
  private void clearMemoryKey() {
    bitField0_ = (bitField0_ & ~0x00000002);
    memoryKey_ = getDefaultInstance().getMemoryKey();
  }
  /**
   * <pre>
   * The client memory key to store the generated password.
   * </pre>
   *
   * <code>optional string memory_key = 2;</code>
   * @param value The bytes for memoryKey to set.
   */
  private void setMemoryKeyBytes(
      com.google.protobuf.ByteString value) {
    memoryKey_ = value.toStringUtf8();
    bitField0_ |= 0x00000002;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Asks the password manager to generate a suitable password for |element|. The
   * generated password can be filled in subsequent actions.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.GeneratePasswordForFormFieldProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.GeneratePasswordForFormFieldProto)
      org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A reference to the form element for which to generate a password.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
     */
    @java.lang.Override
    public boolean hasElement() {
      return instance.hasElement();
    }
    /**
     * <pre>
     * A reference to the form element for which to generate a password.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto getElement() {
      return instance.getElement();
    }
    /**
     * <pre>
     * A reference to the form element for which to generate a password.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
     */
    public Builder setElement(org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto value) {
      copyOnWrite();
      instance.setElement(value);
      return this;
      }
    /**
     * <pre>
     * A reference to the form element for which to generate a password.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
     */
    public Builder setElement(
        org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto.Builder builderForValue) {
      copyOnWrite();
      instance.setElement(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A reference to the form element for which to generate a password.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
     */
    public Builder mergeElement(org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto value) {
      copyOnWrite();
      instance.mergeElement(value);
      return this;
    }
    /**
     * <pre>
     * A reference to the form element for which to generate a password.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
     */
    public Builder clearElement() {  copyOnWrite();
      instance.clearElement();
      return this;
    }

    /**
     * <pre>
     * The client memory key to store the generated password.
     * </pre>
     *
     * <code>optional string memory_key = 2;</code>
     * @return Whether the memoryKey field is set.
     */
    @java.lang.Override
    public boolean hasMemoryKey() {
      return instance.hasMemoryKey();
    }
    /**
     * <pre>
     * The client memory key to store the generated password.
     * </pre>
     *
     * <code>optional string memory_key = 2;</code>
     * @return The memoryKey.
     */
    @java.lang.Override
    public java.lang.String getMemoryKey() {
      return instance.getMemoryKey();
    }
    /**
     * <pre>
     * The client memory key to store the generated password.
     * </pre>
     *
     * <code>optional string memory_key = 2;</code>
     * @return The bytes for memoryKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMemoryKeyBytes() {
      return instance.getMemoryKeyBytes();
    }
    /**
     * <pre>
     * The client memory key to store the generated password.
     * </pre>
     *
     * <code>optional string memory_key = 2;</code>
     * @param value The memoryKey to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryKey(
        java.lang.String value) {
      copyOnWrite();
      instance.setMemoryKey(value);
      return this;
    }
    /**
     * <pre>
     * The client memory key to store the generated password.
     * </pre>
     *
     * <code>optional string memory_key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemoryKey() {
      copyOnWrite();
      instance.clearMemoryKey();
      return this;
    }
    /**
     * <pre>
     * The client memory key to store the generated password.
     * </pre>
     *
     * <code>optional string memory_key = 2;</code>
     * @param value The bytes for memoryKey to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryKeyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMemoryKeyBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.GeneratePasswordForFormFieldProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "element_",
            "memoryKey_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1008\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.GeneratePasswordForFormFieldProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto DEFAULT_INSTANCE;
  static {
    GeneratePasswordForFormFieldProto defaultInstance = new GeneratePasswordForFormFieldProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GeneratePasswordForFormFieldProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.GeneratePasswordForFormFieldProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GeneratePasswordForFormFieldProto> PARSER;

  public static com.google.protobuf.Parser<GeneratePasswordForFormFieldProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

