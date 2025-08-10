package jdbc;

import java.sql.*;

public class EmployeeProcedures {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/SchoolDB";
        String user = "root";
        String password = "root";

        try (Connection con = DriverManager.getConnection(url, user, password)) {

            // 1. Add 5000 bonus to all employees
            CallableStatement cs1 = con.prepareCall("{call AddBonus()}");
            cs1.execute();
            System.out.println("✅ Bonus added to all employees.\n");

            // 2. Print employees with same names
            CallableStatement cs2 = con.prepareCall("{call PrintSameNames()}");
            ResultSet rs2 = cs2.executeQuery();
            System.out.println("👥 Employees with same names:");
            while (rs2.next()) {
                System.out.println(rs2.getInt("id") + " - " +
                                   rs2.getString("name") + " - " +
                                   rs2.getDouble("salary"));
            }

            // 3. Print highest and lowest salary employees
            CallableStatement cs3 = con.prepareCall("{call PrintHighLowSalary()}");
            ResultSet rs3 = cs3.executeQuery();
            System.out.println("\n📊 Employees with Highest and Lowest Salaries:");
            while (rs3.next()) {
                System.out.println(rs3.getInt("id") + " - " +
                                   rs3.getString("name") + " - " +
                                   rs3.getDouble("salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
