package io.s3vt.proto;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.baeldung.grpc.HelloRequest;
import org.baeldung.grpc.HelloResponse;
import org.baeldung.grpc.HelloServiceGrpc;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server svr = ServerBuilder.forPort(6060).addService(new HelloServiceImpl()).build();
        svr.start();
        svr.awaitTermination();
    }
}

class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String greeting = "Hello, " + request.getFirstName() + " " + request.getLastName();

        HelloResponse response = HelloResponse.newBuilder().setGreeting(greeting).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
