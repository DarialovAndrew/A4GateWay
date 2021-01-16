package com.example.demo.api.grpc;

import com.example.demo.service.model.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ClientControllerGrpc extends clientServiceGrpc.clientServiceImplBase{
    String url = "localhost";
    @Override
    public void addClient(addClientRequest request, StreamObserver<addClientResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 9023)
                .usePlaintext()
                .build();
        clientServiceGrpc.clientServiceBlockingStub stub = clientServiceGrpc.newBlockingStub(channel);
        addClientResponse response = stub.addClient(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteClient(deleteClientRequest request, StreamObserver<deleteClientResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 9023)
                .usePlaintext()
                .build();
        clientServiceGrpc.clientServiceBlockingStub stub = clientServiceGrpc.newBlockingStub(channel);
        deleteClientResponse response = stub.deleteClient(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllClients(getClientsRequest request, StreamObserver<getClientsResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 9023)
                .usePlaintext()
                .build();
        clientServiceGrpc.clientServiceBlockingStub stub = clientServiceGrpc.newBlockingStub(channel);
        getClientsResponse response = stub.getAllClients(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
