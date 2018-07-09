package io.grpc.dsid.testes;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: testes_gRPC.proto")
public final class DsidServicoGrpc {

  private DsidServicoGrpc() {}

  public static final String SERVICE_NAME = "testes.DsidServico";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.dsid.testes.StringRequest,
      io.grpc.dsid.testes.StringReply> getSayStringMethod;

  public static io.grpc.MethodDescriptor<io.grpc.dsid.testes.StringRequest,
      io.grpc.dsid.testes.StringReply> getSayStringMethod() {
    io.grpc.MethodDescriptor<io.grpc.dsid.testes.StringRequest, io.grpc.dsid.testes.StringReply> getSayStringMethod;
    if ((getSayStringMethod = DsidServicoGrpc.getSayStringMethod) == null) {
      synchronized (DsidServicoGrpc.class) {
        if ((getSayStringMethod = DsidServicoGrpc.getSayStringMethod) == null) {
          DsidServicoGrpc.getSayStringMethod = getSayStringMethod = 
              io.grpc.MethodDescriptor.<io.grpc.dsid.testes.StringRequest, io.grpc.dsid.testes.StringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "testes.DsidServico", "SayString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.StringReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DsidServicoMethodDescriptorSupplier("SayString"))
                  .build();
          }
        }
     }
     return getSayStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.dsid.testes.VoidRequest,
      io.grpc.dsid.testes.VoidReply> getSayVoidMethod;

  public static io.grpc.MethodDescriptor<io.grpc.dsid.testes.VoidRequest,
      io.grpc.dsid.testes.VoidReply> getSayVoidMethod() {
    io.grpc.MethodDescriptor<io.grpc.dsid.testes.VoidRequest, io.grpc.dsid.testes.VoidReply> getSayVoidMethod;
    if ((getSayVoidMethod = DsidServicoGrpc.getSayVoidMethod) == null) {
      synchronized (DsidServicoGrpc.class) {
        if ((getSayVoidMethod = DsidServicoGrpc.getSayVoidMethod) == null) {
          DsidServicoGrpc.getSayVoidMethod = getSayVoidMethod = 
              io.grpc.MethodDescriptor.<io.grpc.dsid.testes.VoidRequest, io.grpc.dsid.testes.VoidReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "testes.DsidServico", "SayVoid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.VoidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.VoidReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DsidServicoMethodDescriptorSupplier("SayVoid"))
                  .build();
          }
        }
     }
     return getSayVoidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.dsid.testes.LongRequest,
      io.grpc.dsid.testes.LongReply> getSayLongMethod;

  public static io.grpc.MethodDescriptor<io.grpc.dsid.testes.LongRequest,
      io.grpc.dsid.testes.LongReply> getSayLongMethod() {
    io.grpc.MethodDescriptor<io.grpc.dsid.testes.LongRequest, io.grpc.dsid.testes.LongReply> getSayLongMethod;
    if ((getSayLongMethod = DsidServicoGrpc.getSayLongMethod) == null) {
      synchronized (DsidServicoGrpc.class) {
        if ((getSayLongMethod = DsidServicoGrpc.getSayLongMethod) == null) {
          DsidServicoGrpc.getSayLongMethod = getSayLongMethod = 
              io.grpc.MethodDescriptor.<io.grpc.dsid.testes.LongRequest, io.grpc.dsid.testes.LongReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "testes.DsidServico", "SayLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.LongRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.LongReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DsidServicoMethodDescriptorSupplier("SayLong"))
                  .build();
          }
        }
     }
     return getSayLongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.dsid.testes.VarLongRequest,
      io.grpc.dsid.testes.VarLongReply> getSayVarLongMethod;

  public static io.grpc.MethodDescriptor<io.grpc.dsid.testes.VarLongRequest,
      io.grpc.dsid.testes.VarLongReply> getSayVarLongMethod() {
    io.grpc.MethodDescriptor<io.grpc.dsid.testes.VarLongRequest, io.grpc.dsid.testes.VarLongReply> getSayVarLongMethod;
    if ((getSayVarLongMethod = DsidServicoGrpc.getSayVarLongMethod) == null) {
      synchronized (DsidServicoGrpc.class) {
        if ((getSayVarLongMethod = DsidServicoGrpc.getSayVarLongMethod) == null) {
          DsidServicoGrpc.getSayVarLongMethod = getSayVarLongMethod = 
              io.grpc.MethodDescriptor.<io.grpc.dsid.testes.VarLongRequest, io.grpc.dsid.testes.VarLongReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "testes.DsidServico", "SayVarLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.VarLongRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.VarLongReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DsidServicoMethodDescriptorSupplier("SayVarLong"))
                  .build();
          }
        }
     }
     return getSayVarLongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.dsid.testes.Person,
      io.grpc.dsid.testes.PersonReply> getSayPersonMethod;

  public static io.grpc.MethodDescriptor<io.grpc.dsid.testes.Person,
      io.grpc.dsid.testes.PersonReply> getSayPersonMethod() {
    io.grpc.MethodDescriptor<io.grpc.dsid.testes.Person, io.grpc.dsid.testes.PersonReply> getSayPersonMethod;
    if ((getSayPersonMethod = DsidServicoGrpc.getSayPersonMethod) == null) {
      synchronized (DsidServicoGrpc.class) {
        if ((getSayPersonMethod = DsidServicoGrpc.getSayPersonMethod) == null) {
          DsidServicoGrpc.getSayPersonMethod = getSayPersonMethod = 
              io.grpc.MethodDescriptor.<io.grpc.dsid.testes.Person, io.grpc.dsid.testes.PersonReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "testes.DsidServico", "SayPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.PersonReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DsidServicoMethodDescriptorSupplier("SayPerson"))
                  .build();
          }
        }
     }
     return getSayPersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.dsid.testes.VarPerson,
      io.grpc.dsid.testes.VarPersonReply> getSayVarPersonMethod;

  public static io.grpc.MethodDescriptor<io.grpc.dsid.testes.VarPerson,
      io.grpc.dsid.testes.VarPersonReply> getSayVarPersonMethod() {
    io.grpc.MethodDescriptor<io.grpc.dsid.testes.VarPerson, io.grpc.dsid.testes.VarPersonReply> getSayVarPersonMethod;
    if ((getSayVarPersonMethod = DsidServicoGrpc.getSayVarPersonMethod) == null) {
      synchronized (DsidServicoGrpc.class) {
        if ((getSayVarPersonMethod = DsidServicoGrpc.getSayVarPersonMethod) == null) {
          DsidServicoGrpc.getSayVarPersonMethod = getSayVarPersonMethod = 
              io.grpc.MethodDescriptor.<io.grpc.dsid.testes.VarPerson, io.grpc.dsid.testes.VarPersonReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "testes.DsidServico", "SayVarPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.VarPerson.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.dsid.testes.VarPersonReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DsidServicoMethodDescriptorSupplier("SayVarPerson"))
                  .build();
          }
        }
     }
     return getSayVarPersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DsidServicoStub newStub(io.grpc.Channel channel) {
    return new DsidServicoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DsidServicoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DsidServicoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DsidServicoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DsidServicoFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class DsidServicoImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Envia String
     * </pre>
     */
    public void sayString(io.grpc.dsid.testes.StringRequest request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.StringReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayStringMethod(), responseObserver);
    }

    /**
     * <pre>
     * Envia void
     * </pre>
     */
    public void sayVoid(io.grpc.dsid.testes.VoidRequest request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.VoidReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayVoidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Envia long
     * </pre>
     */
    public void sayLong(io.grpc.dsid.testes.LongRequest request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.LongReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayLongMethod(), responseObserver);
    }

    /**
     * <pre>
     * Envia vários long
     * </pre>
     */
    public void sayVarLong(io.grpc.dsid.testes.VarLongRequest request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.VarLongReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayVarLongMethod(), responseObserver);
    }

    /**
     * <pre>
     * Envia pessoa
     * </pre>
     */
    public void sayPerson(io.grpc.dsid.testes.Person request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.PersonReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayPersonMethod(), responseObserver);
    }

    /**
     * <pre>
     * Envia array de pessoas
     * </pre>
     */
    public void sayVarPerson(io.grpc.dsid.testes.VarPerson request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.VarPersonReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayVarPersonMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayStringMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.dsid.testes.StringRequest,
                io.grpc.dsid.testes.StringReply>(
                  this, METHODID_SAY_STRING)))
          .addMethod(
            getSayVoidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.dsid.testes.VoidRequest,
                io.grpc.dsid.testes.VoidReply>(
                  this, METHODID_SAY_VOID)))
          .addMethod(
            getSayLongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.dsid.testes.LongRequest,
                io.grpc.dsid.testes.LongReply>(
                  this, METHODID_SAY_LONG)))
          .addMethod(
            getSayVarLongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.dsid.testes.VarLongRequest,
                io.grpc.dsid.testes.VarLongReply>(
                  this, METHODID_SAY_VAR_LONG)))
          .addMethod(
            getSayPersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.dsid.testes.Person,
                io.grpc.dsid.testes.PersonReply>(
                  this, METHODID_SAY_PERSON)))
          .addMethod(
            getSayVarPersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.dsid.testes.VarPerson,
                io.grpc.dsid.testes.VarPersonReply>(
                  this, METHODID_SAY_VAR_PERSON)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class DsidServicoStub extends io.grpc.stub.AbstractStub<DsidServicoStub> {
    private DsidServicoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DsidServicoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DsidServicoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DsidServicoStub(channel, callOptions);
    }

    /**
     * <pre>
     * Envia String
     * </pre>
     */
    public void sayString(io.grpc.dsid.testes.StringRequest request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.StringReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Envia void
     * </pre>
     */
    public void sayVoid(io.grpc.dsid.testes.VoidRequest request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.VoidReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayVoidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Envia long
     * </pre>
     */
    public void sayLong(io.grpc.dsid.testes.LongRequest request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.LongReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayLongMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Envia vários long
     * </pre>
     */
    public void sayVarLong(io.grpc.dsid.testes.VarLongRequest request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.VarLongReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayVarLongMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Envia pessoa
     * </pre>
     */
    public void sayPerson(io.grpc.dsid.testes.Person request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.PersonReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Envia array de pessoas
     * </pre>
     */
    public void sayVarPerson(io.grpc.dsid.testes.VarPerson request,
        io.grpc.stub.StreamObserver<io.grpc.dsid.testes.VarPersonReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayVarPersonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class DsidServicoBlockingStub extends io.grpc.stub.AbstractStub<DsidServicoBlockingStub> {
    private DsidServicoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DsidServicoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DsidServicoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DsidServicoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Envia String
     * </pre>
     */
    public io.grpc.dsid.testes.StringReply sayString(io.grpc.dsid.testes.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayStringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Envia void
     * </pre>
     */
    public io.grpc.dsid.testes.VoidReply sayVoid(io.grpc.dsid.testes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayVoidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Envia long
     * </pre>
     */
    public io.grpc.dsid.testes.LongReply sayLong(io.grpc.dsid.testes.LongRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayLongMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Envia vários long
     * </pre>
     */
    public io.grpc.dsid.testes.VarLongReply sayVarLong(io.grpc.dsid.testes.VarLongRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayVarLongMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Envia pessoa
     * </pre>
     */
    public io.grpc.dsid.testes.PersonReply sayPerson(io.grpc.dsid.testes.Person request) {
      return blockingUnaryCall(
          getChannel(), getSayPersonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Envia array de pessoas
     * </pre>
     */
    public io.grpc.dsid.testes.VarPersonReply sayVarPerson(io.grpc.dsid.testes.VarPerson request) {
      return blockingUnaryCall(
          getChannel(), getSayVarPersonMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class DsidServicoFutureStub extends io.grpc.stub.AbstractStub<DsidServicoFutureStub> {
    private DsidServicoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DsidServicoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DsidServicoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DsidServicoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Envia String
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.dsid.testes.StringReply> sayString(
        io.grpc.dsid.testes.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayStringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Envia void
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.dsid.testes.VoidReply> sayVoid(
        io.grpc.dsid.testes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayVoidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Envia long
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.dsid.testes.LongReply> sayLong(
        io.grpc.dsid.testes.LongRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayLongMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Envia vários long
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.dsid.testes.VarLongReply> sayVarLong(
        io.grpc.dsid.testes.VarLongRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayVarLongMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Envia pessoa
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.dsid.testes.PersonReply> sayPerson(
        io.grpc.dsid.testes.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSayPersonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Envia array de pessoas
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.dsid.testes.VarPersonReply> sayVarPerson(
        io.grpc.dsid.testes.VarPerson request) {
      return futureUnaryCall(
          getChannel().newCall(getSayVarPersonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_STRING = 0;
  private static final int METHODID_SAY_VOID = 1;
  private static final int METHODID_SAY_LONG = 2;
  private static final int METHODID_SAY_VAR_LONG = 3;
  private static final int METHODID_SAY_PERSON = 4;
  private static final int METHODID_SAY_VAR_PERSON = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DsidServicoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DsidServicoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_STRING:
          serviceImpl.sayString((io.grpc.dsid.testes.StringRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.dsid.testes.StringReply>) responseObserver);
          break;
        case METHODID_SAY_VOID:
          serviceImpl.sayVoid((io.grpc.dsid.testes.VoidRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.dsid.testes.VoidReply>) responseObserver);
          break;
        case METHODID_SAY_LONG:
          serviceImpl.sayLong((io.grpc.dsid.testes.LongRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.dsid.testes.LongReply>) responseObserver);
          break;
        case METHODID_SAY_VAR_LONG:
          serviceImpl.sayVarLong((io.grpc.dsid.testes.VarLongRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.dsid.testes.VarLongReply>) responseObserver);
          break;
        case METHODID_SAY_PERSON:
          serviceImpl.sayPerson((io.grpc.dsid.testes.Person) request,
              (io.grpc.stub.StreamObserver<io.grpc.dsid.testes.PersonReply>) responseObserver);
          break;
        case METHODID_SAY_VAR_PERSON:
          serviceImpl.sayVarPerson((io.grpc.dsid.testes.VarPerson) request,
              (io.grpc.stub.StreamObserver<io.grpc.dsid.testes.VarPersonReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DsidServicoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DsidServicoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.dsid.testes.DSIDProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DsidServico");
    }
  }

  private static final class DsidServicoFileDescriptorSupplier
      extends DsidServicoBaseDescriptorSupplier {
    DsidServicoFileDescriptorSupplier() {}
  }

  private static final class DsidServicoMethodDescriptorSupplier
      extends DsidServicoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DsidServicoMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DsidServicoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DsidServicoFileDescriptorSupplier())
              .addMethod(getSayStringMethod())
              .addMethod(getSayVoidMethod())
              .addMethod(getSayLongMethod())
              .addMethod(getSayVarLongMethod())
              .addMethod(getSayPersonMethod())
              .addMethod(getSayVarPersonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
