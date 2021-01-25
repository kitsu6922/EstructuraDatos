package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import pez.Pez;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML JFXComboBox<String> cb;
    @FXML ImageView iv;
    @FXML JFXTextField txt_pn;
    @FXML JFXListView<String> lv;
    @FXML JFXButton bt_insert;
    String m[][]=new String[2][12];
    int x=0;


    @FXML
    public void initialize(){
        cb.getItems().addAll("Pez Betta","Carpa Comun","Pez Dorado","Guppy","Tilapia del Nilo","Pez Sol","Lobina Negra","Trucha Arcoiris","Basa","Atun Comun","Huachinango","Amphiprion Ocellaris");
        cb.getSelectionModel().select(0);
    }

    public void cambio(){
        Image image;

            image = new Image("/Imagenes/"+cb.getSelectionModel().getSelectedItem()+".jpg");


        iv.setImage(image);
    }

    public void insertar_pecao(){
        if(x<12){
            m[0][x]=cb.getSelectionModel().getSelectedItem();
            m[1][x]=txt_pn.getText();
            int index=cb.getSelectionModel().getSelectedIndex();
            if(index==0){
                if(x==11){

                }else{
                    cb.getSelectionModel().select(1);
                    cb.getItems().remove(index);
                }
            }else{
                cb.getSelectionModel().select(0);
                cb.getItems().remove(index);
            }
            x++;
            cambio();
            txt_pn.setText("");
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Precaución");
            alert.setHeaderText("Datos Llenos");
            alert.setContentText("Llenaste todos los peces, favor de presionar vaciar si desea llenar otros datos.");
            alert.showAndWait();
        }
    }

    public void procesar_datos(){
        lv.getItems().clear();
        for(int f=0;f<x;f++){
            String tipo_pez=m[0][f];
            String pn=m[1][f];
            int por_nacimiento=Integer.parseInt(m[1][f]);
            Pez pez=new Pez(tipo_pez,por_nacimiento);
            String texto="Pescado "+pez.getTipo_pez()+" nacen "+pez.getPor_nacimiento()+" por cria y "+pez.total_anio()+" al año";
            lv.getItems().add(texto);
        }
    }
    public void vaciar_datos(){
        x=0;

        txt_pn.setText("");
        for(int i=0;i<12;i++){
            m[0][i]=null;
            m[1][i]=null;
        }
        lv.getItems().clear();
        cb.getItems().clear();
        cb.getItems().addAll("Pez Betta","Carpa Comun","Pez Dorado","Guppy","Tilapia del Nilo","Pez Sol","Lobina Negra","Trucha Arcoiris","Basa","Atun Comun","Huachinango","Amphiprion Ocellaris");
        cb.getSelectionModel().select("Pez Betta");
    }
}
