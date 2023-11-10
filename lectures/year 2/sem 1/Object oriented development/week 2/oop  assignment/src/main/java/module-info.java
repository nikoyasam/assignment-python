module com.example.oopassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopassignment to javafx.fxml;
    exports com.example.oopassignment;
}