package day11;

import java.sql.*;
import java.util.Scanner;

public class UpdateStudentSimple {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/AssessmentDB"; 
        String user = "root"; 
        String password = "root"; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter new name: ");
        String name = sc.nextLine();

        System.out.print("Enter new age: ");
        int age = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String sql = "UPDATE students SET name = '" + name + "', age = " + age + " WHERE id = " + id;

            int result = stmt.executeUpdate(sql);

            if (result > 0) {
                System.out.println("Student updated successfully.");
            } else {
                System.out.println("Student not found.");
            }

            stmt.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
