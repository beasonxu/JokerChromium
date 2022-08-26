// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Shows an info box with informational content. The info box content is cleared
 * when |info_box| is not set.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ShowInfoBoxProto}
 */
public  final class ShowInfoBoxProto extends
    com.google.protobuf.GeneratedMessageLite<
        ShowInfoBoxProto, ShowInfoBoxProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ShowInfoBoxProto)
    ShowInfoBoxProtoOrBuilder {
  private ShowInfoBoxProto() {
  }
  private int bitField0_;
  public static final int INFO_BOX_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto infoBox_;
  /**
   * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
   */
  @java.lang.Override
  public boolean hasInfoBox() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto getInfoBox() {
    return infoBox_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto.getDefaultInstance() : infoBox_;
  }
  /**
   * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
   */
  private void setInfoBox(org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto value) {
    value.getClass();
  infoBox_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeInfoBox(org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto value) {
    value.getClass();
  if (infoBox_ != null &&
        infoBox_ != org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto.getDefaultInstance()) {
      infoBox_ =
        org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto.newBuilder(infoBox_).mergeFrom(value).buildPartial();
    } else {
      infoBox_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
   */
  private void clearInfoBox() {  infoBox_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Shows an info box with informational content. The info box content is cleared
   * when |info_box| is not set.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ShowInfoBoxProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ShowInfoBoxProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
     */
    @java.lang.Override
    public boolean hasInfoBox() {
      return instance.hasInfoBox();
    }
    /**
     * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto getInfoBox() {
      return instance.getInfoBox();
    }
    /**
     * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
     */
    public Builder setInfoBox(org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto value) {
      copyOnWrite();
      instance.setInfoBox(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
     */
    public Builder setInfoBox(
        org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto.Builder builderForValue) {
      copyOnWrite();
      instance.setInfoBox(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
     */
    public Builder mergeInfoBox(org.chromium.chrome.browser.autofill_assistant.proto.InfoBoxProto value) {
      copyOnWrite();
      instance.mergeInfoBox(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.InfoBoxProto info_box = 1;</code>
     */
    public Builder clearInfoBox() {  copyOnWrite();
      instance.clearInfoBox();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ShowInfoBoxProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "infoBox_",
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
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ShowInfoBoxProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto DEFAULT_INSTANCE;
  static {
    ShowInfoBoxProto defaultInstance = new ShowInfoBoxProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ShowInfoBoxProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowInfoBoxProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ShowInfoBoxProto> PARSER;

  public static com.google.protobuf.Parser<ShowInfoBoxProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
