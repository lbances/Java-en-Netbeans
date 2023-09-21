/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsAsalariado extends clsPersona{
    private String condicionAsalariado;
    private String funcionLaboralAsalariado;
    private String categoriaAsalariado;
    private String cantidadHijosAsalariado;

    public clsAsalariado(String condicionAsalariado, String funcionLaboralAsalariado, String categoriaAsalariado, String cantidadHijosAsalariado, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.condicionAsalariado = condicionAsalariado;
        this.funcionLaboralAsalariado = funcionLaboralAsalariado;
        this.categoriaAsalariado = categoriaAsalariado;
        this.cantidadHijosAsalariado = cantidadHijosAsalariado;
    }

    public String getCondicionAsalariado() {
        return condicionAsalariado;
    }

    public void setCondicionAsalariado(String condicionAsalariado) {
        this.condicionAsalariado = condicionAsalariado;
    }

    public String getFuncionLaboralAsalariado() {
        return funcionLaboralAsalariado;
    }

    public void setFuncionLaboralAsalariado(String funcionLaboralAsalariado) {
        this.funcionLaboralAsalariado = funcionLaboralAsalariado;
    }

    public String getCategoriaAsalariado() {
        return categoriaAsalariado;
    }

    public void setCategoriaAsalariado(String categoriaAsalariado) {
        this.categoriaAsalariado = categoriaAsalariado;
    }

    public String getCantidadHijosAsalariado() {
        return cantidadHijosAsalariado;
    }

    public void setCantidadHijosAsalariado(String cantidadHijosAsalariado) {
        this.cantidadHijosAsalariado = cantidadHijosAsalariado;
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
