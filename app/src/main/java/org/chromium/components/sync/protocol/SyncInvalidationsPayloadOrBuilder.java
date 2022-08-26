// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/sync_invalidations_payload.proto

package org.chromium.components.sync.protocol;

public interface SyncInvalidationsPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.SyncInvalidationsPayload)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * This field contains information about each data type which needs to be
   * updated.
   * </pre>
   *
   * <code>repeated .sync_pb.SyncInvalidationsPayload.DataTypeInvalidation data_type_invalidations = 1;</code>
   */
  java.util.List<org.chromium.components.sync.protocol.SyncInvalidationsPayload.DataTypeInvalidation> 
      getDataTypeInvalidationsList();
  /**
   * <pre>
   * This field contains information about each data type which needs to be
   * updated.
   * </pre>
   *
   * <code>repeated .sync_pb.SyncInvalidationsPayload.DataTypeInvalidation data_type_invalidations = 1;</code>
   */
  org.chromium.components.sync.protocol.SyncInvalidationsPayload.DataTypeInvalidation getDataTypeInvalidations(int index);
  /**
   * <pre>
   * This field contains information about each data type which needs to be
   * updated.
   * </pre>
   *
   * <code>repeated .sync_pb.SyncInvalidationsPayload.DataTypeInvalidation data_type_invalidations = 1;</code>
   */
  int getDataTypeInvalidationsCount();

  /**
   * <pre>
   * Opaque field, which has to be provided as part of resulting GetUpdates
   * back to the server.
   * </pre>
   *
   * <code>optional bytes hint = 2;</code>
   * @return Whether the hint field is set.
   */
  boolean hasHint();
  /**
   * <pre>
   * Opaque field, which has to be provided as part of resulting GetUpdates
   * back to the server.
   * </pre>
   *
   * <code>optional bytes hint = 2;</code>
   * @return The hint.
   */
  com.google.protobuf.ByteString getHint();

  /**
   * <pre>
   * Version of invalidation, used to order incoming invalidations.
   * </pre>
   *
   * <code>optional int64 version = 3;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Version of invalidation, used to order incoming invalidations.
   * </pre>
   *
   * <code>optional int64 version = 3;</code>
   * @return The version.
   */
  long getVersion();
}
