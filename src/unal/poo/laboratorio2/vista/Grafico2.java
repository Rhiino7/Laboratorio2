/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.vista;

import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import unal.poo.laboratorio2.modelo.Vendedor;

/**
 *
 * @author rhino
 */
public class Grafico2 {
    private Scene scene;
    private BorderPane main;
    private ArrayList<Vendedor> empleados;
    private BarChart<String, Number> barras;
    
    private MenuBar barraMenu;
    private Menu inicio, reportes;
    private MenuItem volver, ventasxProd, ventasxVend, evolucionVentas;

    public Grafico2(ArrayList<Vendedor> empleados) {
        this.empleados = empleados;
        main = new BorderPane();
        VBox titulos = new VBox();
        titulos.setAlignment(Pos.CENTER);
        main.setTop(getMenus());
        main.setCenter(panelGrafico());
        
        
        scene = new Scene(main,800,600);
    }
    
    public void show(Stage stage){
        stage.setTitle("Grafico 2");
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
    
    public BarChart panelGrafico(){
        
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        barras = new BarChart<String, Number>(xAxis,yAxis);
        barras.setTitle("Porcentaje de Ventas por Producto");
        
        xAxis.setLabel("Empleado");
        yAxis.setLabel("porcentaje");
        
        XYChart.Series series1 = new XYChart.Series<>();
        for (Vendedor vend : empleados) {
            series1.getData().add(new XYChart.Data<>(vend.getNombre(), vend.getTotalVentas()));
        }
        barras.getData().add(series1);
        return barras;
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
