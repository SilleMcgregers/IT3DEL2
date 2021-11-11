package Patient;

import java.util.List;

public class PatientController {
    private PatientDAO patientDAO = new PatientDAO();
    public List<Patient> getPatients() {
        return patientDAO.getPatients();
    }

    public void addPatient(Patient patient){
        patientDAO.addPatient(patient);
    }
}
