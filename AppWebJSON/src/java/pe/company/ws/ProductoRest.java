/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.ws;

import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pe.company.dao.ProductoDao;
import pe.company.vo.ProductoVo;

/**
 * REST Web Service
 *
 * @author lbanc
 */
@Path("producto")
public class ProductoRest {

    @Context
    private UriInfo context;
    
    private ProductoDao productoDao = new ProductoDao();

    /**
     * Creates a new instance of ProductoRest
     */
    public ProductoRest() {
    }

    /**
     * Retrieves representation of an instance of pe.company.ws.ProductoRest
     * @return an instance of java.lang.String
     */
    @Path("/listar")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<ProductoVo> getJson() {
        return productoDao.findAll();
    }
    
    @Path("/agregar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response agregar(ProductoVo producto){
        
        try {
            productoDao.insert(producto);
            return Response.ok().entity(producto).build();
        }
        
        catch (Exception e) {
            return Response.noContent().build();
        }
    }

    /**
     * PUT method for updating or creating an instance of ProductoRest
     * @param content representation for the resource
     */
    
    @Path("/actualizar")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putJson(ProductoVo producto) {
        productoDao.update(producto);
        return Response.ok().entity(producto).build();
    }
    
    
    @Path("/eliminar/{id_producto}")
    @DELETE
    public Response eliminar(@QueryParam ("id_producto") Integer id_producto){
        productoDao.delete(id_producto);
        return Response.ok().build();
    }
}
