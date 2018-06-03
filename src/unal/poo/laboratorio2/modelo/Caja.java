/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.modelo;

import java.util.ArrayList;

/**
 *
 * @author rhino
 */
public class Caja {
    private Inventario inventario;
    private ArrayList<Factura> facturas = new ArrayList<Factura>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private Vendedor empleado;
    private PoS pos;
    
    
    public Caja(Inventario inventario) {
        this.inventario = inventario;
        this.pos = new PoS(500000, 1, 0, this, empleado);
    }
    
    

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public PoS getPos() {
        return pos;
    }

    public void setPos(PoS pos) {
        this.pos = pos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Vendedor getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Vendedor empleado) {
        this.empleado = empleado;
    }
    
    
    
    
}
