/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istidat.ec2_leonardobances;

/**
 *
 * @author lbanc
 */
public class clsAdministrativo extends clsEmpleado{
    
    private String areaLaboresAdmin;
    private String categoriaAdmin;
    private String funcionesAdmin;

    public clsAdministrativo(String areaLaboresAdmin, String categoriaAdmin, String funcionesAdmin, String especialidadEmpleado, String profesionEmpleado, String tipoContratoEmpleado, String fechaIngresoEmpleado, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(especialidadEmpleado, profesionEmpleado, tipoContratoEmpleado, fechaIngresoEmpleado, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
        this.areaLaboresAdmin = areaLaboresAdmin;
        this.categoriaAdmin = categoriaAdmin;
        this.funcionesAdmin = funcionesAdmin;
    }

    public String getAreaLaboresAdmin() {
        return areaLaboresAdmin;
    }

    public void setAreaLaboresAdmin(String areaLaboresAdmin) {
        this.areaLaboresAdmin = areaLaboresAdmin;
    }

    public String getCategoriaAdmin() {
        return categoriaAdmin;
    }

    public void setCategoriaAdmin(String categoriaAdmin) {
        this.categoriaAdmin = categoriaAdmin;
    }

    public String getFuncionesAdmin() {
        return funcionesAdmin;
    }

    public void setFuncionesAdmin(String funcionesAdmin) {
        this.funcionesAdmin = funcionesAdmin;
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
    
    
    
    public clsAdministrativo(String especialidadEmpleado, String profesionEmpleado, String tipoContratoEmpleado, String fechaIngresoEmpleado, String codigoPersona, String apellidoPersona, String nombresPersona, String direccionPersona, String telefonoPersona) {
        super(especialidadEmpleado, profesionEmpleado, tipoContratoEmpleado, fechaIngresoEmpleado, codigoPersona, apellidoPersona, nombresPersona, direccionPersona, telefonoPersona);
    }
    
}
