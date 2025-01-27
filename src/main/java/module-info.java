module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires com.google.gson;

    opens com.example to javafx.fxml;
    exports com.example;
    opens com.example.models to com.google.gson;
}
