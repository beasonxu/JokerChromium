// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.AutofillProfileProto}
 */
public  final class AutofillProfileProto extends
    com.google.protobuf.GeneratedMessageLite<
        AutofillProfileProto, AutofillProfileProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.AutofillProfileProto)
    AutofillProfileProtoOrBuilder {
  private AutofillProfileProto() {
  }
  private int bitField0_;
  private int identifierCase_ = 0;
  private java.lang.Object identifier_;
  public enum IdentifierCase {
    GUID(1),
    SELECTED_PROFILE_NAME(2),
    IDENTIFIER_NOT_SET(0);
    private final int value;
    private IdentifierCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IdentifierCase valueOf(int value) {
      return forNumber(value);
    }

    public static IdentifierCase forNumber(int value) {
      switch (value) {
        case 1: return GUID;
        case 2: return SELECTED_PROFILE_NAME;
        case 0: return IDENTIFIER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public IdentifierCase
  getIdentifierCase() {
    return IdentifierCase.forNumber(
        identifierCase_);
  }

  private void clearIdentifier() {
    identifierCase_ = 0;
    identifier_ = null;
  }

  public static final int GUID_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The GUID of the profile.
   * </pre>
   *
   * <code>string guid = 1;</code>
   * @return Whether the guid field is set.
   */
  @java.lang.Override
  public boolean hasGuid() {
    return identifierCase_ == 1;
  }
  /**
   * <pre>
   * The GUID of the profile.
   * </pre>
   *
   * <code>string guid = 1;</code>
   * @return The guid.
   */
  @java.lang.Override
  public java.lang.String getGuid() {
    java.lang.String ref = "";
    if (identifierCase_ == 1) {
      ref = (java.lang.String) identifier_;
    }
    return ref;
  }
  /**
   * <pre>
   * The GUID of the profile.
   * </pre>
   *
   * <code>string guid = 1;</code>
   * @return The bytes for guid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGuidBytes() {
    java.lang.String ref = "";
    if (identifierCase_ == 1) {
      ref = (java.lang.String) identifier_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * The GUID of the profile.
   * </pre>
   *
   * <code>string guid = 1;</code>
   * @param value The guid to set.
   */
  private void setGuid(
      java.lang.String value) {
    value.getClass();
  identifierCase_ = 1;
    identifier_ = value;
  }
  /**
   * <pre>
   * The GUID of the profile.
   * </pre>
   *
   * <code>string guid = 1;</code>
   */
  private void clearGuid() {
    if (identifierCase_ == 1) {
      identifierCase_ = 0;
      identifier_ = null;
    }
  }
  /**
   * <pre>
   * The GUID of the profile.
   * </pre>
   *
   * <code>string guid = 1;</code>
   * @param value The bytes for guid to set.
   */
  private void setGuidBytes(
      com.google.protobuf.ByteString value) {
    identifier_ = value.toStringUtf8();
    identifierCase_ = 1;
  }

  public static final int SELECTED_PROFILE_NAME_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The selected profile for the given profile name. Only works if a profile
   * was selected in a previous |CollectUserData| action.
   * </pre>
   *
   * <code>string selected_profile_name = 2;</code>
   * @return Whether the selectedProfileName field is set.
   */
  @java.lang.Override
  public boolean hasSelectedProfileName() {
    return identifierCase_ == 2;
  }
  /**
   * <pre>
   * The selected profile for the given profile name. Only works if a profile
   * was selected in a previous |CollectUserData| action.
   * </pre>
   *
   * <code>string selected_profile_name = 2;</code>
   * @return The selectedProfileName.
   */
  @java.lang.Override
  public java.lang.String getSelectedProfileName() {
    java.lang.String ref = "";
    if (identifierCase_ == 2) {
      ref = (java.lang.String) identifier_;
    }
    return ref;
  }
  /**
   * <pre>
   * The selected profile for the given profile name. Only works if a profile
   * was selected in a previous |CollectUserData| action.
   * </pre>
   *
   * <code>string selected_profile_name = 2;</code>
   * @return The bytes for selectedProfileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSelectedProfileNameBytes() {
    java.lang.String ref = "";
    if (identifierCase_ == 2) {
      ref = (java.lang.String) identifier_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * The selected profile for the given profile name. Only works if a profile
   * was selected in a previous |CollectUserData| action.
   * </pre>
   *
   * <code>string selected_profile_name = 2;</code>
   * @param value The selectedProfileName to set.
   */
  private void setSelectedProfileName(
      java.lang.String value) {
    value.getClass();
  identifierCase_ = 2;
    identifier_ = value;
  }
  /**
   * <pre>
   * The selected profile for the given profile name. Only works if a profile
   * was selected in a previous |CollectUserData| action.
   * </pre>
   *
   * <code>string selected_profile_name = 2;</code>
   */
  private void clearSelectedProfileName() {
    if (identifierCase_ == 2) {
      identifierCase_ = 0;
      identifier_ = null;
    }
  }
  /**
   * <pre>
   * The selected profile for the given profile name. Only works if a profile
   * was selected in a previous |CollectUserData| action.
   * </pre>
   *
   * <code>string selected_profile_name = 2;</code>
   * @param value The bytes for selectedProfileName to set.
   */
  private void setSelectedProfileNameBytes(
      com.google.protobuf.ByteString value) {
    identifier_ = value.toStringUtf8();
    identifierCase_ = 2;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.AutofillProfileProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.AutofillProfileProto)
      org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public IdentifierCase
        getIdentifierCase() {
      return instance.getIdentifierCase();
    }

    public Builder clearIdentifier() {
      copyOnWrite();
      instance.clearIdentifier();
      return this;
    }


    /**
     * <pre>
     * The GUID of the profile.
     * </pre>
     *
     * <code>string guid = 1;</code>
     * @return Whether the guid field is set.
     */
    @java.lang.Override
    public boolean hasGuid() {
      return instance.hasGuid();
    }
    /**
     * <pre>
     * The GUID of the profile.
     * </pre>
     *
     * <code>string guid = 1;</code>
     * @return The guid.
     */
    @java.lang.Override
    public java.lang.String getGuid() {
      return instance.getGuid();
    }
    /**
     * <pre>
     * The GUID of the profile.
     * </pre>
     *
     * <code>string guid = 1;</code>
     * @return The bytes for guid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGuidBytes() {
      return instance.getGuidBytes();
    }
    /**
     * <pre>
     * The GUID of the profile.
     * </pre>
     *
     * <code>string guid = 1;</code>
     * @param value The guid to set.
     * @return This builder for chaining.
     */
    public Builder setGuid(
        java.lang.String value) {
      copyOnWrite();
      instance.setGuid(value);
      return this;
    }
    /**
     * <pre>
     * The GUID of the profile.
     * </pre>
     *
     * <code>string guid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuid() {
      copyOnWrite();
      instance.clearGuid();
      return this;
    }
    /**
     * <pre>
     * The GUID of the profile.
     * </pre>
     *
     * <code>string guid = 1;</code>
     * @param value The bytes for guid to set.
     * @return This builder for chaining.
     */
    public Builder setGuidBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setGuidBytes(value);
      return this;
    }

    /**
     * <pre>
     * The selected profile for the given profile name. Only works if a profile
     * was selected in a previous |CollectUserData| action.
     * </pre>
     *
     * <code>string selected_profile_name = 2;</code>
     * @return Whether the selectedProfileName field is set.
     */
    @java.lang.Override
    public boolean hasSelectedProfileName() {
      return instance.hasSelectedProfileName();
    }
    /**
     * <pre>
     * The selected profile for the given profile name. Only works if a profile
     * was selected in a previous |CollectUserData| action.
     * </pre>
     *
     * <code>string selected_profile_name = 2;</code>
     * @return The selectedProfileName.
     */
    @java.lang.Override
    public java.lang.String getSelectedProfileName() {
      return instance.getSelectedProfileName();
    }
    /**
     * <pre>
     * The selected profile for the given profile name. Only works if a profile
     * was selected in a previous |CollectUserData| action.
     * </pre>
     *
     * <code>string selected_profile_name = 2;</code>
     * @return The bytes for selectedProfileName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSelectedProfileNameBytes() {
      return instance.getSelectedProfileNameBytes();
    }
    /**
     * <pre>
     * The selected profile for the given profile name. Only works if a profile
     * was selected in a previous |CollectUserData| action.
     * </pre>
     *
     * <code>string selected_profile_name = 2;</code>
     * @param value The selectedProfileName to set.
     * @return This builder for chaining.
     */
    public Builder setSelectedProfileName(
        java.lang.String value) {
      copyOnWrite();
      instance.setSelectedProfileName(value);
      return this;
    }
    /**
     * <pre>
     * The selected profile for the given profile name. Only works if a profile
     * was selected in a previous |CollectUserData| action.
     * </pre>
     *
     * <code>string selected_profile_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSelectedProfileName() {
      copyOnWrite();
      instance.clearSelectedProfileName();
      return this;
    }
    /**
     * <pre>
     * The selected profile for the given profile name. Only works if a profile
     * was selected in a previous |CollectUserData| action.
     * </pre>
     *
     * <code>string selected_profile_name = 2;</code>
     * @param value The bytes for selectedProfileName to set.
     * @return This builder for chaining.
     */
    public Builder setSelectedProfileNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSelectedProfileNameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.AutofillProfileProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "identifier_",
            "identifierCase_",
            "bitField0_",
          };
          java.lang.String info =
              "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002" +
              "\u103b\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.AutofillProfileProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto DEFAULT_INSTANCE;
  static {
    AutofillProfileProto defaultInstance = new AutofillProfileProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AutofillProfileProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillProfileProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AutofillProfileProto> PARSER;

  public static com.google.protobuf.Parser<AutofillProfileProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

