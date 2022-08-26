// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ElementFinderInfoProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ElementFinderInfoProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Tracking ID of the |Selector|.
   * </pre>
   *
   * <code>optional int64 tracking_id = 1;</code>
   * @return Whether the trackingId field is set.
   */
  boolean hasTrackingId();
  /**
   * <pre>
   * Tracking ID of the |Selector|.
   * </pre>
   *
   * <code>optional int64 tracking_id = 1;</code>
   * @return The trackingId.
   */
  long getTrackingId();

  /**
   * <pre>
   * If the Selector fails to be resolved, this index holds the starting index
   * of filters currently being applied.
   * </pre>
   *
   * <code>optional int32 failed_filter_index_range_start = 2;</code>
   * @return Whether the failedFilterIndexRangeStart field is set.
   */
  boolean hasFailedFilterIndexRangeStart();
  /**
   * <pre>
   * If the Selector fails to be resolved, this index holds the starting index
   * of filters currently being applied.
   * </pre>
   *
   * <code>optional int32 failed_filter_index_range_start = 2;</code>
   * @return The failedFilterIndexRangeStart.
   */
  int getFailedFilterIndexRangeStart();

  /**
   * <pre>
   * If a filter failed, this index holds the filter that was supposed to be
   * applied next.
   * </pre>
   *
   * <code>optional int32 failed_filter_index_range_end = 3;</code>
   * @return Whether the failedFilterIndexRangeEnd field is set.
   */
  boolean hasFailedFilterIndexRangeEnd();
  /**
   * <pre>
   * If a filter failed, this index holds the filter that was supposed to be
   * applied next.
   * </pre>
   *
   * <code>optional int32 failed_filter_index_range_end = 3;</code>
   * @return The failedFilterIndexRangeEnd.
   */
  int getFailedFilterIndexRangeEnd();

  /**
   * <pre>
   * The original status of |ElementFinder|.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 4;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * The original status of |ElementFinder|.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto status = 4;</code>
   * @return The status.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto getStatus();

  /**
   * <pre>
   * If set, the document could not be resolved.
   * </pre>
   *
   * <code>optional bool get_document_failed = 5;</code>
   * @return Whether the getDocumentFailed field is set.
   */
  boolean hasGetDocumentFailed();
  /**
   * <pre>
   * If set, the document could not be resolved.
   * </pre>
   *
   * <code>optional bool get_document_failed = 5;</code>
   * @return The getDocumentFailed.
   */
  boolean getGetDocumentFailed();

  /**
   * <code>optional .autofill_assistant.ElementFinderInfoProto.SemanticInferenceResult semantic_inference_result = 6;</code>
   * @return Whether the semanticInferenceResult field is set.
   */
  boolean hasSemanticInferenceResult();
  /**
   * <code>optional .autofill_assistant.ElementFinderInfoProto.SemanticInferenceResult semantic_inference_result = 6;</code>
   * @return The semanticInferenceResult.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ElementFinderInfoProto.SemanticInferenceResult getSemanticInferenceResult();
}
