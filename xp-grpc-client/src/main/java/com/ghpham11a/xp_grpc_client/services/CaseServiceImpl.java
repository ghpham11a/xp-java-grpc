package com.ghpham11a.xp_grpc_client.services;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ghpham11a.cases.*;

@Service
public class CaseServiceImpl implements CaseService {

    private final CaseServiceGrpc.CaseServiceBlockingStub caseServiceStub;

    @Autowired
    public CaseServiceImpl(CaseServiceGrpc.CaseServiceBlockingStub caseServiceStub) {
        this.caseServiceStub = caseServiceStub;
    }

    @PostConstruct
    public void init() {
        if (caseServiceStub != null) {
            System.out.println("CaseServiceStub injected successfully: " + caseServiceStub);
        } else {
            System.err.println("CaseServiceStub injection failed!");
        }
    }

    @Override
    public OpenCase createOpenCase(OpenCase openCase) {
        return caseServiceStub.createOpenCase(openCase);
    }

    @Override
    public OpenCase findOpenCase(String identifier) {
        GetOpenCaseRequest request = GetOpenCaseRequest
                .newBuilder()
                .setIdentifier(identifier)
                .build();

        return caseServiceStub.getOpenCase(request);
    }

    @Override
    public ClosedCase createClosedCase(ClosedCase closedCase) {
        return caseServiceStub.createClosedCase(closedCase);
    }

    @Override
    public ClosedCase findClosedCase(String identifier) {
        GetClosedCaseRequest request = GetClosedCaseRequest
                .newBuilder()
                .setIdentifier(identifier)
                .build();
        return caseServiceStub.getClosedCase(request);
    }
}
