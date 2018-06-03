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
public class Factura {
    private String infoMercado, prodAdquiridos, vendedor;
    private double subTotal, costoTotal;
    private int cantProdComprados, puntosTotales;

    public Factura(String infoMercado, String prodAdquiridos, String vendedor, double subTotal, double costoTotal, int cantProdComprados, int puntosTotales) {
        this.infoMercado = infoMercado;
        this.prodAdquiridos = prodAdquiridos;
        this.vendedor = vendedor;
        this.subTotal = subTotal;
        this.costoTotal = costoTotal;
        this.cantProdComprados = cantProdComprados;
        this.puntosTotales = puntosTotales;
    }

    public String getInfoMercado() {
        return infoMercado;
    }

    public void setInfoMercado(String infoMercado) {
        this.infoMercado = infoMercado;
    }

    public String getProdAdquiridos() {
        return prodAdquiridos;
    }

    public void setProdAdquiridos(String prodAdquiridos) {
        this.prodAdquiridos = prodAdquiridos;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getCantProdComprados() {
        return cantProdComprados;
    }

    public void setCantProdComprados(int cantProdComprados) {
        this.cantProdComprados = cantProdComprados;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }
    
    
}
