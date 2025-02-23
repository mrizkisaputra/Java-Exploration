package com.mrizkisaputra;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
    @Test
    public void getConnection() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=postgres";

        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.postgresql.Driver");
        config.setJdbcUrl(jdbcURL);

        // management connection pool
        config.setMaximumPoolSize(60);
        config.setMinimumIdle(30);

        HikariDataSource ds = new HikariDataSource(config);

        try {
            Connection conn = ds.getConnection();

            conn.close();
        } catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
