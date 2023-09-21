/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.istidat.ec3_leonardobances;

import Implementaciones.clsATCcliente;
import Implementaciones.clsAgencia;
import Implementaciones.clsCliente;
import Implementaciones.clsPago;
import Implementaciones.clsReservacion;
import Interfaces.I_ATCcliente;
import Interfaces.I_Agencia;
import Interfaces.I_Cliente;
import Interfaces.I_Pago;
import Interfaces.I_Reservacion;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 *
 * @author lbanc
 */
public class EC3_LeonardoBances {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("springXMLConfig.xml");

        I_ATCcliente ATCcliente = ctx.getBean("ATCcliente_Service", clsATCcliente.class);
        ATCcliente.mostrarATCcliente();
        
        I_Agencia Agencia = (I_Agencia) ctx.getBean("Agencia_Service", clsAgencia.class);
        Agencia.mostrarDatosAgencia();
        
        I_Cliente Cliente = (I_Cliente) ctx.getBean("Cliente_Service", clsCliente.class);
        Cliente.mostrarDatosCliente();
        
        I_Pago Pago = (I_Pago) ctx.getBean("Pago_ServicePago_Service", clsPago.class);
        Pago.mostrarDatosPago();
        
        I_Reservacion Reservacion = (I_Reservacion) ctx.getBean("ReservacionService", clsReservacion.class);
        Reservacion.mostrarDatosReservacion();

        ctx.close();
        
    }
}
