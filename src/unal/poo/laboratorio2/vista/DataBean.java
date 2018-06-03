/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.vista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import unal.poo.laboratorio2.modelo.Inventario;
import unal.poo.laboratorio2.modelo.Producto;
import unal.poo.laboratorio2.modelo.Vendedor;

/**
 *
 * @author rhino
 */
class DataBean {
   private Stage primaryStage = null;   //Podria estar en un singleton
   private Map<String , String> prodPwMap = null;
   private ObservableList<Producto> productos;
   private Inventario inventario1;
   private ArrayList<Vendedor> empleados;
    
   public DataBean(Stage primaryStage, Inventario inventario, ArrayList<Vendedor> empleados) {
      this.primaryStage = primaryStage;
      this.prodPwMap = new HashMap<>();
      this.inventario1 = inventario;
      this.empleados = empleados;
   }
 
   public Map<String, String> getProdPwMap() {
      return prodPwMap;
   }
 
   public Stage getPrimaryStage() {
      return primaryStage;
   }

    public Inventario getInventario1() {
        return inventario1;
    }

    public ObservableList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ObservableList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Vendedor> getEmpleados() {
        return empleados;
    }
   
    
   
   
   
}
