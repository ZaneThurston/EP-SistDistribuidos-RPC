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
    value = "by gRPC proto compiler (version 1.14.0-SNAPSHOT)",
    comments = "Source: hellosekai.proto")
public final class DistrGrpc {

  private DistrGrpc() {}

  public static final String SERVICE_NAME = "Distr";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<void,
      void> getSendVoidMethod;

  public static io.grpc.MethodDescriptor<void,
      void> getSendVoidMethod() {
    io.grpc.MethodDescriptor<void, void> getSendVoidMethod;
    if ((getSendVoidMethod = DistrGrpc.getSendVoidMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendVoidMethod = DistrGrpc.getSendVoidMethod) == null) {
          DistrGrpc.getSendVoidMethod = getSendVoidMethod = 
              io.grpc.MethodDescriptor.<void, void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendVoid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  void.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrMethodDescriptorSupplier("SendVoid"))
                  .build();
          }
        }
     }
     return getSendVoidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Long,
      Long> getSendLongMethod;

  public static io.grpc.MethodDescriptor<Long,
      Long> getSendLongMethod() {
    io.grpc.MethodDescriptor<Long, Long> getSendLongMethod;
    if ((getSendLongMethod = DistrGrpc.getSendLongMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendLongMethod = DistrGrpc.getSendLongMethod) == null) {
          DistrGrpc.getSendLongMethod = getSendLongMethod = 
              io.grpc.MethodDescriptor.<Long, Long>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Long.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Long.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrMethodDescriptorSupplier("SendLong"))
                  .build();
          }
        }
     }
     return getSendLongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LongFamily,
      Long> getSendLongFamilyMethod;

  public static io.grpc.MethodDescriptor<LongFamily,
      Long> getSendLongFamilyMethod() {
    io.grpc.MethodDescriptor<LongFamily, Long> getSendLongFamilyMethod;
    if ((getSendLongFamilyMethod = DistrGrpc.getSendLongFamilyMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendLongFamilyMethod = DistrGrpc.getSendLongFamilyMethod) == null) {
          DistrGrpc.getSendLongFamilyMethod = getSendLongFamilyMethod = 
              io.grpc.MethodDescriptor.<LongFamily, Long>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendLongFamily"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LongFamily.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Long.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrMethodDescriptorSupplier("SendLongFamily"))
                  .build();
          }
        }
     }
     return getSendLongFamilyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<String,
      String> getSendStringMethod;

  public static io.grpc.MethodDescriptor<String,
      String> getSendStringMethod() {
    io.grpc.MethodDescriptor<String, String> getSendStringMethod;
    if ((getSendStringMethod = DistrGrpc.getSendStringMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendStringMethod = DistrGrpc.getSendStringMethod) == null) {
          DistrGrpc.getSendStringMethod = getSendStringMethod = 
              io.grpc.MethodDescriptor.<String, String>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  String.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  String.getDefaultInstance()))
                  .setSchemaDescriptor(new DistrMethodDescriptorSupplier("SendString"))
                  .build();
          }
        }
     }
     return getSendStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Person,
      Person> getSendComplexMethod;

  public static io.grpc.MethodDescriptor<Person,
      Person> getSendComplexMethod() {
    io.grpc.MethodDescriptor<Person, Person> getSendComplexMethod;
    if ((getSendComplexMethod = DistrGrpc.getSendComplexMethod) == null) {
      synchronized (DistrGrpc.class) {
        if ((getSendComplexMethod = DistrGrpc.getSendComplexMethod) == null) {
          DistrGrpc.getSendComplexMethod = getSendComplexMethod = 
              io.grpc.MethodDescriptor.<Person, Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Distr", "SendComplex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Person.getDefaultInstance()))
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
    public void sendVoid(void request,
        io.grpc.stub.StreamObserver<void> responseObserver) {
      asyncUnimplementedUnaryCall(getSendVoidMethod(), responseObserver);
    }

    /**
     */
    public void sendLong(Long request,
        io.grpc.stub.StreamObserver<Long> responseObserver) {
      asyncUnimplementedUnaryCall(getSendLongMethod(), responseObserver);
    }

    /**
     */
    public void sendLongFamily(LongFamily request,
        io.grpc.stub.StreamObserver<Long> responseObserver) {
      asyncUnimplementedUnaryCall(getSendLongFamilyMethod(), responseObserver);
    }

    /**
     */
    public void sendString(String request,
        io.grpc.stub.StreamObserver<String> responseObserver) {
      asyncUnimplementedUnaryCall(getSendStringMethod(), responseObserver);
    }

    /**
     */
    public void sendComplex(Person request,
        io.grpc.stub.StreamObserver<Person> responseObserver) {
      asyncUnimplementedUnaryCall(getSendComplexMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendVoidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                void,
                void>(
                  this, METHODID_SEND_VOID)))
          .addMethod(
            getSendLongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Long,
                Long>(
                  this, METHODID_SEND_LONG)))
          .addMethod(
            getSendLongFamilyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                LongFamily,
                Long>(
                  this, METHODID_SEND_LONG_FAMILY)))
          .addMethod(
            getSendStringMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                String,
                String>(
                  this, METHODID_SEND_STRING)))
          .addMethod(
            getSendComplexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Person,
                Person>(
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
    public void sendVoid(void request,
        io.grpc.stub.StreamObserver<void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendVoidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendLong(Long request,
        io.grpc.stub.StreamObserver<Long> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendLongMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendLongFamily(LongFamily request,
        io.grpc.stub.StreamObserver<Long> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendLongFamilyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendString(String request,
        io.grpc.stub.StreamObserver<String> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendComplex(Person request,
        io.grpc.stub.StreamObserver<Person> responseObserver) {
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
    public void sendVoid(void request) {
      return blockingUnaryCall(
          getChannel(), getSendVoidMethod(), getCallOptions(), request);
    }

    /**
     */
    public Long sendLong(Long request) {
      return blockingUnaryCall(
          getChannel(), getSendLongMethod(), getCallOptions(), request);
    }

    /**
     */
    public Long sendLongFamily(LongFamily request) {
      return blockingUnaryCall(
          getChannel(), getSendLongFamilyMethod(), getCallOptions(), request);
    }

    /**
     */
    public String sendString(String request) {
      return blockingUnaryCall(
          getChannel(), getSendStringMethod(), getCallOptions(), request);
    }

    /**
     */
    public Person sendComplex(Person request) {
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
    public com.google.common.util.concurrent.ListenableFuture<void> sendVoid(
        void request) {
      return futureUnaryCall(
          getChannel().newCall(getSendVoidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Long> sendLong(
        Long request) {
      return futureUnaryCall(
          getChannel().newCall(getSendLongMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Long> sendLongFamily(
        LongFamily request) {
      return futureUnaryCall(
          getChannel().newCall(getSendLongFamilyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<String> sendString(
        String request) {
      return futureUnaryCall(
          getChannel().newCall(getSendStringMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Person> sendComplex(
        Person request) {
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
          serviceImpl.sendVoid((void) request,
              (io.grpc.stub.StreamObserver<void>) responseObserver);
          break;
        case METHODID_SEND_LONG:
          serviceImpl.sendLong((Long) request,
              (io.grpc.stub.StreamObserver<Long>) responseObserver);
          break;
        case METHODID_SEND_LONG_FAMILY:
          serviceImpl.sendLongFamily((LongFamily) request,
              (io.grpc.stub.StreamObserver<Long>) responseObserver);
          break;
        case METHODID_SEND_STRING:
          serviceImpl.sendString((String) request,
              (io.grpc.stub.StreamObserver<String>) responseObserver);
          break;
        case METHODID_SEND_COMPLEX:
          serviceImpl.sendComplex((Person) request,
              (io.grpc.stub.StreamObserver<Person>) responseObserver);
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
      return Hellosekai.getDescriptor();
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
