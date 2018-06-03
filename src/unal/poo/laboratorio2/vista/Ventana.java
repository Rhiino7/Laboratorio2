/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.vista;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import unal.poo.laboratorio2.modelo.Caja;
import unal.poo.laboratorio2.modelo.Cliente;
import unal.poo.laboratorio2.modelo.Inventario;
import unal.poo.laboratorio2.modelo.Producto;
import unal.poo.laboratorio2.modelo.Vendedor;

/**
 *
 * @author rhino
 */
public class Ventana extends Application {
        
    @Override
    public void start(Stage primaryStage) {
        DataBean dataBean = new DataBean(primaryStage, inventario1, cajas.get(0).getPos().getEmpleados());
        
 
       // LLamar el primer controlador
       EntradaVC entradaVC = new EntradaVC(dataBean);
       entradaVC.show();
    }
    
    static ArrayList<Caja> cajas = new ArrayList<Caja>();
    static Inventario inventario1 = new Inventario();
    
    public static Inventario crearProd(Inventario inv){
        inv.addProducto(new Producto("A-001", 500, 100001, "Cafe", 5000, 100));
        inv.addProducto(new Producto("A-002", 500, 100002, "Azucar", 3000, 200));
        inv.addProducto(new Producto("A-003", 500, 100003, "Leche", 5500, 300));
        inv.addProducto(new Producto("A-004", 500, 100004, "Pan", 2000,50));
        inv.addProducto(new Producto("A-005", 500, 100005, "Harina", 3500,80));
        inv.addProducto(new Producto("A-006", 500, 100006, "Manzanas", 1500,160));
        inv.addProducto(new Producto("A-007", 500, 100007, "Platano", 1550,97));
        inv.addProducto(new Producto("A-008", 500, 100008, "Cereal", 8000,35));
        inv.addProducto(new Producto("A-009", 500, 100009, "Chocolate", 10000,78));
        inv.addProducto(new Producto("A-010", 500, 100010, "Yogurt", 9000,170));
        
        return inv;
    }
    
    public static ArrayList<Vendedor> crearEmpleados(){
        cajas.get(0).getPos().getEmpleados().add(new Vendedor(217, "Carlos"));
        cajas.get(0).getPos().getEmpleados().add(new Vendedor(15, "Camila"));
        cajas.get(0).getPos().getEmpleados().add(new Vendedor(89, "Tomas"));
        cajas.get(0).getPos().getEmpleados().add(new Vendedor(35, "Fernando"));
        cajas.get(0).getPos().getEmpleados().add(new Vendedor(42, "Dairon"));
        cajas.get(0).getPos().getEmpleados().add(new Vendedor(28, "Luis"));
        
        return cajas.get(0).getPos().getEmpleados();
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        inventario1 = crearProd(inventario1);
        cajas.add(new Caja(inventario1));
        
        Vendedor vendedor1 = new Vendedor(50, "Andres");
        cajas.get(0).setEmpleado(vendedor1);
        cajas.get(0).getPos().setEmpleados(crearEmpleados());
        Cliente cliente1 = new Cliente("F-100001", "Cesar", "Cra 29 #14-47 sur", 100000);
        cajas.get(0).getClientes().add(cliente1);
        
        launch(args);
    }
        
}
