package mx.uv.hope;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UsuariosController {

    @FXML
    private Button secondaryButton;

    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }
}