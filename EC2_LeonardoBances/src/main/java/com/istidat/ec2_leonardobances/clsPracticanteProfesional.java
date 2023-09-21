/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsPracticanteProfesional extends clsPracticante{
    
    private String semestrePracticantePro;
    private String profesionPracticantePro;
    private String especialidadPracticantePro;

    public clsPracticanteProfesional(String semestrePracticantePro, String profesionPracticantePro, String especialidadPracticantePro, String fechaInicioPracticante, String fechaTerminoPracticante, String asignacionPracticante, String diasPracticaPracticante, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(fechaInicioPracticante, fechaTerminoPracticante, asignacionPracticante, diasPracticaPracticante, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.semestrePracticantePro = semestrePracticantePro;
        this.profesionPracticantePro = profesionPracticantePro;
        this.especialidadPracticantePro = especialidadPracticantePro;
    }

    public String getSemestrePracticantePro() {
        return semestrePracticantePro;
    }

    public void setSemestrePracticantePro(String semestrePracticantePro) {
        this.semestrePracticantePro = semestrePracticantePro;
    }

    public String getProfesionPracticantePro() {
        return profesionPracticantePro;
    }

    public void setProfesionPracticantePro(String profesionPracticantePro) {
        this.profesionPracticantePro = profesionPracticantePro;
    }

    public String getEspecialidadPracticantePro() {
        return especialidadPracticantePro;
    }

    public void setEspecialidadPracticantePro(String especialidadPracticantePro) {
        this.especialidadPracticantePro = especialidadPracticantePro;
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
    
    
    
    public clsPracticanteProfesional(String fechaInicioPracticante, String fechaTerminoPracticante, String asignacionPracticante, String diasPracticaPracticante, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(fechaInicioPracticante, fechaTerminoPracticante, asignacionPracticante, diasPracticaPracticante, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
    }
    
}
