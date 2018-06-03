/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.vista;

import javafx.beans.property.SimpleStringProperty;
import unal.poo.laboratorio2.modelo.Producto;

/**
 *
 * @author rhino
 */
public class ProductoMostrar {
    Producto producto;
    
    private SimpleStringProperty id, nombre, precio;


    public ProductoMostrar(String id, String nombre, String precio) {
        this.id = new SimpleStringProperty(id);
        this.nombre = new SimpleStringProperty(nombre);
        this.precio = new SimpleStringProperty(precio);
    }

    public SimpleStringProperty getId() {
        return id;
    }

    public SimpleStringProperty getNombre() {
        return nombre;
    }

    public SimpleStringProperty getPrecio() {
        return precio;
    }

    
    
    
    
}
