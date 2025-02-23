package com.mrizkisaputra;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class PrepareStatementTest {
    @Test
    public void prepareStatementTest() {
        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection conn = ConnectionUtil.getDataSource().getConnection()) {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, 2);
            
            statement.executeQuery();

            statement.close();
        } catch (SQLException e) {

        }
    }


}
