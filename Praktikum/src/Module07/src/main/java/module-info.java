module com.example.module07 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.module07 to javafx.fxml;
    opens com.example.module07.controller to javafx.fxml;
    opens com.example.module07.model to javafx.base;

    exports com.example.module07;
}