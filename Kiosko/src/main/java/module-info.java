module cr.una.ac.kiosko {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens cr.una.ac.kiosko to javafx.fxml;
    exports cr.una.ac.kiosko;
    requires javafx.graphicsEmpty;
    requires java.base;
}
