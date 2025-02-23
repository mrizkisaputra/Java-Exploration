package com.mrizkisaputra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StatmentTest {
    @Test
    public void statetmentInsert() {
        try {
            Connection conn = ConnectionUtil.getDataSource().getConnection();
            Statement statement = conn.createStatement();

            String sql = """
                        INSERT INTO instructors (name, email, expertise) VALUES
                        ('Fajar Ramadhan', 'fajar.ramadhan@email.com', 'Pemrograman Backend');
                        """;
            statement.executeUpdate(sql);

            statement.close();
            conn.close();
        } catch (SQLException e) {
            Assertions.fail(e);
        }
    }

    @Test
    public void statementQuery() {
        record Student(
            Integer id,
            String name,
            String email,
            Date birthday){}

        String query = "SELECT * FROM students";
        try (Connection conn = ConnectionUtil.getDataSource().getConnection();
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                Student student = new Student(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getDate("date_of_birth"));
                students.add(student);
            }
            System.out.println(students.toString());
        } catch (SQLException e) {
            Assertions.fail(e);
        }

    }


}
