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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author lbanc
 */
@Path("version1")
public class UsuarioRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsuarioRest
     */
    public UsuarioRest() {
    }

    /**
     * Retrieves representation of an instance of pe.company.rest.UsuarioRest
     * @return an instance of java.lang.String
     */
    @Path("mensaje")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        return "Hola mundo desde un servicio rest";
    }

    
    @Path("message1/{username}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage1(@PathParam("username") String nombre){
        return "Bienvenido " + nombre + "!";
    }

    @Path("message2")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getMessage2(@QueryParam("username") String nombre) {
        return "<h2>Bienvenido " + nombre + "!</h2>";
    }

    @Path("message3/{username}")
    @GET
    @Produces(MediaType.TEXT_XML)
    public String getMessage3(@PathParam("username") String nombre) {
        return "<msg>Bienvenido " + nombre + "!</msg>";
    }
    
    @Path("message4")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMessage4(@QueryParam("username") String nombre){
        return "Bienvenido " + nombre + "!";
    }
}