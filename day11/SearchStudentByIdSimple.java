package day11;

import java.sql.*;
import java.util.Scanner;

public class SearchStudentByIdSimple {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/AssessmentDB"; 
        String user = "root"; 
        String password = "root"; 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM students WHERE id = " + id;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
            } else {
                System.out.println("Student not found.");
            }

            rs.close();
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
