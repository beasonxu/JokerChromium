// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Asks the password save manager to save generated password after successful
 * submission.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.SaveGeneratedPasswordProto}
 */
public  final class SaveGeneratedPasswordProto extends
    com.google.protobuf.GeneratedMessageLite<
        SaveGeneratedPasswordProto, SaveGeneratedPasswordProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.SaveGeneratedPasswordProto)
    SaveGeneratedPasswordProtoOrBuilder {
  private SaveGeneratedPasswordProto() {
    memoryKey_ = "";
  }
  private int bitField0_;
  public static final int MEMORY_KEY_FIELD_NUMBER = 1;
  private java.lang.String memoryKey_;
  /**
   * <pre>
   * The client memory key of stored password.
   * </pre>
   *
   * <code>optional string memory_key = 1;</code>
   * @return Whether the memoryKey field is set.
   */
  @java.lang.Override
  public boolean hasMemoryKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The client memory key of stored password.
   * </pre>
   *
   * <code>optional string memory_key = 1;</code>
   * @return The memoryKey.
   */
  @java.lang.Override
  public java.lang.String getMemoryKey() {
    return memoryKey_;
  }
  /**
   * <pre>
   * The client memory key of stored password.
   * </pre>
   *
   * <code>optional string memory_key = 1;</code>
   * @return The bytes for memoryKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMemoryKeyBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(memoryKey_);
  }
  /**
   * <pre>
   * The client memory key of stored password.
   * </pre>
   *
   * <code>optional string memory_key = 1;</code>
   * @param value The memoryKey to set.
   */
  private void setMemoryKey(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    memoryKey_ = value;
  }
  /**
   * <pre>
   * The client memory key of stored password.
   * </pre>
   *
   * <code>optional string memory_key = 1;</code>
   */
  private void clearMemoryKey() {
    bitField0_ = (bitField0_ & ~0x00000001);
    memoryKey_ = getDefaultInstance().getMemoryKey();
  }
  /**
   * <pre>
   * The client memory key of stored password.
   * </pre>
   *
   * <code>optional string memory_key = 1;</code>
   * @param value The bytes for memoryKey to set.
   */
  private void setMemoryKeyBytes(
      com.google.protobuf.ByteString value) {
    memoryKey_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Asks the password save manager to save generated password after successful
   * submission.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.SaveGeneratedPasswordProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.SaveGeneratedPasswordProto)
      org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The client memory key of stored password.
     * </pre>
     *
     * <code>optional string memory_key = 1;</code>
     * @return Whether the memoryKey field is set.
     */
    @java.lang.Override
    public boolean hasMemoryKey() {
      return instance.hasMemoryKey();
    }
    /**
     * <pre>
     * The client memory key of stored password.
     * </pre>
     *
     * <code>optional string memory_key = 1;</code>
     * @return The memoryKey.
     */
    @java.lang.Override
    public java.lang.String getMemoryKey() {
      return instance.getMemoryKey();
    }
    /**
     * <pre>
     * The client memory key of stored password.
     * </pre>
     *
     * <code>optional string memory_key = 1;</code>
     * @return The bytes for memoryKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMemoryKeyBytes() {
      return instance.getMemoryKeyBytes();
    }
    /**
     * <pre>
     * The client memory key of stored password.
     * </pre>
     *
     * <code>optional string memory_key = 1;</code>
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
     * The client memory key of stored password.
     * </pre>
     *
     * <code>optional string memory_key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemoryKey() {
      copyOnWrite();
      instance.clearMemoryKey();
      return this;
    }
    /**
     * <pre>
     * The client memory key of stored password.
     * </pre>
     *
     * <code>optional string memory_key = 1;</code>
     * @param value The bytes for memoryKey to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryKeyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMemoryKeyBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.SaveGeneratedPasswordProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "memoryKey_",
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.SaveGeneratedPasswordProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto DEFAULT_INSTANCE;
  static {
    SaveGeneratedPasswordProto defaultInstance = new SaveGeneratedPasswordProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SaveGeneratedPasswordProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SaveGeneratedPasswordProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SaveGeneratedPasswordProto> PARSER;

  public static com.google.protobuf.Parser<SaveGeneratedPasswordProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
