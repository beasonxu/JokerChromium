// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf enum {@code autofill_assistant.ChipType}
 */
public enum ChipType
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>UNKNOWN_CHIP_TYPE = 0;</code>
   */
  UNKNOWN_CHIP_TYPE(0),
  /**
   * <pre>
   * Chip is a highlighted (blue) action chip.
   * </pre>
   *
   * <code>HIGHLIGHTED_ACTION = 1;</code>
   */
  HIGHLIGHTED_ACTION(1),
  /**
   * <pre>
   * Chip is a normal action chip.
   * </pre>
   *
   * <code>NORMAL_ACTION = 3;</code>
   */
  NORMAL_ACTION(3),
  /**
   * <pre>
   * A cancel chip, which closes AA in a way that allows the user to undo.
   * The action associated with the chip is only executed after enough time has
   * passed that undo is not possible.
   * The presence of this chip inhibit the addition of an implicit close or
   * cancel button.
   * </pre>
   *
   * <code>CANCEL_ACTION = 4;</code>
   */
  CANCEL_ACTION(4),
  /**
   * <pre>
   * A close chip, which closes AA immediately.
   * The presence of this chip inhibit the addition of an implicit close or
   * cancel button. Otherwise, buttons of this type work and look like a
   * NORMAL_ACTION.
   * </pre>
   *
   * <code>CLOSE_ACTION = 5;</code>
   */
  CLOSE_ACTION(5),
  /**
   * <pre>
   * Chip is a highlighted (blue) action chip.
   * The presence of this chip inhibit the addition of an implicit close or
   * cancel button. Otherwise, buttons of this type work and look like a
   * HIGHLIGHTED_ACTION.
   * </pre>
   *
   * <code>DONE_ACTION = 6;</code>
   */
  DONE_ACTION(6),
  /**
   * <pre>
   * A "Send feedback" chip, which will show the feedback form when clicked.
   * Note that when this is used inside a script, we will continue the script
   * normally once the user has clicked the chip.
   * </pre>
   *
   * <code>FEEDBACK_ACTION = 7;</code>
   */
  FEEDBACK_ACTION(7),
  ;

  /**
   * <code>UNKNOWN_CHIP_TYPE = 0;</code>
   */
  public static final int UNKNOWN_CHIP_TYPE_VALUE = 0;
  /**
   * <pre>
   * Chip is a highlighted (blue) action chip.
   * </pre>
   *
   * <code>HIGHLIGHTED_ACTION = 1;</code>
   */
  public static final int HIGHLIGHTED_ACTION_VALUE = 1;
  /**
   * <pre>
   * Chip is a normal action chip.
   * </pre>
   *
   * <code>NORMAL_ACTION = 3;</code>
   */
  public static final int NORMAL_ACTION_VALUE = 3;
  /**
   * <pre>
   * A cancel chip, which closes AA in a way that allows the user to undo.
   * The action associated with the chip is only executed after enough time has
   * passed that undo is not possible.
   * The presence of this chip inhibit the addition of an implicit close or
   * cancel button.
   * </pre>
   *
   * <code>CANCEL_ACTION = 4;</code>
   */
  public static final int CANCEL_ACTION_VALUE = 4;
  /**
   * <pre>
   * A close chip, which closes AA immediately.
   * The presence of this chip inhibit the addition of an implicit close or
   * cancel button. Otherwise, buttons of this type work and look like a
   * NORMAL_ACTION.
   * </pre>
   *
   * <code>CLOSE_ACTION = 5;</code>
   */
  public static final int CLOSE_ACTION_VALUE = 5;
  /**
   * <pre>
   * Chip is a highlighted (blue) action chip.
   * The presence of this chip inhibit the addition of an implicit close or
   * cancel button. Otherwise, buttons of this type work and look like a
   * HIGHLIGHTED_ACTION.
   * </pre>
   *
   * <code>DONE_ACTION = 6;</code>
   */
  public static final int DONE_ACTION_VALUE = 6;
  /**
   * <pre>
   * A "Send feedback" chip, which will show the feedback form when clicked.
   * Note that when this is used inside a script, we will continue the script
   * normally once the user has clicked the chip.
   * </pre>
   *
   * <code>FEEDBACK_ACTION = 7;</code>
   */
  public static final int FEEDBACK_ACTION_VALUE = 7;


  @java.lang.Override
  public final int getNumber() {
    return value;
  }

  /**
   * @param value The number of the enum to look for.
   * @return The enum associated with the given number.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ChipType valueOf(int value) {
    return forNumber(value);
  }

  public static ChipType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_CHIP_TYPE;
      case 1: return HIGHLIGHTED_ACTION;
      case 3: return NORMAL_ACTION;
      case 4: return CANCEL_ACTION;
      case 5: return CLOSE_ACTION;
      case 6: return DONE_ACTION;
      case 7: return FEEDBACK_ACTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChipType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChipType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChipType>() {
          @java.lang.Override
          public ChipType findValueByNumber(int number) {
            return ChipType.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return ChipTypeVerifier.INSTANCE;
  }

  private static final class ChipTypeVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new ChipTypeVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return ChipType.forNumber(number) != null;
          }
        };

  private final int value;

  private ChipType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:autofill_assistant.ChipType)
}

