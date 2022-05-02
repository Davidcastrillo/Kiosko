
package cr.ac.una.kiosko.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DataFormat;
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
     ImageView imagep = new ImageView();

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
         EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
             @Override
             public void handle(MouseEvent t) {
                imagep.setX(t.getX());
                imagep.setY(t.getY());
                 System.out.println("me llevan los aliens"); 
                 
             }
         };
         EventHandler<MouseEvent> drophand = new EventHandler<MouseEvent>() {
             @Override
             public void handle(MouseEvent t) {
                 
             }
         };
         imagep.setImage(event.getDragboard().getImage());
         imagep.setFitHeight(100);
         imagep.setFitWidth(100);
          acpEditPantalla.getChildren().add(imagep);
        imagep.addEventHandler(MouseEvent.MOUSE_DRAGGED, handler);
       
       
          
        System.out.println("Buenas equisde aqui se dropeo algo");
    }

    @FXML
    private void OnDragMoveImgImagenes(MouseEvent event) {
        Dragboard db = imgImagenes.startDragAndDrop(TransferMode.MOVE);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(imgImagenes.getImage());
        db.setContent(cb);
    }

    @FXML
    private void OnDragMoveImgVideos(MouseEvent event) {
        
        Dragboard db = Imgvideos.startDragAndDrop(TransferMode.MOVE);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(Imgvideos.getImage());
        db.setContent(cb);
       
        
    }

    @FXML
    private void OnDragMoveImgtexto(MouseEvent event) {
         
        Dragboard db = imgTexto.startDragAndDrop(TransferMode.MOVE);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(imgTexto.getImage());
        db.setContent(cb);
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
