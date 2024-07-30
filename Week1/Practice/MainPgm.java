package Practice;

public class MainPgm {
    public static void main(String[] args) {
        Patient patientObj = new Patient();
        patientObj.setPatientName("John Doe");
        patientObj.setMedicalHistory("Hight Sugar");

        PatientDAO pdao = new PatientDAO();
        pdao.createPatient(patientObj);
    }
}
