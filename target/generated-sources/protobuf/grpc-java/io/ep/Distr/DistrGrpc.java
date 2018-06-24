package io.ep.Distr;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: hellosekai.proto")
public final class DistrGrpc {

  private DistrGrpc() {}

  public static final String SERVICE_NAME = "Distr";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.ep.Distr.theVoid,
      io.ep.Distr.theVoid> getSendVoidMethod;

  public static io.grpc.MethodDescriptor<io.ep.Distr.theVoid,
      io.ep.Distr.theVoid> getSendVoidMethod() {
    io.grpc.MethodDescriptor<io.ep.Distr.theVoid, io.ep.Distr.theVoid> getSendVoidMethod;
    if ((getSendVoidMethod = DistrGrpc.getSendVoidMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendVoidMethod = DistrGrpc.getSendVoidMethod) == null) {
          DistrGrpc.getSendVoidMethod = getSendVoidMethod = 
              io.grpc.MethodDescriptor.<io.ep.Distr.theVoid, io.ep.Distr.theVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendVoid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.theVoid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.theVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrMethodDescriptorSupplier("SendVoid"))
                  .build();
          }
        }
     }
     return getSendVoidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.ep.Distr.theLong,
      io.ep.Distr.theLong> getSendLongMethod;

  public static io.grpc.MethodDescriptor<io.ep.Distr.theLong,
      io.ep.Distr.theLong> getSendLongMethod() {
    io.grpc.MethodDescriptor<io.ep.Distr.theLong, io.ep.Distr.theLong> getSendLongMethod;
    if ((getSendLongMethod = DistrGrpc.getSendLongMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendLongMethod = DistrGrpc.getSendLongMethod) == null) {
          DistrGrpc.getSendLongMethod = getSendLongMethod = 
              io.grpc.MethodDescriptor.<io.ep.Distr.theLong, io.ep.Distr.theLong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.theLong.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.theLong.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrMethodDescriptorSupplier("SendLong"))
                  .build();
          }
        }
     }
     return getSendLongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.ep.Distr.LongFamily,
      io.ep.Distr.theLong> getSendLongFamilyMethod;

  public static io.grpc.MethodDescriptor<io.ep.Distr.LongFamily,
      io.ep.Distr.theLong> getSendLongFamilyMethod() {
    io.grpc.MethodDescriptor<io.ep.Distr.LongFamily, io.ep.Distr.theLong> getSendLongFamilyMethod;
    if ((getSendLongFamilyMethod = DistrGrpc.getSendLongFamilyMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendLongFamilyMethod = DistrGrpc.getSendLongFamilyMethod) == null) {
          DistrGrpc.getSendLongFamilyMethod = getSendLongFamilyMethod = 
              io.grpc.MethodDescriptor.<io.ep.Distr.LongFamily, io.ep.Distr.theLong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendLongFamily"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.LongFamily.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.theLong.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrMethodDescriptorSupplier("SendLongFamily"))
                  .build();
          }
        }
     }
     return getSendLongFamilyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.ep.Distr.theString,
      io.ep.Distr.theString> getSendStringMethod;

  public static io.grpc.MethodDescriptor<io.ep.Distr.theString,
      io.ep.Distr.theString> getSendStringMethod() {
    io.grpc.MethodDescriptor<io.ep.Distr.theString, io.ep.Distr.theString> getSendStringMethod;
    if ((getSendStringMethod = DistrGrpc.getSendStringMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendStringMethod = DistrGrpc.getSendStringMethod) == null) {
          DistrGrpc.getSendStringMethod = getSendStringMethod = 
              io.grpc.MethodDescriptor.<io.ep.Distr.theString, io.ep.Distr.theString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.theString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.theString.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrMethodDescriptorSupplier("SendString"))
                  .build();
          }
        }
     }
     return getSendStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.ep.Distr.Person,
      io.ep.Distr.Person> getSendComplexMethod;

  public static io.grpc.MethodDescriptor<io.ep.Distr.Person,
      io.ep.Distr.Person> getSendComplexMethod() {
    io.grpc.MethodDescriptor<io.ep.Distr.Person, io.ep.Distr.Person> getSendComplexMethod;
    if ((getSendComplexMethod = DistrGrpc.getSendComplexMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendComplexMethod = DistrGrpc.getSendComplexMethod) == null) {
          DistrGrpc.getSendComplexMethod = getSendComplexMethod = 
              io.grpc.MethodDescriptor.<io.ep.Distr.Person, io.ep.Distr.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendComplex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ep.Distr.Person.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrMethodDescriptorSupplier("SendComplex"))
                  .build();
          }
        }
     }
     return getSendComplexMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DistrStub newStub(io.grpc.Channel channel) {
    return new DistrStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DistrBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DistrBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DistrFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DistrFutureStub(channel);
  }

  /**
   */
  public static abstract class DistrImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendVoid(io.ep.Distr.theVoid request,
        io.grpc.stub.StreamObserver<io.ep.Distr.theVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getSendVoidMethod(), responseObserver);
    }

    /**
     */
    public void sendLong(io.ep.Distr.theLong request,
        io.grpc.stub.StreamObserver<io.ep.Distr.theLong> responseObserver) {
      asyncUnimplementedUnaryCall(getSendLongMethod(), responseObserver);
    }

    /**
     */
    public void sendLongFamily(io.ep.Distr.LongFamily request,
        io.grpc.stub.StreamObserver<io.ep.Distr.theLong> responseObserver) {
      asyncUnimplementedUnaryCall(getSendLongFamilyMethod(), responseObserver);
    }

    /**
     */
    public void sendString(io.ep.Distr.theString request,
        io.grpc.stub.StreamObserver<io.ep.Distr.theString> responseObserver) {
      asyncUnimplementedUnaryCall(getSendStringMethod(), responseObserver);
    }

    /**
     */
    public void sendComplex(io.ep.Distr.Person request,
        io.grpc.stub.StreamObserver<io.ep.Distr.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getSendComplexMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendVoidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.ep.Distr.theVoid,
                io.ep.Distr.theVoid>(
                  this, METHODID_SEND_VOID)))
          .addMethod(
            getSendLongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.ep.Distr.theLong,
                io.ep.Distr.theLong>(
                  this, METHODID_SEND_LONG)))
          .addMethod(
            getSendLongFamilyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.ep.Distr.LongFamily,
                io.ep.Distr.theLong>(
                  this, METHODID_SEND_LONG_FAMILY)))
          .addMethod(
            getSendStringMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.ep.Distr.theString,
                io.ep.Distr.theString>(
                  this, METHODID_SEND_STRING)))
          .addMethod(
            getSendComplexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.ep.Distr.Person,
                io.ep.Distr.Person>(
                  this, METHODID_SEND_COMPLEX)))
          .build();
    }
  }

  /**
   */
  public static final class DistrStub extends io.grpc.stub.AbstractStub<DistrStub> {
    private DistrStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DistrStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistrStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DistrStub(channel, callOptions);
    }

    /**
     */
    public void sendVoid(io.ep.Distr.theVoid request,
        io.grpc.stub.StreamObserver<io.ep.Distr.theVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendVoidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendLong(io.ep.Distr.theLong request,
        io.grpc.stub.StreamObserver<io.ep.Distr.theLong> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendLongMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendLongFamily(io.ep.Distr.LongFamily request,
        io.grpc.stub.StreamObserver<io.ep.Distr.theLong> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendLongFamilyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendString(io.ep.Distr.theString request,
        io.grpc.stub.StreamObserver<io.ep.Distr.theString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendComplex(io.ep.Distr.Person request,
        io.grpc.stub.StreamObserver<io.ep.Distr.Person> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendComplexMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DistrBlockingStub extends io.grpc.stub.AbstractStub<DistrBlockingStub> {
    private DistrBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DistrBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistrBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DistrBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.ep.Distr.theVoid sendVoid(io.ep.Distr.theVoid request) {
      return blockingUnaryCall(
          getChannel(), getSendVoidMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.ep.Distr.theLong sendLong(io.ep.Distr.theLong request) {
      return blockingUnaryCall(
          getChannel(), getSendLongMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.ep.Distr.theLong sendLongFamily(io.ep.Distr.LongFamily request) {
      return blockingUnaryCall(
          getChannel(), getSendLongFamilyMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.ep.Distr.theString sendString(io.ep.Distr.theString request) {
      return blockingUnaryCall(
          getChannel(), getSendStringMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.ep.Distr.Person sendComplex(io.ep.Distr.Person request) {
      return blockingUnaryCall(
          getChannel(), getSendComplexMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DistrFutureStub extends io.grpc.stub.AbstractStub<DistrFutureStub> {
    private DistrFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DistrFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistrFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DistrFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.ep.Distr.theVoid> sendVoid(
        io.ep.Distr.theVoid request) {
      return futureUnaryCall(
          getChannel().newCall(getSendVoidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.ep.Distr.theLong> sendLong(
        io.ep.Distr.theLong request) {
      return futureUnaryCall(
          getChannel().newCall(getSendLongMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.ep.Distr.theLong> sendLongFamily(
        io.ep.Distr.LongFamily request) {
      return futureUnaryCall(
          getChannel().newCall(getSendLongFamilyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.ep.Distr.theString> sendString(
        io.ep.Distr.theString request) {
      return futureUnaryCall(
          getChannel().newCall(getSendStringMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.ep.Distr.Person> sendComplex(
        io.ep.Distr.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSendComplexMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_VOID = 0;
  private static final int METHODID_SEND_LONG = 1;
  private static final int METHODID_SEND_LONG_FAMILY = 2;
  private static final int METHODID_SEND_STRING = 3;
  private static final int METHODID_SEND_COMPLEX = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DistrImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DistrImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_VOID:
          serviceImpl.sendVoid((io.ep.Distr.theVoid) request,
              (io.grpc.stub.StreamObserver<io.ep.Distr.theVoid>) responseObserver);
          break;
        case METHODID_SEND_LONG:
          serviceImpl.sendLong((io.ep.Distr.theLong) request,
              (io.grpc.stub.StreamObserver<io.ep.Distr.theLong>) responseObserver);
          break;
        case METHODID_SEND_LONG_FAMILY:
          serviceImpl.sendLongFamily((io.ep.Distr.LongFamily) request,
              (io.grpc.stub.StreamObserver<io.ep.Distr.theLong>) responseObserver);
          break;
        case METHODID_SEND_STRING:
          serviceImpl.sendString((io.ep.Distr.theString) request,
              (io.grpc.stub.StreamObserver<io.ep.Distr.theString>) responseObserver);
          break;
        case METHODID_SEND_COMPLEX:
          serviceImpl.sendComplex((io.ep.Distr.Person) request,
              (io.grpc.stub.StreamObserver<io.ep.Distr.Person>) responseObserver);
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

  private static abstract class DistrBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DistrBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.ep.Distr.Hellosekai.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Distr");
    }
  }

  private static final class DistrFileDescriptorSupplier
      extends DistrBaseDescriptorSupplier {
    DistrFileDescriptorSupplier() {}
  }

  private static final class DistrMethodDescriptorSupplier
      extends DistrBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DistrMethodDescriptorSupplier(String methodName) {
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
      synchronized (DistrGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DistrFileDescriptorSupplier())
              .addMethod(getSendVoidMethod())
              .addMethod(getSendLongMethod())
              .addMethod(getSendLongFamilyMethod())
              .addMethod(getSendStringMethod())
              .addMethod(getSendComplexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
