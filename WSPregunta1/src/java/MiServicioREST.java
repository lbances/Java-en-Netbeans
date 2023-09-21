
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lbanc
 */
@Path("/mi_servicio")
public class MiServicioREST {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String obtenerMensaje() {
        return "¡Hola! Este es mi servicio web REST con Java y Apache Tomcat en NetBeans 8.2.";
    }
}
