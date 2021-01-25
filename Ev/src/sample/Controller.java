package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML TextField textField;
    @FXML ListView lista;
    @FXML ComboBox combo;

    @FXML
    public void initialize(){
        combo.getItems().addAll("dsfsd","yguyh","uygiuyg","kgkug");
        combo.getSelectionModel().select(0);
    }

    public void procesar(ActionEvent event){

    }

}
