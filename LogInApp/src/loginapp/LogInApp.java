/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jakub
 */
public class LogInApp extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        
        String fxmlPath = "D:/Git/JavaGUI/LogInApp/src/loginapp/MainLayout.fxml";
        FileInputStream fileStream = new FileInputStream(fxmlPath);
        
        VBox root = (VBox) loader.load(fileStream);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FXML Example");
        primaryStage.show();
    }
    
}
