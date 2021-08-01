package com.example.versionning;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

import static com.example.versionning.HelloApplication.getPrimaryStage;

public class CaldController {

    @FXML
    void mDev(ActionEvent event) {
        getPrimaryStage().close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("devs/listDev-view.fxml"));
            Scene scene = new Scene(root);
            getPrimaryStage().setScene(scene);
            getPrimaryStage().show();
            getPrimaryStage().setTitle("Liste des developpeurs");

        }
        catch (IOException e) {
            System.out.println("impossible d'afficher la fenetre");
        }

    }

    @FXML
    void mProjets(ActionEvent event) {

        getPrimaryStage().close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("projets/listProjet-view.fxml"));
            Scene scene = new Scene(root);
            getPrimaryStage().setScene(scene);
            getPrimaryStage().show();
            getPrimaryStage().setTitle("Liste des projets");

        }
        catch (IOException e) {
            System.out.println("impossible d'afficher la fenetre");
        }
    }
    @FXML
    void mHome(ActionEvent event) {
        getPrimaryStage().close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("home-view.fxml"));
            Scene scene = new Scene(root);
            getPrimaryStage().setScene(scene);
            getPrimaryStage().show();
            getPrimaryStage().setTitle("Liste des developpeurs");

        }
        catch (IOException e) {
            System.out.println("impossible d'afficher la fenetre");
        }

    }

    @FXML
    void mTeam(ActionEvent event) {

    }
}
