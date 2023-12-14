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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SceneController1 {

    @FXML
    protected TextField x1TextField, x2TextField, x3TextField, y1TextField, y2TextField, y3TextField;
    @FXML
    private Button uporabiKoordinate;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Label napakaKoordinate;
    protected double x1, x2, x3, y1, y2, y3, visina;

    public void switchToScene2(ActionEvent event)throws IOException{
        boolean error;
        try {
            x1 = Double.parseDouble(x1TextField.getText());
            x2 = Double.parseDouble(x2TextField.getText());
            x3 = Double.parseDouble(x3TextField.getText());
            y1 = Double.parseDouble(y1TextField.getText());
            y2 = Double.parseDouble(y2TextField.getText());
            y3 = Double.parseDouble(y3TextField.getText());
            error = false;
        } catch (NumberFormatException e) {
            napakaKoordinate.setText("Vstavite lahko samo števila.");
            error = true;
            x1TextField.setText("");
            x2TextField.setText("");
            x3TextField.setText("");
            y1TextField.setText("");
            y2TextField.setText("");
            y3TextField.setText("");
        }
        if (!error) {
            Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
            Main.abc.add(triangle);

            Prism prism = new Prism(x1, y1, x2, y2, x3, y3, visina);
            Main.abcv.add(prism);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view2.fxml"));
            root = loader.load();

            SceneController2 sceneController2=loader.getController();
            sceneController2.prikaziPloscino(Main.abc.getLast().izracunajPloscino()+"");
            sceneController2.prikaziObseg(Main.abc.getLast().izracunajObseg()+"");


            //root= FXMLLoader.load(getClass().getResource("hello-view2.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }

}
