package com.example.demo.api.grpc;

import com.example.demo.service.model.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GoodsControllerGrpc extends goodsServiceGrpc.goodsServiceImplBase {
    String url = "localhost";

    @Override
    public void addShower(addShowerRequest request, StreamObserver<addShowerResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 9073)
                .usePlaintext()
                .build();
        goodsServiceGrpc.goodsServiceBlockingStub stub = goodsServiceGrpc.newBlockingStub(channel);
        addShowerResponse response = stub.addShower(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteShower(deleteShowerRequest request, StreamObserver<deleteShowerResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 9073)
                .usePlaintext()
                .build();
        goodsServiceGrpc.goodsServiceBlockingStub stub = goodsServiceGrpc.newBlockingStub(channel);
        deleteShowerResponse response = stub.deleteShower(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllShowers(getAllShowersRequest request, StreamObserver<getAllShowersResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 9073)
                .usePlaintext()
                .build();
        goodsServiceGrpc.goodsServiceBlockingStub stub = goodsServiceGrpc.newBlockingStub(channel);
        getAllShowersResponse response = stub.getAllShowers(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
