/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsEmpleado extends clsPersona{
    private String especialidadEmpleado;
    private String profesionEmpleado;
    private String tipoContratoEmpleado;
    private String fechaIngresoEmpleado;

    public clsEmpleado(String especialidadEmpleado, String profesionEmpleado, String tipoContratoEmpleado, String fechaIngresoEmpleado, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.especialidadEmpleado = especialidadEmpleado;
        this.profesionEmpleado = profesionEmpleado;
        this.tipoContratoEmpleado = tipoContratoEmpleado;
        this.fechaIngresoEmpleado = fechaIngresoEmpleado;
    }

    public String getEspecialidadEmpleado() {
        return especialidadEmpleado;
    }

    public void setEspecialidadEmpleado(String especialidadEmpleado) {
        this.especialidadEmpleado = especialidadEmpleado;
    }

    public String getProfesionEmpleado() {
        return profesionEmpleado;
    }

    public void setProfesionEmpleado(String profesionEmpleado) {
        this.profesionEmpleado = profesionEmpleado;
    }

    public String getTipoContratoEmpleado() {
        return tipoContratoEmpleado;
    }

    public void setTipoContratoEmpleado(String tipoContratoEmpleado) {
        this.tipoContratoEmpleado = tipoContratoEmpleado;
    }

    public String getFechaIngresoEmpleado() {
        return fechaIngresoEmpleado;
    }

    public void setFechaIngresoEmpleado(String fechaIngresoEmpleado) {
        this.fechaIngresoEmpleado = fechaIngresoEmpleado;
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
