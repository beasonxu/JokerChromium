// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Stop Autofill Assistant.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.StopProto}
 */
public  final class StopProto extends
    com.google.protobuf.GeneratedMessageLite<
        StopProto, StopProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.StopProto)
    StopProtoOrBuilder {
  private StopProto() {
  }
  private int bitField0_;
  public static final int CLOSE_CCT_FIELD_NUMBER = 2;
  private boolean closeCct_;
  /**
   * <pre>
   * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
   * Assistant.
   * </pre>
   *
   * <code>optional bool close_cct = 2;</code>
   * @return Whether the closeCct field is set.
   */
  @java.lang.Override
  public boolean hasCloseCct() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
   * Assistant.
   * </pre>
   *
   * <code>optional bool close_cct = 2;</code>
   * @return The closeCct.
   */
  @java.lang.Override
  public boolean getCloseCct() {
    return closeCct_;
  }
  /**
   * <pre>
   * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
   * Assistant.
   * </pre>
   *
   * <code>optional bool close_cct = 2;</code>
   * @param value The closeCct to set.
   */
  private void setCloseCct(boolean value) {
    bitField0_ |= 0x00000001;
    closeCct_ = value;
  }
  /**
   * <pre>
   * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
   * Assistant.
   * </pre>
   *
   * <code>optional bool close_cct = 2;</code>
   */
  private void clearCloseCct() {
    bitField0_ = (bitField0_ & ~0x00000001);
    closeCct_ = false;
  }

  public static final int SHOW_FEEDBACK_CHIP_FIELD_NUMBER = 3;
  private boolean showFeedbackChip_;
  /**
   * <pre>
   * Whether to show the feedback chip once Autofill Assistant has stopped.
   * Note that this is only relevant if the UI is still being shown after the
   * stop, which happens only if:
   * - close_cct is false.
   * - The action preceding this one is a Tell action.
   * </pre>
   *
   * <code>optional bool show_feedback_chip = 3;</code>
   * @return Whether the showFeedbackChip field is set.
   */
  @java.lang.Override
  public boolean hasShowFeedbackChip() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Whether to show the feedback chip once Autofill Assistant has stopped.
   * Note that this is only relevant if the UI is still being shown after the
   * stop, which happens only if:
   * - close_cct is false.
   * - The action preceding this one is a Tell action.
   * </pre>
   *
   * <code>optional bool show_feedback_chip = 3;</code>
   * @return The showFeedbackChip.
   */
  @java.lang.Override
  public boolean getShowFeedbackChip() {
    return showFeedbackChip_;
  }
  /**
   * <pre>
   * Whether to show the feedback chip once Autofill Assistant has stopped.
   * Note that this is only relevant if the UI is still being shown after the
   * stop, which happens only if:
   * - close_cct is false.
   * - The action preceding this one is a Tell action.
   * </pre>
   *
   * <code>optional bool show_feedback_chip = 3;</code>
   * @param value The showFeedbackChip to set.
   */
  private void setShowFeedbackChip(boolean value) {
    bitField0_ |= 0x00000002;
    showFeedbackChip_ = value;
  }
  /**
   * <pre>
   * Whether to show the feedback chip once Autofill Assistant has stopped.
   * Note that this is only relevant if the UI is still being shown after the
   * stop, which happens only if:
   * - close_cct is false.
   * - The action preceding this one is a Tell action.
   * </pre>
   *
   * <code>optional bool show_feedback_chip = 3;</code>
   */
  private void clearShowFeedbackChip() {
    bitField0_ = (bitField0_ & ~0x00000002);
    showFeedbackChip_ = false;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.StopProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Stop Autofill Assistant.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.StopProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.StopProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.StopProto)
      org.chromium.chrome.browser.autofill_assistant.proto.StopProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.StopProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
     * Assistant.
     * </pre>
     *
     * <code>optional bool close_cct = 2;</code>
     * @return Whether the closeCct field is set.
     */
    @java.lang.Override
    public boolean hasCloseCct() {
      return instance.hasCloseCct();
    }
    /**
     * <pre>
     * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
     * Assistant.
     * </pre>
     *
     * <code>optional bool close_cct = 2;</code>
     * @return The closeCct.
     */
    @java.lang.Override
    public boolean getCloseCct() {
      return instance.getCloseCct();
    }
    /**
     * <pre>
     * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
     * Assistant.
     * </pre>
     *
     * <code>optional bool close_cct = 2;</code>
     * @param value The closeCct to set.
     * @return This builder for chaining.
     */
    public Builder setCloseCct(boolean value) {
      copyOnWrite();
      instance.setCloseCct(value);
      return this;
    }
    /**
     * <pre>
     * If true, close the Chrome Custom Tab, in addition to shutting down Autofill
     * Assistant.
     * </pre>
     *
     * <code>optional bool close_cct = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCloseCct() {
      copyOnWrite();
      instance.clearCloseCct();
      return this;
    }

    /**
     * <pre>
     * Whether to show the feedback chip once Autofill Assistant has stopped.
     * Note that this is only relevant if the UI is still being shown after the
     * stop, which happens only if:
     * - close_cct is false.
     * - The action preceding this one is a Tell action.
     * </pre>
     *
     * <code>optional bool show_feedback_chip = 3;</code>
     * @return Whether the showFeedbackChip field is set.
     */
    @java.lang.Override
    public boolean hasShowFeedbackChip() {
      return instance.hasShowFeedbackChip();
    }
    /**
     * <pre>
     * Whether to show the feedback chip once Autofill Assistant has stopped.
     * Note that this is only relevant if the UI is still being shown after the
     * stop, which happens only if:
     * - close_cct is false.
     * - The action preceding this one is a Tell action.
     * </pre>
     *
     * <code>optional bool show_feedback_chip = 3;</code>
     * @return The showFeedbackChip.
     */
    @java.lang.Override
    public boolean getShowFeedbackChip() {
      return instance.getShowFeedbackChip();
    }
    /**
     * <pre>
     * Whether to show the feedback chip once Autofill Assistant has stopped.
     * Note that this is only relevant if the UI is still being shown after the
     * stop, which happens only if:
     * - close_cct is false.
     * - The action preceding this one is a Tell action.
     * </pre>
     *
     * <code>optional bool show_feedback_chip = 3;</code>
     * @param value The showFeedbackChip to set.
     * @return This builder for chaining.
     */
    public Builder setShowFeedbackChip(boolean value) {
      copyOnWrite();
      instance.setShowFeedbackChip(value);
      return this;
    }
    /**
     * <pre>
     * Whether to show the feedback chip once Autofill Assistant has stopped.
     * Note that this is only relevant if the UI is still being shown after the
     * stop, which happens only if:
     * - close_cct is false.
     * - The action preceding this one is a Tell action.
     * </pre>
     *
     * <code>optional bool show_feedback_chip = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearShowFeedbackChip() {
      copyOnWrite();
      instance.clearShowFeedbackChip();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.StopProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.StopProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "closeCct_",
            "showFeedbackChip_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1007\u0000\u0003" +
              "\u1007\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.StopProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.StopProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.StopProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.StopProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.StopProto DEFAULT_INSTANCE;
  static {
    StopProto defaultInstance = new StopProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      StopProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.StopProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StopProto> PARSER;

  public static com.google.protobuf.Parser<StopProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
