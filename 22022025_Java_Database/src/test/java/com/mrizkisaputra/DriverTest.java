package com.mrizkisaputra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTest {

    @Test
    public void testJDBCDriverPostgres() {
        Driver postgresDriver = new org.postgresql.Driver();
        try {
            DriverManager.registerDriver(postgresDriver);
        } catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    public void testConnection() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=postgres";
        Driver driver = new org.postgresql.Driver();
        try {
            DriverManager.registerDriver(driver);
            Connection db = DriverManager.getConnection(jdbcURL);

            db.close();
        } catch (SQLException e) {
            Assertions.fail(e);
        }
    }




}
