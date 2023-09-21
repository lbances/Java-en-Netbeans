/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import Interfaces.I_Agencia;

/**
 *
 * @author lbanc
 */
public class clsAgencia implements I_Agencia {
    protected String nombreEmpresaAgencia;
    protected String telefonoAgencia;
    protected String cuentaBancariaAgencia;
    
    @Override
    public void mostrarDatosAgencia() {
        System.out.println("Nombre de la agencia: " + nombreEmpresaAgencia);
        System.out.println("Teléfono de la agencia: " + telefonoAgencia);
        System.out.println("Número de cuenta bancaria de la agencia: " + cuentaBancariaAgencia);
    }
}
