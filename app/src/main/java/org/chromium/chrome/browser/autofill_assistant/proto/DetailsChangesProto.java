// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.DetailsChangesProto}
 */
public  final class DetailsChangesProto extends
    com.google.protobuf.GeneratedMessageLite<
        DetailsChangesProto, DetailsChangesProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.DetailsChangesProto)
    DetailsChangesProtoOrBuilder {
  private DetailsChangesProto() {
  }
  private int bitField0_;
  public static final int USER_APPROVAL_REQUIRED_FIELD_NUMBER = 1;
  private boolean userApprovalRequired_;
  /**
   * <pre>
   * Whether the changes require user approval. This de-emphasize
   * non-highlighted fields.
   * </pre>
   *
   * <code>optional bool user_approval_required = 1;</code>
   * @return Whether the userApprovalRequired field is set.
   */
  @java.lang.Override
  public boolean hasUserApprovalRequired() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Whether the changes require user approval. This de-emphasize
   * non-highlighted fields.
   * </pre>
   *
   * <code>optional bool user_approval_required = 1;</code>
   * @return The userApprovalRequired.
   */
  @java.lang.Override
  public boolean getUserApprovalRequired() {
    return userApprovalRequired_;
  }
  /**
   * <pre>
   * Whether the changes require user approval. This de-emphasize
   * non-highlighted fields.
   * </pre>
   *
   * <code>optional bool user_approval_required = 1;</code>
   * @param value The userApprovalRequired to set.
   */
  private void setUserApprovalRequired(boolean value) {
    bitField0_ |= 0x00000001;
    userApprovalRequired_ = value;
  }
  /**
   * <pre>
   * Whether the changes require user approval. This de-emphasize
   * non-highlighted fields.
   * </pre>
   *
   * <code>optional bool user_approval_required = 1;</code>
   */
  private void clearUserApprovalRequired() {
    bitField0_ = (bitField0_ & ~0x00000001);
    userApprovalRequired_ = false;
  }

  public static final int HIGHLIGHT_TITLE_FIELD_NUMBER = 2;
  private boolean highlightTitle_;
  /**
   * <pre>
   * Whether the title should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_title = 2;</code>
   * @return Whether the highlightTitle field is set.
   */
  @java.lang.Override
  public boolean hasHighlightTitle() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Whether the title should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_title = 2;</code>
   * @return The highlightTitle.
   */
  @java.lang.Override
  public boolean getHighlightTitle() {
    return highlightTitle_;
  }
  /**
   * <pre>
   * Whether the title should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_title = 2;</code>
   * @param value The highlightTitle to set.
   */
  private void setHighlightTitle(boolean value) {
    bitField0_ |= 0x00000002;
    highlightTitle_ = value;
  }
  /**
   * <pre>
   * Whether the title should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_title = 2;</code>
   */
  private void clearHighlightTitle() {
    bitField0_ = (bitField0_ & ~0x00000002);
    highlightTitle_ = false;
  }

  public static final int HIGHLIGHT_LINE1_FIELD_NUMBER = 3;
  private boolean highlightLine1_;
  /**
   * <pre>
   * Whether the first description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line1 = 3;</code>
   * @return Whether the highlightLine1 field is set.
   */
  @java.lang.Override
  public boolean hasHighlightLine1() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Whether the first description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line1 = 3;</code>
   * @return The highlightLine1.
   */
  @java.lang.Override
  public boolean getHighlightLine1() {
    return highlightLine1_;
  }
  /**
   * <pre>
   * Whether the first description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line1 = 3;</code>
   * @param value The highlightLine1 to set.
   */
  private void setHighlightLine1(boolean value) {
    bitField0_ |= 0x00000004;
    highlightLine1_ = value;
  }
  /**
   * <pre>
   * Whether the first description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line1 = 3;</code>
   */
  private void clearHighlightLine1() {
    bitField0_ = (bitField0_ & ~0x00000004);
    highlightLine1_ = false;
  }

  public static final int HIGHLIGHT_LINE2_FIELD_NUMBER = 4;
  private boolean highlightLine2_;
  /**
   * <pre>
   * Whether the second description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line2 = 4;</code>
   * @return Whether the highlightLine2 field is set.
   */
  @java.lang.Override
  public boolean hasHighlightLine2() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Whether the second description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line2 = 4;</code>
   * @return The highlightLine2.
   */
  @java.lang.Override
  public boolean getHighlightLine2() {
    return highlightLine2_;
  }
  /**
   * <pre>
   * Whether the second description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line2 = 4;</code>
   * @param value The highlightLine2 to set.
   */
  private void setHighlightLine2(boolean value) {
    bitField0_ |= 0x00000008;
    highlightLine2_ = value;
  }
  /**
   * <pre>
   * Whether the second description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line2 = 4;</code>
   */
  private void clearHighlightLine2() {
    bitField0_ = (bitField0_ & ~0x00000008);
    highlightLine2_ = false;
  }

  public static final int HIGHLIGHT_LINE3_FIELD_NUMBER = 5;
  private boolean highlightLine3_;
  /**
   * <pre>
   * Whether the third description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line3 = 5;</code>
   * @return Whether the highlightLine3 field is set.
   */
  @java.lang.Override
  public boolean hasHighlightLine3() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * Whether the third description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line3 = 5;</code>
   * @return The highlightLine3.
   */
  @java.lang.Override
  public boolean getHighlightLine3() {
    return highlightLine3_;
  }
  /**
   * <pre>
   * Whether the third description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line3 = 5;</code>
   * @param value The highlightLine3 to set.
   */
  private void setHighlightLine3(boolean value) {
    bitField0_ |= 0x00000010;
    highlightLine3_ = value;
  }
  /**
   * <pre>
   * Whether the third description line should be highlighted.
   * </pre>
   *
   * <code>optional bool highlight_line3 = 5;</code>
   */
  private void clearHighlightLine3() {
    bitField0_ = (bitField0_ & ~0x00000010);
    highlightLine3_ = false;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.DetailsChangesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.DetailsChangesProto)
      org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Whether the changes require user approval. This de-emphasize
     * non-highlighted fields.
     * </pre>
     *
     * <code>optional bool user_approval_required = 1;</code>
     * @return Whether the userApprovalRequired field is set.
     */
    @java.lang.Override
    public boolean hasUserApprovalRequired() {
      return instance.hasUserApprovalRequired();
    }
    /**
     * <pre>
     * Whether the changes require user approval. This de-emphasize
     * non-highlighted fields.
     * </pre>
     *
     * <code>optional bool user_approval_required = 1;</code>
     * @return The userApprovalRequired.
     */
    @java.lang.Override
    public boolean getUserApprovalRequired() {
      return instance.getUserApprovalRequired();
    }
    /**
     * <pre>
     * Whether the changes require user approval. This de-emphasize
     * non-highlighted fields.
     * </pre>
     *
     * <code>optional bool user_approval_required = 1;</code>
     * @param value The userApprovalRequired to set.
     * @return This builder for chaining.
     */
    public Builder setUserApprovalRequired(boolean value) {
      copyOnWrite();
      instance.setUserApprovalRequired(value);
      return this;
    }
    /**
     * <pre>
     * Whether the changes require user approval. This de-emphasize
     * non-highlighted fields.
     * </pre>
     *
     * <code>optional bool user_approval_required = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserApprovalRequired() {
      copyOnWrite();
      instance.clearUserApprovalRequired();
      return this;
    }

    /**
     * <pre>
     * Whether the title should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_title = 2;</code>
     * @return Whether the highlightTitle field is set.
     */
    @java.lang.Override
    public boolean hasHighlightTitle() {
      return instance.hasHighlightTitle();
    }
    /**
     * <pre>
     * Whether the title should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_title = 2;</code>
     * @return The highlightTitle.
     */
    @java.lang.Override
    public boolean getHighlightTitle() {
      return instance.getHighlightTitle();
    }
    /**
     * <pre>
     * Whether the title should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_title = 2;</code>
     * @param value The highlightTitle to set.
     * @return This builder for chaining.
     */
    public Builder setHighlightTitle(boolean value) {
      copyOnWrite();
      instance.setHighlightTitle(value);
      return this;
    }
    /**
     * <pre>
     * Whether the title should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHighlightTitle() {
      copyOnWrite();
      instance.clearHighlightTitle();
      return this;
    }

    /**
     * <pre>
     * Whether the first description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line1 = 3;</code>
     * @return Whether the highlightLine1 field is set.
     */
    @java.lang.Override
    public boolean hasHighlightLine1() {
      return instance.hasHighlightLine1();
    }
    /**
     * <pre>
     * Whether the first description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line1 = 3;</code>
     * @return The highlightLine1.
     */
    @java.lang.Override
    public boolean getHighlightLine1() {
      return instance.getHighlightLine1();
    }
    /**
     * <pre>
     * Whether the first description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line1 = 3;</code>
     * @param value The highlightLine1 to set.
     * @return This builder for chaining.
     */
    public Builder setHighlightLine1(boolean value) {
      copyOnWrite();
      instance.setHighlightLine1(value);
      return this;
    }
    /**
     * <pre>
     * Whether the first description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line1 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHighlightLine1() {
      copyOnWrite();
      instance.clearHighlightLine1();
      return this;
    }

    /**
     * <pre>
     * Whether the second description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line2 = 4;</code>
     * @return Whether the highlightLine2 field is set.
     */
    @java.lang.Override
    public boolean hasHighlightLine2() {
      return instance.hasHighlightLine2();
    }
    /**
     * <pre>
     * Whether the second description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line2 = 4;</code>
     * @return The highlightLine2.
     */
    @java.lang.Override
    public boolean getHighlightLine2() {
      return instance.getHighlightLine2();
    }
    /**
     * <pre>
     * Whether the second description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line2 = 4;</code>
     * @param value The highlightLine2 to set.
     * @return This builder for chaining.
     */
    public Builder setHighlightLine2(boolean value) {
      copyOnWrite();
      instance.setHighlightLine2(value);
      return this;
    }
    /**
     * <pre>
     * Whether the second description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line2 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHighlightLine2() {
      copyOnWrite();
      instance.clearHighlightLine2();
      return this;
    }

    /**
     * <pre>
     * Whether the third description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line3 = 5;</code>
     * @return Whether the highlightLine3 field is set.
     */
    @java.lang.Override
    public boolean hasHighlightLine3() {
      return instance.hasHighlightLine3();
    }
    /**
     * <pre>
     * Whether the third description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line3 = 5;</code>
     * @return The highlightLine3.
     */
    @java.lang.Override
    public boolean getHighlightLine3() {
      return instance.getHighlightLine3();
    }
    /**
     * <pre>
     * Whether the third description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line3 = 5;</code>
     * @param value The highlightLine3 to set.
     * @return This builder for chaining.
     */
    public Builder setHighlightLine3(boolean value) {
      copyOnWrite();
      instance.setHighlightLine3(value);
      return this;
    }
    /**
     * <pre>
     * Whether the third description line should be highlighted.
     * </pre>
     *
     * <code>optional bool highlight_line3 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHighlightLine3() {
      copyOnWrite();
      instance.clearHighlightLine3();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.DetailsChangesProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "userApprovalRequired_",
            "highlightTitle_",
            "highlightLine1_",
            "highlightLine2_",
            "highlightLine3_",
          };
          java.lang.String info =
              "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1007\u0000\u0002" +
              "\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.DetailsChangesProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto DEFAULT_INSTANCE;
  static {
    DetailsChangesProto defaultInstance = new DetailsChangesProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      DetailsChangesProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DetailsChangesProto> PARSER;

  public static com.google.protobuf.Parser<DetailsChangesProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

