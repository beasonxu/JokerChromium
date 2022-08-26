// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Response of the list of supported scripts.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.SupportsScriptResponseProto}
 */
public  final class SupportsScriptResponseProto extends
    com.google.protobuf.GeneratedMessageLite<
        SupportsScriptResponseProto, SupportsScriptResponseProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.SupportsScriptResponseProto)
    SupportsScriptResponseProtoOrBuilder {
  private SupportsScriptResponseProto() {
    scripts_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int SCRIPTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto> scripts_;
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto> getScriptsList() {
    return scripts_;
  }
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  public java.util.List<? extends org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProtoOrBuilder> 
      getScriptsOrBuilderList() {
    return scripts_;
  }
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  @java.lang.Override
  public int getScriptsCount() {
    return scripts_.size();
  }
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto getScripts(int index) {
    return scripts_.get(index);
  }
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProtoOrBuilder getScriptsOrBuilder(
      int index) {
    return scripts_.get(index);
  }
  private void ensureScriptsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto> tmp = scripts_;
    if (!tmp.isModifiable()) {
      scripts_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  private void setScripts(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto value) {
    value.getClass();
  ensureScriptsIsMutable();
    scripts_.set(index, value);
  }
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  private void addScripts(org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto value) {
    value.getClass();
  ensureScriptsIsMutable();
    scripts_.add(value);
  }
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  private void addScripts(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto value) {
    value.getClass();
  ensureScriptsIsMutable();
    scripts_.add(index, value);
  }
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  private void addAllScripts(
      java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto> values) {
    ensureScriptsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, scripts_);
  }
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  private void clearScripts() {
    scripts_ = emptyProtobufList();
  }
  /**
   * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
   */
  private void removeScripts(int index) {
    ensureScriptsIsMutable();
    scripts_.remove(index);
  }

  public static final int SCRIPT_TIMEOUT_ERROR_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError scriptTimeoutError_;
  /**
   * <pre>
   * Defines what should happen if no scripts in [scripts] becomes runnable,
   * because of preconditions.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
   */
  @java.lang.Override
  public boolean hasScriptTimeoutError() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Defines what should happen if no scripts in [scripts] becomes runnable,
   * because of preconditions.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError getScriptTimeoutError() {
    return scriptTimeoutError_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError.getDefaultInstance() : scriptTimeoutError_;
  }
  /**
   * <pre>
   * Defines what should happen if no scripts in [scripts] becomes runnable,
   * because of preconditions.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
   */
  private void setScriptTimeoutError(org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError value) {
    value.getClass();
  scriptTimeoutError_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Defines what should happen if no scripts in [scripts] becomes runnable,
   * because of preconditions.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeScriptTimeoutError(org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError value) {
    value.getClass();
  if (scriptTimeoutError_ != null &&
        scriptTimeoutError_ != org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError.getDefaultInstance()) {
      scriptTimeoutError_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError.newBuilder(scriptTimeoutError_).mergeFrom(value).buildPartial();
    } else {
      scriptTimeoutError_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Defines what should happen if no scripts in [scripts] becomes runnable,
   * because of preconditions.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
   */
  private void clearScriptTimeoutError() {  scriptTimeoutError_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int CLIENT_SETTINGS_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto clientSettings_;
  /**
   * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
   */
  @java.lang.Override
  public boolean hasClientSettings() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto getClientSettings() {
    return clientSettings_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto.getDefaultInstance() : clientSettings_;
  }
  /**
   * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
   */
  private void setClientSettings(org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto value) {
    value.getClass();
  clientSettings_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeClientSettings(org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto value) {
    value.getClass();
  if (clientSettings_ != null &&
        clientSettings_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto.getDefaultInstance()) {
      clientSettings_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto.newBuilder(clientSettings_).mergeFrom(value).buildPartial();
    } else {
      clientSettings_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
   */
  private void clearClientSettings() {  clientSettings_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int SCRIPT_STORE_CONFIG_FIELD_NUMBER = 6;
  private org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig scriptStoreConfig_;
  /**
   * <pre>
   * The ScriptStoreConfig to use with the initial GetActions request.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
   */
  @java.lang.Override
  public boolean hasScriptStoreConfig() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The ScriptStoreConfig to use with the initial GetActions request.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig getScriptStoreConfig() {
    return scriptStoreConfig_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig.getDefaultInstance() : scriptStoreConfig_;
  }
  /**
   * <pre>
   * The ScriptStoreConfig to use with the initial GetActions request.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
   */
  private void setScriptStoreConfig(org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig value) {
    value.getClass();
  scriptStoreConfig_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * The ScriptStoreConfig to use with the initial GetActions request.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeScriptStoreConfig(org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig value) {
    value.getClass();
  if (scriptStoreConfig_ != null &&
        scriptStoreConfig_ != org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig.getDefaultInstance()) {
      scriptStoreConfig_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig.newBuilder(scriptStoreConfig_).mergeFrom(value).buildPartial();
    } else {
      scriptStoreConfig_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * The ScriptStoreConfig to use with the initial GetActions request.
   * </pre>
   *
   * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
   */
  private void clearScriptStoreConfig() {  scriptStoreConfig_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static final int SEMANTIC_SELECTOR_POLICY_FIELD_NUMBER = 7;
  private org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy semanticSelectorPolicy_;
  /**
   * <pre>
   * Semantic selector related policy configuration.
   * </pre>
   *
   * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
   */
  @java.lang.Override
  public boolean hasSemanticSelectorPolicy() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Semantic selector related policy configuration.
   * </pre>
   *
   * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy getSemanticSelectorPolicy() {
    return semanticSelectorPolicy_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy.getDefaultInstance() : semanticSelectorPolicy_;
  }
  /**
   * <pre>
   * Semantic selector related policy configuration.
   * </pre>
   *
   * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
   */
  private void setSemanticSelectorPolicy(org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy value) {
    value.getClass();
  semanticSelectorPolicy_ = value;
    bitField0_ |= 0x00000008;
    }
  /**
   * <pre>
   * Semantic selector related policy configuration.
   * </pre>
   *
   * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSemanticSelectorPolicy(org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy value) {
    value.getClass();
  if (semanticSelectorPolicy_ != null &&
        semanticSelectorPolicy_ != org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy.getDefaultInstance()) {
      semanticSelectorPolicy_ =
        org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy.newBuilder(semanticSelectorPolicy_).mergeFrom(value).buildPartial();
    } else {
      semanticSelectorPolicy_ = value;
    }
    bitField0_ |= 0x00000008;
  }
  /**
   * <pre>
   * Semantic selector related policy configuration.
   * </pre>
   *
   * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
   */
  private void clearSemanticSelectorPolicy() {  semanticSelectorPolicy_ = null;
    bitField0_ = (bitField0_ & ~0x00000008);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Response of the list of supported scripts.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.SupportsScriptResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.SupportsScriptResponseProto)
      org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto> getScriptsList() {
      return java.util.Collections.unmodifiableList(
          instance.getScriptsList());
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    @java.lang.Override
    public int getScriptsCount() {
      return instance.getScriptsCount();
    }/**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto getScripts(int index) {
      return instance.getScripts(index);
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    public Builder setScripts(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto value) {
      copyOnWrite();
      instance.setScripts(index, value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    public Builder setScripts(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto.Builder builderForValue) {
      copyOnWrite();
      instance.setScripts(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    public Builder addScripts(org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto value) {
      copyOnWrite();
      instance.addScripts(value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    public Builder addScripts(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto value) {
      copyOnWrite();
      instance.addScripts(index, value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    public Builder addScripts(
        org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto.Builder builderForValue) {
      copyOnWrite();
      instance.addScripts(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    public Builder addScripts(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto.Builder builderForValue) {
      copyOnWrite();
      instance.addScripts(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    public Builder addAllScripts(
        java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto> values) {
      copyOnWrite();
      instance.addAllScripts(values);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    public Builder clearScripts() {
      copyOnWrite();
      instance.clearScripts();
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.SupportedScriptProto scripts = 1;</code>
     */
    public Builder removeScripts(int index) {
      copyOnWrite();
      instance.removeScripts(index);
      return this;
    }

    /**
     * <pre>
     * Defines what should happen if no scripts in [scripts] becomes runnable,
     * because of preconditions.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
     */
    @java.lang.Override
    public boolean hasScriptTimeoutError() {
      return instance.hasScriptTimeoutError();
    }
    /**
     * <pre>
     * Defines what should happen if no scripts in [scripts] becomes runnable,
     * because of preconditions.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError getScriptTimeoutError() {
      return instance.getScriptTimeoutError();
    }
    /**
     * <pre>
     * Defines what should happen if no scripts in [scripts] becomes runnable,
     * because of preconditions.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
     */
    public Builder setScriptTimeoutError(org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError value) {
      copyOnWrite();
      instance.setScriptTimeoutError(value);
      return this;
      }
    /**
     * <pre>
     * Defines what should happen if no scripts in [scripts] becomes runnable,
     * because of preconditions.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
     */
    public Builder setScriptTimeoutError(
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError.Builder builderForValue) {
      copyOnWrite();
      instance.setScriptTimeoutError(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Defines what should happen if no scripts in [scripts] becomes runnable,
     * because of preconditions.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
     */
    public Builder mergeScriptTimeoutError(org.chromium.chrome.browser.autofill_assistant.proto.ScriptTimeoutError value) {
      copyOnWrite();
      instance.mergeScriptTimeoutError(value);
      return this;
    }
    /**
     * <pre>
     * Defines what should happen if no scripts in [scripts] becomes runnable,
     * because of preconditions.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptTimeoutError script_timeout_error = 2;</code>
     */
    public Builder clearScriptTimeoutError() {  copyOnWrite();
      instance.clearScriptTimeoutError();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
     */
    @java.lang.Override
    public boolean hasClientSettings() {
      return instance.hasClientSettings();
    }
    /**
     * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto getClientSettings() {
      return instance.getClientSettings();
    }
    /**
     * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
     */
    public Builder setClientSettings(org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto value) {
      copyOnWrite();
      instance.setClientSettings(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
     */
    public Builder setClientSettings(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto.Builder builderForValue) {
      copyOnWrite();
      instance.setClientSettings(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
     */
    public Builder mergeClientSettings(org.chromium.chrome.browser.autofill_assistant.proto.ClientSettingsProto value) {
      copyOnWrite();
      instance.mergeClientSettings(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientSettingsProto client_settings = 3;</code>
     */
    public Builder clearClientSettings() {  copyOnWrite();
      instance.clearClientSettings();
      return this;
    }

    /**
     * <pre>
     * The ScriptStoreConfig to use with the initial GetActions request.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
     */
    @java.lang.Override
    public boolean hasScriptStoreConfig() {
      return instance.hasScriptStoreConfig();
    }
    /**
     * <pre>
     * The ScriptStoreConfig to use with the initial GetActions request.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig getScriptStoreConfig() {
      return instance.getScriptStoreConfig();
    }
    /**
     * <pre>
     * The ScriptStoreConfig to use with the initial GetActions request.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
     */
    public Builder setScriptStoreConfig(org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig value) {
      copyOnWrite();
      instance.setScriptStoreConfig(value);
      return this;
      }
    /**
     * <pre>
     * The ScriptStoreConfig to use with the initial GetActions request.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
     */
    public Builder setScriptStoreConfig(
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig.Builder builderForValue) {
      copyOnWrite();
      instance.setScriptStoreConfig(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The ScriptStoreConfig to use with the initial GetActions request.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
     */
    public Builder mergeScriptStoreConfig(org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig value) {
      copyOnWrite();
      instance.mergeScriptStoreConfig(value);
      return this;
    }
    /**
     * <pre>
     * The ScriptStoreConfig to use with the initial GetActions request.
     * </pre>
     *
     * <code>optional .autofill_assistant.ScriptStoreConfig script_store_config = 6;</code>
     */
    public Builder clearScriptStoreConfig() {  copyOnWrite();
      instance.clearScriptStoreConfig();
      return this;
    }

    /**
     * <pre>
     * Semantic selector related policy configuration.
     * </pre>
     *
     * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
     */
    @java.lang.Override
    public boolean hasSemanticSelectorPolicy() {
      return instance.hasSemanticSelectorPolicy();
    }
    /**
     * <pre>
     * Semantic selector related policy configuration.
     * </pre>
     *
     * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy getSemanticSelectorPolicy() {
      return instance.getSemanticSelectorPolicy();
    }
    /**
     * <pre>
     * Semantic selector related policy configuration.
     * </pre>
     *
     * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
     */
    public Builder setSemanticSelectorPolicy(org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy value) {
      copyOnWrite();
      instance.setSemanticSelectorPolicy(value);
      return this;
      }
    /**
     * <pre>
     * Semantic selector related policy configuration.
     * </pre>
     *
     * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
     */
    public Builder setSemanticSelectorPolicy(
        org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy.Builder builderForValue) {
      copyOnWrite();
      instance.setSemanticSelectorPolicy(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Semantic selector related policy configuration.
     * </pre>
     *
     * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
     */
    public Builder mergeSemanticSelectorPolicy(org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy value) {
      copyOnWrite();
      instance.mergeSemanticSelectorPolicy(value);
      return this;
    }
    /**
     * <pre>
     * Semantic selector related policy configuration.
     * </pre>
     *
     * <code>optional .autofill_assistant.SemanticSelectorPolicy semantic_selector_policy = 7;</code>
     */
    public Builder clearSemanticSelectorPolicy() {  copyOnWrite();
      instance.clearSemanticSelectorPolicy();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.SupportsScriptResponseProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "scripts_",
            org.chromium.chrome.browser.autofill_assistant.proto.SupportedScriptProto.class,
            "scriptTimeoutError_",
            "clientSettings_",
            "scriptStoreConfig_",
            "semanticSelectorPolicy_",
          };
          java.lang.String info =
              "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1009" +
              "\u0000\u0003\u1009\u0001\u0006\u1009\u0002\u0007\u1009\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.SupportsScriptResponseProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto DEFAULT_INSTANCE;
  static {
    SupportsScriptResponseProto defaultInstance = new SupportsScriptResponseProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SupportsScriptResponseProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SupportsScriptResponseProto> PARSER;

  public static com.google.protobuf.Parser<SupportsScriptResponseProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
