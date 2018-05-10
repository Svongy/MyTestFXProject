package com.test.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Tkachuk.V on 29/6/2016.
 */

public class Main extends Application {
    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tree View Sample");
        BorderPane root = new BorderPane();
        Button start = new Button("Start");
        start.setId("Start");
        start.getId();
        root.setCenter(start);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
