
package cr.ac.una.kiosko.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author David
 */
public class EditarKioskoController extends Controller implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private AnchorPane acpEditPantalla;
    @FXML
    private ImageView imgImagenes;
    @FXML
    private ImageView Imgvideos;
    @FXML
    private ImageView imgTexto;
    @FXML
    private JFXButton btnGestorImg;
    @FXML
    private JFXButton btnGestorVideos;
    @FXML
    private JFXButton btnGestorTxt;
    @FXML
    private JFXButton btnGuardar;
    @FXML
    private JFXButton btnNuevo;
    @FXML
    private JFXButton btnCancelar;
    @FXML
    private JFXButton btnPlay;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void initialize() {
        
    }

    @FXML
    private void OnDragOverEditPantalla(DragEvent event) {
    }

    @FXML
    private void OnDragDroppedEditPantalla(DragEvent event) {
    }

    @FXML
    private void OnDragMoveImgImagenes(MouseEvent event) {
    }

    @FXML
    private void OnDragMoveImgVideos(MouseEvent event) {
    }

    @FXML
    private void OnDragMoveImgtexto(MouseEvent event) {
    }

    @FXML
    private void OnActionBtnGestorImg(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnGestorVideos(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnGestorTxt(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnGuardar(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnNuevo(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnCancelar(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnPlay(ActionEvent event) {
    }
    
}
