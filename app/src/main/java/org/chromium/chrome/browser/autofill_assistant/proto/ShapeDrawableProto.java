// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: browser/view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.ShapeDrawableProto}
 */
public  final class ShapeDrawableProto extends
    com.google.protobuf.GeneratedMessageLite<
        ShapeDrawableProto, ShapeDrawableProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ShapeDrawableProto)
    ShapeDrawableProtoOrBuilder {
  private ShapeDrawableProto() {
  }
  public interface RectangleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:autofill_assistant.ShapeDrawableProto.Rectangle)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
     * @return Whether the cornerRadius field is set.
     */
    boolean hasCornerRadius();
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
     * @return The cornerRadius.
     */
    org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getCornerRadius();
  }
  /**
   * Protobuf type {@code autofill_assistant.ShapeDrawableProto.Rectangle}
   */
  public  static final class Rectangle extends
      com.google.protobuf.GeneratedMessageLite<
          Rectangle, Rectangle.Builder> implements
      // @@protoc_insertion_point(message_implements:autofill_assistant.ShapeDrawableProto.Rectangle)
      RectangleOrBuilder {
    private Rectangle() {
    }
    private int bitField0_;
    public static final int CORNER_RADIUS_FIELD_NUMBER = 1;
    private org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto cornerRadius_;
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
     */
    @java.lang.Override
    public boolean hasCornerRadius() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getCornerRadius() {
      return cornerRadius_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.getDefaultInstance() : cornerRadius_;
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
     */
    private void setCornerRadius(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
      value.getClass();
  cornerRadius_ = value;
      bitField0_ |= 0x00000001;
      }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeCornerRadius(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
      value.getClass();
  if (cornerRadius_ != null &&
          cornerRadius_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.getDefaultInstance()) {
        cornerRadius_ =
          org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.newBuilder(cornerRadius_).mergeFrom(value).buildPartial();
      } else {
        cornerRadius_ = value;
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
     */
    private void clearCornerRadius() {  cornerRadius_ = null;
      bitField0_ = (bitField0_ & ~0x00000001);
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code autofill_assistant.ShapeDrawableProto.Rectangle}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle, Builder> implements
        // @@protoc_insertion_point(builder_implements:autofill_assistant.ShapeDrawableProto.Rectangle)
        org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.RectangleOrBuilder {
      // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
       */
      @java.lang.Override
      public boolean hasCornerRadius() {
        return instance.hasCornerRadius();
      }
      /**
       * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
       */
      @java.lang.Override
      public org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getCornerRadius() {
        return instance.getCornerRadius();
      }
      /**
       * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
       */
      public Builder setCornerRadius(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
        copyOnWrite();
        instance.setCornerRadius(value);
        return this;
        }
      /**
       * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
       */
      public Builder setCornerRadius(
          org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.Builder builderForValue) {
        copyOnWrite();
        instance.setCornerRadius(builderForValue.build());
        return this;
      }
      /**
       * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
       */
      public Builder mergeCornerRadius(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
        copyOnWrite();
        instance.mergeCornerRadius(value);
        return this;
      }
      /**
       * <code>optional .autofill_assistant.ClientDimensionProto corner_radius = 1;</code>
       */
      public Builder clearCornerRadius() {  copyOnWrite();
        instance.clearCornerRadius();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:autofill_assistant.ShapeDrawableProto.Rectangle)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "cornerRadius_",
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle>(
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


    // @@protoc_insertion_point(class_scope:autofill_assistant.ShapeDrawableProto.Rectangle)
    private static final org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle DEFAULT_INSTANCE;
    static {
      Rectangle defaultInstance = new Rectangle();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Rectangle.class, defaultInstance);
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Rectangle> PARSER;

    public static com.google.protobuf.Parser<Rectangle> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  private int bitField0_;
  private int shapeCase_ = 0;
  private java.lang.Object shape_;
  public enum ShapeCase {
    RECTANGLE(1),
    SHAPE_NOT_SET(0);
    private final int value;
    private ShapeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ShapeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ShapeCase forNumber(int value) {
      switch (value) {
        case 1: return RECTANGLE;
        case 0: return SHAPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ShapeCase
  getShapeCase() {
    return ShapeCase.forNumber(
        shapeCase_);
  }

  private void clearShape() {
    shapeCase_ = 0;
    shape_ = null;
  }

  public static final int RECTANGLE_FIELD_NUMBER = 1;
  /**
   * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
   */
  @java.lang.Override
  public boolean hasRectangle() {
    return shapeCase_ == 1;
  }
  /**
   * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle getRectangle() {
    if (shapeCase_ == 1) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle) shape_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle.getDefaultInstance();
  }
  /**
   * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
   */
  private void setRectangle(org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle value) {
    value.getClass();
  shape_ = value;
    shapeCase_ = 1;
  }
  /**
   * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
   */
  private void mergeRectangle(org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle value) {
    value.getClass();
  if (shapeCase_ == 1 &&
        shape_ != org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle.getDefaultInstance()) {
      shape_ = org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle) shape_)
          .mergeFrom(value).buildPartial();
    } else {
      shape_ = value;
    }
    shapeCase_ = 1;
  }
  /**
   * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
   */
  private void clearRectangle() {
    if (shapeCase_ == 1) {
      shapeCase_ = 0;
      shape_ = null;
    }
  }

  public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.ColorProto backgroundColor_;
  /**
   * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
   */
  @java.lang.Override
  public boolean hasBackgroundColor() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ColorProto getBackgroundColor() {
    return backgroundColor_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.getDefaultInstance() : backgroundColor_;
  }
  /**
   * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
   */
  private void setBackgroundColor(org.chromium.chrome.browser.autofill_assistant.proto.ColorProto value) {
    value.getClass();
  backgroundColor_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeBackgroundColor(org.chromium.chrome.browser.autofill_assistant.proto.ColorProto value) {
    value.getClass();
  if (backgroundColor_ != null &&
        backgroundColor_ != org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.getDefaultInstance()) {
      backgroundColor_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.newBuilder(backgroundColor_).mergeFrom(value).buildPartial();
    } else {
      backgroundColor_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
   */
  private void clearBackgroundColor() {  backgroundColor_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int STROKE_WIDTH_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto strokeWidth_;
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
   */
  @java.lang.Override
  public boolean hasStrokeWidth() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getStrokeWidth() {
    return strokeWidth_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.getDefaultInstance() : strokeWidth_;
  }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
   */
  private void setStrokeWidth(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
    value.getClass();
  strokeWidth_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeStrokeWidth(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
    value.getClass();
  if (strokeWidth_ != null &&
        strokeWidth_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.getDefaultInstance()) {
      strokeWidth_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.newBuilder(strokeWidth_).mergeFrom(value).buildPartial();
    } else {
      strokeWidth_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
   */
  private void clearStrokeWidth() {  strokeWidth_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static final int STROKE_COLOR_FIELD_NUMBER = 4;
  private org.chromium.chrome.browser.autofill_assistant.proto.ColorProto strokeColor_;
  /**
   * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
   */
  @java.lang.Override
  public boolean hasStrokeColor() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ColorProto getStrokeColor() {
    return strokeColor_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.getDefaultInstance() : strokeColor_;
  }
  /**
   * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
   */
  private void setStrokeColor(org.chromium.chrome.browser.autofill_assistant.proto.ColorProto value) {
    value.getClass();
  strokeColor_ = value;
    bitField0_ |= 0x00000008;
    }
  /**
   * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeStrokeColor(org.chromium.chrome.browser.autofill_assistant.proto.ColorProto value) {
    value.getClass();
  if (strokeColor_ != null &&
        strokeColor_ != org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.getDefaultInstance()) {
      strokeColor_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.newBuilder(strokeColor_).mergeFrom(value).buildPartial();
    } else {
      strokeColor_ = value;
    }
    bitField0_ |= 0x00000008;
  }
  /**
   * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
   */
  private void clearStrokeColor() {  strokeColor_ = null;
    bitField0_ = (bitField0_ & ~0x00000008);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.ShapeDrawableProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ShapeDrawableProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public ShapeCase
        getShapeCase() {
      return instance.getShapeCase();
    }

    public Builder clearShape() {
      copyOnWrite();
      instance.clearShape();
      return this;
    }


    /**
     * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
     */
    @java.lang.Override
    public boolean hasRectangle() {
      return instance.hasRectangle();
    }
    /**
     * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle getRectangle() {
      return instance.getRectangle();
    }
    /**
     * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
     */
    public Builder setRectangle(org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle value) {
      copyOnWrite();
      instance.setRectangle(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
     */
    public Builder setRectangle(
        org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle.Builder builderForValue) {
      copyOnWrite();
      instance.setRectangle(builderForValue.build());
      return this;
    }
    /**
     * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
     */
    public Builder mergeRectangle(org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle value) {
      copyOnWrite();
      instance.mergeRectangle(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
     */
    public Builder clearRectangle() {
      copyOnWrite();
      instance.clearRectangle();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
     */
    @java.lang.Override
    public boolean hasBackgroundColor() {
      return instance.hasBackgroundColor();
    }
    /**
     * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ColorProto getBackgroundColor() {
      return instance.getBackgroundColor();
    }
    /**
     * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
     */
    public Builder setBackgroundColor(org.chromium.chrome.browser.autofill_assistant.proto.ColorProto value) {
      copyOnWrite();
      instance.setBackgroundColor(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
     */
    public Builder setBackgroundColor(
        org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.Builder builderForValue) {
      copyOnWrite();
      instance.setBackgroundColor(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
     */
    public Builder mergeBackgroundColor(org.chromium.chrome.browser.autofill_assistant.proto.ColorProto value) {
      copyOnWrite();
      instance.mergeBackgroundColor(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
     */
    public Builder clearBackgroundColor() {  copyOnWrite();
      instance.clearBackgroundColor();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
     */
    @java.lang.Override
    public boolean hasStrokeWidth() {
      return instance.hasStrokeWidth();
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getStrokeWidth() {
      return instance.getStrokeWidth();
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
     */
    public Builder setStrokeWidth(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
      copyOnWrite();
      instance.setStrokeWidth(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
     */
    public Builder setStrokeWidth(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setStrokeWidth(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
     */
    public Builder mergeStrokeWidth(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
      copyOnWrite();
      instance.mergeStrokeWidth(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
     */
    public Builder clearStrokeWidth() {  copyOnWrite();
      instance.clearStrokeWidth();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
     */
    @java.lang.Override
    public boolean hasStrokeColor() {
      return instance.hasStrokeColor();
    }
    /**
     * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ColorProto getStrokeColor() {
      return instance.getStrokeColor();
    }
    /**
     * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
     */
    public Builder setStrokeColor(org.chromium.chrome.browser.autofill_assistant.proto.ColorProto value) {
      copyOnWrite();
      instance.setStrokeColor(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
     */
    public Builder setStrokeColor(
        org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.Builder builderForValue) {
      copyOnWrite();
      instance.setStrokeColor(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
     */
    public Builder mergeStrokeColor(org.chromium.chrome.browser.autofill_assistant.proto.ColorProto value) {
      copyOnWrite();
      instance.mergeStrokeColor(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
     */
    public Builder clearStrokeColor() {  copyOnWrite();
      instance.clearStrokeColor();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ShapeDrawableProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "shape_",
            "shapeCase_",
            "bitField0_",
            org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle.class,
            "backgroundColor_",
            "strokeWidth_",
            "strokeColor_",
          };
          java.lang.String info =
              "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103c\u0000\u0002" +
              "\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ShapeDrawableProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto DEFAULT_INSTANCE;
  static {
    ShapeDrawableProto defaultInstance = new ShapeDrawableProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ShapeDrawableProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ShapeDrawableProto> PARSER;

  public static com.google.protobuf.Parser<ShapeDrawableProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

