package com.example.demo.api.grpc;

import com.example.demo.service.model.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class StaffControllerGrpc extends staffServiceGrpc.staffServiceImplBase {
    String url = "localhost";
    @Override
    public void addCleaner(addCleanerRequest request, StreamObserver<addCleanerResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 9076)
                .usePlaintext()
                .build();
        staffServiceGrpc.staffServiceBlockingStub stub = staffServiceGrpc.newBlockingStub(channel);
        addCleanerResponse response = stub.addCleaner(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteCleaner(deleteCleanerRequest request, StreamObserver<deleteCleanerResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 9076)
                .usePlaintext()
                .build();
        staffServiceGrpc.staffServiceBlockingStub stub = staffServiceGrpc.newBlockingStub(channel);
        deleteCleanerResponse response = stub.deleteCleaner(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllCleaners(getAllCleanersRequest request, StreamObserver<getAllCleanersResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 9076)
                .usePlaintext()
                .build();
        staffServiceGrpc.staffServiceBlockingStub stub = staffServiceGrpc.newBlockingStub(channel);
        getAllCleanersResponse response = stub.getAllCleaners(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
