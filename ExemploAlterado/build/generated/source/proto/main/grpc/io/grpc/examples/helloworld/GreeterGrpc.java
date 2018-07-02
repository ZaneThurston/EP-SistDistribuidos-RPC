package io.grpc.examples.helloworld;

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
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHelloMethod;

  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.LongRequest,
      io.grpc.examples.helloworld.LongReply> getSayLongMethod;

  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.LongRequest,
      io.grpc.examples.helloworld.LongReply> getSayLongMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.LongRequest, io.grpc.examples.helloworld.LongReply> getSayLongMethod;
    if ((getSayLongMethod = GreeterGrpc.getSayLongMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayLongMethod = GreeterGrpc.getSayLongMethod) == null) {
          GreeterGrpc.getSayLongMethod = getSayLongMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.LongRequest, io.grpc.examples.helloworld.LongReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.LongRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.LongReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayLong"))
                  .build();
          }
        }
     }
     return getSayLongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.VoidRequest,
      io.grpc.examples.helloworld.VoidReply> getSayVoidMethod;

  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.VoidRequest,
      io.grpc.examples.helloworld.VoidReply> getSayVoidMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.VoidRequest, io.grpc.examples.helloworld.VoidReply> getSayVoidMethod;
    if ((getSayVoidMethod = GreeterGrpc.getSayVoidMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayVoidMethod = GreeterGrpc.getSayVoidMethod) == null) {
          GreeterGrpc.getSayVoidMethod = getSayVoidMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.VoidRequest, io.grpc.examples.helloworld.VoidReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayVoid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.VoidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.VoidReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayVoid"))
                  .build();
          }
        }
     }
     return getSayVoidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.EightLongRequest,
      io.grpc.examples.helloworld.EightLongReply> getSayEightLongMethod;

  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.EightLongRequest,
      io.grpc.examples.helloworld.EightLongReply> getSayEightLongMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.EightLongRequest, io.grpc.examples.helloworld.EightLongReply> getSayEightLongMethod;
    if ((getSayEightLongMethod = GreeterGrpc.getSayEightLongMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayEightLongMethod = GreeterGrpc.getSayEightLongMethod) == null) {
          GreeterGrpc.getSayEightLongMethod = getSayEightLongMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.EightLongRequest, io.grpc.examples.helloworld.EightLongReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayEightLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.EightLongRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.EightLongReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayEightLong"))
                  .build();
          }
        }
     }
     return getSayEightLongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.Person,
      io.grpc.examples.helloworld.Person> getSayPersonMethod;

  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.Person,
      io.grpc.examples.helloworld.Person> getSayPersonMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.Person, io.grpc.examples.helloworld.Person> getSayPersonMethod;
    if ((getSayPersonMethod = GreeterGrpc.getSayPersonMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayPersonMethod = GreeterGrpc.getSayPersonMethod) == null) {
          GreeterGrpc.getSayPersonMethod = getSayPersonMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.Person, io.grpc.examples.helloworld.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.Person.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayPerson"))
                  .build();
          }
        }
     }
     return getSayPersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends long
     * </pre>
     */
    public void sayLong(io.grpc.examples.helloworld.LongRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.LongReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayLongMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends void
     * </pre>
     */
    public void sayVoid(io.grpc.examples.helloworld.VoidRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.VoidReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayVoidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends 8 long
     * </pre>
     */
    public void sayEightLong(io.grpc.examples.helloworld.EightLongRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.EightLongReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayEightLongMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends 8 long
     * </pre>
     */
    public void sayPerson(io.grpc.examples.helloworld.Person request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getSayPersonMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.HelloRequest,
                io.grpc.examples.helloworld.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayLongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.LongRequest,
                io.grpc.examples.helloworld.LongReply>(
                  this, METHODID_SAY_LONG)))
          .addMethod(
            getSayVoidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.VoidRequest,
                io.grpc.examples.helloworld.VoidReply>(
                  this, METHODID_SAY_VOID)))
          .addMethod(
            getSayEightLongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.EightLongRequest,
                io.grpc.examples.helloworld.EightLongReply>(
                  this, METHODID_SAY_EIGHT_LONG)))
          .addMethod(
            getSayPersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.Person,
                io.grpc.examples.helloworld.Person>(
                  this, METHODID_SAY_PERSON)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends long
     * </pre>
     */
    public void sayLong(io.grpc.examples.helloworld.LongRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.LongReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayLongMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends void
     * </pre>
     */
    public void sayVoid(io.grpc.examples.helloworld.VoidRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.VoidReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayVoidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends 8 long
     * </pre>
     */
    public void sayEightLong(io.grpc.examples.helloworld.EightLongRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.EightLongReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayEightLongMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends 8 long
     * </pre>
     */
    public void sayPerson(io.grpc.examples.helloworld.Person request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.Person> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayPersonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.examples.helloworld.HelloReply sayHello(io.grpc.examples.helloworld.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends long
     * </pre>
     */
    public io.grpc.examples.helloworld.LongReply sayLong(io.grpc.examples.helloworld.LongRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayLongMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends void
     * </pre>
     */
    public io.grpc.examples.helloworld.VoidReply sayVoid(io.grpc.examples.helloworld.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayVoidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends 8 long
     * </pre>
     */
    public io.grpc.examples.helloworld.EightLongReply sayEightLong(io.grpc.examples.helloworld.EightLongRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayEightLongMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends 8 long
     * </pre>
     */
    public io.grpc.examples.helloworld.Person sayPerson(io.grpc.examples.helloworld.Person request) {
      return blockingUnaryCall(
          getChannel(), getSayPersonMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.HelloReply> sayHello(
        io.grpc.examples.helloworld.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends long
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.LongReply> sayLong(
        io.grpc.examples.helloworld.LongRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayLongMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends void
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.VoidReply> sayVoid(
        io.grpc.examples.helloworld.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayVoidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends 8 long
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.EightLongReply> sayEightLong(
        io.grpc.examples.helloworld.EightLongRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayEightLongMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends 8 long
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.Person> sayPerson(
        io.grpc.examples.helloworld.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSayPersonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_LONG = 1;
  private static final int METHODID_SAY_VOID = 2;
  private static final int METHODID_SAY_EIGHT_LONG = 3;
  private static final int METHODID_SAY_PERSON = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((io.grpc.examples.helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_LONG:
          serviceImpl.sayLong((io.grpc.examples.helloworld.LongRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.LongReply>) responseObserver);
          break;
        case METHODID_SAY_VOID:
          serviceImpl.sayVoid((io.grpc.examples.helloworld.VoidRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.VoidReply>) responseObserver);
          break;
        case METHODID_SAY_EIGHT_LONG:
          serviceImpl.sayEightLong((io.grpc.examples.helloworld.EightLongRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.EightLongReply>) responseObserver);
          break;
        case METHODID_SAY_PERSON:
          serviceImpl.sayPerson((io.grpc.examples.helloworld.Person) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.Person>) responseObserver);
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

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.helloworld.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayLongMethod())
              .addMethod(getSayVoidMethod())
              .addMethod(getSayEightLongMethod())
              .addMethod(getSayPersonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
