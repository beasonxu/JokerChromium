// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/common/proto/semantic_feature_overrides.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface SemanticSelectorPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.SemanticSelectorPolicy)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>.autofill_assistant.VersionedFeatureOverrides bag_of_words = 1;</code>
   * @return Whether the bagOfWords field is set.
   */
  boolean hasBagOfWords();
  /**
   * <code>.autofill_assistant.VersionedFeatureOverrides bag_of_words = 1;</code>
   * @return The bagOfWords.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.VersionedFeatureOverrides getBagOfWords();

  public org.chromium.chrome.browser.autofill_assistant.proto.SemanticSelectorPolicy.FeatureOverridesCase getFeatureOverridesCase();
}