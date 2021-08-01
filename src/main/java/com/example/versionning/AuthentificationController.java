package com.example.versionning;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import com.jfoenix.controls.JFXButton;
import static com.example.versionning.HelloApplication.*;

import java.io.IOException;

public class AuthentificationController {

    @FXML
    private TextField Name;
    @FXML
    private TextField mail;

    @FXML
    private TextField Pwd;

    @FXML
    private JFXButton btnSignIn;

    @FXML
    private JFXButton btnSignUp;



    @FXML
    void handleSubmit(ActionEvent event) {

        getPrimaryStage().close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("home-view.fxml"));
            Scene scene = new Scene(root);
            getPrimaryStage().setScene(scene);
            getPrimaryStage().show();
            getPrimaryStage().setTitle("Accueil");

        }
        catch (IOException e) {
            System.out.println("impossible d'afficher la fenetre");
        }

    }

    @FXML
    void btnSignUp(ActionEvent event) {
        getPrimaryStage().close();
        try{
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene = new Scene(root);
        getPrimaryStage().setScene(scene);
        getPrimaryStage().show();
        getPrimaryStage().setTitle("Creation d'une compte");
        }
        catch (IOException e) {
            System.out.println("impossible d'afficher la fenetre");
        }

    }


}
