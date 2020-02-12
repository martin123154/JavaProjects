package com.teatr.rest;

import com.teatr.ScenaDAO;
import com.teatr.PrzedstawienieDAO;

import com.teatr.domain.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.List;

@Stateless
@Path("/przedstawienie")
public class PrzedstawienieResource {

    @EJB
    private ScenaDAO scenaManager;


    @EJB
    private PrzedstawienieDAO przedstawienieManager;

    @POST
    @Path("/addPrzedstawienie")
    public Response addPrzedstawienie(@FormParam("scenaID") String scena,
                                 @FormParam("tytul") String tytul,
                                 @FormParam("data_rozp") String data_rozp,
                                 @FormParam("data_zak") String data_zak)
    {
        Long scenaID = Long.parseLong(scena.replaceAll("\\D+",""));


        Przedstawienie przedstawienie = new Przedstawienie();
        przedstawienie.setScena(scenaManager.getScenaByID(scenaID));
        przedstawienie.setTytul(tytul);
        przedstawienie.setData_rozp(data_rozp);
        przedstawienie.setData_zak(data_zak);

        przedstawienieManager.addPrzedstawienie(przedstawienie);

        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/getAllPrzedstawienia")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Przedstawienie> getAllPrzedstawienia() {
        return przedstawienieManager.getAllPrzedstawienia();
    }

    @GET
    @Path("/getPrzedstawienie/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Przedstawienie getPrzedstawienieByID(@PathParam("id") Long id) {
        return przedstawienieManager.getPrzedstawienieByID(id);
    }

    @POST
    @Path("/updatePrzedstawienie")
    public Response updatePrzedstawienie(@FormParam("idPrzedstawienie") long idPrzedstawienie,
                                    @FormParam("scenaID") String scena,
                      
                                    @FormParam("tytul") String tytul,
                                    @FormParam("data_rozp") String data_rozp,
                                    @FormParam("data_zak") String data_zak)
                    
    {
    	Long scenaID = Long.parseLong(scena.replaceAll("\\D+",""));


        Przedstawienie przedstawienie = przedstawienieManager.getPrzedstawienieByID(idPrzedstawienie);
        przedstawienie.setScena(scenaManager.getScenaByID(scenaID));
        przedstawienie.setTytul(tytul);
        przedstawienie.setData_rozp(data_rozp);
        przedstawienie.setData_zak(data_zak);

        przedstawienieManager.updatePrzedstawienie(przedstawienie);

        return Response.status(Response.Status.OK).build();
    }

    @POST
    @Path("/deletePrzedstawienie")
    public Response deletePrzedstawienie(@FormParam("idPrzedstawienie") long idPrzedstawienie)
    {
    	Przedstawienie przedstawienie = new Przedstawienie();
    	przedstawienie.setIdPrzedstawienie(idPrzedstawienie);

    	przedstawienieManager.deletePrzedstawienie(przedstawienie);

        return Response.status(Response.Status.OK).build();
    }
}
