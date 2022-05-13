module cr.ac.una.kiosko {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.base;
    requires com.jfoenix;

    
    opens cr.ac.una.kiosko to javafx.fxml;
    opens cr.ac.una.kiosko.controller to javafx.fxml;
    exports cr.ac.una.kiosko.controller;
    exports cr.ac.una.kiosko.util;
    exports cr.ac.una.kiosko;
    
}
