/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.ws;

import java.util.ArrayList;
import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.company.model.Pelicula;

/**
 *
 * @author lbanc
 */
@WebService(serviceName = "WAppPregunta1")
public class WAppPregunta1 {

    public static final Collection<Pelicula> itemsPelicula = new ArrayList();
    
    static {
        Pelicula Pelicula1 = new Pelicula ("Rapidos y Furiosos 10", "Apta para todos", "Aventura, Acción, Fantasía", "2 horas 40 minutos");
        Pelicula Pelicula2 = new Pelicula ("El Padrino 2", "+18", "Acción, Violencia", "2 horas 40 minutos");
        Pelicula Pelicula3 = new Pelicula ("El Lobo de Wall Street", "Apta para todos", "Aventura,Acción,Fantasía", "2 horas 40 minutos");
        
        itemsPelicula.add(Pelicula1);
        itemsPelicula.add(Pelicula2);
        itemsPelicula.add(Pelicula3);
    }
    
    @WebMethod(operationName = "obtenerInformacionGeneral")
    public Collection<Pelicula> listarPeliculas(@WebParam(name = "titulo") String titulo){
        return itemsPelicula;
    }
}
