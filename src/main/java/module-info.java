module com.example.fx_example {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.fx_example to javafx.fxml;
    exports com.example.fx_example;
}