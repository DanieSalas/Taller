module com.example.tallerlogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tallerlogin to javafx.fxml;
    exports com.example.tallerlogin;
}