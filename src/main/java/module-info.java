module com.example.course1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.course1 to javafx.fxml;
    exports com.example.course1;
}