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
public class Grafico1VC {
    private DataBean dataBean;
    
    private Grafico1 view;

    public Grafico1VC(DataBean dataBean) {
        this.dataBean = dataBean;
        this.view = new Grafico1(dataBean.getInventario1());
        
        //Eventos
        view.getInicio().setOnAction(new volverBtnEventHandler());
        view.getVentasxVend().setOnAction(new ventasxVendBtnEventHandler());
        view.getEvolucionVentas().setOnAction(new evolVentBtnEventHandler());
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
