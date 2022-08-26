// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf enum {@code autofill_assistant.ChipIcon}
 */
public enum ChipIcon
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>NO_ICON = 0;</code>
   */
  NO_ICON(0),
  /**
   * <pre>
   * https://icons.googleplex.com/#icon=clear
   * </pre>
   *
   * <code>ICON_CLEAR = 1;</code>
   */
  ICON_CLEAR(1),
  /**
   * <pre>
   * https://icons.googleplex.com/#icon=done
   * </pre>
   *
   * <code>ICON_DONE = 2;</code>
   */
  ICON_DONE(2),
  /**
   * <pre>
   * https://icons.googleplex.com/#icon=refresh
   * </pre>
   *
   * <code>ICON_REFRESH = 3;</code>
   */
  ICON_REFRESH(3),
  /**
   * <pre>
   * https://icons.googleplex.com/#icon=more_vert
   * </pre>
   *
   * <code>ICON_OVERFLOW = 4;</code>
   */
  ICON_OVERFLOW(4),
  ;

  /**
   * <code>NO_ICON = 0;</code>
   */
  public static final int NO_ICON_VALUE = 0;
  /**
   * <pre>
   * https://icons.googleplex.com/#icon=clear
   * </pre>
   *
   * <code>ICON_CLEAR = 1;</code>
   */
  public static final int ICON_CLEAR_VALUE = 1;
  /**
   * <pre>
   * https://icons.googleplex.com/#icon=done
   * </pre>
   *
   * <code>ICON_DONE = 2;</code>
   */
  public static final int ICON_DONE_VALUE = 2;
  /**
   * <pre>
   * https://icons.googleplex.com/#icon=refresh
   * </pre>
   *
   * <code>ICON_REFRESH = 3;</code>
   */
  public static final int ICON_REFRESH_VALUE = 3;
  /**
   * <pre>
   * https://icons.googleplex.com/#icon=more_vert
   * </pre>
   *
   * <code>ICON_OVERFLOW = 4;</code>
   */
  public static final int ICON_OVERFLOW_VALUE = 4;


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
  public static ChipIcon valueOf(int value) {
    return forNumber(value);
  }

  public static ChipIcon forNumber(int value) {
    switch (value) {
      case 0: return NO_ICON;
      case 1: return ICON_CLEAR;
      case 2: return ICON_DONE;
      case 3: return ICON_REFRESH;
      case 4: return ICON_OVERFLOW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChipIcon>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChipIcon> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChipIcon>() {
          @java.lang.Override
          public ChipIcon findValueByNumber(int number) {
            return ChipIcon.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return ChipIconVerifier.INSTANCE;
  }

  private static final class ChipIconVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new ChipIconVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return ChipIcon.forNumber(number) != null;
          }
        };

  private final int value;

  private ChipIcon(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:autofill_assistant.ChipIcon)
}

