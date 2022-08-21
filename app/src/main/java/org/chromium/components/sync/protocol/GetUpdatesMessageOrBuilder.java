// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/sync.proto

package org.chromium.components.sync.protocol;

public interface GetUpdatesMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.GetUpdatesMessage)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Indicates the reason for the GetUpdatesMessage.
   * This was *mostly* deprecated in M29.  GetUpdatesOrigin is the new way to
   * encode the reason for the GetUpdates request, but some parts of the server
   * still rely on this field.  It also still contains the
   * "notifications_enabled" flag which needs to be moved elsewhere before this
   * can be fully removed. See https://crbug.com/510165.
   * </pre>
   *
   * <code>optional .sync_pb.GetUpdatesCallerInfo caller_info = 2;</code>
   * @return Whether the callerInfo field is set.
   */
  boolean hasCallerInfo();
  /**
   * <pre>
   * Indicates the reason for the GetUpdatesMessage.
   * This was *mostly* deprecated in M29.  GetUpdatesOrigin is the new way to
   * encode the reason for the GetUpdates request, but some parts of the server
   * still rely on this field.  It also still contains the
   * "notifications_enabled" flag which needs to be moved elsewhere before this
   * can be fully removed. See https://crbug.com/510165.
   * </pre>
   *
   * <code>optional .sync_pb.GetUpdatesCallerInfo caller_info = 2;</code>
   * @return The callerInfo.
   */
  org.chromium.components.sync.protocol.GetUpdatesCallerInfo getCallerInfo();

  /**
   * <pre>
   * Indicates whether related folders should be fetched.
   * </pre>
   *
   * <code>optional bool fetch_folders = 3 [default = true];</code>
   * @return Whether the fetchFolders field is set.
   */
  boolean hasFetchFolders();
  /**
   * <pre>
   * Indicates whether related folders should be fetched.
   * </pre>
   *
   * <code>optional bool fetch_folders = 3 [default = true];</code>
   * @return The fetchFolders.
   */
  boolean getFetchFolders();

  /**
   * <pre>
   * Per-datatype progress marker.
   * With the exception of certain configuration or initial sync requests, the
   * client should include one instance of this field for each enabled data
   * type.
   * </pre>
   *
   * <code>repeated .sync_pb.DataTypeProgressMarker from_progress_marker = 6;</code>
   */
  java.util.List<org.chromium.components.sync.protocol.DataTypeProgressMarker> 
      getFromProgressMarkerList();
  /**
   * <pre>
   * Per-datatype progress marker.
   * With the exception of certain configuration or initial sync requests, the
   * client should include one instance of this field for each enabled data
   * type.
   * </pre>
   *
   * <code>repeated .sync_pb.DataTypeProgressMarker from_progress_marker = 6;</code>
   */
  org.chromium.components.sync.protocol.DataTypeProgressMarker getFromProgressMarker(int index);
  /**
   * <pre>
   * Per-datatype progress marker.
   * With the exception of certain configuration or initial sync requests, the
   * client should include one instance of this field for each enabled data
   * type.
   * </pre>
   *
   * <code>repeated .sync_pb.DataTypeProgressMarker from_progress_marker = 6;</code>
   */
  int getFromProgressMarkerCount();

  /**
   * <pre>
   * Indicates whether the response should be sent in chunks.  This may be
   * needed for devices with limited memory resources.  If true, the response
   * will include one or more ClientToServerResponses, with the first one
   * containing GetUpdatesMetadataResponse, and the remaining ones, if any,
   * containing GetUpdatesStreamingResponse.  These ClientToServerResponses are
   * delimited by a length prefix, which is encoded as a varint.
   * </pre>
   *
   * <code>optional bool streaming = 7 [default = false];</code>
   * @return Whether the streaming field is set.
   */
  boolean hasStreaming();
  /**
   * <pre>
   * Indicates whether the response should be sent in chunks.  This may be
   * needed for devices with limited memory resources.  If true, the response
   * will include one or more ClientToServerResponses, with the first one
   * containing GetUpdatesMetadataResponse, and the remaining ones, if any,
   * containing GetUpdatesStreamingResponse.  These ClientToServerResponses are
   * delimited by a length prefix, which is encoded as a varint.
   * </pre>
   *
   * <code>optional bool streaming = 7 [default = false];</code>
   * @return The streaming.
   */
  boolean getStreaming();

  /**
   * <pre>
   * Whether the client needs the server to provide an encryption key for this
   * account.
   * Note: this should typically only be set on the first GetUpdates a client
   * requests. Clients are expected to persist the encryption key from then on.
   * The allowed frequency for requesting encryption keys is much lower than
   * other datatypes, so repeated usage will likely result in throttling.
   * </pre>
   *
   * <code>optional bool need_encryption_key = 8 [default = false];</code>
   * @return Whether the needEncryptionKey field is set.
   */
  boolean hasNeedEncryptionKey();
  /**
   * <pre>
   * Whether the client needs the server to provide an encryption key for this
   * account.
   * Note: this should typically only be set on the first GetUpdates a client
   * requests. Clients are expected to persist the encryption key from then on.
   * The allowed frequency for requesting encryption keys is much lower than
   * other datatypes, so repeated usage will likely result in throttling.
   * </pre>
   *
   * <code>optional bool need_encryption_key = 8 [default = false];</code>
   * @return The needEncryptionKey.
   */
  boolean getNeedEncryptionKey();

  /**
   * <pre>
   * Whether to create the mobile bookmarks folder if it's not
   * already created.  Set to true by all modern clients.
   * </pre>
   *
   * <code>optional bool create_mobile_bookmarks_folder = 1000 [default = false, deprecated = true];</code>
   * @return Whether the createMobileBookmarksFolder field is set.
   */
  @java.lang.Deprecated boolean hasCreateMobileBookmarksFolder();
  /**
   * <pre>
   * Whether to create the mobile bookmarks folder if it's not
   * already created.  Set to true by all modern clients.
   * </pre>
   *
   * <code>optional bool create_mobile_bookmarks_folder = 1000 [default = false, deprecated = true];</code>
   * @return The createMobileBookmarksFolder.
   */
  @java.lang.Deprecated boolean getCreateMobileBookmarksFolder();

  /**
   * <pre>
   * This value is an updated version of the GetUpdatesCallerInfo's
   * GetUpdatesSource.  It describes the reason for the GetUpdate request.
   * Introduced in M29.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.GetUpdatesOrigin get_updates_origin = 9;</code>
   * @return Whether the getUpdatesOrigin field is set.
   */
  boolean hasGetUpdatesOrigin();
  /**
   * <pre>
   * This value is an updated version of the GetUpdatesCallerInfo's
   * GetUpdatesSource.  It describes the reason for the GetUpdate request.
   * Introduced in M29.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.GetUpdatesOrigin get_updates_origin = 9;</code>
   * @return The getUpdatesOrigin.
   */
  org.chromium.components.sync.protocol.SyncEnums.GetUpdatesOrigin getGetUpdatesOrigin();

  /**
   * <pre>
   * Whether this GU also serves as a retry GU. Any GU that happens after
   * retry timer timeout is a retry GU effectively.
   * </pre>
   *
   * <code>optional bool is_retry = 10 [default = false];</code>
   * @return Whether the isRetry field is set.
   */
  boolean hasIsRetry();
  /**
   * <pre>
   * Whether this GU also serves as a retry GU. Any GU that happens after
   * retry timer timeout is a retry GU effectively.
   * </pre>
   *
   * <code>optional bool is_retry = 10 [default = false];</code>
   * @return The isRetry.
   */
  boolean getIsRetry();

  /**
   * <pre>
   * Set of optional per-client datatype contexts.
   * </pre>
   *
   * <code>repeated .sync_pb.DataTypeContext client_contexts = 11;</code>
   */
  java.util.List<org.chromium.components.sync.protocol.DataTypeContext> 
      getClientContextsList();
  /**
   * <pre>
   * Set of optional per-client datatype contexts.
   * </pre>
   *
   * <code>repeated .sync_pb.DataTypeContext client_contexts = 11;</code>
   */
  org.chromium.components.sync.protocol.DataTypeContext getClientContexts(int index);
  /**
   * <pre>
   * Set of optional per-client datatype contexts.
   * </pre>
   *
   * <code>repeated .sync_pb.DataTypeContext client_contexts = 11;</code>
   */
  int getClientContextsCount();
}
