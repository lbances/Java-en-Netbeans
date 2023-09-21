/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsVoluntario extends clsPersona{
    private String fechaInicioVoluntario;
    private String fechaTerminoVoluntario;
    private String categoriaVoluntario;
    private String funcionesVoluntario;

    public clsVoluntario(String fechaInicioVoluntario, String fechaTerminoVoluntario, String categoriaVoluntario, String funcionesVoluntario, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.fechaInicioVoluntario = fechaInicioVoluntario;
        this.fechaTerminoVoluntario = fechaTerminoVoluntario;
        this.categoriaVoluntario = categoriaVoluntario;
        this.funcionesVoluntario = funcionesVoluntario;
    }

    public String getFechaInicioVoluntario() {
        return fechaInicioVoluntario;
    }

    public void setFechaInicioVoluntario(String fechaInicioVoluntario) {
        this.fechaInicioVoluntario = fechaInicioVoluntario;
    }

    public String getFechaTerminoVoluntario() {
        return fechaTerminoVoluntario;
    }

    public void setFechaTerminoVoluntario(String fechaTerminoVoluntario) {
        this.fechaTerminoVoluntario = fechaTerminoVoluntario;
    }

    public String getCategoriaVoluntario() {
        return categoriaVoluntario;
    }

    public void setCategoriaVoluntario(String categoriaVoluntario) {
        this.categoriaVoluntario = categoriaVoluntario;
    }

    public String getFuncionesVoluntario() {
        return funcionesVoluntario;
    }

    public void setFuncionesVoluntario(String funcionesVoluntario) {
        this.funcionesVoluntario = funcionesVoluntario;
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
