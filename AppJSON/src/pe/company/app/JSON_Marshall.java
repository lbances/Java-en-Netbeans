/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import pe.company.model.Area;

/**
 *
 * @author lbanc
 */
public class JSON_Marshall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Area area = new Area(1021, "Tecnología", 3621415, null);
        
        ArrayList<String> empleados = new ArrayList<String>();
        empleados.add("Leonardo");
        empleados.add("Jose");
        empleados.add("Ana");
        
        area.setEmpleados(empleados);
        
        ObjectMapper objectMapper=new ObjectMapper();
        
        try {
            File areaJSON = new File("C:\\Users\\lbanc\\Desktop\\Idat\\Ciclo V\\5. Desarrollo de Servicios Web I\\Logro 3\\Recuperación 22-07");
            
            objectMapper.configure(SerializationConfig.Feature.INDENT_OUTPUT,true);
            objectMapper.writeValue(areaJSON, area);
            
            System.out.println(objectMapper.writeValueAsString(area));
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
