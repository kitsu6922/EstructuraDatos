package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import conversiones.Conversion;

public class Controller {

    @FXML TextField txtEdad;
    @FXML Button btaccion;
    @FXML Label etiqueta;

    public void accion (ActionEvent event){
        Conversion td=new Conversion();
        int numero = Integer.parseInt(txtEdad.getText());
        String res=td.binario(numero);
        etiqueta.setText(res);
    }
}
