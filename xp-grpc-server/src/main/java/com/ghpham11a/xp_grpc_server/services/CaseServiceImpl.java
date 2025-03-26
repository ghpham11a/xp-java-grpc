package com.ghpham11a.xp_grpc_server.services;

import com.ghpham11a.cases.*;
import com.ghpham11a.xp_grpc_server.repositories.CaseRepository;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CaseServiceImpl extends CaseServiceGrpc.CaseServiceImplBase {

    private final CaseRepository caseRepository;

    @Autowired
    public CaseServiceImpl(CaseRepository caseRepository) {
        this.caseRepository = caseRepository;
    }

    @Override
    public void getOpenCase(GetOpenCaseRequest request, StreamObserver<OpenCase> responseObserver) {
        Optional<OpenCase> result = caseRepository.getOpenCaseByIdentifier(request.getIdentifier());
        responseObserver.onNext(result.get());
        responseObserver.onCompleted();
    }

    @Override
    public void createOpenCase(OpenCase request, StreamObserver<OpenCase> responseObserver) {
        OpenCase result = caseRepository.createOpenCase(request);
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }

    @Override
    public void getClosedCase(GetClosedCaseRequest request, StreamObserver<ClosedCase> responseObserver) {
        Optional<ClosedCase> result = caseRepository.getClosedCaseByIdentifier(request.getIdentifier());
        responseObserver.onNext(result.get());
        responseObserver.onCompleted();
    }

    @Override
    public void createClosedCase(ClosedCase request, StreamObserver<ClosedCase> responseObserver) {
        ClosedCase result = caseRepository.createClosedCase(request);
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }
}
