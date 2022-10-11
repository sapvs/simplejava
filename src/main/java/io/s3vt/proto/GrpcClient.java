package io.s3vt.proto;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.baeldung.grpc.HelloRequest;
import org.baeldung.grpc.HelloResponse;
import org.baeldung.grpc.HelloServiceGrpc;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 6060)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(
                HelloRequest.newBuilder()
                        .setFirstName("Baeldung")
                        .setLastName("gRPC")
                        .build());
        System.out.println(helloResponse);
        channel.shutdown();
    }
}