package Aftale;

import Patient.Patient;

import java.util.ArrayList;
import java.util.List;

public class AftaleDAO {
    //Forbind til database
    private static List<Aftale> aftaleList = new ArrayList<>();

    public AftaleDAO(){

    }

    public List<Aftale> getAftale() {
        //TODO hent aftaler fra database
        return aftaleList;
    }

    public void addAftale(Aftale nyAftale){
        //TODO tilføj aftaler til database
    aftaleList.add(nyAftale);
    }
}
