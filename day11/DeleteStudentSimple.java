package day11;

import java.sql.*;
import java.util.Scanner;

public class DeleteStudentSimple {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/AssessmentDB";
        String user = "root"; 
        String password = "root"; 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String sql = "DELETE FROM students WHERE id = " + id;
            int rows = stmt.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Student deleted.");
            } else {
                System.out.println("Student not found.");
            }

            stmt.close();
            con.close();
            sc.close();

        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
