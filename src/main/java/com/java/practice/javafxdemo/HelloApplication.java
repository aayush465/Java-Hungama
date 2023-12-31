package com.java.practice.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {


        BorderPane borderPane = new BorderPane();

        Button button = new Button("Click me!");
        Button button1 = new Button("Click me 1");

        borderPane.setCenter(button);
        borderPane.setBottom(button1);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello");
            }
        });

        button1.setOnAction(this);

        Scene scene = new Scene(borderPane, 320, 240);
//        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Hello for button1");
    }
}