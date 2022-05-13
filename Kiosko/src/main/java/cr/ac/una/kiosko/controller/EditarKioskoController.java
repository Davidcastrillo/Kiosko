
package cr.ac.una.kiosko.controller;

import com.jfoenix.controls.JFXButton;
import cr.ac.una.kiosko.model.Ventanas;
import cr.ac.una.kiosko.util.FlowController;
import cr.ac.una.unaplanilla2.util.Mensaje;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
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
    int limit = 1;
    int contador = 1;
    

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
          if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        } 
    }

    @FXML
    private void OnDragDroppedEditPantalla(DragEvent event) {
        String con2 = (String.valueOf(contador));
        String id = event.getDragboard().getString();
        
        if (id == null ? con2 == null : id.equals(con2))  {
          Ventanas vent = new Ventanas();
          EventHandler<MouseEvent> handler = (MouseEvent t) -> {
             vent.setX(t.getX());
             vent.setY(t.getY());
             
        };
        vent.setImages(event.getDragboard().getImage());
        vent.setIdimg(event.getDragboard().getString());
        vent.setImage(vent.crearventana());
        acpEditPantalla.getChildren().add(vent);
        vent.addEventHandler(MouseEvent.MOUSE_DRAGGED, handler);
        vent.setFitHeight(100);
        vent.setFitWidth(100); 
        contador++;
        }

        else if (id!=con2) {
           new Mensaje().showConfirmation("Cuidado", stage, "No Se pueden agregar 2 ventanas del mismo tipo, por favor seleccione Otro tipo de ventana");   
        } else {
         new  Mensaje().showConfirmation("Cuidado", stage, "Se ha superado la cantidad de ventanas");   
        }


          ;
        
    }

    @FXML
    private void OnDragMoveImgImagenes(MouseEvent event) {
        String n = "1";
        Dragboard db = imgImagenes.startDragAndDrop(TransferMode.MOVE);
        ClipboardContent cb = new ClipboardContent();
        cb.putString(n);
        cb.putImage(imgImagenes.getImage());
        db.setContent(cb);
    }

    @FXML
    private void OnDragMoveImgVideos(MouseEvent event) {
        String n = "2";
        Dragboard db = Imgvideos.startDragAndDrop(TransferMode.MOVE);
        ClipboardContent cb = new ClipboardContent();
        cb.putString(n);
        cb.putImage(Imgvideos.getImage());
        db.setContent(cb);
       
        
    }

    @FXML
    private void OnDragMoveImgtexto(MouseEvent event) {
        String n = "3";
        Dragboard db = imgTexto.startDragAndDrop(TransferMode.MOVE);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(imgTexto.getImage());
        cb.putString(n);
        db.setContent(cb);
    }

    @FXML
    private void OnActionBtnGestorImg(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnGestorVideos(ActionEvent event) {
        FlowController.getInstance().goViewInWindow("LinkVista");
    }

    @FXML
    private void OnActionBtnGestorTxt(ActionEvent event) {
        FlowController.getInstance().goViewInWindow("TextoVista");
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
