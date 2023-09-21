/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import Interfaces.I_ATCcliente;

/**
 *
 * @author lbanc
 */
public class clsATCcliente implements I_ATCcliente{
    protected String IDEmpresa;
    
    @Override
    public void mostrarATCcliente() {
        System.out.println("ID de la empresa: " + IDEmpresa);
    }
    
}
