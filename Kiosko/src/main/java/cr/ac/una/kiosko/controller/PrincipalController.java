
package cr.ac.una.kiosko.controller;

import com.jfoenix.controls.JFXButton;
import cr.ac.una.kiosko.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author David
 */
public class PrincipalController extends Controller implements Initializable {

    @FXML
    private JFXButton BtnPlay;
    @FXML
    private JFXButton BtnAcercaDe;
    @FXML
    private JFXButton BtnSalir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionBtnPlay(ActionEvent event) {
        FlowController.getInstance().goViewInStage("EditarKiosko", stage);
    }

    @Override
    public void initialize() {
        
    }

    @FXML
    private void OnActionBtnAcercade(ActionEvent event) {
         FlowController.getInstance().goViewInStage("AcercaDe", stage);
    }

    @FXML
    private void OnActionBtnSalir(ActionEvent event) {
         ((Stage)BtnSalir.getScene().getWindow()).close();
    }
    
}
