package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Javafx extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {
            window = stage;
            window.setTitle("JavaFX macht Spass zu lernen");

            button = new Button("Klicke mich");
            button.setOnAction(actionEvent -> AlertBox.display("Settings", "Einstellungen vornehmen"));

            StackPane layout=new StackPane();
            layout.getChildren().add(button);
            Scene scene=new Scene(layout,300,250);
            window.setScene(scene);
            window.show();
        }




    }


