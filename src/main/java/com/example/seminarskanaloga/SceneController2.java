package com.example.seminarskanaloga;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class SceneController2{
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    protected double visina;
    @FXML
    protected TextField visinaTextField;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Label ploscinaIme;
    @FXML
    Label obsegIme;
    @FXML
    Label napakaVisina;

    public void prikaziPloscino(String ploscina){
        ploscinaIme.setText("Ploščina: "+ ploscina);
    }
    public void prikaziObseg(String obseg){
        obsegIme.setText("Obseg: "+ obseg);
    }

    public void switchToScene1(ActionEvent event)throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene3(ActionEvent event)throws IOException {
        boolean error;
        try {
            visina = Double.parseDouble(visinaTextField.getText());
            Main.abcv.getLast().setVisina(visina);
            error=false;
        }
        catch (NumberFormatException e){
            napakaVisina.setText("Vstavite lahko samo števila.");
            error=true;
            visinaTextField.setText("");
        }
        if(!error) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view3.fxml"));
            root = loader.load();

            SceneController3 sceneController3 = loader.getController();
            sceneController3.prikaziPovrsino(Main.abcv.getLast().izracunajPovrsino());
            sceneController3.prikaziVolumen(Main.abcv.getLast().izracunajVolumen());

            //root= FXMLLoader.load(getClass().getResource("hello-view2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}
