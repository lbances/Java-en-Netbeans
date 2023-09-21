/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author lbanc
 */
@Path("alumno")
public class AlumnoRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AlumnoRest
     */
    public AlumnoRest() {
    }

    /**
     * Retrieves representation of an instance of pe.company.rest.AlumnoRest
     * @return an instance of java.lang.String
     */
    
    @Path("promedio/{ec1}&{ec2}&{ec3}&{ec4}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getPromedio(@PathParam("ec1") int ec1, @PathParam("ec2") int ec2, @PathParam("ec3") int ec3, @PathParam("ec4") int ec4) {
        
        double resultado = (ec1 * 0.04) + (ec2 * 0.12) + (ec3 * 0.24) + (ec4 * 0.60);
        
        return "promedio" + resultado;
    }
}
