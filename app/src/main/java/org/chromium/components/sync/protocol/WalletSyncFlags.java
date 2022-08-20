// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/experiments_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Flags for enabling wallet data syncing.
 * </pre>
 *
 * Protobuf type {@code sync_pb.WalletSyncFlags}
 */
public  final class WalletSyncFlags extends
    com.google.protobuf.GeneratedMessageLite<
        WalletSyncFlags, WalletSyncFlags.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.WalletSyncFlags)
    WalletSyncFlagsOrBuilder {
  private WalletSyncFlags() {
  }
  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <code>optional bool enabled = 1;</code>
   * @return Whether the enabled field is set.
   */
  @java.lang.Override
  public boolean hasEnabled() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }
  /**
   * <code>optional bool enabled = 1;</code>
   * @param value The enabled to set.
   */
  private void setEnabled(boolean value) {
    bitField0_ |= 0x00000001;
    enabled_ = value;
  }
  /**
   * <code>optional bool enabled = 1;</code>
   */
  private void clearEnabled() {
    bitField0_ = (bitField0_ & ~0x00000001);
    enabled_ = false;
  }

  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.WalletSyncFlags parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.WalletSyncFlags prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Flags for enabling wallet data syncing.
   * </pre>
   *
   * Protobuf type {@code sync_pb.WalletSyncFlags}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.WalletSyncFlags, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.WalletSyncFlags)
      org.chromium.components.sync.protocol.WalletSyncFlagsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.WalletSyncFlags.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional bool enabled = 1;</code>
     * @return Whether the enabled field is set.
     */
    @java.lang.Override
    public boolean hasEnabled() {
      return instance.hasEnabled();
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return instance.getEnabled();
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      copyOnWrite();
      instance.setEnabled(value);
      return this;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      copyOnWrite();
      instance.clearEnabled();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.WalletSyncFlags)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.WalletSyncFlags();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "enabled_",
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
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.WalletSyncFlags> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.WalletSyncFlags.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.WalletSyncFlags>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.WalletSyncFlags)
  private static final org.chromium.components.sync.protocol.WalletSyncFlags DEFAULT_INSTANCE;
  static {
    WalletSyncFlags defaultInstance = new WalletSyncFlags();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      WalletSyncFlags.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.WalletSyncFlags getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<WalletSyncFlags> PARSER;

  public static com.google.protobuf.Parser<WalletSyncFlags> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
