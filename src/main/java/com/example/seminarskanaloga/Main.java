package com.example.seminarskanaloga;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    static public ArrayList<Triangle> abc = new ArrayList<>();
    static public ArrayList<Prism> abcv = new ArrayList<>();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root,Color.BEIGE);

        stage.setScene(scene);
        stage.show();
    }
}