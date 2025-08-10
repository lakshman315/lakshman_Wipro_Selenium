package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentsPreparedStatement {

    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/AssessmentDB";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            conn.createStatement().executeUpdate("DELETE FROM students");

            String sql = "INSERT INTO students (id, name, age, percentage) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 101);
            pstmt.setString(2, "Lakshman");
            pstmt.setInt(3, 20);
            pstmt.setFloat(4, 85.5f);
            pstmt.addBatch();

            pstmt.setInt(1, 102);
            pstmt.setString(2, "Suvin");
            pstmt.setInt(3, 21);
            pstmt.setFloat(4, 78.0f);
            pstmt.addBatch();

            pstmt.setInt(1, 103);
            pstmt.setString(2, "Prudhvi");
            pstmt.setInt(3, 21);
            pstmt.setFloat(4, 74.5f);
            pstmt.addBatch();

            pstmt.setInt(1, 104);
            pstmt.setString(2, "Anita");
            pstmt.setInt(3, 22);
            pstmt.setFloat(4, 88.0f);
            pstmt.addBatch();

            pstmt.setInt(1, 105);
            pstmt.setString(2, "Ravi");
            pstmt.setInt(3, 20);
            pstmt.setFloat(4, 92.3f);
            pstmt.addBatch();

            int[] counts = pstmt.executeBatch();

            System.out.println(counts.length + " student records inserted successfully!");

            pstmt.close();
            conn.close();

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}

