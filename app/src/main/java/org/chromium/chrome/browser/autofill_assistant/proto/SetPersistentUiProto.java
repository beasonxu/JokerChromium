// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Show backend-specified user interface elements to the user until dismissed.
 * The UI will be shown until cleared by ClearPersistentUi or overwritten
 * by a subsequent SetPersistentUi.
 * The Ui is also cleared at the end of the script if it ended in error or if
 * the last action had |clean_contextual_ui| = true.
 * Client errors:
 *   INVALID_ACTION if |generic_user_interface| was ill-defined or incomplete,
 *   or if the client failed to instantiate the UI for some reason. The Chrome
 *   log should contain additional information about the issue, if verbose
 *   logging is enabled (suggested level: 2 or 3).
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.SetPersistentUiProto}
 */
public  final class SetPersistentUiProto extends
    com.google.protobuf.GeneratedMessageLite<
        SetPersistentUiProto, SetPersistentUiProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.SetPersistentUiProto)
    SetPersistentUiProtoOrBuilder {
  private SetPersistentUiProto() {
  }
  private int bitField0_;
  public static final int GENERIC_USER_INTERFACE_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto genericUserInterface_;
  /**
   * <pre>
   * Required. The generic user interface to show.
   * The following interaction callbacks aren't supported:
   * - SetUserActions
   * - ToggleUserAction
   * - EndAction
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
   */
  @java.lang.Override
  public boolean hasGenericUserInterface() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The generic user interface to show.
   * The following interaction callbacks aren't supported:
   * - SetUserActions
   * - ToggleUserAction
   * - EndAction
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getGenericUserInterface() {
    return genericUserInterface_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.getDefaultInstance() : genericUserInterface_;
  }
  /**
   * <pre>
   * Required. The generic user interface to show.
   * The following interaction callbacks aren't supported:
   * - SetUserActions
   * - ToggleUserAction
   * - EndAction
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
   */
  private void setGenericUserInterface(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto value) {
    value.getClass();
  genericUserInterface_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Required. The generic user interface to show.
   * The following interaction callbacks aren't supported:
   * - SetUserActions
   * - ToggleUserAction
   * - EndAction
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeGenericUserInterface(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto value) {
    value.getClass();
  if (genericUserInterface_ != null &&
        genericUserInterface_ != org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.getDefaultInstance()) {
      genericUserInterface_ =
        org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.newBuilder(genericUserInterface_).mergeFrom(value).buildPartial();
    } else {
      genericUserInterface_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Required. The generic user interface to show.
   * The following interaction callbacks aren't supported:
   * - SetUserActions
   * - ToggleUserAction
   * - EndAction
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
   */
  private void clearGenericUserInterface() {  genericUserInterface_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Show backend-specified user interface elements to the user until dismissed.
   * The UI will be shown until cleared by ClearPersistentUi or overwritten
   * by a subsequent SetPersistentUi.
   * The Ui is also cleared at the end of the script if it ended in error or if
   * the last action had |clean_contextual_ui| = true.
   * Client errors:
   *   INVALID_ACTION if |generic_user_interface| was ill-defined or incomplete,
   *   or if the client failed to instantiate the UI for some reason. The Chrome
   *   log should contain additional information about the issue, if verbose
   *   logging is enabled (suggested level: 2 or 3).
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.SetPersistentUiProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.SetPersistentUiProto)
      org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Required. The generic user interface to show.
     * The following interaction callbacks aren't supported:
     * - SetUserActions
     * - ToggleUserAction
     * - EndAction
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
     */
    @java.lang.Override
    public boolean hasGenericUserInterface() {
      return instance.hasGenericUserInterface();
    }
    /**
     * <pre>
     * Required. The generic user interface to show.
     * The following interaction callbacks aren't supported:
     * - SetUserActions
     * - ToggleUserAction
     * - EndAction
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getGenericUserInterface() {
      return instance.getGenericUserInterface();
    }
    /**
     * <pre>
     * Required. The generic user interface to show.
     * The following interaction callbacks aren't supported:
     * - SetUserActions
     * - ToggleUserAction
     * - EndAction
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
     */
    public Builder setGenericUserInterface(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto value) {
      copyOnWrite();
      instance.setGenericUserInterface(value);
      return this;
      }
    /**
     * <pre>
     * Required. The generic user interface to show.
     * The following interaction callbacks aren't supported:
     * - SetUserActions
     * - ToggleUserAction
     * - EndAction
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
     */
    public Builder setGenericUserInterface(
        org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setGenericUserInterface(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Required. The generic user interface to show.
     * The following interaction callbacks aren't supported:
     * - SetUserActions
     * - ToggleUserAction
     * - EndAction
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
     */
    public Builder mergeGenericUserInterface(org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto value) {
      copyOnWrite();
      instance.mergeGenericUserInterface(value);
      return this;
    }
    /**
     * <pre>
     * Required. The generic user interface to show.
     * The following interaction callbacks aren't supported:
     * - SetUserActions
     * - ToggleUserAction
     * - EndAction
     * </pre>
     *
     * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface = 1;</code>
     */
    public Builder clearGenericUserInterface() {  copyOnWrite();
      instance.clearGenericUserInterface();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.SetPersistentUiProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "genericUserInterface_",
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
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.SetPersistentUiProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto DEFAULT_INSTANCE;
  static {
    SetPersistentUiProto defaultInstance = new SetPersistentUiProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SetPersistentUiProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetPersistentUiProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SetPersistentUiProto> PARSER;

  public static com.google.protobuf.Parser<SetPersistentUiProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

