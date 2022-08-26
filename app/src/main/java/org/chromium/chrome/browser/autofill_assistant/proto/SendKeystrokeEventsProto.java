// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/dom_action.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Send a keydown followed by a keyup event per character to the element. This
 * requires the element to have focus to receive them. Some characters (like
 * new line) are treated as special keys.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.SendKeystrokeEventsProto}
 */
public  final class SendKeystrokeEventsProto extends
    com.google.protobuf.GeneratedMessageLite<
        SendKeystrokeEventsProto, SendKeystrokeEventsProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.SendKeystrokeEventsProto)
    SendKeystrokeEventsProtoOrBuilder {
  private SendKeystrokeEventsProto() {
  }
  public interface ResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:autofill_assistant.SendKeystrokeEventsProto.Result)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The number of months since the password used to fill an
     * input was last used.
     * If the input is not of password type or an error happens,
     * this field will be empty.
     * </pre>
     *
     * <code>optional int32 months_since_password_last_used = 1;</code>
     * @return Whether the monthsSincePasswordLastUsed field is set.
     */
    boolean hasMonthsSincePasswordLastUsed();
    /**
     * <pre>
     * The number of months since the password used to fill an
     * input was last used.
     * If the input is not of password type or an error happens,
     * this field will be empty.
     * </pre>
     *
     * <code>optional int32 months_since_password_last_used = 1;</code>
     * @return The monthsSincePasswordLastUsed.
     */
    int getMonthsSincePasswordLastUsed();
  }
  /**
   * Protobuf type {@code autofill_assistant.SendKeystrokeEventsProto.Result}
   */
  public  static final class Result extends
      com.google.protobuf.GeneratedMessageLite<
          Result, Result.Builder> implements
      // @@protoc_insertion_point(message_implements:autofill_assistant.SendKeystrokeEventsProto.Result)
      ResultOrBuilder {
    private Result() {
    }
    private int bitField0_;
    public static final int MONTHS_SINCE_PASSWORD_LAST_USED_FIELD_NUMBER = 1;
    private int monthsSincePasswordLastUsed_;
    /**
     * <pre>
     * The number of months since the password used to fill an
     * input was last used.
     * If the input is not of password type or an error happens,
     * this field will be empty.
     * </pre>
     *
     * <code>optional int32 months_since_password_last_used = 1;</code>
     * @return Whether the monthsSincePasswordLastUsed field is set.
     */
    @java.lang.Override
    public boolean hasMonthsSincePasswordLastUsed() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The number of months since the password used to fill an
     * input was last used.
     * If the input is not of password type or an error happens,
     * this field will be empty.
     * </pre>
     *
     * <code>optional int32 months_since_password_last_used = 1;</code>
     * @return The monthsSincePasswordLastUsed.
     */
    @java.lang.Override
    public int getMonthsSincePasswordLastUsed() {
      return monthsSincePasswordLastUsed_;
    }
    /**
     * <pre>
     * The number of months since the password used to fill an
     * input was last used.
     * If the input is not of password type or an error happens,
     * this field will be empty.
     * </pre>
     *
     * <code>optional int32 months_since_password_last_used = 1;</code>
     * @param value The monthsSincePasswordLastUsed to set.
     */
    private void setMonthsSincePasswordLastUsed(int value) {
      bitField0_ |= 0x00000001;
      monthsSincePasswordLastUsed_ = value;
    }
    /**
     * <pre>
     * The number of months since the password used to fill an
     * input was last used.
     * If the input is not of password type or an error happens,
     * this field will be empty.
     * </pre>
     *
     * <code>optional int32 months_since_password_last_used = 1;</code>
     */
    private void clearMonthsSincePasswordLastUsed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      monthsSincePasswordLastUsed_ = 0;
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code autofill_assistant.SendKeystrokeEventsProto.Result}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result, Builder> implements
        // @@protoc_insertion_point(builder_implements:autofill_assistant.SendKeystrokeEventsProto.Result)
        org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.ResultOrBuilder {
      // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * The number of months since the password used to fill an
       * input was last used.
       * If the input is not of password type or an error happens,
       * this field will be empty.
       * </pre>
       *
       * <code>optional int32 months_since_password_last_used = 1;</code>
       * @return Whether the monthsSincePasswordLastUsed field is set.
       */
      @java.lang.Override
      public boolean hasMonthsSincePasswordLastUsed() {
        return instance.hasMonthsSincePasswordLastUsed();
      }
      /**
       * <pre>
       * The number of months since the password used to fill an
       * input was last used.
       * If the input is not of password type or an error happens,
       * this field will be empty.
       * </pre>
       *
       * <code>optional int32 months_since_password_last_used = 1;</code>
       * @return The monthsSincePasswordLastUsed.
       */
      @java.lang.Override
      public int getMonthsSincePasswordLastUsed() {
        return instance.getMonthsSincePasswordLastUsed();
      }
      /**
       * <pre>
       * The number of months since the password used to fill an
       * input was last used.
       * If the input is not of password type or an error happens,
       * this field will be empty.
       * </pre>
       *
       * <code>optional int32 months_since_password_last_used = 1;</code>
       * @param value The monthsSincePasswordLastUsed to set.
       * @return This builder for chaining.
       */
      public Builder setMonthsSincePasswordLastUsed(int value) {
        copyOnWrite();
        instance.setMonthsSincePasswordLastUsed(value);
        return this;
      }
      /**
       * <pre>
       * The number of months since the password used to fill an
       * input was last used.
       * If the input is not of password type or an error happens,
       * this field will be empty.
       * </pre>
       *
       * <code>optional int32 months_since_password_last_used = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonthsSincePasswordLastUsed() {
        copyOnWrite();
        instance.clearMonthsSincePasswordLastUsed();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:autofill_assistant.SendKeystrokeEventsProto.Result)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "monthsSincePasswordLastUsed_",
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result>(
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


    // @@protoc_insertion_point(class_scope:autofill_assistant.SendKeystrokeEventsProto.Result)
    private static final org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result DEFAULT_INSTANCE;
    static {
      Result defaultInstance = new Result();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Result.class, defaultInstance);
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.Result getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Result> PARSER;

    public static com.google.protobuf.Parser<Result> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
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

  public static final int VALUE_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.TextValue value_;
  /**
   * <code>optional .autofill_assistant.TextValue value = 2;</code>
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .autofill_assistant.TextValue value = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.TextValue getValue() {
    return value_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.TextValue.getDefaultInstance() : value_;
  }
  /**
   * <code>optional .autofill_assistant.TextValue value = 2;</code>
   */
  private void setValue(org.chromium.chrome.browser.autofill_assistant.proto.TextValue value) {
    value.getClass();
  value_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .autofill_assistant.TextValue value = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeValue(org.chromium.chrome.browser.autofill_assistant.proto.TextValue value) {
    value.getClass();
  if (value_ != null &&
        value_ != org.chromium.chrome.browser.autofill_assistant.proto.TextValue.getDefaultInstance()) {
      value_ =
        org.chromium.chrome.browser.autofill_assistant.proto.TextValue.newBuilder(value_).mergeFrom(value).buildPartial();
    } else {
      value_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .autofill_assistant.TextValue value = 2;</code>
   */
  private void clearValue() {  value_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int DELAY_IN_MS_FIELD_NUMBER = 3;
  private int delayInMs_;
  /**
   * <code>optional int32 delay_in_ms = 3;</code>
   * @return Whether the delayInMs field is set.
   */
  @java.lang.Override
  public boolean hasDelayInMs() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 delay_in_ms = 3;</code>
   * @return The delayInMs.
   */
  @java.lang.Override
  public int getDelayInMs() {
    return delayInMs_;
  }
  /**
   * <code>optional int32 delay_in_ms = 3;</code>
   * @param value The delayInMs to set.
   */
  private void setDelayInMs(int value) {
    bitField0_ |= 0x00000004;
    delayInMs_ = value;
  }
  /**
   * <code>optional int32 delay_in_ms = 3;</code>
   */
  private void clearDelayInMs() {
    bitField0_ = (bitField0_ & ~0x00000004);
    delayInMs_ = 0;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Send a keydown followed by a keyup event per character to the element. This
   * requires the element to have focus to receive them. Some characters (like
   * new line) are treated as special keys.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.SendKeystrokeEventsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.SendKeystrokeEventsProto)
      org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.newBuilder()
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
     * <code>optional .autofill_assistant.TextValue value = 2;</code>
     */
    @java.lang.Override
    public boolean hasValue() {
      return instance.hasValue();
    }
    /**
     * <code>optional .autofill_assistant.TextValue value = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.TextValue getValue() {
      return instance.getValue();
    }
    /**
     * <code>optional .autofill_assistant.TextValue value = 2;</code>
     */
    public Builder setValue(org.chromium.chrome.browser.autofill_assistant.proto.TextValue value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.TextValue value = 2;</code>
     */
    public Builder setValue(
        org.chromium.chrome.browser.autofill_assistant.proto.TextValue.Builder builderForValue) {
      copyOnWrite();
      instance.setValue(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.TextValue value = 2;</code>
     */
    public Builder mergeValue(org.chromium.chrome.browser.autofill_assistant.proto.TextValue value) {
      copyOnWrite();
      instance.mergeValue(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.TextValue value = 2;</code>
     */
    public Builder clearValue() {  copyOnWrite();
      instance.clearValue();
      return this;
    }

    /**
     * <code>optional int32 delay_in_ms = 3;</code>
     * @return Whether the delayInMs field is set.
     */
    @java.lang.Override
    public boolean hasDelayInMs() {
      return instance.hasDelayInMs();
    }
    /**
     * <code>optional int32 delay_in_ms = 3;</code>
     * @return The delayInMs.
     */
    @java.lang.Override
    public int getDelayInMs() {
      return instance.getDelayInMs();
    }
    /**
     * <code>optional int32 delay_in_ms = 3;</code>
     * @param value The delayInMs to set.
     * @return This builder for chaining.
     */
    public Builder setDelayInMs(int value) {
      copyOnWrite();
      instance.setDelayInMs(value);
      return this;
    }
    /**
     * <code>optional int32 delay_in_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDelayInMs() {
      copyOnWrite();
      instance.clearDelayInMs();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.SendKeystrokeEventsProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "clientId_",
            "value_",
            "delayInMs_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001\u0003\u1004\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.SendKeystrokeEventsProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto DEFAULT_INSTANCE;
  static {
    SendKeystrokeEventsProto defaultInstance = new SendKeystrokeEventsProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SendKeystrokeEventsProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SendKeystrokeEventsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SendKeystrokeEventsProto> PARSER;

  public static com.google.protobuf.Parser<SendKeystrokeEventsProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
