package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Percentagedemo {

    public static void main(String[] args) throws ClassNotFoundException 
    {

        String url = "jdbc:mysql://localhost:3306/AssessmentDB"; 
        String user = "root"; 
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            System.out.println("Connected to database\n");

            // Insert student records with percentage
            stmt.executeUpdate("DELETE FROM students");

            String sqlInsert = "INSERT INTO students (id, name, age, percentage) VALUES " +
                    "(101, 'Lakshman', 20, 85.5), " +
                    "(102, 'Suvin', 21, 78.0), " +
                    "(103, 'Prudhvi', 21, 74.5), " +
                    "(104, 'Anita', 22, 88.0), " +
                    "(105, 'Ravi', 20, 92.3)";

            int rowsInserted = stmt.executeUpdate(sqlInsert);

            if (rowsInserted > 0)
            {
                System.out.println(rowsInserted + " student records were inserted successfully!\n");
            }

            // Query to display students with percentage > 75
            String sqlSelect = "SELECT * FROM students WHERE percentage > 75";

            ResultSet rs = stmt.executeQuery(sqlSelect);

            System.out.println("Students with percentage greater than 75:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                float percentage = rs.getFloat("percentage");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Percentage: " + percentage);
            }

            

        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}

