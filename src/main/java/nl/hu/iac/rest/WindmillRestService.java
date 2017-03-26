package nl.hu.iac.rest;

import nl.hu.iac.service.ServiceProvider;
import nl.hu.iac.service.WindmillServiceImpl;
import nl.hu.iac.service.model.Windmill;
import sun.awt.WindowIDProvider;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeroen on 23-Mar-17.
 */


@Path("/windmill")
public class WindmillRestService {

    @GET
    @Path("/getbyid/{windmillID}")
    @Produces({MediaType.APPLICATION_JSON})
    public Windmill getWindmill(@PathParam("windmillID") int id){
        WindmillServiceImpl windmillServiceImpl = ServiceProvider.getWindmillServiceService();
        return windmillServiceImpl.getWindmillById(id);
    }

    @GET
    @Path("/getSuitable/{requiredOutput}/{budget}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Windmill> getSuitableWindmills(@PathParam("requiredOutput") int requiredOutput, @PathParam("budget") double budget) {
        WindmillServiceImpl windmillServiceImpl = ServiceProvider.getWindmillServiceService();
        return windmillServiceImpl.getSuitableWindmills(requiredOutput, budget);
    }

    @GET
    @Path("/getwindmills")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Windmill> getAllWindmills() {
        WindmillServiceImpl windmillServiceImpl = ServiceProvider.getWindmillServiceService();
        return windmillServiceImpl.getWindmills();
    }

    @PUT
    @Consumes ({MediaType.APPLICATION_JSON})
    @Produces ({MediaType.APPLICATION_JSON})
    public Windmill addWindmill(Windmill windmill) {
        WindmillServiceImpl windmillServiceImpl = ServiceProvider.getWindmillServiceService();
        return windmillServiceImpl.add(windmill);
    }
}
