// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Shows a popup with generic UI.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ShowGenericUiPopupProto}
 */
public  final class ShowGenericUiPopupProto extends
    com.google.protobuf.GeneratedMessageLite<
        ShowGenericUiPopupProto, ShowGenericUiPopupProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ShowGenericUiPopupProto)
    ShowGenericUiPopupProtoOrBuilder {
  private ShowGenericUiPopupProto() {
    popupIdentifier_ = "";
  }
  private int bitField0_;
  public static final int GENERIC_UI_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto genericUi_;
  /**
   * <pre>
   * The user interface to show. Note that nested user models are merged into
   * the global one, so take care to avoid accidental identifier overlap.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
   */
  @java.lang.Override
  public boolean hasGenericUi() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The user interface to show. Note that nested user models are merged into
   * the global one, so take care to avoid accidental identifier overlap.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getGenericUi() {
    return genericUi_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.getDefaultInstance() : genericUi_;
  }
  /**
   * <pre>
   * The user interface to show. Note that nested user models are merged into
   * the global one, so take care to avoid accidental identifier overlap.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
   */
  private void setGenericUi(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto value) {
    value.getClass();
  genericUi_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The user interface to show. Note that nested user models are merged into
   * the global one, so take care to avoid accidental identifier overlap.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeGenericUi(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto value) {
    value.getClass();
  if (genericUi_ != null &&
        genericUi_ != org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.getDefaultInstance()) {
      genericUi_ =
        org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.newBuilder(genericUi_).mergeFrom(value).buildPartial();
    } else {
      genericUi_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The user interface to show. Note that nested user models are merged into
   * the global one, so take care to avoid accidental identifier overlap.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
   */
  private void clearGenericUi() {  genericUi_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int POPUP_IDENTIFIER_FIELD_NUMBER = 2;
  private java.lang.String popupIdentifier_;
  /**
   * <pre>
   * Mandatory identifier for this popup, used in the corresponding trigger
   * events.
   * </pre>
   *
   * <code>optional string popup_identifier = 2;</code>
   * @return Whether the popupIdentifier field is set.
   */
  @java.lang.Override
  public boolean hasPopupIdentifier() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Mandatory identifier for this popup, used in the corresponding trigger
   * events.
   * </pre>
   *
   * <code>optional string popup_identifier = 2;</code>
   * @return The popupIdentifier.
   */
  @java.lang.Override
  public java.lang.String getPopupIdentifier() {
    return popupIdentifier_;
  }
  /**
   * <pre>
   * Mandatory identifier for this popup, used in the corresponding trigger
   * events.
   * </pre>
   *
   * <code>optional string popup_identifier = 2;</code>
   * @return The bytes for popupIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPopupIdentifierBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(popupIdentifier_);
  }
  /**
   * <pre>
   * Mandatory identifier for this popup, used in the corresponding trigger
   * events.
   * </pre>
   *
   * <code>optional string popup_identifier = 2;</code>
   * @param value The popupIdentifier to set.
   */
  private void setPopupIdentifier(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000002;
    popupIdentifier_ = value;
  }
  /**
   * <pre>
   * Mandatory identifier for this popup, used in the corresponding trigger
   * events.
   * </pre>
   *
   * <code>optional string popup_identifier = 2;</code>
   */
  private void clearPopupIdentifier() {
    bitField0_ = (bitField0_ & ~0x00000002);
    popupIdentifier_ = getDefaultInstance().getPopupIdentifier();
  }
  /**
   * <pre>
   * Mandatory identifier for this popup, used in the corresponding trigger
   * events.
   * </pre>
   *
   * <code>optional string popup_identifier = 2;</code>
   * @param value The bytes for popupIdentifier to set.
   */
  private void setPopupIdentifierBytes(
      com.google.protobuf.ByteString value) {
    popupIdentifier_ = value.toStringUtf8();
    bitField0_ |= 0x00000002;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Shows a popup with generic UI.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ShowGenericUiPopupProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ShowGenericUiPopupProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The user interface to show. Note that nested user models are merged into
     * the global one, so take care to avoid accidental identifier overlap.
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
     */
    @java.lang.Override
    public boolean hasGenericUi() {
      return instance.hasGenericUi();
    }
    /**
     * <pre>
     * The user interface to show. Note that nested user models are merged into
     * the global one, so take care to avoid accidental identifier overlap.
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getGenericUi() {
      return instance.getGenericUi();
    }
    /**
     * <pre>
     * The user interface to show. Note that nested user models are merged into
     * the global one, so take care to avoid accidental identifier overlap.
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
     */
    public Builder setGenericUi(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto value) {
      copyOnWrite();
      instance.setGenericUi(value);
      return this;
      }
    /**
     * <pre>
     * The user interface to show. Note that nested user models are merged into
     * the global one, so take care to avoid accidental identifier overlap.
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
     */
    public Builder setGenericUi(
        org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setGenericUi(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The user interface to show. Note that nested user models are merged into
     * the global one, so take care to avoid accidental identifier overlap.
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
     */
    public Builder mergeGenericUi(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto value) {
      copyOnWrite();
      instance.mergeGenericUi(value);
      return this;
    }
    /**
     * <pre>
     * The user interface to show. Note that nested user models are merged into
     * the global one, so take care to avoid accidental identifier overlap.
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
     */
    public Builder clearGenericUi() {  copyOnWrite();
      instance.clearGenericUi();
      return this;
    }

    /**
     * <pre>
     * Mandatory identifier for this popup, used in the corresponding trigger
     * events.
     * </pre>
     *
     * <code>optional string popup_identifier = 2;</code>
     * @return Whether the popupIdentifier field is set.
     */
    @java.lang.Override
    public boolean hasPopupIdentifier() {
      return instance.hasPopupIdentifier();
    }
    /**
     * <pre>
     * Mandatory identifier for this popup, used in the corresponding trigger
     * events.
     * </pre>
     *
     * <code>optional string popup_identifier = 2;</code>
     * @return The popupIdentifier.
     */
    @java.lang.Override
    public java.lang.String getPopupIdentifier() {
      return instance.getPopupIdentifier();
    }
    /**
     * <pre>
     * Mandatory identifier for this popup, used in the corresponding trigger
     * events.
     * </pre>
     *
     * <code>optional string popup_identifier = 2;</code>
     * @return The bytes for popupIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPopupIdentifierBytes() {
      return instance.getPopupIdentifierBytes();
    }
    /**
     * <pre>
     * Mandatory identifier for this popup, used in the corresponding trigger
     * events.
     * </pre>
     *
     * <code>optional string popup_identifier = 2;</code>
     * @param value The popupIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setPopupIdentifier(
        java.lang.String value) {
      copyOnWrite();
      instance.setPopupIdentifier(value);
      return this;
    }
    /**
     * <pre>
     * Mandatory identifier for this popup, used in the corresponding trigger
     * events.
     * </pre>
     *
     * <code>optional string popup_identifier = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPopupIdentifier() {
      copyOnWrite();
      instance.clearPopupIdentifier();
      return this;
    }
    /**
     * <pre>
     * Mandatory identifier for this popup, used in the corresponding trigger
     * events.
     * </pre>
     *
     * <code>optional string popup_identifier = 2;</code>
     * @param value The bytes for popupIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setPopupIdentifierBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPopupIdentifierBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ShowGenericUiPopupProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "genericUi_",
            "popupIdentifier_",
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
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ShowGenericUiPopupProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto DEFAULT_INSTANCE;
  static {
    ShowGenericUiPopupProto defaultInstance = new ShowGenericUiPopupProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ShowGenericUiPopupProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowGenericUiPopupProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ShowGenericUiPopupProto> PARSER;

  public static com.google.protobuf.Parser<ShowGenericUiPopupProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

