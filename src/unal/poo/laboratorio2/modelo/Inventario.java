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
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<Producto>();
    }
    
    public void listarProdYCant(){
        
    }
    
    public void addProducto(Producto prod){
        productos.add(prod);
    }
    
    public void delProducto(Producto prod){
        for (Producto producto : productos) {
            if(prod.getIdentificationCode() == producto.getIdentificationCode())
                productos.remove(producto);
        }
    }
    
    public void editProducto(Producto prod){
        
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    
}
