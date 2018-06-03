/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author rhino
 */
public class EntradaVista {
    Scene scene;
    BorderPane main;
    GridPane comienzo;
    
    MenuBar barraMenu;
    Menu inicio, reportes;
    MenuItem ventasxProd, ventasxVend, evolucionVentas;
    
    Button startBtn, quitBtn;

    public EntradaVista() {
        main = new BorderPane();
        main.setTop(getMenus());
        main.setCenter(comienzo());
        scene = new Scene(main, 800, 600);
    }
    
    public void show(Stage stage) {
      stage.setTitle("Inicio");
      stage.setScene(scene);
      stage.show();
   }
    
    public MenuBar getMenus(){        
        barraMenu = new MenuBar();
        inicio = new Menu("Inicio");
        reportes = new Menu("Reportes");
        ventasxProd = new MenuItem("Ventas por producto");
        ventasxVend = new MenuItem("Ventas por vendedor por periodo");
        evolucionVentas = new MenuItem("Evolucion de ventas por mes");
        reportes.getItems().add(ventasxProd);
        reportes.getItems().add(ventasxVend);
        reportes.getItems().add(evolucionVentas);
        
        barraMenu.getMenus().add(inicio);
        barraMenu.getMenus().add(reportes);
        
        return barraMenu;
    }
    
    public Pane comienzo(){
        comienzo = new GridPane();
        comienzo.setAlignment(Pos.CENTER);
        comienzo.setHgap(10);
        comienzo.setVgap(10);
        comienzo.setPadding(new Insets(25, 25, 25, 25));
        startBtn = new Button("Comenzar");
        quitBtn = new Button("Salir");
        comienzo.add(startBtn, 0, 0);
        comienzo.add(quitBtn, 0, 1);
        
        
        return comienzo;
    }

    public MenuItem getVentasxProd() {
        return ventasxProd;
    }

    public MenuItem getVentasxVend() {
        return ventasxVend;
    }

    public MenuItem getEvolucionVentas() {
        return evolucionVentas;
    }

    public Button getStartBtn() {
        return startBtn;
    }

    public Button getQuitBtn() {
        return quitBtn;
    }
    
    
    
    
}
