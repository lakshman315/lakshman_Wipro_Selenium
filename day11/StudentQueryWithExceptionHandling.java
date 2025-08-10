package day11;

import java.sql.*;

public class StudentQueryWithExceptionHandling {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/AssessmentDB";
        String user = "root";
        String password = "root";

        int studentId = 101;

        
        try 
        {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM students WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, studentId);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next())
            {
                System.out.println("Student found:");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Percentage: " + rs.getDouble("percentage"));
            } 
            else 
            {
                
                System.out.println("No student found with ID: " + studentId);
            }

        
        } 
        catch (Exception e) 
        {
            System.err.println("Unexpected error:");
            e.printStackTrace();
        } 
    }
}
