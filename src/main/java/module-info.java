module com.example.seminarskanaloga {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.seminarskanaloga to javafx.fxml;
    exports com.example.seminarskanaloga;
}