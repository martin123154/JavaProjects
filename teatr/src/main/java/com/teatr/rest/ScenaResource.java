package com.teatr.rest;



import com.teatr.ScenaDAO;
import com.teatr.domain.Scena;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Date;
import java.util.List;

@Stateless
@Path("/scena")
public class ScenaResource {

    @EJB
    private ScenaDAO scenaManager;

    @POST
    @Path("/addScena")
    public Response addCustomer(@FormParam("nazwa") String nazwa,
                                @FormParam("wielkosc") String wielkosc)
    {
        Scena scena = new Scena();
        scena.setNazwa(nazwa);
        scena.setWielkosc(wielkosc);
 
        scenaManager.addScena(scena);

        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/getAllSceny")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Scena> getAllSceny() {
        return scenaManager.getAllSceny();
    }

    @GET
    @Path("/getScena/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Scena getScenaByID(@PathParam("id") Long id) {
        return scenaManager.getScenaByID(id);
    }

    @POST
    @Path("/updateScena")
    public Response updateScena(@FormParam("idScena") long idScena,
                                   @FormParam("nazwa") String nazwa,
                                   @FormParam("wielkosc") String wielkosc)
    {
        Scena scena = new Scena();
        scena.setIdScena(idScena);
        scena.setNazwa(nazwa);
        scena.setWielkosc(wielkosc);


        scenaManager.updateScena(scena);

        return Response.status(Response.Status.OK).build();
    }

    @POST
    @Path("/deleteScena")
    public Response deleteScena(@FormParam("idScena") long idScena)
    {
        Scena scena = new Scena();
        scena.setIdScena(idScena);

        scenaManager.deleteScena(scena);

        return Response.status(Response.Status.OK).build();
    }
}