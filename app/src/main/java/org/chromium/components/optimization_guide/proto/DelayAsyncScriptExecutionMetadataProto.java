// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: delay_async_script_execution_metadata.proto

package org.chromium.components.optimization_guide.proto;

public final class DelayAsyncScriptExecutionMetadataProto {
  private DelayAsyncScriptExecutionMetadataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface DelayAsyncScriptExecutionMetadataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:optimization_guide.proto.DelayAsyncScriptExecutionMetadata)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The timing at which execution of async scripts should be delayed until.
     * </pre>
     *
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @return Whether the delayType field is set.
     */
    boolean hasDelayType();
    /**
     * <pre>
     * The timing at which execution of async scripts should be delayed until.
     * </pre>
     *
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @return The delayType.
     */
    org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType getDelayType();
  }
  /**
   * <pre>
   * Optimization metadata for OptimizationType::DELAY_ASYNC_SCRIPT_EXECUTION.
   * </pre>
   *
   * Protobuf type {@code optimization_guide.proto.DelayAsyncScriptExecutionMetadata}
   */
  public  static final class DelayAsyncScriptExecutionMetadata extends
      com.google.protobuf.GeneratedMessageLite<
          DelayAsyncScriptExecutionMetadata, DelayAsyncScriptExecutionMetadata.Builder> implements
      // @@protoc_insertion_point(message_implements:optimization_guide.proto.DelayAsyncScriptExecutionMetadata)
      DelayAsyncScriptExecutionMetadataOrBuilder {
    private DelayAsyncScriptExecutionMetadata() {
    }
    private int bitField0_;
    public static final int DELAY_TYPE_FIELD_NUMBER = 1;
    private int delayType_;
    /**
     * <pre>
     * The timing at which execution of async scripts should be delayed until.
     * </pre>
     *
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @return Whether the delayType field is set.
     */
    @java.lang.Override
    public boolean hasDelayType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The timing at which execution of async scripts should be delayed until.
     * </pre>
     *
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @return The delayType.
     */
    @java.lang.Override
    public org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType getDelayType() {
      org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType result = org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType.forNumber(delayType_);
      return result == null ? org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType.DELAY_TYPE_UNKNOWN : result;
    }
    /**
     * <pre>
     * The timing at which execution of async scripts should be delayed until.
     * </pre>
     *
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @param value The delayType to set.
     */
    private void setDelayType(org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType value) {
      delayType_ = value.getNumber();
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The timing at which execution of async scripts should be delayed until.
     * </pre>
     *
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     */
    private void clearDelayType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      delayType_ = 0;
    }

    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Optimization metadata for OptimizationType::DELAY_ASYNC_SCRIPT_EXECUTION.
     * </pre>
     *
     * Protobuf type {@code optimization_guide.proto.DelayAsyncScriptExecutionMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata, Builder> implements
        // @@protoc_insertion_point(builder_implements:optimization_guide.proto.DelayAsyncScriptExecutionMetadata)
        org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadataOrBuilder {
      // Construct using org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * The timing at which execution of async scripts should be delayed until.
       * </pre>
       *
       * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
       * @return Whether the delayType field is set.
       */
      @java.lang.Override
      public boolean hasDelayType() {
        return instance.hasDelayType();
      }
      /**
       * <pre>
       * The timing at which execution of async scripts should be delayed until.
       * </pre>
       *
       * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
       * @return The delayType.
       */
      @java.lang.Override
      public org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType getDelayType() {
        return instance.getDelayType();
      }
      /**
       * <pre>
       * The timing at which execution of async scripts should be delayed until.
       * </pre>
       *
       * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
       * @param value The enum numeric value on the wire for delayType to set.
       * @return This builder for chaining.
       */
      public Builder setDelayType(org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType value) {
        copyOnWrite();
        instance.setDelayType(value);
        return this;
      }
      /**
       * <pre>
       * The timing at which execution of async scripts should be delayed until.
       * </pre>
       *
       * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelayType() {
        copyOnWrite();
        instance.clearDelayType();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:optimization_guide.proto.DelayAsyncScriptExecutionMetadata)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "delayType_",
              org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType.internalGetVerifier(),
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata>(
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


    // @@protoc_insertion_point(class_scope:optimization_guide.proto.DelayAsyncScriptExecutionMetadata)
    private static final org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata DEFAULT_INSTANCE;
    static {
      DelayAsyncScriptExecutionMetadata defaultInstance = new DelayAsyncScriptExecutionMetadata();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        DelayAsyncScriptExecutionMetadata.class, defaultInstance);
    }

    public static org.chromium.components.optimization_guide.proto.DelayAsyncScriptExecutionMetadataProto.DelayAsyncScriptExecutionMetadata getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<DelayAsyncScriptExecutionMetadata> PARSER;

    public static com.google.protobuf.Parser<DelayAsyncScriptExecutionMetadata> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}