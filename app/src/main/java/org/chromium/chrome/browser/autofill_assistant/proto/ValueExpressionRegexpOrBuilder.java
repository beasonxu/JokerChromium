// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/action_value.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ValueExpressionRegexpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ValueExpressionRegexp)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .autofill_assistant.ValueExpression value_expression = 1;</code>
   * @return Whether the valueExpression field is set.
   */
  boolean hasValueExpression();
  /**
   * <code>optional .autofill_assistant.ValueExpression value_expression = 1;</code>
   * @return The valueExpression.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ValueExpression getValueExpression();

  /**
   * <pre>
   * If true, the |value_expression| will be checked case sensitively.
   * Default is case insensitive.
   * </pre>
   *
   * <code>optional bool case_sensitive = 4;</code>
   * @return Whether the caseSensitive field is set.
   */
  boolean hasCaseSensitive();
  /**
   * <pre>
   * If true, the |value_expression| will be checked case sensitively.
   * Default is case insensitive.
   * </pre>
   *
   * <code>optional bool case_sensitive = 4;</code>
   * @return The caseSensitive.
   */
  boolean getCaseSensitive();
}
