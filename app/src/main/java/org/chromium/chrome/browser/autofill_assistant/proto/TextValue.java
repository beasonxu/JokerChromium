// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/action_value.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.TextValue}
 */
public  final class TextValue extends
    com.google.protobuf.GeneratedMessageLite<
        TextValue, TextValue.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.TextValue)
    TextValueOrBuilder {
  private TextValue() {
  }
  private int bitField0_;
  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase {
    TEXT(1),
    AUTOFILL_VALUE(2),
    PASSWORD_MANAGER_VALUE(3),
    CLIENT_MEMORY_KEY(4),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1: return TEXT;
        case 2: return AUTOFILL_VALUE;
        case 3: return PASSWORD_MANAGER_VALUE;
        case 4: return CLIENT_MEMORY_KEY;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  private void clearValue() {
    valueCase_ = 0;
    value_ = null;
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  /**
   * <code>string text = 1;</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return valueCase_ == 1;
  }
  /**
   * <code>string text = 1;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.String ref = "";
    if (valueCase_ == 1) {
      ref = (java.lang.String) value_;
    }
    return ref;
  }
  /**
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.String ref = "";
    if (valueCase_ == 1) {
      ref = (java.lang.String) value_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <code>string text = 1;</code>
   * @param value The text to set.
   */
  private void setText(
      java.lang.String value) {
    value.getClass();
  valueCase_ = 1;
    value_ = value;
  }
  /**
   * <code>string text = 1;</code>
   */
  private void clearText() {
    if (valueCase_ == 1) {
      valueCase_ = 0;
      value_ = null;
    }
  }
  /**
   * <code>string text = 1;</code>
   * @param value The bytes for text to set.
   */
  private void setTextBytes(
      com.google.protobuf.ByteString value) {
    value_ = value.toStringUtf8();
    valueCase_ = 1;
  }

  public static final int AUTOFILL_VALUE_FIELD_NUMBER = 2;
  /**
   * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
   */
  @java.lang.Override
  public boolean hasAutofillValue() {
    return valueCase_ == 2;
  }
  /**
   * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue getAutofillValue() {
    if (valueCase_ == 2) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue) value_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue.getDefaultInstance();
  }
  /**
   * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
   */
  private void setAutofillValue(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue value) {
    value.getClass();
  value_ = value;
    valueCase_ = 2;
  }
  /**
   * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
   */
  private void mergeAutofillValue(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue value) {
    value.getClass();
  if (valueCase_ == 2 &&
        value_ != org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue.getDefaultInstance()) {
      value_ = org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue) value_)
          .mergeFrom(value).buildPartial();
    } else {
      value_ = value;
    }
    valueCase_ = 2;
  }
  /**
   * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
   */
  private void clearAutofillValue() {
    if (valueCase_ == 2) {
      valueCase_ = 0;
      value_ = null;
    }
  }

  public static final int PASSWORD_MANAGER_VALUE_FIELD_NUMBER = 3;
  /**
   * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
   */
  @java.lang.Override
  public boolean hasPasswordManagerValue() {
    return valueCase_ == 3;
  }
  /**
   * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue getPasswordManagerValue() {
    if (valueCase_ == 3) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue) value_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.getDefaultInstance();
  }
  /**
   * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
   */
  private void setPasswordManagerValue(org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue value) {
    value.getClass();
  value_ = value;
    valueCase_ = 3;
  }
  /**
   * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
   */
  private void mergePasswordManagerValue(org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue value) {
    value.getClass();
  if (valueCase_ == 3 &&
        value_ != org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.getDefaultInstance()) {
      value_ = org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue) value_)
          .mergeFrom(value).buildPartial();
    } else {
      value_ = value;
    }
    valueCase_ = 3;
  }
  /**
   * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
   */
  private void clearPasswordManagerValue() {
    if (valueCase_ == 3) {
      valueCase_ = 0;
      value_ = null;
    }
  }

  public static final int CLIENT_MEMORY_KEY_FIELD_NUMBER = 4;
  /**
   * <code>string client_memory_key = 4;</code>
   * @return Whether the clientMemoryKey field is set.
   */
  @java.lang.Override
  public boolean hasClientMemoryKey() {
    return valueCase_ == 4;
  }
  /**
   * <code>string client_memory_key = 4;</code>
   * @return The clientMemoryKey.
   */
  @java.lang.Override
  public java.lang.String getClientMemoryKey() {
    java.lang.String ref = "";
    if (valueCase_ == 4) {
      ref = (java.lang.String) value_;
    }
    return ref;
  }
  /**
   * <code>string client_memory_key = 4;</code>
   * @return The bytes for clientMemoryKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientMemoryKeyBytes() {
    java.lang.String ref = "";
    if (valueCase_ == 4) {
      ref = (java.lang.String) value_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <code>string client_memory_key = 4;</code>
   * @param value The clientMemoryKey to set.
   */
  private void setClientMemoryKey(
      java.lang.String value) {
    value.getClass();
  valueCase_ = 4;
    value_ = value;
  }
  /**
   * <code>string client_memory_key = 4;</code>
   */
  private void clearClientMemoryKey() {
    if (valueCase_ == 4) {
      valueCase_ = 0;
      value_ = null;
    }
  }
  /**
   * <code>string client_memory_key = 4;</code>
   * @param value The bytes for clientMemoryKey to set.
   */
  private void setClientMemoryKeyBytes(
      com.google.protobuf.ByteString value) {
    value_ = value.toStringUtf8();
    valueCase_ = 4;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.TextValue prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.TextValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.TextValue, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.TextValue)
      org.chromium.chrome.browser.autofill_assistant.proto.TextValueOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.TextValue.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public ValueCase
        getValueCase() {
      return instance.getValueCase();
    }

    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }


    /**
     * <code>string text = 1;</code>
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return instance.hasText();
    }
    /**
     * <code>string text = 1;</code>
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      return instance.getText();
    }
    /**
     * <code>string text = 1;</code>
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextBytes() {
      return instance.getTextBytes();
    }
    /**
     * <code>string text = 1;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      copyOnWrite();
      instance.setText(value);
      return this;
    }
    /**
     * <code>string text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      copyOnWrite();
      instance.clearText();
      return this;
    }
    /**
     * <code>string text = 1;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTextBytes(value);
      return this;
    }

    /**
     * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
     */
    @java.lang.Override
    public boolean hasAutofillValue() {
      return instance.hasAutofillValue();
    }
    /**
     * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue getAutofillValue() {
      return instance.getAutofillValue();
    }
    /**
     * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
     */
    public Builder setAutofillValue(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue value) {
      copyOnWrite();
      instance.setAutofillValue(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
     */
    public Builder setAutofillValue(
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue.Builder builderForValue) {
      copyOnWrite();
      instance.setAutofillValue(builderForValue.build());
      return this;
    }
    /**
     * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
     */
    public Builder mergeAutofillValue(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue value) {
      copyOnWrite();
      instance.mergeAutofillValue(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
     */
    public Builder clearAutofillValue() {
      copyOnWrite();
      instance.clearAutofillValue();
      return this;
    }

    /**
     * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
     */
    @java.lang.Override
    public boolean hasPasswordManagerValue() {
      return instance.hasPasswordManagerValue();
    }
    /**
     * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue getPasswordManagerValue() {
      return instance.getPasswordManagerValue();
    }
    /**
     * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
     */
    public Builder setPasswordManagerValue(org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue value) {
      copyOnWrite();
      instance.setPasswordManagerValue(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
     */
    public Builder setPasswordManagerValue(
        org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.Builder builderForValue) {
      copyOnWrite();
      instance.setPasswordManagerValue(builderForValue.build());
      return this;
    }
    /**
     * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
     */
    public Builder mergePasswordManagerValue(org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue value) {
      copyOnWrite();
      instance.mergePasswordManagerValue(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.PasswordManagerValue password_manager_value = 3;</code>
     */
    public Builder clearPasswordManagerValue() {
      copyOnWrite();
      instance.clearPasswordManagerValue();
      return this;
    }

    /**
     * <code>string client_memory_key = 4;</code>
     * @return Whether the clientMemoryKey field is set.
     */
    @java.lang.Override
    public boolean hasClientMemoryKey() {
      return instance.hasClientMemoryKey();
    }
    /**
     * <code>string client_memory_key = 4;</code>
     * @return The clientMemoryKey.
     */
    @java.lang.Override
    public java.lang.String getClientMemoryKey() {
      return instance.getClientMemoryKey();
    }
    /**
     * <code>string client_memory_key = 4;</code>
     * @return The bytes for clientMemoryKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getClientMemoryKeyBytes() {
      return instance.getClientMemoryKeyBytes();
    }
    /**
     * <code>string client_memory_key = 4;</code>
     * @param value The clientMemoryKey to set.
     * @return This builder for chaining.
     */
    public Builder setClientMemoryKey(
        java.lang.String value) {
      copyOnWrite();
      instance.setClientMemoryKey(value);
      return this;
    }
    /**
     * <code>string client_memory_key = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientMemoryKey() {
      copyOnWrite();
      instance.clearClientMemoryKey();
      return this;
    }
    /**
     * <code>string client_memory_key = 4;</code>
     * @param value The bytes for clientMemoryKey to set.
     * @return This builder for chaining.
     */
    public Builder setClientMemoryKeyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setClientMemoryKeyBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.TextValue)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.TextValue();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "value_",
            "valueCase_",
            "bitField0_",
            org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue.class,
            org.chromium.chrome.browser.autofill_assistant.proto.PasswordManagerValue.class,
          };
          java.lang.String info =
              "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103b\u0000\u0002" +
              "\u103c\u0000\u0003\u103c\u0000\u0004\u103b\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.TextValue> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.TextValue.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.TextValue>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.TextValue)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.TextValue DEFAULT_INSTANCE;
  static {
    TextValue defaultInstance = new TextValue();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TextValue.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.TextValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TextValue> PARSER;

  public static com.google.protobuf.Parser<TextValue> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

