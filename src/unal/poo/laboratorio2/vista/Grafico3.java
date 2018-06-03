/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import unal.poo.laboratorio2.modelo.Inventario;
import unal.poo.laboratorio2.modelo.Producto;

/**
 *
 * @author rhino
 */
public class Grafico3 {
    private Scene scene;
    private BorderPane main;
    private Inventario inventario;
    private LineChart<Number, Number> linea;
    
    private MenuBar barraMenu;
    private Menu inicio, reportes;
    private MenuItem volver, ventasxProd, ventasxVend, evolucionVentas;

    public Grafico3(Inventario inventario) {
        this.inventario = inventario;
        main = new BorderPane();
        VBox titulos = new VBox();
        titulos.setAlignment(Pos.CENTER);
        main.setTop(getMenus());
        main.setCenter(panelGrafico());
        
        
        scene = new Scene(main,800,600);
    }
    
    public void show(Stage stage){
        stage.setTitle("Grafico 3");
        stage.setScene(scene);
        stage.show();
    }
    
    public MenuBar getMenus(){        
        barraMenu = new MenuBar();
        inicio = new Menu("Inicio");
        volver = new MenuItem("Volver al inicio");
        reportes = new Menu("Reportes");
        ventasxProd = new MenuItem("Ventas por producto");
        ventasxVend = new MenuItem("Ventas por vendedor por periodo");
        evolucionVentas = new MenuItem("Evolucion de ventas por mes");
        reportes.getItems().add(ventasxProd);
        reportes.getItems().add(ventasxVend);
        reportes.getItems().add(evolucionVentas);
        
        inicio.getItems().add(volver);
        barraMenu.getMenus().add(inicio);
        barraMenu.getMenus().add(reportes);
        
        return barraMenu;
    }
    
    public LineChart panelGrafico(){
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Mes");
        yAxis.setLabel("Total");
        
        linea = new LineChart<Number, Number>(xAxis, yAxis);
        linea.setTitle("Evolucion");
        
        XYChart.Series series = new XYChart.Series<>();
        int i = 1;
        double total = 0;
        for (Producto prod : inventario.getProductos()) {
            total += prod.getPrecio();
            series.getData().add(new XYChart.Data(i, total));
            i++;
        }
        
        
        return linea;
    }

    public MenuItem getInicio() {
        return inicio;
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
    
    
}
