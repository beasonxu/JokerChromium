// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Performs a logical OR on all specified values.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.BooleanOrProto}
 */
public  final class BooleanOrProto extends
    com.google.protobuf.GeneratedMessageLite<
        BooleanOrProto, BooleanOrProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.BooleanOrProto)
    BooleanOrProtoOrBuilder {
  private BooleanOrProto() {
    values_ = emptyProtobufList();
  }
  public static final int VALUES_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto> values_;
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto> getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  public java.util.List<? extends org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProtoOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProtoOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
  }
  private void ensureValuesIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto> tmp = values_;
    if (!tmp.isModifiable()) {
      values_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  private void setValues(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
    value.getClass();
  ensureValuesIsMutable();
    values_.set(index, value);
  }
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  private void addValues(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
    value.getClass();
  ensureValuesIsMutable();
    values_.add(value);
  }
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  private void addValues(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
    value.getClass();
  ensureValuesIsMutable();
    values_.add(index, value);
  }
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  private void addAllValues(
      java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto> values) {
    ensureValuesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, values_);
  }
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  private void clearValues() {
    values_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The values to logically OR. All values must be single booleans.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
   */
  private void removeValues(int index) {
    ensureValuesIsMutable();
    values_.remove(index);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Performs a logical OR on all specified values.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.BooleanOrProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.BooleanOrProto)
      org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto> getValuesList() {
      return java.util.Collections.unmodifiableList(
          instance.getValuesList());
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    @java.lang.Override
    public int getValuesCount() {
      return instance.getValuesCount();
    }/**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getValues(int index) {
      return instance.getValues(index);
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    public Builder setValues(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
      copyOnWrite();
      instance.setValues(index, value);
      return this;
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    public Builder setValues(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setValues(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    public Builder addValues(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
      copyOnWrite();
      instance.addValues(value);
      return this;
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    public Builder addValues(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
      copyOnWrite();
      instance.addValues(index, value);
      return this;
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    public Builder addValues(
        org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.addValues(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    public Builder addValues(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.addValues(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto> values) {
      copyOnWrite();
      instance.addAllValues(values);
      return this;
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    public Builder clearValues() {
      copyOnWrite();
      instance.clearValues();
      return this;
    }
    /**
     * <pre>
     * The values to logically OR. All values must be single booleans.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ValueReferenceProto values = 2;</code>
     */
    public Builder removeValues(int index) {
      copyOnWrite();
      instance.removeValues(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.BooleanOrProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "values_",
            org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.class,
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.BooleanOrProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto DEFAULT_INSTANCE;
  static {
    BooleanOrProto defaultInstance = new BooleanOrProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      BooleanOrProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanOrProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BooleanOrProto> PARSER;

  public static com.google.protobuf.Parser<BooleanOrProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
