package day11;

import java.sql.Connection;
import java.sql.DriverManager;

public class SimpleMySQLConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/AssessmentDB";
        String user = "root";
        String pass = "root";

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to database!");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}

