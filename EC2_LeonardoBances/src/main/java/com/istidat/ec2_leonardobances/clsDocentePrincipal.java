/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsDocentePrincipal extends clsDocente{
    
    private String uniOrigenDocentePri;
    private String gradoDocentePri;

    public clsDocentePrincipal(String uniOrigenDocentePri, String gradoDocentePri, String categoriaDocente, String sueldoDocente, String cursoDocente, String especialidadEmpleado, String profesionEmpleado, String tipoContratoEmpleado, String fechaIngresoEmpleado, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(categoriaDocente, sueldoDocente, cursoDocente, especialidadEmpleado, profesionEmpleado, tipoContratoEmpleado, fechaIngresoEmpleado, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.uniOrigenDocentePri = uniOrigenDocentePri;
        this.gradoDocentePri = gradoDocentePri;
    }

    public clsDocentePrincipal(String uniOrigenDocentePri, String gradoDocentePri, String especialidadEmpleado, String profesionEmpleado, String tipoContratoEmpleado, String fechaIngresoEmpleado, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(especialidadEmpleado, profesionEmpleado, tipoContratoEmpleado, fechaIngresoEmpleado, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.uniOrigenDocentePri = uniOrigenDocentePri;
        this.gradoDocentePri = gradoDocentePri;
    }

    public String getUniOrigenDocentePri() {
        return uniOrigenDocentePri;
    }

    public void setUniOrigenDocentePri(String uniOrigenDocentePri) {
        this.uniOrigenDocentePri = uniOrigenDocentePri;
    }

    public String getGradoDocentePri() {
        return gradoDocentePri;
    }

    public void setGradoDocentePri(String gradoDocentePri) {
        this.gradoDocentePri = gradoDocentePri;
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
    
    
    
    public clsDocentePrincipal(String categoriaDocente, String sueldoDocente, String cursoDocente, String especialidadEmpleado, String profesionEmpleado, String tipoContratoEmpleado, String fechaIngresoEmpleado, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(categoriaDocente, sueldoDocente, cursoDocente, especialidadEmpleado, profesionEmpleado, tipoContratoEmpleado, fechaIngresoEmpleado, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
    }
    
}
