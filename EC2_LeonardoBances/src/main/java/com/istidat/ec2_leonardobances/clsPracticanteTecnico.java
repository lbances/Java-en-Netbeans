/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsPracticanteTecnico extends clsPracticante{
    
    private String cicloPracticanteTec;
    private String carreraPracticanteTec;

    public clsPracticanteTecnico(String cicloPracticanteTec, String carreraPracticanteTec, String fechaInicioPracticante, String fechaTerminoPracticante, String asignacionPracticante, String diasPracticaPracticante, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(fechaInicioPracticante, fechaTerminoPracticante, asignacionPracticante, diasPracticaPracticante, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.cicloPracticanteTec = cicloPracticanteTec;
        this.carreraPracticanteTec = carreraPracticanteTec;
    }

    public String getCicloPracticanteTec() {
        return cicloPracticanteTec;
    }

    public void setCicloPracticanteTec(String cicloPracticanteTec) {
        this.cicloPracticanteTec = cicloPracticanteTec;
    }

    public String getCarreraPracticanteTec() {
        return carreraPracticanteTec;
    }

    public void setCarreraPracticanteTec(String carreraPracticanteTec) {
        this.carreraPracticanteTec = carreraPracticanteTec;
    }

    public String getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getNombresPersona() {
        return nombresPersona;
    }

    public void setNombresPersona(String nombresPersona) {
        this.nombresPersona = nombresPersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }
    
    
    
    public clsPracticanteTecnico(String fechaInicioPracticante, String fechaTerminoPracticante, String asignacionPracticante, String diasPracticaPracticante, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(fechaInicioPracticante, fechaTerminoPracticante, asignacionPracticante, diasPracticaPracticante, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
    }
    
}
