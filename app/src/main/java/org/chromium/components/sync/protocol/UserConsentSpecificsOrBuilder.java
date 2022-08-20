// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/user_consent_specifics.proto

package org.chromium.components.sync.protocol;

public interface UserConsentSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.UserConsentSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The UI language Chrome is using, represented as the IETF language tag
   * defined in BCP 47. The region subtag is not included when it adds no
   * distinguishing information to the language tag (e.g. both "en-US"
   * and "fr" are correct here).
   * </pre>
   *
   * <code>optional string locale = 4;</code>
   * @return Whether the locale field is set.
   */
  boolean hasLocale();
  /**
   * <pre>
   * The UI language Chrome is using, represented as the IETF language tag
   * defined in BCP 47. The region subtag is not included when it adds no
   * distinguishing information to the language tag (e.g. both "en-US"
   * and "fr" are correct here).
   * </pre>
   *
   * <code>optional string locale = 4;</code>
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * The UI language Chrome is using, represented as the IETF language tag
   * defined in BCP 47. The region subtag is not included when it adds no
   * distinguishing information to the language tag (e.g. both "en-US"
   * and "fr" are correct here).
   * </pre>
   *
   * <code>optional string locale = 4;</code>
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * The local time on the client when the user consent was recorded. The time
   * as measured by client is given in microseconds since Windows epoch. This
   * is needed since user consent recording may happen when a client is
   * offline.
   * </pre>
   *
   * <code>optional int64 client_consent_time_usec = 12;</code>
   * @return Whether the clientConsentTimeUsec field is set.
   */
  boolean hasClientConsentTimeUsec();
  /**
   * <pre>
   * The local time on the client when the user consent was recorded. The time
   * as measured by client is given in microseconds since Windows epoch. This
   * is needed since user consent recording may happen when a client is
   * offline.
   * </pre>
   *
   * <code>optional int64 client_consent_time_usec = 12;</code>
   * @return The clientConsentTimeUsec.
   */
  long getClientConsentTimeUsec();

  /**
   * <code>.sync_pb.UserConsentTypes.SyncConsent sync_consent = 7;</code>
   * @return Whether the syncConsent field is set.
   */
  boolean hasSyncConsent();
  /**
   * <code>.sync_pb.UserConsentTypes.SyncConsent sync_consent = 7;</code>
   * @return The syncConsent.
   */
  org.chromium.components.sync.protocol.UserConsentTypes.SyncConsent getSyncConsent();

  /**
   * <code>.sync_pb.UserConsentTypes.ArcBackupAndRestoreConsent arc_backup_and_restore_consent = 8;</code>
   * @return Whether the arcBackupAndRestoreConsent field is set.
   */
  boolean hasArcBackupAndRestoreConsent();
  /**
   * <code>.sync_pb.UserConsentTypes.ArcBackupAndRestoreConsent arc_backup_and_restore_consent = 8;</code>
   * @return The arcBackupAndRestoreConsent.
   */
  org.chromium.components.sync.protocol.UserConsentTypes.ArcBackupAndRestoreConsent getArcBackupAndRestoreConsent();

  /**
   * <code>.sync_pb.UserConsentTypes.ArcGoogleLocationServiceConsent arc_location_service_consent = 9;</code>
   * @return Whether the arcLocationServiceConsent field is set.
   */
  boolean hasArcLocationServiceConsent();
  /**
   * <code>.sync_pb.UserConsentTypes.ArcGoogleLocationServiceConsent arc_location_service_consent = 9;</code>
   * @return The arcLocationServiceConsent.
   */
  org.chromium.components.sync.protocol.UserConsentTypes.ArcGoogleLocationServiceConsent getArcLocationServiceConsent();

  /**
   * <code>.sync_pb.UserConsentTypes.ArcPlayTermsOfServiceConsent arc_play_terms_of_service_consent = 10;</code>
   * @return Whether the arcPlayTermsOfServiceConsent field is set.
   */
  boolean hasArcPlayTermsOfServiceConsent();
  /**
   * <code>.sync_pb.UserConsentTypes.ArcPlayTermsOfServiceConsent arc_play_terms_of_service_consent = 10;</code>
   * @return The arcPlayTermsOfServiceConsent.
   */
  org.chromium.components.sync.protocol.UserConsentTypes.ArcPlayTermsOfServiceConsent getArcPlayTermsOfServiceConsent();

  /**
   * <code>.sync_pb.UserConsentTypes.UnifiedConsent unified_consent = 13 [deprecated = true];</code>
   * @return Whether the unifiedConsent field is set.
   */
  @java.lang.Deprecated boolean hasUnifiedConsent();
  /**
   * <code>.sync_pb.UserConsentTypes.UnifiedConsent unified_consent = 13 [deprecated = true];</code>
   * @return The unifiedConsent.
   */
  @java.lang.Deprecated org.chromium.components.sync.protocol.UserConsentTypes.UnifiedConsent getUnifiedConsent();

  /**
   * <code>.sync_pb.UserConsentTypes.AssistantActivityControlConsent assistant_activity_control_consent = 14;</code>
   * @return Whether the assistantActivityControlConsent field is set.
   */
  boolean hasAssistantActivityControlConsent();
  /**
   * <code>.sync_pb.UserConsentTypes.AssistantActivityControlConsent assistant_activity_control_consent = 14;</code>
   * @return The assistantActivityControlConsent.
   */
  org.chromium.components.sync.protocol.UserConsentTypes.AssistantActivityControlConsent getAssistantActivityControlConsent();

  /**
   * <code>.sync_pb.UserConsentTypes.AccountPasswordsConsent account_passwords_consent = 15;</code>
   * @return Whether the accountPasswordsConsent field is set.
   */
  boolean hasAccountPasswordsConsent();
  /**
   * <code>.sync_pb.UserConsentTypes.AccountPasswordsConsent account_passwords_consent = 15;</code>
   * @return The accountPasswordsConsent.
   */
  org.chromium.components.sync.protocol.UserConsentTypes.AccountPasswordsConsent getAccountPasswordsConsent();

  /**
   * <pre>
   * The account ID of the user who gave the consent. This field is used
   * by UserEventService to distinguish consents from different users,
   * as UserConsent does not get deleted when a user signs out. However,
   * it should be cleared before being sent over the wire, as the UserEvent
   * is sent over an authenticated channel, so this information would be
   * redundant.
   * For semantics and usage of the |account_id| in the signin codebase,
   * see IdentityManager::GetPrimaryAccountId() or CoreAccountId.
   * </pre>
   *
   * <code>optional string account_id = 6;</code>
   * @return Whether the accountId field is set.
   */
  boolean hasAccountId();
  /**
   * <pre>
   * The account ID of the user who gave the consent. This field is used
   * by UserEventService to distinguish consents from different users,
   * as UserConsent does not get deleted when a user signs out. However,
   * it should be cleared before being sent over the wire, as the UserEvent
   * is sent over an authenticated channel, so this information would be
   * redundant.
   * For semantics and usage of the |account_id| in the signin codebase,
   * see IdentityManager::GetPrimaryAccountId() or CoreAccountId.
   * </pre>
   *
   * <code>optional string account_id = 6;</code>
   * @return The accountId.
   */
  java.lang.String getAccountId();
  /**
   * <pre>
   * The account ID of the user who gave the consent. This field is used
   * by UserEventService to distinguish consents from different users,
   * as UserConsent does not get deleted when a user signs out. However,
   * it should be cleared before being sent over the wire, as the UserEvent
   * is sent over an authenticated channel, so this information would be
   * redundant.
   * For semantics and usage of the |account_id| in the signin codebase,
   * see IdentityManager::GetPrimaryAccountId() or CoreAccountId.
   * </pre>
   *
   * <code>optional string account_id = 6;</code>
   * @return The bytes for accountId.
   */
  com.google.protobuf.ByteString
      getAccountIdBytes();

  /**
   * <code>optional .sync_pb.UserConsentSpecifics.Feature feature = 1 [deprecated = true];</code>
   * @return Whether the feature field is set.
   */
  @java.lang.Deprecated boolean hasFeature();
  /**
   * <code>optional .sync_pb.UserConsentSpecifics.Feature feature = 1 [deprecated = true];</code>
   * @return The feature.
   */
  @java.lang.Deprecated org.chromium.components.sync.protocol.UserConsentSpecifics.Feature getFeature();

  /**
   * <pre>
   * Ids of the strings of the consent text presented to the user.
   * </pre>
   *
   * <code>repeated int32 description_grd_ids = 2 [deprecated = true];</code>
   * @return A list containing the descriptionGrdIds.
   */
  @java.lang.Deprecated java.util.List<java.lang.Integer> getDescriptionGrdIdsList();
  /**
   * <pre>
   * Ids of the strings of the consent text presented to the user.
   * </pre>
   *
   * <code>repeated int32 description_grd_ids = 2 [deprecated = true];</code>
   * @return The count of descriptionGrdIds.
   */
  @java.lang.Deprecated int getDescriptionGrdIdsCount();
  /**
   * <pre>
   * Ids of the strings of the consent text presented to the user.
   * </pre>
   *
   * <code>repeated int32 description_grd_ids = 2 [deprecated = true];</code>
   * @param index The index of the element to return.
   * @return The descriptionGrdIds at the given index.
   */
  @java.lang.Deprecated int getDescriptionGrdIds(int index);

  /**
   * <pre>
   * Id of the string of the UI element the user clicked when consenting.
   * </pre>
   *
   * <code>optional int32 confirmation_grd_id = 3 [deprecated = true];</code>
   * @return Whether the confirmationGrdId field is set.
   */
  @java.lang.Deprecated boolean hasConfirmationGrdId();
  /**
   * <pre>
   * Id of the string of the UI element the user clicked when consenting.
   * </pre>
   *
   * <code>optional int32 confirmation_grd_id = 3 [deprecated = true];</code>
   * @return The confirmationGrdId.
   */
  @java.lang.Deprecated int getConfirmationGrdId();

  /**
   * <pre>
   * Was the consent for |feature| given or not given (denied/revoked)?
   * </pre>
   *
   * <code>optional .sync_pb.UserConsentTypes.ConsentStatus status = 5 [deprecated = true];</code>
   * @return Whether the status field is set.
   */
  @java.lang.Deprecated boolean hasStatus();
  /**
   * <pre>
   * Was the consent for |feature| given or not given (denied/revoked)?
   * </pre>
   *
   * <code>optional .sync_pb.UserConsentTypes.ConsentStatus status = 5 [deprecated = true];</code>
   * @return The status.
   */
  @java.lang.Deprecated org.chromium.components.sync.protocol.UserConsentTypes.ConsentStatus getStatus();

  public org.chromium.components.sync.protocol.UserConsentSpecifics.ConsentCase getConsentCase();
}