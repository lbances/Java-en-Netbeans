/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.app;

import java.util.Collection;
import pe.company.ws.Pelicula;

/**
 *
 * @author lbanc
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Collection<Pelicula> itemsPeliculas = obtenerInformacionGeneral("Rapidos y Furiosos 10");
        
        for (Pelicula item : itemsPeliculas) {
            System.out.println(item.getTitulo() + " (" + item.getRestriccion() + ")");
            System.out.println(item.getGenero());
            System.out.println("Duración: " + item.getDuracion() + "\n");
        }
    }

    private static java.util.List<pe.company.ws.Pelicula> obtenerInformacionGeneral(java.lang.String titulo) {
        pe.company.ws.WAppPregunta1_Service service = new pe.company.ws.WAppPregunta1_Service();
        pe.company.ws.WAppPregunta1 port = service.getWAppPregunta1Port();
        return port.obtenerInformacionGeneral(titulo);
    }
}
