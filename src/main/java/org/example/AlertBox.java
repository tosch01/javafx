package org.example;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        // Funktionalität der anderen Windows wird blockiert, bis das aktuelle Window bearbeitet / geschlossen wurde
        window.setTitle(title);
        window.setMinWidth(450);
        window.setMinHeight(550);

        Label label = new Label(message);
        Button closeButton = new Button("Close the Window");
        closeButton.setOnAction(actionEvent -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        // Zeigt Stage und wartet bis es geschlossen wird bevor es zum anderen Window zurückkehrt
        // Oft in Kombination mit (Modality.APPLICATION_MODAL)

    }

}
