package JDBCRecall;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ResourceNotFound {
        PatientDAO patientDAO = new PatientDAO();

        // Create a new patient record
        Patient patient1 = new Patient();
        patient1.setPatientName("John Doe");
        patient1.setMedicalHistory("High Sugar");
        patientDAO.createPatient(patient1);

        // Retrieve a patient's medical record by patientID

        Patient retriveedPatient = patientDAO.getPatientByID(patient1.getPatientID());
        System.out.println("Retrived Patient: " + retriveedPatient.getPatientName());
        System.out.println("Medical History: " +retriveedPatient.getMedicalHistory());
      
        // Clean up and close the database connection
    }

    
}
