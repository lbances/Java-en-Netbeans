/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsPersona {
    protected String codigoPersona;
    protected String apellidoPersona;
    protected String nombresPersona;
    protected String direccionPersona;
    protected String telefonoPersona;

    public clsPersona() {
    }

    public clsPersona(String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        this.codigoPersona = codigoPersona;
        this.apellidoPersona = apellidoPersona;
        this.nombresPersona = nombresPersona;
        this.direccionPersona = direccionPersona;
        this.telefonoPersona = telefonoPersona;
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
    
    
}
