package io.grpc.testing.integration;

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
 * A simple service NOT implemented at servers so clients can test for
 * that case.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: io/grpc/testing/integration/test.proto")
public final class UnimplementedServiceGrpc {

  private UnimplementedServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.testing.UnimplementedService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUnimplementedCallMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.EmptyProtos.Empty,
      com.google.protobuf.EmptyProtos.Empty> METHOD_UNIMPLEMENTED_CALL = getUnimplementedCallMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.EmptyProtos.Empty,
      com.google.protobuf.EmptyProtos.Empty> getUnimplementedCallMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.EmptyProtos.Empty,
      com.google.protobuf.EmptyProtos.Empty> getUnimplementedCallMethod() {
    return getUnimplementedCallMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.EmptyProtos.Empty,
      com.google.protobuf.EmptyProtos.Empty> getUnimplementedCallMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.EmptyProtos.Empty, com.google.protobuf.EmptyProtos.Empty> getUnimplementedCallMethod;
    if ((getUnimplementedCallMethod = UnimplementedServiceGrpc.getUnimplementedCallMethod) == null) {
      synchronized (UnimplementedServiceGrpc.class) {
        if ((getUnimplementedCallMethod = UnimplementedServiceGrpc.getUnimplementedCallMethod) == null) {
          UnimplementedServiceGrpc.getUnimplementedCallMethod = getUnimplementedCallMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.EmptyProtos.Empty, com.google.protobuf.EmptyProtos.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.testing.UnimplementedService", "UnimplementedCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.EmptyProtos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.EmptyProtos.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new UnimplementedServiceMethodDescriptorSupplier("UnimplementedCall"))
                  .build();
          }
        }
     }
     return getUnimplementedCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UnimplementedServiceStub newStub(io.grpc.Channel channel) {
    return new UnimplementedServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UnimplementedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UnimplementedServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UnimplementedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UnimplementedServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A simple service NOT implemented at servers so clients can test for
   * that case.
   * </pre>
   */
  public static abstract class UnimplementedServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A call that no server should implement
     * </pre>
     */
    public void unimplementedCall(com.google.protobuf.EmptyProtos.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.EmptyProtos.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnimplementedCallMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnimplementedCallMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.EmptyProtos.Empty,
                com.google.protobuf.EmptyProtos.Empty>(
                  this, METHODID_UNIMPLEMENTED_CALL)))
          .build();
    }
  }

  /**
   * <pre>
   * A simple service NOT implemented at servers so clients can test for
   * that case.
   * </pre>
   */
  public static final class UnimplementedServiceStub extends io.grpc.stub.AbstractStub<UnimplementedServiceStub> {
    private UnimplementedServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UnimplementedServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UnimplementedServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UnimplementedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A call that no server should implement
     * </pre>
     */
    public void unimplementedCall(com.google.protobuf.EmptyProtos.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.EmptyProtos.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnimplementedCallMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A simple service NOT implemented at servers so clients can test for
   * that case.
   * </pre>
   */
  public static final class UnimplementedServiceBlockingStub extends io.grpc.stub.AbstractStub<UnimplementedServiceBlockingStub> {
    private UnimplementedServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UnimplementedServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UnimplementedServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UnimplementedServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A call that no server should implement
     * </pre>
     */
    public com.google.protobuf.EmptyProtos.Empty unimplementedCall(com.google.protobuf.EmptyProtos.Empty request) {
      return blockingUnaryCall(
          getChannel(), getUnimplementedCallMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A simple service NOT implemented at servers so clients can test for
   * that case.
   * </pre>
   */
  public static final class UnimplementedServiceFutureStub extends io.grpc.stub.AbstractStub<UnimplementedServiceFutureStub> {
    private UnimplementedServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UnimplementedServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UnimplementedServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UnimplementedServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A call that no server should implement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.EmptyProtos.Empty> unimplementedCall(
        com.google.protobuf.EmptyProtos.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getUnimplementedCallMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNIMPLEMENTED_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UnimplementedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UnimplementedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNIMPLEMENTED_CALL:
          serviceImpl.unimplementedCall((com.google.protobuf.EmptyProtos.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.EmptyProtos.Empty>) responseObserver);
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

  private static abstract class UnimplementedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UnimplementedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.testing.integration.Test.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UnimplementedService");
    }
  }

  private static final class UnimplementedServiceFileDescriptorSupplier
      extends UnimplementedServiceBaseDescriptorSupplier {
    UnimplementedServiceFileDescriptorSupplier() {}
  }

  private static final class UnimplementedServiceMethodDescriptorSupplier
      extends UnimplementedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UnimplementedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UnimplementedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UnimplementedServiceFileDescriptorSupplier())
              .addMethod(getUnimplementedCallMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
