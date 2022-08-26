// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface LoginDetailsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.LoginDetailsProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The title for the login selection (e.g., 'Login details for &lt;domain&gt;').
   * </pre>
   *
   * <code>optional string section_title = 1;</code>
   * @return Whether the sectionTitle field is set.
   */
  boolean hasSectionTitle();
  /**
   * <pre>
   * The title for the login selection (e.g., 'Login details for &lt;domain&gt;').
   * </pre>
   *
   * <code>optional string section_title = 1;</code>
   * @return The sectionTitle.
   */
  java.lang.String getSectionTitle();
  /**
   * <pre>
   * The title for the login selection (e.g., 'Login details for &lt;domain&gt;').
   * </pre>
   *
   * <code>optional string section_title = 1;</code>
   * @return The bytes for sectionTitle.
   */
  com.google.protobuf.ByteString
      getSectionTitleBytes();

  /**
   * <pre>
   * The list of available login options.
   * </pre>
   *
   * <code>repeated .autofill_assistant.LoginDetailsProto.LoginOptionProto login_options = 2;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.LoginDetailsProto.LoginOptionProto> 
      getLoginOptionsList();
  /**
   * <pre>
   * The list of available login options.
   * </pre>
   *
   * <code>repeated .autofill_assistant.LoginDetailsProto.LoginOptionProto login_options = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.LoginDetailsProto.LoginOptionProto getLoginOptions(int index);
  /**
   * <pre>
   * The list of available login options.
   * </pre>
   *
   * <code>repeated .autofill_assistant.LoginDetailsProto.LoginOptionProto login_options = 2;</code>
   */
  int getLoginOptionsCount();
}
