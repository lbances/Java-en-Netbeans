/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.app;

import java.util.Collection;
import pe.company.ws.Empleado;

/**
 *
 * @author lbanc
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<Empleado> itemsEmpleados = baraja("1021");
        
        for (Empleado item : itemsEmpleados) {
            System.out.println("ID Empleado: " + item.getIdEmpleado());
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Fecha de contrato: " + item.getFechaContrato());
            System.out.println("Profesión: " + item.getProfesion());
            System.out.println("Sueldo: S/." + item.getFechaContrato() + "\n");
        }
    }

    private static java.util.List<pe.company.ws.Empleado> baraja(java.lang.String codigo) {
        pe.company.ws.WS02_Service service = new pe.company.ws.WS02_Service();
        pe.company.ws.WS02 port = service.getWS02Port();
        return port.baraja(codigo);
    }
    
    
}
