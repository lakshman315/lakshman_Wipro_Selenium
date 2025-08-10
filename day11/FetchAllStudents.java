package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchAllStudents {

    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/ AssessmentDB"; 
        String user = "root";      
        String password = "root";  

    

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("ID\tName\tAge");
            System.out.println("---------------------------------");

            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " " + name + "\t " + age);
            }

  
        }
        catch (SQLException ex) 
        {
                ex.printStackTrace();
            
        }
    }
}
