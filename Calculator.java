package com.siddhienterprises.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("calculate-view.fxml"));
        VBox rootNode = loader.load();
        Scene scene = new Scene(rootNode, 600, 680);
        primaryStage.setResizable(false);
        primaryStage.setTitle("SIDDHI ENTERPRISES");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}