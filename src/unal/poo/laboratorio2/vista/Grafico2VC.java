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
public class Grafico2VC {
    private DataBean dataBean;
    
    private Grafico2 view;

    public Grafico2VC(DataBean dataBean) {
        this.dataBean = dataBean;
        this.view = new Grafico2(dataBean.getEmpleados());
        
        //Eventos
        view.getInicio().setOnAction(new volverBtnEventHandler());
        view.getVentasxProd().setOnAction(new ventasxProdBtnEventHandler());
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
    
    class ventasxProdBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Grafico1VC g1vc = new Grafico1VC(dataBean);
            g1vc.show();
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
