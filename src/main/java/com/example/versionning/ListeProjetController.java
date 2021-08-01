package com.example.versionning;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;

import static com.example.versionning.HelloApplication.getPrimaryStage;

public class ListeProjetController {

    @FXML
    private Label nbPro;

    @FXML
    private Label nbTerPro;

    @FXML
    private Label nbEcpro;

    @FXML
    private Label nbNdPro;

    @FXML
    private TableColumn<?, ?> tableProjets;

    @FXML
    private TextField libelle;

    @FXML
    private ComboBox<?> chefTeam;

    @FXML
    private DatePicker DateCreation;

    @FXML
    private DatePicker dateDeb;

    @FXML
    private DatePicker dateFin;

    @FXML
    private ComboBox<?> chefPro;

    @FXML
    private ComboBox<?> slDev;

    @FXML
    private JFXButton addProjet;


    @FXML
    private JFXButton OvPro;
    @FXML
    private JFXButton pro;

    @FXML
    private  JFXButton EnPro;



    @FXML
    void handleClick(ActionEvent event) {
        getPrimaryStage().close();
        if(event.getSource() == pro){

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

        }else if(event.getSource() == OvPro){

            try {
                Parent root = FXMLLoader.load(getClass().getResource("projets/listeProTer-view.fxml"));
                Scene scene = new Scene(root);
                getPrimaryStage().setScene(scene);
                getPrimaryStage().show();
                getPrimaryStage().setTitle("Liste des projets termines");

            }
            catch (IOException e) {
                System.out.println("impossible d'afficher la fenetre");
            }
        }
        else if(event.getSource() == EnPro){

            try {
                Parent root = FXMLLoader.load(getClass().getResource("projets/listeProEnc-view.fxml"));
                Scene scene = new Scene(root);
                getPrimaryStage().setScene(scene);
                getPrimaryStage().show();
                getPrimaryStage().setTitle("Liste des projets termines");

            }
            catch (IOException e) {
                System.out.println("impossible d'afficher la fenetre");
            }

        }
        else if(event.getSource() == addProjet){
            try {
                Parent root = FXMLLoader.load(getClass().getResource("projets/addProjets.fxml"));
                Scene scene = new Scene(root);
                getPrimaryStage().setScene(scene);
                getPrimaryStage().show();
                getPrimaryStage().setTitle("Ajout d'un projet");
            }
            catch (IOException e) {
                System.out.println("impossible d'afficher la fenetre");
            }
        }
        else if(event.getSource() == modProj){
            try {
                Parent root = FXMLLoader.load(getClass().getResource("projets/modPro-view.fxml"));
                Scene scene = new Scene(root);
                getPrimaryStage().setScene(scene);
                getPrimaryStage().show();
                getPrimaryStage().setTitle("Modification d'un projet");

            }
            catch (IOException e) {
                System.out.println("impossible d'afficher la fenetre");
            }
        }

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

    @FXML
    void reset(ActionEvent event){

    }

    @FXML
    void handleSubmit(ActionEvent event){

    }








    @FXML
    private JFXButton modProj;








}
