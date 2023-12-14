package com.example.seminarskanaloga;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController3 {
    @FXML
    protected TextField visinaTextField;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    Label povrsinaIme;
    @FXML
    Label volumenIme;

    public void prikaziPovrsino(double povrsina){
        povrsinaIme.setText("Povrsina: " + povrsina);
    }
    public void prikaziVolumen(double volumen){
        volumenIme.setText("Volumen: " + volumen);
    }

    public void switchToScene2fromScene3(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
