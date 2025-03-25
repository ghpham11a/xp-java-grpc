package com.ghpham11a.xp_grpc_client.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ghpham11a.cases.*;

@Configuration
public class GrpcClientConfig {

    @Value("${JAVA_GRPC_SERVER_DNS:localhost}")
    private String grpcServerDns;

    @Bean
    public ManagedChannel grpcChannel() {
        return ManagedChannelBuilder.forAddress(grpcServerDns, 50051)
                .usePlaintext()
                .build();
    }

    @Bean
    public CaseServiceGrpc.CaseServiceBlockingStub caseServiceBlockingStub(ManagedChannel channel) {
        return CaseServiceGrpc.newBlockingStub(channel);
    }
}
