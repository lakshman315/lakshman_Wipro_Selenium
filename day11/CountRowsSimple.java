package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CountRowsSimple 
{

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/AssessmentDB"; 
        String user = "root";                            
        String password = "root";                       
        String tableName = "students";                          

        try 
        {
          
        	 Connection conn = DriverManager.getConnection(url, user, password);

        	  Statement stmt = conn.createStatement();

            String sql = "SELECT COUNT(*) AS total_rows FROM " + tableName;
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next())
            {
                int totalRows = rs.getInt("total_rows");
                System.out.println("Total rows in table '" + tableName + "': " + totalRows);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        
    }
}

