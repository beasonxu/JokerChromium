// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/dom_action.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Check whether the element in |option_id| is selected in the element in
 * |select_id|.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.CheckOptionElementProto}
 */
public  final class CheckOptionElementProto extends
    com.google.protobuf.GeneratedMessageLite<
        CheckOptionElementProto, CheckOptionElementProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.CheckOptionElementProto)
    CheckOptionElementProtoOrBuilder {
  private CheckOptionElementProto() {
  }
  public interface ResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:autofill_assistant.CheckOptionElementProto.Result)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional bool match = 1;</code>
     * @return Whether the match field is set.
     */
    boolean hasMatch();
    /**
     * <code>optional bool match = 1;</code>
     * @return The match.
     */
    boolean getMatch();
  }
  /**
   * Protobuf type {@code autofill_assistant.CheckOptionElementProto.Result}
   */
  public  static final class Result extends
      com.google.protobuf.GeneratedMessageLite<
          Result, Result.Builder> implements
      // @@protoc_insertion_point(message_implements:autofill_assistant.CheckOptionElementProto.Result)
      ResultOrBuilder {
    private Result() {
    }
    private int bitField0_;
    public static final int MATCH_FIELD_NUMBER = 1;
    private boolean match_;
    /**
     * <code>optional bool match = 1;</code>
     * @return Whether the match field is set.
     */
    @java.lang.Override
    public boolean hasMatch() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool match = 1;</code>
     * @return The match.
     */
    @java.lang.Override
    public boolean getMatch() {
      return match_;
    }
    /**
     * <code>optional bool match = 1;</code>
     * @param value The match to set.
     */
    private void setMatch(boolean value) {
      bitField0_ |= 0x00000001;
      match_ = value;
    }
    /**
     * <code>optional bool match = 1;</code>
     */
    private void clearMatch() {
      bitField0_ = (bitField0_ & ~0x00000001);
      match_ = false;
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code autofill_assistant.CheckOptionElementProto.Result}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result, Builder> implements
        // @@protoc_insertion_point(builder_implements:autofill_assistant.CheckOptionElementProto.Result)
        org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.ResultOrBuilder {
      // Construct using org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional bool match = 1;</code>
       * @return Whether the match field is set.
       */
      @java.lang.Override
      public boolean hasMatch() {
        return instance.hasMatch();
      }
      /**
       * <code>optional bool match = 1;</code>
       * @return The match.
       */
      @java.lang.Override
      public boolean getMatch() {
        return instance.getMatch();
      }
      /**
       * <code>optional bool match = 1;</code>
       * @param value The match to set.
       * @return This builder for chaining.
       */
      public Builder setMatch(boolean value) {
        copyOnWrite();
        instance.setMatch(value);
        return this;
      }
      /**
       * <code>optional bool match = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatch() {
        copyOnWrite();
        instance.clearMatch();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:autofill_assistant.CheckOptionElementProto.Result)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "match_",
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result>(
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


    // @@protoc_insertion_point(class_scope:autofill_assistant.CheckOptionElementProto.Result)
    private static final org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result DEFAULT_INSTANCE;
    static {
      Result defaultInstance = new Result();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Result.class, defaultInstance);
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.Result getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Result> PARSER;

    public static com.google.protobuf.Parser<Result> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  private int bitField0_;
  public static final int SELECT_ID_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto selectId_;
  /**
   * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
   */
  @java.lang.Override
  public boolean hasSelectId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getSelectId() {
    return selectId_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance() : selectId_;
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
   */
  private void setSelectId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  selectId_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSelectId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  if (selectId_ != null &&
        selectId_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance()) {
      selectId_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.newBuilder(selectId_).mergeFrom(value).buildPartial();
    } else {
      selectId_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
   */
  private void clearSelectId() {  selectId_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int OPTION_ID_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto optionId_;
  /**
   * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
   */
  @java.lang.Override
  public boolean hasOptionId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getOptionId() {
    return optionId_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance() : optionId_;
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
   */
  private void setOptionId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  optionId_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeOptionId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  if (optionId_ != null &&
        optionId_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance()) {
      optionId_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.newBuilder(optionId_).mergeFrom(value).buildPartial();
    } else {
      optionId_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
   */
  private void clearOptionId() {  optionId_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int MISMATCH_SHOULD_FAIL_FIELD_NUMBER = 3;
  private boolean mismatchShouldFail_;
  /**
   * <pre>
   * If set and a mismatch happens, the action will report a failure status
   * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
   * fail and simply report the result.
   * </pre>
   *
   * <code>optional bool mismatch_should_fail = 3;</code>
   * @return Whether the mismatchShouldFail field is set.
   */
  @java.lang.Override
  public boolean hasMismatchShouldFail() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * If set and a mismatch happens, the action will report a failure status
   * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
   * fail and simply report the result.
   * </pre>
   *
   * <code>optional bool mismatch_should_fail = 3;</code>
   * @return The mismatchShouldFail.
   */
  @java.lang.Override
  public boolean getMismatchShouldFail() {
    return mismatchShouldFail_;
  }
  /**
   * <pre>
   * If set and a mismatch happens, the action will report a failure status
   * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
   * fail and simply report the result.
   * </pre>
   *
   * <code>optional bool mismatch_should_fail = 3;</code>
   * @param value The mismatchShouldFail to set.
   */
  private void setMismatchShouldFail(boolean value) {
    bitField0_ |= 0x00000004;
    mismatchShouldFail_ = value;
  }
  /**
   * <pre>
   * If set and a mismatch happens, the action will report a failure status
   * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
   * fail and simply report the result.
   * </pre>
   *
   * <code>optional bool mismatch_should_fail = 3;</code>
   */
  private void clearMismatchShouldFail() {
    bitField0_ = (bitField0_ & ~0x00000004);
    mismatchShouldFail_ = false;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Check whether the element in |option_id| is selected in the element in
   * |select_id|.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.CheckOptionElementProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.CheckOptionElementProto)
      org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
     */
    @java.lang.Override
    public boolean hasSelectId() {
      return instance.hasSelectId();
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getSelectId() {
      return instance.getSelectId();
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
     */
    public Builder setSelectId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.setSelectId(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
     */
    public Builder setSelectId(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.Builder builderForValue) {
      copyOnWrite();
      instance.setSelectId(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
     */
    public Builder mergeSelectId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.mergeSelectId(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto select_id = 1;</code>
     */
    public Builder clearSelectId() {  copyOnWrite();
      instance.clearSelectId();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
     */
    @java.lang.Override
    public boolean hasOptionId() {
      return instance.hasOptionId();
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getOptionId() {
      return instance.getOptionId();
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
     */
    public Builder setOptionId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.setOptionId(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
     */
    public Builder setOptionId(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.Builder builderForValue) {
      copyOnWrite();
      instance.setOptionId(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
     */
    public Builder mergeOptionId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.mergeOptionId(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto option_id = 2;</code>
     */
    public Builder clearOptionId() {  copyOnWrite();
      instance.clearOptionId();
      return this;
    }

    /**
     * <pre>
     * If set and a mismatch happens, the action will report a failure status
     * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
     * fail and simply report the result.
     * </pre>
     *
     * <code>optional bool mismatch_should_fail = 3;</code>
     * @return Whether the mismatchShouldFail field is set.
     */
    @java.lang.Override
    public boolean hasMismatchShouldFail() {
      return instance.hasMismatchShouldFail();
    }
    /**
     * <pre>
     * If set and a mismatch happens, the action will report a failure status
     * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
     * fail and simply report the result.
     * </pre>
     *
     * <code>optional bool mismatch_should_fail = 3;</code>
     * @return The mismatchShouldFail.
     */
    @java.lang.Override
    public boolean getMismatchShouldFail() {
      return instance.getMismatchShouldFail();
    }
    /**
     * <pre>
     * If set and a mismatch happens, the action will report a failure status
     * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
     * fail and simply report the result.
     * </pre>
     *
     * <code>optional bool mismatch_should_fail = 3;</code>
     * @param value The mismatchShouldFail to set.
     * @return This builder for chaining.
     */
    public Builder setMismatchShouldFail(boolean value) {
      copyOnWrite();
      instance.setMismatchShouldFail(value);
      return this;
    }
    /**
     * <pre>
     * If set and a mismatch happens, the action will report a failure status
     * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
     * fail and simply report the result.
     * </pre>
     *
     * <code>optional bool mismatch_should_fail = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMismatchShouldFail() {
      copyOnWrite();
      instance.clearMismatchShouldFail();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.CheckOptionElementProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "selectId_",
            "optionId_",
            "mismatchShouldFail_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001\u0003\u1007\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.CheckOptionElementProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto DEFAULT_INSTANCE;
  static {
    CheckOptionElementProto defaultInstance = new CheckOptionElementProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CheckOptionElementProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckOptionElementProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CheckOptionElementProto> PARSER;

  public static com.google.protobuf.Parser<CheckOptionElementProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

