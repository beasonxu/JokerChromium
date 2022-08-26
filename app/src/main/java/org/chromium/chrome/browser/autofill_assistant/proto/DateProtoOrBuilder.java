// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface DateProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.DateProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional int64 year = 1;</code>
   * @return Whether the year field is set.
   */
  boolean hasYear();
  /**
   * <code>optional int64 year = 1;</code>
   * @return The year.
   */
  long getYear();

  /**
   * <pre>
   * Month of the year in the range [1-12].
   * </pre>
   *
   * <code>optional int32 month = 2;</code>
   * @return Whether the month field is set.
   */
  boolean hasMonth();
  /**
   * <pre>
   * Month of the year in the range [1-12].
   * </pre>
   *
   * <code>optional int32 month = 2;</code>
   * @return The month.
   */
  int getMonth();

  /**
   * <pre>
   * Day of the month in the range [1-31].
   * </pre>
   *
   * <code>optional int32 day = 3;</code>
   * @return Whether the day field is set.
   */
  boolean hasDay();
  /**
   * <pre>
   * Day of the month in the range [1-31].
   * </pre>
   *
   * <code>optional int32 day = 3;</code>
   * @return The day.
   */
  int getDay();
}
