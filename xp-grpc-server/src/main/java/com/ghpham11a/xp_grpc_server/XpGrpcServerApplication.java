package com.ghpham11a.xp_grpc_server;

import com.ghpham11a.xp_grpc_server.services.CaseServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class XpGrpcServerApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(XpGrpcServerApplication.class, args);
	}

	@Bean
	public CommandLineRunner grpcServerRunner(CaseServiceImpl caseService) {
		return args -> {
			// Start the gRPC server in a separate thread to avoid blocking Spring Boot.
			new Thread(() -> {
				try {

					Server server = ServerBuilder.forPort(50051)
							.addService(caseService) // Attach your service
							.build()
							.start();

					System.out.println("Weather gRPC Server started on port 50051");
					// This call blocks, so it's run in a separate thread.
					server.awaitTermination();
				} catch (IOException | InterruptedException e) {
					System.err.println("gRPC server failed: " + e.getMessage());
					Thread.currentThread().interrupt();
				}
			}).start();
		};
	}
}
