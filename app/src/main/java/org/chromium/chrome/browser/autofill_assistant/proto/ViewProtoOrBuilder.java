// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ViewProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ViewProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The unique identifier of the view.
   * </pre>
   *
   * <code>optional string identifier = 1;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * The unique identifier of the view.
   * </pre>
   *
   * <code>optional string identifier = 1;</code>
   * @return The identifier.
   */
  java.lang.String getIdentifier();
  /**
   * <pre>
   * The unique identifier of the view.
   * </pre>
   *
   * <code>optional string identifier = 1;</code>
   * @return The bytes for identifier.
   */
  com.google.protobuf.ByteString
      getIdentifierBytes();

  /**
   * <pre>
   * Common view attributes, such as padding and background.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewAttributesProto attributes = 2;</code>
   * @return Whether the attributes field is set.
   */
  boolean hasAttributes();
  /**
   * <pre>
   * Common view attributes, such as padding and background.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewAttributesProto attributes = 2;</code>
   * @return The attributes.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ViewAttributesProto getAttributes();

  /**
   * <pre>
   * Layout parameters such as width, height, and gravity.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewLayoutParamsProto layout_params = 3;</code>
   * @return Whether the layoutParams field is set.
   */
  boolean hasLayoutParams();
  /**
   * <pre>
   * Layout parameters such as width, height, and gravity.
   * </pre>
   *
   * <code>optional .autofill_assistant.ViewLayoutParamsProto layout_params = 3;</code>
   * @return The layoutParams.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ViewLayoutParamsProto getLayoutParams();

  /**
   * <code>.autofill_assistant.ViewContainerProto view_container = 4;</code>
   * @return Whether the viewContainer field is set.
   */
  boolean hasViewContainer();
  /**
   * <code>.autofill_assistant.ViewContainerProto view_container = 4;</code>
   * @return The viewContainer.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ViewContainerProto getViewContainer();

  /**
   * <pre>
   * A regular read-only text view.
   * </pre>
   *
   * <code>.autofill_assistant.TextViewProto text_view = 5;</code>
   * @return Whether the textView field is set.
   */
  boolean hasTextView();
  /**
   * <pre>
   * A regular read-only text view.
   * </pre>
   *
   * <code>.autofill_assistant.TextViewProto text_view = 5;</code>
   * @return The textView.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto getTextView();

  /**
   * <pre>
   * A horizontal view divider.
   * </pre>
   *
   * <code>.autofill_assistant.DividerViewProto divider_view = 6;</code>
   * @return Whether the dividerView field is set.
   */
  boolean hasDividerView();
  /**
   * <pre>
   * A horizontal view divider.
   * </pre>
   *
   * <code>.autofill_assistant.DividerViewProto divider_view = 6;</code>
   * @return The dividerView.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DividerViewProto getDividerView();

  /**
   * <pre>
   * A regular image view.
   * </pre>
   *
   * <code>.autofill_assistant.ImageViewProto image_view = 7;</code>
   * @return Whether the imageView field is set.
   */
  boolean hasImageView();
  /**
   * <pre>
   * A regular image view.
   * </pre>
   *
   * <code>.autofill_assistant.ImageViewProto image_view = 7;</code>
   * @return The imageView.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ImageViewProto getImageView();

  /**
   * <pre>
   * A text input view.
   * </pre>
   *
   * <code>.autofill_assistant.TextInputViewProto text_input_view = 8;</code>
   * @return Whether the textInputView field is set.
   */
  boolean hasTextInputView();
  /**
   * <pre>
   * A text input view.
   * </pre>
   *
   * <code>.autofill_assistant.TextInputViewProto text_input_view = 8;</code>
   * @return The textInputView.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.TextInputViewProto getTextInputView();

  /**
   * <pre>
   * A vertical expander with fixed title, collapsed, and expanded sections.
   * </pre>
   *
   * <code>.autofill_assistant.VerticalExpanderViewProto vertical_expander_view = 9;</code>
   * @return Whether the verticalExpanderView field is set.
   */
  boolean hasVerticalExpanderView();
  /**
   * <pre>
   * A vertical expander with fixed title, collapsed, and expanded sections.
   * </pre>
   *
   * <code>.autofill_assistant.VerticalExpanderViewProto vertical_expander_view = 9;</code>
   * @return The verticalExpanderView.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.VerticalExpanderViewProto getVerticalExpanderView();

  /**
   * <pre>
   * A toggle button (checkbox or radio button).
   * </pre>
   *
   * <code>.autofill_assistant.ToggleButtonViewProto toggle_button_view = 10;</code>
   * @return Whether the toggleButtonView field is set.
   */
  boolean hasToggleButtonView();
  /**
   * <pre>
   * A toggle button (checkbox or radio button).
   * </pre>
   *
   * <code>.autofill_assistant.ToggleButtonViewProto toggle_button_view = 10;</code>
   * @return The toggleButtonView.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ToggleButtonViewProto getToggleButtonView();

  public org.chromium.chrome.browser.autofill_assistant.proto.ViewProto.ViewCase getViewCase();
}