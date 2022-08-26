// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/client_debug_info.proto

package org.chromium.components.sync.protocol;

public interface SyncCycleCompletedEventInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.SyncCycleCompletedEventInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * These new conflict counters replace the ones above.
   * TODO(crbug.com/1315573): Deprecated in M103.
   * </pre>
   *
   * <code>optional int32 num_encryption_conflicts = 4 [deprecated = true];</code>
   * @return Whether the numEncryptionConflicts field is set.
   */
  @java.lang.Deprecated boolean hasNumEncryptionConflicts();
  /**
   * <pre>
   * These new conflict counters replace the ones above.
   * TODO(crbug.com/1315573): Deprecated in M103.
   * </pre>
   *
   * <code>optional int32 num_encryption_conflicts = 4 [deprecated = true];</code>
   * @return The numEncryptionConflicts.
   */
  @java.lang.Deprecated int getNumEncryptionConflicts();

  /**
   * <code>optional int32 num_hierarchy_conflicts = 5 [deprecated = true];</code>
   * @return Whether the numHierarchyConflicts field is set.
   */
  @java.lang.Deprecated boolean hasNumHierarchyConflicts();
  /**
   * <code>optional int32 num_hierarchy_conflicts = 5 [deprecated = true];</code>
   * @return The numHierarchyConflicts.
   */
  @java.lang.Deprecated int getNumHierarchyConflicts();

  /**
   * <pre>
   * No longer sent since M24.
   * </pre>
   *
   * <code>optional int32 num_simple_conflicts = 6;</code>
   * @return Whether the numSimpleConflicts field is set.
   */
  boolean hasNumSimpleConflicts();
  /**
   * <pre>
   * No longer sent since M24.
   * </pre>
   *
   * <code>optional int32 num_simple_conflicts = 6;</code>
   * @return The numSimpleConflicts.
   */
  int getNumSimpleConflicts();

  /**
   * <code>optional int32 num_server_conflicts = 7;</code>
   * @return Whether the numServerConflicts field is set.
   */
  boolean hasNumServerConflicts();
  /**
   * <code>optional int32 num_server_conflicts = 7;</code>
   * @return The numServerConflicts.
   */
  int getNumServerConflicts();

  /**
   * <pre>
   * Counts to track the effective usefulness of our GetUpdate requests.
   * </pre>
   *
   * <code>optional int32 num_updates_downloaded = 8;</code>
   * @return Whether the numUpdatesDownloaded field is set.
   */
  boolean hasNumUpdatesDownloaded();
  /**
   * <pre>
   * Counts to track the effective usefulness of our GetUpdate requests.
   * </pre>
   *
   * <code>optional int32 num_updates_downloaded = 8;</code>
   * @return The numUpdatesDownloaded.
   */
  int getNumUpdatesDownloaded();

  /**
   * <pre>
   * TODO(crbug.com/1315573): Deprecated in M103.
   * </pre>
   *
   * <code>optional int32 num_reflected_updates_downloaded = 9 [deprecated = true];</code>
   * @return Whether the numReflectedUpdatesDownloaded field is set.
   */
  @java.lang.Deprecated boolean hasNumReflectedUpdatesDownloaded();
  /**
   * <pre>
   * TODO(crbug.com/1315573): Deprecated in M103.
   * </pre>
   *
   * <code>optional int32 num_reflected_updates_downloaded = 9 [deprecated = true];</code>
   * @return The numReflectedUpdatesDownloaded.
   */
  @java.lang.Deprecated int getNumReflectedUpdatesDownloaded();

  /**
   * <pre>
   * |caller_info| was mostly replaced by |get_updates_origin|; now it only
   * contains the |notifications_enabled| flag.
   * </pre>
   *
   * <code>optional .sync_pb.GetUpdatesCallerInfo caller_info = 10;</code>
   * @return Whether the callerInfo field is set.
   */
  boolean hasCallerInfo();
  /**
   * <pre>
   * |caller_info| was mostly replaced by |get_updates_origin|; now it only
   * contains the |notifications_enabled| flag.
   * </pre>
   *
   * <code>optional .sync_pb.GetUpdatesCallerInfo caller_info = 10;</code>
   * @return The callerInfo.
   */
  org.chromium.components.sync.protocol.GetUpdatesCallerInfo getCallerInfo();

  /**
   * <code>optional .sync_pb.SyncEnums.GetUpdatesOrigin get_updates_origin = 12;</code>
   * @return Whether the getUpdatesOrigin field is set.
   */
  boolean hasGetUpdatesOrigin();
  /**
   * <code>optional .sync_pb.SyncEnums.GetUpdatesOrigin get_updates_origin = 12;</code>
   * @return The getUpdatesOrigin.
   */
  org.chromium.components.sync.protocol.SyncEnums.GetUpdatesOrigin getGetUpdatesOrigin();
}
