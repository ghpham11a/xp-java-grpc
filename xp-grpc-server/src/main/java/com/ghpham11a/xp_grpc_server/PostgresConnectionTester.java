package com.ghpham11a.xp_grpc_server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PostgresConnectionTester implements CommandLineRunner {

    private final DataSource dataSource;

    public PostgresConnectionTester(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(String... args) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("SELECT 1");
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                System.out.println("Postgres connection successful: " + rs.getInt(1));
            } else {
                System.out.println("Postgres connection test returned no results.");
            }
        } catch (SQLException e) {
            System.err.println("Failed to connect to Postgres: " + e.getMessage());
        }
    }
}
