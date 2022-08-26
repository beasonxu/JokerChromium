// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.ScriptPreconditionProto}
 */
public  final class ScriptPreconditionProto extends
    com.google.protobuf.GeneratedMessageLite<
        ScriptPreconditionProto, ScriptPreconditionProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ScriptPreconditionProto)
    ScriptPreconditionProtoOrBuilder {
  private ScriptPreconditionProto() {
    pathPattern_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    domain_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    scriptParameterMatch_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int PATH_PATTERN_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.ProtobufList<java.lang.String> pathPattern_;
  /**
   * <pre>
   * Pattern of the path parts of the URL, including query and '#''.
   * </pre>
   *
   * <code>repeated string path_pattern = 5;</code>
   * @return A list containing the pathPattern.
   */
  @java.lang.Override
  public java.util.List<java.lang.String> getPathPatternList() {
    return pathPattern_;
  }
  /**
   * <pre>
   * Pattern of the path parts of the URL, including query and '#''.
   * </pre>
   *
   * <code>repeated string path_pattern = 5;</code>
   * @return The count of pathPattern.
   */
  @java.lang.Override
  public int getPathPatternCount() {
    return pathPattern_.size();
  }
  /**
   * <pre>
   * Pattern of the path parts of the URL, including query and '#''.
   * </pre>
   *
   * <code>repeated string path_pattern = 5;</code>
   * @param index The index of the element to return.
   * @return The pathPattern at the given index.
   */
  @java.lang.Override
  public java.lang.String getPathPattern(int index) {
    return pathPattern_.get(index);
  }
  /**
   * <pre>
   * Pattern of the path parts of the URL, including query and '#''.
   * </pre>
   *
   * <code>repeated string path_pattern = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the pathPattern at the given index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathPatternBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        pathPattern_.get(index));
  }
  private void ensurePathPatternIsMutable() {
    com.google.protobuf.Internal.ProtobufList<java.lang.String> tmp =
        pathPattern_;  if (!tmp.isModifiable()) {
      pathPattern_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <pre>
   * Pattern of the path parts of the URL, including query and '#''.
   * </pre>
   *
   * <code>repeated string path_pattern = 5;</code>
   * @param index The index to set the value at.
   * @param value The pathPattern to set.
   */
  private void setPathPattern(
      int index, java.lang.String value) {
    value.getClass();
  ensurePathPatternIsMutable();
    pathPattern_.set(index, value);
  }
  /**
   * <pre>
   * Pattern of the path parts of the URL, including query and '#''.
   * </pre>
   *
   * <code>repeated string path_pattern = 5;</code>
   * @param value The pathPattern to add.
   */
  private void addPathPattern(
      java.lang.String value) {
    value.getClass();
  ensurePathPatternIsMutable();
    pathPattern_.add(value);
  }
  /**
   * <pre>
   * Pattern of the path parts of the URL, including query and '#''.
   * </pre>
   *
   * <code>repeated string path_pattern = 5;</code>
   * @param values The pathPattern to add.
   */
  private void addAllPathPattern(
      java.lang.Iterable<java.lang.String> values) {
    ensurePathPatternIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, pathPattern_);
  }
  /**
   * <pre>
   * Pattern of the path parts of the URL, including query and '#''.
   * </pre>
   *
   * <code>repeated string path_pattern = 5;</code>
   */
  private void clearPathPattern() {
    pathPattern_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * Pattern of the path parts of the URL, including query and '#''.
   * </pre>
   *
   * <code>repeated string path_pattern = 5;</code>
   * @param value The bytes of the pathPattern to add.
   */
  private void addPathPatternBytes(
      com.google.protobuf.ByteString value) {
    ensurePathPatternIsMutable();
    pathPattern_.add(value.toStringUtf8());
  }

  public static final int DOMAIN_FIELD_NUMBER = 6;
  private com.google.protobuf.Internal.ProtobufList<java.lang.String> domain_;
  /**
   * <pre>
   * Domain (exact match) excluding the last '/' character.
   * </pre>
   *
   * <code>repeated string domain = 6;</code>
   * @return A list containing the domain.
   */
  @java.lang.Override
  public java.util.List<java.lang.String> getDomainList() {
    return domain_;
  }
  /**
   * <pre>
   * Domain (exact match) excluding the last '/' character.
   * </pre>
   *
   * <code>repeated string domain = 6;</code>
   * @return The count of domain.
   */
  @java.lang.Override
  public int getDomainCount() {
    return domain_.size();
  }
  /**
   * <pre>
   * Domain (exact match) excluding the last '/' character.
   * </pre>
   *
   * <code>repeated string domain = 6;</code>
   * @param index The index of the element to return.
   * @return The domain at the given index.
   */
  @java.lang.Override
  public java.lang.String getDomain(int index) {
    return domain_.get(index);
  }
  /**
   * <pre>
   * Domain (exact match) excluding the last '/' character.
   * </pre>
   *
   * <code>repeated string domain = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the domain at the given index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        domain_.get(index));
  }
  private void ensureDomainIsMutable() {
    com.google.protobuf.Internal.ProtobufList<java.lang.String> tmp =
        domain_;  if (!tmp.isModifiable()) {
      domain_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <pre>
   * Domain (exact match) excluding the last '/' character.
   * </pre>
   *
   * <code>repeated string domain = 6;</code>
   * @param index The index to set the value at.
   * @param value The domain to set.
   */
  private void setDomain(
      int index, java.lang.String value) {
    value.getClass();
  ensureDomainIsMutable();
    domain_.set(index, value);
  }
  /**
   * <pre>
   * Domain (exact match) excluding the last '/' character.
   * </pre>
   *
   * <code>repeated string domain = 6;</code>
   * @param value The domain to add.
   */
  private void addDomain(
      java.lang.String value) {
    value.getClass();
  ensureDomainIsMutable();
    domain_.add(value);
  }
  /**
   * <pre>
   * Domain (exact match) excluding the last '/' character.
   * </pre>
   *
   * <code>repeated string domain = 6;</code>
   * @param values The domain to add.
   */
  private void addAllDomain(
      java.lang.Iterable<java.lang.String> values) {
    ensureDomainIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, domain_);
  }
  /**
   * <pre>
   * Domain (exact match) excluding the last '/' character.
   * </pre>
   *
   * <code>repeated string domain = 6;</code>
   */
  private void clearDomain() {
    domain_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * Domain (exact match) excluding the last '/' character.
   * </pre>
   *
   * <code>repeated string domain = 6;</code>
   * @param value The bytes of the domain to add.
   */
  private void addDomainBytes(
      com.google.protobuf.ByteString value) {
    ensureDomainIsMutable();
    domain_.add(value.toStringUtf8());
  }

  public static final int SCRIPT_PARAMETER_MATCH_FIELD_NUMBER = 7;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto> scriptParameterMatch_;
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto> getScriptParameterMatchList() {
    return scriptParameterMatch_;
  }
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  public java.util.List<? extends org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProtoOrBuilder> 
      getScriptParameterMatchOrBuilderList() {
    return scriptParameterMatch_;
  }
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  @java.lang.Override
  public int getScriptParameterMatchCount() {
    return scriptParameterMatch_.size();
  }
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto getScriptParameterMatch(int index) {
    return scriptParameterMatch_.get(index);
  }
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProtoOrBuilder getScriptParameterMatchOrBuilder(
      int index) {
    return scriptParameterMatch_.get(index);
  }
  private void ensureScriptParameterMatchIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto> tmp = scriptParameterMatch_;
    if (!tmp.isModifiable()) {
      scriptParameterMatch_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  private void setScriptParameterMatch(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto value) {
    value.getClass();
  ensureScriptParameterMatchIsMutable();
    scriptParameterMatch_.set(index, value);
  }
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  private void addScriptParameterMatch(org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto value) {
    value.getClass();
  ensureScriptParameterMatchIsMutable();
    scriptParameterMatch_.add(value);
  }
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  private void addScriptParameterMatch(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto value) {
    value.getClass();
  ensureScriptParameterMatchIsMutable();
    scriptParameterMatch_.add(index, value);
  }
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  private void addAllScriptParameterMatch(
      java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto> values) {
    ensureScriptParameterMatchIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, scriptParameterMatch_);
  }
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  private void clearScriptParameterMatch() {
    scriptParameterMatch_ = emptyProtobufList();
  }
  /**
   * <pre>
   * Combined with AND: all matches must be true for precondition to hold.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
   */
  private void removeScriptParameterMatch(int index) {
    ensureScriptParameterMatchIsMutable();
    scriptParameterMatch_.remove(index);
  }

  public static final int ELEMENT_CONDITION_FIELD_NUMBER = 10;
  private org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto elementCondition_;
  /**
   * <pre>
   * Script can only run if the given condition match.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
   */
  @java.lang.Override
  public boolean hasElementCondition() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Script can only run if the given condition match.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto getElementCondition() {
    return elementCondition_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto.getDefaultInstance() : elementCondition_;
  }
  /**
   * <pre>
   * Script can only run if the given condition match.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
   */
  private void setElementCondition(org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto value) {
    value.getClass();
  elementCondition_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Script can only run if the given condition match.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeElementCondition(org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto value) {
    value.getClass();
  if (elementCondition_ != null &&
        elementCondition_ != org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto.getDefaultInstance()) {
      elementCondition_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto.newBuilder(elementCondition_).mergeFrom(value).buildPartial();
    } else {
      elementCondition_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Script can only run if the given condition match.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
   */
  private void clearElementCondition() {  elementCondition_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.ScriptPreconditionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ScriptPreconditionProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Pattern of the path parts of the URL, including query and '#''.
     * </pre>
     *
     * <code>repeated string path_pattern = 5;</code>
     * @return A list containing the pathPattern.
     */
    @java.lang.Override
    public java.util.List<java.lang.String>
        getPathPatternList() {
      return java.util.Collections.unmodifiableList(
          instance.getPathPatternList());
    }
    /**
     * <pre>
     * Pattern of the path parts of the URL, including query and '#''.
     * </pre>
     *
     * <code>repeated string path_pattern = 5;</code>
     * @return The count of pathPattern.
     */
    @java.lang.Override
    public int getPathPatternCount() {
      return instance.getPathPatternCount();
    }
    /**
     * <pre>
     * Pattern of the path parts of the URL, including query and '#''.
     * </pre>
     *
     * <code>repeated string path_pattern = 5;</code>
     * @param index The index of the element to return.
     * @return The pathPattern at the given index.
     */
    @java.lang.Override
    public java.lang.String getPathPattern(int index) {
      return instance.getPathPattern(index);
    }
    /**
     * <pre>
     * Pattern of the path parts of the URL, including query and '#''.
     * </pre>
     *
     * <code>repeated string path_pattern = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the pathPattern at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPathPatternBytes(int index) {
      return instance.getPathPatternBytes(index);
    }
    /**
     * <pre>
     * Pattern of the path parts of the URL, including query and '#''.
     * </pre>
     *
     * <code>repeated string path_pattern = 5;</code>
     * @param index The index to set the value at.
     * @param value The pathPattern to set.
     * @return This builder for chaining.
     */
    public Builder setPathPattern(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setPathPattern(index, value);
      return this;
    }
    /**
     * <pre>
     * Pattern of the path parts of the URL, including query and '#''.
     * </pre>
     *
     * <code>repeated string path_pattern = 5;</code>
     * @param value The pathPattern to add.
     * @return This builder for chaining.
     */
    public Builder addPathPattern(
        java.lang.String value) {
      copyOnWrite();
      instance.addPathPattern(value);
      return this;
    }
    /**
     * <pre>
     * Pattern of the path parts of the URL, including query and '#''.
     * </pre>
     *
     * <code>repeated string path_pattern = 5;</code>
     * @param values The pathPattern to add.
     * @return This builder for chaining.
     */
    public Builder addAllPathPattern(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllPathPattern(values);
      return this;
    }
    /**
     * <pre>
     * Pattern of the path parts of the URL, including query and '#''.
     * </pre>
     *
     * <code>repeated string path_pattern = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPathPattern() {
      copyOnWrite();
      instance.clearPathPattern();
      return this;
    }
    /**
     * <pre>
     * Pattern of the path parts of the URL, including query and '#''.
     * </pre>
     *
     * <code>repeated string path_pattern = 5;</code>
     * @param value The bytes of the pathPattern to add.
     * @return This builder for chaining.
     */
    public Builder addPathPatternBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addPathPatternBytes(value);
      return this;
    }

    /**
     * <pre>
     * Domain (exact match) excluding the last '/' character.
     * </pre>
     *
     * <code>repeated string domain = 6;</code>
     * @return A list containing the domain.
     */
    @java.lang.Override
    public java.util.List<java.lang.String>
        getDomainList() {
      return java.util.Collections.unmodifiableList(
          instance.getDomainList());
    }
    /**
     * <pre>
     * Domain (exact match) excluding the last '/' character.
     * </pre>
     *
     * <code>repeated string domain = 6;</code>
     * @return The count of domain.
     */
    @java.lang.Override
    public int getDomainCount() {
      return instance.getDomainCount();
    }
    /**
     * <pre>
     * Domain (exact match) excluding the last '/' character.
     * </pre>
     *
     * <code>repeated string domain = 6;</code>
     * @param index The index of the element to return.
     * @return The domain at the given index.
     */
    @java.lang.Override
    public java.lang.String getDomain(int index) {
      return instance.getDomain(index);
    }
    /**
     * <pre>
     * Domain (exact match) excluding the last '/' character.
     * </pre>
     *
     * <code>repeated string domain = 6;</code>
     * @param index The index of the value to return.
     * @return The bytes of the domain at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDomainBytes(int index) {
      return instance.getDomainBytes(index);
    }
    /**
     * <pre>
     * Domain (exact match) excluding the last '/' character.
     * </pre>
     *
     * <code>repeated string domain = 6;</code>
     * @param index The index to set the value at.
     * @param value The domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomain(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setDomain(index, value);
      return this;
    }
    /**
     * <pre>
     * Domain (exact match) excluding the last '/' character.
     * </pre>
     *
     * <code>repeated string domain = 6;</code>
     * @param value The domain to add.
     * @return This builder for chaining.
     */
    public Builder addDomain(
        java.lang.String value) {
      copyOnWrite();
      instance.addDomain(value);
      return this;
    }
    /**
     * <pre>
     * Domain (exact match) excluding the last '/' character.
     * </pre>
     *
     * <code>repeated string domain = 6;</code>
     * @param values The domain to add.
     * @return This builder for chaining.
     */
    public Builder addAllDomain(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllDomain(values);
      return this;
    }
    /**
     * <pre>
     * Domain (exact match) excluding the last '/' character.
     * </pre>
     *
     * <code>repeated string domain = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomain() {
      copyOnWrite();
      instance.clearDomain();
      return this;
    }
    /**
     * <pre>
     * Domain (exact match) excluding the last '/' character.
     * </pre>
     *
     * <code>repeated string domain = 6;</code>
     * @param value The bytes of the domain to add.
     * @return This builder for chaining.
     */
    public Builder addDomainBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addDomainBytes(value);
      return this;
    }

    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto> getScriptParameterMatchList() {
      return java.util.Collections.unmodifiableList(
          instance.getScriptParameterMatchList());
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    @java.lang.Override
    public int getScriptParameterMatchCount() {
      return instance.getScriptParameterMatchCount();
    }/**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto getScriptParameterMatch(int index) {
      return instance.getScriptParameterMatch(index);
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    public Builder setScriptParameterMatch(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto value) {
      copyOnWrite();
      instance.setScriptParameterMatch(index, value);
      return this;
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    public Builder setScriptParameterMatch(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto.Builder builderForValue) {
      copyOnWrite();
      instance.setScriptParameterMatch(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    public Builder addScriptParameterMatch(org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto value) {
      copyOnWrite();
      instance.addScriptParameterMatch(value);
      return this;
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    public Builder addScriptParameterMatch(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto value) {
      copyOnWrite();
      instance.addScriptParameterMatch(index, value);
      return this;
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    public Builder addScriptParameterMatch(
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto.Builder builderForValue) {
      copyOnWrite();
      instance.addScriptParameterMatch(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    public Builder addScriptParameterMatch(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto.Builder builderForValue) {
      copyOnWrite();
      instance.addScriptParameterMatch(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    public Builder addAllScriptParameterMatch(
        java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto> values) {
      copyOnWrite();
      instance.addAllScriptParameterMatch(values);
      return this;
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    public Builder clearScriptParameterMatch() {
      copyOnWrite();
      instance.clearScriptParameterMatch();
      return this;
    }
    /**
     * <pre>
     * Combined with AND: all matches must be true for precondition to hold.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterMatchProto script_parameter_match = 7;</code>
     */
    public Builder removeScriptParameterMatch(int index) {
      copyOnWrite();
      instance.removeScriptParameterMatch(index);
      return this;
    }

    /**
     * <pre>
     * Script can only run if the given condition match.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
     */
    @java.lang.Override
    public boolean hasElementCondition() {
      return instance.hasElementCondition();
    }
    /**
     * <pre>
     * Script can only run if the given condition match.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto getElementCondition() {
      return instance.getElementCondition();
    }
    /**
     * <pre>
     * Script can only run if the given condition match.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
     */
    public Builder setElementCondition(org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto value) {
      copyOnWrite();
      instance.setElementCondition(value);
      return this;
      }
    /**
     * <pre>
     * Script can only run if the given condition match.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
     */
    public Builder setElementCondition(
        org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setElementCondition(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Script can only run if the given condition match.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
     */
    public Builder mergeElementCondition(org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto value) {
      copyOnWrite();
      instance.mergeElementCondition(value);
      return this;
    }
    /**
     * <pre>
     * Script can only run if the given condition match.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto element_condition = 10;</code>
     */
    public Builder clearElementCondition() {  copyOnWrite();
      instance.clearElementCondition();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ScriptPreconditionProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "pathPattern_",
            "domain_",
            "scriptParameterMatch_",
            org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterMatchProto.class,
            "elementCondition_",
          };
          java.lang.String info =
              "\u0001\u0004\u0000\u0001\u0005\n\u0004\u0000\u0003\u0000\u0005\u001a\u0006\u001a" +
              "\u0007\u001b\n\u1009\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ScriptPreconditionProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto DEFAULT_INSTANCE;
  static {
    ScriptPreconditionProto defaultInstance = new ScriptPreconditionProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ScriptPreconditionProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptPreconditionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ScriptPreconditionProto> PARSER;

  public static com.google.protobuf.Parser<ScriptPreconditionProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
