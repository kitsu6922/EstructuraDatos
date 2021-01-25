package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML private JFXButton bt_close;
    @FXML private JFXButton boton_lateral_gr, boton_lateral_ahorcado;
    @FXML private AnchorPane panel_gr, panel_ahorcado;

    @FXML
    public void initialize(){
        panel_ahorcado.setVisible(false);
        panel_gr.setVisible(true);
    }
    public void exit_window(){
        System.exit(0);
    }
    public void cambio_panel_gr(){
        panel_ahorcado.setVisible(false);
        panel_gr.setVisible(true);
    }
    public void cambio_panel_ahorcado(){
        panel_ahorcado.setVisible(true);
        panel_gr.setVisible(false);
    }
}