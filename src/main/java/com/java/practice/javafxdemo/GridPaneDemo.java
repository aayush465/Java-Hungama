package com.java.practice.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {
    public static void main(String[] args) {
        launch();

    }
    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane= new GridPane();
        Button button5= new Button("hello");
        Button button1= new Button("hello1");
        Button button2= new Button("hello 2");
        Button button3= new Button("hello 3");
        Button button4= new Button("hello 4");

        gridPane.add(button1, 0,0,2,2);
        gridPane.add(button2, 2,2,1,1);
        gridPane.add(button3, 2,0,1,1);
        gridPane.add(button4, 3,1,1,1);
        gridPane.add(button5, 3,0,1,1);
        Scene scene = new Scene(gridPane, 600,480);
        stage.setScene(scene);
        stage.show();

    }



}
