module mx.uv.hope {
    requires javafx.controls;
    requires javafx.fxml;

    opens mx.uv.hope to javafx.fxml;
    exports mx.uv.hope;
}
