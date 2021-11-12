package Aftale;

import java.util.List;

public class AftaleController {
    private AftaleDAO aftaleDAO = new AftaleDAO();
    public List<Aftale> getAftale() {return aftaleDAO.getAftale();}

    public void saveAftale(Aftale nyAftale) {
        aftaleDAO.addAftale(nyAftale);
    }

}
