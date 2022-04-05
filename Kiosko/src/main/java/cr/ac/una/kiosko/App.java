package cr.ac.una.kiosko;

import cr.ac.una.kiosko.util.FlowController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {



    @Override
    public void start(Stage stage) throws IOException {
        FlowController.getInstance().goViewInWindow("Principal");
    }

 
    public static void main(String[] args) {
        launch();
    }

}