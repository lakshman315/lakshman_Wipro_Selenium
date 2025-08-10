package jdbc;

import java.sql.*;

public class HospitalProcedures {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/SchoolDB";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
        	
        	

            // 1. Average Patient Count Daily
            System.out.println("Average Patient Count Daily:");
            CallableStatement cs1 = conn.prepareCall("{CALL AvgPatientCountDaily()}");
            ResultSet rs1 = cs1.executeQuery();
            while (rs1.next()) {
                System.out.println(rs1.getDate("admission_date") + " - " + rs1.getInt("patient_count"));
            }

            // 2. Patients in Same Ward
            System.out.println("\nPatients in Ward No 101:");
            CallableStatement cs2 = conn.prepareCall("{CALL PatientsInSameWard(?)}");
            cs2.setInt(1, 101); // Replace with actual ward number
            ResultSet rs2 = cs2.executeQuery();
            while (rs2.next()) {
                System.out.println(rs2.getInt("patient_id") + " - " + rs2.getString("name"));
            }

            // 3. Sort Patients by Admission Date
            System.out.println("\nSorted Patients by Admission Date:");
            CallableStatement cs3 = conn.prepareCall("{CALL SortPatientsByAdmissionDate()}");
            ResultSet rs3 = cs3.executeQuery();
            while (rs3.next()) {
                System.out.println(rs3.getInt("patient_id") + " - " + rs3.getString("name") + " - " + rs3.getDate("admission_date"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
