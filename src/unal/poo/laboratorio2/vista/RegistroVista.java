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
import javafx.scene.control.ListView;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Callback;
import unal.poo.laboratorio2.modelo.Producto;

/**
 *
 * @author rhino
 */
public class RegistroVista {
    Scene scene;
    BorderPane main;
    GridPane comienzo;
    
    MenuBar barraMenu;
    Menu inicio, reportes;
    MenuItem ventasxProd, ventasxVend, evolucionVentas;
    TextField iDproducto;
    Text titulo, tituloProd, total;
    TableView<ProductoMostrar> productos;
    TableColumn<ProductoMostrar, String> id = new TableColumn<>("ID");
    TableColumn<ProductoMostrar, String> nombre = new TableColumn<>("Nombre"); 
    TableColumn<ProductoMostrar, String> precio = new TableColumn<>("Precio");
    Label labelProd;
    Button addProd, cancelCompra, factura, salir;
    double precioSumado;

    public RegistroVista() {
        main = new BorderPane();
        VBox titulos = new VBox();
        titulos.setAlignment(Pos.CENTER);
        main.setTop(getMenus());
        main.setCenter(registrar());
        
        scene = new Scene(main,800,600);
    }
    
    public void show(Stage stage){
        stage.setTitle("Registro");
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
    
    public Pane registrar(){
        GridPane registro = new GridPane();
        VBox textCamp = new VBox();
        HBox btnBox = new HBox();
        
        btnBox.setAlignment(Pos.BOTTOM_RIGHT);
        btnBox.setSpacing(10);
        textCamp.setSpacing(30);
        textCamp.setPadding(new Insets(40, 5, 0, 5));
        
        //Titulos
        titulo = new Text("Registro de productos, Empresa S. A.");
        tituloProd = new Text("Lista de productos");
        total = new Text("Total " + precioSumado);
        
        //Escribir producto
        labelProd = new Label("Ingrese id del producto (Ej: D-208)");
        iDproducto = new TextField();
        
        //Botones
        addProd = new Button("Agregar producto");
        cancelCompra = new Button("Cancelar compra");
        factura = new Button("Imprimir factura");
        salir = new Button("Salir");
        
        btnBox.getChildren().add(addProd);
        btnBox.getChildren().add(cancelCompra);
        btnBox.getChildren().add(factura);
        
        textCamp.getChildren().add(labelProd);
        textCamp.getChildren().add(iDproducto);
        textCamp.getChildren().add(btnBox);
        textCamp.getChildren().add(salir);
        
        registro.setHgap(10);
        registro.setVgap(40);
        registro.setAlignment(Pos.CENTER);
        
        registro.add(titulo, 0, 0);
        registro.add(tituloProd, 1, 0);
        registro.add(textCamp, 0, 1);
        registro.add(listaProductos(), 1, 1, 2, 2);
        registro.add(total, 1, 3);
        
        return registro;
    }
    
    public TableView listaProductos(){
        productos = new TableView<>();
        productos.setEditable(true);
        
        id.setCellValueFactory(new PropertyValueFactory<ProductoMostrar, String>("id"));
        nombre.setCellValueFactory(new PropertyValueFactory<ProductoMostrar, String>("nombre"));
        precio.setCellValueFactory(new PropertyValueFactory<ProductoMostrar, String>("precio"));
        
        productos.getColumns().add(id);
        productos.getColumns().add(nombre);
        productos.getColumns().add(precio);
        productos.setMinSize(200, 200);
        
        return productos;
    }

    public TableView<ProductoMostrar> getProductos() {
        return productos;
    }

    public Button getAddProd() {
        return addProd;
    }

    public Button getCancelCompra() {
        return cancelCompra;
    }

    public Button getSalir() {
        return salir;
    }

    public Button getFactura() {
        return factura;
    }
    
    public TextField getiDproducto() {
        return iDproducto;
    }

    public Text getTotal() {
        return total;
    }

    public double getPrecioSumado() {
        return precioSumado;
    }

    public void setPrecioSumado(double precioSumado) {
        this.precioSumado = precioSumado;
    }

    public TableColumn<ProductoMostrar, String> getId() {
        return id;
    }

    public TableColumn<ProductoMostrar, String> getNombre() {
        return nombre;
    }

    public TableColumn<ProductoMostrar, String> getPrecio() {
        return precio;
    }

    public Menu getInicio() {
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
