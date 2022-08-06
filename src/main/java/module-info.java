module com.example.ejemplo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplo1 to javafx.fxml;
    exports com.example.ejemplo1;
}