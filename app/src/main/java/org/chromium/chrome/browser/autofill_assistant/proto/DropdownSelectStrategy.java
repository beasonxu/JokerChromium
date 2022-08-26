// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/action_strategy.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Note: On multiple matches, the first one will be selected.
 * </pre>
 *
 * Protobuf enum {@code autofill_assistant.DropdownSelectStrategy}
 */
public enum DropdownSelectStrategy
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>UNSPECIFIED_SELECT_STRATEGY = 0;</code>
   */
  UNSPECIFIED_SELECT_STRATEGY(0),
  /**
   * <pre>
   * Match by the option's value, case insensitive.
   * </pre>
   *
   * <code>VALUE_MATCH = 1;</code>
   */
  VALUE_MATCH(1),
  /**
   * <pre>
   * Match by the option's label, case insensitive.
   * </pre>
   *
   * <code>LABEL_MATCH = 2;</code>
   */
  LABEL_MATCH(2),
  /**
   * <pre>
   * Match by the option's label by `label.startsWith`, case insensitive.
   * </pre>
   *
   * <code>LABEL_STARTS_WITH = 3;</code>
   */
  LABEL_STARTS_WITH(3),
  ;

  /**
   * <code>UNSPECIFIED_SELECT_STRATEGY = 0;</code>
   */
  public static final int UNSPECIFIED_SELECT_STRATEGY_VALUE = 0;
  /**
   * <pre>
   * Match by the option's value, case insensitive.
   * </pre>
   *
   * <code>VALUE_MATCH = 1;</code>
   */
  public static final int VALUE_MATCH_VALUE = 1;
  /**
   * <pre>
   * Match by the option's label, case insensitive.
   * </pre>
   *
   * <code>LABEL_MATCH = 2;</code>
   */
  public static final int LABEL_MATCH_VALUE = 2;
  /**
   * <pre>
   * Match by the option's label by `label.startsWith`, case insensitive.
   * </pre>
   *
   * <code>LABEL_STARTS_WITH = 3;</code>
   */
  public static final int LABEL_STARTS_WITH_VALUE = 3;


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
  public static DropdownSelectStrategy valueOf(int value) {
    return forNumber(value);
  }

  public static DropdownSelectStrategy forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED_SELECT_STRATEGY;
      case 1: return VALUE_MATCH;
      case 2: return LABEL_MATCH;
      case 3: return LABEL_STARTS_WITH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DropdownSelectStrategy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DropdownSelectStrategy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DropdownSelectStrategy>() {
          @java.lang.Override
          public DropdownSelectStrategy findValueByNumber(int number) {
            return DropdownSelectStrategy.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return DropdownSelectStrategyVerifier.INSTANCE;
  }

  private static final class DropdownSelectStrategyVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new DropdownSelectStrategyVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return DropdownSelectStrategy.forNumber(number) != null;
          }
        };

  private final int value;

  private DropdownSelectStrategy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:autofill_assistant.DropdownSelectStrategy)
}

