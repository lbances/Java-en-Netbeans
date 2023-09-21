/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import Interfaces.I_Cliente;

/**
 *
 * @author lbanc
 */
public class clsCliente implements I_Cliente{
    protected String IDCliente;
    protected String datosBancariosCliente;
    protected String direccionCliente;
    protected String telefonoCliente;
    
    @Override
    public void mostrarDatosCliente() {
        System.out.println("ID del cliente: " + IDCliente);
        System.out.println("Datos bancarios del cliente: "+ datosBancariosCliente);
        System.out.println("Dirección del cliente: " + direccionCliente);
        System.out.println("Teléfono del cliente: " + telefonoCliente);
    }
}
