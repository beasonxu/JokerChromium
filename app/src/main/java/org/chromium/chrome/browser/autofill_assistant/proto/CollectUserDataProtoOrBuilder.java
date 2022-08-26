// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface CollectUserDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.CollectUserDataProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string prompt = 1;</code>
   * @return Whether the prompt field is set.
   */
  boolean hasPrompt();
  /**
   * <code>optional string prompt = 1;</code>
   * @return The prompt.
   */
  java.lang.String getPrompt();
  /**
   * <code>optional string prompt = 1;</code>
   * @return The bytes for prompt.
   */
  com.google.protobuf.ByteString
      getPromptBytes();

  /**
   * <pre>
   * NOTE: The action does not ask separately for billing address.
   * The billing address is associated with the credit card that was picked.
   * </pre>
   *
   * <code>optional string billing_address_name = 2;</code>
   * @return Whether the billingAddressName field is set.
   */
  boolean hasBillingAddressName();
  /**
   * <pre>
   * NOTE: The action does not ask separately for billing address.
   * The billing address is associated with the credit card that was picked.
   * </pre>
   *
   * <code>optional string billing_address_name = 2;</code>
   * @return The billingAddressName.
   */
  java.lang.String getBillingAddressName();
  /**
   * <pre>
   * NOTE: The action does not ask separately for billing address.
   * The billing address is associated with the credit card that was picked.
   * </pre>
   *
   * <code>optional string billing_address_name = 2;</code>
   * @return The bytes for billingAddressName.
   */
  com.google.protobuf.ByteString
      getBillingAddressNameBytes();

  /**
   * <pre>
   * If present will save the shipping address inside the memory under the
   * specified name. If empty we won't ask for the shipping address. Data saved
   * under this name can be reused by UseAddressAction.
   * </pre>
   *
   * <code>optional string shipping_address_name = 3;</code>
   * @return Whether the shippingAddressName field is set.
   */
  boolean hasShippingAddressName();
  /**
   * <pre>
   * If present will save the shipping address inside the memory under the
   * specified name. If empty we won't ask for the shipping address. Data saved
   * under this name can be reused by UseAddressAction.
   * </pre>
   *
   * <code>optional string shipping_address_name = 3;</code>
   * @return The shippingAddressName.
   */
  java.lang.String getShippingAddressName();
  /**
   * <pre>
   * If present will save the shipping address inside the memory under the
   * specified name. If empty we won't ask for the shipping address. Data saved
   * under this name can be reused by UseAddressAction.
   * </pre>
   *
   * <code>optional string shipping_address_name = 3;</code>
   * @return The bytes for shippingAddressName.
   */
  com.google.protobuf.ByteString
      getShippingAddressNameBytes();

  /**
   * <pre>
   * If present, it will be used as the title to be displayed for the shipping
   * address section instead of the default one.
   * </pre>
   *
   * <code>optional string shipping_address_section_title = 32;</code>
   * @return Whether the shippingAddressSectionTitle field is set.
   */
  boolean hasShippingAddressSectionTitle();
  /**
   * <pre>
   * If present, it will be used as the title to be displayed for the shipping
   * address section instead of the default one.
   * </pre>
   *
   * <code>optional string shipping_address_section_title = 32;</code>
   * @return The shippingAddressSectionTitle.
   */
  java.lang.String getShippingAddressSectionTitle();
  /**
   * <pre>
   * If present, it will be used as the title to be displayed for the shipping
   * address section instead of the default one.
   * </pre>
   *
   * <code>optional string shipping_address_section_title = 32;</code>
   * @return The bytes for shippingAddressSectionTitle.
   */
  com.google.protobuf.ByteString
      getShippingAddressSectionTitleBytes();

  /**
   * <pre>
   * When 'true' will ask for the credit card.
   * </pre>
   *
   * <code>optional bool request_payment_method = 4;</code>
   * @return Whether the requestPaymentMethod field is set.
   */
  boolean hasRequestPaymentMethod();
  /**
   * <pre>
   * When 'true' will ask for the credit card.
   * </pre>
   *
   * <code>optional bool request_payment_method = 4;</code>
   * @return The requestPaymentMethod.
   */
  boolean getRequestPaymentMethod();

  /**
   * <pre>
   * If non-empty, the UI will filter the available basic-card networks
   * accordingly (e.g., only `visa' and `mastercard').
   * </pre>
   *
   * <code>repeated string supported_basic_card_networks = 6;</code>
   * @return A list containing the supportedBasicCardNetworks.
   */
  java.util.List<java.lang.String>
      getSupportedBasicCardNetworksList();
  /**
   * <pre>
   * If non-empty, the UI will filter the available basic-card networks
   * accordingly (e.g., only `visa' and `mastercard').
   * </pre>
   *
   * <code>repeated string supported_basic_card_networks = 6;</code>
   * @return The count of supportedBasicCardNetworks.
   */
  int getSupportedBasicCardNetworksCount();
  /**
   * <pre>
   * If non-empty, the UI will filter the available basic-card networks
   * accordingly (e.g., only `visa' and `mastercard').
   * </pre>
   *
   * <code>repeated string supported_basic_card_networks = 6;</code>
   * @param index The index of the element to return.
   * @return The supportedBasicCardNetworks at the given index.
   */
  java.lang.String getSupportedBasicCardNetworks(int index);
  /**
   * <pre>
   * If non-empty, the UI will filter the available basic-card networks
   * accordingly (e.g., only `visa' and `mastercard').
   * </pre>
   *
   * <code>repeated string supported_basic_card_networks = 6;</code>
   * @param index The index of the element to return.
   * @return The supportedBasicCardNetworks at the given index.
   */
  com.google.protobuf.ByteString
      getSupportedBasicCardNetworksBytes(int index);

  /**
   * <pre>
   * Contact details that should be gathered.
   * </pre>
   *
   * <code>optional .autofill_assistant.ContactDetailsProto contact_details = 5;</code>
   * @return Whether the contactDetails field is set.
   */
  boolean hasContactDetails();
  /**
   * <pre>
   * Contact details that should be gathered.
   * </pre>
   *
   * <code>optional .autofill_assistant.ContactDetailsProto contact_details = 5;</code>
   * @return The contactDetails.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ContactDetailsProto getContactDetails();

  /**
   * <pre>
   * Optional specification for the confirm button (defaults to standard confirm
   * chip if not specified).
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto confirm_chip = 33;</code>
   * @return Whether the confirmChip field is set.
   */
  boolean hasConfirmChip();
  /**
   * <pre>
   * Optional specification for the confirm button (defaults to standard confirm
   * chip if not specified).
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipProto confirm_chip = 33;</code>
   * @return The confirmChip.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ChipProto getConfirmChip();

  /**
   * <pre>
   * The initial state of the terms &amp; conditions choice.
   * </pre>
   *
   * <code>optional .autofill_assistant.CollectUserDataProto.TermsAndConditionsState terms_and_conditions_state = 8;</code>
   * @return Whether the termsAndConditionsState field is set.
   */
  boolean hasTermsAndConditionsState();
  /**
   * <pre>
   * The initial state of the terms &amp; conditions choice.
   * </pre>
   *
   * <code>optional .autofill_assistant.CollectUserDataProto.TermsAndConditionsState terms_and_conditions_state = 8;</code>
   * @return The termsAndConditionsState.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CollectUserDataProto.TermsAndConditionsState getTermsAndConditionsState();

  /**
   * <pre>
   * When 'false', hide the terms and conditions box in the UI.
   * </pre>
   *
   * <code>optional bool request_terms_and_conditions = 9 [default = true];</code>
   * @return Whether the requestTermsAndConditions field is set.
   */
  boolean hasRequestTermsAndConditions();
  /**
   * <pre>
   * When 'false', hide the terms and conditions box in the UI.
   * </pre>
   *
   * <code>optional bool request_terms_and_conditions = 9 [default = true];</code>
   * @return The requestTermsAndConditions.
   */
  boolean getRequestTermsAndConditions();

  /**
   * <pre>
   * Whether the terms and conditions should be displayed as a single checkbox
   * with |accept_terms_and_conditions_text| as text. If false, the accept terms
   * will be displayed as a radio button next to an additional "Read and agree
   * later on domain.com" choice.
   * </pre>
   *
   * <code>optional bool show_terms_as_checkbox = 12;</code>
   * @return Whether the showTermsAsCheckbox field is set.
   */
  boolean hasShowTermsAsCheckbox();
  /**
   * <pre>
   * Whether the terms and conditions should be displayed as a single checkbox
   * with |accept_terms_and_conditions_text| as text. If false, the accept terms
   * will be displayed as a radio button next to an additional "Read and agree
   * later on domain.com" choice.
   * </pre>
   *
   * <code>optional bool show_terms_as_checkbox = 12;</code>
   * @return The showTermsAsCheckbox.
   */
  boolean getShowTermsAsCheckbox();

  /**
   * <pre>
   * The text for the terms and conditions "I accept..." choice. The text is
   * formatted such that '&lt;b&gt;text&lt;/b&gt;' will be bold and '&lt;link0&gt;clickable
   * link&lt;/link0&gt;', '&lt;link1&gt;other link&lt;/link1&gt;', etc will be clickable links
   * that will finish this action and return the clicked link in the action
   * result.
   * </pre>
   *
   * <code>optional string accept_terms_and_conditions_text = 13;</code>
   * @return Whether the acceptTermsAndConditionsText field is set.
   */
  boolean hasAcceptTermsAndConditionsText();
  /**
   * <pre>
   * The text for the terms and conditions "I accept..." choice. The text is
   * formatted such that '&lt;b&gt;text&lt;/b&gt;' will be bold and '&lt;link0&gt;clickable
   * link&lt;/link0&gt;', '&lt;link1&gt;other link&lt;/link1&gt;', etc will be clickable links
   * that will finish this action and return the clicked link in the action
   * result.
   * </pre>
   *
   * <code>optional string accept_terms_and_conditions_text = 13;</code>
   * @return The acceptTermsAndConditionsText.
   */
  java.lang.String getAcceptTermsAndConditionsText();
  /**
   * <pre>
   * The text for the terms and conditions "I accept..." choice. The text is
   * formatted such that '&lt;b&gt;text&lt;/b&gt;' will be bold and '&lt;link0&gt;clickable
   * link&lt;/link0&gt;', '&lt;link1&gt;other link&lt;/link1&gt;', etc will be clickable links
   * that will finish this action and return the clicked link in the action
   * result.
   * </pre>
   *
   * <code>optional string accept_terms_and_conditions_text = 13;</code>
   * @return The bytes for acceptTermsAndConditionsText.
   */
  com.google.protobuf.ByteString
      getAcceptTermsAndConditionsTextBytes();

  /**
   * <pre>
   * Message that indicates that the user wants to review the terms and
   * conditions of a 3rd party's domain, e.g., 'example.com'.
   * </pre>
   *
   * <code>optional string terms_require_review_text = 20;</code>
   * @return Whether the termsRequireReviewText field is set.
   */
  boolean hasTermsRequireReviewText();
  /**
   * <pre>
   * Message that indicates that the user wants to review the terms and
   * conditions of a 3rd party's domain, e.g., 'example.com'.
   * </pre>
   *
   * <code>optional string terms_require_review_text = 20;</code>
   * @return The termsRequireReviewText.
   */
  java.lang.String getTermsRequireReviewText();
  /**
   * <pre>
   * Message that indicates that the user wants to review the terms and
   * conditions of a 3rd party's domain, e.g., 'example.com'.
   * </pre>
   *
   * <code>optional string terms_require_review_text = 20;</code>
   * @return The bytes for termsRequireReviewText.
   */
  com.google.protobuf.ByteString
      getTermsRequireReviewTextBytes();

  /**
   * <pre>
   * Privacy notice telling users that autofill assistant will send personal
   * data to a third party’s website.
   * </pre>
   *
   * <code>optional string privacy_notice_text = 21;</code>
   * @return Whether the privacyNoticeText field is set.
   */
  boolean hasPrivacyNoticeText();
  /**
   * <pre>
   * Privacy notice telling users that autofill assistant will send personal
   * data to a third party’s website.
   * </pre>
   *
   * <code>optional string privacy_notice_text = 21;</code>
   * @return The privacyNoticeText.
   */
  java.lang.String getPrivacyNoticeText();
  /**
   * <pre>
   * Privacy notice telling users that autofill assistant will send personal
   * data to a third party’s website.
   * </pre>
   *
   * <code>optional string privacy_notice_text = 21;</code>
   * @return The bytes for privacyNoticeText.
   */
  com.google.protobuf.ByteString
      getPrivacyNoticeTextBytes();

  /**
   * <pre>
   * Additional actions available to the user. This can be used for instance to
   * display a "Show terms" button that will navigate the user to the terms and
   * conditions page when clicked.
   * </pre>
   *
   * <code>repeated .autofill_assistant.UserActionProto additional_actions = 11;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.UserActionProto> 
      getAdditionalActionsList();
  /**
   * <pre>
   * Additional actions available to the user. This can be used for instance to
   * display a "Show terms" button that will navigate the user to the terms and
   * conditions page when clicked.
   * </pre>
   *
   * <code>repeated .autofill_assistant.UserActionProto additional_actions = 11;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.UserActionProto getAdditionalActions(int index);
  /**
   * <pre>
   * Additional actions available to the user. This can be used for instance to
   * display a "Show terms" button that will navigate the user to the terms and
   * conditions page when clicked.
   * </pre>
   *
   * <code>repeated .autofill_assistant.UserActionProto additional_actions = 11;</code>
   */
  int getAdditionalActionsCount();

  /**
   * <pre>
   * The error message to display when the selected credit card is expired.
   * </pre>
   *
   * <code>optional string credit_card_expired_text = 23;</code>
   * @return Whether the creditCardExpiredText field is set.
   */
  boolean hasCreditCardExpiredText();
  /**
   * <pre>
   * The error message to display when the selected credit card is expired.
   * </pre>
   *
   * <code>optional string credit_card_expired_text = 23;</code>
   * @return The creditCardExpiredText.
   */
  java.lang.String getCreditCardExpiredText();
  /**
   * <pre>
   * The error message to display when the selected credit card is expired.
   * </pre>
   *
   * <code>optional string credit_card_expired_text = 23;</code>
   * @return The bytes for creditCardExpiredText.
   */
  com.google.protobuf.ByteString
      getCreditCardExpiredTextBytes();

  /**
   * <pre>
   * The login details that should be gathered.
   * </pre>
   *
   * <code>optional .autofill_assistant.LoginDetailsProto login_details = 16;</code>
   * @return Whether the loginDetails field is set.
   */
  boolean hasLoginDetails();
  /**
   * <pre>
   * The login details that should be gathered.
   * </pre>
   *
   * <code>optional .autofill_assistant.LoginDetailsProto login_details = 16;</code>
   * @return The loginDetails.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.LoginDetailsProto getLoginDetails();

  /**
   * <pre>
   * If set, shows the data origin section to the user.
   * </pre>
   *
   * <code>optional .autofill_assistant.DataOriginNoticeProto data_origin_notice = 39;</code>
   * @return Whether the dataOriginNotice field is set.
   */
  boolean hasDataOriginNotice();
  /**
   * <pre>
   * If set, shows the data origin section to the user.
   * </pre>
   *
   * <code>optional .autofill_assistant.DataOriginNoticeProto data_origin_notice = 39;</code>
   * @return The dataOriginNotice.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DataOriginNoticeProto getDataOriginNotice();

  /**
   * <pre>
   * An optional list of additional sections, which is above all other sections.
   * </pre>
   *
   * <code>repeated .autofill_assistant.UserFormSectionProto additional_prepended_sections = 18;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.UserFormSectionProto> 
      getAdditionalPrependedSectionsList();
  /**
   * <pre>
   * An optional list of additional sections, which is above all other sections.
   * </pre>
   *
   * <code>repeated .autofill_assistant.UserFormSectionProto additional_prepended_sections = 18;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.UserFormSectionProto getAdditionalPrependedSections(int index);
  /**
   * <pre>
   * An optional list of additional sections, which is above all other sections.
   * </pre>
   *
   * <code>repeated .autofill_assistant.UserFormSectionProto additional_prepended_sections = 18;</code>
   */
  int getAdditionalPrependedSectionsCount();

  /**
   * <pre>
   * An optional list of additional sections, which is below all other sections.
   * </pre>
   *
   * <code>repeated .autofill_assistant.UserFormSectionProto additional_appended_sections = 19;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.UserFormSectionProto> 
      getAdditionalAppendedSectionsList();
  /**
   * <pre>
   * An optional list of additional sections, which is below all other sections.
   * </pre>
   *
   * <code>repeated .autofill_assistant.UserFormSectionProto additional_appended_sections = 19;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.UserFormSectionProto getAdditionalAppendedSections(int index);
  /**
   * <pre>
   * An optional list of additional sections, which is below all other sections.
   * </pre>
   *
   * <code>repeated .autofill_assistant.UserFormSectionProto additional_appended_sections = 19;</code>
   */
  int getAdditionalAppendedSectionsCount();

  /**
   * <pre>
   * Backend-configured user interface to show below
   * |additional_prepended_sections|.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface_prepended = 22;</code>
   * @return Whether the genericUserInterfacePrepended field is set.
   */
  boolean hasGenericUserInterfacePrepended();
  /**
   * <pre>
   * Backend-configured user interface to show below
   * |additional_prepended_sections|.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface_prepended = 22;</code>
   * @return The genericUserInterfacePrepended.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getGenericUserInterfacePrepended();

  /**
   * <pre>
   * Backend-configured user interface to show below
   * |additional_appended_sections|.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface_appended = 25;</code>
   * @return Whether the genericUserInterfaceAppended field is set.
   */
  boolean hasGenericUserInterfaceAppended();
  /**
   * <pre>
   * Backend-configured user interface to show below
   * |additional_appended_sections|.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_user_interface_appended = 25;</code>
   * @return The genericUserInterfaceAppended.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getGenericUserInterfaceAppended();

  /**
   * <pre>
   * Optional. Text to be shown in a separate info section.
   * </pre>
   *
   * <code>optional string info_section_text = 24;</code>
   * @return Whether the infoSectionText field is set.
   */
  boolean hasInfoSectionText();
  /**
   * <pre>
   * Optional. Text to be shown in a separate info section.
   * </pre>
   *
   * <code>optional string info_section_text = 24;</code>
   * @return The infoSectionText.
   */
  java.lang.String getInfoSectionText();
  /**
   * <pre>
   * Optional. Text to be shown in a separate info section.
   * </pre>
   *
   * <code>optional string info_section_text = 24;</code>
   * @return The bytes for infoSectionText.
   */
  com.google.protobuf.ByteString
      getInfoSectionTextBytes();

  /**
   * <pre>
   * Optional. If true the text in the info section will be centered.
   * </pre>
   *
   * <code>optional bool info_section_text_center = 31;</code>
   * @return Whether the infoSectionTextCenter field is set.
   */
  boolean hasInfoSectionTextCenter();
  /**
   * <pre>
   * Optional. If true the text in the info section will be centered.
   * </pre>
   *
   * <code>optional bool info_section_text_center = 31;</code>
   * @return The infoSectionTextCenter.
   */
  boolean getInfoSectionTextCenter();

  /**
   * <pre>
   * Optional. If specified, the continue button will only be enabled if the
   * boolean at this location is true (and everything else is valid too).
   * </pre>
   *
   * <code>optional string additional_model_identifier_to_check = 27;</code>
   * @return Whether the additionalModelIdentifierToCheck field is set.
   */
  boolean hasAdditionalModelIdentifierToCheck();
  /**
   * <pre>
   * Optional. If specified, the continue button will only be enabled if the
   * boolean at this location is true (and everything else is valid too).
   * </pre>
   *
   * <code>optional string additional_model_identifier_to_check = 27;</code>
   * @return The additionalModelIdentifierToCheck.
   */
  java.lang.String getAdditionalModelIdentifierToCheck();
  /**
   * <pre>
   * Optional. If specified, the continue button will only be enabled if the
   * boolean at this location is true (and everything else is valid too).
   * </pre>
   *
   * <code>optional string additional_model_identifier_to_check = 27;</code>
   * @return The bytes for additionalModelIdentifierToCheck.
   */
  com.google.protobuf.ByteString
      getAdditionalModelIdentifierToCheckBytes();

  /**
   * <pre>
   * Clears any previously selected credit card. The client will revert to
   * default-selecting the card instead. NOTE: When clearing the credit card
   * selection, the billing address should also be cleared!
   * </pre>
   *
   * <code>optional bool clear_previous_credit_card_selection = 28;</code>
   * @return Whether the clearPreviousCreditCardSelection field is set.
   */
  boolean hasClearPreviousCreditCardSelection();
  /**
   * <pre>
   * Clears any previously selected credit card. The client will revert to
   * default-selecting the card instead. NOTE: When clearing the credit card
   * selection, the billing address should also be cleared!
   * </pre>
   *
   * <code>optional bool clear_previous_credit_card_selection = 28;</code>
   * @return The clearPreviousCreditCardSelection.
   */
  boolean getClearPreviousCreditCardSelection();

  /**
   * <pre>
   * Clears the previously selected login option, if any. The client will revert
   * to default-selecting the login option instead.
   * </pre>
   *
   * <code>optional bool clear_previous_login_selection = 29;</code>
   * @return Whether the clearPreviousLoginSelection field is set.
   */
  boolean hasClearPreviousLoginSelection();
  /**
   * <pre>
   * Clears the previously selected login option, if any. The client will revert
   * to default-selecting the login option instead.
   * </pre>
   *
   * <code>optional bool clear_previous_login_selection = 29;</code>
   * @return The clearPreviousLoginSelection.
   */
  boolean getClearPreviousLoginSelection();

  /**
   * <pre>
   * The names of the selected profiles to clear. Should be a subset of
   * {billing_address_name, shipping_address_name,
   * contact_details.contact_details_name}. NOTE: when clearing the billing
   * address, the selected credit card should also be cleared!
   * </pre>
   *
   * <code>repeated string clear_previous_profile_selection = 30;</code>
   * @return A list containing the clearPreviousProfileSelection.
   */
  java.util.List<java.lang.String>
      getClearPreviousProfileSelectionList();
  /**
   * <pre>
   * The names of the selected profiles to clear. Should be a subset of
   * {billing_address_name, shipping_address_name,
   * contact_details.contact_details_name}. NOTE: when clearing the billing
   * address, the selected credit card should also be cleared!
   * </pre>
   *
   * <code>repeated string clear_previous_profile_selection = 30;</code>
   * @return The count of clearPreviousProfileSelection.
   */
  int getClearPreviousProfileSelectionCount();
  /**
   * <pre>
   * The names of the selected profiles to clear. Should be a subset of
   * {billing_address_name, shipping_address_name,
   * contact_details.contact_details_name}. NOTE: when clearing the billing
   * address, the selected credit card should also be cleared!
   * </pre>
   *
   * <code>repeated string clear_previous_profile_selection = 30;</code>
   * @param index The index of the element to return.
   * @return The clearPreviousProfileSelection at the given index.
   */
  java.lang.String getClearPreviousProfileSelection(int index);
  /**
   * <pre>
   * The names of the selected profiles to clear. Should be a subset of
   * {billing_address_name, shipping_address_name,
   * contact_details.contact_details_name}. NOTE: when clearing the billing
   * address, the selected credit card should also be cleared!
   * </pre>
   *
   * <code>repeated string clear_previous_profile_selection = 30;</code>
   * @param index The index of the element to return.
   * @return The clearPreviousProfileSelection at the given index.
   */
  com.google.protobuf.ByteString
      getClearPreviousProfileSelectionBytes(int index);

  /**
   * <pre>
   * Defines how to evaluate validitiy of an address or credit card.
   * </pre>
   *
   * <code>repeated .autofill_assistant.RequiredDataPiece required_shipping_address_data_piece = 34;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.RequiredDataPiece> 
      getRequiredShippingAddressDataPieceList();
  /**
   * <pre>
   * Defines how to evaluate validitiy of an address or credit card.
   * </pre>
   *
   * <code>repeated .autofill_assistant.RequiredDataPiece required_shipping_address_data_piece = 34;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.RequiredDataPiece getRequiredShippingAddressDataPiece(int index);
  /**
   * <pre>
   * Defines how to evaluate validitiy of an address or credit card.
   * </pre>
   *
   * <code>repeated .autofill_assistant.RequiredDataPiece required_shipping_address_data_piece = 34;</code>
   */
  int getRequiredShippingAddressDataPieceCount();

  /**
   * <code>repeated .autofill_assistant.RequiredDataPiece required_credit_card_data_piece = 35;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.RequiredDataPiece> 
      getRequiredCreditCardDataPieceList();
  /**
   * <code>repeated .autofill_assistant.RequiredDataPiece required_credit_card_data_piece = 35;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.RequiredDataPiece getRequiredCreditCardDataPiece(int index);
  /**
   * <code>repeated .autofill_assistant.RequiredDataPiece required_credit_card_data_piece = 35;</code>
   */
  int getRequiredCreditCardDataPieceCount();

  /**
   * <code>repeated .autofill_assistant.RequiredDataPiece required_billing_address_data_piece = 36;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.RequiredDataPiece> 
      getRequiredBillingAddressDataPieceList();
  /**
   * <code>repeated .autofill_assistant.RequiredDataPiece required_billing_address_data_piece = 36;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.RequiredDataPiece getRequiredBillingAddressDataPiece(int index);
  /**
   * <code>repeated .autofill_assistant.RequiredDataPiece required_billing_address_data_piece = 36;</code>
   */
  int getRequiredBillingAddressDataPieceCount();

  /**
   * <pre>
   * If set, will request data from the GetUserData remote backend, rather than
   * Chrome Autofill. Takes precedence over |user_data|.
   * </pre>
   *
   * <code>optional .autofill_assistant.CollectUserDataProto.DataSource data_source = 38;</code>
   * @return Whether the dataSource field is set.
   */
  boolean hasDataSource();
  /**
   * <pre>
   * If set, will request data from the GetUserData remote backend, rather than
   * Chrome Autofill. Takes precedence over |user_data|.
   * </pre>
   *
   * <code>optional .autofill_assistant.CollectUserDataProto.DataSource data_source = 38;</code>
   * @return The dataSource.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.CollectUserDataProto.DataSource getDataSource();
}
