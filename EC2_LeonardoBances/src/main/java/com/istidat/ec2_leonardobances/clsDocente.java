/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsDocente extends clsEmpleado{
    
    private String categoriaDocente;
    private String sueldoDocente;
    private String cursoDocente;

    public clsDocente(String categoriaDocente, String sueldoDocente, String cursoDocente, String especialidadEmpleado, String profesionEmpleado, String tipoContratoEmpleado, String fechaIngresoEmpleado, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(especialidadEmpleado, profesionEmpleado, tipoContratoEmpleado, fechaIngresoEmpleado, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.categoriaDocente = categoriaDocente;
        this.sueldoDocente = sueldoDocente;
        this.cursoDocente = cursoDocente;
    }

    public String getCategoriaDocente() {
        return categoriaDocente;
    }

    public void setCategoriaDocente(String categoriaDocente) {
        this.categoriaDocente = categoriaDocente;
    }

    public String getSueldoDocente() {
        return sueldoDocente;
    }

    public void setSueldoDocente(String sueldoDocente) {
        this.sueldoDocente = sueldoDocente;
    }

    public String getCursoDocente() {
        return cursoDocente;
    }

    public void setCursoDocente(String cursoDocente) {
        this.cursoDocente = cursoDocente;
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
    
    
    
    public clsDocente(String especialidadEmpleado, String profesionEmpleado, String tipoContratoEmpleado, String fechaIngresoEmpleado, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(especialidadEmpleado, profesionEmpleado, tipoContratoEmpleado, fechaIngresoEmpleado, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
    }
    
}
