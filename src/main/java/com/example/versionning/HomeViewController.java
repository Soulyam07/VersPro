package com.example.versionning;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

import java.io.IOException;

import static com.example.versionning.HelloApplication.getPrimaryStage;

public class HomeViewController {

    @FXML
    private Label nbDev;

    @FXML
    private TableView<?> TbProjets;

    @FXML
    private Label nbPro;

    @FXML
    private Label login;

    @FXML
    void btnDev(ActionEvent event) {



    }

    @FXML
    void btnPro(ActionEvent event) {

    }

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
    void mCld(ActionEvent event) {
        getPrimaryStage().close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("cald-view.fxml"));
            Scene scene = new Scene(root);
            getPrimaryStage().setScene(scene);
            getPrimaryStage().show();
            getPrimaryStage().setTitle("Calendrier des projets");

        }
        catch (IOException e) {
            System.out.println("impossible d'afficher la fenetre");
        }
    }

}
