package com.ghpham11a.cases;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: proto/cases.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CaseServiceGrpc {

  private CaseServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ghpham11a.cases.CaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ghpham11a.cases.GetOpenCaseRequest,
      com.ghpham11a.cases.OpenCase> getGetOpenCaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOpenCase",
      requestType = com.ghpham11a.cases.GetOpenCaseRequest.class,
      responseType = com.ghpham11a.cases.OpenCase.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ghpham11a.cases.GetOpenCaseRequest,
      com.ghpham11a.cases.OpenCase> getGetOpenCaseMethod() {
    io.grpc.MethodDescriptor<com.ghpham11a.cases.GetOpenCaseRequest, com.ghpham11a.cases.OpenCase> getGetOpenCaseMethod;
    if ((getGetOpenCaseMethod = CaseServiceGrpc.getGetOpenCaseMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getGetOpenCaseMethod = CaseServiceGrpc.getGetOpenCaseMethod) == null) {
          CaseServiceGrpc.getGetOpenCaseMethod = getGetOpenCaseMethod =
              io.grpc.MethodDescriptor.<com.ghpham11a.cases.GetOpenCaseRequest, com.ghpham11a.cases.OpenCase>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOpenCase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ghpham11a.cases.GetOpenCaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ghpham11a.cases.OpenCase.getDefaultInstance()))
              .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("GetOpenCase"))
              .build();
        }
      }
    }
    return getGetOpenCaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ghpham11a.cases.OpenCase,
      com.ghpham11a.cases.OpenCase> getCreateOpenCaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOpenCase",
      requestType = com.ghpham11a.cases.OpenCase.class,
      responseType = com.ghpham11a.cases.OpenCase.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ghpham11a.cases.OpenCase,
      com.ghpham11a.cases.OpenCase> getCreateOpenCaseMethod() {
    io.grpc.MethodDescriptor<com.ghpham11a.cases.OpenCase, com.ghpham11a.cases.OpenCase> getCreateOpenCaseMethod;
    if ((getCreateOpenCaseMethod = CaseServiceGrpc.getCreateOpenCaseMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getCreateOpenCaseMethod = CaseServiceGrpc.getCreateOpenCaseMethod) == null) {
          CaseServiceGrpc.getCreateOpenCaseMethod = getCreateOpenCaseMethod =
              io.grpc.MethodDescriptor.<com.ghpham11a.cases.OpenCase, com.ghpham11a.cases.OpenCase>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOpenCase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ghpham11a.cases.OpenCase.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ghpham11a.cases.OpenCase.getDefaultInstance()))
              .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("CreateOpenCase"))
              .build();
        }
      }
    }
    return getCreateOpenCaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ghpham11a.cases.GetClosedCaseRequest,
      com.ghpham11a.cases.ClosedCase> getGetClosedCaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClosedCase",
      requestType = com.ghpham11a.cases.GetClosedCaseRequest.class,
      responseType = com.ghpham11a.cases.ClosedCase.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ghpham11a.cases.GetClosedCaseRequest,
      com.ghpham11a.cases.ClosedCase> getGetClosedCaseMethod() {
    io.grpc.MethodDescriptor<com.ghpham11a.cases.GetClosedCaseRequest, com.ghpham11a.cases.ClosedCase> getGetClosedCaseMethod;
    if ((getGetClosedCaseMethod = CaseServiceGrpc.getGetClosedCaseMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getGetClosedCaseMethod = CaseServiceGrpc.getGetClosedCaseMethod) == null) {
          CaseServiceGrpc.getGetClosedCaseMethod = getGetClosedCaseMethod =
              io.grpc.MethodDescriptor.<com.ghpham11a.cases.GetClosedCaseRequest, com.ghpham11a.cases.ClosedCase>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClosedCase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ghpham11a.cases.GetClosedCaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ghpham11a.cases.ClosedCase.getDefaultInstance()))
              .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("GetClosedCase"))
              .build();
        }
      }
    }
    return getGetClosedCaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ghpham11a.cases.ClosedCase,
      com.ghpham11a.cases.ClosedCase> getCreateClosedCaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClosedCase",
      requestType = com.ghpham11a.cases.ClosedCase.class,
      responseType = com.ghpham11a.cases.ClosedCase.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ghpham11a.cases.ClosedCase,
      com.ghpham11a.cases.ClosedCase> getCreateClosedCaseMethod() {
    io.grpc.MethodDescriptor<com.ghpham11a.cases.ClosedCase, com.ghpham11a.cases.ClosedCase> getCreateClosedCaseMethod;
    if ((getCreateClosedCaseMethod = CaseServiceGrpc.getCreateClosedCaseMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getCreateClosedCaseMethod = CaseServiceGrpc.getCreateClosedCaseMethod) == null) {
          CaseServiceGrpc.getCreateClosedCaseMethod = getCreateClosedCaseMethod =
              io.grpc.MethodDescriptor.<com.ghpham11a.cases.ClosedCase, com.ghpham11a.cases.ClosedCase>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClosedCase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ghpham11a.cases.ClosedCase.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ghpham11a.cases.ClosedCase.getDefaultInstance()))
              .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("CreateClosedCase"))
              .build();
        }
      }
    }
    return getCreateClosedCaseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaseServiceStub>() {
        @java.lang.Override
        public CaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaseServiceStub(channel, callOptions);
        }
      };
    return CaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CaseServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaseServiceBlockingV2Stub>() {
        @java.lang.Override
        public CaseServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaseServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CaseServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaseServiceBlockingStub>() {
        @java.lang.Override
        public CaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaseServiceBlockingStub(channel, callOptions);
        }
      };
    return CaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaseServiceFutureStub>() {
        @java.lang.Override
        public CaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaseServiceFutureStub(channel, callOptions);
        }
      };
    return CaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getOpenCase(com.ghpham11a.cases.GetOpenCaseRequest request,
        io.grpc.stub.StreamObserver<com.ghpham11a.cases.OpenCase> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOpenCaseMethod(), responseObserver);
    }

    /**
     */
    default void createOpenCase(com.ghpham11a.cases.OpenCase request,
        io.grpc.stub.StreamObserver<com.ghpham11a.cases.OpenCase> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOpenCaseMethod(), responseObserver);
    }

    /**
     */
    default void getClosedCase(com.ghpham11a.cases.GetClosedCaseRequest request,
        io.grpc.stub.StreamObserver<com.ghpham11a.cases.ClosedCase> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClosedCaseMethod(), responseObserver);
    }

    /**
     */
    default void createClosedCase(com.ghpham11a.cases.ClosedCase request,
        io.grpc.stub.StreamObserver<com.ghpham11a.cases.ClosedCase> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClosedCaseMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CaseService.
   */
  public static abstract class CaseServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CaseServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CaseService.
   */
  public static final class CaseServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CaseServiceStub> {
    private CaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOpenCase(com.ghpham11a.cases.GetOpenCaseRequest request,
        io.grpc.stub.StreamObserver<com.ghpham11a.cases.OpenCase> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOpenCaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOpenCase(com.ghpham11a.cases.OpenCase request,
        io.grpc.stub.StreamObserver<com.ghpham11a.cases.OpenCase> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOpenCaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClosedCase(com.ghpham11a.cases.GetClosedCaseRequest request,
        io.grpc.stub.StreamObserver<com.ghpham11a.cases.ClosedCase> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClosedCaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createClosedCase(com.ghpham11a.cases.ClosedCase request,
        io.grpc.stub.StreamObserver<com.ghpham11a.cases.ClosedCase> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClosedCaseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CaseService.
   */
  public static final class CaseServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CaseServiceBlockingV2Stub> {
    private CaseServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ghpham11a.cases.OpenCase getOpenCase(com.ghpham11a.cases.GetOpenCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOpenCaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ghpham11a.cases.OpenCase createOpenCase(com.ghpham11a.cases.OpenCase request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOpenCaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ghpham11a.cases.ClosedCase getClosedCase(com.ghpham11a.cases.GetClosedCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClosedCaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ghpham11a.cases.ClosedCase createClosedCase(com.ghpham11a.cases.ClosedCase request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClosedCaseMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CaseService.
   */
  public static final class CaseServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CaseServiceBlockingStub> {
    private CaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ghpham11a.cases.OpenCase getOpenCase(com.ghpham11a.cases.GetOpenCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOpenCaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ghpham11a.cases.OpenCase createOpenCase(com.ghpham11a.cases.OpenCase request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOpenCaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ghpham11a.cases.ClosedCase getClosedCase(com.ghpham11a.cases.GetClosedCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClosedCaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ghpham11a.cases.ClosedCase createClosedCase(com.ghpham11a.cases.ClosedCase request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClosedCaseMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CaseService.
   */
  public static final class CaseServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CaseServiceFutureStub> {
    private CaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ghpham11a.cases.OpenCase> getOpenCase(
        com.ghpham11a.cases.GetOpenCaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOpenCaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ghpham11a.cases.OpenCase> createOpenCase(
        com.ghpham11a.cases.OpenCase request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOpenCaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ghpham11a.cases.ClosedCase> getClosedCase(
        com.ghpham11a.cases.GetClosedCaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClosedCaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ghpham11a.cases.ClosedCase> createClosedCase(
        com.ghpham11a.cases.ClosedCase request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClosedCaseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OPEN_CASE = 0;
  private static final int METHODID_CREATE_OPEN_CASE = 1;
  private static final int METHODID_GET_CLOSED_CASE = 2;
  private static final int METHODID_CREATE_CLOSED_CASE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OPEN_CASE:
          serviceImpl.getOpenCase((com.ghpham11a.cases.GetOpenCaseRequest) request,
              (io.grpc.stub.StreamObserver<com.ghpham11a.cases.OpenCase>) responseObserver);
          break;
        case METHODID_CREATE_OPEN_CASE:
          serviceImpl.createOpenCase((com.ghpham11a.cases.OpenCase) request,
              (io.grpc.stub.StreamObserver<com.ghpham11a.cases.OpenCase>) responseObserver);
          break;
        case METHODID_GET_CLOSED_CASE:
          serviceImpl.getClosedCase((com.ghpham11a.cases.GetClosedCaseRequest) request,
              (io.grpc.stub.StreamObserver<com.ghpham11a.cases.ClosedCase>) responseObserver);
          break;
        case METHODID_CREATE_CLOSED_CASE:
          serviceImpl.createClosedCase((com.ghpham11a.cases.ClosedCase) request,
              (io.grpc.stub.StreamObserver<com.ghpham11a.cases.ClosedCase>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetOpenCaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ghpham11a.cases.GetOpenCaseRequest,
              com.ghpham11a.cases.OpenCase>(
                service, METHODID_GET_OPEN_CASE)))
        .addMethod(
          getCreateOpenCaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ghpham11a.cases.OpenCase,
              com.ghpham11a.cases.OpenCase>(
                service, METHODID_CREATE_OPEN_CASE)))
        .addMethod(
          getGetClosedCaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ghpham11a.cases.GetClosedCaseRequest,
              com.ghpham11a.cases.ClosedCase>(
                service, METHODID_GET_CLOSED_CASE)))
        .addMethod(
          getCreateClosedCaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ghpham11a.cases.ClosedCase,
              com.ghpham11a.cases.ClosedCase>(
                service, METHODID_CREATE_CLOSED_CASE)))
        .build();
  }

  private static abstract class CaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ghpham11a.cases.CasesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CaseService");
    }
  }

  private static final class CaseServiceFileDescriptorSupplier
      extends CaseServiceBaseDescriptorSupplier {
    CaseServiceFileDescriptorSupplier() {}
  }

  private static final class CaseServiceMethodDescriptorSupplier
      extends CaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CaseServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CaseServiceFileDescriptorSupplier())
              .addMethod(getGetOpenCaseMethod())
              .addMethod(getCreateOpenCaseMethod())
              .addMethod(getGetClosedCaseMethod())
              .addMethod(getCreateClosedCaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
