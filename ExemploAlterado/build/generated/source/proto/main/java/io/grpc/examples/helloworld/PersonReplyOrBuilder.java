// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.grpc.examples.helloworld;

public interface PersonReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.PersonReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.helloworld.PersonReply.Status stat = 3;</code>
   */
  int getStatValue();
  /**
   * <code>.helloworld.PersonReply.Status stat = 3;</code>
   */
  io.grpc.examples.helloworld.PersonReply.Status getStat();
}