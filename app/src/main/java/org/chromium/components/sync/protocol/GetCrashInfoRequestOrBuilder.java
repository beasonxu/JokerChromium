// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/sync.proto

package org.chromium.components.sync.protocol;

public interface GetCrashInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.GetCrashInfoRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Id of the uploaded crash.
   * </pre>
   *
   * <code>optional string crash_id = 1;</code>
   * @return Whether the crashId field is set.
   */
  boolean hasCrashId();
  /**
   * <pre>
   * Id of the uploaded crash.
   * </pre>
   *
   * <code>optional string crash_id = 1;</code>
   * @return The crashId.
   */
  java.lang.String getCrashId();
  /**
   * <pre>
   * Id of the uploaded crash.
   * </pre>
   *
   * <code>optional string crash_id = 1;</code>
   * @return The bytes for crashId.
   */
  com.google.protobuf.ByteString
      getCrashIdBytes();

  /**
   * <pre>
   * Time that the crash occurred.
   * </pre>
   *
   * <code>optional int64 crash_time_millis = 2;</code>
   * @return Whether the crashTimeMillis field is set.
   */
  boolean hasCrashTimeMillis();
  /**
   * <pre>
   * Time that the crash occurred.
   * </pre>
   *
   * <code>optional int64 crash_time_millis = 2;</code>
   * @return The crashTimeMillis.
   */
  long getCrashTimeMillis();
}