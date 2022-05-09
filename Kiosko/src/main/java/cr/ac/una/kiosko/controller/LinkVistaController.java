/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.kiosko.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author maris
 */
public class LinkVistaController implements Initializable {

    @FXML
    private JFXTextField txtLinkVideo;
    @FXML
    private JFXButton btnAceptar;
    @FXML
    private JFXButton btnCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionAceptar(ActionEvent event) {
    }

    @FXML
    private void OnActionCancelar(ActionEvent event) {
    }
    
}
