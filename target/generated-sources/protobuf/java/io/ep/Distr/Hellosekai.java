// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hellosekai.proto

package io.ep.Distr;

public final class Hellosekai {
  private Hellosekai() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_theVoid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_theVoid_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_theLong_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_theLong_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LongFamily_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LongFamily_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_theString_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_theString_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_PhoneNumber_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020hellosekai.proto\"\t\n\007theVoid\"\030\n\007theLong" +
      "\022\r\n\005value\030\001 \001(\003\"\033\n\nLongFamily\022\r\n\005value\030\001" +
      " \003(\003\"\032\n\ttheString\022\r\n\005value\030\001 \001(\t\"\303\001\n\006Per" +
      "son\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\005\022\r\n\005email\030\003" +
      " \001(\t\022#\n\006phones\030\004 \003(\0132\023.Person.PhoneNumbe" +
      "r\032>\n\013PhoneNumber\022\016\n\006number\030\001 \001(\t\022\037\n\004type" +
      "\030\002 \001(\0162\021.Person.PhoneType\"+\n\tPhoneType\022\n" +
      "\n\006MOBILE\020\000\022\010\n\004HOME\020\001\022\010\n\004WORK\020\0022\301\001\n\005Distr" +
      "\022 \n\010SendVoid\022\010.theVoid\032\010.theVoid\"\000\022 \n\010Se" +
      "ndLong\022\010.theLong\032\010.theLong\"\000\022)\n\016SendLong" +
      "Family\022\013.LongFamily\032\010.theLong\"\000\022&\n\nSendS" +
      "tring\022\n.theString\032\n.theString\"\000\022!\n\013SendC" +
      "omplex\022\007.Person\032\007.Person\"\000B\017\n\013io.ep.Dist" +
      "rP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_theVoid_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_theVoid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_theVoid_descriptor,
        new java.lang.String[] { });
    internal_static_theLong_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_theLong_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_theLong_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_LongFamily_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LongFamily_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LongFamily_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_theString_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_theString_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_theString_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", });
    internal_static_Person_PhoneNumber_descriptor =
      internal_static_Person_descriptor.getNestedTypes().get(0);
    internal_static_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}