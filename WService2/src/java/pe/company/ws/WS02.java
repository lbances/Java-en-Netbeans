/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.company.model.Empleado;

/**
 *
 * @author lbanc
 */
@WebService(serviceName = "WS02")
public class WS02 {

    private static final Collection<Empleado> itemsEmpleado = new ArrayList();
    static {
        Empleado Empleado1 = new Empleado (1021, "Armando", new GregorianCalendar(2014, 3, 1).getTime(), "Contador", 4000.0);
        Empleado Empleado2 = new Empleado (1022, "Margarita", new GregorianCalendar(2018, 9, 20).getTime(), "Ingeniero", 6000.0);
        Empleado Empleado3 = new Empleado (1023, "Basilio", new GregorianCalendar(2015, 3, 1).getTime(), "Arquitecto", 5000.0);
        Empleado Empleado4 = new Empleado (1024, "Berena", new GregorianCalendar(2019, 11, 21).getTime(), "Obrero", 2000.0);
        
        itemsEmpleado.add(Empleado1);
        itemsEmpleado.add(Empleado2);
        itemsEmpleado.add(Empleado3);
        itemsEmpleado.add(Empleado4);
        
        
    }
    
    
    @WebMethod(operationName = "baraja")
    public Collection<Empleado> listarEmpleados(@WebParam(name = "codigo") String codigo){
        return itemsEmpleado;
    }
}
