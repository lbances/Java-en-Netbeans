/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsPracticante extends clsPersona{
    private String fechaInicioPracticante;
    private String fechaTerminoPracticante;
    private String asignacionPracticante;
    private String diasPracticaPracticante;

    public clsPracticante(String fechaInicioPracticante, String fechaTerminoPracticante, String asignacionPracticante, String diasPracticaPracticante, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.fechaInicioPracticante = fechaInicioPracticante;
        this.fechaTerminoPracticante = fechaTerminoPracticante;
        this.asignacionPracticante = asignacionPracticante;
        this.diasPracticaPracticante = diasPracticaPracticante;
    }

    public String getFechaInicioPracticante() {
        return fechaInicioPracticante;
    }

    public void setFechaInicioPracticante(String fechaInicioPracticante) {
        this.fechaInicioPracticante = fechaInicioPracticante;
    }

    public String getFechaTerminoPracticante() {
        return fechaTerminoPracticante;
    }

    public void setFechaTerminoPracticante(String fechaTerminoPracticante) {
        this.fechaTerminoPracticante = fechaTerminoPracticante;
    }

    public String getAsignacionPracticante() {
        return asignacionPracticante;
    }

    public void setAsignacionPracticante(String asignacionPracticante) {
        this.asignacionPracticante = asignacionPracticante;
    }

    public String getDiasPracticaPracticante() {
        return diasPracticaPracticante;
    }

    public void setDiasPracticaPracticante(String diasPracticaPracticante) {
        this.diasPracticaPracticante = diasPracticaPracticante;
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
