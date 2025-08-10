package day11;

import java.sql.*;
import java.util.Scanner;

public class LoginSystem {

    private static final String URL = "jdbc:mysql://localhost:3306/UserDB";
    private static final String USER = "root"; 
    private static final String PASSWORD = "root"; 

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = sc.nextLine();

        boolean loginSuccess = checkLogin(inputUsername, inputPassword);

        if (loginSuccess) 
        {
            System.out.println("Login successful! Welcome " + inputUsername);
        } 
        else
        {
            System.out.println("Login failed! Invalid username or password.");
        }

        sc.close();
    }

    public static boolean checkLogin(String username, String password) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement pstmt = conn.prepareStatement(query)) {

                pstmt.setString(1, username);
                pstmt.setString(2, password);

                try (ResultSet rs = pstmt.executeQuery()) 
                {
                    if (rs.next())
                    {
                        return true;
                    }
                }
            }
        }
        catch (ClassNotFoundException e) 
        {
            System.out.println("JDBC Driver not found.");
        }
        catch (SQLException e) 
        {
            System.out.println("Database error: " + e.getMessage());
        }

        return false; 
    }
}
