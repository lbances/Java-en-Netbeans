/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import BD.clsConectarBD;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author lbanc
 */
public class clsCliente {
    private Integer codigoCliente;
    private String dpiCliente;
    private String nombresCliente;
    private String apellidosCliente;
    private String direccionCliente;
    private String emailCliente;
    private String telefonoCliente;
    private String nitCliente;
    
    clsConectarBD miConexion = new clsConectarBD();
    PreparedStatement cadC = null;
    Connection con = null;
    String cadSQL = "";

    public clsCliente() {
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDpiCliente() {
        return dpiCliente;
    }

    public void setDpiCliente(String dpiCliente) {
        this.dpiCliente = dpiCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public clsConectarBD getMiConexion() {
        return miConexion;
    }

    public void setMiConexion(clsConectarBD miConexion) {
        this.miConexion = miConexion;
    }

    public PreparedStatement getCadC() {
        return cadC;
    }

    public void setCadC(PreparedStatement cadC) {
        this.cadC = cadC;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getCadSQL() {
        return cadSQL;
    }

    public void setCadSQL(String cadSQL) {
        this.cadSQL = cadSQL;
    }

    

    public void Insertar() {
        try {
            if (miConexion.getConexion() != null) {
                con = miConexion.getConexion();
                cadSQL = "INSERT INTO TCLIENTE(DPI,Nombres,Apellidos,Direccion,E-mail,Telefono,NIT) VALUES(?,?,?,?,?,?,?)";
                cadC = con.prepareStatement(cadSQL);
                cadC.setString(1, this.getDpiCliente());
                cadC.setString(2, this.getNombresCliente());
                cadC.setString(3, this.getApellidosCliente());
                cadC.setString(4, this.getDireccionCliente());
                cadC.setString(5, this.getEmailCliente());
                cadC.setString(6, this.getTelefonoCliente());
                cadC.setString(7, this.getNitCliente());
                cadC.executeUpdate();
            } else {
                System.out.println("No hay conexión con la base de datos.");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void Eliminar() {

        try {
            if (miConexion.getConexion() != null) {
                con = miConexion.getConexion();
                cadSQL = "DELETE FROM TCLIENTE WHERE Codigo=" + this.getCodigoCliente();
                cadC = con.prepareStatement(cadSQL);
                cadC.executeUpdate();
            } else {
                System.out.println("No hay conexión con la base de datos.");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void Modificar() {
        try {
            if (miConexion.getConexion() != null) {
                con = miConexion.getConexion();
                cadSQL = "UPDATE TCLIENTE SET DPI='" + this.getDpiCliente() + "', "
                                           + "Nombres='" + this.getNombresCliente() + "', "
                                           + "Apellidos='" + this.getApellidosCliente() + "', "
                                           + "Dirección='" + this.getDireccionCliente() + "', "
                                           + "E-mail='" + this.getEmailCliente() + "', "
                                           + "Teléfono='" + this.getTelefonoCliente() + "', "
                                           + "NIT='" + this.getNitCliente() + "'  WHERE Codigo=" + this.getCodigoCliente();
                cadC = con.prepareStatement(cadSQL);
                cadC.executeUpdate();
            } else {
                System.out.println("No hay conexión con la base de datos.");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
