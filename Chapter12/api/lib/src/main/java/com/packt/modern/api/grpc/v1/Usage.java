// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package com.packt.modern.api.grpc.v1;

/**
 * Protobuf enum {@code com.packtpub.v1.Usage}
 */
public enum Usage
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REUSABLE = 0;</code>
   */
  REUSABLE(0),
  /**
   * <code>SINGLEUSE = 1;</code>
   */
  SINGLEUSE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REUSABLE = 0;</code>
   */
  public static final int REUSABLE_VALUE = 0;
  /**
   * <code>SINGLEUSE = 1;</code>
   */
  public static final int SINGLEUSE_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Usage valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Usage forNumber(int value) {
    switch (value) {
      case 0: return REUSABLE;
      case 1: return SINGLEUSE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Usage>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Usage> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Usage>() {
          public Usage findValueByNumber(int number) {
            return Usage.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.packt.modern.api.grpc.v1.PaymentGatewayService.getDescriptor().getEnumTypes().get(1);
  }

  private static final Usage[] VALUES = values();

  public static Usage valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Usage(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.packtpub.v1.Usage)
}

