/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author adveillaul
 */
public class JavaFXApplication3 extends Application {
    public FXMLLoader fxmlLoader ;
    public MasterDetail masterDetail;

    @Override
    public void start(Stage primaryStage) {     
        fxmlLoader = new FXMLLoader();
        masterDetail = new MasterDetail();
        fxmlLoader.setController(fxmlLoader);
       /* try {
                //SplitPane root = (SplitPane) FXMLLoader.load(getClass().getResource("/Ressources/fxml/MasterDetail.fxml"));
               
                Scene scene = new Scene(root, 400, 400);
                primaryStage.setScene(scene);
                primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXApplication3.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
