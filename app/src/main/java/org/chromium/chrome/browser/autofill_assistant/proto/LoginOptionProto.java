// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.LoginOptionProto}
 */
public  final class LoginOptionProto extends
    com.google.protobuf.GeneratedMessageLite<
        LoginOptionProto, LoginOptionProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.LoginOptionProto)
    LoginOptionProtoOrBuilder {
  private LoginOptionProto() {
    label_ = "";
    sublabel_ = "";
  }
  private int bitField0_;
  private int payloadOrTagCase_ = 0;
  private java.lang.Object payloadOrTag_;
  public enum PayloadOrTagCase {
    PAYLOAD(3),
    TAG(4),
    PAYLOADORTAG_NOT_SET(0);
    private final int value;
    private PayloadOrTagCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PayloadOrTagCase valueOf(int value) {
      return forNumber(value);
    }

    public static PayloadOrTagCase forNumber(int value) {
      switch (value) {
        case 3: return PAYLOAD;
        case 4: return TAG;
        case 0: return PAYLOADORTAG_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public PayloadOrTagCase
  getPayloadOrTagCase() {
    return PayloadOrTagCase.forNumber(
        payloadOrTagCase_);
  }

  private void clearPayloadOrTag() {
    payloadOrTagCase_ = 0;
    payloadOrTag_ = null;
  }

  public static final int LABEL_FIELD_NUMBER = 1;
  private java.lang.String label_;
  /**
   * <code>optional string label = 1;</code>
   * @return Whether the label field is set.
   */
  @java.lang.Override
  public boolean hasLabel() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string label = 1;</code>
   * @return The label.
   */
  @java.lang.Override
  public java.lang.String getLabel() {
    return label_;
  }
  /**
   * <code>optional string label = 1;</code>
   * @return The bytes for label.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLabelBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(label_);
  }
  /**
   * <code>optional string label = 1;</code>
   * @param value The label to set.
   */
  private void setLabel(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    label_ = value;
  }
  /**
   * <code>optional string label = 1;</code>
   */
  private void clearLabel() {
    bitField0_ = (bitField0_ & ~0x00000001);
    label_ = getDefaultInstance().getLabel();
  }
  /**
   * <code>optional string label = 1;</code>
   * @param value The bytes for label to set.
   */
  private void setLabelBytes(
      com.google.protobuf.ByteString value) {
    label_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int SUBLABEL_FIELD_NUMBER = 2;
  private java.lang.String sublabel_;
  /**
   * <code>optional string sublabel = 2;</code>
   * @return Whether the sublabel field is set.
   */
  @java.lang.Override
  public boolean hasSublabel() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string sublabel = 2;</code>
   * @return The sublabel.
   */
  @java.lang.Override
  public java.lang.String getSublabel() {
    return sublabel_;
  }
  /**
   * <code>optional string sublabel = 2;</code>
   * @return The bytes for sublabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSublabelBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(sublabel_);
  }
  /**
   * <code>optional string sublabel = 2;</code>
   * @param value The sublabel to set.
   */
  private void setSublabel(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000002;
    sublabel_ = value;
  }
  /**
   * <code>optional string sublabel = 2;</code>
   */
  private void clearSublabel() {
    bitField0_ = (bitField0_ & ~0x00000002);
    sublabel_ = getDefaultInstance().getSublabel();
  }
  /**
   * <code>optional string sublabel = 2;</code>
   * @param value The bytes for sublabel to set.
   */
  private void setSublabelBytes(
      com.google.protobuf.ByteString value) {
    sublabel_ = value.toStringUtf8();
    bitField0_ |= 0x00000002;
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  /**
   * <pre>
   * A payload to be echoed back to the caller when the option is selected.
   * Prefer using tag.
   * </pre>
   *
   * <code>bytes payload = 3;</code>
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return payloadOrTagCase_ == 3;
  }
  /**
   * <pre>
   * A payload to be echoed back to the caller when the option is selected.
   * Prefer using tag.
   * </pre>
   *
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    if (payloadOrTagCase_ == 3) {
      return (com.google.protobuf.ByteString) payloadOrTag_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }
  /**
   * <pre>
   * A payload to be echoed back to the caller when the option is selected.
   * Prefer using tag.
   * </pre>
   *
   * <code>bytes payload = 3;</code>
   * @param value The payload to set.
   */
  private void setPayload(com.google.protobuf.ByteString value) {
    value.getClass();
  payloadOrTagCase_ = 3;
    payloadOrTag_ = value;
  }
  /**
   * <pre>
   * A payload to be echoed back to the caller when the option is selected.
   * Prefer using tag.
   * </pre>
   *
   * <code>bytes payload = 3;</code>
   */
  private void clearPayload() {
    if (payloadOrTagCase_ == 3) {
      payloadOrTagCase_ = 0;
      payloadOrTag_ = null;
    }
  }

  public static final int TAG_FIELD_NUMBER = 4;
  /**
   * <pre>
   * A tag to be echoed back to the caller when the option is selected.
   * </pre>
   *
   * <code>string tag = 4;</code>
   * @return Whether the tag field is set.
   */
  @java.lang.Override
  public boolean hasTag() {
    return payloadOrTagCase_ == 4;
  }
  /**
   * <pre>
   * A tag to be echoed back to the caller when the option is selected.
   * </pre>
   *
   * <code>string tag = 4;</code>
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.String ref = "";
    if (payloadOrTagCase_ == 4) {
      ref = (java.lang.String) payloadOrTag_;
    }
    return ref;
  }
  /**
   * <pre>
   * A tag to be echoed back to the caller when the option is selected.
   * </pre>
   *
   * <code>string tag = 4;</code>
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTagBytes() {
    java.lang.String ref = "";
    if (payloadOrTagCase_ == 4) {
      ref = (java.lang.String) payloadOrTag_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * A tag to be echoed back to the caller when the option is selected.
   * </pre>
   *
   * <code>string tag = 4;</code>
   * @param value The tag to set.
   */
  private void setTag(
      java.lang.String value) {
    value.getClass();
  payloadOrTagCase_ = 4;
    payloadOrTag_ = value;
  }
  /**
   * <pre>
   * A tag to be echoed back to the caller when the option is selected.
   * </pre>
   *
   * <code>string tag = 4;</code>
   */
  private void clearTag() {
    if (payloadOrTagCase_ == 4) {
      payloadOrTagCase_ = 0;
      payloadOrTag_ = null;
    }
  }
  /**
   * <pre>
   * A tag to be echoed back to the caller when the option is selected.
   * </pre>
   *
   * <code>string tag = 4;</code>
   * @param value The bytes for tag to set.
   */
  private void setTagBytes(
      com.google.protobuf.ByteString value) {
    payloadOrTag_ = value.toStringUtf8();
    payloadOrTagCase_ = 4;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.LoginOptionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.LoginOptionProto)
      org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public PayloadOrTagCase
        getPayloadOrTagCase() {
      return instance.getPayloadOrTagCase();
    }

    public Builder clearPayloadOrTag() {
      copyOnWrite();
      instance.clearPayloadOrTag();
      return this;
    }


    /**
     * <code>optional string label = 1;</code>
     * @return Whether the label field is set.
     */
    @java.lang.Override
    public boolean hasLabel() {
      return instance.hasLabel();
    }
    /**
     * <code>optional string label = 1;</code>
     * @return The label.
     */
    @java.lang.Override
    public java.lang.String getLabel() {
      return instance.getLabel();
    }
    /**
     * <code>optional string label = 1;</code>
     * @return The bytes for label.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLabelBytes() {
      return instance.getLabelBytes();
    }
    /**
     * <code>optional string label = 1;</code>
     * @param value The label to set.
     * @return This builder for chaining.
     */
    public Builder setLabel(
        java.lang.String value) {
      copyOnWrite();
      instance.setLabel(value);
      return this;
    }
    /**
     * <code>optional string label = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLabel() {
      copyOnWrite();
      instance.clearLabel();
      return this;
    }
    /**
     * <code>optional string label = 1;</code>
     * @param value The bytes for label to set.
     * @return This builder for chaining.
     */
    public Builder setLabelBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLabelBytes(value);
      return this;
    }

    /**
     * <code>optional string sublabel = 2;</code>
     * @return Whether the sublabel field is set.
     */
    @java.lang.Override
    public boolean hasSublabel() {
      return instance.hasSublabel();
    }
    /**
     * <code>optional string sublabel = 2;</code>
     * @return The sublabel.
     */
    @java.lang.Override
    public java.lang.String getSublabel() {
      return instance.getSublabel();
    }
    /**
     * <code>optional string sublabel = 2;</code>
     * @return The bytes for sublabel.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSublabelBytes() {
      return instance.getSublabelBytes();
    }
    /**
     * <code>optional string sublabel = 2;</code>
     * @param value The sublabel to set.
     * @return This builder for chaining.
     */
    public Builder setSublabel(
        java.lang.String value) {
      copyOnWrite();
      instance.setSublabel(value);
      return this;
    }
    /**
     * <code>optional string sublabel = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSublabel() {
      copyOnWrite();
      instance.clearSublabel();
      return this;
    }
    /**
     * <code>optional string sublabel = 2;</code>
     * @param value The bytes for sublabel to set.
     * @return This builder for chaining.
     */
    public Builder setSublabelBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSublabelBytes(value);
      return this;
    }

    /**
     * <pre>
     * A payload to be echoed back to the caller when the option is selected.
     * Prefer using tag.
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     * @return Whether the payload field is set.
     */
    @java.lang.Override
    public boolean hasPayload() {
      return instance.hasPayload();
    }
    /**
     * <pre>
     * A payload to be echoed back to the caller when the option is selected.
     * Prefer using tag.
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return instance.getPayload();
    }
    /**
     * <pre>
     * A payload to be echoed back to the caller when the option is selected.
     * Prefer using tag.
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPayload(value);
      return this;
    }
    /**
     * <pre>
     * A payload to be echoed back to the caller when the option is selected.
     * Prefer using tag.
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      copyOnWrite();
      instance.clearPayload();
      return this;
    }

    /**
     * <pre>
     * A tag to be echoed back to the caller when the option is selected.
     * </pre>
     *
     * <code>string tag = 4;</code>
     * @return Whether the tag field is set.
     */
    @java.lang.Override
    public boolean hasTag() {
      return instance.hasTag();
    }
    /**
     * <pre>
     * A tag to be echoed back to the caller when the option is selected.
     * </pre>
     *
     * <code>string tag = 4;</code>
     * @return The tag.
     */
    @java.lang.Override
    public java.lang.String getTag() {
      return instance.getTag();
    }
    /**
     * <pre>
     * A tag to be echoed back to the caller when the option is selected.
     * </pre>
     *
     * <code>string tag = 4;</code>
     * @return The bytes for tag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTagBytes() {
      return instance.getTagBytes();
    }
    /**
     * <pre>
     * A tag to be echoed back to the caller when the option is selected.
     * </pre>
     *
     * <code>string tag = 4;</code>
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(
        java.lang.String value) {
      copyOnWrite();
      instance.setTag(value);
      return this;
    }
    /**
     * <pre>
     * A tag to be echoed back to the caller when the option is selected.
     * </pre>
     *
     * <code>string tag = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      copyOnWrite();
      instance.clearTag();
      return this;
    }
    /**
     * <pre>
     * A tag to be echoed back to the caller when the option is selected.
     * </pre>
     *
     * <code>string tag = 4;</code>
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTagBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.LoginOptionProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "payloadOrTag_",
            "payloadOrTagCase_",
            "bitField0_",
            "label_",
            "sublabel_",
          };
          java.lang.String info =
              "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002" +
              "\u1008\u0001\u0003\u103d\u0000\u0004\u103b\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.LoginOptionProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto DEFAULT_INSTANCE;
  static {
    LoginOptionProto defaultInstance = new LoginOptionProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      LoginOptionProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.LoginOptionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LoginOptionProto> PARSER;

  public static com.google.protobuf.Parser<LoginOptionProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

