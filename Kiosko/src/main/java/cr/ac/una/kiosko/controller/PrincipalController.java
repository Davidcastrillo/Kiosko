
package cr.ac.una.kiosko.controller;

import com.jfoenix.controls.JFXButton;
import cr.ac.una.kiosko.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author David
 */
public class PrincipalController extends Controller implements Initializable {

    @FXML
    private JFXButton BtnPlay;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionBtnPlay(ActionEvent event) {
        //holi, ya la borre
        FlowController.getInstance().goViewInStage("EditarKiosko", stage);
    }

    @Override
    public void initialize() {
        
    }
    
}
