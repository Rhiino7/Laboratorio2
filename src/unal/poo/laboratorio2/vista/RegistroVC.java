/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.vista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import unal.poo.laboratorio2.modelo.Producto;

/**
 *
 * @author rhino
 */
public class RegistroVC {
    
    private DataBean dataBean;
    
    private RegistroVista view;
    
    private String idProd, nombreProd, precioProd;
    
    private ObservableList<ProductoMostrar> data = FXCollections.observableArrayList(new ProductoMostrar(idProd, nombreProd, precioProd));
    
    private FileWriter fichero = null;
    private PrintWriter pw = null;

    public RegistroVC(DataBean dataBean) {
        this.dataBean = dataBean;
        this.view = new RegistroVista();
        
        
        //Eventos
        view.getAddProd().setOnAction(new addProdBtnEventHandler());
        view.getCancelCompra().setOnAction(new cancelCompraBtnEventHandler());
        view.getFactura().setOnAction(new impriBtnEventHandler());
        view.getSalir().setOnAction(new salirBtnEventHandler());
        view.getInicio().setOnAction(new iniBtnEventHandler());
        view.getVentasxProd().setOnAction(new ventasxProdBtnEventHandler());
        view.getVentasxVend().setOnAction(new ventasxVendBtnEventHandler());
        view.getEvolucionVentas().setOnAction(new evolVentBtnEventHandler());
        
    }
    
    public void show(){
        view.show(dataBean.getPrimaryStage());
    }
    
    class addProdBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
            idProd = view.getiDproducto().getText();
            nombreProd = null;
            precioProd = null;
            
            for (Producto prod : dataBean.getInventario1().getProductos()) {
                if(prod.getIdentificationCode().equals(idProd)){
                    nombreProd = prod.getNombre();
                    precioProd = String.valueOf(prod.getPrecio());
                    double preciosumado = prod.getPrecio();
                    ProductoMostrar pm = new ProductoMostrar(prod.getIdentificationCode(), nombreProd, precioProd);
                    
                    view.setPrecioSumado(view.getPrecioSumado()+preciosumado);
                    prod.setCantidad(prod.getCantidad()-1);
                    data.add(new ProductoMostrar(prod.getIdentificationCode(), nombreProd, precioProd));
                    view.getProductos().setItems(data);
                }
            }
            
            String erg = null;
            erg = dataBean.getProdPwMap().put(nombreProd, precioProd);
        }
    }
    
    class cancelCompraBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
        }
    }
    
    class impriBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            try{
                fichero = new FileWriter("src\\facturas\\factura.txt");
                pw = new PrintWriter(fichero);
                
                pw.println("Empresa S.A.");
                pw.println("UNAL");
                for (ProductoMostrar productoMostrar : data) {
                    pw.println(productoMostrar.getNombre()+ "        " + productoMostrar.getPrecio());
                }
                pw.println("Total     "+ sumarPrecios(data));
                
            }catch(Exception e){
                e.printStackTrace();
            } finally{
                if(null != fichero){
                    try {
                        fichero.close();
                    } catch (IOException ex) {
                        Logger.getLogger(RegistroVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    
    public double sumarPrecios(ObservableList<ProductoMostrar> data){
        double total = 0;
        for (ProductoMostrar productoMostrar : data) {
            String precio = productoMostrar.getPrecio().get();
            total += Double.parseDouble(precio);
        }
        
        return total;
    }
    
    class salirBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            EntradaVC entrada = new EntradaVC(dataBean);
            entrada.show();
        }
    }
    
    class iniBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
//            EntradaVC entrada = new EntradaVC(dataBean);
//            entrada.show();
        }
    }
    
    class ventasxProdBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Grafico1VC g1vc = new Grafico1VC(dataBean);
            g1vc.show();
        }
    }
    
    class ventasxVendBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Grafico2VC g2vc = new Grafico2VC(dataBean);
            g2vc.show();
        }
    }
    
    class evolVentBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Grafico3VC g3vc = new Grafico3VC(dataBean);
            g3vc.show();
        }
    }
}
