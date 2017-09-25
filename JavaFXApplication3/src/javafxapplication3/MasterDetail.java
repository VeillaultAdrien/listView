/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;


/**
 *
 * @author adveillaul
 */
public class MasterDetail {
        public Promotion promotion;
        
        @FXML                
        private ListView liste;
        
        @FXML
        private Label affichage_texte;

    public MasterDetail(Promotion promotion) {
        this.promotion = promotion;
    }
        
        
        
        ObservableList<String> contenu = FXCollections.observableArrayList(
          "Julia", "Ian", "Sue", "Matthew", "Hannah", "Stephan", "Denise");
        // liste.setItems(contenu);
        
        
   public void initialize(){
        //affichage_texte.textProperty().bind(liste.itemsProperty());
         
    }

}
