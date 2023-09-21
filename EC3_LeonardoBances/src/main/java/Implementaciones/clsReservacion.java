/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import Interfaces.I_Reservacion;

/**
 *
 * @author lbanc
 */
public class clsReservacion implements I_Reservacion{
    protected String modeloAutoReserva;
    protected String marcaAutoReserva;
    protected String colorAutoReserva;
    protected String matriculaAutoReserva;
    protected String dispoAutoReserva;

    @Override
    public void mostrarDatosReservacion() {
        
        System.out.println("El modelo del auto es: " + modeloAutoReserva);
        System.out.println("La marca del auto es: " + marcaAutoReserva);
        System.out.println("El color del auto es: " + colorAutoReserva);
        System.out.println("La matricula del auto es: " + matriculaAutoReserva);
        System.out.println("La disponibilidad del auto es: " + dispoAutoReserva);
        
    }
    
}
