package com.ghpham11a.xp_grpc_client.services;

import com.ghpham11a.cases.*;

public interface CaseService {
    OpenCase createOpenCase(OpenCase openCase);
    OpenCase findOpenCase(String identifier);
    ClosedCase createClosedCase(ClosedCase closedCase);
    ClosedCase findClosedCase(String identifier);
}
