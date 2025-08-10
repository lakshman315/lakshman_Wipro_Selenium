package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class insertstudentrecords {

    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/AssessmentDB"; 
        String user = "root"; 
        String password = "root";

        
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

        
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement  stmt = conn.createStatement();
            System.out.println("Connected to database\n");

            String sql = ("INSERT INTO students (id, name, age) VALUES (101, 'lakshman', 20),"+
            		"(102,'Suvin',21),"+
            		"(103,'Prudhvi',21)");

            int rowsInserted = stmt.executeUpdate(sql);

            if (rowsInserted > 0) 
            {
                System.out.println("A new student record was inserted successfully!");
            }

        } 
          catch (SQLException ex) 
        {
                ex.printStackTrace();
            
        }
    }
}
