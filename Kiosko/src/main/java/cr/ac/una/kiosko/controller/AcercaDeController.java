/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.kiosko.controller;

import com.jfoenix.controls.JFXButton;
import cr.ac.una.kiosko.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maris
 */
public class AcercaDeController extends Controller implements Initializable {

    @FXML
    private JFXButton btnAtras;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionAtras(ActionEvent event) {
        FlowController.getInstance().goViewInStage("Principal", stage);
       
    }

    @Override
    public void initialize() {
    
    }
    
}
