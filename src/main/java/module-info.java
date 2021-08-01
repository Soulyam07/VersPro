module com.example.versionning {
    requires javafx.controls;
    requires javafx.fxml;




    requires org.kordamp.bootstrapfx.core;
    requires com.jfoenix;

    //requires de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;


    opens com.example.versionning to javafx.fxml;


    exports com.example.versionning;

}