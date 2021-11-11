package Aftale;

public class AftaleController {
    private static AftaleDAO aftaleDAO = new AftaleDAO();

    public void saveAftale(Aftale nyAftale) {
        aftaleDAO.addAftale(nyAftale);
    }
}
