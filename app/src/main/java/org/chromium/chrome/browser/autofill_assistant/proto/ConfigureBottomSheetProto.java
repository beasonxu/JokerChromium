// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Allow scripts to configure the peek height of the sheet and whether we should
 * resize the viewport by this peek height. If talkback is enabled, the mode is
 * set to RESIZE_VISUAL_VIEWPORT. Changes to the mode are only applied after
 * talkback is disabled.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ConfigureBottomSheetProto}
 */
public  final class ConfigureBottomSheetProto extends
    com.google.protobuf.GeneratedMessageLite<
        ConfigureBottomSheetProto, ConfigureBottomSheetProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ConfigureBottomSheetProto)
    ConfigureBottomSheetProtoOrBuilder {
  private ConfigureBottomSheetProto() {
  }
  /**
   * Protobuf enum {@code autofill_assistant.ConfigureBottomSheetProto.ViewportResizing}
   */
  public enum ViewportResizing
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <pre>
     * Don't change resizing configuration.
     * </pre>
     *
     * <code>NO_CHANGE = 0;</code>
     */
    NO_CHANGE(0),
    /**
     * <pre>
     * Resize the layout viewport such that it is completely visible when the
     * sheet is in the peek state.
     * </pre>
     *
     * <code>RESIZE_LAYOUT_VIEWPORT = 1;</code>
     */
    RESIZE_LAYOUT_VIEWPORT(1),
    /**
     * <pre>
     * Don't resize the viewport such that it is overlaid by the sheet, even in
     * the peek state.
     * </pre>
     *
     * <code>NO_RESIZE = 2;</code>
     */
    NO_RESIZE(2),
    /**
     * <pre>
     * Dynamically resize the visual viewport by the height of the sheet. This
     * allows to fully scroll the page above the sheet at any time.
     * </pre>
     *
     * <code>RESIZE_VISUAL_VIEWPORT = 3;</code>
     */
    RESIZE_VISUAL_VIEWPORT(3),
    ;

    /**
     * <pre>
     * Don't change resizing configuration.
     * </pre>
     *
     * <code>NO_CHANGE = 0;</code>
     */
    public static final int NO_CHANGE_VALUE = 0;
    /**
     * <pre>
     * Resize the layout viewport such that it is completely visible when the
     * sheet is in the peek state.
     * </pre>
     *
     * <code>RESIZE_LAYOUT_VIEWPORT = 1;</code>
     */
    public static final int RESIZE_LAYOUT_VIEWPORT_VALUE = 1;
    /**
     * <pre>
     * Don't resize the viewport such that it is overlaid by the sheet, even in
     * the peek state.
     * </pre>
     *
     * <code>NO_RESIZE = 2;</code>
     */
    public static final int NO_RESIZE_VALUE = 2;
    /**
     * <pre>
     * Dynamically resize the visual viewport by the height of the sheet. This
     * allows to fully scroll the page above the sheet at any time.
     * </pre>
     *
     * <code>RESIZE_VISUAL_VIEWPORT = 3;</code>
     */
    public static final int RESIZE_VISUAL_VIEWPORT_VALUE = 3;


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
    public static ViewportResizing valueOf(int value) {
      return forNumber(value);
    }

    public static ViewportResizing forNumber(int value) {
      switch (value) {
        case 0: return NO_CHANGE;
        case 1: return RESIZE_LAYOUT_VIEWPORT;
        case 2: return NO_RESIZE;
        case 3: return RESIZE_VISUAL_VIEWPORT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ViewportResizing>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ViewportResizing> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ViewportResizing>() {
            @java.lang.Override
            public ViewportResizing findValueByNumber(int number) {
              return ViewportResizing.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return ViewportResizingVerifier.INSTANCE;
    }

    private static final class ViewportResizingVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new ViewportResizingVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return ViewportResizing.forNumber(number) != null;
            }
          };

    private final int value;

    private ViewportResizing(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:autofill_assistant.ConfigureBottomSheetProto.ViewportResizing)
  }

  /**
   * <pre>
   * The peek mode allows to set what components are visible when the sheet is
   * in the peek (minimized) state.
   * </pre>
   *
   * Protobuf enum {@code autofill_assistant.ConfigureBottomSheetProto.PeekMode}
   */
  public enum PeekMode
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>UNDEFINED_PEEK_MODE = 0;</code>
     */
    UNDEFINED_PEEK_MODE(0),
    /**
     * <pre>
     * Only show the swipe handle.
     * </pre>
     *
     * <code>HANDLE = 1;</code>
     */
    HANDLE(1),
    /**
     * <pre>
     * Show the swipe handle, header (status message, poodle, profile icon) and
     * progress bar.
     * </pre>
     *
     * <code>HANDLE_HEADER = 2;</code>
     */
    HANDLE_HEADER(2),
    /**
     * <pre>
     * Show swipe handle, header, progress bar, suggestions and actions.
     * </pre>
     *
     * <code>HANDLE_HEADER_CAROUSELS = 3;</code>
     */
    HANDLE_HEADER_CAROUSELS(3),
    ;

    /**
     * <code>UNDEFINED_PEEK_MODE = 0;</code>
     */
    public static final int UNDEFINED_PEEK_MODE_VALUE = 0;
    /**
     * <pre>
     * Only show the swipe handle.
     * </pre>
     *
     * <code>HANDLE = 1;</code>
     */
    public static final int HANDLE_VALUE = 1;
    /**
     * <pre>
     * Show the swipe handle, header (status message, poodle, profile icon) and
     * progress bar.
     * </pre>
     *
     * <code>HANDLE_HEADER = 2;</code>
     */
    public static final int HANDLE_HEADER_VALUE = 2;
    /**
     * <pre>
     * Show swipe handle, header, progress bar, suggestions and actions.
     * </pre>
     *
     * <code>HANDLE_HEADER_CAROUSELS = 3;</code>
     */
    public static final int HANDLE_HEADER_CAROUSELS_VALUE = 3;


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
    public static PeekMode valueOf(int value) {
      return forNumber(value);
    }

    public static PeekMode forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_PEEK_MODE;
        case 1: return HANDLE;
        case 2: return HANDLE_HEADER;
        case 3: return HANDLE_HEADER_CAROUSELS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PeekMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PeekMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PeekMode>() {
            @java.lang.Override
            public PeekMode findValueByNumber(int number) {
              return PeekMode.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return PeekModeVerifier.INSTANCE;
    }

    private static final class PeekModeVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new PeekModeVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return PeekMode.forNumber(number) != null;
            }
          };

    private final int value;

    private PeekMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:autofill_assistant.ConfigureBottomSheetProto.PeekMode)
  }

  private int bitField0_;
  private int applyStateCase_ = 0;
  private java.lang.Object applyState_;
  public enum ApplyStateCase {
    EXPAND(4),
    COLLAPSE(5),
    APPLYSTATE_NOT_SET(0);
    private final int value;
    private ApplyStateCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ApplyStateCase valueOf(int value) {
      return forNumber(value);
    }

    public static ApplyStateCase forNumber(int value) {
      switch (value) {
        case 4: return EXPAND;
        case 5: return COLLAPSE;
        case 0: return APPLYSTATE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ApplyStateCase
  getApplyStateCase() {
    return ApplyStateCase.forNumber(
        applyStateCase_);
  }

  private void clearApplyState() {
    applyStateCase_ = 0;
    applyState_ = null;
  }

  public static final int VIEWPORT_RESIZING_FIELD_NUMBER = 1;
  private int viewportResizing_;
  /**
   * <pre>
   * Whether the viewport should be resized. Resizing the viewport is an
   * expensive operation, so toggling the resize on/off should be done
   * cautiously.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
   * @return Whether the viewportResizing field is set.
   */
  @java.lang.Override
  public boolean hasViewportResizing() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Whether the viewport should be resized. Resizing the viewport is an
   * expensive operation, so toggling the resize on/off should be done
   * cautiously.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
   * @return The viewportResizing.
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.ViewportResizing getViewportResizing() {
    org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.ViewportResizing result = org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.ViewportResizing.forNumber(viewportResizing_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.ViewportResizing.NO_CHANGE : result;
  }
  /**
   * <pre>
   * Whether the viewport should be resized. Resizing the viewport is an
   * expensive operation, so toggling the resize on/off should be done
   * cautiously.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
   * @param value The viewportResizing to set.
   */
  private void setViewportResizing(org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.ViewportResizing value) {
    viewportResizing_ = value.getNumber();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Whether the viewport should be resized. Resizing the viewport is an
   * expensive operation, so toggling the resize on/off should be done
   * cautiously.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
   */
  private void clearViewportResizing() {
    bitField0_ = (bitField0_ & ~0x00000001);
    viewportResizing_ = 0;
  }

  public static final int PEEK_MODE_FIELD_NUMBER = 2;
  private int peekMode_;
  /**
   * <pre>
   * Set the peek mode. This will change the peek mode of the sheet without
   * actually updating the sheet to that setting. If viewport_resizing is set
   * to RESIZE_LAYOUT_VIEWPORT or was set by a previous ConfigureBottomSheet
   * action, the viewport will be resized to match the new peek height.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
   * @return Whether the peekMode field is set.
   */
  @java.lang.Override
  public boolean hasPeekMode() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Set the peek mode. This will change the peek mode of the sheet without
   * actually updating the sheet to that setting. If viewport_resizing is set
   * to RESIZE_LAYOUT_VIEWPORT or was set by a previous ConfigureBottomSheet
   * action, the viewport will be resized to match the new peek height.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
   * @return The peekMode.
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.PeekMode getPeekMode() {
    org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.PeekMode result = org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.PeekMode.forNumber(peekMode_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.PeekMode.UNDEFINED_PEEK_MODE : result;
  }
  /**
   * <pre>
   * Set the peek mode. This will change the peek mode of the sheet without
   * actually updating the sheet to that setting. If viewport_resizing is set
   * to RESIZE_LAYOUT_VIEWPORT or was set by a previous ConfigureBottomSheet
   * action, the viewport will be resized to match the new peek height.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
   * @param value The peekMode to set.
   */
  private void setPeekMode(org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.PeekMode value) {
    peekMode_ = value.getNumber();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * Set the peek mode. This will change the peek mode of the sheet without
   * actually updating the sheet to that setting. If viewport_resizing is set
   * to RESIZE_LAYOUT_VIEWPORT or was set by a previous ConfigureBottomSheet
   * action, the viewport will be resized to match the new peek height.
   * </pre>
   *
   * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
   */
  private void clearPeekMode() {
    bitField0_ = (bitField0_ & ~0x00000002);
    peekMode_ = 0;
  }

  public static final int RESIZE_TIMEOUT_MS_FIELD_NUMBER = 3;
  private int resizeTimeoutMs_;
  /**
   * <pre>
   * Maximum time to wait for the window to resize before continuing with the
   * script. If 0 or unset, the action doesn't wait.
   * </pre>
   *
   * <code>optional int32 resize_timeout_ms = 3;</code>
   * @return Whether the resizeTimeoutMs field is set.
   */
  @java.lang.Override
  public boolean hasResizeTimeoutMs() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Maximum time to wait for the window to resize before continuing with the
   * script. If 0 or unset, the action doesn't wait.
   * </pre>
   *
   * <code>optional int32 resize_timeout_ms = 3;</code>
   * @return The resizeTimeoutMs.
   */
  @java.lang.Override
  public int getResizeTimeoutMs() {
    return resizeTimeoutMs_;
  }
  /**
   * <pre>
   * Maximum time to wait for the window to resize before continuing with the
   * script. If 0 or unset, the action doesn't wait.
   * </pre>
   *
   * <code>optional int32 resize_timeout_ms = 3;</code>
   * @param value The resizeTimeoutMs to set.
   */
  private void setResizeTimeoutMs(int value) {
    bitField0_ |= 0x00000004;
    resizeTimeoutMs_ = value;
  }
  /**
   * <pre>
   * Maximum time to wait for the window to resize before continuing with the
   * script. If 0 or unset, the action doesn't wait.
   * </pre>
   *
   * <code>optional int32 resize_timeout_ms = 3;</code>
   */
  private void clearResizeTimeoutMs() {
    bitField0_ = (bitField0_ & ~0x00000004);
    resizeTimeoutMs_ = 0;
  }

  public static final int EXPAND_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Go to the expanded state (same as if the user swiped the bottom sheet
   * up).
   * </pre>
   *
   * <code>bool expand = 4;</code>
   * @return Whether the expand field is set.
   */
  @java.lang.Override
  public boolean hasExpand() {
    return applyStateCase_ == 4;
  }
  /**
   * <pre>
   * Go to the expanded state (same as if the user swiped the bottom sheet
   * up).
   * </pre>
   *
   * <code>bool expand = 4;</code>
   * @return The expand.
   */
  @java.lang.Override
  public boolean getExpand() {
    if (applyStateCase_ == 4) {
      return (java.lang.Boolean) applyState_;
    }
    return false;
  }
  /**
   * <pre>
   * Go to the expanded state (same as if the user swiped the bottom sheet
   * up).
   * </pre>
   *
   * <code>bool expand = 4;</code>
   * @param value The expand to set.
   */
  private void setExpand(boolean value) {
    applyStateCase_ = 4;
    applyState_ = value;
  }
  /**
   * <pre>
   * Go to the expanded state (same as if the user swiped the bottom sheet
   * up).
   * </pre>
   *
   * <code>bool expand = 4;</code>
   */
  private void clearExpand() {
    if (applyStateCase_ == 4) {
      applyStateCase_ = 0;
      applyState_ = null;
    }
  }

  public static final int COLLAPSE_FIELD_NUMBER = 5;
  /**
   * <pre>
   * Go to the peek state (same as if the user swiped the bottom
   * sheet down).
   * </pre>
   *
   * <code>bool collapse = 5;</code>
   * @return Whether the collapse field is set.
   */
  @java.lang.Override
  public boolean hasCollapse() {
    return applyStateCase_ == 5;
  }
  /**
   * <pre>
   * Go to the peek state (same as if the user swiped the bottom
   * sheet down).
   * </pre>
   *
   * <code>bool collapse = 5;</code>
   * @return The collapse.
   */
  @java.lang.Override
  public boolean getCollapse() {
    if (applyStateCase_ == 5) {
      return (java.lang.Boolean) applyState_;
    }
    return false;
  }
  /**
   * <pre>
   * Go to the peek state (same as if the user swiped the bottom
   * sheet down).
   * </pre>
   *
   * <code>bool collapse = 5;</code>
   * @param value The collapse to set.
   */
  private void setCollapse(boolean value) {
    applyStateCase_ = 5;
    applyState_ = value;
  }
  /**
   * <pre>
   * Go to the peek state (same as if the user swiped the bottom
   * sheet down).
   * </pre>
   *
   * <code>bool collapse = 5;</code>
   */
  private void clearCollapse() {
    if (applyStateCase_ == 5) {
      applyStateCase_ = 0;
      applyState_ = null;
    }
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Allow scripts to configure the peek height of the sheet and whether we should
   * resize the viewport by this peek height. If talkback is enabled, the mode is
   * set to RESIZE_VISUAL_VIEWPORT. Changes to the mode are only applied after
   * talkback is disabled.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ConfigureBottomSheetProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ConfigureBottomSheetProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public ApplyStateCase
        getApplyStateCase() {
      return instance.getApplyStateCase();
    }

    public Builder clearApplyState() {
      copyOnWrite();
      instance.clearApplyState();
      return this;
    }


    /**
     * <pre>
     * Whether the viewport should be resized. Resizing the viewport is an
     * expensive operation, so toggling the resize on/off should be done
     * cautiously.
     * </pre>
     *
     * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
     * @return Whether the viewportResizing field is set.
     */
    @java.lang.Override
    public boolean hasViewportResizing() {
      return instance.hasViewportResizing();
    }
    /**
     * <pre>
     * Whether the viewport should be resized. Resizing the viewport is an
     * expensive operation, so toggling the resize on/off should be done
     * cautiously.
     * </pre>
     *
     * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
     * @return The viewportResizing.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.ViewportResizing getViewportResizing() {
      return instance.getViewportResizing();
    }
    /**
     * <pre>
     * Whether the viewport should be resized. Resizing the viewport is an
     * expensive operation, so toggling the resize on/off should be done
     * cautiously.
     * </pre>
     *
     * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
     * @param value The enum numeric value on the wire for viewportResizing to set.
     * @return This builder for chaining.
     */
    public Builder setViewportResizing(org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.ViewportResizing value) {
      copyOnWrite();
      instance.setViewportResizing(value);
      return this;
    }
    /**
     * <pre>
     * Whether the viewport should be resized. Resizing the viewport is an
     * expensive operation, so toggling the resize on/off should be done
     * cautiously.
     * </pre>
     *
     * <code>optional .autofill_assistant.ConfigureBottomSheetProto.ViewportResizing viewport_resizing = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearViewportResizing() {
      copyOnWrite();
      instance.clearViewportResizing();
      return this;
    }

    /**
     * <pre>
     * Set the peek mode. This will change the peek mode of the sheet without
     * actually updating the sheet to that setting. If viewport_resizing is set
     * to RESIZE_LAYOUT_VIEWPORT or was set by a previous ConfigureBottomSheet
     * action, the viewport will be resized to match the new peek height.
     * </pre>
     *
     * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
     * @return Whether the peekMode field is set.
     */
    @java.lang.Override
    public boolean hasPeekMode() {
      return instance.hasPeekMode();
    }
    /**
     * <pre>
     * Set the peek mode. This will change the peek mode of the sheet without
     * actually updating the sheet to that setting. If viewport_resizing is set
     * to RESIZE_LAYOUT_VIEWPORT or was set by a previous ConfigureBottomSheet
     * action, the viewport will be resized to match the new peek height.
     * </pre>
     *
     * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
     * @return The peekMode.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.PeekMode getPeekMode() {
      return instance.getPeekMode();
    }
    /**
     * <pre>
     * Set the peek mode. This will change the peek mode of the sheet without
     * actually updating the sheet to that setting. If viewport_resizing is set
     * to RESIZE_LAYOUT_VIEWPORT or was set by a previous ConfigureBottomSheet
     * action, the viewport will be resized to match the new peek height.
     * </pre>
     *
     * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
     * @param value The enum numeric value on the wire for peekMode to set.
     * @return This builder for chaining.
     */
    public Builder setPeekMode(org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.PeekMode value) {
      copyOnWrite();
      instance.setPeekMode(value);
      return this;
    }
    /**
     * <pre>
     * Set the peek mode. This will change the peek mode of the sheet without
     * actually updating the sheet to that setting. If viewport_resizing is set
     * to RESIZE_LAYOUT_VIEWPORT or was set by a previous ConfigureBottomSheet
     * action, the viewport will be resized to match the new peek height.
     * </pre>
     *
     * <code>optional .autofill_assistant.ConfigureBottomSheetProto.PeekMode peek_mode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPeekMode() {
      copyOnWrite();
      instance.clearPeekMode();
      return this;
    }

    /**
     * <pre>
     * Maximum time to wait for the window to resize before continuing with the
     * script. If 0 or unset, the action doesn't wait.
     * </pre>
     *
     * <code>optional int32 resize_timeout_ms = 3;</code>
     * @return Whether the resizeTimeoutMs field is set.
     */
    @java.lang.Override
    public boolean hasResizeTimeoutMs() {
      return instance.hasResizeTimeoutMs();
    }
    /**
     * <pre>
     * Maximum time to wait for the window to resize before continuing with the
     * script. If 0 or unset, the action doesn't wait.
     * </pre>
     *
     * <code>optional int32 resize_timeout_ms = 3;</code>
     * @return The resizeTimeoutMs.
     */
    @java.lang.Override
    public int getResizeTimeoutMs() {
      return instance.getResizeTimeoutMs();
    }
    /**
     * <pre>
     * Maximum time to wait for the window to resize before continuing with the
     * script. If 0 or unset, the action doesn't wait.
     * </pre>
     *
     * <code>optional int32 resize_timeout_ms = 3;</code>
     * @param value The resizeTimeoutMs to set.
     * @return This builder for chaining.
     */
    public Builder setResizeTimeoutMs(int value) {
      copyOnWrite();
      instance.setResizeTimeoutMs(value);
      return this;
    }
    /**
     * <pre>
     * Maximum time to wait for the window to resize before continuing with the
     * script. If 0 or unset, the action doesn't wait.
     * </pre>
     *
     * <code>optional int32 resize_timeout_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearResizeTimeoutMs() {
      copyOnWrite();
      instance.clearResizeTimeoutMs();
      return this;
    }

    /**
     * <pre>
     * Go to the expanded state (same as if the user swiped the bottom sheet
     * up).
     * </pre>
     *
     * <code>bool expand = 4;</code>
     * @return Whether the expand field is set.
     */
    @java.lang.Override
    public boolean hasExpand() {
      return instance.hasExpand();
    }
    /**
     * <pre>
     * Go to the expanded state (same as if the user swiped the bottom sheet
     * up).
     * </pre>
     *
     * <code>bool expand = 4;</code>
     * @return The expand.
     */
    @java.lang.Override
    public boolean getExpand() {
      return instance.getExpand();
    }
    /**
     * <pre>
     * Go to the expanded state (same as if the user swiped the bottom sheet
     * up).
     * </pre>
     *
     * <code>bool expand = 4;</code>
     * @param value The expand to set.
     * @return This builder for chaining.
     */
    public Builder setExpand(boolean value) {
      copyOnWrite();
      instance.setExpand(value);
      return this;
    }
    /**
     * <pre>
     * Go to the expanded state (same as if the user swiped the bottom sheet
     * up).
     * </pre>
     *
     * <code>bool expand = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpand() {
      copyOnWrite();
      instance.clearExpand();
      return this;
    }

    /**
     * <pre>
     * Go to the peek state (same as if the user swiped the bottom
     * sheet down).
     * </pre>
     *
     * <code>bool collapse = 5;</code>
     * @return Whether the collapse field is set.
     */
    @java.lang.Override
    public boolean hasCollapse() {
      return instance.hasCollapse();
    }
    /**
     * <pre>
     * Go to the peek state (same as if the user swiped the bottom
     * sheet down).
     * </pre>
     *
     * <code>bool collapse = 5;</code>
     * @return The collapse.
     */
    @java.lang.Override
    public boolean getCollapse() {
      return instance.getCollapse();
    }
    /**
     * <pre>
     * Go to the peek state (same as if the user swiped the bottom
     * sheet down).
     * </pre>
     *
     * <code>bool collapse = 5;</code>
     * @param value The collapse to set.
     * @return This builder for chaining.
     */
    public Builder setCollapse(boolean value) {
      copyOnWrite();
      instance.setCollapse(value);
      return this;
    }
    /**
     * <pre>
     * Go to the peek state (same as if the user swiped the bottom
     * sheet down).
     * </pre>
     *
     * <code>bool collapse = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCollapse() {
      copyOnWrite();
      instance.clearCollapse();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ConfigureBottomSheetProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "applyState_",
            "applyStateCase_",
            "bitField0_",
            "viewportResizing_",
            org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.ViewportResizing.internalGetVerifier(),
            "peekMode_",
            org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.PeekMode.internalGetVerifier(),
            "resizeTimeoutMs_",
          };
          java.lang.String info =
              "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002" +
              "\u100c\u0001\u0003\u1004\u0002\u0004\u103a\u0000\u0005\u103a\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.ConfigureBottomSheetProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto DEFAULT_INSTANCE;
  static {
    ConfigureBottomSheetProto defaultInstance = new ConfigureBottomSheetProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ConfigureBottomSheetProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ConfigureBottomSheetProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ConfigureBottomSheetProto> PARSER;

  public static com.google.protobuf.Parser<ConfigureBottomSheetProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
