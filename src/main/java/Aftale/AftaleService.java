package Aftale;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("aftaler")
public class AftaleService {
    static AftaleController aftaleController = new AftaleController();
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void opretAftale(Aftale nyAftale){
        System.out.println(nyAftale.getDate());
        System.out.println(nyAftale.getCpr());
        aftaleController.saveAftale(nyAftale);
    }
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public void hentAftale(Aftale nyAftale){
        System.out.println(nyAftale.getDate());
        System.out.println(nyAftale.getCpr());
        aftaleController.saveAftale(nyAftale);
    }
}
