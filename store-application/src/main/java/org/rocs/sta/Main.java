package org.rocs.sta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }




    @Override
    public void start(Stage stage) throws Exception {

          FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/views/mainView.fxml"));

        Pane mainLayout = new Pane();
        mainLayout=loader.load();

        Scene scene = new Scene(mainLayout);

        stage.setScene(scene);
        stage.show();

        }

    }

