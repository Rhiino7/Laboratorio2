/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.laboratorio2.vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author rhino
 */
public class Grafico3VC {
    private DataBean dataBean;
    
    private Grafico3 view;

    public Grafico3VC(DataBean dataBean) {
        this.dataBean = dataBean;
        this.view = new Grafico3(dataBean.getInventario1());
        
        //Eventos
        view.getInicio().setOnAction(new volverBtnEventHandler());
        view.getVentasxProd().setOnAction(new ventasxProdBtnEventHandler());
        view.getVentasxVend().setOnAction(new ventasxVendBtnEventHandler());
    }
    
    public void show(){
        view.show(dataBean.getPrimaryStage());
    }
    
    class volverBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            EntradaVC entrada = new EntradaVC(dataBean);
            entrada.show();
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
}
