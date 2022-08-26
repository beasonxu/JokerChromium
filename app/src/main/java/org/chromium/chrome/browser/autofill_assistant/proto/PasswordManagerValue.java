// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/action_value.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * A value that allows filling usernames and passwords stored in the password
 * manager. The credentials have to be selected before in a CollectUserData
 * step.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.PasswordManagerValue}
 */
public  final class PasswordManagerValue extends
    com.google.protobuf.GeneratedMessageLite<
        PasswordManagerValue, PasswordManagerValue.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.PasswordManagerValue)
    PasswordManagerValueOrBuilder {
  private PasswordManagerValue() {
  }
  /**
   * Protobuf enum {@code autofill_assistant.PasswordManagerValue.CredentialType}
   */
  public enum CredentialType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>NOT_SET = 0;</code>
     */
    NOT_SET(0),
    /**
     * <code>PASSWORD = 1;</code>
     */
    PASSWORD(1),
    /**
     * <code>USERNAME = 2;</code>
     */
    USERNAME(2),
    ;

    /**
     * <code>NOT_SET = 0;</code>
     */
    public static final int NOT_SET_VALUE = 0;
    /**
     * <code>PASSWORD = 1;</code>
     */
    public static final int PASSWORD_VALUE = 1;
    /**
     * <code>USERNAME = 2;</code>
     */
    public static final int USERNAME_VALUE = 2;


    @java.lang.Override
    public final int getNumber() {
      return value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CredentialType valueOf(int value) {
      return forNumber(value);
    }

    public static CredentialType forNumber(int value) {
      switch (value) {
        case 0: return NOT_SET;
        case 1: return PASSWORD;
        case 2: return USERNAME;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CredentialType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CredentialType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CredentialType>() {
            @java.lang.Override
            public CredentialType findValueByNumber(int number) {
              return CredentialType.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return CredentialTypeVerifier.INSTANCE;
    }

    private static final class CredentialTypeVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new CredentialTypeVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return CredentialType.forNumber(number) != null;
            }
          };

    private final int value;

    private CredentialType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:autofill_assistant.PasswordManagerValue.CredentialType)
  }

  private int bitField0_;
  public static final int CREDENTIAL_TYPE_FIELD_NUMBER = 1;
  private int credentialType_;
  /**
   * <code>optional .autofill_assistant.PasswordManagerValue.CredentialType credential_type = 1;</code>
   * @return Whether the credentialType field is set.
   */
  @java.lang.Override
  public boolean hasCredentialType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .autofill_assistant.PasswordManagerValue.CredentialType credential_type = 1;</code>
   * @return The credentialType.
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.CredentialType getCredentialType() {
    org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.CredentialType result = org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.CredentialType.forNumber(credentialType_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.CredentialType.NOT_SET : result;
  }
  /**
   * <code>optional .autofill_assistant.PasswordManagerValue.CredentialType credential_type = 1;</code>
   * @param value The credentialType to set.
   */
  private void setCredentialType(org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.CredentialType value) {
    credentialType_ = value.getNumber();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.PasswordManagerValue.CredentialType credential_type = 1;</code>
   */
  private void clearCredentialType() {
    bitField0_ = (bitField0_ & ~0x00000001);
    credentialType_ = 0;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A value that allows filling usernames and passwords stored in the password
   * manager. The credentials have to be selected before in a CollectUserData
   * step.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.PasswordManagerValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.PasswordManagerValue)
      org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValueOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.PasswordManagerValue.CredentialType credential_type = 1;</code>
     * @return Whether the credentialType field is set.
     */
    @java.lang.Override
    public boolean hasCredentialType() {
      return instance.hasCredentialType();
    }
    /**
     * <code>optional .autofill_assistant.PasswordManagerValue.CredentialType credential_type = 1;</code>
     * @return The credentialType.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.CredentialType getCredentialType() {
      return instance.getCredentialType();
    }
    /**
     * <code>optional .autofill_assistant.PasswordManagerValue.CredentialType credential_type = 1;</code>
     * @param value The enum numeric value on the wire for credentialType to set.
     * @return This builder for chaining.
     */
    public Builder setCredentialType(org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.CredentialType value) {
      copyOnWrite();
      instance.setCredentialType(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.PasswordManagerValue.CredentialType credential_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCredentialType() {
      copyOnWrite();
      instance.clearCredentialType();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.PasswordManagerValue)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "credentialType_",
            org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.CredentialType.internalGetVerifier(),
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.PasswordManagerValue)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue DEFAULT_INSTANCE;
  static {
    PasswordManagerValue defaultInstance = new PasswordManagerValue();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PasswordManagerValue.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PasswordManagerValue> PARSER;

  public static com.google.protobuf.Parser<PasswordManagerValue> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
