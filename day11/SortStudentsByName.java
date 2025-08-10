package day11;

import java.sql.*;

public class SortStudentsByName {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/AssessmentDB"; 
        String user = "root";                            
        String password = "root";                        
        String table = "students";                                

        try 
        {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM " + table + " ORDER BY name ASC";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("ID\tName\tAge");

            while (rs.next()) 
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + "\t" + name + "\t" + age);
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
