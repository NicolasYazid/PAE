package mx.uv.hope;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {

    @FXML
    private Button btnUsuarios;

    @FXML
    private void switchToUsuarios() throws IOException {
        App.setRoot("usuarios");
    }
}
