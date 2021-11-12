package Aftale;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;
import java.util.List;

@Path("aftaler")
public class AftaleService {
    static AftaleController aftaleController = new AftaleController();
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void opretAftale(Aftale nyAftale){
        //System.out.println(nyAftale.getDate());
        //System.out.println(nyAftale.getCpr());
        aftaleController.saveAftale(nyAftale);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aftale> getAftale() {
        return aftaleController.getAftale();
    }


            //public void hentAftale(Aftale nyAftale){
        //System.out.println(nyAftale.getDate());
        //System.out.println(nyAftale.getCpr());
        //aftaleController.saveAftale(nyAftale);
    //}
}
