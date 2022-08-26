// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Displays a standard info popup.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ShowInfoPopupProto}
 */
public  final class ShowInfoPopupProto extends
    com.google.protobuf.GeneratedMessageLite<
        ShowInfoPopupProto, ShowInfoPopupProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ShowInfoPopupProto)
    ShowInfoPopupProtoOrBuilder {
  private ShowInfoPopupProto() {
  }
  private int bitField0_;
  public static final int INFO_POPUP_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto infoPopup_;
  /**
   * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
   */
  @java.lang.Override
  public boolean hasInfoPopup() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto getInfoPopup() {
    return infoPopup_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto.getDefaultInstance() : infoPopup_;
  }
  /**
   * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
   */
  private void setInfoPopup(org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto value) {
    value.getClass();
  infoPopup_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeInfoPopup(org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto value) {
    value.getClass();
  if (infoPopup_ != null &&
        infoPopup_ != org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto.getDefaultInstance()) {
      infoPopup_ =
        org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto.newBuilder(infoPopup_).mergeFrom(value).buildPartial();
    } else {
      infoPopup_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
   */
  private void clearInfoPopup() {  infoPopup_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Displays a standard info popup.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ShowInfoPopupProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ShowInfoPopupProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
     */
    @java.lang.Override
    public boolean hasInfoPopup() {
      return instance.hasInfoPopup();
    }
    /**
     * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto getInfoPopup() {
      return instance.getInfoPopup();
    }
    /**
     * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
     */
    public Builder setInfoPopup(org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto value) {
      copyOnWrite();
      instance.setInfoPopup(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
     */
    public Builder setInfoPopup(
        org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto.Builder builderForValue) {
      copyOnWrite();
      instance.setInfoPopup(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
     */
    public Builder mergeInfoPopup(org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto value) {
      copyOnWrite();
      instance.mergeInfoPopup(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.InfoPopupProto info_popup = 1;</code>
     */
    public Builder clearInfoPopup() {  copyOnWrite();
      instance.clearInfoPopup();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ShowInfoPopupProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "infoPopup_",
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ShowInfoPopupProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto DEFAULT_INSTANCE;
  static {
    ShowInfoPopupProto defaultInstance = new ShowInfoPopupProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ShowInfoPopupProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoPopupProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ShowInfoPopupProto> PARSER;

  public static com.google.protobuf.Parser<ShowInfoPopupProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
