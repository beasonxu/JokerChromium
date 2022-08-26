// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/vault.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.JoinSecurityDomainsRequest}
 */
public  final class JoinSecurityDomainsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        JoinSecurityDomainsRequest, JoinSecurityDomainsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.JoinSecurityDomainsRequest)
    JoinSecurityDomainsRequestOrBuilder {
  private JoinSecurityDomainsRequest() {
    sharedMemberKey_ = emptyProtobufList();
  }
  public static final int SECURITY_DOMAIN_FIELD_NUMBER = 1;
  private org.chromium.components.sync.protocol.SecurityDomain securityDomain_;
  /**
   * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
   */
  @java.lang.Override
  public boolean hasSecurityDomain() {
    return securityDomain_ != null;
  }
  /**
   * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.SecurityDomain getSecurityDomain() {
    return securityDomain_ == null ? org.chromium.components.sync.protocol.SecurityDomain.getDefaultInstance() : securityDomain_;
  }
  /**
   * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
   */
  private void setSecurityDomain(org.chromium.components.sync.protocol.SecurityDomain value) {
    value.getClass();
  securityDomain_ = value;
    
    }
  /**
   * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSecurityDomain(org.chromium.components.sync.protocol.SecurityDomain value) {
    value.getClass();
  if (securityDomain_ != null &&
        securityDomain_ != org.chromium.components.sync.protocol.SecurityDomain.getDefaultInstance()) {
      securityDomain_ =
        org.chromium.components.sync.protocol.SecurityDomain.newBuilder(securityDomain_).mergeFrom(value).buildPartial();
    } else {
      securityDomain_ = value;
    }
    
  }
  /**
   * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
   */
  private void clearSecurityDomain() {  securityDomain_ = null;
    
  }

  public static final int SECURITY_DOMAIN_MEMBER_FIELD_NUMBER = 2;
  private org.chromium.components.sync.protocol.SecurityDomainMember securityDomainMember_;
  /**
   * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
   */
  @java.lang.Override
  public boolean hasSecurityDomainMember() {
    return securityDomainMember_ != null;
  }
  /**
   * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.SecurityDomainMember getSecurityDomainMember() {
    return securityDomainMember_ == null ? org.chromium.components.sync.protocol.SecurityDomainMember.getDefaultInstance() : securityDomainMember_;
  }
  /**
   * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
   */
  private void setSecurityDomainMember(org.chromium.components.sync.protocol.SecurityDomainMember value) {
    value.getClass();
  securityDomainMember_ = value;
    
    }
  /**
   * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSecurityDomainMember(org.chromium.components.sync.protocol.SecurityDomainMember value) {
    value.getClass();
  if (securityDomainMember_ != null &&
        securityDomainMember_ != org.chromium.components.sync.protocol.SecurityDomainMember.getDefaultInstance()) {
      securityDomainMember_ =
        org.chromium.components.sync.protocol.SecurityDomainMember.newBuilder(securityDomainMember_).mergeFrom(value).buildPartial();
    } else {
      securityDomainMember_ = value;
    }
    
  }
  /**
   * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
   */
  private void clearSecurityDomainMember() {  securityDomainMember_ = null;
    
  }

  public static final int SHARED_MEMBER_KEY_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.SharedMemberKey> sharedMemberKey_;
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.components.sync.protocol.SharedMemberKey> getSharedMemberKeyList() {
    return sharedMemberKey_;
  }
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  public java.util.List<? extends org.chromium.components.sync.protocol.SharedMemberKeyOrBuilder> 
      getSharedMemberKeyOrBuilderList() {
    return sharedMemberKey_;
  }
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  @java.lang.Override
  public int getSharedMemberKeyCount() {
    return sharedMemberKey_.size();
  }
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.SharedMemberKey getSharedMemberKey(int index) {
    return sharedMemberKey_.get(index);
  }
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  public org.chromium.components.sync.protocol.SharedMemberKeyOrBuilder getSharedMemberKeyOrBuilder(
      int index) {
    return sharedMemberKey_.get(index);
  }
  private void ensureSharedMemberKeyIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.SharedMemberKey> tmp = sharedMemberKey_;
    if (!tmp.isModifiable()) {
      sharedMemberKey_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  private void setSharedMemberKey(
      int index, org.chromium.components.sync.protocol.SharedMemberKey value) {
    value.getClass();
  ensureSharedMemberKeyIsMutable();
    sharedMemberKey_.set(index, value);
  }
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  private void addSharedMemberKey(org.chromium.components.sync.protocol.SharedMemberKey value) {
    value.getClass();
  ensureSharedMemberKeyIsMutable();
    sharedMemberKey_.add(value);
  }
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  private void addSharedMemberKey(
      int index, org.chromium.components.sync.protocol.SharedMemberKey value) {
    value.getClass();
  ensureSharedMemberKeyIsMutable();
    sharedMemberKey_.add(index, value);
  }
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  private void addAllSharedMemberKey(
      java.lang.Iterable<? extends org.chromium.components.sync.protocol.SharedMemberKey> values) {
    ensureSharedMemberKeyIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, sharedMemberKey_);
  }
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  private void clearSharedMemberKey() {
    sharedMemberKey_ = emptyProtobufList();
  }
  /**
   * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
   */
  private void removeSharedMemberKey(int index) {
    ensureSharedMemberKeyIsMutable();
    sharedMemberKey_.remove(index);
  }

  public static final int MEMBER_TYPE_HINT_FIELD_NUMBER = 4;
  private int memberTypeHint_;
  /**
   * <code>int32 member_type_hint = 4;</code>
   * @return The memberTypeHint.
   */
  @java.lang.Override
  public int getMemberTypeHint() {
    return memberTypeHint_;
  }
  /**
   * <code>int32 member_type_hint = 4;</code>
   * @param value The memberTypeHint to set.
   */
  private void setMemberTypeHint(int value) {
    
    memberTypeHint_ = value;
  }
  /**
   * <code>int32 member_type_hint = 4;</code>
   */
  private void clearMemberTypeHint() {
    
    memberTypeHint_ = 0;
  }

  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.JoinSecurityDomainsRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.JoinSecurityDomainsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.JoinSecurityDomainsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.JoinSecurityDomainsRequest)
      org.chromium.components.sync.protocol.JoinSecurityDomainsRequestOrBuilder {
    // Construct using org.chromium.components.sync.protocol.JoinSecurityDomainsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
     */
    @java.lang.Override
    public boolean hasSecurityDomain() {
      return instance.hasSecurityDomain();
    }
    /**
     * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.SecurityDomain getSecurityDomain() {
      return instance.getSecurityDomain();
    }
    /**
     * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
     */
    public Builder setSecurityDomain(org.chromium.components.sync.protocol.SecurityDomain value) {
      copyOnWrite();
      instance.setSecurityDomain(value);
      return this;
      }
    /**
     * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
     */
    public Builder setSecurityDomain(
        org.chromium.components.sync.protocol.SecurityDomain.Builder builderForValue) {
      copyOnWrite();
      instance.setSecurityDomain(builderForValue.build());
      return this;
    }
    /**
     * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
     */
    public Builder mergeSecurityDomain(org.chromium.components.sync.protocol.SecurityDomain value) {
      copyOnWrite();
      instance.mergeSecurityDomain(value);
      return this;
    }
    /**
     * <code>.sync_pb.SecurityDomain security_domain = 1;</code>
     */
    public Builder clearSecurityDomain() {  copyOnWrite();
      instance.clearSecurityDomain();
      return this;
    }

    /**
     * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
     */
    @java.lang.Override
    public boolean hasSecurityDomainMember() {
      return instance.hasSecurityDomainMember();
    }
    /**
     * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.SecurityDomainMember getSecurityDomainMember() {
      return instance.getSecurityDomainMember();
    }
    /**
     * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
     */
    public Builder setSecurityDomainMember(org.chromium.components.sync.protocol.SecurityDomainMember value) {
      copyOnWrite();
      instance.setSecurityDomainMember(value);
      return this;
      }
    /**
     * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
     */
    public Builder setSecurityDomainMember(
        org.chromium.components.sync.protocol.SecurityDomainMember.Builder builderForValue) {
      copyOnWrite();
      instance.setSecurityDomainMember(builderForValue.build());
      return this;
    }
    /**
     * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
     */
    public Builder mergeSecurityDomainMember(org.chromium.components.sync.protocol.SecurityDomainMember value) {
      copyOnWrite();
      instance.mergeSecurityDomainMember(value);
      return this;
    }
    /**
     * <code>.sync_pb.SecurityDomainMember security_domain_member = 2;</code>
     */
    public Builder clearSecurityDomainMember() {  copyOnWrite();
      instance.clearSecurityDomainMember();
      return this;
    }

    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.components.sync.protocol.SharedMemberKey> getSharedMemberKeyList() {
      return java.util.Collections.unmodifiableList(
          instance.getSharedMemberKeyList());
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    @java.lang.Override
    public int getSharedMemberKeyCount() {
      return instance.getSharedMemberKeyCount();
    }/**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.SharedMemberKey getSharedMemberKey(int index) {
      return instance.getSharedMemberKey(index);
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    public Builder setSharedMemberKey(
        int index, org.chromium.components.sync.protocol.SharedMemberKey value) {
      copyOnWrite();
      instance.setSharedMemberKey(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    public Builder setSharedMemberKey(
        int index, org.chromium.components.sync.protocol.SharedMemberKey.Builder builderForValue) {
      copyOnWrite();
      instance.setSharedMemberKey(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    public Builder addSharedMemberKey(org.chromium.components.sync.protocol.SharedMemberKey value) {
      copyOnWrite();
      instance.addSharedMemberKey(value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    public Builder addSharedMemberKey(
        int index, org.chromium.components.sync.protocol.SharedMemberKey value) {
      copyOnWrite();
      instance.addSharedMemberKey(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    public Builder addSharedMemberKey(
        org.chromium.components.sync.protocol.SharedMemberKey.Builder builderForValue) {
      copyOnWrite();
      instance.addSharedMemberKey(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    public Builder addSharedMemberKey(
        int index, org.chromium.components.sync.protocol.SharedMemberKey.Builder builderForValue) {
      copyOnWrite();
      instance.addSharedMemberKey(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    public Builder addAllSharedMemberKey(
        java.lang.Iterable<? extends org.chromium.components.sync.protocol.SharedMemberKey> values) {
      copyOnWrite();
      instance.addAllSharedMemberKey(values);
      return this;
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    public Builder clearSharedMemberKey() {
      copyOnWrite();
      instance.clearSharedMemberKey();
      return this;
    }
    /**
     * <code>repeated .sync_pb.SharedMemberKey shared_member_key = 3;</code>
     */
    public Builder removeSharedMemberKey(int index) {
      copyOnWrite();
      instance.removeSharedMemberKey(index);
      return this;
    }

    /**
     * <code>int32 member_type_hint = 4;</code>
     * @return The memberTypeHint.
     */
    @java.lang.Override
    public int getMemberTypeHint() {
      return instance.getMemberTypeHint();
    }
    /**
     * <code>int32 member_type_hint = 4;</code>
     * @param value The memberTypeHint to set.
     * @return This builder for chaining.
     */
    public Builder setMemberTypeHint(int value) {
      copyOnWrite();
      instance.setMemberTypeHint(value);
      return this;
    }
    /**
     * <code>int32 member_type_hint = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemberTypeHint() {
      copyOnWrite();
      instance.clearMemberTypeHint();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.JoinSecurityDomainsRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.JoinSecurityDomainsRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "securityDomain_",
            "securityDomainMember_",
            "sharedMemberKey_",
            org.chromium.components.sync.protocol.SharedMemberKey.class,
            "memberTypeHint_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\t\u0003" +
              "\u001b\u0004\u0004";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.JoinSecurityDomainsRequest> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.JoinSecurityDomainsRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.JoinSecurityDomainsRequest>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.JoinSecurityDomainsRequest)
  private static final org.chromium.components.sync.protocol.JoinSecurityDomainsRequest DEFAULT_INSTANCE;
  static {
    JoinSecurityDomainsRequest defaultInstance = new JoinSecurityDomainsRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      JoinSecurityDomainsRequest.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.JoinSecurityDomainsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<JoinSecurityDomainsRequest> PARSER;

  public static com.google.protobuf.Parser<JoinSecurityDomainsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
