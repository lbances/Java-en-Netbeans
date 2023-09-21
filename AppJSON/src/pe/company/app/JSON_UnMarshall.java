package pe.company.app;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import pe.company.model.Area;

public class JSON_UnMarshall {

    public static void main(String[] args) {
        
        ObjectMapper objectMapper=new ObjectMapper();
        
        try {
            File areaJSON = new File("C:\\Users\\lbanc\\Desktop\\Idat\\Ciclo V\\5. Desarrollo de Servicios Web I\\Logro 3\\Recuperación 22-07\\areaJSON");
            
            Area area = objectMapper.readValue(areaJSON, Area.class);
            
            System.out.println("Información del Área de trabajo:");
            System.out.println("ID Área: " + area.getId_area());
            System.out.println("Nombre: " + area.getNombre());
            System.out.println("Teléfono: " + area.getTelefono());
            System.out.println("Empleados: " + area.getEmpleados());

        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
