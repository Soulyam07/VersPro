package utils;

import javafx.scene.control.Alert;

public class AlertUtils {

    public static void showMessage(String headText,String title,String content,String alertType){

        Alert alert = null;
        if(alertType.trim().toUpperCase().equals("ERROR")){
            alert =  new Alert(Alert.AlertType.ERROR);
        }else if(alertType.trim().toUpperCase().equals("WARNING")){
            alert =  new Alert(Alert.AlertType.WARNING);
        }else {
            alert = new Alert(Alert.AlertType.INFORMATION);
        }

        alert.setHeaderText(headText);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
