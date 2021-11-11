package Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientDAO {
    //Forbind til database
    private static List<Patient> patientListe = new ArrayList<>();

    public PatientDAO(){
        Patient patient = new Patient();
        patient.setName("Sille");
        patientListe.add(patient);
    }
    public List<Patient> getPatients() {
        //TODO Hent patienter fra database
        return patientListe;
    }

    public void addPatient(Patient patient){

        //TODO Tilføj patient til database
        patientListe.add(patient);
    }
}
