// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: testes_gRPC.proto

package io.grpc.dsid.testes;

public interface PersonReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:testes.PersonReply)
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
   * <code>.testes.PersonReply.Status stat = 3;</code>
   */
  int getStatValue();
  /**
   * <code>.testes.PersonReply.Status stat = 3;</code>
   */
  io.grpc.dsid.testes.PersonReply.Status getStat();
}