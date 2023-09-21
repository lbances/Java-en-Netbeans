/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author lbanc
 */

public class clsVendedor {
    private int cod;
    private String nom;
    private Double montoVendido;
    private static Double porcentajeComision = 0.05;
    private static Double contadorVendedores;
    private static Double sueldoBruto;
    private static Double sueldoBasico;
    private static Double sueldoFijo = 550.0;

    clsVendedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Double SueldoBasico() {
        return sueldoBasico;
    }

    public Double ComisionSoles() {
        Double comisionSoles = montoVendido * porcentajeComision;
        
        return comisionSoles;
    }

    public Double SueldoBruto() {
        Double comisionSoles = montoVendido * porcentajeComision;
        Double sueldoBruto = sueldoBasico + comisionSoles;
        
        return sueldoBruto;
    }

    public Double PorcentajeComision() {
        return porcentajeComision;
    }
    
    public clsVendedor(int cod, String nom, Double montoVendido) {
        this.cod = cod;
        this.nom = nom;
        this.montoVendido = montoVendido;
        
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(Double montoVendido) {
        this.montoVendido = montoVendido;
    }

    public static Double getPorcentajeComision() {
        return porcentajeComision;
    }

    public static void setPorcentajeComision(Double porcentajeComision) {
        clsVendedor.porcentajeComision = porcentajeComision;
    }

    public static Double getContadorVendedores() {
        return contadorVendedores;
    }

    public static void setContadorVendedores(Double contadorVendedores) {
        clsVendedor.contadorVendedores = contadorVendedores;
    }

    public static Double getSueldoBruto() {
        return sueldoBruto;
    }

    public static void setSueldoBruto(Double sueldoBruto) {
        clsVendedor.sueldoBruto = sueldoBruto;
    }

}
