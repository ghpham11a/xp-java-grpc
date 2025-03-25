package com.ghpham11a.xp_grpc_server.repositories;

import com.ghpham11a.cases.*;

import java.util.Optional;

public interface CaseRepository {
    // Create operations
    OpenCase createOpenCase(OpenCase openCase);
    ClosedCase createClosedCase(ClosedCase closedCase);

    // Read operations
    Optional<OpenCase> getOpenCaseByIdentifier(String identifier);
    Optional<ClosedCase> getClosedCaseByIdentifier(String identifier);
}
