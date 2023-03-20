/*
 * Sample Skeleton for 'homepage.fxml' cubeController Class
 */

package control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import design.Multiplayer;
import sample.Play;

public class homepageController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="SinglePlayerButton"
    private Button SinglePlayerButton; // Value injected by FXMLLoader

    @FXML // fx:id="MultiPlayerButton"
    private Button MultiPlayerButton; // Value injected by FXMLLoader

    @FXML
    void MultiPlayerButtonPressed(ActionEvent event) {
        try {
            Multiplayer.showMultiplayerPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void SinglePlayerButtonPressed(ActionEvent event) {
        try {
            Play.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert SinglePlayerButton != null : "fx:id=\"SinglePlayerButton\" was not injected: check your FXML file 'homepage.fxml'.";
        assert MultiPlayerButton != null : "fx:id=\"MultiPlayerButton\" was not injected: check your FXML file 'homepage.fxml'.";

    }
}
