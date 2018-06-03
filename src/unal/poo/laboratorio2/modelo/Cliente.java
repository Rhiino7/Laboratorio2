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
public class Cliente extends Persona{
    private String tarjetaFid;
    private double dineroEfectivo;

    public Cliente(String tarjetaFid, String nombre, String direccion, double dineroEfectivo) {
        super.nombre = nombre;
        super.direccion = direccion;
        this.tarjetaFid = tarjetaFid;
        this.dineroEfectivo = dineroEfectivo;
    }

    public String getTarjetaFid() {
        return tarjetaFid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getDineroEfectivo() {
        return dineroEfectivo;
    }
       
    
}
