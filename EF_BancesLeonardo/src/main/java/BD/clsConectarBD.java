/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lbanc
 */
public class clsConectarBD {
    private String CadConexion = "jdbc:mysql://localhost:3308/bdFarmacia";
    private String Usuario = "root";
    private String Password = "";

    public clsConectarBD() {
    }

    public String getCadConexion() {
        return CadConexion;
    }

    public void setCadConexion(String CadConexion) {
        this.CadConexion = CadConexion;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Connection getConexion() {
        Connection conex = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = (Connection) DriverManager.getConnection(this.getCadConexion(), this.getUsuario(), this.getPassword());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return conex;
    }
}
