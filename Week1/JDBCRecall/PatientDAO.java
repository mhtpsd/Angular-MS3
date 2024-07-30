package JDBCRecall;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class PatientDAO {
    Connection con;
    public PatientDAO() throws SQLException {
            con = DBConnection.getConnection();
    }

    public void createPatient(Patient patient) throws SQLException {
        //Write a code for insert as well as reterive auto generate key assign to patientId
        String sql = "insert into patient (patientName, medicalHistory) values(?,?)";
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, patient.getPatientName());
            ps.setString(2, patient.getMedicalHistory());
            ps.executeUpdate();

            ResultSet generatedkeys = ps.getGeneratedKeys();
            if(generatedkeys.next()) {
                patient.setPatientID(generatedkeys.getInt(1));
            }
        
      }

    public Patient getPatientByID(int patientID) throws SQLException {
        
      }
}
