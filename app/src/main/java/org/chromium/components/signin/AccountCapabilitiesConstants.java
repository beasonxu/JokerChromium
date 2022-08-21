package org.chromium.components.signin;
import java.util.Set;
import java.util.HashSet;
public abstract class AccountCapabilitiesConstants {
public static final String IS_SUBJECT_TO_PARENTAL_CONTROLS_CAPABILITY_NAME = "accountcapabilities/guydolldmfya";
public static final String IS_ALLOWED_FOR_MACHINE_LEARNING_CAPABILITY_NAME = "accountcapabilities/g42tslldmfya";
public static final String CAN_OFFER_EXTENDED_CHROME_SYNC_PROMOS_CAPABILITY_NAME = "accountcapabilities/gi2tklldmfya";
public static final String CAN_RUN_CHROME_PRIVACY_SANDBOX_TRIALS_CAPABILITY_NAME = "accountcapabilities/gu2dqlldmfya";
public static final String CAN_STOP_PARENTAL_SUPERVISION_CAPABILITY_NAME = "accountcapabilities/guzdslldmfya";
public static final String CAN_TOGGLE_AUTO_UPDATES_NAME = "accountcapabilities/gu4dmlldmfya";
  public static final Set<String> SUPPORTED_ACCOUNT_CAPABILITY_NAMES = new HashSet<String>() {
{ add(IS_SUBJECT_TO_PARENTAL_CONTROLS_CAPABILITY_NAME); }
{ add(IS_ALLOWED_FOR_MACHINE_LEARNING_CAPABILITY_NAME); }
{ add(CAN_OFFER_EXTENDED_CHROME_SYNC_PROMOS_CAPABILITY_NAME); }
{ add(CAN_RUN_CHROME_PRIVACY_SANDBOX_TRIALS_CAPABILITY_NAME); }
{ add(CAN_STOP_PARENTAL_SUPERVISION_CAPABILITY_NAME); }
{ add(CAN_TOGGLE_AUTO_UPDATES_NAME); }
  };
    private AccountCapabilitiesConstants() {}
}
