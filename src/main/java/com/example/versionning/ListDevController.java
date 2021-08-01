package com.example.versionning;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

import static com.example.versionning.HelloApplication.getPrimaryStage;

public class ListDevController {

    @FXML
    private Label nbDev;

    @FXML
    private Label nbDevEns;


    @FXML
    private JFXButton devs;
    @FXML
    private JFXButton headTeam;
    @FXML
    private JFXButton devEns;
    @FXML
    private JFXButton addDev;

    @FXML
    void handleClick(ActionEvent event){

        getPrimaryStage().close();
        if(event.getSource() == devs){

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
        else if(event.getSource() == devEns){

            try {
                Parent root = FXMLLoader.load(getClass().getResource("devs/listDevEnse-view.fxml"));
                Scene scene = new Scene(root);
                getPrimaryStage().setScene(scene);
                getPrimaryStage().show();
                getPrimaryStage().setTitle("Liste des developpeurs en service");

            }
            catch (IOException e) {
                System.out.println("impossible d'afficher la fenetre");
            }

        }
        else if(event.getSource() == headTeam){

            try {
                Parent root = FXMLLoader.load(getClass().getResource("devs/listChefTeam-view.fxml"));
                Scene scene = new Scene(root);
                getPrimaryStage().setScene(scene);
                getPrimaryStage().show();
                getPrimaryStage().setTitle("Liste des chef d'equipe");

            }
            catch (IOException e) {
                System.out.println("impossible d'afficher la fenetre");
            }

        }
        else if(event.getSource() == addDev){

            try {
                Parent root = FXMLLoader.load(getClass().getResource("devs/addDevs.fxml"));
                Scene scene = new Scene(root);
                getPrimaryStage().setScene(scene);
                getPrimaryStage().show();
                getPrimaryStage().setTitle("Ajout d'un developpeur");

            }
            catch (IOException e) {
                System.out.println("impossible d'afficher la fenetre");
            }

        }

    }
    @FXML
    void handleSubmit(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("devs/listDev-view.fxml"));
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
    void reset(ActionEvent event) {

    }

    @FXML
    void mDev(ActionEvent event) {

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
