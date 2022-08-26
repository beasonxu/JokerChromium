// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.GenericUserInterfaceProto}
 */
public  final class GenericUserInterfaceProto extends
    com.google.protobuf.GeneratedMessageLite<
        GenericUserInterfaceProto, GenericUserInterfaceProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.GenericUserInterfaceProto)
    GenericUserInterfaceProtoOrBuilder {
  private GenericUserInterfaceProto() {
  }
  private int bitField0_;
  public static final int ROOT_VIEW_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ViewProto rootView_;
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  @java.lang.Override
  public boolean hasRootView() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ViewProto getRootView() {
    return rootView_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.getDefaultInstance() : rootView_;
  }
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  private void setRootView(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
    value.getClass();
  rootView_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeRootView(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
    value.getClass();
  if (rootView_ != null &&
        rootView_ != org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.getDefaultInstance()) {
      rootView_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.newBuilder(rootView_).mergeFrom(value).buildPartial();
    } else {
      rootView_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The root view, usually a view container.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
   */
  private void clearRootView() {  rootView_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int INTERACTIONS_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto interactions_;
  /**
   * <pre>
   * The interactions for this generic user interface.
   * </pre>
   *
   * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
   */
  @java.lang.Override
  public boolean hasInteractions() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The interactions for this generic user interface.
   * </pre>
   *
   * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto getInteractions() {
    return interactions_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto.getDefaultInstance() : interactions_;
  }
  /**
   * <pre>
   * The interactions for this generic user interface.
   * </pre>
   *
   * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
   */
  private void setInteractions(org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto value) {
    value.getClass();
  interactions_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * The interactions for this generic user interface.
   * </pre>
   *
   * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeInteractions(org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto value) {
    value.getClass();
  if (interactions_ != null &&
        interactions_ != org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto.getDefaultInstance()) {
      interactions_ =
        org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto.newBuilder(interactions_).mergeFrom(value).buildPartial();
    } else {
      interactions_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The interactions for this generic user interface.
   * </pre>
   *
   * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
   */
  private void clearInteractions() {  interactions_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int MODEL_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.ModelProto model_;
  /**
   * <pre>
   * The model containing initial values for interactive UI.
   * </pre>
   *
   * <code>optional .autofill_assistant.ModelProto model = 3;</code>
   */
  @java.lang.Override
  public boolean hasModel() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The model containing initial values for interactive UI.
   * </pre>
   *
   * <code>optional .autofill_assistant.ModelProto model = 3;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ModelProto getModel() {
    return model_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ModelProto.getDefaultInstance() : model_;
  }
  /**
   * <pre>
   * The model containing initial values for interactive UI.
   * </pre>
   *
   * <code>optional .autofill_assistant.ModelProto model = 3;</code>
   */
  private void setModel(org.chromium.chrome.browser.autofill_assistant.proto.ModelProto value) {
    value.getClass();
  model_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * The model containing initial values for interactive UI.
   * </pre>
   *
   * <code>optional .autofill_assistant.ModelProto model = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeModel(org.chromium.chrome.browser.autofill_assistant.proto.ModelProto value) {
    value.getClass();
  if (model_ != null &&
        model_ != org.chromium.chrome.browser.autofill_assistant.proto.ModelProto.getDefaultInstance()) {
      model_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ModelProto.newBuilder(model_).mergeFrom(value).buildPartial();
    } else {
      model_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * The model containing initial values for interactive UI.
   * </pre>
   *
   * <code>optional .autofill_assistant.ModelProto model = 3;</code>
   */
  private void clearModel() {  model_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.GenericUserInterfaceProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.GenericUserInterfaceProto)
      org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    @java.lang.Override
    public boolean hasRootView() {
      return instance.hasRootView();
    }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ViewProto getRootView() {
      return instance.getRootView();
    }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public Builder setRootView(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
      copyOnWrite();
      instance.setRootView(value);
      return this;
      }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public Builder setRootView(
        org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.Builder builderForValue) {
      copyOnWrite();
      instance.setRootView(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public Builder mergeRootView(org.chromium.chrome.browser.autofill_assistant.proto.ViewProto value) {
      copyOnWrite();
      instance.mergeRootView(value);
      return this;
    }
    /**
     * <pre>
     * The root view, usually a view container.
     * </pre>
     *
     * <code>optional .autofill_assistant.ViewProto root_view = 1;</code>
     */
    public Builder clearRootView() {  copyOnWrite();
      instance.clearRootView();
      return this;
    }

    /**
     * <pre>
     * The interactions for this generic user interface.
     * </pre>
     *
     * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
     */
    @java.lang.Override
    public boolean hasInteractions() {
      return instance.hasInteractions();
    }
    /**
     * <pre>
     * The interactions for this generic user interface.
     * </pre>
     *
     * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto getInteractions() {
      return instance.getInteractions();
    }
    /**
     * <pre>
     * The interactions for this generic user interface.
     * </pre>
     *
     * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
     */
    public Builder setInteractions(org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto value) {
      copyOnWrite();
      instance.setInteractions(value);
      return this;
      }
    /**
     * <pre>
     * The interactions for this generic user interface.
     * </pre>
     *
     * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
     */
    public Builder setInteractions(
        org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto.Builder builderForValue) {
      copyOnWrite();
      instance.setInteractions(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The interactions for this generic user interface.
     * </pre>
     *
     * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
     */
    public Builder mergeInteractions(org.chromium.chrome.browser.autofill_assistant.proto.InteractionsProto value) {
      copyOnWrite();
      instance.mergeInteractions(value);
      return this;
    }
    /**
     * <pre>
     * The interactions for this generic user interface.
     * </pre>
     *
     * <code>optional .autofill_assistant.InteractionsProto interactions = 2;</code>
     */
    public Builder clearInteractions() {  copyOnWrite();
      instance.clearInteractions();
      return this;
    }

    /**
     * <pre>
     * The model containing initial values for interactive UI.
     * </pre>
     *
     * <code>optional .autofill_assistant.ModelProto model = 3;</code>
     */
    @java.lang.Override
    public boolean hasModel() {
      return instance.hasModel();
    }
    /**
     * <pre>
     * The model containing initial values for interactive UI.
     * </pre>
     *
     * <code>optional .autofill_assistant.ModelProto model = 3;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ModelProto getModel() {
      return instance.getModel();
    }
    /**
     * <pre>
     * The model containing initial values for interactive UI.
     * </pre>
     *
     * <code>optional .autofill_assistant.ModelProto model = 3;</code>
     */
    public Builder setModel(org.chromium.chrome.browser.autofill_assistant.proto.ModelProto value) {
      copyOnWrite();
      instance.setModel(value);
      return this;
      }
    /**
     * <pre>
     * The model containing initial values for interactive UI.
     * </pre>
     *
     * <code>optional .autofill_assistant.ModelProto model = 3;</code>
     */
    public Builder setModel(
        org.chromium.chrome.browser.autofill_assistant.proto.ModelProto.Builder builderForValue) {
      copyOnWrite();
      instance.setModel(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The model containing initial values for interactive UI.
     * </pre>
     *
     * <code>optional .autofill_assistant.ModelProto model = 3;</code>
     */
    public Builder mergeModel(org.chromium.chrome.browser.autofill_assistant.proto.ModelProto value) {
      copyOnWrite();
      instance.mergeModel(value);
      return this;
    }
    /**
     * <pre>
     * The model containing initial values for interactive UI.
     * </pre>
     *
     * <code>optional .autofill_assistant.ModelProto model = 3;</code>
     */
    public Builder clearModel() {  copyOnWrite();
      instance.clearModel();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.GenericUserInterfaceProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "rootView_",
            "interactions_",
            "model_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001\u0003\u1009\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.GenericUserInterfaceProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto DEFAULT_INSTANCE;
  static {
    GenericUserInterfaceProto defaultInstance = new GenericUserInterfaceProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GenericUserInterfaceProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GenericUserInterfaceProto> PARSER;

  public static com.google.protobuf.Parser<GenericUserInterfaceProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

