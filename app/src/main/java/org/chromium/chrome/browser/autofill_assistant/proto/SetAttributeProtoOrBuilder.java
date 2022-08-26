// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface SetAttributeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.SetAttributeProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A reference to the form element whose attribute should be set.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   * @return Whether the element field is set.
   */
  boolean hasElement();
  /**
   * <pre>
   * A reference to the form element whose attribute should be set.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   * @return The element.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto getElement();

  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   * @return A list containing the attribute.
   */
  java.util.List<java.lang.String>
      getAttributeList();
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   * @return The count of attribute.
   */
  int getAttributeCount();
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   * @param index The index of the element to return.
   * @return The attribute at the given index.
   */
  java.lang.String getAttribute(int index);
  /**
   * <pre>
   * The attribute to set, e.g. ["style", "position"] to change
   * element.style.position.
   * </pre>
   *
   * <code>repeated string attribute = 2;</code>
   * @param index The index of the element to return.
   * @return The attribute at the given index.
   */
  com.google.protobuf.ByteString
      getAttributeBytes(int index);

  /**
   * <pre>
   * The value to set.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * The value to set.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * The value to set.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
