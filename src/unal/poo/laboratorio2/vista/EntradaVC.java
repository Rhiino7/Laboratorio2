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
class EntradaVC {
    // Model
   private DataBean dataBean;
    
   // View
   private EntradaVista view;
    
    
   public EntradaVC(DataBean dataBean) {
      this.dataBean = dataBean;
      this.view = new EntradaVista();
       
      
      //Eventos
      view.getQuitBtn().setOnAction(new quitBtnEventHandler());
      view.getStartBtn().setOnAction(new startBtnEventHandler());
      view.getVentasxProd().setOnAction(new ventasxProdBtnEventHandler());
      view.getVentasxVend().setOnAction(new ventasxVendBtnEventHandler());
      view.getEvolucionVentas().setOnAction(new evolVentBtnEventHandler());
   }
    
   public void show(){
      view.show(dataBean.getPrimaryStage());
   }
   
   
   class quitBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            dataBean.getPrimaryStage().close();
        }
       
   }
   
   class startBtnEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            RegistroVC registro = new RegistroVC(dataBean);
            registro.show();
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
   
//   class newBtnEventHandler implements EventHandler<ActionEvent>{
//
//        @Override
//        public void handle(ActionEvent t) {
//           ControladorMyScene myScene = new ControladorMyScene(dataBean);
//           myScene.show();
//        }
//        
//        
//    }  
//   
//   class OkBtnEventHandler implements EventHandler<ActionEvent>{
// 
//      @Override
//      public void handle(ActionEvent e) {   
//      // zur naechsten Seiten springen! 
//          SalidaVC ausgabeVC = new SalidaVC(dataBean);
//          ausgabeVC.show();   
//      }
//       
//   }
//    
//   class addBtnEventHandler implements EventHandler<ActionEvent>{
// 
//      @Override
//      public void handle(ActionEvent e) {   
//         // Meldung reseten
//         view.getMessageT().setText("");
//          
//         // Daten aus den Textfeldern holen
//         String vname = view.getNameTF().getText();
//          String nname = view.getNachnameTF().getText();
//           
//         //Textfelder zuruecksetzen
//         view.getNachnameTF().setText("");
//         view.getNameTF().setText("");
//          
//         // Daten testen
//         if(vname.isEmpty()){
//            view.getMessageT().setText("Ingrese el nombre!");
//            return;
//         }
//         if(nname.isEmpty()){
//            view.getMessageT().setText("Ingrese el apellido!");
//            return;
//         }
//          
//         // Daten hinzufuegen 
//         String erg = null;
//         erg = dataBean.getNamePwMap().put(nname, vname);
//          
//         // Meldung ausgeben
//         if(erg == null){
//            view.getMessageT().setText("Se agrego correctamente");
//         }else{
//            view.getMessageT().setText("Ya existe");
//         }
//      }   
//   }
}
