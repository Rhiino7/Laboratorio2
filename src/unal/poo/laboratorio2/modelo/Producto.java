/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.modelo;

/**
 *
 * @author rhino
 */
public class Producto {
    private int cantidad, barCode, totalVendidos;
    private String nombre, identificationCode;
    private double precio;

    public Producto(String identificationCode, int cantidad, int barCode, String nombre, double precio, int totalVendidos) {
        this.identificationCode = identificationCode;
        this.cantidad = cantidad;
        this.barCode = barCode;
        this.nombre = nombre;
        this.precio = precio;
        this.totalVendidos = totalVendidos;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public int getTotalVendidos() {
        return totalVendidos;
    }

    public void setTotalVendidos(int totalVendidos) {
        this.totalVendidos = totalVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
