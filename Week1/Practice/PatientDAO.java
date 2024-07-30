package Practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PatientDAO {
    Connection con;
    PatientDAO() {
        
        try {
            con = DbConnection.getConnection();
        } catch (SQLException e) {}

    }

    public void createPatient (Patient patientObj) {
        String sql = "insert into patients (patientName, medicalHistory) values (?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
            
            ps.setString(1,patientObj.getPatientName());
            ps.setString(2, patientObj.getMedicalHistory());
            ps.executeUpdate();

            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                patientObj.setPatientID(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            System.out.print(e);
        }

    }
}
