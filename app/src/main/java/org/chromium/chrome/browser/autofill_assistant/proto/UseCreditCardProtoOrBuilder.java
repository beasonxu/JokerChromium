// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface UseCreditCardProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.UseCreditCardProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The client model identifier from which to retrieve the credit card.
   * If not specified, will use the card stored in client memory instead.
   * </pre>
   *
   * <code>optional string model_identifier = 4;</code>
   * @return Whether the modelIdentifier field is set.
   */
  boolean hasModelIdentifier();
  /**
   * <pre>
   * The client model identifier from which to retrieve the credit card.
   * If not specified, will use the card stored in client memory instead.
   * </pre>
   *
   * <code>optional string model_identifier = 4;</code>
   * @return The modelIdentifier.
   */
  java.lang.String getModelIdentifier();
  /**
   * <pre>
   * The client model identifier from which to retrieve the credit card.
   * If not specified, will use the card stored in client memory instead.
   * </pre>
   *
   * <code>optional string model_identifier = 4;</code>
   * @return The bytes for modelIdentifier.
   */
  com.google.protobuf.ByteString
      getModelIdentifierBytes();

  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto form_field_element = 3;</code>
   * @return Whether the formFieldElement field is set.
   */
  boolean hasFormFieldElement();
  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto form_field_element = 3;</code>
   * @return The formFieldElement.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto getFormFieldElement();

  /**
   * <code>repeated .autofill_assistant.RequiredFieldProto required_fields = 7;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.RequiredFieldProto> 
      getRequiredFieldsList();
  /**
   * <code>repeated .autofill_assistant.RequiredFieldProto required_fields = 7;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.RequiredFieldProto getRequiredFields(int index);
  /**
   * <code>repeated .autofill_assistant.RequiredFieldProto required_fields = 7;</code>
   */
  int getRequiredFieldsCount();

  /**
   * <pre>
   * If true, this skips the Autofill step jumping straight to the
   * |required_fields|.
   * </pre>
   *
   * <code>optional bool skip_autofill = 8;</code>
   * @return Whether the skipAutofill field is set.
   */
  boolean hasSkipAutofill();
  /**
   * <pre>
   * If true, this skips the Autofill step jumping straight to the
   * |required_fields|.
   * </pre>
   *
   * <code>optional bool skip_autofill = 8;</code>
   * @return The skipAutofill.
   */
  boolean getSkipAutofill();

  /**
   * <pre>
   * If true, this skips resolving the CreditCard. The card can be used to fill
   * fields like name or expiration date. Be aware that you cannot fill CVC or
   * credit card number without resolving the card.
   * This skips the autofill step, regardless of |skip_autofill|.
   * </pre>
   *
   * <code>optional bool skip_resolve = 9;</code>
   * @return Whether the skipResolve field is set.
   */
  boolean hasSkipResolve();
  /**
   * <pre>
   * If true, this skips resolving the CreditCard. The card can be used to fill
   * fields like name or expiration date. Be aware that you cannot fill CVC or
   * credit card number without resolving the card.
   * This skips the autofill step, regardless of |skip_autofill|.
   * </pre>
   *
   * <code>optional bool skip_resolve = 9;</code>
   * @return The skipResolve.
   */
  boolean getSkipResolve();
}