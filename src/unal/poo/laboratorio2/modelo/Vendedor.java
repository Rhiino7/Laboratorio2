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
public class Vendedor extends Persona{
    private int totalVentas;

    public Vendedor(int totalVentas, String nombre) {
        super.nombre = nombre;
        this.totalVentas = totalVentas;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
