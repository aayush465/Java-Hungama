package com.java.practice.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        FlowPane flowpane= new FlowPane();
        for (int i=1;i<=20; i++){
            Button buttom = new Button("hello" +i);
            flowpane.getChildren().add(buttom);
        }
        Scene scene = new Scene(flowpane, 600,480);
        stage.setScene(scene);
        stage.show();

    }
}
