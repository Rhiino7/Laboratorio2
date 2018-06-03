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
public class PoS {
    private double totalDinero, dineroCliente;
    private int numCaja, totalVendido;
    private Caja caja;
    private Vendedor empleado;
    private ArrayList<Vendedor> empleados = new ArrayList<Vendedor>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public PoS(double totalDinero, int numCaja, 
            int totalVendido, Caja caja, Vendedor empleado) {
        this.totalDinero = totalDinero;
        this.numCaja = numCaja;
        this.totalVendido = totalVendido;
        this.caja = caja;
        this.empleado = empleado;
    }

    public void listarCajaYDinero(){
        
    }
    
    public void impFactura(){
        
    }
    
    public void regProd(){
        
    }
    
    public void regEnt(){
        
    }
    
    public double vueltas(){
        double vuelta = 0.0;
        
        return vuelta;
    }
    
    public double getTotalDinero() {
        return totalDinero;
    }

    public void setTotalDinero(double totalDinero) {
        this.totalDinero = totalDinero;
    }

    public double getDineroCliente() {
        return dineroCliente;
    }

    public void setDineroCliente(double dineroCliente) {
        this.dineroCliente = dineroCliente;
    }

    public int getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(int numCaja) {
        this.numCaja = numCaja;
    }

    public int getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(int totalVendido) {
        this.totalVendido = totalVendido;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Vendedor getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Vendedor empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Vendedor> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Vendedor> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
}
