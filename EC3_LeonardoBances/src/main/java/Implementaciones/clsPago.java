/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import Interfaces.I_Pago;

/**
 *
 * @author lbanc
 */
public class clsPago implements I_Pago{
    protected String prepagoPago;

    @Override
    public void mostrarDatosPago() {
        System.out.println("El pago del cliente es: " + prepagoPago);
    }
    
    
}
