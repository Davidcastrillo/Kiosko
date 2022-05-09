/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.kiosko.controller;

import cr.ac.una.kiosko.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maris
 */
public class AcercaDeController implements Initializable {

    @FXML
    private ImageView btnAtras;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionAtras(MouseEvent event) {
        Stage stage = null;
        FlowController.getInstance().goViewInStage("EditarKiosko", stage);
    }
    
}
